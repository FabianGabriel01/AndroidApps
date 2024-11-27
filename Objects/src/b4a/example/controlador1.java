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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.controlador1");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Activity.LoadLayout(\"Controlador1\")";
mostCurrent._activity.LoadLayout("Controlador1",mostCurrent.activityBA);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="isPanelVisibleConfig = False";
_ispanelvisibleconfig = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="isPanelVisibleCreations = False";
_ispanelvisiblecreations = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="EditTextIP.Initialize(\"IP\")";
mostCurrent._edittextip.Initialize(mostCurrent.activityBA,"IP");
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="EditTextPort.Initialize(\"PORT\")";
mostCurrent._edittextport.Initialize(mostCurrent.activityBA,"PORT");
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="ConnectPLC.Initialize(\"ConnectPLC\")";
mostCurrent._connectplc.Initialize(mostCurrent.activityBA,"ConnectPLC");
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="btnConfig.Initialize(\"btnConfig\")";
mostCurrent._btnconfig.Initialize(mostCurrent.activityBA,"btnConfig");
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="btnConfig.Text = \"C\"";
mostCurrent._btnconfig.setText(BA.ObjectToCharSequence("C"));
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="btnConfig.Width = 50dip ' 5x5 in dp";
mostCurrent._btnconfig.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="btnConfig.Height = 50dip";
mostCurrent._btnconfig.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="btnConfig.Color = Colors.Red ' Set button color";
mostCurrent._btnconfig.setColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="Activity.AddView(btnConfig, 0, 0, btnConfig.Width";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btnconfig.getObject()),(int) (0),(int) (0),mostCurrent._btnconfig.getWidth(),mostCurrent._btnconfig.getHeight());
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="pnlSlidingConfig.Initialize(\"\")";
mostCurrent._pnlslidingconfig.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="pnlSlidingConfig.Color = Colors.LightGray";
mostCurrent._pnlslidingconfig.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="pnlSlidingConfig.Width = 100%x";
mostCurrent._pnlslidingconfig.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="pnlSlidingConfig.Height = 250dip";
mostCurrent._pnlslidingconfig.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="pnlSlidingConfig.Left = -pnlSlidingConfig.Width '";
mostCurrent._pnlslidingconfig.setLeft((int) (-mostCurrent._pnlslidingconfig.getWidth()));
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="Activity.AddView(pnlSlidingConfig, pnlSlidingConf";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnlslidingconfig.getObject()),mostCurrent._pnlslidingconfig.getLeft(),(int) (0),mostCurrent._pnlslidingconfig.getWidth(),mostCurrent._pnlslidingconfig.getHeight());
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="EditTextIP.Hint = \"Dirección IP\"";
mostCurrent._edittextip.setHint("Dirección IP");
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="EditTextIP.HintColor = Colors.Black";
mostCurrent._edittextip.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="EditTextIP.InputType = EditTextIP.INPUT_TYPE_TEXT";
mostCurrent._edittextip.setInputType(mostCurrent._edittextip.INPUT_TYPE_TEXT);
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="pnlSlidingConfig.AddView(EditTextIP, 10%x, 5%y, 8";
mostCurrent._pnlslidingconfig.AddView((android.view.View)(mostCurrent._edittextip.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="EditTextPort.Hint = \"PUERTO\"";
mostCurrent._edittextport.setHint("PUERTO");
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="EditTextPort.HintColor = Colors.Black";
mostCurrent._edittextport.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="EditTextPort.InputType = EditTextPort.INPUT_TYPE_";
mostCurrent._edittextport.setInputType(mostCurrent._edittextport.INPUT_TYPE_TEXT);
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="pnlSlidingConfig.AddView(EditTextPort, 10%x, 13%y";
mostCurrent._pnlslidingconfig.AddView((android.view.View)(mostCurrent._edittextport.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (13),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="ConnectPLC.Text = \"Conectar\"";
mostCurrent._connectplc.setText(BA.ObjectToCharSequence("Conectar"));
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="pnlSlidingConfig.AddView(ConnectPLC, 10%x, 23%y,";
mostCurrent._pnlslidingconfig.AddView((android.view.View)(mostCurrent._connectplc.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (23),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="btnCreations.Initialize(\"btnCreations\")";
mostCurrent._btncreations.Initialize(mostCurrent.activityBA,"btnCreations");
RDebugUtils.currentLine=983088;
 //BA.debugLineNum = 983088;BA.debugLine="btnCreations.Text = \"+\"";
mostCurrent._btncreations.setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="btnCreations.Width = 50dip ' 5x5 in dp";
mostCurrent._btncreations.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983090;
 //BA.debugLineNum = 983090;BA.debugLine="btnCreations.Height = 50dip";
mostCurrent._btncreations.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983091;
 //BA.debugLineNum = 983091;BA.debugLine="btnCreations.Color = Colors.Blue ' Set button col";
mostCurrent._btncreations.setColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=983092;
 //BA.debugLineNum = 983092;BA.debugLine="Activity.AddView(btnCreations, 0, 8%y, btnCreatio";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btncreations.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA),mostCurrent._btncreations.getWidth(),mostCurrent._btncreations.getHeight());
RDebugUtils.currentLine=983095;
 //BA.debugLineNum = 983095;BA.debugLine="pnlSlidingCreations.Initialize(\"\")";
mostCurrent._pnlslidingcreations.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=983096;
 //BA.debugLineNum = 983096;BA.debugLine="pnlSlidingCreations.Color = Colors.LightGray";
mostCurrent._pnlslidingcreations.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=983097;
 //BA.debugLineNum = 983097;BA.debugLine="pnlSlidingCreations.Width = 100%x";
mostCurrent._pnlslidingcreations.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=983098;
 //BA.debugLineNum = 983098;BA.debugLine="pnlSlidingCreations.Height = 250dip";
mostCurrent._pnlslidingcreations.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
RDebugUtils.currentLine=983099;
 //BA.debugLineNum = 983099;BA.debugLine="pnlSlidingCreations.Left = -pnlSlidingCreations.W";
mostCurrent._pnlslidingcreations.setLeft((int) (-mostCurrent._pnlslidingcreations.getWidth()));
RDebugUtils.currentLine=983100;
 //BA.debugLineNum = 983100;BA.debugLine="Activity.AddView(pnlSlidingCreations, pnlSlidingC";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnlslidingcreations.getObject()),mostCurrent._pnlslidingcreations.getLeft(),(int) (0),mostCurrent._pnlslidingcreations.getWidth(),mostCurrent._pnlslidingcreations.getHeight());
RDebugUtils.currentLine=983102;
 //BA.debugLineNum = 983102;BA.debugLine="LabelCreations.Initialize(\"\")";
mostCurrent._labelcreations.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=983103;
 //BA.debugLineNum = 983103;BA.debugLine="LabelCreations.Text = \"Maximo 2 Vistas por Acción";
mostCurrent._labelcreations.setText(BA.ObjectToCharSequence("Maximo 2 Vistas por Acción, 8 vistas en total"));
RDebugUtils.currentLine=983104;
 //BA.debugLineNum = 983104;BA.debugLine="pnlSlidingCreations.AddView(LabelCreations, 15%x,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._labelcreations.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983106;
 //BA.debugLineNum = 983106;BA.debugLine="btnLeerHR.Initialize(\"LeerHR\")";
mostCurrent._btnleerhr.Initialize(mostCurrent.activityBA,"LeerHR");
RDebugUtils.currentLine=983107;
 //BA.debugLineNum = 983107;BA.debugLine="btnLeerHR.Text = \"Leer Holding Registers\"";
mostCurrent._btnleerhr.setText(BA.ObjectToCharSequence("Leer Holding Registers"));
RDebugUtils.currentLine=983108;
 //BA.debugLineNum = 983108;BA.debugLine="pnlSlidingCreations.AddView(btnLeerHR, 10%x, 4%y,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnleerhr.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983110;
 //BA.debugLineNum = 983110;BA.debugLine="btnEscribirHR.Initialize(\"EscribirHR\")";
mostCurrent._btnescribirhr.Initialize(mostCurrent.activityBA,"EscribirHR");
RDebugUtils.currentLine=983111;
 //BA.debugLineNum = 983111;BA.debugLine="btnEscribirHR.Text = \"Escribir Holding Registers\"";
mostCurrent._btnescribirhr.setText(BA.ObjectToCharSequence("Escribir Holding Registers"));
RDebugUtils.currentLine=983112;
 //BA.debugLineNum = 983112;BA.debugLine="pnlSlidingCreations.AddView(btnEscribirHR, 10%x,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnescribirhr.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983114;
 //BA.debugLineNum = 983114;BA.debugLine="btnONOFF.Initialize(\"ONOFF\")";
mostCurrent._btnonoff.Initialize(mostCurrent.activityBA,"ONOFF");
RDebugUtils.currentLine=983115;
 //BA.debugLineNum = 983115;BA.debugLine="btnONOFF.Text = \"BOTON ON OFF\"";
mostCurrent._btnonoff.setText(BA.ObjectToCharSequence("BOTON ON OFF"));
RDebugUtils.currentLine=983116;
 //BA.debugLineNum = 983116;BA.debugLine="pnlSlidingCreations.AddView(btnONOFF, 10%x, 16%y,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnonoff.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (16),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983118;
 //BA.debugLineNum = 983118;BA.debugLine="btnHOLD.Initialize(\"HOLD\")";
mostCurrent._btnhold.Initialize(mostCurrent.activityBA,"HOLD");
RDebugUtils.currentLine=983119;
 //BA.debugLineNum = 983119;BA.debugLine="btnHOLD.Text = \"BOTON HOLD\"";
mostCurrent._btnhold.setText(BA.ObjectToCharSequence("BOTON HOLD"));
RDebugUtils.currentLine=983120;
 //BA.debugLineNum = 983120;BA.debugLine="pnlSlidingCreations.AddView(btnHOLD, 10%x, 22%y,";
mostCurrent._pnlslidingcreations.AddView((android.view.View)(mostCurrent._btnhold.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983126;
 //BA.debugLineNum = 983126;BA.debugLine="PanelLeer1.Initialize(\"PanelLeer1\")";
mostCurrent._panelleer1.Initialize(mostCurrent.activityBA,"PanelLeer1");
RDebugUtils.currentLine=983127;
 //BA.debugLineNum = 983127;BA.debugLine="PanelLeer1.Color = Colors.Cyan";
mostCurrent._panelleer1.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=983128;
 //BA.debugLineNum = 983128;BA.debugLine="PanelLeer1.Enabled = False";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983129;
 //BA.debugLineNum = 983129;BA.debugLine="PanelLeer1.Visible = False";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983130;
 //BA.debugLineNum = 983130;BA.debugLine="Direccion1.Initialize(\"Direccion1\")";
mostCurrent._direccion1.Initialize(mostCurrent.activityBA,"Direccion1");
RDebugUtils.currentLine=983131;
 //BA.debugLineNum = 983131;BA.debugLine="Direccion1.Hint = \"# Reg a Leer\"";
mostCurrent._direccion1.setHint("# Reg a Leer");
RDebugUtils.currentLine=983132;
 //BA.debugLineNum = 983132;BA.debugLine="Direccion1Res.Initialize(\"Direccion1Res\")";
mostCurrent._direccion1res.Initialize(mostCurrent.activityBA,"Direccion1Res");
RDebugUtils.currentLine=983133;
 //BA.debugLineNum = 983133;BA.debugLine="Direccion1Res.Hint = \"              Valor\"";
mostCurrent._direccion1res.setHint("              Valor");
RDebugUtils.currentLine=983134;
 //BA.debugLineNum = 983134;BA.debugLine="Direccion1Res.Enabled = False";
mostCurrent._direccion1res.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983135;
 //BA.debugLineNum = 983135;BA.debugLine="Activity.AddView(PanelLeer1, 100dip, 200dip, 200d";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelleer1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=983136;
 //BA.debugLineNum = 983136;BA.debugLine="PanelLeer1.AddView(Direccion1, 0dip, 0dip, 190dip";
mostCurrent._panelleer1.AddView((android.view.View)(mostCurrent._direccion1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983137;
 //BA.debugLineNum = 983137;BA.debugLine="PanelLeer1.AddView(Direccion1Res, 0dip, 50dip, 19";
mostCurrent._panelleer1.AddView((android.view.View)(mostCurrent._direccion1res.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983139;
 //BA.debugLineNum = 983139;BA.debugLine="PanelLeer2.Initialize(\"PanelLeer2\")";
mostCurrent._panelleer2.Initialize(mostCurrent.activityBA,"PanelLeer2");
RDebugUtils.currentLine=983140;
 //BA.debugLineNum = 983140;BA.debugLine="PanelLeer2.Color = Colors.White";
mostCurrent._panelleer2.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=983141;
 //BA.debugLineNum = 983141;BA.debugLine="PanelLeer2.Enabled = False";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983142;
 //BA.debugLineNum = 983142;BA.debugLine="PanelLeer2.Visible = False";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983143;
 //BA.debugLineNum = 983143;BA.debugLine="Direccion2.Initialize(\"Direccion2\")";
mostCurrent._direccion2.Initialize(mostCurrent.activityBA,"Direccion2");
RDebugUtils.currentLine=983144;
 //BA.debugLineNum = 983144;BA.debugLine="Direccion2.Hint = \"# Reg a Leer\"";
mostCurrent._direccion2.setHint("# Reg a Leer");
RDebugUtils.currentLine=983145;
 //BA.debugLineNum = 983145;BA.debugLine="Direccion2Res.Initialize(\"Direccion2Res\")";
mostCurrent._direccion2res.Initialize(mostCurrent.activityBA,"Direccion2Res");
RDebugUtils.currentLine=983146;
 //BA.debugLineNum = 983146;BA.debugLine="Direccion2Res.Hint = \"              Valor\"";
mostCurrent._direccion2res.setHint("              Valor");
RDebugUtils.currentLine=983147;
 //BA.debugLineNum = 983147;BA.debugLine="Direccion2Res.Enabled = False";
mostCurrent._direccion2res.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983148;
 //BA.debugLineNum = 983148;BA.debugLine="Activity.AddView(PanelLeer2, 10dip, 300dip, 200di";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelleer2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=983149;
 //BA.debugLineNum = 983149;BA.debugLine="PanelLeer2.AddView(Direccion2, 0dip, 0dip, 190dip";
mostCurrent._panelleer2.AddView((android.view.View)(mostCurrent._direccion2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983150;
 //BA.debugLineNum = 983150;BA.debugLine="PanelLeer2.AddView(Direccion2Res, 0dip, 50dip, 19";
mostCurrent._panelleer2.AddView((android.view.View)(mostCurrent._direccion2res.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983154;
 //BA.debugLineNum = 983154;BA.debugLine="PanelEscribir1.Initialize(\"PanelEscribir1\")";
mostCurrent._panelescribir1.Initialize(mostCurrent.activityBA,"PanelEscribir1");
RDebugUtils.currentLine=983155;
 //BA.debugLineNum = 983155;BA.debugLine="PanelEscribir1.Color = Colors.DarkGray";
mostCurrent._panelescribir1.setColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=983156;
 //BA.debugLineNum = 983156;BA.debugLine="PanelEscribir1.Enabled = False";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983157;
 //BA.debugLineNum = 983157;BA.debugLine="PanelEscribir1.Visible = False";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983158;
 //BA.debugLineNum = 983158;BA.debugLine="Direccion1Escribir.Initialize(\"Direccion1Escribir";
mostCurrent._direccion1escribir.Initialize(mostCurrent.activityBA,"Direccion1Escribir");
RDebugUtils.currentLine=983159;
 //BA.debugLineNum = 983159;BA.debugLine="Direccion1Escribir.Hint = \"#Reg a Escribir\"";
mostCurrent._direccion1escribir.setHint("#Reg a Escribir");
RDebugUtils.currentLine=983160;
 //BA.debugLineNum = 983160;BA.debugLine="Direccion1EscribirValor.Initialize(\"Direccion1Esc";
mostCurrent._direccion1escribirvalor.Initialize(mostCurrent.activityBA,"Direccion1EscribirValor");
RDebugUtils.currentLine=983161;
 //BA.debugLineNum = 983161;BA.debugLine="Direccion1EscribirValor.Hint = \"Valor\"";
mostCurrent._direccion1escribirvalor.setHint("Valor");
RDebugUtils.currentLine=983162;
 //BA.debugLineNum = 983162;BA.debugLine="Direccion1EscribirValor.HintColor = Colors.Cyan";
mostCurrent._direccion1escribirvalor.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=983163;
 //BA.debugLineNum = 983163;BA.debugLine="Direccion1EscribirValor.TextColor = Colors.Cyan";
mostCurrent._direccion1escribirvalor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=983164;
 //BA.debugLineNum = 983164;BA.debugLine="Direccion1EscribirValor.Enabled = False";
mostCurrent._direccion1escribirvalor.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983165;
 //BA.debugLineNum = 983165;BA.debugLine="Direccion1EscribirBTN.Initialize(\"Direccion1Escri";
mostCurrent._direccion1escribirbtn.Initialize(mostCurrent.activityBA,"Direccion1EscribirBTN");
RDebugUtils.currentLine=983166;
 //BA.debugLineNum = 983166;BA.debugLine="Direccion1EscribirBTN.Text = \"Mandar a Registro\"";
mostCurrent._direccion1escribirbtn.setText(BA.ObjectToCharSequence("Mandar a Registro"));
RDebugUtils.currentLine=983167;
 //BA.debugLineNum = 983167;BA.debugLine="Activity.AddView(PanelEscribir1, 100dip, 200dip,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelescribir1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
RDebugUtils.currentLine=983168;
 //BA.debugLineNum = 983168;BA.debugLine="PanelEscribir1.AddView(Direccion1Escribir, 0dip,";
mostCurrent._panelescribir1.AddView((android.view.View)(mostCurrent._direccion1escribir.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983169;
 //BA.debugLineNum = 983169;BA.debugLine="PanelEscribir1.AddView(Direccion1EscribirValor, 0";
mostCurrent._panelescribir1.AddView((android.view.View)(mostCurrent._direccion1escribirvalor.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983170;
 //BA.debugLineNum = 983170;BA.debugLine="PanelEscribir1.AddView(Direccion1EscribirBTN, 0di";
mostCurrent._panelescribir1.AddView((android.view.View)(mostCurrent._direccion1escribirbtn.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983172;
 //BA.debugLineNum = 983172;BA.debugLine="PanelEscribir2.Initialize(\"PanelEscribir2\")";
mostCurrent._panelescribir2.Initialize(mostCurrent.activityBA,"PanelEscribir2");
RDebugUtils.currentLine=983173;
 //BA.debugLineNum = 983173;BA.debugLine="PanelEscribir2.Color = Colors.DarkGray";
mostCurrent._panelescribir2.setColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=983174;
 //BA.debugLineNum = 983174;BA.debugLine="PanelEscribir2.Enabled = False";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983175;
 //BA.debugLineNum = 983175;BA.debugLine="PanelEscribir2.Visible = False";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983176;
 //BA.debugLineNum = 983176;BA.debugLine="Direccion2Escribir.Initialize(\"Direccion2Escribir";
mostCurrent._direccion2escribir.Initialize(mostCurrent.activityBA,"Direccion2Escribir");
RDebugUtils.currentLine=983177;
 //BA.debugLineNum = 983177;BA.debugLine="Direccion2Escribir.Hint = \"#Reg a Escribir\"";
mostCurrent._direccion2escribir.setHint("#Reg a Escribir");
RDebugUtils.currentLine=983178;
 //BA.debugLineNum = 983178;BA.debugLine="Direccion2EscribirValor.Initialize(\"Direccion2Esc";
mostCurrent._direccion2escribirvalor.Initialize(mostCurrent.activityBA,"Direccion2EscribirValor");
RDebugUtils.currentLine=983179;
 //BA.debugLineNum = 983179;BA.debugLine="Direccion2EscribirValor.Hint = \"Valor\"";
mostCurrent._direccion2escribirvalor.setHint("Valor");
RDebugUtils.currentLine=983180;
 //BA.debugLineNum = 983180;BA.debugLine="Direccion2EscribirValor.Enabled = False";
mostCurrent._direccion2escribirvalor.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983181;
 //BA.debugLineNum = 983181;BA.debugLine="Direccion2EscribirValor.HintColor = Colors.Cyan";
mostCurrent._direccion2escribirvalor.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=983182;
 //BA.debugLineNum = 983182;BA.debugLine="Direccion2EscribirValor.TextColor = Colors.Cyan";
mostCurrent._direccion2escribirvalor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=983183;
 //BA.debugLineNum = 983183;BA.debugLine="Direccion2EscribirBTN.Initialize(\"Direccion2Escri";
mostCurrent._direccion2escribirbtn.Initialize(mostCurrent.activityBA,"Direccion2EscribirBTN");
RDebugUtils.currentLine=983184;
 //BA.debugLineNum = 983184;BA.debugLine="Direccion2EscribirBTN.Text = \"Mandar a Registro\"";
mostCurrent._direccion2escribirbtn.setText(BA.ObjectToCharSequence("Mandar a Registro"));
RDebugUtils.currentLine=983185;
 //BA.debugLineNum = 983185;BA.debugLine="Activity.AddView(PanelEscribir2, 100dip, 200dip,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelescribir2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
RDebugUtils.currentLine=983186;
 //BA.debugLineNum = 983186;BA.debugLine="PanelEscribir2.AddView(Direccion2Escribir, 0dip,";
mostCurrent._panelescribir2.AddView((android.view.View)(mostCurrent._direccion2escribir.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983187;
 //BA.debugLineNum = 983187;BA.debugLine="PanelEscribir2.AddView(Direccion2EscribirValor, 0";
mostCurrent._panelescribir2.AddView((android.view.View)(mostCurrent._direccion2escribirvalor.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983188;
 //BA.debugLineNum = 983188;BA.debugLine="PanelEscribir2.AddView(Direccion2EscribirBTN, 0di";
mostCurrent._panelescribir2.AddView((android.view.View)(mostCurrent._direccion2escribirbtn.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983191;
 //BA.debugLineNum = 983191;BA.debugLine="PanelOnOff1.Initialize(\"PanelOnOff1\")";
mostCurrent._panelonoff1.Initialize(mostCurrent.activityBA,"PanelOnOff1");
RDebugUtils.currentLine=983192;
 //BA.debugLineNum = 983192;BA.debugLine="PanelOnOff1.Color = Colors.LightGray";
mostCurrent._panelonoff1.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=983193;
 //BA.debugLineNum = 983193;BA.debugLine="PanelOnOff1.Enabled = False";
mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983194;
 //BA.debugLineNum = 983194;BA.debugLine="PanelOnOff1.Visible = False";
mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983195;
 //BA.debugLineNum = 983195;BA.debugLine="Direccion1OnOff.Initialize(\"Direccion1OnOff\")";
mostCurrent._direccion1onoff.Initialize(mostCurrent.activityBA,"Direccion1OnOff");
RDebugUtils.currentLine=983196;
 //BA.debugLineNum = 983196;BA.debugLine="Direccion1OnOff.Hint = \"#Reg On/OFF\"";
mostCurrent._direccion1onoff.setHint("#Reg On/OFF");
RDebugUtils.currentLine=983197;
 //BA.debugLineNum = 983197;BA.debugLine="BTN1OnOff.Initialize(\"BTN1OnOff\")";
mostCurrent._btn1onoff.Initialize(mostCurrent.activityBA,"BTN1OnOff");
RDebugUtils.currentLine=983198;
 //BA.debugLineNum = 983198;BA.debugLine="BTN1OnOff.Text = \"Encender/Apagar\"";
mostCurrent._btn1onoff.setText(BA.ObjectToCharSequence("Encender/Apagar"));
RDebugUtils.currentLine=983199;
 //BA.debugLineNum = 983199;BA.debugLine="Activity.AddView(PanelOnOff1, 100dip, 200dip, 200";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelonoff1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=983200;
 //BA.debugLineNum = 983200;BA.debugLine="PanelOnOff1.AddView(Direccion1OnOff, 0dip, 0dip,";
mostCurrent._panelonoff1.AddView((android.view.View)(mostCurrent._direccion1onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983201;
 //BA.debugLineNum = 983201;BA.debugLine="PanelOnOff1.AddView(BTN1OnOff, 0dip, 50dip, 190di";
mostCurrent._panelonoff1.AddView((android.view.View)(mostCurrent._btn1onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983203;
 //BA.debugLineNum = 983203;BA.debugLine="PanelOnOff2.Initialize(\"PanelOnOff2\")";
mostCurrent._panelonoff2.Initialize(mostCurrent.activityBA,"PanelOnOff2");
RDebugUtils.currentLine=983204;
 //BA.debugLineNum = 983204;BA.debugLine="PanelOnOff2.Color = Colors.LightGray";
mostCurrent._panelonoff2.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=983205;
 //BA.debugLineNum = 983205;BA.debugLine="PanelOnOff2.Enabled = False";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983206;
 //BA.debugLineNum = 983206;BA.debugLine="PanelOnOff2.Visible = False";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983207;
 //BA.debugLineNum = 983207;BA.debugLine="Direccion2OnOff.Initialize(\"Direccion2OnOff\")";
mostCurrent._direccion2onoff.Initialize(mostCurrent.activityBA,"Direccion2OnOff");
RDebugUtils.currentLine=983208;
 //BA.debugLineNum = 983208;BA.debugLine="Direccion2OnOff.Hint = \"#Reg On/OFF\"";
mostCurrent._direccion2onoff.setHint("#Reg On/OFF");
RDebugUtils.currentLine=983209;
 //BA.debugLineNum = 983209;BA.debugLine="BTN2OnOff.Initialize(\"BTN2OnOff\")";
mostCurrent._btn2onoff.Initialize(mostCurrent.activityBA,"BTN2OnOff");
RDebugUtils.currentLine=983210;
 //BA.debugLineNum = 983210;BA.debugLine="BTN2OnOff.Text = \"Encender/Apagar\"";
mostCurrent._btn2onoff.setText(BA.ObjectToCharSequence("Encender/Apagar"));
RDebugUtils.currentLine=983211;
 //BA.debugLineNum = 983211;BA.debugLine="Activity.AddView(PanelOnOff2, 100dip, 200dip, 200";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelonoff2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=983212;
 //BA.debugLineNum = 983212;BA.debugLine="PanelOnOff2.AddView(Direccion2OnOff, 0dip, 0dip,";
mostCurrent._panelonoff2.AddView((android.view.View)(mostCurrent._direccion2onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983213;
 //BA.debugLineNum = 983213;BA.debugLine="PanelOnOff2.AddView(BTN2OnOff, 0dip, 50dip, 190di";
mostCurrent._panelonoff2.AddView((android.view.View)(mostCurrent._btn2onoff.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983216;
 //BA.debugLineNum = 983216;BA.debugLine="PanelHold1.Initialize(\"PanelHold1\")";
mostCurrent._panelhold1.Initialize(mostCurrent.activityBA,"PanelHold1");
RDebugUtils.currentLine=983217;
 //BA.debugLineNum = 983217;BA.debugLine="PanelHold1.Color = Colors.Magenta";
mostCurrent._panelhold1.setColor(anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=983218;
 //BA.debugLineNum = 983218;BA.debugLine="PanelHold1.Enabled = False";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983219;
 //BA.debugLineNum = 983219;BA.debugLine="PanelHold1.Visible = False";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983220;
 //BA.debugLineNum = 983220;BA.debugLine="Direccion1Hold.Initialize(\"Direccion1Hold\")";
mostCurrent._direccion1hold.Initialize(mostCurrent.activityBA,"Direccion1Hold");
RDebugUtils.currentLine=983221;
 //BA.debugLineNum = 983221;BA.debugLine="Direccion1Hold.Hint = \"#Reg\"";
mostCurrent._direccion1hold.setHint("#Reg");
RDebugUtils.currentLine=983222;
 //BA.debugLineNum = 983222;BA.debugLine="BTN1Hold.Initialize(\"BTN1Hold\")";
mostCurrent._btn1hold.Initialize(mostCurrent.activityBA,"BTN1Hold");
RDebugUtils.currentLine=983223;
 //BA.debugLineNum = 983223;BA.debugLine="BTN1Hold.Text = \"HOLD\"";
mostCurrent._btn1hold.setText(BA.ObjectToCharSequence("HOLD"));
RDebugUtils.currentLine=983224;
 //BA.debugLineNum = 983224;BA.debugLine="Activity.AddView(PanelHold1, 100dip, 200dip, 200d";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelhold1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=983225;
 //BA.debugLineNum = 983225;BA.debugLine="PanelHold1.AddView(Direccion1Hold, 0dip, 0dip, 19";
mostCurrent._panelhold1.AddView((android.view.View)(mostCurrent._direccion1hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983226;
 //BA.debugLineNum = 983226;BA.debugLine="PanelHold1.AddView(BTN1Hold, 0dip, 50dip, 190dip,";
mostCurrent._panelhold1.AddView((android.view.View)(mostCurrent._btn1hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983229;
 //BA.debugLineNum = 983229;BA.debugLine="PanelHold2.Initialize(\"PanelHold2\")";
mostCurrent._panelhold2.Initialize(mostCurrent.activityBA,"PanelHold2");
RDebugUtils.currentLine=983230;
 //BA.debugLineNum = 983230;BA.debugLine="PanelHold2.Color = Colors.Magenta";
mostCurrent._panelhold2.setColor(anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=983231;
 //BA.debugLineNum = 983231;BA.debugLine="PanelHold2.Enabled = False";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983232;
 //BA.debugLineNum = 983232;BA.debugLine="PanelHold2.Visible = False";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983233;
 //BA.debugLineNum = 983233;BA.debugLine="Direccion2Hold.Initialize(\"Direccion2Hold\")";
mostCurrent._direccion2hold.Initialize(mostCurrent.activityBA,"Direccion2Hold");
RDebugUtils.currentLine=983234;
 //BA.debugLineNum = 983234;BA.debugLine="Direccion2Hold.Hint = \"#Reg\"";
mostCurrent._direccion2hold.setHint("#Reg");
RDebugUtils.currentLine=983235;
 //BA.debugLineNum = 983235;BA.debugLine="BTN2Hold.Initialize(\"BTN2Hold\")";
mostCurrent._btn2hold.Initialize(mostCurrent.activityBA,"BTN2Hold");
RDebugUtils.currentLine=983236;
 //BA.debugLineNum = 983236;BA.debugLine="BTN2Hold.Text = \"HOLD\"";
mostCurrent._btn2hold.setText(BA.ObjectToCharSequence("HOLD"));
RDebugUtils.currentLine=983237;
 //BA.debugLineNum = 983237;BA.debugLine="Activity.AddView(PanelHold2, 100dip, 200dip, 200d";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelhold2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=983238;
 //BA.debugLineNum = 983238;BA.debugLine="PanelHold2.AddView(Direccion2Hold, 0dip, 0dip, 19";
mostCurrent._panelhold2.AddView((android.view.View)(mostCurrent._direccion2hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983239;
 //BA.debugLineNum = 983239;BA.debugLine="PanelHold2.AddView(BTN2Hold, 0dip, 50dip, 190dip,";
mostCurrent._panelhold2.AddView((android.view.View)(mostCurrent._btn2hold.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (190)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983242;
 //BA.debugLineNum = 983242;BA.debugLine="Graph.Initialize(\"Graph\")";
mostCurrent._graph.Initialize(mostCurrent.activityBA,"Graph");
RDebugUtils.currentLine=983243;
 //BA.debugLineNum = 983243;BA.debugLine="Graph.Text = \"G\"";
mostCurrent._graph.setText(BA.ObjectToCharSequence("G"));
RDebugUtils.currentLine=983244;
 //BA.debugLineNum = 983244;BA.debugLine="Graph.Width = 50dip ' 5x5 in dp";
mostCurrent._graph.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983245;
 //BA.debugLineNum = 983245;BA.debugLine="Graph.Height = 50dip";
mostCurrent._graph.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=983246;
 //BA.debugLineNum = 983246;BA.debugLine="Graph.Color = Colors.White ' Set button color";
mostCurrent._graph.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=983247;
 //BA.debugLineNum = 983247;BA.debugLine="Activity.AddView(Graph, 87%x, 0, Graph.Width, Gra";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._graph.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (87),mostCurrent.activityBA),(int) (0),mostCurrent._graph.getWidth(),mostCurrent._graph.getHeight());
RDebugUtils.currentLine=983255;
 //BA.debugLineNum = 983255;BA.debugLine="pnlSlideGraph.Left = pnlSlideGraph.Width + 50";
mostCurrent._pnlslidegraph.setLeft((int) (mostCurrent._pnlslidegraph.getWidth()+50));
RDebugUtils.currentLine=983259;
 //BA.debugLineNum = 983259;BA.debugLine="LineChart1.ClearData";
mostCurrent._linechart1._cleardata /*String*/ (null);
RDebugUtils.currentLine=983261;
 //BA.debugLineNum = 983261;BA.debugLine="LineChart1.Title = \"Temperatura\"";
mostCurrent._linechart1._settitle /*String*/ (null,"Temperatura");
RDebugUtils.currentLine=983262;
 //BA.debugLineNum = 983262;BA.debugLine="LineChart1.XAxisName = \"Tiempo\"";
mostCurrent._linechart1._setxaxisname /*String*/ (null,"Tiempo");
RDebugUtils.currentLine=983263;
 //BA.debugLineNum = 983263;BA.debugLine="LineChart1.YAxisName = \"Values\"";
mostCurrent._linechart1._setyaxisname /*String*/ (null,"Values");
RDebugUtils.currentLine=983265;
 //BA.debugLineNum = 983265;BA.debugLine="LineChart1.IncludeLegend = True";
mostCurrent._linechart1._setincludelegend /*String*/ (null,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=983266;
 //BA.debugLineNum = 983266;BA.debugLine="LineChart1.YScaleMaxValue = 1";
mostCurrent._linechart1._setyscalemaxvalue /*double*/ (null,1);
RDebugUtils.currentLine=983267;
 //BA.debugLineNum = 983267;BA.debugLine="LineChart1.YScaleMinValue = -1";
mostCurrent._linechart1._setyscaleminvalue /*double*/ (null,-1);
RDebugUtils.currentLine=983268;
 //BA.debugLineNum = 983268;BA.debugLine="LineChart1.IncludeLegend = \"BOTTOM\"";
mostCurrent._linechart1._setincludelegend /*String*/ (null,"BOTTOM");
RDebugUtils.currentLine=983269;
 //BA.debugLineNum = 983269;BA.debugLine="LineChart1.AutomaticScale = True";
mostCurrent._linechart1._setautomaticscale /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983272;
 //BA.debugLineNum = 983272;BA.debugLine="LineChart1.XScaleTextOrientation = \"45 DEGREES\"";
mostCurrent._linechart1._setxscaletextorientation /*String*/ (null,"45 DEGREES");
RDebugUtils.currentLine=983276;
 //BA.debugLineNum = 983276;BA.debugLine="LineChart1.AddLine(\"Temperatura\", 0) '0 = random";
mostCurrent._linechart1._addline /*String*/ (null,"Temperatura",(int) (0));
RDebugUtils.currentLine=983280;
 //BA.debugLineNum = 983280;BA.debugLine="LineChart1.AddLinePointData(\"Tiempo\", 0, True)";
mostCurrent._linechart1._addlinepointdata /*String*/ (null,"Tiempo",0,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983286;
 //BA.debugLineNum = 983286;BA.debugLine="LineChart1.ZoomBarEnabled = True";
mostCurrent._linechart1._setzoombarenabled /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983288;
 //BA.debugLineNum = 983288;BA.debugLine="LineChart1.DrawChart";
mostCurrent._linechart1._drawchart /*String*/ (null);
RDebugUtils.currentLine=983292;
 //BA.debugLineNum = 983292;BA.debugLine="FirstTimeCreated";
_firsttimecreated();
RDebugUtils.currentLine=983294;
 //BA.debugLineNum = 983294;BA.debugLine="End Sub";
return "";
}
public static void  _firsttimecreated() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "firsttimecreated", false))
	 {Debug.delegate(mostCurrent.activityBA, "firsttimecreated", null); return;}
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
RDebugUtils.currentModule="controlador1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="If Not (File.Exists(File.DirAssets, FileName1)) T";
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
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="If File.Exists(File.DirInternal, FileName1) Then";
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
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Log(\"YA Existe\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22555908","YA Existe",0);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="ProgressDialogShow(\"Leyendo 'CONTROLADOR 1'\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Leyendo 'CONTROLADOR 1'"));
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Sleep(3000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "controlador1", "firsttimecreated"),(int) (3000));
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="LoadControlador";
_loadcontrolador();
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="File.Copy(File.DirAssets, FileName1, File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),parent._filename1,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="ProgressDialogShow(\"CREANDO 'CONTROLADOR 1'\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("CREANDO 'CONTROLADOR 1'"));
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Sleep(3000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "controlador1", "firsttimecreated"),(int) (3000));
this.state = 12;
return;
case 12:
//C
this.state = 9;
;
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="LoadControlador";
_loadcontrolador();
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="Return";
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
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Log(\"BACK PRESSED\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21966082","BACK PRESSED",0);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 };
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="controlador1";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Timer1.Enabled = False ' Stop the timer when acti";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _animationpanel(int _fromx,int _tox,anywheresoftware.b4a.objects.ConcreteViewWrapper _obj) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "animationpanel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "animationpanel", new Object[] {_fromx,_tox,_obj}));}
anywheresoftware.b4a.objects.AnimationWrapper _anim = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub AnimationPanel(fromX As Int, toX As Int, Obj A";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim anim As Animation";
_anim = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="anim.InitializeTranslate(\"SlideAnimation\", fromX,";
_anim.InitializeTranslate(mostCurrent.activityBA,"SlideAnimation",(float) (_fromx),(float) (0),(float) (_tox),(float) (0));
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="anim.Duration = 300 ' Animation duration in milli";
_anim.setDuration((long) (300));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="anim.Start(Obj)";
_anim.Start((android.view.View)(_obj.getObject()));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfig_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnconfig_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnconfig_click", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub btnConfig_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Log(\"Boton Configuration\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21638401","Boton Configuration",0);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Log(isPanelVisibleConfig)";
anywheresoftware.b4a.keywords.Common.LogImpl("21638402",BA.ObjectToString(_ispanelvisibleconfig),0);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="If isPanelVisibleConfig Then";
if (_ispanelvisibleconfig) { 
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="AnimationPanel(1000, 0, pnlSlidingConfig)";
_animationpanel((int) (1000),(int) (0),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingconfig.getObject())));
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="isPanelVisibleConfig = False";
_ispanelvisibleconfig = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="pnlSlidingConfig.Left = -550dip";
mostCurrent._pnlslidingconfig.setLeft((int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (550))));
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="btnCreations.Visible = True";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="AnimationPanel(-550, 100, pnlSlidingConfig)";
_animationpanel((int) (-550),(int) (100),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingconfig.getObject())));
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="isPanelVisibleConfig = True";
_ispanelvisibleconfig = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="pnlSlidingConfig.Left = 0dip";
mostCurrent._pnlslidingconfig.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="btnConfig.BringToFront";
mostCurrent._btnconfig.BringToFront();
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="btnCreations.Visible = False";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="End Sub";
return "";
}
public static String  _btncreations_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncreations_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncreations_click", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub btnCreations_Click";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Log(\"Boton Creations\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21703937","Boton Creations",0);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Log(isPanelVisibleCreations)";
anywheresoftware.b4a.keywords.Common.LogImpl("21703938",BA.ObjectToString(_ispanelvisiblecreations),0);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="If isPanelVisibleCreations Then";
if (_ispanelvisiblecreations) { 
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="AnimationPanel(1000, 0, pnlSlidingCreations)";
_animationpanel((int) (1000),(int) (0),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingcreations.getObject())));
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="isPanelVisibleCreations = False";
_ispanelvisiblecreations = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="pnlSlidingCreations.Left = -550dip";
mostCurrent._pnlslidingcreations.setLeft((int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (550))));
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="btnConfig.Visible = True";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="AnimationPanel(-550, 100, pnlSlidingCreations)";
_animationpanel((int) (-550),(int) (100),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidingcreations.getObject())));
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="isPanelVisibleCreations = True";
_ispanelvisiblecreations = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="pnlSlidingCreations.Left = 0dip";
mostCurrent._pnlslidingcreations.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="btnConfig.Visible = False";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="End Sub";
return "";
}
public static int  _checkviewsescribirhr() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkviewsescribirhr", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "checkviewsescribirhr", null));}
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub CheckViewsEscribirHR As Int";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22686980","Vacio",0);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Escritura\", index";
_index1 = _loadedinfo.indexOf("Escritura",_index1);
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="Return count1";
if (true) return _count1;
 };
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="End Sub";
return 0;
}
public static int  _checkviewshold() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkviewshold", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "checkviewshold", null));}
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub CheckViewsHold As Int";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22818052","Vacio",0);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Hold\", index1)";
_index1 = _loadedinfo.indexOf("Hold",_index1);
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="Return count1";
if (true) return _count1;
 };
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="End Sub";
return 0;
}
public static int  _checkviewsleerhr() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkviewsleerhr", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "checkviewsleerhr", null));}
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub CheckViewsLeerHR As Int";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22621444","Vacio",0);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Lectura\", index1)";
_index1 = _loadedinfo.indexOf("Lectura",_index1);
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="Return count1";
if (true) return _count1;
 };
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="End Sub";
return 0;
}
public static int  _checkviewsonoff() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkviewsonoff", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "checkviewsonoff", null));}
String _loadedinfo = "";
int _count1 = 0;
int _index1 = 0;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub CheckViewsOnOff As Int";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Log(\"Vacio\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22752516","Vacio",0);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Return 0";
if (true) return (int) (0);
 }else {
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"OnOff\", index1)";
_index1 = _loadedinfo.indexOf("OnOff",_index1);
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="Return count1";
if (true) return _count1;
 };
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="End Sub";
return 0;
}
public static void  _connectplc_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "connectplc_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "connectplc_click", null); return;}
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
RDebugUtils.currentModule="controlador1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Log(\"Conectando\")";
anywheresoftware.b4a.keywords.Common.LogImpl("23080193","Conectando",0);
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="Msgbox2Async(\"Looks like no PLC Found, want to SI";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Looks like no PLC Found, want to SIMULATE?"),BA.ObjectToCharSequence("PLC ERROR CONNECTION"),"Yes","Cancel","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "controlador1", "connectplc_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=3080221;
 //BA.debugLineNum = 3080221;BA.debugLine="Timer1.Initialize(\"Timer1\", 10000) ' 1 second in";
parent._timer1.Initialize(processBA,"Timer1",(long) (10000));
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="Timer1.Enabled = True ' Start the timer";
parent._timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=3080230;
 //BA.debugLineNum = 3080230;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _creandovistas(int _count1,int _count2,int _count3,int _count4) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creandovistas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creandovistas", new Object[] {_count1,_count2,_count3,_count4}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub CreandoVistas(count1 As Int, count2 As Int, co";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If count1 == 0 Then";
if (_count1==0) { 
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="PanelLeer1.Enabled = False";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="PanelLeer1.Visible = False";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="PanelLeer2.Enabled = False";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="PanelLeer2.Visible = False";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Else If count1 == 1 Then";
if (_count1==1) { 
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="PanelLeer1.Enabled = True";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="PanelLeer1.Visible = True";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="PanelLeer2.Enabled = False";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="PanelLeer2.Visible = False";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="Else If count1 == 2 Then";
if (_count1==2) { 
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="PanelLeer1.Enabled = True";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="PanelLeer1.Visible = True";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="PanelLeer2.Enabled = True";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="PanelLeer2.Visible = True";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}}
;
RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="If count2 == 0 Then";
if (_count2==0) { 
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="PanelEscribir1.Enabled = False";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="PanelEscribir1.Visible = False";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014684;
 //BA.debugLineNum = 3014684;BA.debugLine="PanelEscribir2.Enabled = False";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014685;
 //BA.debugLineNum = 3014685;BA.debugLine="PanelEscribir2.Visible = False";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014687;
 //BA.debugLineNum = 3014687;BA.debugLine="Else If count2 == 1 Then";
if (_count2==1) { 
RDebugUtils.currentLine=3014688;
 //BA.debugLineNum = 3014688;BA.debugLine="PanelEscribir1.Enabled = True";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014689;
 //BA.debugLineNum = 3014689;BA.debugLine="PanelEscribir1.Visible = True";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014692;
 //BA.debugLineNum = 3014692;BA.debugLine="PanelEscribir2.Enabled = False";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014693;
 //BA.debugLineNum = 3014693;BA.debugLine="PanelEscribir2.Visible = False";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014694;
 //BA.debugLineNum = 3014694;BA.debugLine="Else If count2 == 2 Then";
if (_count2==2) { 
RDebugUtils.currentLine=3014695;
 //BA.debugLineNum = 3014695;BA.debugLine="PanelEscribir1.Enabled = True";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014696;
 //BA.debugLineNum = 3014696;BA.debugLine="PanelEscribir1.Visible = True";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014698;
 //BA.debugLineNum = 3014698;BA.debugLine="PanelEscribir2.Enabled = True";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014699;
 //BA.debugLineNum = 3014699;BA.debugLine="PanelEscribir2.Visible = True";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}}
;
RDebugUtils.currentLine=3014702;
 //BA.debugLineNum = 3014702;BA.debugLine="If count3 == 0 Then";
if (_count3==0) { 
RDebugUtils.currentLine=3014703;
 //BA.debugLineNum = 3014703;BA.debugLine="PanelOnOff1.Enabled = False";
mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014704;
 //BA.debugLineNum = 3014704;BA.debugLine="PanelOnOff1.Visible = False";
mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014706;
 //BA.debugLineNum = 3014706;BA.debugLine="PanelOnOff2.Enabled = False";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014707;
 //BA.debugLineNum = 3014707;BA.debugLine="PanelOnOff2.Visible = False";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014709;
 //BA.debugLineNum = 3014709;BA.debugLine="Else If count3 == 1 Then";
if (_count3==1) { 
RDebugUtils.currentLine=3014710;
 //BA.debugLineNum = 3014710;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014711;
 //BA.debugLineNum = 3014711;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014714;
 //BA.debugLineNum = 3014714;BA.debugLine="PanelOnOff2.Enabled = False";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014715;
 //BA.debugLineNum = 3014715;BA.debugLine="PanelOnOff2.Visible = False";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014716;
 //BA.debugLineNum = 3014716;BA.debugLine="Else If count3 == 2 Then";
if (_count3==2) { 
RDebugUtils.currentLine=3014717;
 //BA.debugLineNum = 3014717;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014718;
 //BA.debugLineNum = 3014718;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014720;
 //BA.debugLineNum = 3014720;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014721;
 //BA.debugLineNum = 3014721;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}}
;
RDebugUtils.currentLine=3014724;
 //BA.debugLineNum = 3014724;BA.debugLine="If count4 == 0 Then";
if (_count4==0) { 
RDebugUtils.currentLine=3014725;
 //BA.debugLineNum = 3014725;BA.debugLine="PanelHold1.Enabled = False";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014726;
 //BA.debugLineNum = 3014726;BA.debugLine="PanelHold1.Visible = False";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014728;
 //BA.debugLineNum = 3014728;BA.debugLine="PanelHold2.Enabled = False";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014729;
 //BA.debugLineNum = 3014729;BA.debugLine="PanelHold2.Visible = False";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014731;
 //BA.debugLineNum = 3014731;BA.debugLine="Else If count4 == 1 Then";
if (_count4==1) { 
RDebugUtils.currentLine=3014732;
 //BA.debugLineNum = 3014732;BA.debugLine="PanelHold1.Enabled = True";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014733;
 //BA.debugLineNum = 3014733;BA.debugLine="PanelHold1.Visible = True";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014735;
 //BA.debugLineNum = 3014735;BA.debugLine="PanelHold2.Enabled = False";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014736;
 //BA.debugLineNum = 3014736;BA.debugLine="PanelHold2.Visible = False";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=3014737;
 //BA.debugLineNum = 3014737;BA.debugLine="Else If count4 == 2 Then";
if (_count4==2) { 
RDebugUtils.currentLine=3014738;
 //BA.debugLineNum = 3014738;BA.debugLine="PanelHold1.Enabled = True";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014739;
 //BA.debugLineNum = 3014739;BA.debugLine="PanelHold1.Visible = True";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014741;
 //BA.debugLineNum = 3014741;BA.debugLine="PanelHold2.Enabled = True";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014742;
 //BA.debugLineNum = 3014742;BA.debugLine="PanelHold2.Visible = True";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}}
;
RDebugUtils.currentLine=3014745;
 //BA.debugLineNum = 3014745;BA.debugLine="End Sub";
return "";
}
public static String  _doallstuff() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "doallstuff", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "doallstuff", null));}
int _a = 0;
int _b = 0;
String _asdf = "";
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub DoAllStuff";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Try";
try {RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Dim A As Int";
_a = 0;
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="Dim B As Int";
_b = 0;
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="A = Rnd(100, 1000)";
_a = anywheresoftware.b4a.keywords.Common.Rnd((int) (100),(int) (1000));
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="B = Rnd(1000, 1100)";
_b = anywheresoftware.b4a.keywords.Common.Rnd((int) (1000),(int) (1100));
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="Direccion1.Text = A";
mostCurrent._direccion1.setText(BA.ObjectToCharSequence(_a));
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="Direccion2.Text = B";
mostCurrent._direccion2.setText(BA.ObjectToCharSequence(_b));
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="Dim asdf As String";
_asdf = "";
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="DateTime.TimeFormat = \"hh:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("hh:mm:ss");
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="asdf = DateTime.Time(DateTime.Now)";
_asdf = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="Log(asdf)";
anywheresoftware.b4a.keywords.Common.LogImpl("23211279",_asdf,0);
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="LineChart1.AddLinePointData(asdf, A, True)";
mostCurrent._linechart1._addlinepointdata /*String*/ (null,_asdf,_a,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="LineChart1.DrawChart";
mostCurrent._linechart1._drawchart /*String*/ (null);
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=3211288;
 //BA.debugLineNum = 3211288;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("23211288",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=3211292;
 //BA.debugLineNum = 3211292;BA.debugLine="End Sub";
return "";
}
public static String  _escribirhr_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "escribirhr_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "escribirhr_click", null));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub EscribirHR_Click";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="If CheckViewsEscribirHR <= 1 Then";
if (_checkviewsescribirhr()<=1) { 
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="If CheckViewsEscribirHR == 0 Then";
if (_checkviewsescribirhr()==0) { 
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="PanelEscribir1.Enabled = True";
mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="PanelEscribir1.Visible = True";
mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Else If CheckViewsEscribirHR == 1 Then";
if (_checkviewsescribirhr()==1) { 
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="PanelEscribir2.Enabled = True";
mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="PanelEscribir2.Visible = True";
mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}
;
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Log(\"ESCRIBIR HR\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22162699","ESCRIBIR HR",0);
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="Writer.WriteLine(\"Escritura\")";
_writer.WriteLine("Escritura");
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="End Sub";
return "";
}
public static void  _escribirhr_longclick() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "escribirhr_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "escribirhr_longclick", null); return;}
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
RDebugUtils.currentModule="controlador1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="If CheckViewsEscribirHR <=2 And CheckViewsEscribi";
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
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22228226","Eliminando Lectura",0);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("22228228",_loadedinfo,0);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="If LoadedInfo == \"\" Then";
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
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22228230","Sin Vistas",0);
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Escritura Ho";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Escritura HoldingRegisters?"),BA.ObjectToCharSequence("Escrituras HRs"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "controlador1", "escribirhr_longclick"), null);
this.state = 29;
return;
case 29:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Escritu";
_index = _loadedinfo.indexOf("Escritura");
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="If index <> -1 Then";
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
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Esc";
_after = _loadedinfo.replace("Escritura","");
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("22228241","DESPUES: "+_after,0);
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
RDebugUtils.currentLine=2228244;
 //BA.debugLineNum = 2228244;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
RDebugUtils.currentLine=2228246;
 //BA.debugLineNum = 2228246;BA.debugLine="PanelEscribir1.Enabled = False";
parent.mostCurrent._panelescribir1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228247;
 //BA.debugLineNum = 2228247;BA.debugLine="PanelEscribir1.Visible = False";
parent.mostCurrent._panelescribir1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228249;
 //BA.debugLineNum = 2228249;BA.debugLine="PanelEscribir2.Enabled = False";
parent.mostCurrent._panelescribir2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228250;
 //BA.debugLineNum = 2228250;BA.debugLine="PanelEscribir2.Visible = False";
parent.mostCurrent._panelescribir2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228253;
 //BA.debugLineNum = 2228253;BA.debugLine="Return";
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
RDebugUtils.currentLine=2228258;
 //BA.debugLineNum = 2228258;BA.debugLine="Log(CheckViewsEscribirHR)";
anywheresoftware.b4a.keywords.Common.LogImpl("22228258",BA.NumberToString(_checkviewsescribirhr()),0);
RDebugUtils.currentLine=2228259;
 //BA.debugLineNum = 2228259;BA.debugLine="If CheckViewsEscribirHR > 2 Then";
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
RDebugUtils.currentLine=2228260;
 //BA.debugLineNum = 2228260;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
RDebugUtils.currentLine=2228261;
 //BA.debugLineNum = 2228261;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("22228261",_loadedinfo,0);
RDebugUtils.currentLine=2228262;
 //BA.debugLineNum = 2228262;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Escritur";
_index = _loadedinfo.indexOf("Escritura");
RDebugUtils.currentLine=2228263;
 //BA.debugLineNum = 2228263;BA.debugLine="Log(index)";
anywheresoftware.b4a.keywords.Common.LogImpl("22228263",BA.NumberToString(_index),0);
RDebugUtils.currentLine=2228264;
 //BA.debugLineNum = 2228264;BA.debugLine="If index <> -1 Then";
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
RDebugUtils.currentLine=2228265;
 //BA.debugLineNum = 2228265;BA.debugLine="index = index + 1 ' Move past the last found i";
_index = (int) (_index+1);
RDebugUtils.currentLine=2228266;
 //BA.debugLineNum = 2228266;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
RDebugUtils.currentLine=2228267;
 //BA.debugLineNum = 2228267;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Escr";
_after = _loadedinfo.replace("Escritura","");
RDebugUtils.currentLine=2228268;
 //BA.debugLineNum = 2228268;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("22228268","DESPUES: "+_after,0);
RDebugUtils.currentLine=2228269;
 //BA.debugLineNum = 2228269;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
RDebugUtils.currentLine=2228271;
 //BA.debugLineNum = 2228271;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
RDebugUtils.currentLine=2228272;
 //BA.debugLineNum = 2228272;BA.debugLine="Return";
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
RDebugUtils.currentLine=2228276;
 //BA.debugLineNum = 2228276;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=2228279;
 //BA.debugLineNum = 2228279;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _loadcontrolador() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadcontrolador", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadcontrolador", null));}
String _loadedinfo = "";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub LoadControlador";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="If File.Exists(File.DirInternal, FileName1) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1)) { 
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("22883588",_loadedinfo,0);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If LoadedInfo == \"\" Then";
if ((_loadedinfo).equals("")) { 
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="ToastMessageShow(\"NINGUNA VISTA CREADA!\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("NINGUNA VISTA CREADA!"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Log(\"Creando Vistas!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22883592","Creando Vistas!",0);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="LeyendoVistas(LoadedInfo)";
_leyendovistas(_loadedinfo);
 };
 };
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="End Sub";
return "";
}
public static String  _graph_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "graph_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "graph_click", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Graph_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Log(\"Boton Graficador\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21572865","Boton Graficador",0);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Log(isPanelVisibleGraph)";
anywheresoftware.b4a.keywords.Common.LogImpl("21572866",BA.ObjectToString(_ispanelvisiblegraph),0);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="If isPanelVisibleGraph Then";
if (_ispanelvisiblegraph) { 
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="AnimationPanel(100, 550, pnlSlideGraph)";
_animationpanel((int) (100),(int) (550),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidegraph.getObject())));
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="isPanelVisibleGraph = False";
_ispanelvisiblegraph = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="pnlSlideGraph.Left = 550dip";
mostCurrent._pnlslidegraph.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (550)));
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="btnCreations.Visible = True";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="btnConfig.Visible = True";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="AnimationPanel(550, 100, pnlSlideGraph)";
_animationpanel((int) (550),(int) (100),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._pnlslidegraph.getObject())));
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="isPanelVisibleGraph = True";
_ispanelvisiblegraph = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="pnlSlideGraph.Left = 0dip";
mostCurrent._pnlslidegraph.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="Graph.BringToFront";
mostCurrent._graph.BringToFront();
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="btnCreations.Visible = False";
mostCurrent._btncreations.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1572885;
 //BA.debugLineNum = 1572885;BA.debugLine="btnConfig.Visible = False";
mostCurrent._btnconfig.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1572888;
 //BA.debugLineNum = 1572888;BA.debugLine="End Sub";
return "";
}
public static String  _hold_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hold_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hold_click", null));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub HOLD_Click";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="If CheckViewsHold <= 1 Then";
if (_checkviewshold()<=1) { 
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="If CheckViewsHold == 0 Then";
if (_checkviewshold()==0) { 
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="PanelHold1.Enabled = True";
mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="PanelHold1.Visible = True";
mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Else If CheckViewsHold == 1 Then";
if (_checkviewshold()==1) { 
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="PanelHold2.Enabled = True";
mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="PanelHold2.Visible = True";
mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}
;
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="Log(\"HOLD\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22424843","HOLD",0);
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="Writer.WriteLine(\"Hold\")";
_writer.WriteLine("Hold");
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="End Sub";
return "";
}
public static void  _hold_longclick() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hold_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "hold_longclick", null); return;}
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
RDebugUtils.currentModule="controlador1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If CheckViewsHold <=2 And CheckViewsHold > 0 Then";
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
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22490371","Eliminando Lectura",0);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("22490373",_loadedinfo,0);
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="If LoadedInfo == \"\" Then";
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
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22490375","Sin Vistas",0);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Acción OnOff";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Acción OnOff?"),BA.ObjectToCharSequence("APAGADO / ENCENDIDO"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "controlador1", "hold_longclick"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Hold\")";
_index = _loadedinfo.indexOf("Hold");
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="If index <> -1 Then";
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
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Hol";
_after = _loadedinfo.replace("Hold","");
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("22490386","DESPUES: "+_after,0);
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="PanelHold1.Enabled = False";
parent.mostCurrent._panelhold1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="PanelHold1.Visible = False";
parent.mostCurrent._panelhold1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="PanelHold2.Enabled = False";
parent.mostCurrent._panelhold2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="PanelHold2.Visible = False";
parent.mostCurrent._panelhold2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="Return";
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
RDebugUtils.currentLine=2490401;
 //BA.debugLineNum = 2490401;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=2490404;
 //BA.debugLineNum = 2490404;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _leerhr_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "leerhr_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "leerhr_click", null));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub LeerHR_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If CheckViewsLeerHR <=1 Then";
if (_checkviewsleerhr()<=1) { 
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="If CheckViewsLeerHR == 0 Then";
if (_checkviewsleerhr()==0) { 
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="PanelLeer1.Enabled = True";
mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="PanelLeer1.Visible = True";
mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Else If CheckViewsLeerHR == 1 Then";
if (_checkviewsleerhr()==1) { 
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="PanelLeer2.Enabled = True";
mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="PanelLeer2.Visible = True";
mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}
;
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Log(\"LEER HR\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22031627","LEER HR",0);
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="Writer.WriteLine(\"Lectura\")";
_writer.WriteLine("Lectura");
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="End Sub";
return "";
}
public static void  _leerhr_longclick() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "leerhr_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "leerhr_longclick", null); return;}
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
RDebugUtils.currentModule="controlador1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If CheckViewsLeerHR <=2 And CheckViewsLeerHR > 0";
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
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22097154","Eliminando Lectura",0);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("22097156",_loadedinfo,0);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="If LoadedInfo == \"\" Then";
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
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22097158","Sin Vistas",0);
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Lectura Hold";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Lectura HoldingRegisters?"),BA.ObjectToCharSequence("Lecturas HRs"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "controlador1", "leerhr_longclick"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Lectura";
_index = _loadedinfo.indexOf("Lectura");
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="If index <> -1 Then";
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
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Lec";
_after = _loadedinfo.replace("Lectura","");
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("22097169","DESPUES: "+_after,0);
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="PanelLeer1.Enabled = False";
parent.mostCurrent._panelleer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="PanelLeer1.Visible = False";
parent.mostCurrent._panelleer1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097177;
 //BA.debugLineNum = 2097177;BA.debugLine="PanelLeer2.Enabled = False";
parent.mostCurrent._panelleer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097178;
 //BA.debugLineNum = 2097178;BA.debugLine="PanelLeer2.Visible = False";
parent.mostCurrent._panelleer2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097181;
 //BA.debugLineNum = 2097181;BA.debugLine="Return";
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
RDebugUtils.currentLine=2097186;
 //BA.debugLineNum = 2097186;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097189;
 //BA.debugLineNum = 2097189;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _leyendovistas(String _vistas) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "leyendovistas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "leyendovistas", new Object[] {_vistas}));}
int _count1 = 0;
int _index1 = 0;
int _count2 = 0;
int _index2 = 0;
int _count3 = 0;
int _index3 = 0;
int _count4 = 0;
int _index4 = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub LeyendoVistas(Vistas As String)";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Log(Vistas)";
anywheresoftware.b4a.keywords.Common.LogImpl("22949122",_vistas,0);
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Dim count1 As Int = 0";
_count1 = (int) (0);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Dim index1 As Int = 0";
_index1 = (int) (0);
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Dim count2 As Int = 0";
_count2 = (int) (0);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Dim index2 As Int = 0";
_index2 = (int) (0);
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="Dim count3 As Int = 0";
_count3 = (int) (0);
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="Dim index3 As Int = 0";
_index3 = (int) (0);
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Dim count4 As Int = 0";
_count4 = (int) (0);
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Dim index4 As Int = 0";
_index4 = (int) (0);
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Do While index1 > -1";
while (_index1>-1) {
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="index1 = Vistas.IndexOf2(\"Lectura\", index1)";
_index1 = _vistas.indexOf("Lectura",_index1);
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="If index1 <> -1 Then";
if (_index1!=-1) { 
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="count1 = count1 + 1";
_count1 = (int) (_count1+1);
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
_index1 = (int) (_index1+1);
 };
 }
;
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="Do While index2 > -1";
while (_index2>-1) {
RDebugUtils.currentLine=2949145;
 //BA.debugLineNum = 2949145;BA.debugLine="index2 = Vistas.IndexOf2(\"Escritura\", index2)";
_index2 = _vistas.indexOf("Escritura",_index2);
RDebugUtils.currentLine=2949146;
 //BA.debugLineNum = 2949146;BA.debugLine="If index2 <> -1 Then";
if (_index2!=-1) { 
RDebugUtils.currentLine=2949147;
 //BA.debugLineNum = 2949147;BA.debugLine="count2 = count2 + 1";
_count2 = (int) (_count2+1);
RDebugUtils.currentLine=2949148;
 //BA.debugLineNum = 2949148;BA.debugLine="index2 = index2 + 1 ' Move past the last found";
_index2 = (int) (_index2+1);
 };
 }
;
RDebugUtils.currentLine=2949152;
 //BA.debugLineNum = 2949152;BA.debugLine="Do While index3 > -1";
while (_index3>-1) {
RDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="index3 = Vistas.IndexOf2(\"OnOff\", index3)";
_index3 = _vistas.indexOf("OnOff",_index3);
RDebugUtils.currentLine=2949154;
 //BA.debugLineNum = 2949154;BA.debugLine="If index3 <> -1 Then";
if (_index3!=-1) { 
RDebugUtils.currentLine=2949155;
 //BA.debugLineNum = 2949155;BA.debugLine="count3 = count3 + 1";
_count3 = (int) (_count3+1);
RDebugUtils.currentLine=2949156;
 //BA.debugLineNum = 2949156;BA.debugLine="index3 = index3 + 1 ' Move past the last found";
_index3 = (int) (_index3+1);
 };
 }
;
RDebugUtils.currentLine=2949160;
 //BA.debugLineNum = 2949160;BA.debugLine="Do While index4 > -1";
while (_index4>-1) {
RDebugUtils.currentLine=2949161;
 //BA.debugLineNum = 2949161;BA.debugLine="index4 = Vistas.IndexOf2(\"Hold\", index4)";
_index4 = _vistas.indexOf("Hold",_index4);
RDebugUtils.currentLine=2949162;
 //BA.debugLineNum = 2949162;BA.debugLine="If index4 <> -1 Then";
if (_index4!=-1) { 
RDebugUtils.currentLine=2949163;
 //BA.debugLineNum = 2949163;BA.debugLine="count4 = count4 + 1";
_count4 = (int) (_count4+1);
RDebugUtils.currentLine=2949164;
 //BA.debugLineNum = 2949164;BA.debugLine="index4 = index4 + 1 ' Move past the last found";
_index4 = (int) (_index4+1);
 };
 }
;
RDebugUtils.currentLine=2949168;
 //BA.debugLineNum = 2949168;BA.debugLine="Log(\"The word 'LeerHR' appears: \" & count1 & \" ti";
anywheresoftware.b4a.keywords.Common.LogImpl("22949168","The word 'LeerHR' appears: "+BA.NumberToString(_count1)+" times.",0);
RDebugUtils.currentLine=2949169;
 //BA.debugLineNum = 2949169;BA.debugLine="Log(\"The word 'ESCRIBIR HR' appears: \" & count2 &";
anywheresoftware.b4a.keywords.Common.LogImpl("22949169","The word 'ESCRIBIR HR' appears: "+BA.NumberToString(_count2)+" times.",0);
RDebugUtils.currentLine=2949170;
 //BA.debugLineNum = 2949170;BA.debugLine="Log(\"The word 'ON OFF' appears: \" & count3 & \" ti";
anywheresoftware.b4a.keywords.Common.LogImpl("22949170","The word 'ON OFF' appears: "+BA.NumberToString(_count3)+" times.",0);
RDebugUtils.currentLine=2949171;
 //BA.debugLineNum = 2949171;BA.debugLine="Log(\"The word 'HOLD' appears: \" & count4 & \" time";
anywheresoftware.b4a.keywords.Common.LogImpl("22949171","The word 'HOLD' appears: "+BA.NumberToString(_count4)+" times.",0);
RDebugUtils.currentLine=2949172;
 //BA.debugLineNum = 2949172;BA.debugLine="LeerHRViews = count1";
_leerhrviews = _count1;
RDebugUtils.currentLine=2949173;
 //BA.debugLineNum = 2949173;BA.debugLine="EscribirHRViews = count2";
_escribirhrviews = _count2;
RDebugUtils.currentLine=2949174;
 //BA.debugLineNum = 2949174;BA.debugLine="OnOffViews = count3";
_onoffviews = _count3;
RDebugUtils.currentLine=2949175;
 //BA.debugLineNum = 2949175;BA.debugLine="HoldViews = count4";
_holdviews = _count4;
RDebugUtils.currentLine=2949176;
 //BA.debugLineNum = 2949176;BA.debugLine="TotalViews = count1 + count2 + count3 + count4";
_totalviews = (int) (_count1+_count2+_count3+_count4);
RDebugUtils.currentLine=2949177;
 //BA.debugLineNum = 2949177;BA.debugLine="Log(\"TOTAL VIEWS!!: \" & TotalViews)";
anywheresoftware.b4a.keywords.Common.LogImpl("22949177","TOTAL VIEWS!!: "+BA.NumberToString(_totalviews),0);
RDebugUtils.currentLine=2949179;
 //BA.debugLineNum = 2949179;BA.debugLine="If count1 > 0 Or count2 > 0 Or count3 > 0 Or coun";
if (_count1>0 || _count2>0 || _count3>0 || _count4>0) { 
RDebugUtils.currentLine=2949180;
 //BA.debugLineNum = 2949180;BA.debugLine="Log(\"Creando!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22949180","Creando!",0);
RDebugUtils.currentLine=2949181;
 //BA.debugLineNum = 2949181;BA.debugLine="CreandoVistas(count1, count2, count3, count4)";
_creandovistas(_count1,_count2,_count3,_count4);
 }else {
RDebugUtils.currentLine=2949183;
 //BA.debugLineNum = 2949183;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22949183","Sin Vistas",0);
 };
RDebugUtils.currentLine=2949186;
 //BA.debugLineNum = 2949186;BA.debugLine="End Sub";
return "";
}
public static String  _onoff_click() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "onoff_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "onoff_click", null));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub ONOFF_Click";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If CheckViewsOnOff <= 1 Then";
if (_checkviewsonoff()<=1) { 
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="If CheckViewsOnOff == 0 Then";
if (_checkviewsonoff()==0) { 
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="PanelOnOff1.Enabled = True";
mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="PanelOnOff1.Visible = True";
mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Else If CheckViewsOnOff == 1 Then";
if (_checkviewsonoff()==1) { 
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="PanelOnOff2.Enabled = True";
mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="PanelOnOff2.Visible = True";
mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }}
;
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Log(\"ON OFF\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22293772","ON OFF",0);
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename1,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Writer.WriteLine(\"OnOff\")";
_writer.WriteLine("OnOff");
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="Writer.Close";
_writer.Close();
 }else {
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="End Sub";
return "";
}
public static void  _onoff_longclick() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "onoff_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "onoff_longclick", null); return;}
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
RDebugUtils.currentModule="controlador1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If CheckViewsOnOff <=2 And CheckViewsOnOff > 0 Th";
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
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Log(\"Eliminando Lectura\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22359299","Eliminando Lectura",0);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
_loadedinfo = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Log(LoadedInfo)";
anywheresoftware.b4a.keywords.Common.LogImpl("22359301",_loadedinfo,0);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="If LoadedInfo == \"\" Then";
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
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Log(\"Sin Vistas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22359303","Sin Vistas",0);
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Acción OnOff";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminar vistas para Acción OnOff?"),BA.ObjectToCharSequence("APAGADO / ENCENDIDO"),"SI","Cancel","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "controlador1", "onoff_longclick"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"OnOff\")";
_index = _loadedinfo.indexOf("OnOff");
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="If index <> -1 Then";
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
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="index = index + 1 ' Move past the last found";
_index = (int) (_index+1);
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="Dim textToSave As String = \"\"";
_texttosave = "";
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"OnO";
_after = _loadedinfo.replace("OnOff","");
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="Log(\"DESPUES: \"&after)";
anywheresoftware.b4a.keywords.Common.LogImpl("22359314","DESPUES: "+_after,0);
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_texttosave);
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent._filename1,_after);
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="PanelOnOff1.Enabled = False";
parent.mostCurrent._panelonoff1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359320;
 //BA.debugLineNum = 2359320;BA.debugLine="PanelOnOff1.Visible = False";
parent.mostCurrent._panelonoff1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="PanelOnOff2.Enabled = False";
parent.mostCurrent._panelonoff2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="PanelOnOff2.Visible = False";
parent.mostCurrent._panelonoff2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359326;
 //BA.debugLineNum = 2359326;BA.debugLine="Return";
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
RDebugUtils.currentLine=2359331;
 //BA.debugLineNum = 2359331;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=2359334;
 //BA.debugLineNum = 2359334;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _panelescribir1_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelescribir1_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelescribir1_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub PanelEscribir1_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="draggingEscribir1 = True";
_draggingescribir1 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="xOffsetEscribir1= X";
_xoffsetescribir1 = _x;
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="yOffsetEscribir1 = Y";
_yoffsetescribir1 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="If draggingEscribir1 Then";
if (_draggingescribir1) { 
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Dim newX As Float = PanelEscribir1.Left + (X -";
_newx = (float) (mostCurrent._panelescribir1.getLeft()+(_x-_xoffsetescribir1));
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Dim newY As Float = PanelEscribir1.Top + (Y -";
_newy = (float) (mostCurrent._panelescribir1.getTop()+(_y-_yoffsetescribir1));
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="PanelEscribir1.SetLayout(newX, newY, PanelEscr";
mostCurrent._panelescribir1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelescribir1.getWidth(),mostCurrent._panelescribir1.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="draggingEscribir1 = False";
_draggingescribir1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="End Sub";
return "";
}
public static String  _panelescribir2_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelescribir2_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelescribir2_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub PanelEscribir2_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="draggingEscribir2 = True";
_draggingescribir2 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="xOffsetEscribir2 = X";
_xoffsetescribir2 = _x;
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="yOffsetEscribir2 = Y";
_yoffsetescribir2 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="If draggingEscribir2 Then";
if (_draggingescribir2) { 
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Dim newX As Float = PanelEscribir2.Left + (X -";
_newx = (float) (mostCurrent._panelescribir2.getLeft()+(_x-_xoffsetescribir2));
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Dim newY As Float = PanelEscribir2.Top + (Y -";
_newy = (float) (mostCurrent._panelescribir2.getTop()+(_y-_yoffsetescribir2));
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="PanelEscribir2.SetLayout(newX, newY, PanelEscr";
mostCurrent._panelescribir2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelescribir2.getWidth(),mostCurrent._panelescribir2.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="draggingEscribir2 = False";
_draggingescribir2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="End Sub";
return "";
}
public static String  _panelhold1_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelhold1_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelhold1_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub PanelHold1_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="draggingHold1 = True";
_dragginghold1 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="xOffsetHold1 = X";
_xoffsethold1 = _x;
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="yOffsetHold1 = Y";
_yoffsethold1 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="If draggingHold1 Then";
if (_dragginghold1) { 
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Dim newX As Float = PanelHold1.Left + (X - xOf";
_newx = (float) (mostCurrent._panelhold1.getLeft()+(_x-_xoffsethold1));
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Dim newY As Float = PanelHold1.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelhold1.getTop()+(_y-_yoffsethold1));
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="PanelHold1.SetLayout(newX, newY, PanelHold1.Wi";
mostCurrent._panelhold1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelhold1.getWidth(),mostCurrent._panelhold1.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="draggingHold1 = False";
_dragginghold1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="End Sub";
return "";
}
public static String  _panelhold2_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelhold2_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelhold2_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub PanelHold2_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="draggingHold2 = True";
_dragginghold2 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="xOffsetHold2 = X";
_xoffsethold2 = _x;
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="yOffsetHold2 = Y";
_yoffsethold2 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="If draggingHold2 Then";
if (_dragginghold2) { 
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Dim newX As Float = PanelHold2.Left + (X - xOf";
_newx = (float) (mostCurrent._panelhold2.getLeft()+(_x-_xoffsethold2));
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Dim newY As Float = PanelHold2.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelhold2.getTop()+(_y-_yoffsethold2));
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="PanelHold2.SetLayout(newX, newY, PanelHold2.Wi";
mostCurrent._panelhold2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelhold2.getWidth(),mostCurrent._panelhold2.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="draggingHold2 = False";
_dragginghold2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="End Sub";
return "";
}
public static String  _panelleer1_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelleer1_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelleer1_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub PanelLeer1_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="draggingLeer1 = True";
_draggingleer1 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="xOffsetLeer1 = X";
_xoffsetleer1 = _x;
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="yOffsetLeer1 = Y";
_yoffsetleer1 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="If draggingLeer1 Then";
if (_draggingleer1) { 
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim newX As Float = PanelLeer1.Left + (X - xOf";
_newx = (float) (mostCurrent._panelleer1.getLeft()+(_x-_xoffsetleer1));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Dim newY As Float = PanelLeer1.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelleer1.getTop()+(_y-_yoffsetleer1));
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="PanelLeer1.SetLayout(newX, newY, PanelLeer1.Wi";
mostCurrent._panelleer1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelleer1.getWidth(),mostCurrent._panelleer1.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="draggingLeer1 = False";
_draggingleer1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="End Sub";
return "";
}
public static String  _panelleer2_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelleer2_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelleer2_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub PanelLeer2_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="draggingLeer2 = True";
_draggingleer2 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="xOffsetLeer2 = X";
_xoffsetleer2 = _x;
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="yOffsetLeer2 = Y";
_yoffsetleer2 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="If draggingLeer2 Then";
if (_draggingleer2) { 
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dim newX As Float = PanelLeer2.Left + (X - xOf";
_newx = (float) (mostCurrent._panelleer2.getLeft()+(_x-_xoffsetleer2));
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Dim newY As Float = PanelLeer2.Top + (Y - yOff";
_newy = (float) (mostCurrent._panelleer2.getTop()+(_y-_yoffsetleer2));
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="PanelLeer2.SetLayout(newX, newY, PanelLeer2.Wi";
mostCurrent._panelleer2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelleer2.getWidth(),mostCurrent._panelleer2.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="draggingLeer2 = False";
_draggingleer2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="End Sub";
return "";
}
public static String  _panelonoff1_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelonoff1_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelonoff1_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub PanelOnOff1_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="draggingOnOff1 = True";
_draggingonoff1 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="xOffsetOnOff1 = X";
_xoffsetonoff1 = _x;
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="yOffsetOnOff1 = Y";
_yoffsetonoff1 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="If draggingOnOff1 Then";
if (_draggingonoff1) { 
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Dim newX As Float = PanelOnOff1.Left + (X - xO";
_newx = (float) (mostCurrent._panelonoff1.getLeft()+(_x-_xoffsetonoff1));
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Dim newY As Float = PanelOnOff1.Top + (Y - yOf";
_newy = (float) (mostCurrent._panelonoff1.getTop()+(_y-_yoffsetonoff1));
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="PanelOnOff1.SetLayout(newX, newY, PanelOnOff1.";
mostCurrent._panelonoff1.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelonoff1.getWidth(),mostCurrent._panelonoff1.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="draggingOnOff1 = False";
_draggingonoff1 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="End Sub";
return "";
}
public static String  _panelonoff2_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelonoff2_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelonoff2_touch", new Object[] {_action,_x,_y}));}
float _newx = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub PanelOnOff2_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,mostCurrent._activity.ACTION_DOWN,mostCurrent._activity.ACTION_MOVE,mostCurrent._activity.ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="draggingOnOff2 = True";
_draggingonoff2 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="xOffsetOnOff2 = X";
_xoffsetonoff2 = _x;
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="yOffsetOnOff2 = Y";
_yoffsetonoff2 = _y;
 break; }
case 1: {
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="If draggingOnOff2 Then";
if (_draggingonoff2) { 
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Dim newX As Float = PanelOnOff2.Left + (X - xO";
_newx = (float) (mostCurrent._panelonoff2.getLeft()+(_x-_xoffsetonoff2));
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Dim newY As Float = PanelOnOff2.Top + (Y - yOf";
_newy = (float) (mostCurrent._panelonoff2.getTop()+(_y-_yoffsetonoff2));
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="PanelOnOff2.SetLayout(newX, newY, PanelOnOff2.";
mostCurrent._panelonoff2.SetLayout((int) (_newx),(int) (_newy),mostCurrent._panelonoff2.getWidth(),mostCurrent._panelonoff2.getHeight());
 };
 break; }
case 2: {
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="draggingOnOff2 = False";
_draggingonoff2 = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="controlador1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer1_tick", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Log(\"Timer ticked!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("23145729","Timer ticked!",0);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="DoAllStuff";
_doallstuff();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return "";
}
}