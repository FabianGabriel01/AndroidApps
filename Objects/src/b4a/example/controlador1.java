package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class controlador1 extends Activity implements B4AActivity{
	public static controlador1 mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.controlador1");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (controlador1).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.controlador1");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.controlador1", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (controlador1) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (controlador1) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return controlador1.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (controlador1) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (controlador1) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            controlador1 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (controlador1) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static String _filename1 = "";
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconfig = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlslidingconfig = null;
public static boolean _ispanelvisibleconfig = false;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextip = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextport = null;
public anywheresoftware.b4a.objects.ButtonWrapper _connectplc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncreations = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlslidingcreations = null;
public static boolean _ispanelvisiblecreations = false;
public anywheresoftware.b4a.objects.LabelWrapper _labelcreations = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnleerhr = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnescribirhr = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnonoff = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnhold = null;
public static int _leerhrviews = 0;
public static int _escribirhrviews = 0;
public static int _onoffviews = 0;
public static int _holdviews = 0;
public static int _totalviews = 0;
public anywheresoftware.b4a.objects.PanelWrapper _panelleer1 = null;
public static float _xoffsetleer1 = 0f;
public static float _yoffsetleer1 = 0f;
public static boolean _draggingleer1 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion1res = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelleer2 = null;
public static float _xoffsetleer2 = 0f;
public static float _yoffsetleer2 = 0f;
public static boolean _draggingleer2 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion2res = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelescribir1 = null;
public static float _xoffsetescribir1 = 0f;
public static float _yoffsetescribir1 = 0f;
public static boolean _draggingescribir1 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion1escribir = null;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion1escribirvalor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _direccion1escribirbtn = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelescribir2 = null;
public static float _xoffsetescribir2 = 0f;
public static float _yoffsetescribir2 = 0f;
public static boolean _draggingescribir2 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion2escribir = null;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion2escribirvalor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _direccion2escribirbtn = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelonoff1 = null;
public static float _xoffsetonoff1 = 0f;
public static float _yoffsetonoff1 = 0f;
public static boolean _draggingonoff1 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion1onoff = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn1onoff = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelonoff2 = null;
public static float _xoffsetonoff2 = 0f;
public static float _yoffsetonoff2 = 0f;
public static boolean _draggingonoff2 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion2onoff = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn2onoff = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelhold1 = null;
public static float _xoffsethold1 = 0f;
public static float _yoffsethold1 = 0f;
public static boolean _dragginghold1 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion1hold = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn1hold = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelhold2 = null;
public static float _xoffsethold2 = 0f;
public static float _yoffsethold2 = 0f;
public static boolean _dragginghold2 = false;
public anywheresoftware.b4a.objects.EditTextWrapper _direccion2hold = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn2hold = null;
public b4a.example.modbustcp _modbusclient = null;
public b4a.example.modbusservice._connectionparams _comparameters = null;
public static boolean _modbusstate = false;
public anywheresoftware.b4a.objects.ButtonWrapper _graph = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlslidegraph = null;
public static boolean _ispanelvisiblegraph = false;
public b4a.example.xchart _linechart1 = null;
public b4a.example.conversion _conversion = null;
public b4a.example.modbusservice _modbusservice = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.controlador2 _controlador2 = null;
public b4a.example.controlador3 _controlador3 = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 142;BA.debugLine="Activity.LoadLayout(\"Controlador1\")";
mostCurrent._activity.LoadLayout("Controlador1",mostCurrent.activityBA);
 //BA.debugLineNum = 145;BA.debugLine="isPanelVisibleConfig = False";
_ispanelvisibleconfig = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 146;BA.debugLine="isPanelVisibleCreations = False";
_ispanelvisiblecreations = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 148;BA.debugLine="EditTextIP.Initialize(\"IP\")";
mostCurrent._edittextip.Initialize(mostCurrent.activityBA,"IP");
 //BA.debugLineNum = 149;BA.debugLine="EditTextPort.Initialize(\"PORT\")";
mostCurrent._edittextport.Initialize(mostCurrent.activityBA,"PORT");
 //BA.debugLineNum = 150;BA.debugLine="ConnectPLC.Initialize(\"ConnectPLC\")";
mostCurrent._connectplc.Initialize(mostCurrent.activityBA,"ConnectPLC");
 //BA.debugLineNum = 153;BA.debugLine="btnConfig.Initialize(\"btnConfig\")";
mostCurrent._btnconfig.Initialize(mostCurrent.activityBA,"btnConfig");
 //BA.debugLineNum = 154;BA.debugLine="btnConfig.Text = \"C\"";
mostCurrent._btnconfig.setText(BA.ObjectToCharSequence("C"));
 //BA.debugLineNum = 155;BA.debugLine="btnConfig.Width = 50dip ' 5x5 in dp";
mostCurrent._btnconfig.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 156;BA.debugLine="btnConfig.Height = 50dip";
mostCurrent._btnconfig.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 157;BA.debugLine="btnConfig.Color = Colors.Red ' Set button color";
mostCurrent._btnconfig.setColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 //BA.debugLineNum = 158;BA.debugLine="Activity.AddView(btnConfig, 0, 0, btnConfig.Width";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btnconfig.getObject()),(int) (0),(int) (0),mostCurrent._btnconfig.getWidth(),mostCurrent._btnconfig.getHeight());
 //BA.debugLineNum = 161;BA.debugLine="pnlSlidingConfig.Initialize(\"\")";
mostCurrent._pnlslidingconfig.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 162;BA.debugLine="pnlSlidingConfig.Color = Colors.LightGray";
mostCurrent._pnlslidingconfig.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 163;BA.debugLine="pnlSlidingConfig.Width = 100%x";
mostCurrent._pnlslidingconfig.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 164;BA.debugLine="pnlSlidingConfig.Height = 250dip";
mostCurrent._pnlslidingconfig.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
 //BA.debugLineNum = 165;BA.debugLine="pnlSlidingConfig.Left = -pnlSlidingConfig.Width '";
mostCurrent._pnlslidingconfig.setLeft((int) (-mostCurrent._pnlslidingconfig.getWidth()));
 //BA.debugLineNum = 166;BA.debugLine="Activity.AddView(pnlSlidingConfig, pnlSlidingConf";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnlslidingconfig.getObject()),mostCurrent._pnlslidingconfig.getLeft(),(int) (0),mostCurrent._pnlslidingconfig.getWidth(),mostCurrent._pnlslidingconfig.getHeight());
 //BA.debugLineNum = 171;BA.debugLine="EditTextIP.Hint = \"Dirección IP\"";
mostCurrent._edittextip.setHint("Dirección IP");
 //BA.debugLineNum = 172;BA.debugLine="EditTextIP.HintColor = Colors.Black";
mostCurrent._edittextip.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 173;BA.debugLine="EditTextIP.InputType = EditTextIP.INPUT_TYPE_TEXT";
mostCurrent._edittextip.setInputType(mostCurrent._edittextip.INPUT_TYPE_TEXT);
 //BA.debugLineNum = 174;BA.debugLine="pnlSlidingConfig.AddView(EditTextIP, 10%x, 5%y, 8";
