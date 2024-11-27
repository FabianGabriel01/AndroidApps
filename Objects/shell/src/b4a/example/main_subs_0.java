package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _name = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(64);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="ListControllers.Initialize(\"ListControllers\")";
Debug.ShouldStop(512);
main.mostCurrent._listcontrollers.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ListControllers")));
 BA.debugLineNum = 43;BA.debugLine="ListControllers.Color = Colors.DarkGray";
Debug.ShouldStop(1024);
main.mostCurrent._listcontrollers.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 44;BA.debugLine="ListControllers.FastScrollEnabled = True";
Debug.ShouldStop(2048);
main.mostCurrent._listcontrollers.runMethod(true,"setFastScrollEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="InfoDCA.Initialize(\"InfoDCA\")";
Debug.ShouldStop(8192);
main.mostCurrent._infodca.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("InfoDCA")));
 BA.debugLineNum = 47;BA.debugLine="InfoDCA.Text = \"CONTROLADOR DE PLC ® DESARROLLADO";
Debug.ShouldStop(16384);
main.mostCurrent._infodca.runMethod(true,"setText",BA.ObjectToCharSequence("CONTROLADOR DE PLC ® DESARROLLADO DENTRO DE LAS INSTALACIONES DE DCA"));
 BA.debugLineNum = 48;BA.debugLine="InfoDCA.TextColor = Colors.White";
Debug.ShouldStop(32768);
main.mostCurrent._infodca.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="ListC = Array As String(\"Controlador1\", \"Controla";
Debug.ShouldStop(131072);
main.mostCurrent._listc = RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("Controlador1"),BA.ObjectToString("Controlador2"),BA.ObjectToString("Controlador3"),BA.ObjectToString("Controlador4"),BA.ObjectToString("Controlador5"),BA.ObjectToString("Controlador6"),BA.ObjectToString("Controlador7"),BA.ObjectToString("Controlador8"),BA.ObjectToString("Controlador9"),RemoteObject.createImmutable("Controlador10")});
 BA.debugLineNum = 52;BA.debugLine="For Each Name As String In ListC";
Debug.ShouldStop(524288);
{
final RemoteObject group9 = main.mostCurrent._listc;
final int groupLen9 = group9.getField(true,"length").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_name = group9.getArrayElement(true,RemoteObject.createImmutable(index9));Debug.locals.put("Name", _name);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 53;BA.debugLine="ListControllers.AddTwoLines(Name, \"Controlador\")";
Debug.ShouldStop(1048576);
main.mostCurrent._listcontrollers.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(_name)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Controlador"))));
 }
}Debug.locals.put("Name", _name);
;
 BA.debugLineNum = 56;BA.debugLine="Activity.AddView(ListControllers, 0%x,0%y, 100%x,";
Debug.ShouldStop(8388608);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._listcontrollers.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 490)))));
 BA.debugLineNum = 57;BA.debugLine="Activity.AddView(InfoDCA, 25%x, 70%y, 70%x, 100di";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._infodca.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,149);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 149;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,144);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 144;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="r.CheckAndRequest(\"android.permission.WRITE_EXTER";
Debug.ShouldStop(65536);
main.mostCurrent._r.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(RemoteObject.createImmutable("android.permission.WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 146;BA.debugLine="r.CheckAndRequest(\"android.permission.READ_EXTERN";
Debug.ShouldStop(131072);
main.mostCurrent._r.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(RemoteObject.createImmutable("android.permission.READ_EXTERNAL_STORAGE")));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 153;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(33554432);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Dim ListControllers As ListView";
main.mostCurrent._listcontrollers = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim ListC() As String";
main.mostCurrent._listc = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 28;BA.debugLine="Dim InfoDCA As Label";
main.mostCurrent._infodca = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnSave As Button";
main.mostCurrent._btnsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private btnLoad As Button";
main.mostCurrent._btnload = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private r As RuntimePermissions";
main.mostCurrent._r = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listcontrollers_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListControllers_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,157);
if (RapidSub.canDelegate("listcontrollers_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","listcontrollers_itemclick", _position, _value);}
RemoteObject _item = RemoteObject.declareNull("Object");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 157;BA.debugLine="Private Sub ListControllers_ItemClick (Position As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="Log(Value.As(String))";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2393218",(BA.ObjectToString(_value)),0);
 BA.debugLineNum = 160;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 161;BA.debugLine="For Each Item In ListC";
Debug.ShouldStop(1);
{
final RemoteObject group3 = main.mostCurrent._listc;
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = (group3.getArrayElement(true,RemoteObject.createImmutable(index3)));Debug.locals.put("Item", _item);
Debug.locals.put("Item", _item);
 BA.debugLineNum = 162;BA.debugLine="If Item == Value.As(String) Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_item,((BA.ObjectToString(_value))))) { 
 BA.debugLineNum = 163;BA.debugLine="Log(\"Existe\")";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2393222",RemoteObject.createImmutable("Existe"),0);
 BA.debugLineNum = 164;BA.debugLine="StartActivity(Value)";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)(_value));
 BA.debugLineNum = 165;BA.debugLine="Return";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 167;BA.debugLine="Log(\"No Existe\")";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2393226",RemoteObject.createImmutable("No Existe"),0);
 };
 }
}Debug.locals.put("Item", _item);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e13.toString()); BA.debugLineNum = 171;BA.debugLine="Log(\"Actividad Inexistente\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2393230",RemoteObject.createImmutable("Actividad Inexistente"),0);
 BA.debugLineNum = 172;BA.debugLine="ToastMessageShow(\"Actividad Inexistente\", True)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Actividad Inexistente")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
controlador1_subs_0._process_globals();
controlador2_subs_0._process_globals();
controlador3_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
controlador1.myClass = BA.getDeviceClass ("b4a.example.controlador1");
controlador2.myClass = BA.getDeviceClass ("b4a.example.controlador2");
controlador3.myClass = BA.getDeviceClass ("b4a.example.controlador3");
xchart.myClass = BA.getDeviceClass ("b4a.example.xchart");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}