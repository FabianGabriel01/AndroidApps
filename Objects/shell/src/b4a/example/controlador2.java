
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class controlador2 implements IRemote{
	public static controlador2 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public controlador2() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("controlador2"), "b4a.example.controlador2");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, controlador2.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _conversion = RemoteObject.declareNull("b4a.example.conversion");
public static RemoteObject _modbusservice = RemoteObject.declareNull("b4a.example.modbusservice");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.controlador1 _controlador1 = null;
public static b4a.example.controlador3 _controlador3 = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",controlador2.mostCurrent._activity,"Controlador1",Debug.moduleToString(b4a.example.controlador1.class),"Controlador3",Debug.moduleToString(b4a.example.controlador3.class),"Conversion",controlador2.mostCurrent._conversion,"DateUtils",controlador2.mostCurrent._dateutils,"Main",Debug.moduleToString(b4a.example.main.class),"ModbusService",controlador2.mostCurrent._modbusservice,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}