
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

public class controlador1 implements IRemote{
	public static controlador1 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public controlador1() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("controlador1"), "b4a.example.controlador1");
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
		pcBA = new PCBA(this, controlador1.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _filename1 = RemoteObject.createImmutable("");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _btnconfig = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnlslidingconfig = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ispanelvisibleconfig = RemoteObject.createImmutable(false);
public static RemoteObject _edittextip = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextport = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _connectplc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncreations = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnlslidingcreations = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ispanelvisiblecreations = RemoteObject.createImmutable(false);
public static RemoteObject _labelcreations = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnleerhr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnescribirhr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnonoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnhold = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _leerhrviews = RemoteObject.createImmutable(0);
public static RemoteObject _escribirhrviews = RemoteObject.createImmutable(0);
public static RemoteObject _onoffviews = RemoteObject.createImmutable(0);
public static RemoteObject _holdviews = RemoteObject.createImmutable(0);
public static RemoteObject _totalviews = RemoteObject.createImmutable(0);
public static RemoteObject _panelleer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsetleer1 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsetleer1 = RemoteObject.createImmutable(0f);
public static RemoteObject _draggingleer1 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _direccion1res = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _panelleer2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsetleer2 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsetleer2 = RemoteObject.createImmutable(0f);
public static RemoteObject _draggingleer2 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _direccion2res = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _panelescribir1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsetescribir1 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsetescribir1 = RemoteObject.createImmutable(0f);
public static RemoteObject _draggingescribir1 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion1escribir = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _direccion1escribirvalor = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _direccion1escribirbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelescribir2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsetescribir2 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsetescribir2 = RemoteObject.createImmutable(0f);
public static RemoteObject _draggingescribir2 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion2escribir = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _direccion2escribirvalor = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _direccion2escribirbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelonoff1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsetonoff1 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsetonoff1 = RemoteObject.createImmutable(0f);
public static RemoteObject _draggingonoff1 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion1onoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn1onoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelonoff2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsetonoff2 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsetonoff2 = RemoteObject.createImmutable(0f);
public static RemoteObject _draggingonoff2 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion2onoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn2onoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelhold1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsethold1 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsethold1 = RemoteObject.createImmutable(0f);
public static RemoteObject _dragginghold1 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion1hold = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn1hold = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelhold2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xoffsethold2 = RemoteObject.createImmutable(0f);
public static RemoteObject _yoffsethold2 = RemoteObject.createImmutable(0f);
public static RemoteObject _dragginghold2 = RemoteObject.createImmutable(false);
public static RemoteObject _direccion2hold = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn2hold = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _modbusclient = RemoteObject.declareNull("b4a.example.modbustcp");
public static RemoteObject _comparameters = RemoteObject.declareNull("b4a.example.modbusservice._connectionparams");
public static RemoteObject _modbusstate = RemoteObject.createImmutable(false);
public static RemoteObject _graph = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnlslidegraph = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ispanelvisiblegraph = RemoteObject.createImmutable(false);
public static RemoteObject _linechart1 = RemoteObject.declareNull("b4a.example.xchart");
public static RemoteObject _conversion = RemoteObject.declareNull("b4a.example.conversion");
public static RemoteObject _modbusservice = RemoteObject.declareNull("b4a.example.modbusservice");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.controlador2 _controlador2 = null;
public static b4a.example.controlador3 _controlador3 = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",controlador1.mostCurrent._activity,"BTN1Hold",controlador1.mostCurrent._btn1hold,"BTN1OnOff",controlador1.mostCurrent._btn1onoff,"BTN2Hold",controlador1.mostCurrent._btn2hold,"BTN2OnOff",controlador1.mostCurrent._btn2onoff,"btnConfig",controlador1.mostCurrent._btnconfig,"btnCreations",controlador1.mostCurrent._btncreations,"btnEscribirHR",controlador1.mostCurrent._btnescribirhr,"btnHOLD",controlador1.mostCurrent._btnhold,"btnLeerHR",controlador1.mostCurrent._btnleerhr,"btnONOFF",controlador1.mostCurrent._btnonoff,"COMParameters",controlador1.mostCurrent._comparameters,"ConnectPLC",controlador1.mostCurrent._connectplc,"Controlador2",Debug.moduleToString(b4a.example.controlador2.class),"Controlador3",Debug.moduleToString(b4a.example.controlador3.class),"Conversion",controlador1.mostCurrent._conversion,"DateUtils",controlador1.mostCurrent._dateutils,"Direccion1",controlador1.mostCurrent._direccion1,"Direccion1Escribir",controlador1.mostCurrent._direccion1escribir,"Direccion1EscribirBTN",controlador1.mostCurrent._direccion1escribirbtn,"Direccion1EscribirValor",controlador1.mostCurrent._direccion1escribirvalor,"Direccion1Hold",controlador1.mostCurrent._direccion1hold,"Direccion1OnOff",controlador1.mostCurrent._direccion1onoff,"Direccion1Res",controlador1.mostCurrent._direccion1res,"Direccion2",controlador1.mostCurrent._direccion2,"Direccion2Escribir",controlador1.mostCurrent._direccion2escribir,"Direccion2EscribirBTN",controlador1.mostCurrent._direccion2escribirbtn,"Direccion2EscribirValor",controlador1.mostCurrent._direccion2escribirvalor,"Direccion2Hold",controlador1.mostCurrent._direccion2hold,"Direccion2OnOff",controlador1.mostCurrent._direccion2onoff,"Direccion2Res",controlador1.mostCurrent._direccion2res,"draggingEscribir1",controlador1._draggingescribir1,"draggingEscribir2",controlador1._draggingescribir2,"draggingHold1",controlador1._dragginghold1,"draggingHold2",controlador1._dragginghold2,"draggingLeer1",controlador1._draggingleer1,"draggingLeer2",controlador1._draggingleer2,"draggingOnOff1",controlador1._draggingonoff1,"draggingOnOff2",controlador1._draggingonoff2,"EditTextIP",controlador1.mostCurrent._edittextip,"EditTextPort",controlador1.mostCurrent._edittextport,"EscribirHRViews",controlador1._escribirhrviews,"FileName1",controlador1._filename1,"Graph",controlador1.mostCurrent._graph,"HoldViews",controlador1._holdviews,"isPanelVisibleConfig",controlador1._ispanelvisibleconfig,"isPanelVisibleCreations",controlador1._ispanelvisiblecreations,"isPanelVisibleGraph",controlador1._ispanelvisiblegraph,"LabelCreations",controlador1.mostCurrent._labelcreations,"LeerHRViews",controlador1._leerhrviews,"LineChart1",controlador1.mostCurrent._linechart1,"Main",Debug.moduleToString(b4a.example.main.class),"ModbusClient",controlador1.mostCurrent._modbusclient,"ModbusService",controlador1.mostCurrent._modbusservice,"ModbusState",controlador1._modbusstate,"OnOffViews",controlador1._onoffviews,"PanelEscribir1",controlador1.mostCurrent._panelescribir1,"PanelEscribir2",controlador1.mostCurrent._panelescribir2,"PanelHold1",controlador1.mostCurrent._panelhold1,"PanelHold2",controlador1.mostCurrent._panelhold2,"PanelLeer1",controlador1.mostCurrent._panelleer1,"PanelLeer2",controlador1.mostCurrent._panelleer2,"PanelOnOff1",controlador1.mostCurrent._panelonoff1,"PanelOnOff2",controlador1.mostCurrent._panelonoff2,"pnlSlideGraph",controlador1.mostCurrent._pnlslidegraph,"pnlSlidingConfig",controlador1.mostCurrent._pnlslidingconfig,"pnlSlidingCreations",controlador1.mostCurrent._pnlslidingcreations,"Starter",Debug.moduleToString(b4a.example.starter.class),"Timer1",controlador1._timer1,"TotalViews",controlador1._totalviews,"xOffsetEscribir1",controlador1._xoffsetescribir1,"xOffsetEscribir2",controlador1._xoffsetescribir2,"xOffsetHold1",controlador1._xoffsethold1,"xOffsetHold2",controlador1._xoffsethold2,"xOffsetLeer1",controlador1._xoffsetleer1,"xOffsetLeer2",controlador1._xoffsetleer2,"xOffsetOnOff1",controlador1._xoffsetonoff1,"xOffsetOnOff2",controlador1._xoffsetonoff2,"yOffsetEscribir1",controlador1._yoffsetescribir1,"yOffsetEscribir2",controlador1._yoffsetescribir2,"yOffsetHold1",controlador1._yoffsethold1,"yOffsetHold2",controlador1._yoffsethold2,"yOffsetLeer1",controlador1._yoffsetleer1,"yOffsetLeer2",controlador1._yoffsetleer2,"yOffsetOnOff1",controlador1._yoffsetonoff1,"yOffsetOnOff2",controlador1._yoffsetonoff2};
}
}