
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xchart {
    public static RemoteObject myClass;
	public xchart() {
	}
    public static PCBA staticBA = new PCBA(null, xchart.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _longclicktimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _xpnlgraph = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xcvsgraph = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _xpnlvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xcvsvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _xpnlcursor = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xcvscursor = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _xpnlzoombar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xcvszoombar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _pthgrid = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
public static RemoteObject _nbmaxdifferentscales = RemoteObject.createImmutable(0);
public static RemoteObject _scale = null;
public static RemoteObject _scalelog = null;
public static RemoteObject _sx = RemoteObject.createImmutable(0);
public static RemoteObject _sy = null;
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _points = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _hlines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _bubbles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _graph = RemoteObject.declareNull("b4a.example.xchart._chartdata");
public static RemoteObject _texts = RemoteObject.declareNull("b4a.example.xchart._textdata");
public static RemoteObject _legend = RemoteObject.declareNull("b4a.example.xchart._legenddata");
public static RemoteObject _values = RemoteObject.declareNull("b4a.example.xchart._valuesdata");
public static RemoteObject _zoom = RemoteObject.declareNull("b4a.example.xchart._zoombardata");
public static RemoteObject _bar = RemoteObject.declareNull("b4a.example.xchart._bardata");
public static RemoteObject _minmaxmeanvalues = null;
public static RemoteObject _bmvnf = RemoteObject.declareNull("b4a.example.xchart._numberformats");
public static RemoteObject _bmvnfused = RemoteObject.createImmutable(false);
public static RemoteObject _barwidth0 = RemoteObject.createImmutable(false);
public static RemoteObject _mpiepercentagenbfractions = RemoteObject.createImmutable(0);
public static RemoteObject _mkeepdisplayvalues = RemoteObject.createImmutable("");
public static RemoteObject _mhchartsxscaleontop = RemoteObject.createImmutable(false);
public static RemoteObject _mhchartstickstopdown = RemoteObject.createImmutable(false);
public static RemoteObject _myxchartdisplayvalues = RemoteObject.createImmutable(false);
public static RemoteObject _myxchartdisplayposition = RemoteObject.createImmutable("");
public static RemoteObject _myxchartdisplaycrosshair = RemoteObject.createImmutable(false);
public static RemoteObject _myxchartcrosshaircolor = RemoteObject.createImmutable(0);
public static RemoteObject _myxchartcrosshairdeltay = RemoteObject.createImmutable(0);
public static RemoteObject _mmissingdatavalue = RemoteObject.createImmutable(0);
public static RemoteObject _rightscalewidth = RemoteObject.createImmutable(0);
public static RemoteObject _mbubblevalminmax = null;
public static RemoteObject _mbubblediametermin = RemoteObject.createImmutable(0);
public static RemoteObject _mbubblediametermax = RemoteObject.createImmutable(0);
public static RemoteObject _mbubbleradiusmin = RemoteObject.createImmutable(0);
public static RemoteObject _mbubbleradiusmax = RemoteObject.createImmutable(0);
public static RemoteObject _mbubblesmallsnap = RemoteObject.createImmutable(false);
public static RemoteObject _conversion = RemoteObject.declareNull("b4a.example.conversion");
public static RemoteObject _modbusservice = RemoteObject.declareNull("b4a.example.modbusservice");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.controlador1 _controlador1 = null;
public static b4a.example.controlador2 _controlador2 = null;
public static b4a.example.controlador3 _controlador3 = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Bar",_ref.getField(false, "_bar"),"BarWidth0",_ref.getField(false, "_barwidth0"),"BMVNF",_ref.getField(false, "_bmvnf"),"BMVNFUsed",_ref.getField(false, "_bmvnfused"),"Bubbles",_ref.getField(false, "_bubbles"),"Conversion",_ref.getField(false, "_conversion"),"DateUtils",_ref.getField(false, "_dateutils"),"Graph",_ref.getField(false, "_graph"),"HLines",_ref.getField(false, "_hlines"),"Items",_ref.getField(false, "_items"),"Legend",_ref.getField(false, "_legend"),"LongClickTimer",_ref.getField(false, "_longclicktimer"),"mBase",_ref.getField(false, "_mbase"),"mBubbleDiameterMax",_ref.getField(false, "_mbubblediametermax"),"mBubbleDiameterMin",_ref.getField(false, "_mbubblediametermin"),"mBubbleRadiusMax",_ref.getField(false, "_mbubbleradiusmax"),"mBubbleRadiusMin",_ref.getField(false, "_mbubbleradiusmin"),"mBubbleSmallSnap",_ref.getField(false, "_mbubblesmallsnap"),"mBubbleValMinMax",_ref.getField(false, "_mbubblevalminmax"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mHChartsTicksTopDown",_ref.getField(false, "_mhchartstickstopdown"),"mHChartsXScaleOnTop",_ref.getField(false, "_mhchartsxscaleontop"),"MinMaxMeanValues",_ref.getField(false, "_minmaxmeanvalues"),"mKeepDisplayValues",_ref.getField(false, "_mkeepdisplayvalues"),"mMissingDataValue",_ref.getField(false, "_mmissingdatavalue"),"ModbusService",_ref.getField(false, "_modbusservice"),"mPiePercentageNbFractions",_ref.getField(false, "_mpiepercentagenbfractions"),"mYXChartCrossHairColor",_ref.getField(false, "_myxchartcrosshaircolor"),"mYXChartCrossHairDeltaY",_ref.getField(false, "_myxchartcrosshairdeltay"),"mYXChartDisplayCrossHair",_ref.getField(false, "_myxchartdisplaycrosshair"),"mYXChartDisplayPosition",_ref.getField(false, "_myxchartdisplayposition"),"mYXChartDisplayValues",_ref.getField(false, "_myxchartdisplayvalues"),"NbMaxDifferentScales",_ref.getField(false, "_nbmaxdifferentscales"),"Points",_ref.getField(false, "_points"),"pthGrid",_ref.getField(false, "_pthgrid"),"RightScaleWidth",_ref.getField(false, "_rightscalewidth"),"Scale",_ref.getField(false, "_scale"),"ScaleLog",_ref.getField(false, "_scalelog"),"sX",_ref.getField(false, "_sx"),"sY",_ref.getField(false, "_sy"),"Tag",_ref.getField(false, "_tag"),"Texts",_ref.getField(false, "_texts"),"Values",_ref.getField(false, "_values"),"xcvsCursor",_ref.getField(false, "_xcvscursor"),"xcvsGraph",_ref.getField(false, "_xcvsgraph"),"xcvsValues",_ref.getField(false, "_xcvsvalues"),"xcvsZoomBar",_ref.getField(false, "_xcvszoombar"),"xpnlCursor",_ref.getField(false, "_xpnlcursor"),"xpnlGraph",_ref.getField(false, "_xpnlgraph"),"xpnlValues",_ref.getField(false, "_xpnlvalues"),"xpnlZoomBar",_ref.getField(false, "_xpnlzoombar"),"xui",_ref.getField(false, "_xui"),"Zoom",_ref.getField(false, "_zoom")};
}
}