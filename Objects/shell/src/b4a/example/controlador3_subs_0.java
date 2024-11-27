package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class controlador3_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (controlador3) ","controlador3",4,controlador3.mostCurrent.activityBA,controlador3.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.controlador3.remoteMe.runUserSub(false, "controlador3","activity_create", _firsttime);}
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
		Debug.PushSubsStack("Activity_KeyPress (controlador3) ","controlador3",4,controlador3.mostCurrent.activityBA,controlador3.mostCurrent,33);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.controlador3.remoteMe.runUserSub(false, "controlador3","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, controlador3.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 35;BA.debugLine="Log(\"BACK PRESSED\")";
Debug.ShouldStop(4);
controlador3.mostCurrent.__c.runVoidMethod ("LogImpl","23997698",RemoteObject.createImmutable("BACK PRESSED"),0);
 BA.debugLineNum = 36;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
controlador3.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 37;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(16);
controlador3.mostCurrent.__c.runVoidMethod ("StartActivity",controlador3.processBA,(Object)((controlador3.mostCurrent._main.getObject())));
 };
 BA.debugLineNum = 39;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return controlador3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (controlador3) ","controlador3",4,controlador3.mostCurrent.activityBA,controlador3.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.controlador3.remoteMe.runUserSub(false, "controlador3","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (controlador3) ","controlador3",4,controlador3.mostCurrent.activityBA,controlador3.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.controlador3.remoteMe.runUserSub(false, "controlador3","activity_resume");}
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