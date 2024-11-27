package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class controlador2_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (controlador2) ","controlador2",3,controlador2.mostCurrent.activityBA,controlador2.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.controlador2.remoteMe.runUserSub(false, "controlador2","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (controlador2) ","controlador2",3,controlador2.mostCurrent.activityBA,controlador2.mostCurrent,32);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.controlador2.remoteMe.runUserSub(false, "controlador2","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, controlador2.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 34;BA.debugLine="Log(\"BACK PRESSED\")";
Debug.ShouldStop(2);
controlador2.mostCurrent.__c.runVoidMethod ("LogImpl","23604482",RemoteObject.createImmutable("BACK PRESSED"),0);
 BA.debugLineNum = 35;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
controlador2.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 36;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(8);
controlador2.mostCurrent.__c.runVoidMethod ("StartActivity",controlador2.processBA,(Object)((controlador2.mostCurrent._main.getObject())));
 };
 BA.debugLineNum = 38;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return controlador2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (controlador2) ","controlador2",3,controlador2.mostCurrent.activityBA,controlador2.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.controlador2.remoteMe.runUserSub(false, "controlador2","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (controlador2) ","controlador2",3,controlador2.mostCurrent.activityBA,controlador2.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.controlador2.remoteMe.runUserSub(false, "controlador2","activity_resume");}
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}