mostCurrent._pnlslidingconfig.AddView((android.view.View)(mostCurrent._edittextip.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 176;BA.debugLine="EditTextPort.Hint = \"PUERTO\"";
mostCurrent._edittextport.setHint("PUERTO");
 //BA.debugLineNum = 177;BA.debugLine="EditTextPort.HintColor = Colors.Black";
mostCurrent._edittextport.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 178;BA.debugLine="EditTextPort.InputType = EditTextPort.INPUT_TYPE_";
mostCurrent._edittextport.setInputType(mostCurrent._edittextport.INPUT_TYPE_TEXT);
 //BA.debugLineNum = 179;BA.debugLine="pnlSlidingConfig.AddView(EditTextPort, 10%x, 13%y";
mostCurrent._pnlslidingconfig.AddView((android.view.View)(mostCurrent._edittextport.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (13),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 181;BA.debugLine="ConnectPLC.Text = \"Conectar\"";
mostCurrent._connectplc.setText(BA.ObjectToCharSequence("Conectar"));
 //BA.debugLineNum = 182;BA.debugLine="pnlSlidingConfig.AddView(ConnectPLC, 10%x, 23%y,";
mostCurrent._pnlslidingconfig.AddView((android.view.View)(mostCurrent._connectplc.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (23),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 186;BA.debugLine="btnCreations.Initialize(\"btnCreations\")";
mostCurrent._btncreations.Initialize(mostCurrent.activityBA,"btnCreations");
 //BA.debugLineNum = 187;BA.debugLine="btnCreations.Text = \"+\"";
mostCurrent._btncreations.setText(BA.ObjectToCharSequence("+"));
 //BA.debugLineNum = 188;BA.debugLine="btnCreations.Width = 50dip ' 5x5 in dp";
mostCurrent._btncreations.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 189;BA.debugLine="btnCreations.Height = 50dip";
mostCurrent._btncreations.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 190;BA.debugLine="btnCreations.Color = Colors.Blue ' Set button col";
mostCurrent._btncreations.setColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
 //BA.debugLineNum = 191;BA.debugLine="Activity.AddView(btnCreations, 0, 8%y, btnCreatio";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btncreations.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA),mostCurrent._btncreations.getWidth(),mostCurrent._btncreations.getHeight());
 //BA.debugLineNum = 194;BA.debugLine="pnlSlidingCreations.Initialize(\"\")";
mostCurrent._pnlslidingcreations.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 195;BA.debugLine="pnlSlidingCreations.Color = Colors.LightGray";
mostCurrent._pnlslidingcreations.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 196;BA.debugLine="pnlSlidingCreations.Width = 100%x";
mostCurrent._pnlslidingcreations.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 197;BA.debugLine="pnlSlidingCreations.Height = 250dip";
mostCurrent._pnlslidingcreations.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
 //BA.debugLineNum = 198;BA.debugLine="pnlSlidingCreations.Left = -pnlSlidingCreations.W";
mostCurrent._pnlslidingcreations.setLeft((int) (-mostCurrent._pnlslidingcreations.getWidth()));
 //BA.debugLineNum = 199;BA.debugLine="Activity.AddView(pnlSlidingCreations, pnlSlidingC";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnlslidingcreations.getObject()),mostCurrent._pnlslidingcreations.getLeft(),(int) (0),mostCurrent._pnlslidingcreations.getWidth(),mostCurrent._pnlslidingcreations.getHeight());
 //BA.debugLineNum = 201;BA.debugLine="LabelCreations.Initialize(\"\")";
mostCurrent._labelcreations.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 202;BA.debugLine="LabelCreations.Text = \"Maximo 2 Vistas por Acción";
mostCurrent._labelcreations.setText(BA.ObjectToCharSequence("Maximo 2 Vistas por Acción, 8 vistas en total"));
 //BA.debugLineNum = 203;BA.debugLine="pnlSlidingCreations.AddView(LabelCreations, 15%x,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._labelcreations.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 205;BA.debugLine="btnLeerHR.Initialize(\"LeerHR\")";
mostCurrent._btnleerhr.Initialize(mostCurrent.activityBA,"LeerHR");
 //BA.debugLineNum = 206;BA.debugLine="btnLeerHR.Text = \"Leer Holding Registers\"";
mostCurrent._btnleerhr.setText(BA.ObjectToCharSequence("Leer Holding Registers"));
 //BA.debugLineNum = 207;BA.debugLine="pnlSlidingCreations.AddView(btnLeerHR, 10%x, 4%y,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnleerhr.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 209;BA.debugLine="btnEscribirHR.Initialize(\"EscribirHR\")";
mostCurrent._btnescribirhr.Initialize(mostCurrent.activityBA,"EscribirHR");
 //BA.debugLineNum = 210;BA.debugLine="btnEscribirHR.Text = \"Escribir Holding Registers\"";
mostCurrent._btnescribirhr.setText(BA.ObjectToCharSequence("Escribir Holding Registers"));
 //BA.debugLineNum = 211;BA.debugLine="pnlSlidingCreations.AddView(btnEscribirHR, 10%x,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnescribirhr.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 213;BA.debugLine="btnONOFF.Initialize(\"ONOFF\")";
mostCurrent._btnonoff.Initialize(mostCurrent.activityBA,"ONOFF");
 //BA.debugLineNum = 214;BA.debugLine="btnONOFF.Text = \"BOTON ON OFF\"";
mostCurrent._btnonoff.setText(BA.ObjectToCharSequence("BOTON ON OFF"));
 //BA.debugLineNum = 215;BA.debugLine="pnlSlidingCreations.AddView(btnONOFF, 10%x, 16%y,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnonoff.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (16),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 217;BA.debugLine="btnHOLD.Initialize(\"HOLD\")";
mostCurrent._btnhold.Initialize(mostCurrent.activityBA,"HOLD");
 //BA.debugLineNum = 218;BA.debugLine="btnHOLD.Text = \"BOTON HOLD\"";
mostCurrent._btnhold.setText(BA.ObjectToCharSequence("BOTON HOLD"));
 //BA.debugLineNum = 219;BA.debugLine="pnlSlidingCreations.AddView(btnHOLD, 10%x, 22%y,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnhold.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 225;BA.debugLine="PanelLeer1.Initialize(\"PanelLeer1\")";
mostCurrent._panelleer1.Initialize(mostCurrent.activityBA,"PanelLeer1");
 //BA.debugLineNum = 226;BA.debugLine="PanelLeer1.Color = Colors.Cyan";
mostCurrent._panelleer1.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
 //BA.debugLineNum = 227;BA.debugLine="PanelLeer1.Enabled = False";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 228;BA.debugLine="PanelLeer1.Visible = False";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 229;BA.debugLine="Direccion1.Initialize(\"Direccion1\")";
mostCurrent._direccion1.Initialize(mostCurrent.activityBA,"Direccion1");
 //BA.debugLineNum = 230;BA.debugLine="Direccion1.Hint = \"# Reg a Leer\"";
mostCurrent._direccion1.setHint("# Reg a Leer");
 //BA.debugLineNum = 231;BA.debugLine="Direccion1Res.Initialize(\"Direccion1Res\")";
mostCurrent._direccion1res.Initialize(mostCurrent.activityBA,"Direccion1Res");
 //BA.debugLineNum = 232;BA.debugLine="Direccion1Res.Hint = \"              Valor\"";
mostCurrent._direccion1res.setHint("              Valor");
 //BA.debugLineNum = 233;BA.debugLine="Direccion1Res.Enabled = False";
mostCurrent._direccion1res.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 234;BA.debugLine="Activity.AddView(PanelLeer1, 100dip, 200dip, 200d";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelleer1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 235;BA.debugLine="PanelLeer1.AddView(Direccion1, 0dip, 0dip, 190dip";
mostCurrent._panelleer1.AddView((android.view.View)(mostCurrent._direccion1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 236;BA.debugLine="PanelLeer1.AddView(Direccion1Res, 0dip, 50dip, 19";
mostCurrent._panelleer1.AddView((android.view.View)(mostCurrent._direccion1res.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 238;BA.debugLine="PanelLeer2.Initialize(\"PanelLeer2\")";
mostCurrent._panelleer2.Initialize(mostCurrent.activityBA,"PanelLeer2");
 //BA.debugLineNum = 239;BA.debugLine="PanelLeer2.Color = Colors.White";
mostCurrent._panelleer2.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 240;BA.debugLine="PanelLeer2.Enabled = False";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 241;BA.debugLine="PanelLeer2.Visible = False";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 242;BA.debugLine="Direccion2.Initialize(\"Direccion2\")";
mostCurrent._direccion2.Initialize(mostCurrent.activityBA,"Direccion2");
 //BA.debugLineNum = 243;BA.debugLine="Direccion2.Hint = \"# Reg a Leer\"";
mostCurrent._direccion2.setHint("# Reg a Leer");
 //BA.debugLineNum = 244;BA.debugLine="Direccion2Res.Initialize(\"Direccion2Res\")";
mostCurrent._direccion2res.Initialize(mostCurrent.activityBA,"Direccion2Res");
 //BA.debugLineNum = 245;BA.debugLine="Direccion2Res.Hint = \"              Valor\"";
mostCurrent._direccion2res.setHint("              Valor");
 //BA.debugLineNum = 246;BA.debugLine="Direccion2Res.Enabled = False";
mostCurrent._direccion2res.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 247;BA.debugLine="Activity.AddView(PanelLeer2, 10dip, 300dip, 200di";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelleer2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 248;BA.debugLine="PanelLeer2.AddView(Direccion2, 0dip, 0dip, 190dip";
mostCurrent._panelleer2.AddView((android.view.View)(mostCurrent._direccion2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 249;BA.debugLine="PanelLeer2.AddView(Direccion2Res, 0dip, 50dip, 19";
mostCurrent._panelleer2.AddView((android.view.View)(mostCurrent._direccion2res.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 253;BA.debugLine="PanelEscribir1.Initialize(\"PanelEscribir1\")";
mostCurrent._panelescribir1.Initialize(mostCurrent.activityBA,"PanelEscribir1");
 //BA.debugLineNum = 254;BA.debugLine="PanelEscribir1.Color = Colors.DarkGray";
mostCurrent._panelescribir1.setColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
 //BA.debugLineNum = 255;BA.debugLine="PanelEscribir1.Enabled = False";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 256;BA.debugLine="PanelEscribir1.Visible = False";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 257;BA.debugLine="Direccion1Escribir.Initialize(\"Direccion1Escribir";
mostCurrent._direccion1escribir.Initialize(mostCurrent.activityBA,"Direccion1Escribir");
 //BA.debugLineNum = 258;BA.debugLine="Direccion1Escribir.Hint = \"#Reg a Escribir\"";
mostCurrent._direccion1escribir.setHint("#Reg a Escribir");
 //BA.debugLineNum = 259;BA.debugLine="Direccion1EscribirValor.Initialize(\"Direccion1Esc";
mostCurrent._direccion1escribirvalor.Initialize(mostCurrent.activityBA,"Direccion1EscribirValor");
 //BA.debugLineNum = 260;BA.debugLine="Direccion1EscribirValor.Hint = \"Valor\"";
mostCurrent._direccion1escribirvalor.setHint("Valor");
 //BA.debugLineNum = 261;BA.debugLine="Direccion1EscribirValor.HintColor = Colors.Cyan";
mostCurrent._direccion1escribirvalor.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
 //BA.debugLineNum = 262;BA.debugLine="Direccion1EscribirValor.TextColor = Colors.Cyan";
mostCurrent._direccion1escribirvalor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
 //BA.debugLineNum = 263;BA.debugLine="Direccion1EscribirValor.Enabled = False";
mostCurrent._direccion1escribirvalor.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 264;BA.debugLine="Direccion1EscribirBTN.Initialize(\"Direccion1Escri";
mostCurrent._direccion1escribirbtn.Initialize(mostCurrent.activityBA,"Direccion1EscribirBTN");
 //BA.debugLineNum = 265;BA.debugLine="Direccion1EscribirBTN.Text = \"Mandar a Registro\"";
mostCurrent._direccion1escribirbtn.setText(BA.ObjectToCharSequence("Mandar a Registro"));
 //BA.debugLineNum = 266;BA.debugLine="Activity.AddView(PanelEscribir1, 100dip, 200dip,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelescribir1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
 //BA.debugLineNum = 267;BA.debugLine="PanelEscribir1.AddView(Direccion1Escribir, 0dip,";
mostCurrent._panelescribir1.AddView((android.view.View)(mostCurrent._direccion1escribir.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 268;BA.debugLine="PanelEscribir1.AddView(Direccion1EscribirValor, 0";
mostCurrent._panelescribir1.AddView((android.view.View)(mostCurrent._direccion1escribirvalor.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 269;BA.debugLine="PanelEscribir1.AddView(Direccion1EscribirBTN, 0di";
mostCurrent._panelescribir1.AddView((android.view.View)(mostCurrent._direccion1escribirbtn.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 271;BA.debugLine="PanelEscribir2.Initialize(\"PanelEscribir2\")";
mostCurrent._panelescribir2.Initialize(mostCurrent.activityBA,"PanelEscribir2");
 //BA.debugLineNum = 272;BA.debugLine="PanelEscribir2.Color = Colors.DarkGray";
mostCurrent._panelescribir2.setColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
 //BA.debugLineNum = 273;BA.debugLine="PanelEscribir2.Enabled = False";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 274;BA.debugLine="PanelEscribir2.Visible = False";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 275;BA.debugLine="Direccion2Escribir.Initialize(\"Direccion2Escribir";
mostCurrent._direccion2escribir.Initialize(mostCurrent.activityBA,"Direccion2Escribir");
 //BA.debugLineNum = 276;BA.debugLine="Direccion2Escribir.Hint = \"#Reg a Escribir\"";
mostCurrent._direccion2escribir.setHint("#Reg a Escribir");
 //BA.debugLineNum = 277;BA.debugLine="Direccion2EscribirValor.Initialize(\"Direccion2Esc";
mostCurrent._direccion2escribirvalor.Initialize(mostCurrent.activityBA,"Direccion2EscribirValor");
 //BA.debugLineNum = 278;BA.debugLine="Direccion2EscribirValor.Hint = \"Valor\"";
mostCurrent._direccion2escribirvalor.setHint("Valor");
 //BA.debugLineNum = 279;BA.debugLine="Direccion2EscribirValor.Enabled = False";
mostCurrent._direccion2escribirvalor.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 280;BA.debugLine="Direccion2EscribirValor.HintColor = Colors.Cyan";
mostCurrent._direccion2escribirvalor.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
 //BA.debugLineNum = 281;BA.debugLine="Direccion2EscribirValor.TextColor = Colors.Cyan";
mostCurrent._direccion2escribirvalor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
 //BA.debugLineNum = 282;BA.debugLine="Direccion2EscribirBTN.Initialize(\"Direccion2Escri";
mostCurrent._direccion2escribirbtn.Initialize(mostCurrent.activityBA,"Direccion2EscribirBTN");
 //BA.debugLineNum = 283;BA.debugLine="Direccion2EscribirBTN.Text = \"Mandar a Registro\"";
mostCurrent._direccion2escribirbtn.setText(BA.ObjectToCharSequence("Mandar a Registro"));
 //BA.debugLineNum = 284;BA.debugLine="Activity.AddView(PanelEscribir2, 100dip, 200dip,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelescribir2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
 //BA.debugLineNum = 285;BA.debugLine="PanelEscribir2.AddView(Direccion2Escribir, 0dip,";
mostCurrent._panelescribir2.AddView((android.view.View)(mostCurrent._direccion2escribir.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 286;BA.debugLine="PanelEscribir2.AddView(Direccion2EscribirValor, 0";
mostCurrent._panelescribir2.AddView((android.view.View)(mostCurrent._direccion2escribirvalor.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 287;BA.debugLine="PanelEscribir2.AddView(Direccion2EscribirBTN, 0di";
mostCurrent._panelescribir2.AddView((android.view.View)(mostCurrent._direccion2escribirbtn.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 290;BA.debugLine="PanelOnOff1.Initialize(\"PanelOnOff1\")";
mostCurrent._panelonoff1.Initialize(mostCurrent.activityBA,"PanelOnOff1");
 //BA.debugLineNum = 291;BA.debugLine="PanelOnOff1.Color = Colors.LightGray";
mostCurrent._panelonoff1.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 292;BA.debugLine="PanelOnOff1.Enabled = False";
mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 293;BA.debugLine="PanelOnOff1.Visible = False";
mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 294;BA.debugLine="Direccion1OnOff.Initialize(\"Direccion1OnOff\")";
mostCurrent._direccion1onoff.Initialize(mostCurrent.activityBA,"Direccion1OnOff");
 //BA.debugLineNum = 295;BA.debugLine="Direccion1OnOff.Hint = \"#Reg On/OFF\"";
mostCurrent._direccion1onoff.setHint("#Reg On/OFF");
 //BA.debugLineNum = 296;BA.debugLine="BTN1OnOff.Initialize(\"BTN1OnOff\")";
mostCurrent._btn1onoff.Initialize(mostCurrent.activityBA,"BTN1OnOff");
 //BA.debugLineNum = 297;BA.debugLine="BTN1OnOff.Text = \"Encender/Apagar\"";
mostCurrent._btn1onoff.setText(BA.ObjectToCharSequence("Encender/Apagar"));
 //BA.debugLineNum = 298;BA.debugLine="Activity.AddView(PanelOnOff1, 100dip, 200dip, 200";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelonoff1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 299;BA.debugLine="PanelOnOff1.AddView(Direccion1OnOff, 0dip, 0dip,";
mostCurrent._panelonoff1.AddView((android.view.View)(mostCurrent._direccion1onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 300;BA.debugLine="PanelOnOff1.AddView(BTN1OnOff, 0dip, 50dip, 190di";
mostCurrent._panelonoff1.AddView((android.view.View)(mostCurrent._btn1onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 302;BA.debugLine="PanelOnOff2.Initialize(\"PanelOnOff2\")";
mostCurrent._panelonoff2.Initialize(mostCurrent.activityBA,"PanelOnOff2");
 //BA.debugLineNum = 303;BA.debugLine="PanelOnOff2.Color = Colors.LightGray";
mostCurrent._panelonoff2.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 304;BA.debugLine="PanelOnOff2.Enabled = False";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 305;BA.debugLine="PanelOnOff2.Visible = False";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 306;BA.debugLine="Direccion2OnOff.Initialize(\"Direccion2OnOff\")";
mostCurrent._direccion2onoff.Initialize(mostCurrent.activityBA,"Direccion2OnOff");
 //BA.debugLineNum = 307;BA.debugLine="Direccion2OnOff.Hint = \"#Reg On/OFF\"";
mostCurrent._direccion2onoff.setHint("#Reg On/OFF");
 //BA.debugLineNum = 308;BA.debugLine="BTN2OnOff.Initialize(\"BTN2OnOff\")";
mostCurrent._btn2onoff.Initialize(mostCurrent.activityBA,"BTN2OnOff");
 //BA.debugLineNum = 309;BA.debugLine="BTN2OnOff.Text = \"Encender/Apagar\"";
mostCurrent._btn2onoff.setText(BA.ObjectToCharSequence("Encender/Apagar"));
 //BA.debugLineNum = 310;BA.debugLine="Activity.AddView(PanelOnOff2, 100dip, 200dip, 200";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelonoff2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 311;BA.debugLine="PanelOnOff2.AddView(Direccion2OnOff, 0dip, 0dip,";
mostCurrent._panelonoff2.AddView((android.view.View)(mostCurrent._direccion2onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 312;BA.debugLine="PanelOnOff2.AddView(BTN2OnOff, 0dip, 50dip, 190di";
mostCurrent._panelonoff2.AddView((android.view.View)(mostCurrent._btn2onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 315;BA.debugLine="PanelHold1.Initialize(\"PanelHold1\")";
mostCurrent._panelhold1.Initialize(mostCurrent.activityBA,"PanelHold1");
 //BA.debugLineNum = 316;BA.debugLine="PanelHold1.Color = Colors.Magenta";
mostCurrent._panelhold1.setColor(anywheresoftware.b4a.keywords.Common.Colors.Magenta);
 //BA.debugLineNum = 317;BA.debugLine="PanelHold1.Enabled = False";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 318;BA.debugLine="PanelHold1.Visible = False";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 319;BA.debugLine="Direccion1Hold.Initialize(\"Direccion1Hold\")";
mostCurrent._direccion1hold.Initialize(mostCurrent.activityBA,"Direccion1Hold");
 //BA.debugLineNum = 320;BA.debugLine="Direccion1Hold.Hint = \"#Reg\"";
mostCurrent._direccion1hold.setHint("#Reg");
 //BA.debugLineNum = 321;BA.debugLine="BTN1Hold.Initialize(\"BTN1Hold\")";
mostCurrent._btn1hold.Initialize(mostCurrent.activityBA,"BTN1Hold");
 //BA.debugLineNum = 322;BA.debugLine="BTN1Hold.Text = \"HOLD\"";
mostCurrent._btn1hold.setText(BA.ObjectToCharSequence("HOLD"));
 //BA.debugLineNum = 323;BA.debugLine="Activity.AddView(PanelHold1, 100dip, 200dip, 200d";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelhold1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 324;BA.debugLine="PanelHold1.AddView(Direccion1Hold, 0dip, 0dip, 19";
mostCurrent._panelhold1.AddView((android.view.View)(mostCurrent._direccion1hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 325;BA.debugLine="PanelHold1.AddView(BTN1Hold, 0dip, 50dip, 190dip,";
mostCurrent._panelhold1.AddView((android.view.View)(mostCurrent._btn1hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 328;BA.debugLine="PanelHold2.Initialize(\"PanelHold2\")";
mostCurrent._panelhold2.Initialize(mostCurrent.activityBA,"PanelHold2");
 //BA.debugLineNum = 329;BA.debugLine="PanelHold2.Color = Colors.Magenta";
mostCurrent._panelhold2.setColor(anywheresoftware.b4a.keywords.Common.Colors.Magenta);
 //BA.debugLineNum = 330;BA.debugLine="PanelHold2.Enabled = False";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 331;BA.debugLine="PanelHold2.Visible = False";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 332;BA.debugLine="Direccion2Hold.Initialize(\"Direccion2Hold\")";
mostCurrent._direccion2hold.Initialize(mostCurrent.activityBA,"Direccion2Hold");
 //BA.debugLineNum = 333;BA.debugLine="Direccion2Hold.Hint = \"#Reg\"";
mostCurrent._direccion2hold.setHint("#Reg");
 //BA.debugLineNum = 334;BA.debugLine="BTN2Hold.Initialize(\"BTN2Hold\")";
mostCurrent._btn2hold.Initialize(mostCurrent.activityBA,"BTN2Hold");
 //BA.debugLineNum = 335;BA.debugLine="BTN2Hold.Text = \"HOLD\"";
mostCurrent._btn2hold.setText(BA.ObjectToCharSequence("HOLD"));
 //BA.debugLineNum = 336;BA.debugLine="Activity.AddView(PanelHold2, 100dip, 200dip, 200d";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelhold2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 337;BA.debugLine="PanelHold2.AddView(Direccion2Hold, 0dip, 0dip, 19";
mostCurrent._panelhold2.AddView((android.view.View)(mostCurrent._direccion2hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 338;BA.debugLine="PanelHold2.AddView(BTN2Hold, 0dip, 50dip, 190dip,";
mostCurrent._panelhold2.AddView((android.view.View)(mostCurrent._btn2hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 341;BA.debugLine="Graph.Initialize(\"Graph\")";
mostCurrent._graph.Initialize(mostCurrent.activityBA,"Graph");
 //BA.debugLineNum = 342;BA.debugLine="Graph.Text = \"G\"";
mostCurrent._graph.setText(BA.ObjectToCharSequence("G"));
 //BA.debugLineNum = 343;BA.debugLine="Graph.Width = 50dip ' 5x5 in dp";
mostCurrent._graph.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 344;BA.debugLine="Graph.Height = 50dip";
mostCurrent._graph.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 //BA.debugLineNum = 345;BA.debugLine="Graph.Color = Colors.White ' Set button color";
mostCurrent._graph.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 346;BA.debugLine="Activity.AddView(Graph, 87%x, 0, Graph.Width, Gra";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._graph.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (87),mostCurrent.activityBA),(int) (0),mostCurrent._graph.getWidth(),mostCurrent._graph.getHeight());
 //BA.debugLineNum = 354;BA.debugLine="pnlSlideGraph.Left = pnlSlideGraph.Width";
mostCurrent._pnlslidegraph.setLeft(mostCurrent._pnlslidegraph.getWidth());
 //BA.debugLineNum = 358;BA.debugLine="LineChart1.ClearData";
mostCurrent._linechart1._cleardata /*String*/ ();
 //BA.debugLineNum = 360;BA.debugLine="LineChart1.Title = \"Temperatura\"";
mostCurrent._linechart1._settitle /*String*/ ("Temperatura");
 //BA.debugLineNum = 361;BA.debugLine="LineChart1.XAxisName = \"Tiempo\"";
mostCurrent._linechart1._setxaxisname /*String*/ ("Tiempo");
 //BA.debugLineNum = 362;BA.debugLine="LineChart1.YAxisName = \"Values\"";
mostCurrent._linechart1._setyaxisname /*String*/ ("Values");
 //BA.debugLineNum = 364;BA.debugLine="LineChart1.IncludeLegend = True";
mostCurrent._linechart1._setincludelegend /*String*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 365;BA.debugLine="LineChart1.YScaleMaxValue = 1";
mostCurrent._linechart1._setyscalemaxvalue /*double*/ (1);
 //BA.debugLineNum = 366;BA.debugLine="LineChart1.YScaleMinValue = -1";
mostCurrent._linechart1._setyscaleminvalue /*double*/ (-1);
 //BA.debugLineNum = 367;BA.debugLine="LineChart1.IncludeLegend = \"BOTTOM\"";
mostCurrent._linechart1._setincludelegend /*String*/ ("BOTTOM");
 //BA.debugLineNum = 368;BA.debugLine="LineChart1.AutomaticScale = True";
mostCurrent._linechart1._setautomaticscale /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 371;BA.debugLine="LineChart1.XScaleTextOrientation = \"45 DEGREES\"";
mostCurrent._linechart1._setxscaletextorientation /*String*/ ("45 DEGREES");
 //BA.debugLineNum = 375;BA.debugLine="LineChart1.AddLine(\"Temperatura\", 0) '0 = random";
mostCurrent._linechart1._addline /*String*/ ("Temperatura",(int) (0));
 //BA.debugLineNum = 379;BA.debugLine="LineChart1.AddLinePointData(\"Tiempo\", 0, True)";
mostCurrent._linechart1._addlinepointdata /*String*/ ("Tiempo",0,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 385;BA.debugLine="LineChart1.ZoomBarEnabled = True";
mostCurrent._linechart1._setzoombarenabled /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 387;BA.debugLine="LineChart1.DrawChart";
mostCurrent._linechart1._drawchart /*String*/ ();
 //BA.debugLineNum = 391;BA.debugLine="FirstTimeCreated";
_firsttimecreated();
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 659;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 660;BA.debugLine="Log(\"BACK PRESSED\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41900546","BACK PRESSED",0);
 //BA.debugLineNum = 661;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 662;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 };
 //BA.debugLineNum = 664;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 654;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 655;BA.debugLine="Timer1.Enabled = False ' Stop the timer when acti";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 650;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return "";
}
public static String  _animationpanel(int _fromx,int _tox,anywheresoftware.b4a.objects.ConcreteViewWrapper _obj) throws Exception{
anywheresoftware.b4a.objects.AnimationWrapper _anim = null;
 //BA.debugLineNum = 642;BA.debugLine="Sub AnimationPanel(fromX As Int, toX As Int, Obj A";
 //BA.debugLineNum = 643;BA.debugLine="Dim anim As Animation";
_anim = new anywheresoftware.b4a.objects.AnimationWrapper();
 //BA.debugLineNum = 644;BA.debugLine="anim.InitializeTranslate(\"SlideAnimation\", fromX,";
_anim.InitializeTranslate(mostCurrent.activityBA,"SlideAnimation",(float) (_fromx),(float) (0),(float) (_tox),(float) (0));
 //BA.debugLineNum = 645;BA.debugLine="anim.Duration = 300 ' Animation duration in milli";
_anim.setDuration((long) (300));
 //BA.debugLineNum = 646;BA.debugLine="anim.Start(Obj)";
_anim.Start((android.view.View)(_obj.getObject()));
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfig_click() throws Exception{
 //BA.debugLineNum = 600;BA.debugLine="Sub btnConfig_Click";
 //BA.debugLineNum = 601;BA.debugLine="Log(\"Boton Configuration\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41572865","Boton Configuration",0);
 //BA.debugLineNum = 602;BA.debugLine="Log(isPanelVisibleConfig)";
anywheresoftware.b4a.keywords.Common.LogImpl("41572866",BA.ObjectToString(_ispanelvisibleconfig),0);
 //BA.debugLineNum = 603;BA.debugLine="If isPanelVisibleConfig Then";
if (_ispanelvisibleconfig) { 
 //BA.debugLineNum = 605;BA.debugLine="AnimationPanel(1000, 0, pnlSlidingConfig)";
_animationpanel((int) (1000),(int) (0),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingconfig.getObject())));
 //BA.debugLineNum = 606;BA.debugLine="isPanelVisibleConfig = False";
_ispanelvisibleconfig = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 607;BA.debugLine="pnlSlidingConfig.Left = -550dip";
mostCurrent._pnlslidingconfig.setLeft((int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (550))));
 //BA.debugLineNum = 608;BA.debugLine="btnCreations.Visible = True";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 612;BA.debugLine="AnimationPanel(-550, 100, pnlSlidingConfig)";
_animationpanel((int) (-550),(int) (100),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingconfig.getObject())));
 //BA.debugLineNum = 613;BA.debugLine="isPanelVisibleConfig = True";
_ispanelvisibleconfig = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 614;BA.debugLine="pnlSlidingConfig.Left = 0dip";
mostCurrent._pnlslidingconfig.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
 //BA.debugLineNum = 618;BA.debugLine="btnConfig.BringToFront";
mostCurrent._btnconfig.BringToFront();
 //BA.debugLineNum = 619;BA.debugLine="btnCreations.Visible = False";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return "";
}
public static String  _btncreations_click() throws Exception{
 //BA.debugLineNum = 624;BA.debugLine="Sub btnCreations_Click";
 //BA.debugLineNum = 625;BA.debugLine="Log(\"Boton Creations\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41638401","Boton Creations",0);
 //BA.debugLineNum = 626;BA.debugLine="Log(isPanelVisibleCreations)";
anywheresoftware.b4a.keywords.Common.LogImpl("41638402",BA.ObjectToString(_ispanelvisiblecreations),0);
 //BA.debugLineNum = 627;BA.debugLine="If isPanelVisibleCreations Then";
if (_ispanelvisiblecreations) { 
 //BA.debugLineNum = 629;BA.debugLine="AnimationPanel(1000, 0, pnlSlidingCreations)";
_animationpanel((int) (1000),(int) (0),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingcreations.getObject())));
 //BA.debugLineNum = 630;BA.debugLine="isPanelVisibleCreations = False";
_ispanelvisiblecreations = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 631;BA.debugLine="pnlSlidingCreations.Left = -550dip";
mostCurrent._pnlslidingcreations.setLeft((int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (550))));
 //BA.debugLineNum = 632;BA.debugLine="btnConfig.Visible = True";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 635;BA.debugLine="AnimationPanel(-550, 100, pnlSlidingCreations)";
_animationpanel((int) (-550),(int) (100),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingcreations.getObject())));
 //BA.debugLineNum = 636;BA.debugLine="isPanelVisibleCreations = True";
_ispanelvisiblecreations = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 637;BA.debugLine="pnlSlidingCreations.Left = 0dip";
mostCurrent._pnlslidingcreations.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
 //BA.debugLineNum = 638;BA.debugLine="btnConfig.Visible = False";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return "";
}
public static int  _checkviewsescribirhr() throws Exception{
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
 //BA.debugLineNum = 988;BA.debugLine="Sub CheckViewsEscribirHR As Int";
 //BA.debugLineNum = 990;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
 //BA.debugLineNum = 991;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
 //BA.debugLineNum = 992;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42621444","Vacio",0);
 //BA.debugLineNum = 993;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
 //BA.debugLineNum = 995;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
 //BA.debugLineNum = 996;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
 //BA.debugLineNum = 998;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
 //BA.debugLineNum = 999;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Escritura\", index";
_index1 = _loadedinfo.indexOf("Escritura",_index1);
 //BA.debugLineNum = 1000;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
 //BA.debugLineNum = 1001;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
 //BA.debugLineNum = 1002;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
 //BA.debugLineNum = 1005;BA.debugLine="Return count1";
if (true) return _count1;
 };
 //BA.debugLineNum = 1008;BA.debugLine="End Sub";
return 0;
}
public static int  _checkviewshold() throws Exception{
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
 //BA.debugLineNum = 1032;BA.debugLine="Sub CheckViewsHold As Int";
 //BA.debugLineNum = 1034;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
 //BA.debugLineNum = 1035;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
 //BA.debugLineNum = 1036;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42752516","Vacio",0);
 //BA.debugLineNum = 1037;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
 //BA.debugLineNum = 1039;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
 //BA.debugLineNum = 1040;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
 //BA.debugLineNum = 1042;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
 //BA.debugLineNum = 1043;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Hold\", index1)";
_index1 = _loadedinfo.indexOf("Hold",_index1);
 //BA.debugLineNum = 1044;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
 //BA.debugLineNum = 1045;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
 //BA.debugLineNum = 1046;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
 //BA.debugLineNum = 1049;BA.debugLine="Return count1";
if (true) return _count1;
 };
 //BA.debugLineNum = 1052;BA.debugLine="End Sub";
return 0;
}
public static int  _checkviewsleerhr() throws Exception{
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
 //BA.debugLineNum = 966;BA.debugLine="Sub CheckViewsLeerHR As Int";
 //BA.debugLineNum = 968;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
 //BA.debugLineNum = 969;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
 //BA.debugLineNum = 970;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42555908","Vacio",0);
 //BA.debugLineNum = 971;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
 //BA.debugLineNum = 973;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
 //BA.debugLineNum = 974;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
 //BA.debugLineNum = 976;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
 //BA.debugLineNum = 977;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Lectura\", index1)";
_index1 = _loadedinfo.indexOf("Lectura",_index1);
 //BA.debugLineNum = 978;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
 //BA.debugLineNum = 979;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
 //BA.debugLineNum = 980;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
 //BA.debugLineNum = 983;BA.debugLine="Return count1";
if (true) return _count1;
 };
 //BA.debugLineNum = 986;BA.debugLine="End Sub";
return 0;
}
public static int  _checkviewsonoff() throws Exception{
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
 //BA.debugLineNum = 1010;BA.debugLine="Sub CheckViewsOnOff As Int";
 //BA.debugLineNum = 1012;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
 //BA.debugLineNum = 1013;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
 //BA.debugLineNum = 1014;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42686980","Vacio",0);
 //BA.debugLineNum = 1015;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
 //BA.debugLineNum = 1017;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
 //BA.debugLineNum = 1018;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
 //BA.debugLineNum = 1020;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
 //BA.debugLineNum = 1021;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"OnOff\", index1)";
_index1 = _loadedinfo.indexOf("OnOff",_index1);
 //BA.debugLineNum = 1022;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
 //BA.debugLineNum = 1023;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
 //BA.debugLineNum = 1024;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
 //BA.debugLineNum = 1027;BA.debugLine="Return count1";
if (true) return _count1;
 };
 //BA.debugLineNum = 1030;BA.debugLine="End Sub";
return 0;
}
public static void  _connectplc_click() throws Exception{
ResumableSub_ConnectPLC_Click rsub = new ResumableSub_ConnectPLC_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ConnectPLC_Click extends BA.ResumableSub {
public ResumableSub_ConnectPLC_Click(b4a.example.controlador1 parent) {
this.parent = parent;
}
b4a.example.controlador1 parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1230;BA.debugLine="Log(\"Conectando\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43014657","Conectando",0);
 //BA.debugLineNum = 1253;BA.debugLine="Msgbox2Async(\"Looks like no PLC Found, want to SI";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Looks like no PLC Found, want to SIMULATE?"),BA.ObjectToCharSequence("PLC ERROR CONNECTION"),"Yes","Cancel","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1254;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1255;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1258;BA.debugLine="Timer1.Initialize(\"Timer1\", 10000) ' 1 second in";
parent._timer1.Initialize(processBA,"Timer1",(long) (10000));
 //BA.debugLineNum = 1259;BA.debugLine="Timer1.Enabled = True ' Start the timer";
parent._timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1267;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _creandovistas(int _count1,int _count2,int _count3,int _count4) throws Exception{
 //BA.debugLineNum = 1137;BA.debugLine="Sub CreandoVistas(count1 As Int, count2 As Int, co";
 //BA.debugLineNum = 1139;BA.debugLine="If count1 == 0 Then";
if (_count1==0) { 
 //BA.debugLineNum = 1140;BA.debugLine="PanelLeer1.Enabled = False";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1141;BA.debugLine="PanelLeer1.Visible = False";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1143;BA.debugLine="PanelLeer2.Enabled = False";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1144;BA.debugLine="PanelLeer2.Visible = False";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count1==1) { 
 //BA.debugLineNum = 1147;BA.debugLine="PanelLeer1.Enabled = True";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1148;BA.debugLine="PanelLeer1.Visible = True";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1151;BA.debugLine="PanelLeer2.Enabled = False";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1152;BA.debugLine="PanelLeer2.Visible = False";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count1==2) { 
 //BA.debugLineNum = 1154;BA.debugLine="PanelLeer1.Enabled = True";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1155;BA.debugLine="PanelLeer1.Visible = True";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1157;BA.debugLine="PanelLeer2.Enabled = True";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1158;BA.debugLine="PanelLeer2.Visible = True";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 1161;BA.debugLine="If count2 == 0 Then";
if (_count2==0) { 
 //BA.debugLineNum = 1162;BA.debugLine="PanelEscribir1.Enabled = False";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1163;BA.debugLine="PanelEscribir1.Visible = False";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1165;BA.debugLine="PanelEscribir2.Enabled = False";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1166;BA.debugLine="PanelEscribir2.Visible = False";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count2==1) { 
 //BA.debugLineNum = 1169;BA.debugLine="PanelEscribir1.Enabled = True";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1170;BA.debugLine="PanelEscribir1.Visible = True";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1173;BA.debugLine="PanelEscribir2.Enabled = False";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1174;BA.debugLine="PanelEscribir2.Visible = False";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count2==2) { 
 //BA.debugLineNum = 1176;BA.debugLine="PanelEscribir1.Enabled = True";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1177;BA.debugLine="PanelEscribir1.Visible = True";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1179;BA.debugLine="PanelEscribir2.Enabled = True";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1180;BA.debugLine="PanelEscribir2.Visible = True";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 1183;BA.debugLine="If count3 == 0 Then";
if (_count3==0) { 
 //BA.debugLineNum = 1184;BA.debugLine="PanelOnOff1.Enabled = False";
mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1185;BA.debugLine="PanelOnOff1.Visible = False";
mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1187;BA.debugLine="PanelOnOff2.Enabled = False";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1188;BA.debugLine="PanelOnOff2.Visible = False";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count3==1) { 
 //BA.debugLineNum = 1191;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1192;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1195;BA.debugLine="PanelOnOff2.Enabled = False";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1196;BA.debugLine="PanelOnOff2.Visible = False";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count3==2) { 
 //BA.debugLineNum = 1198;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1199;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1201;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1202;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 1205;BA.debugLine="If count4 == 0 Then";
if (_count4==0) { 
 //BA.debugLineNum = 1206;BA.debugLine="PanelHold1.Enabled = False";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1207;BA.debugLine="PanelHold1.Visible = False";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1209;BA.debugLine="PanelHold2.Enabled = False";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1210;BA.debugLine="PanelHold2.Visible = False";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count4==1) { 
 //BA.debugLineNum = 1213;BA.debugLine="PanelHold1.Enabled = True";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1214;BA.debugLine="PanelHold1.Visible = True";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1216;BA.debugLine="PanelHold2.Enabled = False";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1217;BA.debugLine="PanelHold2.Visible = False";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(_count4==2) { 
 //BA.debugLineNum = 1219;BA.debugLine="PanelHold1.Enabled = True";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1220;BA.debugLine="PanelHold1.Visible = True";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1222;BA.debugLine="PanelHold2.Enabled = True";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1223;BA.debugLine="PanelHold2.Visible = True";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 1226;BA.debugLine="End Sub";
return "";
}
public static String  _doallstuff() throws Exception{
int _a = 0;
int _b = 0;
String _asdf = "";
 //BA.debugLineNum = 1275;BA.debugLine="Sub DoAllStuff";
 //BA.debugLineNum = 1277;BA.debugLine="Try";
try { //BA.debugLineNum = 1278;BA.debugLine="Dim A As Int";
_a = 0;
 //BA.debugLineNum = 1279;BA.debugLine="Dim B As Int";
_b = 0;
 //BA.debugLineNum = 1281;BA.debugLine="A = Rnd(100, 1000)";
_a = anywheresoftware.b4a.keywords.Common.Rnd((int) (100),(int) (1000));
 //BA.debugLineNum = 1282;BA.debugLine="B = Rnd(1000, 1100)";
_b = anywheresoftware.b4a.keywords.Common.Rnd((int) (1000),(int) (1100));
 //BA.debugLineNum = 1284;BA.debugLine="Direccion1.Text = A";
mostCurrent._direccion1.setText(BA.ObjectToCharSequence(_a));
 //BA.debugLineNum = 1285;BA.debugLine="Direccion2.Text = B";
mostCurrent._direccion2.setText(BA.ObjectToCharSequence(_b));
 //BA.debugLineNum = 1287;BA.debugLine="Dim asdf As String";
_asdf = "";
 //BA.debugLineNum = 1288;BA.debugLine="DateTime.TimeFormat = \"hh:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("hh:mm:ss");
 //BA.debugLineNum = 1289;BA.debugLine="asdf = DateTime.Time(DateTime.Now)";
_asdf = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 1290;BA.debugLine="Log(asdf)";
anywheresoftware.b4a.keywords.Common.LogImpl("43145743",_asdf,0);
 //BA.debugLineNum = 1292;BA.debugLine="LineChart1.AddLinePointData(asdf, A, True)";
mostCurrent._linechart1._addlinepointdata /*String*/ (_asdf,_a,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1294;BA.debugLine="LineChart1.DrawChart";
mostCurrent._linechart1._drawchart /*String*/ ();
 } 
       catch (Exception e15) {
			processBA.setLastException(e15); //BA.debugLineNum = 1299;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("43145752",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 //BA.debugLineNum = 1303;BA.debugLine="End Sub";
return "";
}
public static String  _escribirhr_click() throws Exception{
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
 //BA.debugLineNum = 732;BA.debugLine="Sub EscribirHR_Click";
 //BA.debugLineNum = 734;BA.debugLine="If CheckViewsEscribirHR <= 1 Then";
if (_checkviewsescribirhr()<=1) { 
 //BA.debugLineNum = 736;BA.debugLine="If CheckViewsEscribirHR == 0 Then";
if (_checkviewsescribirhr()==0) { 
 //BA.debugLineNum = 737;BA.debugLine="PanelEscribir1.Enabled = True";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 738;BA.debugLine="PanelEscribir1.Visible = True";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else if(_checkviewsescribirhr()==1) { 
 //BA.debugLineNum = 740;BA.debugLine="PanelEscribir2.Enabled = True";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 741;BA.debugLine="PanelEscribir2.Visible = True";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 743;BA.debugLine="Log(\"ESCRIBIR HR\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42097163","ESCRIBIR HR",0);
 //BA.debugLineNum = 744;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 745;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
 //BA.debugLineNum = 746;BA.debugLine="Writer.WriteLine(\"Escritura\")";
_writer.WriteLine("Escritura");
 //BA.debugLineNum = 747;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
 //BA.debugLineNum = 750;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return "";
}
public static void  _escribirhr_longclick() throws Exception{
ResumableSub_EscribirHR_LongClick rsub = new ResumableSub_EscribirHR_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_EscribirHR_LongClick extends BA.ResumableSub {
public ResumableSub_EscribirHR_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
b4a.example.controlador1 parent;
String _loadedinfo = "";
int _result = 0;
int _index = 0;
String _texttosave = "";
String _after = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 757;BA.debugLine="If CheckViewsEscribirHR <=2 And CheckViewsEscribi";
if (true) break;

case 1:
//if
this.state = 28;
if (_checkviewsescribirhr()<=2 && _checkviewsescribirhr()>0) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 758;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42162690","Eliminando Lectura",0);
 //BA.debugLineNum = 759;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
 //BA.debugLineNum = 760;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("42162692",_loadedinfo,0);
 //BA.debugLineNum = 761;BA.debugLine="If LoadedInfo == \"\" Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_loadedinfo).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 //BA.debugLineNum = 762;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42162694","Sin Vistas",0);
 //BA.debugLineNum = 763;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 765;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Escritura Ho";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Escritura HoldingRegisters?"),BA.ObjectToCharSequence("Escrituras HRs"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 766;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 29;
return;
case 29:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 767;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 16;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 768;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Escritu";
_index = _loadedinfo.indexOf("Escritura");
 //BA.debugLineNum = 769;BA.debugLine="If index <> -1 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_index!=-1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 770;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
 //BA.debugLineNum = 771;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
 //BA.debugLineNum = 772;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Esc";
_after = _loadedinfo.replace("Escritura","");
 //BA.debugLineNum = 773;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("42162705","DESPUES: "+_after,0);
 //BA.debugLineNum = 774;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
 //BA.debugLineNum = 776;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
 //BA.debugLineNum = 778;BA.debugLine="PanelEscribir1.Enabled = False";
parent.mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 779;BA.debugLine="PanelEscribir1.Visible = False";
parent.mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 781;BA.debugLine="PanelEscribir2.Enabled = False";
parent.mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 782;BA.debugLine="PanelEscribir2.Visible = False";
parent.mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 785;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 28;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 790;BA.debugLine="Log(CheckViewsEscribirHR)";
anywheresoftware.b4a.keywords.Common.LogImpl("42162722",BA.NumberToString(_checkviewsescribirhr()),0);
 //BA.debugLineNum = 791;BA.debugLine="If CheckViewsEscribirHR > 2 Then";
if (true) break;

case 20:
//if
this.state = 27;
if (_checkviewsescribirhr()>2) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 792;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
 //BA.debugLineNum = 793;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("42162725",_loadedinfo,0);
 //BA.debugLineNum = 794;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Escritur";
_index = _loadedinfo.indexOf("Escritura");
 //BA.debugLineNum = 795;BA.debugLine="Log(index)";
anywheresoftware.b4a.keywords.Common.LogImpl("42162727",BA.NumberToString(_index),0);
 //BA.debugLineNum = 796;BA.debugLine="If index <> -1 Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_index!=-1) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 797;BA.debugLine="index = index + 1 ' Move past the last found i";
_index = (int) (_index+1);
 //BA.debugLineNum = 798;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
 //BA.debugLineNum = 799;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Escr";
_after = _loadedinfo.replace("Escritura","");
 //BA.debugLineNum = 800;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("42162732","DESPUES: "+_after,0);
 //BA.debugLineNum = 801;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
 //BA.debugLineNum = 803;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
 //BA.debugLineNum = 804;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 //BA.debugLineNum = 808;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 811;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _firsttimecreated() throws Exception{
ResumableSub_FirstTimeCreated rsub = new ResumableSub_FirstTimeCreated(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_FirstTimeCreated extends BA.ResumableSub {
public ResumableSub_FirstTimeCreated(b4a.example.controlador1 parent) {
this.parent = parent;
}
b4a.example.controlador1 parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 946;BA.debugLine="If Not (File.Exists(File.DirAssets, FileName1)) T";
if (true) break;

case 1:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),parent._filename1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 947;BA.debugLine="If File.Exists(File.DirInternal, FileName1) Then";
if (true) break;

case 4:
//if
this.state = 9;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 948;BA.debugLine="Log(\"YA Existe\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42490372","YA Existe",0);
 //BA.debugLineNum = 949;BA.debugLine="ProgressDialogShow(\"Leyendo 'CONTROLADOR 1'\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Leyendo 'CONTROLADOR 1'"));
 //BA.debugLineNum = 950;BA.debugLine="Sleep(3000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (3000));
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
 //BA.debugLineNum = 951;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 952;BA.debugLine="LoadControlador";
_loadcontrolador();
 //BA.debugLineNum = 953;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 955;BA.debugLine="File.Copy(File.DirAssets, FileName1, File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),parent._filename1,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
 //BA.debugLineNum = 956;BA.debugLine="ProgressDialogShow(\"CREANDO 'CONTROLADOR 1'\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("CREANDO 'CONTROLADOR 1'"));
 //BA.debugLineNum = 957;BA.debugLine="Sleep(3000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (3000));
this.state = 12;
return;
case 12:
//C
this.state = 9;
;
 //BA.debugLineNum = 958;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 959;BA.debugLine="LoadControlador";
_loadcontrolador();
 //BA.debugLineNum = 960;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private btnConfig As Button";
mostCurrent._btnconfig = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private pnlSlidingConfig As Panel";
mostCurrent._pnlslidingconfig = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private isPanelVisibleConfig As Boolean";
_ispanelvisibleconfig = false;
 //BA.debugLineNum = 25;BA.debugLine="Private EditTextIP As EditText";
mostCurrent._edittextip = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private EditTextPort As EditText";
mostCurrent._edittextport = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private ConnectPLC As Button";
mostCurrent._connectplc = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private btnCreations As Button";
mostCurrent._btncreations = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private pnlSlidingCreations As Panel";
mostCurrent._pnlslidingcreations = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private isPanelVisibleCreations As Boolean";
_ispanelvisiblecreations = false;
 //BA.debugLineNum = 35;BA.debugLine="Private LabelCreations As Label";
mostCurrent._labelcreations = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private btnLeerHR As Button";
mostCurrent._btnleerhr = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private btnEscribirHR As Button";
mostCurrent._btnescribirhr = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private btnONOFF As Button";
mostCurrent._btnonoff = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private btnHOLD As Button";
mostCurrent._btnhold = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Dim LeerHRViews As Int = 0";
_leerhrviews = (int) (0);
 //BA.debugLineNum = 43;BA.debugLine="Dim EscribirHRViews As Int = 0";
_escribirhrviews = (int) (0);
 //BA.debugLineNum = 44;BA.debugLine="Dim OnOffViews As Int = 0";
_onoffviews = (int) (0);
 //BA.debugLineNum = 45;BA.debugLine="Dim HoldViews As Int = 0";
_holdviews = (int) (0);
 //BA.debugLineNum = 46;BA.debugLine="Dim TotalViews As Int = 0";
_totalviews = (int) (0);
 //BA.debugLineNum = 50;BA.debugLine="Dim PanelLeer1 As Panel";
mostCurrent._panelleer1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Dim xOffsetLeer1 As Float";
_xoffsetleer1 = 0f;
 //BA.debugLineNum = 52;BA.debugLine="Dim yOffsetLeer1 As Float";
_yoffsetleer1 = 0f;
 //BA.debugLineNum = 53;BA.debugLine="Dim draggingLeer1 As Boolean";
_draggingleer1 = false;
 //BA.debugLineNum = 55;BA.debugLine="Dim Direccion1 As EditText";
mostCurrent._direccion1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Dim Direccion1Res As EditText";
mostCurrent._direccion1res = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Dim PanelLeer2 As Panel";
mostCurrent._panelleer2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Dim xOffsetLeer2 As Float";
_xoffsetleer2 = 0f;
 //BA.debugLineNum = 60;BA.debugLine="Dim yOffsetLeer2 As Float";
_yoffsetleer2 = 0f;
 //BA.debugLineNum = 61;BA.debugLine="Dim draggingLeer2 As Boolean";
_draggingleer2 = false;
 //BA.debugLineNum = 63;BA.debugLine="Dim Direccion2 As EditText";
mostCurrent._direccion2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Dim Direccion2Res As EditText";
mostCurrent._direccion2res = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Dim PanelEscribir1 As Panel";
mostCurrent._panelescribir1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Dim xOffsetEscribir1 As Float";
_xoffsetescribir1 = 0f;
 //BA.debugLineNum = 69;BA.debugLine="Dim yOffsetEscribir1 As Float";
_yoffsetescribir1 = 0f;
 //BA.debugLineNum = 70;BA.debugLine="Dim draggingEscribir1 As Boolean";
_draggingescribir1 = false;
 //BA.debugLineNum = 72;BA.debugLine="Dim Direccion1Escribir As EditText";
mostCurrent._direccion1escribir = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 73;BA.debugLine="Dim Direccion1EscribirValor As EditText";
mostCurrent._direccion1escribirvalor = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Dim Direccion1EscribirBTN As Button";
mostCurrent._direccion1escribirbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 76;BA.debugLine="Dim PanelEscribir2 As Panel";
mostCurrent._panelescribir2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Dim xOffsetEscribir2 As Float";
_xoffsetescribir2 = 0f;
 //BA.debugLineNum = 78;BA.debugLine="Dim yOffsetEscribir2 As Float";
_yoffsetescribir2 = 0f;
 //BA.debugLineNum = 79;BA.debugLine="Dim draggingEscribir2 As Boolean";
_draggingescribir2 = false;
 //BA.debugLineNum = 81;BA.debugLine="Dim Direccion2Escribir As EditText";
mostCurrent._direccion2escribir = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 82;BA.debugLine="Dim Direccion2EscribirValor As EditText";
mostCurrent._direccion2escribirvalor = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Dim Direccion2EscribirBTN As Button";
mostCurrent._direccion2escribirbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Dim PanelOnOff1 As Panel";
mostCurrent._panelonoff1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 87;BA.debugLine="Dim xOffsetOnOff1 As Float";
_xoffsetonoff1 = 0f;
 //BA.debugLineNum = 88;BA.debugLine="Dim yOffsetOnOff1 As Float";
_yoffsetonoff1 = 0f;
 //BA.debugLineNum = 89;BA.debugLine="Dim draggingOnOff1 As Boolean";
_draggingonoff1 = false;
 //BA.debugLineNum = 91;BA.debugLine="Dim Direccion1OnOff As EditText";
mostCurrent._direccion1onoff = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 92;BA.debugLine="Dim BTN1OnOff As Button";
mostCurrent._btn1onoff = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 94;BA.debugLine="Dim PanelOnOff2 As Panel";
mostCurrent._panelonoff2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 95;BA.debugLine="Dim xOffsetOnOff2 As Float";
_xoffsetonoff2 = 0f;
 //BA.debugLineNum = 96;BA.debugLine="Dim yOffsetOnOff2 As Float";
_yoffsetonoff2 = 0f;
 //BA.debugLineNum = 97;BA.debugLine="Dim draggingOnOff2 As Boolean";
_draggingonoff2 = false;
 //BA.debugLineNum = 99;BA.debugLine="Dim Direccion2OnOff As EditText";
mostCurrent._direccion2onoff = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 100;BA.debugLine="Dim BTN2OnOff As Button";
mostCurrent._btn2onoff = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 103;BA.debugLine="Dim PanelHold1 As Panel";
mostCurrent._panelhold1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 104;BA.debugLine="Dim xOffsetHold1 As Float";
_xoffsethold1 = 0f;
 //BA.debugLineNum = 105;BA.debugLine="Dim yOffsetHold1 As Float";
_yoffsethold1 = 0f;
 //BA.debugLineNum = 106;BA.debugLine="Dim draggingHold1 As Boolean";
_dragginghold1 = false;
 //BA.debugLineNum = 108;BA.debugLine="Dim Direccion1Hold As EditText";
mostCurrent._direccion1hold = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Dim BTN1Hold As Button";
mostCurrent._btn1hold = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 111;BA.debugLine="Dim PanelHold2 As Panel";
mostCurrent._panelhold2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 112;BA.debugLine="Dim xOffsetHold2 As Float";
_xoffsethold2 = 0f;
 //BA.debugLineNum = 113;BA.debugLine="Dim yOffsetHold2 As Float";
_yoffsethold2 = 0f;
 //BA.debugLineNum = 114;BA.debugLine="Dim draggingHold2 As Boolean";
_dragginghold2 = false;
 //BA.debugLineNum = 116;BA.debugLine="Dim Direccion2Hold As EditText";
mostCurrent._direccion2hold = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 117;BA.debugLine="Dim BTN2Hold As Button";
mostCurrent._btn2hold = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Private ModbusClient As ModbusTCP";
mostCurrent._modbusclient = new b4a.example.modbustcp();
 //BA.debugLineNum = 122;BA.debugLine="Private COMParameters As ConnectionParams";
mostCurrent._comparameters = new b4a.example.modbusservice._connectionparams();
 //BA.debugLineNum = 123;BA.debugLine="Private ModbusState As Boolean = False";
_modbusstate = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 127;BA.debugLine="Dim Graph As Button";
mostCurrent._graph = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 128;BA.debugLine="Private pnlSlideGraph As Panel";
mostCurrent._pnlslidegraph = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Private isPanelVisibleGraph As Boolean";
_ispanelvisiblegraph = false;
 //BA.debugLineNum = 130;BA.debugLine="Private LineChart1 As xChart";
mostCurrent._linechart1 = new b4a.example.xchart();
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static String  _graph_click() throws Exception{
 //BA.debugLineNum = 572;BA.debugLine="Sub Graph_Click";
 //BA.debugLineNum = 573;BA.debugLine="Log(\"Boton Graficador\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44915201","Boton Graficador",0);
 //BA.debugLineNum = 574;BA.debugLine="Log(isPanelVisibleGraph)";
anywheresoftware.b4a.keywords.Common.LogImpl("44915202",BA.ObjectToString(_ispanelvisiblegraph),0);
 //BA.debugLineNum = 575;BA.debugLine="If isPanelVisibleGraph Then";
if (_ispanelvisiblegraph) { 
 //BA.debugLineNum = 577;BA.debugLine="AnimationPanel(100, 550, pnlSlideGraph)";
_animationpanel((int) (100),(int) (550),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidegraph.getObject())));
 //BA.debugLineNum = 578;BA.debugLine="isPanelVisibleGraph = False";
_ispanelvisiblegraph = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 579;BA.debugLine="pnlSlideGraph.Left = 550dip";
mostCurrent._pnlslidegraph.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (550)));
 //BA.debugLineNum = 580;BA.debugLine="btnCreations.Visible = True";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 581;BA.debugLine="btnConfig.Visible = True";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 585;BA.debugLine="AnimationPanel(550, 100, pnlSlideGraph)";
_animationpanel((int) (550),(int) (100),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidegraph.getObject())));
 //BA.debugLineNum = 586;BA.debugLine="isPanelVisibleGraph = True";
_ispanelvisiblegraph = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 587;BA.debugLine="pnlSlideGraph.Left = 0dip";
mostCurrent._pnlslidegraph.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
 //BA.debugLineNum = 591;BA.debugLine="Graph.BringToFront";
mostCurrent._graph.BringToFront();
 //BA.debugLineNum = 592;BA.debugLine="btnCreations.Visible = False";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 593;BA.debugLine="btnConfig.Visible = False";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 596;BA.debugLine="End Sub";
return "";
}
public static String  _hold_click() throws Exception{
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
 //BA.debugLineNum = 879;BA.debugLine="Sub HOLD_Click";
 //BA.debugLineNum = 881;BA.debugLine="If CheckViewsHold <= 1 Then";
if (_checkviewshold()<=1) { 
 //BA.debugLineNum = 883;BA.debugLine="If CheckViewsHold == 0 Then";
if (_checkviewshold()==0) { 
 //BA.debugLineNum = 884;BA.debugLine="PanelHold1.Enabled = True";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 885;BA.debugLine="PanelHold1.Visible = True";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else if(_checkviewshold()==1) { 
 //BA.debugLineNum = 887;BA.debugLine="PanelHold2.Enabled = True";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 888;BA.debugLine="PanelHold2.Visible = True";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 890;BA.debugLine="Log(\"HOLD\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42359307","HOLD",0);
 //BA.debugLineNum = 891;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 892;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
 //BA.debugLineNum = 893;BA.debugLine="Writer.WriteLine(\"Hold\")";
_writer.WriteLine("Hold");
 //BA.debugLineNum = 894;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
 //BA.debugLineNum = 898;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return "";
}
public static void  _hold_longclick() throws Exception{
ResumableSub_HOLD_LongClick rsub = new ResumableSub_HOLD_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_HOLD_LongClick extends BA.ResumableSub {
public ResumableSub_HOLD_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
b4a.example.controlador1 parent;
String _loadedinfo = "";
int _result = 0;
int _index = 0;
String _texttosave = "";
String _after = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 908;BA.debugLine="If CheckViewsHold <=2 And CheckViewsHold > 0 Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_checkviewshold()<=2 && _checkviewshold()>0) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 909;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42424835","Eliminando Lectura",0);
 //BA.debugLineNum = 910;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
 //BA.debugLineNum = 911;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("42424837",_loadedinfo,0);
 //BA.debugLineNum = 912;BA.debugLine="If LoadedInfo == \"\" Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_loadedinfo).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 //BA.debugLineNum = 913;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42424839","Sin Vistas",0);
 //BA.debugLineNum = 914;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 916;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Acción OnOff";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Acción OnOff?"),BA.ObjectToCharSequence("APAGADO / ENCENDIDO"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 917;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 918;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 16;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 919;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Hold\")";
_index = _loadedinfo.indexOf("Hold");
 //BA.debugLineNum = 920;BA.debugLine="If index <> -1 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_index!=-1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 921;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
 //BA.debugLineNum = 922;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
 //BA.debugLineNum = 923;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Hol";
_after = _loadedinfo.replace("Hold","");
 //BA.debugLineNum = 924;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("42424850","DESPUES: "+_after,0);
 //BA.debugLineNum = 925;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
 //BA.debugLineNum = 926;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
 //BA.debugLineNum = 928;BA.debugLine="PanelHold1.Enabled = False";
parent.mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 929;BA.debugLine="PanelHold1.Visible = False";
parent.mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 931;BA.debugLine="PanelHold2.Enabled = False";
parent.mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 932;BA.debugLine="PanelHold2.Visible = False";
parent.mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 934;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 939;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 942;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _leerhr_click() throws Exception{
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
 //BA.debugLineNum = 668;BA.debugLine="Sub LeerHR_Click";
 //BA.debugLineNum = 669;BA.debugLine="If CheckViewsLeerHR <=1 Then";
if (_checkviewsleerhr()<=1) { 
 //BA.debugLineNum = 671;BA.debugLine="If CheckViewsLeerHR == 0 Then";
if (_checkviewsleerhr()==0) { 
 //BA.debugLineNum = 672;BA.debugLine="PanelLeer1.Enabled = True";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 673;BA.debugLine="PanelLeer1.Visible = True";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else if(_checkviewsleerhr()==1) { 
 //BA.debugLineNum = 675;BA.debugLine="PanelLeer2.Enabled = True";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 676;BA.debugLine="PanelLeer2.Visible = True";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 679;BA.debugLine="Log(\"LEER HR\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41966091","LEER HR",0);
 //BA.debugLineNum = 680;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 681;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
 //BA.debugLineNum = 682;BA.debugLine="Writer.WriteLine(\"Lectura\")";
_writer.WriteLine("Lectura");
 //BA.debugLineNum = 683;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
 //BA.debugLineNum = 687;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return "";
}
public static void  _leerhr_longclick() throws Exception{
ResumableSub_LeerHR_LongClick rsub = new ResumableSub_LeerHR_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LeerHR_LongClick extends BA.ResumableSub {
public ResumableSub_LeerHR_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
b4a.example.controlador1 parent;
String _loadedinfo = "";
int _result = 0;
int _index = 0;
String _texttosave = "";
String _after = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 694;BA.debugLine="If CheckViewsLeerHR <=2 And CheckViewsLeerHR > 0";
if (true) break;

case 1:
//if
this.state = 20;
if (_checkviewsleerhr()<=2 && _checkviewsleerhr()>0) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 695;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42031618","Eliminando Lectura",0);
 //BA.debugLineNum = 696;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
 //BA.debugLineNum = 697;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("42031620",_loadedinfo,0);
 //BA.debugLineNum = 698;BA.debugLine="If LoadedInfo == \"\" Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_loadedinfo).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 //BA.debugLineNum = 699;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42031622","Sin Vistas",0);
 //BA.debugLineNum = 700;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 702;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Lectura Hold";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Lectura HoldingRegisters?"),BA.ObjectToCharSequence("Lecturas HRs"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 703;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 704;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 16;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 705;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Lectura";
_index = _loadedinfo.indexOf("Lectura");
 //BA.debugLineNum = 706;BA.debugLine="If index <> -1 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_index!=-1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 707;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
 //BA.debugLineNum = 708;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
 //BA.debugLineNum = 709;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Lec";
_after = _loadedinfo.replace("Lectura","");
 //BA.debugLineNum = 710;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("42031633","DESPUES: "+_after,0);
 //BA.debugLineNum = 711;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
 //BA.debugLineNum = 713;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
 //BA.debugLineNum = 715;BA.debugLine="PanelLeer1.Enabled = False";
parent.mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 716;BA.debugLine="PanelLeer1.Visible = False";
parent.mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 718;BA.debugLine="PanelLeer2.Enabled = False";
parent.mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 719;BA.debugLine="PanelLeer2.Visible = False";
parent.mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 722;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 727;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 730;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _leyendovistas(String _vistas) throws Exception{
int _count1 = 0;
int _index1 = 0;
int _count2 = 0;
int _index2 = 0;
int _count3 = 0;
int _index3 = 0;
int _count4 = 0;
int _index4 = 0;
 //BA.debugLineNum = 1069;BA.debugLine="Sub LeyendoVistas(Vistas As String)";
 //BA.debugLineNum = 1071;BA.debugLine="Log(Vistas)";
anywheresoftware.b4a.keywords.Common.LogImpl("42883586",_vistas,0);
 //BA.debugLineNum = 1073;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
 //BA.debugLineNum = 1074;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
 //BA.debugLineNum = 1076;BA.debugLine="Dim count2 As Int = 0";
_count2 = (int) (0);
 //BA.debugLineNum = 1077;BA.debugLine="Dim index2 As Int = 0";
_index2 = (int) (0);
 //BA.debugLineNum = 1079;BA.debugLine="Dim count3 As Int = 0";
_count3 = (int) (0);
 //BA.debugLineNum = 1080;BA.debugLine="Dim index3 As Int = 0";
_index3 = (int) (0);
 //BA.debugLineNum = 1082;BA.debugLine="Dim count4 As Int = 0";
_count4 = (int) (0);
 //BA.debugLineNum = 1083;BA.debugLine="Dim index4 As Int = 0";
_index4 = (int) (0);
 //BA.debugLineNum = 1085;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
 //BA.debugLineNum = 1086;BA.debugLine="index1 = Vistas.IndexOf2(\"Lectura\", index1)";
_index1 = _vistas.indexOf("Lectura",_index1);
 //BA.debugLineNum = 1087;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
 //BA.debugLineNum = 1088;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
 //BA.debugLineNum = 1089;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
 //BA.debugLineNum = 1093;BA.debugLine="Do While index2 > -1";
while (_index2>-1) {
 //BA.debugLineNum = 1094;BA.debugLine="index2 = Vistas.IndexOf2(\"Escritura\", index2)";
_index2 = _vistas.indexOf("Escritura",_index2);
 //BA.debugLineNum = 1095;BA.debugLine="If index2 <> -1 Then";
if (_index2!=-1) { 
 //BA.debugLineNum = 1096;BA.debugLine="count2 = count2 + 1";
_count2 = (int) (_count2+1);
 //BA.debugLineNum = 1097;BA.debugLine="index2 = index2 + 1 ' Move past the last found";
_index2 = (int) (_index2+1);
 };
 }
;
 //BA.debugLineNum = 1101;BA.debugLine="Do While index3 > -1";
while (_index3>-1) {
 //BA.debugLineNum = 1102;BA.debugLine="index3 = Vistas.IndexOf2(\"OnOff\", index3)";
_index3 = _vistas.indexOf("OnOff",_index3);
 //BA.debugLineNum = 1103;BA.debugLine="If index3 <> -1 Then";
if (_index3!=-1) { 
 //BA.debugLineNum = 1104;BA.debugLine="count3 = count3 + 1";
_count3 = (int) (_count3+1);
 //BA.debugLineNum = 1105;BA.debugLine="index3 = index3 + 1 ' Move past the last found";
_index3 = (int) (_index3+1);
 };
 }
;
 //BA.debugLineNum = 1109;BA.debugLine="Do While index4 > -1";
while (_index4>-1) {
 //BA.debugLineNum = 1110;BA.debugLine="index4 = Vistas.IndexOf2(\"Hold\", index4)";
_index4 = _vistas.indexOf("Hold",_index4);
 //BA.debugLineNum = 1111;BA.debugLine="If index4 <> -1 Then";
if (_index4!=-1) { 
 //BA.debugLineNum = 1112;BA.debugLine="count4 = count4 + 1";
_count4 = (int) (_count4+1);
 //BA.debugLineNum = 1113;BA.debugLine="index4 = index4 + 1 ' Move past the last found";
_index4 = (int) (_index4+1);
 };
 }
;
 //BA.debugLineNum = 1117;BA.debugLine="Log(\"The word 'LeerHR' appears: \" & count1 & \" ti";
anywheresoftware.b4a.keywords.Common.LogImpl("42883632","The word 'LeerHR' appears: "+BA.NumberToString(_count1)+" times.",0);
 //BA.debugLineNum = 1118;BA.debugLine="Log(\"The word 'ESCRIBIR HR' appears: \" & count2 &";
anywheresoftware.b4a.keywords.Common.LogImpl("42883633","The word 'ESCRIBIR HR' appears: "+BA.NumberToString(_count2)+" times.",0);
 //BA.debugLineNum = 1119;BA.debugLine="Log(\"The word 'ON OFF' appears: \" & count3 & \" ti";
anywheresoftware.b4a.keywords.Common.LogImpl("42883634","The word 'ON OFF' appears: "+BA.NumberToString(_count3)+" times.",0);
 //BA.debugLineNum = 1120;BA.debugLine="Log(\"The word 'HOLD' appears: \" & count4 & \" time";
anywheresoftware.b4a.keywords.Common.LogImpl("42883635","The word 'HOLD' appears: "+BA.NumberToString(_count4)+" times.",0);
 //BA.debugLineNum = 1121;BA.debugLine="LeerHRViews = count1";
_leerhrviews = _count1;
 //BA.debugLineNum = 1122;BA.debugLine="EscribirHRViews = count2";
_escribirhrviews = _count2;
 //BA.debugLineNum = 1123;BA.debugLine="OnOffViews = count3";
_onoffviews = _count3;
 //BA.debugLineNum = 1124;BA.debugLine="HoldViews = count4";
_holdviews = _count4;
 //BA.debugLineNum = 1125;BA.debugLine="TotalViews = count1 + count2 + count3 + count4";
_totalviews = (int) (_count1+_count2+_count3+_count4);
 //BA.debugLineNum = 1126;BA.debugLine="Log(\"TOTAL VIEWS!!: \" & TotalViews)";
anywheresoftware.b4a.keywords.Common.LogImpl("42883641","TOTAL VIEWS!!: "+BA.NumberToString(_totalviews),0);
 //BA.debugLineNum = 1128;BA.debugLine="If count1 > 0 Or count2 > 0 Or count3 > 0 Or coun";
if (_count1>0 || _count2>0 || _count3>0 || _count4>0) { 
 //BA.debugLineNum = 1129;BA.debugLine="Log(\"Creando!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42883644","Creando!",0);
 //BA.debugLineNum = 1130;BA.debugLine="CreandoVistas(count1, count2, count3, count4)";
_creandovistas(_count1,_count2,_count3,_count4);
 }else {
 //BA.debugLineNum = 1132;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42883647","Sin Vistas",0);
 };
 //BA.debugLineNum = 1135;BA.debugLine="End Sub";
return "";
}
public static String  _loadcontrolador() throws Exception{
String _loadedinfo = "";
 //BA.debugLineNum = 1054;BA.debugLine="Sub LoadControlador";
 //BA.debugLineNum = 1056;BA.debugLine="If File.Exists(File.DirInternal, FileName1) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1)) { 
 //BA.debugLineNum = 1057;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
 //BA.debugLineNum = 1058;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("42818052",_loadedinfo,0);
 //BA.debugLineNum = 1059;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
 //BA.debugLineNum = 1060;BA.debugLine="ToastMessageShow(\"NINGUNA VISTA CREADA!\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("NINGUNA VISTA CREADA!"),anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 1062;BA.debugLine="Log(\"Creando Vistas!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42818056","Creando Vistas!",0);
 //BA.debugLineNum = 1063;BA.debugLine="LeyendoVistas(LoadedInfo)";
_leyendovistas(_loadedinfo);
 };
 };
 //BA.debugLineNum = 1067;BA.debugLine="End Sub";
return "";
}
public static String  _onoff_click() throws Exception{
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
 //BA.debugLineNum = 813;BA.debugLine="Sub ONOFF_Click";
 //BA.debugLineNum = 815;BA.debugLine="If CheckViewsOnOff <= 1 Then";
if (_checkviewsonoff()<=1) { 
 //BA.debugLineNum = 817;BA.debugLine="If CheckViewsOnOff == 0 Then";
if (_checkviewsonoff()==0) { 
 //BA.debugLineNum = 818;BA.debugLine="PanelOnOff1.Enabled = True";
mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 819;BA.debugLine="PanelOnOff1.Visible = True";
mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else if(_checkviewsonoff()==1) { 
 //BA.debugLineNum = 821;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 822;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 825;BA.debugLine="Log(\"ON OFF\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42228236","ON OFF",0);
 //BA.debugLineNum = 826;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 827;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
 //BA.debugLineNum = 828;BA.debugLine="Writer.WriteLine(\"OnOff\")";
_writer.WriteLine("OnOff");
 //BA.debugLineNum = 829;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
 //BA.debugLineNum = 832;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return "";
}
public static void  _onoff_longclick() throws Exception{
ResumableSub_ONOFF_LongClick rsub = new ResumableSub_ONOFF_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ONOFF_LongClick extends BA.ResumableSub {
public ResumableSub_ONOFF_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
b4a.example.controlador1 parent;
String _loadedinfo = "";
int _result = 0;
int _index = 0;
String _texttosave = "";
String _after = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 841;BA.debugLine="If CheckViewsOnOff <=2 And CheckViewsOnOff > 0 Th";
if (true) break;

case 1:
//if
this.state = 20;
if (_checkviewsonoff()<=2 && _checkviewsonoff()>0) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 842;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42293763","Eliminando Lectura",0);
 //BA.debugLineNum = 843;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
 //BA.debugLineNum = 844;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("42293765",_loadedinfo,0);
 //BA.debugLineNum = 845;BA.debugLine="If LoadedInfo == \"\" Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_loadedinfo).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 //BA.debugLineNum = 846;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42293767","Sin Vistas",0);
 //BA.debugLineNum = 847;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 849;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Acción OnOff";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Acción OnOff?"),BA.ObjectToCharSequence("APAGADO / ENCENDIDO"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 850;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 851;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 16;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 852;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"OnOff\")";
_index = _loadedinfo.indexOf("OnOff");
 //BA.debugLineNum = 853;BA.debugLine="If index <> -1 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_index!=-1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 854;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
 //BA.debugLineNum = 855;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
 //BA.debugLineNum = 856;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"OnO";
_after = _loadedinfo.replace("OnOff","");
 //BA.debugLineNum = 857;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("42293778","DESPUES: "+_after,0);
 //BA.debugLineNum = 858;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
 //BA.debugLineNum = 860;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
 //BA.debugLineNum = 862;BA.debugLine="PanelOnOff1.Enabled = False";
parent.mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 863;BA.debugLine="PanelOnOff1.Visible = False";
parent.mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 865;BA.debugLine="PanelOnOff2.Enabled = False";
parent.mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 866;BA.debugLine="PanelOnOff2.Visible = False";
parent.mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 869;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 874;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _panelescribir1_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 435;BA.debugLine="Sub PanelEscribir1_Touch (Action As Int, X As Floa";
 //BA.debugLineNum = 437;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 439;BA.debugLine="draggingEscribir1 = True";
_draggingescribir1 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 440;BA.debugLine="xOffsetEscribir1= X";
_xoffsetescribir1 = _x;
 //BA.debugLineNum = 441;BA.debugLine="yOffsetEscribir1 = Y";
_yoffsetescribir1 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 444;BA.debugLine="If draggingEscribir1 Then";
if (_draggingescribir1) { 
 //BA.debugLineNum = 445;BA.debugLine="Dim newX As Float = PanelEscribir1.Left + (X -";
_newx = (float) (mostCurrent._panelescribir1.getLeft()+(_x-_xoffsetescribir1));
 //BA.debugLineNum = 446;BA.debugLine="Dim newY As Float = PanelEscribir1.Top + (Y -";
_newy = (float) (mostCurrent._panelescribir1.getTop()+(_y-_yoffsetescribir1));
 //BA.debugLineNum = 448;BA.debugLine="PanelEscribir1.SetLayout(newX, newY, PanelEscr";
mostCurrent._panelescribir1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelescribir1.getWidth(),mostCurrent._panelescribir1.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 452;BA.debugLine="draggingEscribir1 = False";
_draggingescribir1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return "";
}
public static String  _panelescribir2_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 460;BA.debugLine="Sub PanelEscribir2_Touch (Action As Int, X As Floa";
 //BA.debugLineNum = 462;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 464;BA.debugLine="draggingEscribir2 = True";
_draggingescribir2 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 465;BA.debugLine="xOffsetEscribir2 = X";
_xoffsetescribir2 = _x;
 //BA.debugLineNum = 466;BA.debugLine="yOffsetEscribir2 = Y";
_yoffsetescribir2 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 469;BA.debugLine="If draggingEscribir2 Then";
if (_draggingescribir2) { 
 //BA.debugLineNum = 470;BA.debugLine="Dim newX As Float = PanelEscribir2.Left + (X -";
_newx = (float) (mostCurrent._panelescribir2.getLeft()+(_x-_xoffsetescribir2));
 //BA.debugLineNum = 471;BA.debugLine="Dim newY As Float = PanelEscribir2.Top + (Y -";
_newy = (float) (mostCurrent._panelescribir2.getTop()+(_y-_yoffsetescribir2));
 //BA.debugLineNum = 473;BA.debugLine="PanelEscribir2.SetLayout(newX, newY, PanelEscr";
mostCurrent._panelescribir2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelescribir2.getWidth(),mostCurrent._panelescribir2.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 477;BA.debugLine="draggingEscribir2 = False";
_draggingescribir2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return "";
}
public static String  _panelhold1_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 527;BA.debugLine="Sub PanelHold1_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 529;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 531;BA.debugLine="draggingHold1 = True";
_dragginghold1 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 532;BA.debugLine="xOffsetHold1 = X";
_xoffsethold1 = _x;
 //BA.debugLineNum = 533;BA.debugLine="yOffsetHold1 = Y";
_yoffsethold1 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 536;BA.debugLine="If draggingHold1 Then";
if (_dragginghold1) { 
 //BA.debugLineNum = 537;BA.debugLine="Dim newX As Float = PanelHold1.Left + (X - xOf";
_newx = (float) (mostCurrent._panelhold1.getLeft()+(_x-_xoffsethold1));
 //BA.debugLineNum = 538;BA.debugLine="Dim newY As Float = PanelHold1.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelhold1.getTop()+(_y-_yoffsethold1));
 //BA.debugLineNum = 540;BA.debugLine="PanelHold1.SetLayout(newX, newY, PanelHold1.Wi";
mostCurrent._panelhold1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelhold1.getWidth(),mostCurrent._panelhold1.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 544;BA.debugLine="draggingHold1 = False";
_dragginghold1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return "";
}
public static String  _panelhold2_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 550;BA.debugLine="Sub PanelHold2_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 552;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 554;BA.debugLine="draggingHold2 = True";
_dragginghold2 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 555;BA.debugLine="xOffsetHold2 = X";
_xoffsethold2 = _x;
 //BA.debugLineNum = 556;BA.debugLine="yOffsetHold2 = Y";
_yoffsethold2 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 559;BA.debugLine="If draggingHold2 Then";
if (_dragginghold2) { 
 //BA.debugLineNum = 560;BA.debugLine="Dim newX As Float = PanelHold2.Left + (X - xOf";
_newx = (float) (mostCurrent._panelhold2.getLeft()+(_x-_xoffsethold2));
 //BA.debugLineNum = 561;BA.debugLine="Dim newY As Float = PanelHold2.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelhold2.getTop()+(_y-_yoffsethold2));
 //BA.debugLineNum = 563;BA.debugLine="PanelHold2.SetLayout(newX, newY, PanelHold2.Wi";
mostCurrent._panelhold2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelhold2.getWidth(),mostCurrent._panelhold2.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 567;BA.debugLine="draggingHold2 = False";
_dragginghold2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return "";
}
public static String  _panelleer1_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 395;BA.debugLine="Sub PanelLeer1_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 396;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 398;BA.debugLine="draggingLeer1 = True";
_draggingleer1 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 399;BA.debugLine="xOffsetLeer1 = X";
_xoffsetleer1 = _x;
 //BA.debugLineNum = 400;BA.debugLine="yOffsetLeer1 = Y";
_yoffsetleer1 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 403;BA.debugLine="If draggingLeer1 Then";
if (_draggingleer1) { 
 //BA.debugLineNum = 404;BA.debugLine="Dim newX As Float = PanelLeer1.Left + (X - xOf";
_newx = (float) (mostCurrent._panelleer1.getLeft()+(_x-_xoffsetleer1));
 //BA.debugLineNum = 405;BA.debugLine="Dim newY As Float = PanelLeer1.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelleer1.getTop()+(_y-_yoffsetleer1));
 //BA.debugLineNum = 407;BA.debugLine="PanelLeer1.SetLayout(newX, newY, PanelLeer1.Wi";
mostCurrent._panelleer1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelleer1.getWidth(),mostCurrent._panelleer1.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 411;BA.debugLine="draggingLeer1 = False";
_draggingleer1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return "";
}
public static String  _panelleer2_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 415;BA.debugLine="Sub PanelLeer2_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 416;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 418;BA.debugLine="draggingLeer2 = True";
_draggingleer2 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 419;BA.debugLine="xOffsetLeer2 = X";
_xoffsetleer2 = _x;
 //BA.debugLineNum = 420;BA.debugLine="yOffsetLeer2 = Y";
_yoffsetleer2 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 423;BA.debugLine="If draggingLeer2 Then";
if (_draggingleer2) { 
 //BA.debugLineNum = 424;BA.debugLine="Dim newX As Float = PanelLeer2.Left + (X - xOf";
_newx = (float) (mostCurrent._panelleer2.getLeft()+(_x-_xoffsetleer2));
 //BA.debugLineNum = 425;BA.debugLine="Dim newY As Float = PanelLeer2.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelleer2.getTop()+(_y-_yoffsetleer2));
 //BA.debugLineNum = 427;BA.debugLine="PanelLeer2.SetLayout(newX, newY, PanelLeer2.Wi";
mostCurrent._panelleer2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelleer2.getWidth(),mostCurrent._panelleer2.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 431;BA.debugLine="draggingLeer2 = False";
_draggingleer2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return "";
}
public static String  _panelonoff1_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 483;BA.debugLine="Sub PanelOnOff1_Touch (Action As Int, X As Float,";
 //BA.debugLineNum = 485;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 487;BA.debugLine="draggingOnOff1 = True";
_draggingonoff1 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 488;BA.debugLine="xOffsetOnOff1 = X";
_xoffsetonoff1 = _x;
 //BA.debugLineNum = 489;BA.debugLine="yOffsetOnOff1 = Y";
_yoffsetonoff1 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 492;BA.debugLine="If draggingOnOff1 Then";
if (_draggingonoff1) { 
 //BA.debugLineNum = 493;BA.debugLine="Dim newX As Float = PanelOnOff1.Left + (X - xO";
_newx = (float) (mostCurrent._panelonoff1.getLeft()+(_x-_xoffsetonoff1));
 //BA.debugLineNum = 494;BA.debugLine="Dim newY As Float = PanelOnOff1.Top + (Y - yOf";
_newy = (float) (mostCurrent._panelonoff1.getTop()+(_y-_yoffsetonoff1));
 //BA.debugLineNum = 496;BA.debugLine="PanelOnOff1.SetLayout(newX, newY, PanelOnOff1.";
mostCurrent._panelonoff1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelonoff1.getWidth(),mostCurrent._panelonoff1.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 500;BA.debugLine="draggingOnOff1 = False";
_draggingonoff1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return "";
}
public static String  _panelonoff2_touch(int _action,float _x,float _y) throws Exception{
float _newx = 0f;
float _newy = 0f;
 //BA.debugLineNum = 505;BA.debugLine="Sub PanelOnOff2_Touch (Action As Int, X As Float,";
 //BA.debugLineNum = 507;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 509;BA.debugLine="draggingOnOff2 = True";
_draggingonoff2 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 510;BA.debugLine="xOffsetOnOff2 = X";
_xoffsetonoff2 = _x;
 //BA.debugLineNum = 511;BA.debugLine="yOffsetOnOff2 = Y";
_yoffsetonoff2 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 514;BA.debugLine="If draggingOnOff2 Then";
if (_draggingonoff2) { 
 //BA.debugLineNum = 515;BA.debugLine="Dim newX As Float = PanelOnOff2.Left + (X - xO";
_newx = (float) (mostCurrent._panelonoff2.getLeft()+(_x-_xoffsetonoff2));
 //BA.debugLineNum = 516;BA.debugLine="Dim newY As Float = PanelOnOff2.Top + (Y - yOf";
_newy = (float) (mostCurrent._panelonoff2.getTop()+(_y-_yoffsetonoff2));
 //BA.debugLineNum = 518;BA.debugLine="PanelOnOff2.SetLayout(newX, newY, PanelOnOff2.";
mostCurrent._panelonoff2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelonoff2.getWidth(),mostCurrent._panelonoff2.getHeight());
 };
 break; }
case 2: {
 //BA.debugLineNum = 522;BA.debugLine="draggingOnOff2 = False";
_draggingonoff2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private FileName1 As String = \"Controlador1.txt\"";
_filename1 = "Controlador1.txt";
 //BA.debugLineNum = 12;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 1269;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 1270;BA.debugLine="Log(\"Timer ticked!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43080193","Timer ticked!",0);
 //BA.debugLineNum = 1271;BA.debugLine="DoAllStuff";
_doallstuff();
 //BA.debugLineNum = 1273;BA.debugLine="End Sub";
return "";
}
}
