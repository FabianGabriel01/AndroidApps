package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xchart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.xchart");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.xchart.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.Timer _longclicktimer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnlgraph = null;
public anywheresoftware.b4a.objects.B4XCanvas _xcvsgraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnlvalues = null;
public anywheresoftware.b4a.objects.B4XCanvas _xcvsvalues = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnlcursor = null;
public anywheresoftware.b4a.objects.B4XCanvas _xcvscursor = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnlzoombar = null;
public anywheresoftware.b4a.objects.B4XCanvas _xcvszoombar = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XPath _pthgrid = null;
public int _nbmaxdifferentscales = 0;
public b4a.example.xchart._scaledata[] _scale = null;
public b4a.example.xchart._scaledatalog[] _scalelog = null;
public int _sx = 0;
public int[] _sy = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.List _points = null;
public anywheresoftware.b4a.objects.collections.List _hlines = null;
public anywheresoftware.b4a.objects.collections.List _bubbles = null;
public b4a.example.xchart._chartdata _graph = null;
public b4a.example.xchart._textdata _texts = null;
public b4a.example.xchart._legenddata _legend = null;
public b4a.example.xchart._valuesdata _values = null;
public b4a.example.xchart._zoombardata _zoom = null;
public b4a.example.xchart._bardata _bar = null;
public double[] _minmaxmeanvalues = null;
public b4a.example.xchart._numberformats _bmvnf = null;
public boolean _bmvnfused = false;
public boolean _barwidth0 = false;
public int _mpiepercentagenbfractions = 0;
public String _mkeepdisplayvalues = "";
public boolean _mhchartsxscaleontop = false;
public boolean _mhchartstickstopdown = false;
public boolean _myxchartdisplayvalues = false;
public String _myxchartdisplayposition = "";
public boolean _myxchartdisplaycrosshair = false;
public int _myxchartcrosshaircolor = 0;
public int _myxchartcrosshairdeltay = 0;
public double _mmissingdatavalue = 0;
public int _rightscalewidth = 0;
public double[] _mbubblevalminmax = null;
public double _mbubblediametermin = 0;
public double _mbubblediametermax = 0;
public int _mbubbleradiusmin = 0;
public int _mbubbleradiusmax = 0;
public boolean _mbubblesmallsnap = false;
public b4a.example.conversion _conversion = null;
public b4a.example.modbusservice _modbusservice = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.controlador1 _controlador1 = null;
public b4a.example.controlador2 _controlador2 = null;
public b4a.example.controlador3 _controlador3 = null;
public static class _chartdata{
public boolean IsInitialized;
public String Title;
public String Subtitle;
public String XAxisName;
public String YAxisName;
public String YAxisName2;
public int Left;
public int Right;
public int Top;
public int Bottom;
public int Width;
public int Height;
public int CenterX;
public int CenterY;
public float Radius;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect Rect;
public int YInterval;
public double XInterval;
public int XOffset;
public int BarWidth;
public String ChartType;
public int BarSubWidth;
public boolean IncludeBarMeanLine;
public boolean IncludeValues;
public int ChartBackgroundColor;
public int GridFrameColor;
public int GridColor;
public int GridColorDark;
public String XScaleTextOrientation;
public int PieStartAngle;
public int PieGapDegrees;
public boolean PieAddPercentage;
public boolean GradientColors;
public int GradientColorsAlpha;
public double Rotation;
public boolean DrawOuterFrame;
public boolean IncludeMinLine;
public boolean IncludeMaxLine;
public int MinLineColor;
public int MaxLineColor;
public boolean IncludeMeanLine;
public int MeanLineColor;
public String BarValueOrientation;
public int BarMarginMode;
public boolean Error;
public String ErrorText;
public boolean DrawGridFrame;
public boolean DrawHorizontalGridLines;
public boolean DrawVerticalGridLines;
public int RadarStartAngle;
public boolean RadarDrawScale;
public boolean RadarDrawScaleValues;
public String RadarScaleType;
public int AreaFillAlphaValue;
public void Initialize() {
IsInitialized = true;
Title = "";
Subtitle = "";
XAxisName = "";
YAxisName = "";
YAxisName2 = "";
Left = 0;
Right = 0;
Top = 0;
Bottom = 0;
Width = 0;
Height = 0;
CenterX = 0;
CenterY = 0;
Radius = 0f;
Rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
YInterval = 0;
XInterval = 0;
XOffset = 0;
BarWidth = 0;
ChartType = "";
BarSubWidth = 0;
IncludeBarMeanLine = false;
IncludeValues = false;
ChartBackgroundColor = 0;
GridFrameColor = 0;
GridColor = 0;
GridColorDark = 0;
XScaleTextOrientation = "";
PieStartAngle = 0;
PieGapDegrees = 0;
PieAddPercentage = false;
GradientColors = false;
GradientColorsAlpha = 0;
Rotation = 0;
DrawOuterFrame = false;
IncludeMinLine = false;
IncludeMaxLine = false;
MinLineColor = 0;
MaxLineColor = 0;
IncludeMeanLine = false;
MeanLineColor = 0;
BarValueOrientation = "";
BarMarginMode = 0;
Error = false;
ErrorText = "";
DrawGridFrame = false;
DrawHorizontalGridLines = false;
DrawVerticalGridLines = false;
RadarStartAngle = 0;
RadarDrawScale = false;
RadarDrawScaleValues = false;
RadarScaleType = "";
AreaFillAlphaValue = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pointdata{
public boolean IsInitialized;
public String X;
public double[] YArray;
public boolean ShowTick;
public String BarType;
public void Initialize() {
IsInitialized = true;
X = "";
YArray = new double[0];
;
ShowTick = false;
BarType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _itemdata{
public boolean IsInitialized;
public String Name;
public int Color;
public float Value;
public int StrokeWidth;
public boolean DrawLine;
public boolean Filled;
public String PointType;
public int PointColor;
public boolean PointFilled;
public anywheresoftware.b4a.objects.collections.List YXArray;
public boolean HideLine;
public void Initialize() {
IsInitialized = true;
Name = "";
Color = 0;
Value = 0f;
StrokeWidth = 0;
DrawLine = false;
Filled = false;
PointType = "";
PointColor = 0;
PointFilled = false;
YXArray = new anywheresoftware.b4a.objects.collections.List();
HideLine = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _scaledata{
public boolean IsInitialized;
public double Scale;
public double MinVal;
public double MaxVal;
public double MinManu;
public double MaxManu;
public double IntervalManu;
public double MinAuto;
public double MaxAuto;
public double IntervalAuto;
public double Interval;
public int NbIntervals;
public boolean Automatic;
public boolean Different;
public double Exp;
public boolean YZeroAxis;
public boolean YZeroAxisHighlight;
public String ScaleValues;
public boolean Logarithmic;
public boolean DrawXScale;
public boolean DrawYScale;
public boolean ReverseYScale;
public void Initialize() {
IsInitialized = true;
Scale = 0;
MinVal = 0;
MaxVal = 0;
MinManu = 0;
MaxManu = 0;
IntervalManu = 0;
MinAuto = 0;
MaxAuto = 0;
IntervalAuto = 0;
Interval = 0;
NbIntervals = 0;
Automatic = false;
Different = false;
Exp = 0;
YZeroAxis = false;
YZeroAxisHighlight = false;
ScaleValues = "";
Logarithmic = false;
DrawXScale = false;
DrawYScale = false;
ReverseYScale = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _scaledatalog{
public boolean IsInitialized;
public double Scale;
public int MantMin;
public int MantMax;
public double LogMin;
public int LogMinIndex;
public double LogMax;
public double[] Logs;
public double[] Vals;
public int NbDecades;
public String ScaleValues;
public String RadarScaleType;
public void Initialize() {
IsInitialized = true;
Scale = 0;
MantMin = 0;
MantMax = 0;
LogMin = 0;
LogMinIndex = 0;
LogMax = 0;
Logs = new double[0];
;
Vals = new double[0];
;
NbDecades = 0;
ScaleValues = "";
RadarScaleType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _textdata{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TitleFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont SubtitleFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont AxisFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont ScaleFont;
public boolean AutomaticTextSizes;
public float TitleTextSize;
public float SubtitleTextSize;
public int TitleTextColor;
public int SubtitleTextColor;
public int AxisTextColor;
public float AxisTextSize;
public float ScaleTextSize;
public int ScaleTextColor;
public int TitleTextHeight;
public int SubtitleTextHeight;
public int TitleTextWidth;
public int SubtitleTextWidth;
public int AxisTextHeight;
public int ScaleTextHeight;
public String CustomFontName;
public double CustomFontScale;
public void Initialize() {
IsInitialized = true;
TitleFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
SubtitleFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
AxisFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
ScaleFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
AutomaticTextSizes = false;
TitleTextSize = 0f;
SubtitleTextSize = 0f;
TitleTextColor = 0;
SubtitleTextColor = 0;
AxisTextColor = 0;
AxisTextSize = 0f;
ScaleTextSize = 0f;
ScaleTextColor = 0;
TitleTextHeight = 0;
SubtitleTextHeight = 0;
TitleTextWidth = 0;
SubtitleTextWidth = 0;
AxisTextHeight = 0;
ScaleTextHeight = 0;
CustomFontName = "";
CustomFontScale = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _legenddata{
public boolean IsInitialized;
public String IncludeLegend;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public float TextSize;
public int TextColor;
public int TextHeight;
public int Height;
public int LineNumber;
public anywheresoftware.b4a.objects.collections.List LineNumbers;
public anywheresoftware.b4a.objects.collections.List LineChange;
public int BackgroundColor;
public void Initialize() {
IsInitialized = true;
IncludeLegend = "";
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextSize = 0f;
TextColor = 0;
TextHeight = 0;
Height = 0;
LineNumber = 0;
LineNumbers = new anywheresoftware.b4a.objects.collections.List();
LineChange = new anywheresoftware.b4a.objects.collections.List();
BackgroundColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _valuesdata{
public boolean IsInitialized;
public boolean Show;
public boolean ShowOnHover;
public boolean ShowCursor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public float TextSize;
public int TextColor;
public int TextHeight;
public int Left;
public int Top;
public int Width;
public int Height;
public int MidPont;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect rectValues;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect rectCursor;
public int MaxDigits;
public String Position;
public int BackgroundColor;
public void Initialize() {
IsInitialized = true;
Show = false;
ShowOnHover = false;
ShowCursor = false;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextSize = 0f;
TextColor = 0;
TextHeight = 0;
Left = 0;
Top = 0;
Width = 0;
Height = 0;
MidPont = 0;
rectValues = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
rectCursor = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
MaxDigits = 0;
Position = "";
BackgroundColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _numberformats{
public boolean IsInitialized;
public int MinimumIntegers;
public int MaximumFractions;
public int MinimumFractions;
public boolean GroupingUsed;
public void Initialize() {
IsInitialized = true;
MinimumIntegers = 0;
MaximumFractions = 0;
MinimumFractions = 0;
GroupingUsed = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _hline{
public boolean IsInitialized;
public double Value;
public int Color;
public int StrokeWidth;
public boolean DisplayValue;
public void Initialize() {
IsInitialized = true;
Value = 0;
Color = 0;
StrokeWidth = 0;
DisplayValue = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _zoombardata{
public boolean IsInitialized;
public boolean Active;
public int BeginIndex;
public int EndIndex;
public int NbVisiblePoints;
public int SmallStep;
public int BigStep;
public int BarLength;
public int BarWidth;
public int ButtonLength;
public int CornerRadius;
public int CursorBegin;
public int CursorBegin0;
public int CursorLength;
public int Cursor0;
public boolean CursorOn;
public int ColorBar;
public int ColorButton;
public int ColorButtonFrame;
public boolean ScalesOnZoomedPart;
public boolean Move;
public boolean Enabled;
public void Initialize() {
IsInitialized = true;
Active = false;
BeginIndex = 0;
EndIndex = 0;
NbVisiblePoints = 0;
SmallStep = 0;
BigStep = 0;
BarLength = 0;
BarWidth = 0;
ButtonLength = 0;
CornerRadius = 0;
CursorBegin = 0;
CursorBegin0 = 0;
CursorLength = 0;
Cursor0 = 0;
CursorOn = false;
ColorBar = 0;
ColorButton = 0;
ColorButtonFrame = 0;
ScalesOnZoomedPart = false;
Move = false;
Enabled = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bardata{
public boolean IsInitialized;
public int WickColor;
public int WickWidth;
public int IncreaseColor;
public int DecreaseColor;
public int TotalBarColor;
public boolean DrawBodyBorder;
public boolean CandleDisplayVolume;
public void Initialize() {
IsInitialized = true;
WickColor = 0;
WickWidth = 0;
IncreaseColor = 0;
DecreaseColor = 0;
TotalBarColor = 0;
DrawBodyBorder = false;
CandleDisplayVolume = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bubbledata{
public boolean IsInitialized;
public int x;
public int y;
public int Radius;
public int Color;
public int ItemIndex;
public int PointIndex;
public void Initialize() {
IsInitialized = true;
x = 0;
y = 0;
Radius = 0;
Color = 0;
ItemIndex = 0;
PointIndex = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addbar(String _name,int _barcolor) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1201;BA.debugLine="Public Sub AddBar(Name As String, BarColor As Int)";
 //BA.debugLineNum = 1202;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1203;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1206;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1207;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1208;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1209;BA.debugLine="ID.Color = BarColor";
_id.Color /*int*/  = _barcolor;
 //BA.debugLineNum = 1210;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1211;BA.debugLine="End Sub";
return "";
}
public String  _addbarmultiplepoint(String _x,double[] _yarray) throws Exception{
b4a.example.xchart._pointdata _pd = null;
 //BA.debugLineNum = 1215;BA.debugLine="Public Sub AddBarMultiplePoint (X As String, YArra";
 //BA.debugLineNum = 1216;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1217;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 1219;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1220;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 1221;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 1222;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 1223;BA.debugLine="PD.ShowTick = True";
_pd.ShowTick /*boolean*/  = __c.True;
 //BA.debugLineNum = 1224;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 1225;BA.debugLine="End Sub";
return "";
}
public String  _addbarpointdata(String _x,double _y) throws Exception{
b4a.example.xchart._pointdata _pd = null;
double[] _yarray = null;
 //BA.debugLineNum = 1229;BA.debugLine="Public Sub AddBarPointData (X As String, Y As Doub";
 //BA.debugLineNum = 1230;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1231;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 1233;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1234;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 1235;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 1236;BA.debugLine="Private YArray(1) As Double";
_yarray = new double[(int) (1)];
;
 //BA.debugLineNum = 1237;BA.debugLine="YArray(0) = Y";
_yarray[(int) (0)] = _y;
 //BA.debugLineNum = 1238;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 1239;BA.debugLine="PD.ShowTick = True";
_pd.ShowTick /*boolean*/  = __c.True;
 //BA.debugLineNum = 1240;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 1241;BA.debugLine="End Sub";
return "";
}
public String  _addbubble(int _serieindex,double _x,double _y,double _value) throws Exception{
b4a.example.xchart._itemdata _id = null;
double[] _yxz = null;
 //BA.debugLineNum = 1568;BA.debugLine="Public Sub AddBubble(SerieIndex As Int, X As Doubl";
 //BA.debugLineNum = 1569;BA.debugLine="If SerieIndex < 0 Or SerieIndex > Items.Size Then";
if (_serieindex<0 || _serieindex>_items.getSize()) { 
 //BA.debugLineNum = 1570;BA.debugLine="Log(\"Index out of range\")";
__c.LogImpl("97077890","Index out of range",0);
 //BA.debugLineNum = 1571;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1574;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1575;BA.debugLine="Private YXZ(3) As Double";
_yxz = new double[(int) (3)];
;
 //BA.debugLineNum = 1576;BA.debugLine="YXZ(0) = X";
_yxz[(int) (0)] = _x;
 //BA.debugLineNum = 1577;BA.debugLine="YXZ(1) = Y";
_yxz[(int) (1)] = _y;
 //BA.debugLineNum = 1578;BA.debugLine="YXZ(2) = Value";
_yxz[(int) (2)] = _value;
 //BA.debugLineNum = 1579;BA.debugLine="ID = Items.Get(SerieIndex)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_serieindex));
 //BA.debugLineNum = 1580;BA.debugLine="If ID.YXArray.IsInitialized = False Then";
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1581;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
 //BA.debugLineNum = 1583;BA.debugLine="ID.YXArray.Add(YXZ)";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_yxz));
 //BA.debugLineNum = 1584;BA.debugLine="End Sub";
return "";
}
public String  _addbubbleseries(String _name,int _bubblecolor) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1550;BA.debugLine="Public Sub AddBubbleSeries(Name As String, BubbleC";
 //BA.debugLineNum = 1551;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1552;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1554;BA.debugLine="If BubbleColor = 0 Then BubbleColor = xui.Color_R";
if (_bubblecolor==0) { 
_bubblecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 1556;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1557;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1558;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1559;BA.debugLine="ID.Color = BubbleColor";
_id.Color /*int*/  = _bubblecolor;
 //BA.debugLineNum = 1560;BA.debugLine="ID.YXArray.Initialize	'???";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 1561;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1562;BA.debugLine="End Sub";
return "";
}
public String  _addbubblesingle(String _name,double _x,double _y,double _value,int _bubblecolor) throws Exception{
b4a.example.xchart._itemdata _id = null;
double[] _yxz = null;
 //BA.debugLineNum = 1591;BA.debugLine="Public Sub AddBubbleSingle(Name As String, X As Do";
 //BA.debugLineNum = 1592;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1593;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1595;BA.debugLine="If BubbleColor = 0 Then BubbleColor = xui.Color_R";
if (_bubblecolor==0) { 
_bubblecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 1597;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1598;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1599;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1600;BA.debugLine="ID.Color = BubbleColor";
_id.Color /*int*/  = _bubblecolor;
 //BA.debugLineNum = 1602;BA.debugLine="Private YXZ(3) As Double";
_yxz = new double[(int) (3)];
;
 //BA.debugLineNum = 1603;BA.debugLine="YXZ(0) = X";
_yxz[(int) (0)] = _x;
 //BA.debugLineNum = 1604;BA.debugLine="YXZ(1) = Y";
_yxz[(int) (1)] = _y;
 //BA.debugLineNum = 1605;BA.debugLine="YXZ(2) = Value";
_yxz[(int) (2)] = _value;
 //BA.debugLineNum = 1606;BA.debugLine="If ID.YXArray.IsInitialized = False Then";
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1607;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
 //BA.debugLineNum = 1609;BA.debugLine="ID.YXArray.Add(YXZ)";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_yxz));
 //BA.debugLineNum = 1611;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1612;BA.debugLine="End Sub";
return "";
}
public String  _addcandlepoint(String _x,double _open,double _high,double _low,double _close,boolean _showtick) throws Exception{
b4a.example.xchart._pointdata _pd = null;
double[] _yarray = null;
 //BA.debugLineNum = 1459;BA.debugLine="Public Sub AddCandlePoint(X As String, Open As Dou";
 //BA.debugLineNum = 1460;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1461;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 1463;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1464;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 1465;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 1466;BA.debugLine="Private YArray(5) As Double";
_yarray = new double[(int) (5)];
;
 //BA.debugLineNum = 1467;BA.debugLine="YArray(0) = Open";
_yarray[(int) (0)] = _open;
 //BA.debugLineNum = 1468;BA.debugLine="YArray(1) = High";
_yarray[(int) (1)] = _high;
 //BA.debugLineNum = 1469;BA.debugLine="YArray(2) = Low";
_yarray[(int) (2)] = _low;
 //BA.debugLineNum = 1470;BA.debugLine="YArray(3) = Close";
_yarray[(int) (3)] = _close;
 //BA.debugLineNum = 1471;BA.debugLine="YArray(4) = 0";
_yarray[(int) (4)] = 0;
 //BA.debugLineNum = 1472;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 1473;BA.debugLine="PD.ShowTick = ShowTick";
_pd.ShowTick /*boolean*/  = _showtick;
 //BA.debugLineNum = 1474;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 1475;BA.debugLine="End Sub";
return "";
}
public String  _addcandlepoint2(String _x,double _open,double _high,double _low,double _close,double _volume,boolean _showtick) throws Exception{
b4a.example.xchart._pointdata _pd = null;
double[] _yarray = null;
 //BA.debugLineNum = 1480;BA.debugLine="Public Sub AddCandlePoint2(X As String, Open As Do";
 //BA.debugLineNum = 1481;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1482;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 1484;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1485;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 1486;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 1487;BA.debugLine="Private YArray(5) As Double";
_yarray = new double[(int) (5)];
;
 //BA.debugLineNum = 1488;BA.debugLine="YArray(0) = Open";
_yarray[(int) (0)] = _open;
 //BA.debugLineNum = 1489;BA.debugLine="YArray(1) = High";
_yarray[(int) (1)] = _high;
 //BA.debugLineNum = 1490;BA.debugLine="YArray(2) = Low";
_yarray[(int) (2)] = _low;
 //BA.debugLineNum = 1491;BA.debugLine="YArray(3) = Close";
_yarray[(int) (3)] = _close;
 //BA.debugLineNum = 1492;BA.debugLine="YArray(4) = Volume";
_yarray[(int) (4)] = _volume;
 //BA.debugLineNum = 1493;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 1494;BA.debugLine="PD.ShowTick = ShowTick";
_pd.ShowTick /*boolean*/  = _showtick;
 //BA.debugLineNum = 1495;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 1496;BA.debugLine="End Sub";
return "";
}
public String  _addhorizontalline(double _value,int _color,int _strokewidth,boolean _displayvalue) throws Exception{
int _i = 0;
b4a.example.xchart._hline _hl = null;
 //BA.debugLineNum = 1501;BA.debugLine="Public Sub AddHorizontalLine(Value As Double, Colo";
 //BA.debugLineNum = 1502;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1505;BA.debugLine="For i = 0 To HLines.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_hlines.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1506;BA.debugLine="Private HL As HLine";
_hl = new b4a.example.xchart._hline();
 //BA.debugLineNum = 1507;BA.debugLine="HL = HLines.Get(i)";
_hl = (b4a.example.xchart._hline)(_hlines.Get(_i));
 //BA.debugLineNum = 1508;BA.debugLine="If HL.Value = Value Then";
if (_hl.Value /*double*/ ==_value) { 
 //BA.debugLineNum = 1509;BA.debugLine="HL.Color = Color";
_hl.Color /*int*/  = _color;
 //BA.debugLineNum = 1510;BA.debugLine="HL.StrokeWidth = StrokeWidth";
_hl.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 1511;BA.debugLine="HL.DisplayValue = DisplayValue";
_hl.DisplayValue /*boolean*/  = _displayvalue;
 //BA.debugLineNum = 1512;BA.debugLine="HLines.Set(i, HL)";
_hlines.Set(_i,(Object)(_hl));
 //BA.debugLineNum = 1513;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 1518;BA.debugLine="If i = HLines.Size Then";
if (_i==_hlines.getSize()) { 
 //BA.debugLineNum = 1519;BA.debugLine="Private HL As HLine";
_hl = new b4a.example.xchart._hline();
 //BA.debugLineNum = 1520;BA.debugLine="HL.Value = Value";
_hl.Value /*double*/  = _value;
 //BA.debugLineNum = 1521;BA.debugLine="HL.Color = Color";
_hl.Color /*int*/  = _color;
 //BA.debugLineNum = 1522;BA.debugLine="HL.StrokeWidth = StrokeWidth";
_hl.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 1523;BA.debugLine="HL.DisplayValue = DisplayValue";
_hl.DisplayValue /*boolean*/  = _displayvalue;
 //BA.debugLineNum = 1524;BA.debugLine="HLines.Add(HL)";
_hlines.Add((Object)(_hl));
 };
 //BA.debugLineNum = 1526;BA.debugLine="End Sub";
return "";
}
public String  _addline(String _name,int _linecolor) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1296;BA.debugLine="Public Sub AddLine(Name As String, LineColor As In";
 //BA.debugLineNum = 1297;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1298;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1300;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 1302;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1303;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1304;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1305;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 1306;BA.debugLine="ID.StrokeWidth = 2dip";
_id.StrokeWidth /*int*/  = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 1307;BA.debugLine="ID.PointType = \"NONE\"";
_id.PointType /*String*/  = "NONE";
 //BA.debugLineNum = 1308;BA.debugLine="ID.Filled = False";
_id.Filled /*boolean*/  = __c.False;
 //BA.debugLineNum = 1309;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1310;BA.debugLine="End Sub";
return "";
}
public String  _addline2(String _name,int _linecolor,int _strokewidth,String _pointtype,boolean _pointfilled,int _pointcolor) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1316;BA.debugLine="Public Sub AddLine2(Name As String, LineColor As I";
 //BA.debugLineNum = 1317;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1318;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1320;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 1322;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1323;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1324;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1325;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 1326;BA.debugLine="ID.StrokeWidth = StrokeWidth";
_id.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 1327;BA.debugLine="ID.PointType = PointType";
_id.PointType /*String*/  = _pointtype;
 //BA.debugLineNum = 1328;BA.debugLine="ID.PointFilled = PointFilled";
_id.PointFilled /*boolean*/  = _pointfilled;
 //BA.debugLineNum = 1329;BA.debugLine="ID.PointColor = PointColor";
_id.PointColor /*int*/  = _pointcolor;
 //BA.debugLineNum = 1330;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1331;BA.debugLine="End Sub";
return "";
}
public String  _addlinemultiplepoints(String _x,double[] _yarray,boolean _showtick) throws Exception{
b4a.example.xchart._pointdata _pd = null;
 //BA.debugLineNum = 1336;BA.debugLine="Public Sub AddLineMultiplePoints(X As String, YArr";
 //BA.debugLineNum = 1337;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1338;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 1340;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1341;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 1342;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 1343;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 1344;BA.debugLine="PD.ShowTick = ShowTick";
_pd.ShowTick /*boolean*/  = _showtick;
 //BA.debugLineNum = 1345;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 1346;BA.debugLine="If xpnlValues.Visible = True Then";
if (_xpnlvalues.getVisible()==__c.True) { 
 //BA.debugLineNum = 1347;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 1348;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 1349;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 //BA.debugLineNum = 1351;BA.debugLine="End Sub";
return "";
}
public String  _addlinepointdata(String _x,double _y,boolean _showtick) throws Exception{
b4a.example.xchart._pointdata _pd = null;
double[] _yarray = null;
 //BA.debugLineNum = 1356;BA.debugLine="Public Sub AddLinePointData (X As String, Y As Dou";
 //BA.debugLineNum = 1357;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1358;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 1360;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1361;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 1362;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 1363;BA.debugLine="Private YArray(1) As Double";
_yarray = new double[(int) (1)];
;
 //BA.debugLineNum = 1364;BA.debugLine="YArray(0) = Y";
_yarray[(int) (0)] = _y;
 //BA.debugLineNum = 1365;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 1366;BA.debugLine="PD.ShowTick = ShowTick";
_pd.ShowTick /*boolean*/  = _showtick;
 //BA.debugLineNum = 1367;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 1368;BA.debugLine="If xpnlValues.Visible = True Then";
if (_xpnlvalues.getVisible()==__c.True) { 
 //BA.debugLineNum = 1369;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 1370;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 1371;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 //BA.debugLineNum = 1373;BA.debugLine="End Sub";
return "";
}
public String  _addpie(String _name,float _value,int _color) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1378;BA.debugLine="Public Sub AddPie(Name As String, Value As Float,";
 //BA.debugLineNum = 1379;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1380;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1382;BA.debugLine="If Color = 0 Then Color = xui.Color_RGB(Rnd(0, 25";
if (_color==0) { 
_color = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 1383;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1384;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1385;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1386;BA.debugLine="ID.Value = Value";
_id.Value /*float*/  = _value;
 //BA.debugLineNum = 1387;BA.debugLine="ID.Color = Color";
_id.Color /*int*/  = _color;
 //BA.debugLineNum = 1388;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1389;BA.debugLine="End Sub";
return "";
}
public String  _addradar(String _name,int _color,int _srokewidth,boolean _filled) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1245;BA.debugLine="Public Sub AddRadar(Name As String, Color As Int,";
 //BA.debugLineNum = 1246;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1247;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1250;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1251;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1252;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1253;BA.debugLine="ID.Color = Color";
_id.Color /*int*/  = _color;
 //BA.debugLineNum = 1254;BA.debugLine="ID.StrokeWidth = SrokeWidth";
_id.StrokeWidth /*int*/  = _srokewidth;
 //BA.debugLineNum = 1255;BA.debugLine="ID.PointType = \"NONE\"";
_id.PointType /*String*/  = "NONE";
 //BA.debugLineNum = 1256;BA.debugLine="ID.Filled = Filled";
_id.Filled /*boolean*/  = _filled;
 //BA.debugLineNum = 1257;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1258;BA.debugLine="End Sub";
return "";
}
public String  _addradar2(String _name,int _color,int _srokewidth,boolean _filled,String _pointtype,boolean _pointfilled,int _pointcolor) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1263;BA.debugLine="Public Sub AddRadar2(Name As String, Color As Int,";
 //BA.debugLineNum = 1264;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1265;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1268;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1269;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1270;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1271;BA.debugLine="ID.Color = Color";
_id.Color /*int*/  = _color;
 //BA.debugLineNum = 1272;BA.debugLine="ID.StrokeWidth = SrokeWidth";
_id.StrokeWidth /*int*/  = _srokewidth;
 //BA.debugLineNum = 1273;BA.debugLine="ID.Filled = Filled";
_id.Filled /*boolean*/  = _filled;
 //BA.debugLineNum = 1274;BA.debugLine="ID.PointType = PointType";
_id.PointType /*String*/  = _pointtype;
 //BA.debugLineNum = 1275;BA.debugLine="ID.PointFilled = PointFilled";
_id.PointFilled /*boolean*/  = _pointfilled;
 //BA.debugLineNum = 1276;BA.debugLine="ID.PointColor = PointColor";
_id.PointColor /*int*/  = _pointcolor;
 //BA.debugLineNum = 1277;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1278;BA.debugLine="End Sub";
return "";
}
public String  _addradarmultiplepoint(String _x,double[] _yarray) throws Exception{
 //BA.debugLineNum = 1282;BA.debugLine="Public Sub AddRadarMultiplePoint (X As String, YAr";
 //BA.debugLineNum = 1284;BA.debugLine="AddBarMultiplePoint (X, YArray)";
_addbarmultiplepoint(_x,_yarray);
 //BA.debugLineNum = 1285;BA.debugLine="End Sub";
return "";
}
public String  _addradarpointdata(String _x,double _y) throws Exception{
 //BA.debugLineNum = 1289;BA.debugLine="Public Sub AddRadarPointData (X As String, Y As Do";
 //BA.debugLineNum = 1291;BA.debugLine="AddBarPointData (X, Y)";
_addbarpointdata(_x,_y);
 //BA.debugLineNum = 1292;BA.debugLine="End Sub";
return "";
}
public String  _addwaterfallpoint(String _bartype,String _x,double _y) throws Exception{
b4a.example.xchart._pointdata _pd = null;
double[] _yarray = null;
 //BA.debugLineNum = 1532;BA.debugLine="Public Sub AddWaterfallPoint(BarType As String, X";
 //BA.debugLineNum = 1533;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1534;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 1536;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1537;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 1538;BA.debugLine="PD.BarType = BarType";
_pd.BarType /*String*/  = _bartype;
 //BA.debugLineNum = 1539;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 1540;BA.debugLine="Private YArray(2) As Double";
_yarray = new double[(int) (2)];
;
 //BA.debugLineNum = 1541;BA.debugLine="YArray(0) = Y";
_yarray[(int) (0)] = _y;
 //BA.debugLineNum = 1542;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 1543;BA.debugLine="PD.ShowTick = True";
_pd.ShowTick /*boolean*/  = __c.True;
 //BA.debugLineNum = 1544;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 1545;BA.debugLine="End Sub";
return "";
}
public String  _addyxline(String _name,int _linecolor,int _strokewidth) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1393;BA.debugLine="Public Sub AddYXLine(Name As String, LineColor As";
 //BA.debugLineNum = 1394;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1395;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1397;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 1399;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1400;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1401;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1402;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 1403;BA.debugLine="ID.StrokeWidth = StrokeWidth";
_id.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 1404;BA.debugLine="ID.DrawLine = True";
_id.DrawLine /*boolean*/  = __c.True;
 //BA.debugLineNum = 1405;BA.debugLine="ID.PointType = \"NONE\"";
_id.PointType /*String*/  = "NONE";
 //BA.debugLineNum = 1406;BA.debugLine="ID.Filled = False";
_id.Filled /*boolean*/  = __c.False;
 //BA.debugLineNum = 1407;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 1408;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1409;BA.debugLine="End Sub";
return "";
}
public String  _addyxline2(String _name,int _linecolor,int _strokewidth,boolean _drawline,String _pointtype,boolean _pointfilled,int _pointcolor) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 1417;BA.debugLine="Public Sub AddYXLine2(Name As String, LineColor As";
 //BA.debugLineNum = 1418;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1419;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1421;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 1423;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1424;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 1425;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 1426;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 1427;BA.debugLine="ID.StrokeWidth = StrokeWidth";
_id.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 1428;BA.debugLine="ID.DrawLine = DrawLine";
_id.DrawLine /*boolean*/  = _drawline;
 //BA.debugLineNum = 1429;BA.debugLine="ID.PointType = PointType";
_id.PointType /*String*/  = _pointtype;
 //BA.debugLineNum = 1430;BA.debugLine="ID.PointFilled = PointFilled";
_id.PointFilled /*boolean*/  = _pointfilled;
 //BA.debugLineNum = 1431;BA.debugLine="ID.PointColor = PointColor";
_id.PointColor /*int*/  = _pointcolor;
 //BA.debugLineNum = 1432;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 1433;BA.debugLine="If DrawLine = False Then";
if (_drawline==__c.False) { 
 //BA.debugLineNum = 1434;BA.debugLine="ID.Color = ID.PointColor";
_id.Color /*int*/  = _id.PointColor /*int*/ ;
 };
 //BA.debugLineNum = 1436;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 1437;BA.debugLine="End Sub";
return "";
}
public String  _addyxpoint(int _lineindex,double _x,double _y) throws Exception{
b4a.example.xchart._itemdata _id = null;
double[] _yx = null;
 //BA.debugLineNum = 1440;BA.debugLine="Public Sub AddYXPoint(LineIndex As Int, X As Doubl";
 //BA.debugLineNum = 1441;BA.debugLine="If LineIndex < 0 Or LineIndex > Items.Size Then";
if (_lineindex<0 || _lineindex>_items.getSize()) { 
 //BA.debugLineNum = 1442;BA.debugLine="Log(\"Index out of range\")";
__c.LogImpl("96684674","Index out of range",0);
 //BA.debugLineNum = 1443;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1446;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1447;BA.debugLine="Private YX(2) As Double";
_yx = new double[(int) (2)];
;
 //BA.debugLineNum = 1448;BA.debugLine="YX(0) = X";
_yx[(int) (0)] = _x;
 //BA.debugLineNum = 1449;BA.debugLine="YX(1) = Y";
_yx[(int) (1)] = _y;
 //BA.debugLineNum = 1450;BA.debugLine="ID = Items.Get(LineIndex)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_lineindex));
 //BA.debugLineNum = 1451;BA.debugLine="If ID.YXArray.IsInitialized = False Then";
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1452;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
 //BA.debugLineNum = 1454;BA.debugLine="ID.YXArray.Add(YX)";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_yx));
 //BA.debugLineNum = 1455;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
int _i = 0;
int _n = 0;
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 407;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 408;BA.debugLine="mBase.SetColorAndBorder(Graph.ChartBackgroundColo";
_mbase.SetColorAndBorder(_graph.ChartBackgroundColor /*int*/ ,(int) (0),_xui.Color_Transparent,(int) (0));
 //BA.debugLineNum = 409;BA.debugLine="If Zoom.Active = False Then";
if (_zoom.Active /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 410;BA.debugLine="xpnlGraph.Width = Width";
_xpnlgraph.setWidth((int) (_width));
 //BA.debugLineNum = 411;BA.debugLine="xpnlGraph.Height = Height";
_xpnlgraph.setHeight((int) (_height));
 //BA.debugLineNum = 413;BA.debugLine="xpnlCursor.Width = Width";
_xpnlcursor.setWidth((int) (_width));
 //BA.debugLineNum = 414;BA.debugLine="xpnlCursor.Height = Height";
_xpnlcursor.setHeight((int) (_height));
 }else {
 //BA.debugLineNum = 416;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 417;BA.debugLine="xpnlGraph.Width = Width - xpnlZoomBar.Width";
_xpnlgraph.setWidth((int) (_width-_xpnlzoombar.getWidth()));
 //BA.debugLineNum = 418;BA.debugLine="xpnlGraph.Height = Height";
_xpnlgraph.setHeight((int) (_height));
 //BA.debugLineNum = 420;BA.debugLine="xpnlCursor.Width = Width - xpnlZoomBar.Width";
_xpnlcursor.setWidth((int) (_width-_xpnlzoombar.getWidth()));
 //BA.debugLineNum = 421;BA.debugLine="xpnlCursor.Height = Height";
_xpnlcursor.setHeight((int) (_height));
 //BA.debugLineNum = 423;BA.debugLine="xpnlZoomBar.Top = 0";
_xpnlzoombar.setTop((int) (0));
 //BA.debugLineNum = 424;BA.debugLine="xpnlZoomBar.Left = xpnlGraph.Width";
_xpnlzoombar.setLeft(_xpnlgraph.getWidth());
 //BA.debugLineNum = 425;BA.debugLine="xpnlZoomBar.Height = Height";
_xpnlzoombar.setHeight((int) (_height));
 //BA.debugLineNum = 426;BA.debugLine="Zoom.BarLength = Height";
_zoom.BarLength /*int*/  = (int) (_height);
 }else {
 //BA.debugLineNum = 428;BA.debugLine="xpnlGraph.Width = Width";
_xpnlgraph.setWidth((int) (_width));
 //BA.debugLineNum = 429;BA.debugLine="xpnlGraph.Height = Height - xpnlZoomBar.Height";
_xpnlgraph.setHeight((int) (_height-_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 431;BA.debugLine="xpnlCursor.Width = Width";
_xpnlcursor.setWidth((int) (_width));
 //BA.debugLineNum = 432;BA.debugLine="xpnlCursor.Height = Height - xpnlZoomBar.Height";
_xpnlcursor.setHeight((int) (_height-_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 434;BA.debugLine="xpnlZoomBar.Width = Width";
_xpnlzoombar.setWidth((int) (_width));
 //BA.debugLineNum = 435;BA.debugLine="Zoom.BarLength = Width";
_zoom.BarLength /*int*/  = (int) (_width);
 //BA.debugLineNum = 436;BA.debugLine="xpnlZoomBar.Top = xpnlGraph.Height";
_xpnlzoombar.setTop(_xpnlgraph.getHeight());
 };
 };
 //BA.debugLineNum = 440;BA.debugLine="ZoomBarResize";
_zoombarresize();
 //BA.debugLineNum = 441;BA.debugLine="ZoomCursorDraw";
_zoomcursordraw();
 //BA.debugLineNum = 443;BA.debugLine="xcvsGraph.Resize(xpnlGraph.Width, xpnlGraph.Heigh";
_xcvsgraph.Resize((float) (_xpnlgraph.getWidth()),(float) (_xpnlgraph.getHeight()));
 //BA.debugLineNum = 444;BA.debugLine="xcvsCursor.Resize(xpnlCursor.Width, xpnlCursor.He";
_xcvscursor.Resize((float) (_xpnlcursor.getWidth()),(float) (_xpnlcursor.getHeight()));
 //BA.debugLineNum = 445;BA.debugLine="xcvsZoomBar.Resize(xpnlZoomBar.Width, xpnlZoomBar";
_xcvszoombar.Resize((float) (_xpnlzoombar.getWidth()),(float) (_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 447;BA.debugLine="If (Graph.ChartType = \"YX_CHART\" Or Graph.ChartTy";
if (((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) && _items.getSize()>0) { 
 //BA.debugLineNum = 448;BA.debugLine="Private i, n As Int";
_i = 0;
_n = 0;
 //BA.debugLineNum = 449;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 451;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step35 = 1;
final int limit35 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit35 ;_i = _i + step35 ) {
 //BA.debugLineNum = 452;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 453;BA.debugLine="If ID.YXArray.Size > 0 Then";
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
 //BA.debugLineNum = 454;BA.debugLine="n = 1";
_n = (int) (1);
 };
 }
};
 //BA.debugLineNum = 457;BA.debugLine="If n = 1 Then";
if (_n==1) { 
 //BA.debugLineNum = 458;BA.debugLine="DrawChart";
_drawchart();
 };
 }else if(_zoom.NbVisiblePoints /*int*/ >0 || (_graph.ChartType /*String*/ ).equals("PIE")) { 
 //BA.debugLineNum = 461;BA.debugLine="DrawChart";
_drawchart();
 };
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return "";
}
public int  _calcdarkcolor(int _color) throws Exception{
b4a.example.bitmapcreator _bmpcreate = null;
b4a.example.bitmapcreator._argbcolor _argbcol = null;
 //BA.debugLineNum = 983;BA.debugLine="Private Sub CalcDarkColor(Color As Int) As Int";
 //BA.debugLineNum = 984;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 985;BA.debugLine="Private ARGBCol As ARGBColor";
_argbcol = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 987;BA.debugLine="BmpCreate.Initialize(1, 1)";
_bmpcreate._initialize(ba,(int) (1),(int) (1));
 //BA.debugLineNum = 988;BA.debugLine="BmpCreate.ColorToARGB(Color, ARGBCol)";
_bmpcreate._colortoargb(_color,_argbcol);
 //BA.debugLineNum = 989;BA.debugLine="ARGBCol.r = ARGBCol.r / 2";
_argbcol.r = (int) (_argbcol.r/(double)2);
 //BA.debugLineNum = 990;BA.debugLine="ARGBCol.g = ARGBCol.g / 2";
_argbcol.g = (int) (_argbcol.g/(double)2);
 //BA.debugLineNum = 991;BA.debugLine="ARGBCol.b = ARGBCol.b / 2";
_argbcol.b = (int) (_argbcol.b/(double)2);
 //BA.debugLineNum = 993;BA.debugLine="Return BmpCreate.ARGBToColor(ARGBCol)";
if (true) return _bmpcreate._argbtocolor(_argbcol);
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return 0;
}
public String  _calcscaleauto(int _axis) throws Exception{
double _scalelogarithm = 0;
double _scalemant = 0;
double _scaledelta = 0;
double _valdiff = 0;
double _scalemin = 0;
double _scalemax = 0;
double _valmax = 0;
int _nbmin = 0;
int _nbusedintervals = 0;
int _nbusedintervalstop = 0;
int _nbusedintervalsbottom = 0;
int _nbintervalstomove = 0;
double[] _valminmax = null;
boolean _scaleok = false;
 //BA.debugLineNum = 2407;BA.debugLine="Private Sub CalcScaleAuto(Axis As Int)";
 //BA.debugLineNum = 2408;BA.debugLine="Private ScaleLogarithm, ScaleMant, ScaleDelta, Va";
_scalelogarithm = 0;
_scalemant = 0;
_scaledelta = 0;
_valdiff = 0;
_scalemin = 0;
_scalemax = 0;
_valmax = 0;
 //BA.debugLineNum = 2409;BA.debugLine="Private nbMin, NbUsedIntervals, NbUsedIntervalsTo";
_nbmin = 0;
_nbusedintervals = 0;
_nbusedintervalstop = 0;
_nbusedintervalsbottom = 0;
_nbintervalstomove = 0;
 //BA.debugLineNum = 2410;BA.debugLine="Private ValMinMax(3) As Double";
_valminmax = new double[(int) (3)];
;
 //BA.debugLineNum = 2412;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","H_LINE","YX_CHART","AREA","STACKED_AREA","BUBBLE","WATERFALL")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 2414;BA.debugLine="ValMinMax = GetLinePointsMinMaxMeanValues(Axis)";
_valminmax = _getlinepointsminmaxmeanvalues(_axis);
 //BA.debugLineNum = 2415;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(0";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]>=0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 2416;BA.debugLine="ValMinMax(0) = 0";
_valminmax[(int) (0)] = 0;
 };
 //BA.debugLineNum = 2418;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(0";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]<0 && _valminmax[(int) (1)]<=0) { 
 //BA.debugLineNum = 2419;BA.debugLine="ValMinMax(1) = 0";
_valminmax[(int) (1)] = 0;
 };
 break; }
case 6: {
 //BA.debugLineNum = 2422;BA.debugLine="ValMinMax = GetWaterfallMinMaxValues";
_valminmax = _getwaterfallminmaxvalues();
 break; }
default: {
 //BA.debugLineNum = 2424;BA.debugLine="ValMinMax = GetBarPointsMinMaxValues";
_valminmax = _getbarpointsminmaxvalues();
 break; }
}
;
 //BA.debugLineNum = 2428;BA.debugLine="If ValMinMax(0) = ValMinMax(1) Then";
if (_valminmax[(int) (0)]==_valminmax[(int) (1)]) { 
 //BA.debugLineNum = 2429;BA.debugLine="If ValMinMax(0) >= 0 And ValMinMax(0) <= 1 Then";
if (_valminmax[(int) (0)]>=0 && _valminmax[(int) (0)]<=1) { 
 //BA.debugLineNum = 2430;BA.debugLine="Scale(Axis).MinAuto = 0";
_scale[_axis].MinAuto /*double*/  = 0;
 //BA.debugLineNum = 2431;BA.debugLine="Scale(Axis).MaxAuto = 1";
_scale[_axis].MaxAuto /*double*/  = 1;
 //BA.debugLineNum = 2432;BA.debugLine="Scale(Axis).IntervalAuto = 1 / Scale(Axis).NbIn";
_scale[_axis].IntervalAuto /*double*/  = 1/(double)_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2433;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 2434;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 2435;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAuto";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 2436;BA.debugLine="Return";
if (true) return "";
 }else if(_valminmax[(int) (0)]<0 && _valminmax[(int) (0)]>=-1) { 
 //BA.debugLineNum = 2438;BA.debugLine="Scale(Axis).MinAuto = -1";
_scale[_axis].MinAuto /*double*/  = -1;
 //BA.debugLineNum = 2439;BA.debugLine="Scale(Axis).MaxAuto = 0";
_scale[_axis].MaxAuto /*double*/  = 0;
 //BA.debugLineNum = 2440;BA.debugLine="Scale(Axis).IntervalAuto = 1 / Scale(Axis).NbIn";
_scale[_axis].IntervalAuto /*double*/  = 1/(double)_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2441;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 2442;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 2443;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAuto";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 2444;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 2446;BA.debugLine="If Scale(Axis).YZeroAxis = False Then";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2447;BA.debugLine="If Abs(ValMinMax(0)) < 100 Then";
if (__c.Abs(_valminmax[(int) (0)])<100) { 
 //BA.debugLineNum = 2448;BA.debugLine="Scale(Axis).IntervalAuto = 0.1";
_scale[_axis].IntervalAuto /*double*/  = 0.1;
 //BA.debugLineNum = 2449;BA.debugLine="Scale(Axis).MinAuto = Floor(ValMinMax(0) * 10";
_scale[_axis].MinAuto /*double*/  = __c.Floor(_valminmax[(int) (0)]*10)/(double)10-_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ /(double)2;
 }else {
 //BA.debugLineNum = 2451;BA.debugLine="Scale(Axis).IntervalAuto = 1";
_scale[_axis].IntervalAuto /*double*/  = 1;
 //BA.debugLineNum = 2452;BA.debugLine="Scale(Axis).MinAuto = Floor(ValMinMax(0)) - S";
_scale[_axis].MinAuto /*double*/  = __c.Floor(_valminmax[(int) (0)])-_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ /(double)2;
 };
 //BA.debugLineNum = 2454;BA.debugLine="Scale(Axis).MaxAuto = Scale(Axis).MinAuto + Sc";
_scale[_axis].MaxAuto /*double*/  = _scale[_axis].MinAuto /*double*/ +_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2455;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 2456;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 2457;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAut";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 2458;BA.debugLine="If Axis = sX Then";
if (_axis==_sx) { 
 //BA.debugLineNum = 2459;BA.debugLine="Scale(Axis).Scale = Graph.Width / (Scale(Axis";
_scale[_axis].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_axis].MaxVal /*double*/ -_scale[_axis].MinVal /*double*/ );
 }else {
 //BA.debugLineNum = 2461;BA.debugLine="Scale(Axis).Scale = Graph.Height / (Scale(Axi";
_scale[_axis].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_axis].MaxVal /*double*/ -_scale[_axis].MinVal /*double*/ );
 };
 //BA.debugLineNum = 2463;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 2465;BA.debugLine="If ValMinMax(0) > 0 Then";
if (_valminmax[(int) (0)]>0) { 
 //BA.debugLineNum = 2466;BA.debugLine="ValMinMax(0) = 0";
_valminmax[(int) (0)] = 0;
 }else {
 //BA.debugLineNum = 2468;BA.debugLine="ValMinMax(1) = 0";
_valminmax[(int) (1)] = 0;
 };
 };
 };
 //BA.debugLineNum = 2472;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 2473;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 2474;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAuto";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 2475;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2478;BA.debugLine="Private ScaleOK As Boolean = False";
_scaleok = __c.False;
 //BA.debugLineNum = 2479;BA.debugLine="ValMax = ValMinMax(1)";
_valmax = _valminmax[(int) (1)];
 //BA.debugLineNum = 2480;BA.debugLine="Do Until ScaleOK = True";
while (!(_scaleok==__c.True)) {
 //BA.debugLineNum = 2481;BA.debugLine="ValDiff = ValMax - ValMinMax(0)";
_valdiff = _valmax-_valminmax[(int) (0)];
 //BA.debugLineNum = 2482;BA.debugLine="ScaleDelta = ValDiff / Scale(Axis).NbIntervals";
_scaledelta = _valdiff/(double)_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2484;BA.debugLine="ScaleLogarithm = Logarithm(ScaleDelta, 10)";
_scalelogarithm = __c.Logarithm(_scaledelta,10);
 //BA.debugLineNum = 2485;BA.debugLine="Scale(Axis).Exp = Floor(ScaleLogarithm)";
_scale[_axis].Exp /*double*/  = __c.Floor(_scalelogarithm);
 //BA.debugLineNum = 2486;BA.debugLine="If ValDiff >= 1 Then";
if (_valdiff>=1) { 
 //BA.debugLineNum = 2487;BA.debugLine="ScaleMant = ScaleLogarithm - Scale(Axis).Exp";
_scalemant = _scalelogarithm-_scale[_axis].Exp /*double*/ ;
 }else {
 //BA.debugLineNum = 2489;BA.debugLine="ScaleMant = Abs(Scale(Axis).Exp) + ScaleLogarit";
_scalemant = __c.Abs(_scale[_axis].Exp /*double*/ )+_scalelogarithm;
 };
 //BA.debugLineNum = 2492;BA.debugLine="ScaleMant = GetScaleMant(ScaleMant, Axis)";
_scalemant = _getscalemant(_scalemant,_axis);
 //BA.debugLineNum = 2493;BA.debugLine="Scale(Axis).IntervalAuto = Power(10, Scale(Axis)";
_scale[_axis].IntervalAuto /*double*/  = __c.Power(10,_scale[_axis].Exp /*double*/ +_scalemant);
 //BA.debugLineNum = 2495;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(0)";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]<0 && _valminmax[(int) (1)]==0) { 
 //BA.debugLineNum = 2496;BA.debugLine="ScaleMax = 0";
_scalemax = 0;
 //BA.debugLineNum = 2497;BA.debugLine="ScaleMin = -Scale(Axis).IntervalAuto * Scale(Ax";
_scalemin = -_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 }else {
 //BA.debugLineNum = 2499;BA.debugLine="ScaleMin = Floor(ValMinMax(0) / Scale(Axis).Int";
_scalemin = __c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ +0.00000000000001)*_scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 2500;BA.debugLine="ScaleMax = ScaleMin + Scale(Axis).IntervalAuto";
_scalemax = _scalemin+_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 };
 //BA.debugLineNum = 2504;BA.debugLine="If Round2(ScaleMax, 14) < Round2(ValMinMax(1), 1";
if (__c.Round2(_scalemax,(int) (14))<__c.Round2(_valminmax[(int) (1)],(int) (14))) { 
 //BA.debugLineNum = 2505;BA.debugLine="ValMax = ValMax + Scale(Axis).IntervalAuto";
_valmax = _valmax+_scale[_axis].IntervalAuto /*double*/ ;
 }else {
 //BA.debugLineNum = 2507;BA.debugLine="ScaleOK = True";
_scaleok = __c.True;
 };
 }
;
 //BA.debugLineNum = 2512;BA.debugLine="If ValMinMax(0) < 0 And ValMinMax(1) > 0 Then";
if (_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 2513;BA.debugLine="NbUsedIntervalsTop = Ceil(ValMinMax(1) / Scale(A";
_nbusedintervalstop = (int) (__c.Ceil(_valminmax[(int) (1)]/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 2514;BA.debugLine="NbUsedIntervalsBottom = Ceil(Abs(ValMinMax(0)) /";
_nbusedintervalsbottom = (int) (__c.Ceil(__c.Abs(_valminmax[(int) (0)])/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 2516;BA.debugLine="If NbUsedIntervalsTop + NbUsedIntervalsBottom >";
if (_nbusedintervalstop+_nbusedintervalsbottom>_scale[_axis].NbIntervals /*int*/ ) { 
 //BA.debugLineNum = 2518;BA.debugLine="ScaleMant = GetScaleMant(ScaleMant, Axis)";
_scalemant = _getscalemant(_scalemant,_axis);
 //BA.debugLineNum = 2520;BA.debugLine="Scale(Axis).IntervalAuto = Power(10, Scale(Axis";
_scale[_axis].IntervalAuto /*double*/  = __c.Power(10,_scale[_axis].Exp /*double*/ +_scalemant);
 };
 };
 //BA.debugLineNum = 2525;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(1)";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (1)]==0) { 
 //BA.debugLineNum = 2526;BA.debugLine="Scale(Axis).MinAuto = ScaleMin";
_scale[_axis].MinAuto /*double*/  = _scalemin;
 //BA.debugLineNum = 2527;BA.debugLine="Scale(Axis).MaxAuto = 0";
_scale[_axis].MaxAuto /*double*/  = 0;
 }else {
 //BA.debugLineNum = 2529;BA.debugLine="nbMin = Floor(ValMinMax(0) / Scale(Axis).Interva";
_nbmin = (int) (__c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ ));
 //BA.debugLineNum = 2530;BA.debugLine="If Abs(ValMinMax(0)) <= 0.000000000001 Then";
if (__c.Abs(_valminmax[(int) (0)])<=0.000000000001) { 
 //BA.debugLineNum = 2531;BA.debugLine="Scale(Axis).MinAuto = 0";
_scale[_axis].MinAuto /*double*/  = 0;
 }else if(_valminmax[(int) (0)]>=0) { 
 //BA.debugLineNum = 2533;BA.debugLine="Scale(Axis).MinAuto = nbMin * Scale(Axis).Inter";
_scale[_axis].MinAuto /*double*/  = _nbmin*_scale[_axis].IntervalAuto /*double*/ ;
 }else if(_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 2535;BA.debugLine="Scale(Axis).MinAuto = Floor(ValMinMax(0) / Scal";
_scale[_axis].MinAuto /*double*/  = __c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ +0.00000000000001)*_scale[_axis].IntervalAuto /*double*/ ;
 }else {
 //BA.debugLineNum = 2537;BA.debugLine="Scale(Axis).MinAuto = Floor(ValMinMax(0) / Scal";
_scale[_axis].MinAuto /*double*/  = __c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ +0.00000000000001)*_scale[_axis].IntervalAuto /*double*/ ;
 };
 };
 //BA.debugLineNum = 2540;BA.debugLine="Scale(Axis).MaxAuto = Scale(Axis).MinAuto + Scale";
_scale[_axis].MaxAuto /*double*/  = _scale[_axis].MinAuto /*double*/ +_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2543;BA.debugLine="If (Scale(Axis).MinAuto >= 0 And Scale(Axis).YZer";
if ((_scale[_axis].MinAuto /*double*/ >=0 && _scale[_axis].YZeroAxis /*boolean*/ ==__c.False) || (_scale[_axis].MaxAuto /*double*/ <=0 && _scale[_axis].YZeroAxis /*boolean*/ ==__c.False) || (_scale[_axis].MinAuto /*double*/ <0 && _scale[_axis].MaxAuto /*double*/ >0)) { 
 //BA.debugLineNum = 2544;BA.debugLine="If ValMinMax(0) < 0 And ValMinMax(1) > 0 Then";
if (_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 2545;BA.debugLine="NbUsedIntervalsTop = Ceil(ValMinMax(1) / Scale(";
_nbusedintervalstop = (int) (__c.Ceil(_valminmax[(int) (1)]/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 2546;BA.debugLine="NbUsedIntervalsBottom = Ceil(Abs(ValMinMax(0))";
_nbusedintervalsbottom = (int) (__c.Ceil(__c.Abs(_valminmax[(int) (0)])/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 2547;BA.debugLine="NbUsedIntervals = NbUsedIntervalsTop + NbUsedIn";
_nbusedintervals = (int) (_nbusedintervalstop+_nbusedintervalsbottom);
 //BA.debugLineNum = 2548;BA.debugLine="If NbUsedIntervalsTop - NbUsedIntervalsBottom =";
if (_nbusedintervalstop-_nbusedintervalsbottom==1) { 
 //BA.debugLineNum = 2549;BA.debugLine="NbIntervalsToMove = Scale(Axis).NbIntervals /";
_nbintervalstomove = (int) (_scale[_axis].NbIntervals /*int*/ /(double)2-_nbusedintervalsbottom);
 }else {
 //BA.debugLineNum = 2551;BA.debugLine="NbIntervalsToMove = (Scale(Axis).NbIntervals -";
_nbintervalstomove = (int) ((_scale[_axis].NbIntervals /*int*/ -_nbusedintervals)/(double)2);
 };
 }else {
 //BA.debugLineNum = 2554;BA.debugLine="NbUsedIntervals = Ceil(ValDiff / Scale(Axis).In";
_nbusedintervals = (int) (__c.Ceil(_valdiff/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 2555;BA.debugLine="NbIntervalsToMove = (Scale(Axis).NbIntervals -";
_nbintervalstomove = (int) ((_scale[_axis].NbIntervals /*int*/ -_nbusedintervals)/(double)2);
 };
 //BA.debugLineNum = 2557;BA.debugLine="Scale(Axis).MinAuto = Scale(Axis).MinAuto - Scal";
_scale[_axis].MinAuto /*double*/  = _scale[_axis].MinAuto /*double*/ -_scale[_axis].IntervalAuto /*double*/ *_nbintervalstomove;
 };
 //BA.debugLineNum = 2560;BA.debugLine="If Graph.ChartType = \"BAR\" Or Graph.ChartType = \"";
if ((_graph.ChartType /*String*/ ).equals("BAR") || (_graph.ChartType /*String*/ ).equals("H_BAR")) { 
 //BA.debugLineNum = 2562;BA.debugLine="If 	ValMinMax(0) = 0 And ValMinMax(1) > 0 And Sc";
if (_valminmax[(int) (0)]==0 && _valminmax[(int) (1)]>0 && _scale[_axis].MinAuto /*double*/ <0) { 
 //BA.debugLineNum = 2563;BA.debugLine="Scale(Axis).MinAuto = 0";
_scale[_axis].MinAuto /*double*/  = 0;
 };
 //BA.debugLineNum = 2567;BA.debugLine="If 	ValMinMax(0) < 0 And ValMinMax(1) = 0 And Sc";
if (_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]==0 && _scale[_axis].MinAuto /*double*/ +_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ >0) { 
 //BA.debugLineNum = 2568;BA.debugLine="Scale(Axis).MaxAuto = 0";
_scale[_axis].MaxAuto /*double*/  = 0;
 //BA.debugLineNum = 2569;BA.debugLine="Scale(Axis).MinAuto = - Scale(Axis).IntervalAut";
_scale[_axis].MinAuto /*double*/  = -_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 };
 };
 //BA.debugLineNum = 2574;BA.debugLine="Scale(Axis).MaxAuto = Scale(Axis).MinAuto + Scale";
_scale[_axis].MaxAuto /*double*/  = _scale[_axis].MinAuto /*double*/ +_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2576;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 2577;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 2578;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAuto";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 2579;BA.debugLine="End Sub";
return "";
}
public String  _calcscalelogauto(int _axis) throws Exception{
double[] _valminmax = null;
double _valmaxmant = 0;
double _valminmant = 0;
double _valmaxlog = 0;
double _valminlog = 0;
int _i = 0;
 //BA.debugLineNum = 2636;BA.debugLine="Private Sub CalcScaleLogAuto(Axis As Int)";
 //BA.debugLineNum = 2637;BA.debugLine="If Graph.ChartType = \"LINE\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 2638;BA.debugLine="Private ValMinMax(3) As Double";
_valminmax = new double[(int) (3)];
;
 //BA.debugLineNum = 2639;BA.debugLine="ValMinMax = GetLinePointsMinMaxMeanValues(Axis)";
_valminmax = _getlinepointsminmaxmeanvalues(_axis);
 }else if((_graph.ChartType /*String*/ ).equals("BAR") || (_graph.ChartType /*String*/ ).equals("H_BAR")) { 
 //BA.debugLineNum = 2641;BA.debugLine="Private ValMinMax(2) As Double";
_valminmax = new double[(int) (2)];
;
 //BA.debugLineNum = 2642;BA.debugLine="ValMinMax = GetBarPointsMinMaxValues";
_valminmax = _getbarpointsminmaxvalues();
 };
 //BA.debugLineNum = 2645;BA.debugLine="If ValMinMax(0) <= 0 Then";
if (_valminmax[(int) (0)]<=0) { 
 //BA.debugLineNum = 2646;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 2647;BA.debugLine="Graph.ErrorText = \"Logarithmic scales with value";
_graph.ErrorText /*String*/  = "Logarithmic scales with values"+"less or equal to zero is not allowed !";
 //BA.debugLineNum = 2648;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2651;BA.debugLine="If ValMinMax(0) = ValMinMax(1) Then";
if (_valminmax[(int) (0)]==_valminmax[(int) (1)]) { 
 //BA.debugLineNum = 2652;BA.debugLine="If ValMinMax(0) = 0 Then";
if (_valminmax[(int) (0)]==0) { 
 //BA.debugLineNum = 2653;BA.debugLine="ScaleLog(Axis).MantMin = 0";
_scalelog[_axis].MantMin /*int*/  = (int) (0);
 //BA.debugLineNum = 2654;BA.debugLine="ScaleLog(Axis).MantMax = 1";
_scalelog[_axis].MantMax /*int*/  = (int) (1);
 //BA.debugLineNum = 2655;BA.debugLine="ScaleLog(Axis).NbDecades = 1";
_scalelog[_axis].NbDecades /*int*/  = (int) (1);
 //BA.debugLineNum = 2656;BA.debugLine="Scale(Axis).MinVal = 1";
_scale[_axis].MinVal /*double*/  = 1;
 //BA.debugLineNum = 2657;BA.debugLine="Scale(Axis).MaxVal = 10";
_scale[_axis].MaxVal /*double*/  = 10;
 //BA.debugLineNum = 2658;BA.debugLine="Scale(Axis).Interval = 1";
_scale[_axis].Interval /*double*/  = 1;
 //BA.debugLineNum = 2659;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 2660;BA.debugLine="Graph.ErrorText = \"Min and max values = \" & Val";
_graph.ErrorText /*String*/  = "Min and max values = "+BA.NumberToString(_valminmax[(int) (0)])+" are the same !";
 //BA.debugLineNum = 2661;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 2665;BA.debugLine="ScaleLogLogVals(Axis)";
_scaleloglogvals(_axis);
 //BA.debugLineNum = 2667;BA.debugLine="Private ValMaxMant, ValMinMant, ValMaxLog, ValMin";
_valmaxmant = 0;
_valminmant = 0;
_valmaxlog = 0;
_valminlog = 0;
 //BA.debugLineNum = 2668;BA.debugLine="ValMinLog = Logarithm(ValMinMax(0), 10)";
_valminlog = __c.Logarithm(_valminmax[(int) (0)],10);
 //BA.debugLineNum = 2669;BA.debugLine="ValMaxLog = Logarithm(ValMinMax(1), 10)";
_valmaxlog = __c.Logarithm(_valminmax[(int) (1)],10);
 //BA.debugLineNum = 2670;BA.debugLine="ValMinMant = Floor(ValMinLog)";
_valminmant = __c.Floor(_valminlog);
 //BA.debugLineNum = 2671;BA.debugLine="ValMaxMant = Floor(ValMaxLog)";
_valmaxmant = __c.Floor(_valmaxlog);
 //BA.debugLineNum = 2672;BA.debugLine="ValMinLog = ValMinLog - ValMinMant";
_valminlog = _valminlog-_valminmant;
 //BA.debugLineNum = 2673;BA.debugLine="ValMaxLog = ValMaxLog - ValMaxMant";
_valmaxlog = _valmaxlog-_valmaxmant;
 //BA.debugLineNum = 2675;BA.debugLine="ScaleLog(Axis).MantMin = ValMinMant";
_scalelog[_axis].MantMin /*int*/  = (int) (_valminmant);
 //BA.debugLineNum = 2676;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step35 = 1;
final int limit35 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit35 ;_i = _i + step35 ) {
 //BA.debugLineNum = 2677;BA.debugLine="If ValMinLog >= ScaleLog(Axis).Logs(i) And ValMi";
if (_valminlog>=_scalelog[_axis].Logs /*double[]*/ [_i] && _valminlog<_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)]) { 
 //BA.debugLineNum = 2678;BA.debugLine="ScaleLog(Axis).LogMin = ScaleLog(Axis).Logs(i)";
_scalelog[_axis].LogMin /*double*/  = _scalelog[_axis].Logs /*double[]*/ [_i];
 //BA.debugLineNum = 2679;BA.debugLine="ScaleLog(Axis).LogMinIndex = i";
_scalelog[_axis].LogMinIndex /*int*/  = _i;
 //BA.debugLineNum = 2680;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 2684;BA.debugLine="ScaleLog(Axis).MantMax = ValMaxMant";
_scalelog[_axis].MantMax /*int*/  = (int) (_valmaxmant);
 //BA.debugLineNum = 2685;BA.debugLine="ScaleLog(Axis).LogMax = ValMaxLog";
_scalelog[_axis].LogMax /*double*/  = _valmaxlog;
 //BA.debugLineNum = 2686;BA.debugLine="If ScaleLog(Axis).LogMax <> Abs(0.000000000001) T";
if (_scalelog[_axis].LogMax /*double*/ !=__c.Abs(0.000000000001)) { 
 //BA.debugLineNum = 2687;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step45 = 1;
final int limit45 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit45 ;_i = _i + step45 ) {
 //BA.debugLineNum = 2688;BA.debugLine="If ValMaxLog > ScaleLog(Axis).Logs(i) And ValMa";
if (_valmaxlog>_scalelog[_axis].Logs /*double[]*/ [_i] && _valmaxlog<=_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)]) { 
 //BA.debugLineNum = 2689;BA.debugLine="ScaleLog(Axis).LogMax = ScaleLog(Axis).Logs(i";
_scalelog[_axis].LogMax /*double*/  = _scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)];
 //BA.debugLineNum = 2690;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 2695;BA.debugLine="If ScaleLog(Axis).LogMax = 1 Then";
if (_scalelog[_axis].LogMax /*double*/ ==1) { 
 //BA.debugLineNum = 2696;BA.debugLine="ScaleLog(Axis).MantMax = ScaleLog(Axis).MantMax";
_scalelog[_axis].MantMax /*int*/  = (int) (_scalelog[_axis].MantMax /*int*/ +1);
 //BA.debugLineNum = 2697;BA.debugLine="ScaleLog(Axis).LogMax = 0";
_scalelog[_axis].LogMax /*double*/  = 0;
 };
 //BA.debugLineNum = 2699;BA.debugLine="Scale(Axis).MinVal = Power(10, ScaleLog(Axis).Man";
_scale[_axis].MinVal /*double*/  = __c.Power(10,_scalelog[_axis].MantMin /*int*/ +_scalelog[_axis].LogMin /*double*/ );
 //BA.debugLineNum = 2700;BA.debugLine="Scale(Axis).MaxVal = Power(10, ScaleLog(Axis).Man";
_scale[_axis].MaxVal /*double*/  = __c.Power(10,_scalelog[_axis].MantMax /*int*/ +_scalelog[_axis].LogMax /*double*/ );
 //BA.debugLineNum = 2701;BA.debugLine="Scale(Axis).Interval = 1";
_scale[_axis].Interval /*double*/  = 1;
 //BA.debugLineNum = 2702;BA.debugLine="End Sub";
return "";
}
public String  _calcscalelogmanu(int _axis) throws Exception{
double _vallog = 0;
int _i = 0;
 //BA.debugLineNum = 2608;BA.debugLine="Private Sub CalcScaleLogManu(Axis As Int)";
 //BA.debugLineNum = 2609;BA.debugLine="Private ValLog As Double";
_vallog = 0;
 //BA.debugLineNum = 2611;BA.debugLine="ScaleLogLogVals(Axis)";
_scaleloglogvals(_axis);
 //BA.debugLineNum = 2613;BA.debugLine="ValLog = Logarithm(Scale(Axis).MaxManu, 10)";
_vallog = __c.Logarithm(_scale[_axis].MaxManu /*double*/ ,10);
 //BA.debugLineNum = 2614;BA.debugLine="ScaleLog(Axis).MantMax = Floor(ValLog)";
_scalelog[_axis].MantMax /*int*/  = (int) (__c.Floor(_vallog));
 //BA.debugLineNum = 2615;BA.debugLine="ScaleLog(Axis).LogMax = ValLog - ScaleLog(Axis).M";
_scalelog[_axis].LogMax /*double*/  = _vallog-_scalelog[_axis].MantMax /*int*/ ;
 //BA.debugLineNum = 2616;BA.debugLine="ValLog = Logarithm(Scale(Axis).MinManu, 10)";
_vallog = __c.Logarithm(_scale[_axis].MinManu /*double*/ ,10);
 //BA.debugLineNum = 2617;BA.debugLine="ScaleLog(Axis).MantMin = Floor(ValLog)";
_scalelog[_axis].MantMin /*int*/  = (int) (__c.Floor(_vallog));
 //BA.debugLineNum = 2618;BA.debugLine="ScaleLog(Axis).LogMin = ValLog - ScaleLog(Axis).M";
_scalelog[_axis].LogMin /*double*/  = _vallog-_scalelog[_axis].MantMin /*int*/ ;
 //BA.debugLineNum = 2620;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step9 = 1;
final int limit9 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 2621;BA.debugLine="If Round2(ScaleLog(Axis).LogMin, 14) >= Round2(S";
if (__c.Round2(_scalelog[_axis].LogMin /*double*/ ,(int) (14))>=__c.Round2(_scalelog[_axis].Logs /*double[]*/ [_i],(int) (14)) && __c.Round2(_scalelog[_axis].LogMin /*double*/ ,(int) (14))<__c.Round2(_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)],(int) (14))) { 
 //BA.debugLineNum = 2622;BA.debugLine="ScaleLog(Axis).LogMin = ScaleLog(Axis).Logs(i)";
_scalelog[_axis].LogMin /*double*/  = _scalelog[_axis].Logs /*double[]*/ [_i];
 //BA.debugLineNum = 2623;BA.debugLine="ScaleLog(Axis).LogMinIndex = i";
_scalelog[_axis].LogMinIndex /*int*/  = _i;
 //BA.debugLineNum = 2624;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 2628;BA.debugLine="If Axis = sX Then";
if (_axis==_sx) { 
 //BA.debugLineNum = 2629;BA.debugLine="ScaleLog(Axis).Scale = Graph.Width / (ScaleLog(A";
_scalelog[_axis].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scalelog[_axis].MantMax /*int*/ +_scalelog[_axis].LogMax /*double*/ -_scalelog[_axis].MantMin /*int*/ -_scalelog[_axis].LogMin /*double*/ );
 }else {
 //BA.debugLineNum = 2631;BA.debugLine="ScaleLog(Axis).Scale = Graph.Height / (ScaleLog(";
_scalelog[_axis].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scalelog[_axis].MantMax /*int*/ +_scalelog[_axis].LogMax /*double*/ -_scalelog[_axis].MantMin /*int*/ -_scalelog[_axis].LogMin /*double*/ );
 };
 //BA.debugLineNum = 2633;BA.debugLine="End Sub";
return "";
}
public String  _calcscalemanu(int _index) throws Exception{
double[] _valminmax = null;
 //BA.debugLineNum = 2377;BA.debugLine="Private Sub CalcScaleManu(Index As Int)";
 //BA.debugLineNum = 2378;BA.debugLine="Private ValMinMax(3) As Double";
_valminmax = new double[(int) (3)];
;
 //BA.debugLineNum = 2380;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","H_LINE","YX_CHART","AREA","STACKED_AREA","BUBBLE")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 2382;BA.debugLine="ValMinMax = GetLinePointsMinMaxMeanValues(sY(0)";
_valminmax = _getlinepointsminmaxmeanvalues(_sy[(int) (0)]);
 //BA.debugLineNum = 2383;BA.debugLine="If Scale(sY(0)).YZeroAxis = True And ValMinMax(";
if (_scale[_sy[(int) (0)]].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]>=0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 2384;BA.debugLine="ValMinMax(0) = 0";
_valminmax[(int) (0)] = 0;
 };
 //BA.debugLineNum = 2386;BA.debugLine="If Scale(sY(0)).YZeroAxis = True And ValMinMax(";
if (_scale[_sy[(int) (0)]].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]<0 && _valminmax[(int) (1)]<=0) { 
 //BA.debugLineNum = 2387;BA.debugLine="ValMinMax(1) = 0";
_valminmax[(int) (1)] = 0;
 };
 break; }
default: {
 //BA.debugLineNum = 2390;BA.debugLine="ValMinMax = GetBarPointsMinMaxValues";
_valminmax = _getbarpointsminmaxvalues();
 break; }
}
;
 //BA.debugLineNum = 2393;BA.debugLine="Scale(Index).MaxVal = Scale(Index).MaxManu";
_scale[_index].MaxVal /*double*/  = _scale[_index].MaxManu /*double*/ ;
 //BA.debugLineNum = 2394;BA.debugLine="Scale(Index).MinVal = Scale(Index).MinManu";
_scale[_index].MinVal /*double*/  = _scale[_index].MinManu /*double*/ ;
 //BA.debugLineNum = 2395;BA.debugLine="Scale(Index).IntervalManu = (Scale(Index).MaxVal";
_scale[_index].IntervalManu /*double*/  = (_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ )/(double)_scale[_index].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2396;BA.debugLine="Scale(Index).Interval = Scale(Index).IntervalManu";
_scale[_index].Interval /*double*/  = _scale[_index].IntervalManu /*double*/ ;
 //BA.debugLineNum = 2397;BA.debugLine="Scale(Index).Exp = Floor(Logarithm((Scale(Index).";
_scale[_index].Exp /*double*/  = __c.Floor(__c.Logarithm((_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ )/(double)_scale[_index].NbIntervals /*int*/ ,10));
 //BA.debugLineNum = 2398;BA.debugLine="If Index = sY(0) Then";
if (_index==_sy[(int) (0)]) { 
 //BA.debugLineNum = 2399;BA.debugLine="Scale(Index).Scale = Graph.Height / (Scale(Index";
_scale[_index].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ );
 }else {
 //BA.debugLineNum = 2401;BA.debugLine="Scale(Index).Scale = Graph.Width / (Scale(Index)";
_scale[_index].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ );
 };
 //BA.debugLineNum = 2403;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 155;BA.debugLine="Type ChartData (Title As String, Subtitle As Stri";
;
 //BA.debugLineNum = 156;BA.debugLine="Type PointData (X As String, YArray() As Double,";
;
 //BA.debugLineNum = 157;BA.debugLine="Type ItemData (Name As String, Color As Int, Valu";
;
 //BA.debugLineNum = 158;BA.debugLine="Type ScaleData (Scale As Double, MinVal As Double";
;
 //BA.debugLineNum = 159;BA.debugLine="Type ScaleDataLog(Scale As Double, MantMin As Int";
;
 //BA.debugLineNum = 160;BA.debugLine="Type TextData (TitleFont As B4XFont, SubtitleFont";
;
 //BA.debugLineNum = 161;BA.debugLine="Type LegendData (IncludeLegend As String, TextFon";
;
 //BA.debugLineNum = 162;BA.debugLine="Type ValuesData (Show As Boolean, ShowOnHover As";
;
 //BA.debugLineNum = 163;BA.debugLine="Type NumberFormats(MinimumIntegers As Int, Maximu";
;
 //BA.debugLineNum = 164;BA.debugLine="Type HLine(Value As Double, Color As Int, StrokeW";
;
 //BA.debugLineNum = 165;BA.debugLine="Type ZoomBarData(Active As Boolean, BeginIndex As";
;
 //BA.debugLineNum = 166;BA.debugLine="Type BarData(WickColor As Int, WickWidth As Int,";
;
 //BA.debugLineNum = 167;BA.debugLine="Type BubbleData(x As Int, y As Int, Radius As Int";
;
 //BA.debugLineNum = 169;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 170;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 171;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 172;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 173;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 177;BA.debugLine="Private LongClickTimer As Timer";
_longclicktimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 178;BA.debugLine="Private xpnlGraph As B4XView";
_xpnlgraph = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 179;BA.debugLine="Private xcvsGraph As B4XCanvas";
_xcvsgraph = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 180;BA.debugLine="Private xpnlValues As B4XView";
_xpnlvalues = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 181;BA.debugLine="Private xcvsValues As B4XCanvas";
_xcvsvalues = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 182;BA.debugLine="Private xpnlCursor As B4XView";
_xpnlcursor = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 183;BA.debugLine="Private xcvsCursor As B4XCanvas";
_xcvscursor = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 184;BA.debugLine="Private xpnlZoomBar As B4XView";
_xpnlzoombar = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 185;BA.debugLine="Private xcvsZoomBar As B4XCanvas";
_xcvszoombar = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 186;BA.debugLine="Private pthGrid As B4XPath";
_pthgrid = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 188;BA.debugLine="Private NbMaxDifferentScales = 4 As Int";
_nbmaxdifferentscales = (int) (4);
 //BA.debugLineNum = 189;BA.debugLine="Private Scale(NbMaxDifferentScales + 1) As ScaleD";
_scale = new b4a.example.xchart._scaledata[(int) (_nbmaxdifferentscales+1)];
{
int d0 = _scale.length;
for (int i0 = 0;i0 < d0;i0++) {
_scale[i0] = new b4a.example.xchart._scaledata();
}
}
;
 //BA.debugLineNum = 190;BA.debugLine="Private ScaleLog(NbMaxDifferentScales + 1) As Sca";
_scalelog = new b4a.example.xchart._scaledatalog[(int) (_nbmaxdifferentscales+1)];
{
int d0 = _scalelog.length;
for (int i0 = 0;i0 < d0;i0++) {
_scalelog[i0] = new b4a.example.xchart._scaledatalog();
}
}
;
 //BA.debugLineNum = 191;BA.debugLine="Private sX, sY(NbMaxDifferentScales) As Int";
_sx = 0;
_sy = new int[_nbmaxdifferentscales];
;
 //BA.debugLineNum = 192;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 193;BA.debugLine="Public Points As List";
_points = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 194;BA.debugLine="Private HLines As List";
_hlines = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 195;BA.debugLine="Private Bubbles As List";
_bubbles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 196;BA.debugLine="Private Graph As ChartData";
_graph = new b4a.example.xchart._chartdata();
 //BA.debugLineNum = 197;BA.debugLine="Private Texts As TextData";
_texts = new b4a.example.xchart._textdata();
 //BA.debugLineNum = 198;BA.debugLine="Private Legend As LegendData";
_legend = new b4a.example.xchart._legenddata();
 //BA.debugLineNum = 199;BA.debugLine="Private Values As ValuesData";
_values = new b4a.example.xchart._valuesdata();
 //BA.debugLineNum = 200;BA.debugLine="Private Zoom As ZoomBarData";
_zoom = new b4a.example.xchart._zoombardata();
 //BA.debugLineNum = 201;BA.debugLine="Private Bar As BarData";
_bar = new b4a.example.xchart._bardata();
 //BA.debugLineNum = 202;BA.debugLine="Private MinMaxMeanValues(3) As Double";
_minmaxmeanvalues = new double[(int) (3)];
;
 //BA.debugLineNum = 203;BA.debugLine="Private BMVNF As NumberFormats		' Bar Mean Value";
_bmvnf = new b4a.example.xchart._numberformats();
 //BA.debugLineNum = 204;BA.debugLine="Private BMVNFUsed As Boolean			' True if a custom";
_bmvnfused = false;
 //BA.debugLineNum = 205;BA.debugLine="Private BarWidth0 = False As Boolean";
_barwidth0 = __c.False;
 //BA.debugLineNum = 206;BA.debugLine="Private mPiePercentageNbFractions As Int";
_mpiepercentagenbfractions = 0;
 //BA.debugLineNum = 207;BA.debugLine="Private mKeepDisplayValues = \"NONE\" As String";
_mkeepdisplayvalues = "NONE";
 //BA.debugLineNum = 208;BA.debugLine="Private mHChartsXScaleOnTop = False As Boolean";
_mhchartsxscaleontop = __c.False;
 //BA.debugLineNum = 209;BA.debugLine="Private mHChartsTicksTopDown = False As Boolean";
_mhchartstickstopdown = __c.False;
 //BA.debugLineNum = 210;BA.debugLine="Private mYXChartDisplayValues = True As Boolean";
_myxchartdisplayvalues = __c.True;
 //BA.debugLineNum = 211;BA.debugLine="Private mYXChartDisplayPosition = True As String";
_myxchartdisplayposition = BA.ObjectToString(__c.True);
 //BA.debugLineNum = 212;BA.debugLine="Private mYXChartDisplayCrossHair = True As Boolea";
_myxchartdisplaycrosshair = __c.True;
 //BA.debugLineNum = 213;BA.debugLine="Private mYXChartCrossHairColor As Int";
_myxchartcrosshaircolor = 0;
 //BA.debugLineNum = 214;BA.debugLine="Private mYXChartCrossHairDeltaY As Int";
_myxchartcrosshairdeltay = 0;
 //BA.debugLineNum = 215;BA.debugLine="Private mMissingDataValue = 1000000000 As Double";
_mmissingdatavalue = 1000000000;
 //BA.debugLineNum = 216;BA.debugLine="Private RightScaleWidth As Int";
_rightscalewidth = 0;
 //BA.debugLineNum = 217;BA.debugLine="Private mBubbleValMinMax(2), mBubbleDiameterMin,";
_mbubblevalminmax = new double[(int) (2)];
;
_mbubblediametermin = 0;
_mbubblediametermax = 0;
 //BA.debugLineNum = 218;BA.debugLine="Private mBubbleRadiusMin, mBubbleRadiusMax As Int";
_mbubbleradiusmin = 0;
_mbubbleradiusmax = 0;
 //BA.debugLineNum = 219;BA.debugLine="Private mBubbleSmallSnap As Boolean";
_mbubblesmallsnap = false;
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public String  _cleardata() throws Exception{
 //BA.debugLineNum = 6917;BA.debugLine="Public Sub ClearData";
 //BA.debugLineNum = 6918;BA.debugLine="ClearPoints";
_clearpoints();
 //BA.debugLineNum = 6919;BA.debugLine="Items.Clear";
_items.Clear();
 //BA.debugLineNum = 6921;BA.debugLine="HLines.Clear";
_hlines.Clear();
 //BA.debugLineNum = 6922;BA.debugLine="Zoom.BeginIndex = 0";
_zoom.BeginIndex /*int*/  = (int) (0);
 //BA.debugLineNum = 6923;BA.debugLine="Zoom.EndIndex = 0";
_zoom.EndIndex /*int*/  = (int) (0);
 //BA.debugLineNum = 6924;BA.debugLine="Zoom.NbVisiblePoints = 0";
_zoom.NbVisiblePoints /*int*/  = (int) (0);
 //BA.debugLineNum = 6925;BA.debugLine="If Zoom.Active = True Then";
if (_zoom.Active /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 6926;BA.debugLine="xpnlZoomBar.Visible = False";
_xpnlzoombar.setVisible(__c.False);
 //BA.debugLineNum = 6927;BA.debugLine="xpnlGraph.Height = mBase.Height";
_xpnlgraph.setHeight(_mbase.getHeight());
 //BA.debugLineNum = 6928;BA.debugLine="xpnlCursor.Height = mBase.Height";
_xpnlcursor.setHeight(_mbase.getHeight());
 //BA.debugLineNum = 6929;BA.debugLine="xcvsGraph.Resize(mBase.Width, mBase.Height)";
_xcvsgraph.Resize((float) (_mbase.getWidth()),(float) (_mbase.getHeight()));
 //BA.debugLineNum = 6930;BA.debugLine="xcvsCursor.Resize(mBase.Width, mBase.Height)";
_xcvscursor.Resize((float) (_mbase.getWidth()),(float) (_mbase.getHeight()));
 };
 //BA.debugLineNum = 6932;BA.debugLine="Zoom.Active = False";
_zoom.Active /*boolean*/  = __c.False;
 //BA.debugLineNum = 6933;BA.debugLine="End Sub";
return "";
}
public String  _cleardisplayedvalues() throws Exception{
 //BA.debugLineNum = 8490;BA.debugLine="Public Sub ClearDisplayedValues";
 //BA.debugLineNum = 8494;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayVal";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("CURSOR")) { 
 //BA.debugLineNum = 8495;BA.debugLine="xcvsValues.ClearRect(xcvsValues.TargetRect)";
_xcvsvalues.ClearRect(_xcvsvalues.getTargetRect());
 };
 //BA.debugLineNum = 8497;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayVal";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("BOTH")) { 
 //BA.debugLineNum = 8498;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 8499;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 8500;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 //BA.debugLineNum = 8502;BA.debugLine="End Sub";
return "";
}
public String  _clearpoints() throws Exception{
int _l = 0;
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 6936;BA.debugLine="Public Sub ClearPoints";
 //BA.debugLineNum = 6937;BA.debugLine="Points.Clear";
_points.Clear();
 //BA.debugLineNum = 6938;BA.debugLine="If (Graph.ChartType = \"YX_CHART\" Or Graph.ChartTy";
if (((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) && _items.getSize()>0) { 
 //BA.debugLineNum = 6939;BA.debugLine="Private l As Int";
_l = 0;
 //BA.debugLineNum = 6940;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit4 ;_l = _l + step4 ) {
 //BA.debugLineNum = 6941;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 6942;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 6943;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 }
};
 };
 //BA.debugLineNum = 6946;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
int _i = 0;
 //BA.debugLineNum = 235;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 236;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 237;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 238;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 240;BA.debugLine="Scale(sY(0)).Initialize";
_scale[_sy[(int) (0)]].Initialize();
 //BA.debugLineNum = 241;BA.debugLine="Scale(sY(1)).Initialize";
_scale[_sy[(int) (1)]].Initialize();
 //BA.debugLineNum = 242;BA.debugLine="Scale(sY(2)).Initialize";
_scale[_sy[(int) (2)]].Initialize();
 //BA.debugLineNum = 243;BA.debugLine="Scale(sY(3)).Initialize";
_scale[_sy[(int) (3)]].Initialize();
 //BA.debugLineNum = 244;BA.debugLine="Scale(sX).Initialize";
_scale[_sx].Initialize();
 //BA.debugLineNum = 245;BA.debugLine="ScaleLog(sY(0)).Initialize";
_scalelog[_sy[(int) (0)]].Initialize();
 //BA.debugLineNum = 246;BA.debugLine="ScaleLog(sY(1)).Initialize";
_scalelog[_sy[(int) (1)]].Initialize();
 //BA.debugLineNum = 247;BA.debugLine="ScaleLog(sX).Initialize";
_scalelog[_sx].Initialize();
 //BA.debugLineNum = 248;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 249;BA.debugLine="Points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 250;BA.debugLine="HLines.Initialize";
_hlines.Initialize();
 //BA.debugLineNum = 251;BA.debugLine="Graph.Initialize";
_graph.Initialize();
 //BA.debugLineNum = 252;BA.debugLine="Texts.Initialize";
_texts.Initialize();
 //BA.debugLineNum = 253;BA.debugLine="Legend.Initialize";
_legend.Initialize();
 //BA.debugLineNum = 254;BA.debugLine="Values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 255;BA.debugLine="BMVNF.Initialize";
_bmvnf.Initialize();
 //BA.debugLineNum = 256;BA.debugLine="Bubbles.Initialize";
_bubbles.Initialize();
 //BA.debugLineNum = 257;BA.debugLine="Legend.LineNumbers.Initialize";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 258;BA.debugLine="Legend.LineChange.Initialize";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 260;BA.debugLine="Graph.Title = Props.GetDefault(\"Title\", \"\")";
_graph.Title /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("Title"),(Object)("")));
 //BA.debugLineNum = 261;BA.debugLine="Graph.Subtitle = Props.GetDefault(\"Subtitle\", \"\")";
_graph.Subtitle /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("Subtitle"),(Object)("")));
 //BA.debugLineNum = 262;BA.debugLine="Graph.XAxisName = Props.GetDefault(\"XAxisName\", \"";
_graph.XAxisName /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("XAxisName"),(Object)("X axis")));
 //BA.debugLineNum = 263;BA.debugLine="Graph.YAxisName = Props.GetDefault(\"YAxisName\", \"";
_graph.YAxisName /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("YAxisName"),(Object)("Y axis")));
 //BA.debugLineNum = 264;BA.debugLine="Graph.YAxisName2 = Props.GetDefault(\"YAxisName2\",";
_graph.YAxisName2 /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("YAxisName2"),(Object)("")));
 //BA.debugLineNum = 265;BA.debugLine="Scale(sX).YZeroAxis = Props.GetDefault(\"XZeroAxis";
_scale[_sx].YZeroAxis /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("XZeroAxis"),(Object)(__c.False)));
 //BA.debugLineNum = 266;BA.debugLine="Scale(sX).YZeroAxisHighlight = Props.GetDefault(\"";
_scale[_sx].YZeroAxisHighlight /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("XZeroAxisHighlight"),(Object)(__c.True)));
 //BA.debugLineNum = 267;BA.debugLine="For i = 0 To sY.Length - 1";
{
final int step30 = 1;
final int limit30 = (int) (_sy.length-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
 //BA.debugLineNum = 268;BA.debugLine="Scale(sY(i)).MaxManu = Props.GetDefault(\"YMaxVal";
_scale[_sy[_i]].MaxManu /*double*/  = (double)(BA.ObjectToNumber(_props.GetDefault((Object)("YMaxValue"),(Object)(100))));
 //BA.debugLineNum = 269;BA.debugLine="Scale(sY(i)).MinManu = Props.GetDefault(\"YMinVal";
_scale[_sy[_i]].MinManu /*double*/  = (double)(BA.ObjectToNumber(_props.GetDefault((Object)("YMinValue"),(Object)(0))));
 //BA.debugLineNum = 270;BA.debugLine="Scale(sY(i)).NbIntervals = Props.GetDefault(\"NbY";
_scale[_sy[_i]].NbIntervals /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("NbYIntervals"),(Object)(10))));
 //BA.debugLineNum = 271;BA.debugLine="Scale(sY(i)).YZeroAxis = Props.GetDefault(\"YZero";
_scale[_sy[_i]].YZeroAxis /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("YZeroAxis"),(Object)(__c.False)));
 //BA.debugLineNum = 272;BA.debugLine="Scale(sY(i)).YZeroAxisHighlight = Props.GetDefau";
_scale[_sy[_i]].YZeroAxisHighlight /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("YZeroAxisHighlight"),(Object)(__c.True)));
 //BA.debugLineNum = 273;BA.debugLine="Scale(sY(i)).Automatic = Props.GetDefault(\"Autom";
_scale[_sy[_i]].Automatic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutomaticScale"),(Object)(__c.True)));
 //BA.debugLineNum = 274;BA.debugLine="Scale(sY(i)).Different = Props.GetDefault(\"Diffe";
_scale[_sy[_i]].Different /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DifferentScales"),(Object)(__c.False)));
 //BA.debugLineNum = 275;BA.debugLine="Scale(sY(i)).Logarithmic = Props.GetDefault(\"Log";
_scale[_sy[_i]].Logarithmic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LogarithmicYScale"),(Object)(__c.False)));
 //BA.debugLineNum = 276;BA.debugLine="Scale(sY(i)).ScaleValues = Props.GetDefault(\"Sca";
_scale[_sy[_i]].ScaleValues /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ScaleValues"),(Object)("1!2!2.5!5!10")));
 //BA.debugLineNum = 277;BA.debugLine="Scale(sY(i)).DrawYScale = Props.GetDefault(\"Draw";
_scale[_sy[_i]].DrawYScale /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DrawYScale"),(Object)(__c.True)));
 //BA.debugLineNum = 278;BA.debugLine="Scale(sY(i)).ReverseYScale = Props.GetDefault(\"R";
_scale[_sy[_i]].ReverseYScale /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ReverseYScale"),(Object)(__c.False)));
 //BA.debugLineNum = 279;BA.debugLine="ScaleLog(sY(i)).ScaleValues = Props.GetDefault(\"";
_scalelog[_sy[_i]].ScaleValues /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ScaleYValuesLog"),(Object)("1!2!5!7!10")));
 }
};
 //BA.debugLineNum = 281;BA.debugLine="Scale(sX).MaxManu = Props.GetDefault(\"XMaxValue\",";
_scale[_sx].MaxManu /*double*/  = (double)(BA.ObjectToNumber(_props.GetDefault((Object)("XMaxValue"),(Object)(100))));
 //BA.debugLineNum = 282;BA.debugLine="Scale(sX).MinManu = Props.GetDefault(\"XMinValue\",";
_scale[_sx].MinManu /*double*/  = (double)(BA.ObjectToNumber(_props.GetDefault((Object)("XMinValue"),(Object)(0))));
 //BA.debugLineNum = 283;BA.debugLine="Scale(sX).NbIntervals = Props.GetDefault(\"NbXInte";
_scale[_sx].NbIntervals /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("NbXIntervals"),(Object)(10))));
 //BA.debugLineNum = 284;BA.debugLine="Scale(sX).Logarithmic = Props.GetDefault(\"Logarit";
_scale[_sx].Logarithmic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LogarithmicXScale"),(Object)(__c.False)));
 //BA.debugLineNum = 285;BA.debugLine="Scale(sX).ScaleValues = Props.GetDefault(\"ScaleVa";
_scale[_sx].ScaleValues /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ScaleValues"),(Object)("1!2!2.5!5!10")));
 //BA.debugLineNum = 286;BA.debugLine="Scale(sX).DrawXScale = Props.GetDefault(\"DrawXSca";
_scale[_sx].DrawXScale /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DrawXScale"),(Object)(__c.True)));
 //BA.debugLineNum = 287;BA.debugLine="ScaleLog(sX).ScaleValues = Props.GetDefault(\"Scal";
_scalelog[_sx].ScaleValues /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ScaleXValuesLog"),(Object)("1!2!5!7!10")));
 //BA.debugLineNum = 288;BA.debugLine="Graph.ChartType = Props.GetDefault(\"ChartType\", \"";
_graph.ChartType /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ChartType"),(Object)("BAR")));
 //BA.debugLineNum = 289;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Or Graph.ChartTyp";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 290;BA.debugLine="Scale(sX).Automatic = Props.GetDefault(\"Automati";
_scale[_sx].Automatic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutomaticScale"),(Object)(__c.True)));
 }else {
 //BA.debugLineNum = 292;BA.debugLine="Scale(sX).Automatic = False";
_scale[_sx].Automatic /*boolean*/  = __c.False;
 };
 //BA.debugLineNum = 295;BA.debugLine="Graph.ChartBackgroundColor = xui.PaintOrColorToCo";
_graph.ChartBackgroundColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("ChartBackgroundColor"),(Object)(((int)0xffcfdcdc))));
 //BA.debugLineNum = 296;BA.debugLine="If Graph.ChartBackgroundColor = 16777215 Then";
if (_graph.ChartBackgroundColor /*int*/ ==16777215) { 
 //BA.debugLineNum = 297;BA.debugLine="Graph.ChartBackgroundColor = xui.Color_Transpare";
_graph.ChartBackgroundColor /*int*/  = _xui.Color_Transparent;
 };
 //BA.debugLineNum = 300;BA.debugLine="Graph.GridFrameColor = xui.PaintOrColorToColor(Pr";
_graph.GridFrameColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("GridFrameColor"),(Object)(((int)0xff000000))));
 //BA.debugLineNum = 301;BA.debugLine="Graph.DrawGridFrame = Props.GetDefault(\"DrawGridF";
_graph.DrawGridFrame /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DrawGridFrame"),(Object)(__c.True)));
 //BA.debugLineNum = 302;BA.debugLine="Graph.DrawHorizontalGridLines = Props.GetDefault(";
_graph.DrawHorizontalGridLines /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DrawHorizontalGridLines"),(Object)(__c.True)));
 //BA.debugLineNum = 303;BA.debugLine="Graph.DrawVerticalGridLines = Props.GetDefault(\"D";
_graph.DrawVerticalGridLines /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DrawVerticalGridLines"),(Object)(__c.True)));
 //BA.debugLineNum = 304;BA.debugLine="Graph.GridColor = xui.PaintOrColorToColor(Props.G";
_graph.GridColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("GridColor"),(Object)(((int)0xffa9a9a9))));
 //BA.debugLineNum = 305;BA.debugLine="Graph.GridColorDark = CalcDarkColor(Graph.GridCol";
_graph.GridColorDark /*int*/  = _calcdarkcolor(_graph.GridColor /*int*/ );
 //BA.debugLineNum = 306;BA.debugLine="Graph.GradientColors = Props.GetDefault(\"Gradient";
_graph.GradientColors /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("GradientColors"),(Object)(__c.True)));
 //BA.debugLineNum = 307;BA.debugLine="Graph.GradientColorsAlpha = Props.GetDefault(\"Gra";
_graph.GradientColorsAlpha /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("GradientColorsAlpha"),(Object)(96))));
 //BA.debugLineNum = 308;BA.debugLine="Texts.TitleTextColor = xui.PaintOrColorToColor(Pr";
_texts.TitleTextColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("TitleTextColor"),(Object)(((int)0xff000000))));
 //BA.debugLineNum = 309;BA.debugLine="Texts.SubtitleTextColor = xui.PaintOrColorToColor";
_texts.SubtitleTextColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("SubtitleTextColor"),(Object)(((int)0xff000000))));
 //BA.debugLineNum = 310;BA.debugLine="Texts.ScaleTextColor = xui.PaintOrColorToColor(Pr";
_texts.ScaleTextColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("ScaleTextColor"),(Object)(((int)0xff000000))));
 //BA.debugLineNum = 311;BA.debugLine="Texts.AxisTextColor = xui.PaintOrColorToColor(Pro";
_texts.AxisTextColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("AxisTextColor"),(Object)(((int)0xff000000))));
 //BA.debugLineNum = 312;BA.debugLine="Texts.TitleTextSize = Props.GetDefault(\"TitleText";
_texts.TitleTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.GetDefault((Object)("TitleTextSize"),(Object)(18))));
 //BA.debugLineNum = 313;BA.debugLine="Texts.SubtitleTextSize = Props.GetDefault(\"Subtit";
_texts.SubtitleTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.GetDefault((Object)("SubtitleTextSize"),(Object)(16))));
 //BA.debugLineNum = 314;BA.debugLine="Texts.AxisTextSize = Props.GetDefault(\"AxisTextSi";
_texts.AxisTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.GetDefault((Object)("AxisTextSize"),(Object)(14))));
 //BA.debugLineNum = 315;BA.debugLine="Texts.ScaleTextSize = Props.GetDefault(\"ScaleText";
_texts.ScaleTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.GetDefault((Object)("ScaleTextSize"),(Object)(12))));
 //BA.debugLineNum = 316;BA.debugLine="Texts.CustomFontName = \"\"";
_texts.CustomFontName /*String*/  = "";
 //BA.debugLineNum = 317;BA.debugLine="Texts.CustomFontScale = 1";
_texts.CustomFontScale /*double*/  = 1;
 //BA.debugLineNum = 318;BA.debugLine="Legend.TextSize = Props.GetDefault(\"LegendTextSiz";
_legend.TextSize /*float*/  = (float)(BA.ObjectToNumber(_props.GetDefault((Object)("LegendTextSize"),(Object)(14))));
 //BA.debugLineNum = 319;BA.debugLine="Texts.AutomaticTextSizes = Props.GetDefault(\"Auto";
_texts.AutomaticTextSizes /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutomaticTextSizes"),(Object)(__c.True)));
 //BA.debugLineNum = 320;BA.debugLine="Graph.XScaleTextOrientation = Props.GetDefault(\"X";
_graph.XScaleTextOrientation /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("XScaleTextOrientation"),(Object)("HORIZONTAL")));
 //BA.debugLineNum = 321;BA.debugLine="Legend.IncludeLegend = Props.GetDefault(\"IncludeL";
_legend.IncludeLegend /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("IncludeLegend"),(Object)("NONE")));
 //BA.debugLineNum = 322;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"CANDLE","WATERFALL")) {
case 0: 
case 1: {
 //BA.debugLineNum = 324;BA.debugLine="Legend.IncludeLegend = \"NONE\"";
_legend.IncludeLegend /*String*/  = "NONE";
 break; }
}
;
 //BA.debugLineNum = 326;BA.debugLine="Legend.BackgroundColor = xui.PaintOrColorToColor(";
_legend.BackgroundColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("BackgroundColor"),(Object)(_xui.Color_ARGB((int) (102),(int) (255),(int) (255),(int) (255)))));
 //BA.debugLineNum = 327;BA.debugLine="Legend.TextColor = xui.PaintOrColorToColor(Props.";
_legend.TextColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("LegendTextColor"),(Object)(_xui.Color_Black)));
 //BA.debugLineNum = 328;BA.debugLine="Graph.IncludeValues = Props.GetDefault(\"IncludeVa";
_graph.IncludeValues /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("IncludeValues"),(Object)(__c.False)));
 //BA.debugLineNum = 329;BA.debugLine="Graph.BarValueOrientation = Props.GetDefault(\"Bar";
_graph.BarValueOrientation /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("BarValueOrientation"),(Object)("HORIZONTAL")));
 //BA.debugLineNum = 330;BA.debugLine="Graph.BarMarginMode = Props.GetDefault(\"BarMargin";
_graph.BarMarginMode /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("BarMarginMode"),(Object)(0))));
 //BA.debugLineNum = 331;BA.debugLine="Graph.PieStartAngle = Props.GetDefault(\"PieStartA";
_graph.PieStartAngle /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("PieStartAngle"),(Object)(0))));
 //BA.debugLineNum = 332;BA.debugLine="Graph.PieAddPercentage = Props.GetDefault(\"PieAdd";
_graph.PieAddPercentage /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("PieAddPercentage"),(Object)(__c.True)));
 //BA.debugLineNum = 333;BA.debugLine="Graph.PieGapDegrees = Props.GetDefault(\"PieGapDeg";
_graph.PieGapDegrees /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("PieGapDegrees"),(Object)(0))));
 //BA.debugLineNum = 334;BA.debugLine="mPiePercentageNbFractions = Props.GetDefault(\"Pie";
_mpiepercentagenbfractions = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("PiePerentageNbFractions"),(Object)(0))));
 //BA.debugLineNum = 335;BA.debugLine="mPiePercentageNbFractions = Max(mPiePercentageNbF";
_mpiepercentagenbfractions = (int) (__c.Max(_mpiepercentagenbfractions,0));
 //BA.debugLineNum = 336;BA.debugLine="mPiePercentageNbFractions = Min(mPiePercentageNbF";
_mpiepercentagenbfractions = (int) (__c.Min(_mpiepercentagenbfractions,2));
 //BA.debugLineNum = 337;BA.debugLine="Graph.RadarStartAngle = Props.GetDefault(\"RadarSt";
_graph.RadarStartAngle /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("RadarStartAngle"),(Object)(0))));
 //BA.debugLineNum = 338;BA.debugLine="Graph.RadarDrawScale = Props.GetDefault(\"RadarDra";
_graph.RadarDrawScale /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("RadarDrawScale"),(Object)(__c.True)));
 //BA.debugLineNum = 339;BA.debugLine="Graph.RadarDrawScaleValues = Props.GetDefault(\"Ra";
_graph.RadarDrawScaleValues /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("RadarDrawScaleValues"),(Object)(__c.True)));
 //BA.debugLineNum = 340;BA.debugLine="Graph.RadarScaleType = Props.GetDefault(\"RadarSca";
_graph.RadarScaleType /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("RadarScaleType"),(Object)("SPIDER")));
 //BA.debugLineNum = 341;BA.debugLine="Values.Show = Props.GetDefault(\"DisplayValues\", T";
_values.Show /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DisplayValues"),(Object)(__c.True)));
 //BA.debugLineNum = 342;BA.debugLine="Values.ShowOnHover = Props.GetDefault(\"DisplayVal";
_values.ShowOnHover /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DisplayValuesOnHover"),(Object)(__c.False)));
 //BA.debugLineNum = 343;BA.debugLine="Values.ShowCursor = Props.GetDefault(\"DisplayCurs";
_values.ShowCursor /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DisplayCursor"),(Object)(__c.False)));
 //BA.debugLineNum = 344;BA.debugLine="Values.Position = Props.GetDefault(\"ValuesPositio";
_values.Position /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ValuesPosition"),(Object)("TOP_LEFT")));
 //BA.debugLineNum = 345;BA.debugLine="Values.TextSize = Props.GetDefault(\"ValuesTextSiz";
_values.TextSize /*float*/  = (float)(BA.ObjectToNumber(_props.GetDefault((Object)("ValuesTextSize"),(Object)(14))));
 //BA.debugLineNum = 346;BA.debugLine="Values.TextColor = xui.PaintOrColorToColor(Props.";
_values.TextColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("ValuesTextColor"),(Object)(((int)0xff000000))));
 //BA.debugLineNum = 347;BA.debugLine="Values.BackgroundColor = xui.PaintOrColorToColor(";
_values.BackgroundColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("ValuesBackgroundColor"),(Object)(((int)0xaaffffff))));
 //BA.debugLineNum = 348;BA.debugLine="Graph.IncludeBarMeanLine = Props.GetDefault(\"Incl";
_graph.IncludeBarMeanLine /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("IncludeBarMeanLine"),(Object)(__c.False)));
 //BA.debugLineNum = 349;BA.debugLine="Graph.IncludeMinLine = Props.GetDefault(\"IncludeM";
_graph.IncludeMinLine /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("IncludeMinLine"),(Object)(__c.False)));
 //BA.debugLineNum = 350;BA.debugLine="Graph.IncludeMaxLine = Props.GetDefault(\"IncludeM";
_graph.IncludeMaxLine /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("IncludeMaxLine"),(Object)(__c.False)));
 //BA.debugLineNum = 351;BA.debugLine="Graph.IncludeMeanLine = Props.GetDefault(\"Include";
_graph.IncludeMeanLine /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("IncludeMeanLine"),(Object)(__c.False)));
 //BA.debugLineNum = 352;BA.debugLine="Graph.MinLineColor = xui.PaintOrColorToColor(Prop";
_graph.MinLineColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("MinLineColor"),(Object)(((int)0xff008000))));
 //BA.debugLineNum = 353;BA.debugLine="Graph.MaxLineColor = xui.PaintOrColorToColor(Prop";
_graph.MaxLineColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("MaxLineColor"),(Object)(((int)0xffff000))));
 //BA.debugLineNum = 354;BA.debugLine="Graph.MeanLineColor = xui.PaintOrColorToColor(Pro";
_graph.MeanLineColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("MeanLineColor"),(Object)(((int)0xffb64a1))));
 //BA.debugLineNum = 355;BA.debugLine="Graph.DrawOuterFrame = Props.GetDefault(\"DrawOute";
_graph.DrawOuterFrame /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("DrawOuterFrame"),(Object)(__c.False)));
 //BA.debugLineNum = 356;BA.debugLine="mKeepDisplayValues = Props.GetDefault(\"KeepDispla";
_mkeepdisplayvalues = BA.ObjectToString(_props.GetDefault((Object)("KeepDisplayValues"),(Object)("NONE")));
 //BA.debugLineNum = 357;BA.debugLine="mHChartsXScaleOnTop = Props.GetDefault(\"HChartsXS";
_mhchartsxscaleontop = BA.ObjectToBoolean(_props.GetDefault((Object)("HChartsXScaleOnTop"),(Object)(__c.False)));
 //BA.debugLineNum = 358;BA.debugLine="mHChartsTicksTopDown = Props.GetDefault(\"HChartsT";
_mhchartstickstopdown = BA.ObjectToBoolean(_props.GetDefault((Object)("HChartsTicksTopDown"),(Object)(__c.False)));
 //BA.debugLineNum = 359;BA.debugLine="mYXChartDisplayValues = Props.GetDefault(\"YXChart";
_myxchartdisplayvalues = BA.ObjectToBoolean(_props.GetDefault((Object)("YXChartDisplayValues"),(Object)(__c.False)));
 //BA.debugLineNum = 360;BA.debugLine="mYXChartDisplayPosition = Props.GetDefault(\"YXCha";
_myxchartdisplayposition = BA.ObjectToString(_props.GetDefault((Object)("YXChartDisplayPosition"),(Object)("CURSOR")));
 //BA.debugLineNum = 361;BA.debugLine="mYXChartDisplayCrossHair = Props.GetDefault(\"YXCh";
_myxchartdisplaycrosshair = BA.ObjectToBoolean(_props.GetDefault((Object)("YXChartDisplayCrossHair"),(Object)(__c.False)));
 //BA.debugLineNum = 362;BA.debugLine="mYXChartCrossHairColor = xui.PaintOrColorToColor(";
_myxchartcrosshaircolor = _xui.PaintOrColorToColor(_props.GetDefault((Object)("YXChartCrossHairColor"),(Object)(_xui.Color_Black)));
 //BA.debugLineNum = 363;BA.debugLine="mYXChartCrossHairDeltaY =  Props.GetDefault(\"YXCh";
_myxchartcrosshairdeltay = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("YXChartCrossHairDeltaY"),(Object)(0))));
 //BA.debugLineNum = 364;BA.debugLine="mYXChartCrossHairDeltaY = DipToCurrent(mYXChartCr";
_myxchartcrosshairdeltay = __c.DipToCurrent(_myxchartcrosshairdeltay);
 //BA.debugLineNum = 365;BA.debugLine="Zoom.ScalesOnZoomedPart = Props.GetDefault(\"Scale";
_zoom.ScalesOnZoomedPart /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ScalesOnZoomedPart"),(Object)(__c.False)));
 //BA.debugLineNum = 366;BA.debugLine="Graph.AreaFillAlphaValue = Props.GetDefault(\"Area";
_graph.AreaFillAlphaValue /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("AreaFillAlphaValue"),(Object)(64))));
 //BA.debugLineNum = 367;BA.debugLine="Graph.AreaFillAlphaValue = (256 - Graph.AreaFillA";
_graph.AreaFillAlphaValue /*int*/  = (int) ((256-_graph.AreaFillAlphaValue /*int*/ )*16777216);
 //BA.debugLineNum = 368;BA.debugLine="Bar.WickColor = xui.PaintOrColorToColor(Props.Get";
_bar.WickColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("CandleWickColor"),(Object)(((int)0xff0000ff))));
 //BA.debugLineNum = 369;BA.debugLine="Bar.WickWidth = Props.GetDefault(\"CandleWickWidth";
_bar.WickWidth /*int*/  = (int) ((double)(BA.ObjectToNumber(_props.GetDefault((Object)("CandleWickWidth"),(Object)(2))))*_xui.getScale());
 //BA.debugLineNum = 370;BA.debugLine="Bar.IncreaseColor = xui.PaintOrColorToColor(Props";
_bar.IncreaseColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("IncreaseColor"),(Object)(((int)0xff008800))));
 //BA.debugLineNum = 371;BA.debugLine="Bar.DecreaseColor = xui.PaintOrColorToColor(Props";
_bar.DecreaseColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("DecreaseColor"),(Object)(((int)0xffff0000))));
 //BA.debugLineNum = 372;BA.debugLine="Bar.DrawBodyBorder = Props.GetDefault(\"CandleDraw";
_bar.DrawBodyBorder /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("CandleDrawBodyBorder"),(Object)(__c.False)));
 //BA.debugLineNum = 373;BA.debugLine="Bar.TotalBarColor = xui.PaintOrColorToColor(Props";
_bar.TotalBarColor /*int*/  = _xui.PaintOrColorToColor(_props.GetDefault((Object)("CandleWickColor"),(Object)(((int)0xff0000ff))));
 //BA.debugLineNum = 374;BA.debugLine="Bar.CandleDisplayVolume = Props.GetDefault(\"Candl";
_bar.CandleDisplayVolume /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("CandleDisplayVolume"),(Object)(__c.False)));
 //BA.debugLineNum = 376;BA.debugLine="mBubbleDiameterMin = Props.GetDefault(\"BubbleDiam";
_mbubblediametermin = (double)(BA.ObjectToNumber(_props.GetDefault((Object)("BubbleDiameterMin"),(Object)(1))));
 //BA.debugLineNum = 377;BA.debugLine="mBubbleDiameterMax = Props.GetDefault(\"BubbleDiam";
_mbubblediametermax = (double)(BA.ObjectToNumber(_props.GetDefault((Object)("BubbleDiameterMax"),(Object)(10))));
 //BA.debugLineNum = 378;BA.debugLine="mBubbleSmallSnap = Props.GetDefault(\"BubbleSmallS";
_mbubblesmallsnap = BA.ObjectToBoolean(_props.GetDefault((Object)("BubbleSmallSnap"),(Object)(__c.False)));
 //BA.debugLineNum = 380;BA.debugLine="xpnlGraph = xui.CreatePanel(\"xpnlGraph\")";
_xpnlgraph = _xui.CreatePanel(ba,"xpnlGraph");
 //BA.debugLineNum = 381;BA.debugLine="mBase.AddView(xpnlGraph, 0, 0, mBase.Width, mBase";
_mbase.AddView((android.view.View)(_xpnlgraph.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 382;BA.debugLine="xcvsGraph.Initialize(xpnlGraph)";
_xcvsgraph.Initialize(_xpnlgraph);
 //BA.debugLineNum = 384;BA.debugLine="xpnlCursor = xui.CreatePanel(\"xpnlCursor\")";
_xpnlcursor = _xui.CreatePanel(ba,"xpnlCursor");
 //BA.debugLineNum = 385;BA.debugLine="mBase.AddView(xpnlCursor, 0, 0, mBase.Width, mBas";
_mbase.AddView((android.view.View)(_xpnlcursor.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 386;BA.debugLine="xcvsCursor.Initialize(xpnlCursor)";
_xcvscursor.Initialize(_xpnlcursor);
 //BA.debugLineNum = 388;BA.debugLine="xpnlZoomBar = xui.CreatePanel(\"xpnlZoomBar\")";
_xpnlzoombar = _xui.CreatePanel(ba,"xpnlZoomBar");
 //BA.debugLineNum = 389;BA.debugLine="mBase.AddView(xpnlZoomBar, 0, mBase.Height - 20di";
_mbase.AddView((android.view.View)(_xpnlzoombar.getObject()),(int) (0),(int) (_mbase.getHeight()-__c.DipToCurrent((int) (20))),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 390;BA.debugLine="ZoomBarInit";
_zoombarinit();
 //BA.debugLineNum = 392;BA.debugLine="xpnlValues = xui.CreatePanel(\"\")";
_xpnlvalues = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 393;BA.debugLine="mBase.AddView(xpnlValues, 0, 0, 100dip, 100dip)";
_mbase.AddView((android.view.View)(_xpnlvalues.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 394;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 395;BA.debugLine="xcvsValues.Initialize(xpnlValues)";
_xcvsvalues.Initialize(_xpnlvalues);
 //BA.debugLineNum = 397;BA.debugLine="BMVNFUsed = False";
_bmvnfused = __c.False;
 //BA.debugLineNum = 398;BA.debugLine="BMVNF.MinimumIntegers = 1";
_bmvnf.MinimumIntegers /*int*/  = (int) (1);
 //BA.debugLineNum = 399;BA.debugLine="BMVNF.MaximumFractions = 2";
_bmvnf.MaximumFractions /*int*/  = (int) (2);
 //BA.debugLineNum = 400;BA.debugLine="BMVNF.MinimumFractions = 2";
_bmvnf.MinimumFractions /*int*/  = (int) (2);
 //BA.debugLineNum = 401;BA.debugLine="BMVNF.GroupingUsed = False";
_bmvnf.GroupingUsed /*boolean*/  = __c.False;
 //BA.debugLineNum = 403;BA.debugLine="Zoom.SmallStep = 1";
_zoom.SmallStep /*int*/  = (int) (1);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return "";
}
public String  _drawarea() throws Exception{
int _i = 0;
int _ip = 0;
int _l = 0;
int _myaxis0 = 0;
anywheresoftware.b4a.objects.collections.List[] _lstcoords = null;
double _smax = 0;
double _smin = 0;
double _smean = 0;
b4a.example.xchart._itemdata _id = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _ptharea = null;
b4a.example.xchart._pointdata _pd = null;
int[] _coords = null;
int[] _coords0 = null;
int[] _coords1 = null;
 //BA.debugLineNum = 3930;BA.debugLine="Private Sub DrawArea";
 //BA.debugLineNum = 3931;BA.debugLine="Private i, ip, l, mYAxis0 As Int";
_i = 0;
_ip = 0;
_l = 0;
_myaxis0 = 0;
 //BA.debugLineNum = 3932;BA.debugLine="Private lstCoords(Items.Size) As List";
_lstcoords = new anywheresoftware.b4a.objects.collections.List[_items.getSize()];
{
int d0 = _lstcoords.length;
for (int i0 = 0;i0 < d0;i0++) {
_lstcoords[i0] = new anywheresoftware.b4a.objects.collections.List();
}
}
;
 //BA.debugLineNum = 3934;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 3935;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 3937;BA.debugLine="If Items.Size = 1 And (MinMaxMeanValues(0) <> 0 O";
if (_items.getSize()==1 && (_minmaxmeanvalues[(int) (0)]!=0 || _minmaxmeanvalues[(int) (1)]!=0)) { 
 //BA.debugLineNum = 3938;BA.debugLine="Private sMax, sMin, sMean As Double";
_smax = 0;
_smin = 0;
_smean = 0;
 //BA.debugLineNum = 3939;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3940;BA.debugLine="sMin = Graph.Bottom - (MinMaxMeanValues(0) - Sc";
_smin = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3941;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMin, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smin),(float) (_graph.Right /*int*/ ),(float) (_smin),_graph.MinLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3943;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3944;BA.debugLine="sMax = Graph.Bottom - (MinMaxMeanValues(1) - Sc";
_smax = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3945;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMax, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smax),(float) (_graph.Right /*int*/ ),(float) (_smax),_graph.MaxLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3947;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3948;BA.debugLine="sMean = Graph.Bottom - (MinMaxMeanValues(2) - S";
_smean = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (2)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3949;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMean, Graph.Rig";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smean),(float) (_graph.Right /*int*/ ),(float) (_smean),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 //BA.debugLineNum = 3953;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 3954;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal * S";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else if(_scale[_sy[(int) (0)]].MinVal /*double*/ <0) { 
 //BA.debugLineNum = 3956;BA.debugLine="mYAxis0 = Graph.Top";
_myaxis0 = _graph.Top /*int*/ ;
 }else {
 //BA.debugLineNum = 3958;BA.debugLine="mYAxis0 = Graph.Bottom";
_myaxis0 = _graph.Bottom /*int*/ ;
 };
 //BA.debugLineNum = 3962;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 3963;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step28 = 1;
final int limit28 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit28 ;_l = _l + step28 ) {
 //BA.debugLineNum = 3964;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 3965;BA.debugLine="Private pthArea As B4XPath";
_ptharea = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 3967;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 3968;BA.debugLine="If ID.HideLine = False Then";
if (_id.HideLine /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3969;BA.debugLine="lstCoords(l).Initialize";
_lstcoords[_l].Initialize();
 //BA.debugLineNum = 3970;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step34 = 1;
final int limit34 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit34 ;_i = _i + step34 ) {
 //BA.debugLineNum = 3971;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3973;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3974;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3975;BA.debugLine="If PD.YArray(l) <> mMissingDataValue Then";
if (_pd.YArray /*double[]*/ [_l]!=_mmissingdatavalue) { 
 //BA.debugLineNum = 3976;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 3977;BA.debugLine="Coords(0) = Graph.Left + ip * Scale(sX).Scale";
_coords[(int) (0)] = (int) (_graph.Left /*int*/ +_ip*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 3978;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3979;BA.debugLine="Coords(1) = Graph.Bottom - (PD.YArray(l) - S";
_coords[(int) (1)] = (int) (_graph.Bottom /*int*/ -(_pd.YArray /*double[]*/ [_l]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 3981;BA.debugLine="Coords(1) = Graph.Top + (PD.YArray(l) - Scal";
_coords[(int) (1)] = (int) (_graph.Top /*int*/ +(_pd.YArray /*double[]*/ [_l]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 3983;BA.debugLine="lstCoords(l).Add(Coords)";
_lstcoords[_l].Add((Object)(_coords));
 };
 }
};
 //BA.debugLineNum = 3987;BA.debugLine="pthArea.Initialize(Graph.Left, Graph.Bottom)";
_ptharea.Initialize((float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 3988;BA.debugLine="For i = 0 To lstCoords(l).Size - 1";
{
final int step50 = 1;
final int limit50 = (int) (_lstcoords[_l].getSize()-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
 //BA.debugLineNum = 3989;BA.debugLine="Private Coords0(2) As Int";
_coords0 = new int[(int) (2)];
;
 //BA.debugLineNum = 3990;BA.debugLine="Coords0 = lstCoords(l).Get(i)";
_coords0 = (int[])(_lstcoords[_l].Get(_i));
 //BA.debugLineNum = 3991;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 3992;BA.debugLine="pthArea.Initialize(Coords0(0), mYAxis0)";
_ptharea.Initialize((float) (_coords0[(int) (0)]),(float) (_myaxis0));
 };
 //BA.debugLineNum = 3994;BA.debugLine="pthArea.LineTo(Coords0(0), Coords0(1))";
_ptharea.LineTo((float) (_coords0[(int) (0)]),(float) (_coords0[(int) (1)]));
 }
};
 //BA.debugLineNum = 3996;BA.debugLine="pthArea.LineTo(Coords0(0), mYAxis0)";
_ptharea.LineTo((float) (_coords0[(int) (0)]),(float) (_myaxis0));
 //BA.debugLineNum = 3997;BA.debugLine="pthArea.LineTo(Graph.Left, mYAxis0)";
_ptharea.LineTo((float) (_graph.Left /*int*/ ),(float) (_myaxis0));
 //BA.debugLineNum = 3999;BA.debugLine="xcvsGraph.DrawPath(pthArea, ID.Color - Graph.Ar";
_xcvsgraph.DrawPath(_ptharea,(int) (_id.Color /*int*/ -_graph.AreaFillAlphaValue /*int*/ ),__c.True,(float) (_id.StrokeWidth /*int*/ ));
 };
 }
};
 //BA.debugLineNum = 4002;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4004;BA.debugLine="DrawGridV	'draws the grid above the paths";
_drawgridv();
 //BA.debugLineNum = 4007;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4008;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step66 = 1;
final int limit66 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit66 ;_l = _l + step66 ) {
 //BA.debugLineNum = 4009;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 4010;BA.debugLine="If ID.HideLine = False Then";
if (_id.HideLine /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4011;BA.debugLine="For i = 1 To lstCoords(l).Size - 1";
{
final int step69 = 1;
final int limit69 = (int) (_lstcoords[_l].getSize()-1);
_i = (int) (1) ;
for (;_i <= limit69 ;_i = _i + step69 ) {
 //BA.debugLineNum = 4012;BA.debugLine="Private Coords0(2), Coords1(2) As Int";
_coords0 = new int[(int) (2)];
;
_coords1 = new int[(int) (2)];
;
 //BA.debugLineNum = 4013;BA.debugLine="Coords0 = lstCoords(l).Get(i - 1)";
_coords0 = (int[])(_lstcoords[_l].Get((int) (_i-1)));
 //BA.debugLineNum = 4014;BA.debugLine="Coords1 = lstCoords(l).Get(i)";
_coords1 = (int[])(_lstcoords[_l].Get(_i));
 //BA.debugLineNum = 4015;BA.debugLine="xcvsGraph.DrawLine(Coords0(0), Coords0(1), Coo";
_xcvsgraph.DrawLine((float) (_coords0[(int) (0)]),(float) (_coords0[(int) (1)]),(float) (_coords1[(int) (0)]),(float) (_coords1[(int) (1)]),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 }
};
 //BA.debugLineNum = 4019;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 4020;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step76 = 1;
final int limit76 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit76 ;_l = _l + step76 ) {
 //BA.debugLineNum = 4021;BA.debugLine="For i = 0 To lstCoords(l).Size - 1";
{
final int step77 = 1;
final int limit77 = (int) (_lstcoords[_l].getSize()-1);
_i = (int) (0) ;
for (;_i <= limit77 ;_i = _i + step77 ) {
 //BA.debugLineNum = 4022;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 4023;BA.debugLine="Coords = lstCoords(l).Get(i)";
_coords = (int[])(_lstcoords[_l].Get(_i));
 //BA.debugLineNum = 4024;BA.debugLine="DrawPoint(Coords(0), Coords(1), ID.PointColo";
_drawpoint(_coords[(int) (0)],_coords[(int) (1)],_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }
};
 }
};
 };
 };
 }
};
 //BA.debugLineNum = 4030;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4032;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4033;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4034;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4036;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 4040;BA.debugLine="If HLines.Size > 0 And Scale(sY(0)).Different = F";
if (_hlines.getSize()>0 && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4041;BA.debugLine="DrawHorizontalLinesValue";
_drawhorizontallinesvalue();
 };
 //BA.debugLineNum = 4044;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Zoom.NbVisi";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _zoom.NbVisiblePoints /*int*/ >0) { 
 //BA.debugLineNum = 4045;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 4048;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 4049;BA.debugLine="End Sub";
return "";
}
public String  _drawbarmeanlineh() throws Exception{
b4a.example.xchart._pointdata _pd = null;
int _i = 0;
int _smean = 0;
int _ip0 = 0;
int _ip1 = 0;
int _nbp = 0;
double _total = 0;
double _mean = 0;
 //BA.debugLineNum = 5302;BA.debugLine="Private Sub DrawBarMeanLineH";
 //BA.debugLineNum = 5303;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 5305;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5306;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 5308;BA.debugLine="If PD.YArray.Length > 1 Then Return";
if (_pd.YArray /*double[]*/ .length>1) { 
if (true) return "";};
 //BA.debugLineNum = 5310;BA.debugLine="Private i, sMean, iP0, iP1, NbP As Int";
_i = 0;
_smean = 0;
_ip0 = 0;
_ip1 = 0;
_nbp = 0;
 //BA.debugLineNum = 5311;BA.debugLine="Private Total, Mean As Double";
_total = 0;
_mean = 0;
 //BA.debugLineNum = 5312;BA.debugLine="If Zoom.ScalesOnZoomedPart = False Then";
if (_zoom.ScalesOnZoomedPart /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 5313;BA.debugLine="iP0 = 0";
_ip0 = (int) (0);
 //BA.debugLineNum = 5314;BA.debugLine="iP1 = Points.Size - 1";
_ip1 = (int) (_points.getSize()-1);
 //BA.debugLineNum = 5315;BA.debugLine="NbP = Points.Size";
_nbp = _points.getSize();
 }else {
 //BA.debugLineNum = 5317;BA.debugLine="iP0 = Zoom.BeginIndex";
_ip0 = _zoom.BeginIndex /*int*/ ;
 //BA.debugLineNum = 5318;BA.debugLine="iP1 = Zoom.EndIndex";
_ip1 = _zoom.EndIndex /*int*/ ;
 //BA.debugLineNum = 5319;BA.debugLine="NbP = Zoom.NbVisiblePoints";
_nbp = _zoom.NbVisiblePoints /*int*/ ;
 };
 //BA.debugLineNum = 5322;BA.debugLine="For i = iP0 To iP1";
{
final int step16 = 1;
final int limit16 = _ip1;
_i = _ip0 ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 5323;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5324;BA.debugLine="Total = Total + PD.YArray(0)";
_total = _total+_pd.YArray /*double[]*/ [(int) (0)];
 }
};
 //BA.debugLineNum = 5326;BA.debugLine="Mean = Total / NbP";
_mean = _total/(double)_nbp;
 //BA.debugLineNum = 5328;BA.debugLine="sMean = Graph.Left + (Mean - Scale(sY(0)).MinVal)";
_smean = (int) (_graph.Left /*int*/ +(_mean-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5330;BA.debugLine="xcvsGraph.DrawLine(sMean, Graph.Top, sMean, Graph";
_xcvsgraph.DrawLine((float) (_smean),(float) (_graph.Top /*int*/ ),(float) (_smean),(float) (_graph.Bottom /*int*/ ),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 5332;BA.debugLine="End Sub";
return "";
}
public String  _drawbarmeanlinev() throws Exception{
b4a.example.xchart._pointdata _pd = null;
int _i = 0;
int _smean = 0;
int _ip0 = 0;
int _ip1 = 0;
int _nbp = 0;
double _total = 0;
double _mean = 0;
 //BA.debugLineNum = 5160;BA.debugLine="Private Sub DrawBarMeanLineV";
 //BA.debugLineNum = 5161;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 5163;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5164;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 5166;BA.debugLine="If PD.YArray.Length > 1 Then Return";
if (_pd.YArray /*double[]*/ .length>1) { 
if (true) return "";};
 //BA.debugLineNum = 5168;BA.debugLine="Private i, sMean, iP0, iP1, NbP As Int";
_i = 0;
_smean = 0;
_ip0 = 0;
_ip1 = 0;
_nbp = 0;
 //BA.debugLineNum = 5169;BA.debugLine="Private Total, Mean As Double";
_total = 0;
_mean = 0;
 //BA.debugLineNum = 5170;BA.debugLine="If Zoom.ScalesOnZoomedPart = False Then";
if (_zoom.ScalesOnZoomedPart /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 5171;BA.debugLine="iP0 = 0";
_ip0 = (int) (0);
 //BA.debugLineNum = 5172;BA.debugLine="iP1 = Points.Size - 1";
_ip1 = (int) (_points.getSize()-1);
 //BA.debugLineNum = 5173;BA.debugLine="NbP = Points.Size";
_nbp = _points.getSize();
 }else {
 //BA.debugLineNum = 5175;BA.debugLine="iP0 = Zoom.BeginIndex";
_ip0 = _zoom.BeginIndex /*int*/ ;
 //BA.debugLineNum = 5176;BA.debugLine="iP1 = Zoom.EndIndex";
_ip1 = _zoom.EndIndex /*int*/ ;
 //BA.debugLineNum = 5177;BA.debugLine="NbP = Zoom.NbVisiblePoints";
_nbp = _zoom.NbVisiblePoints /*int*/ ;
 };
 //BA.debugLineNum = 5179;BA.debugLine="For i = iP0 To iP1";
{
final int step16 = 1;
final int limit16 = _ip1;
_i = _ip0 ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 5180;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5181;BA.debugLine="Total = Total + PD.YArray(0)";
_total = _total+_pd.YArray /*double[]*/ [(int) (0)];
 }
};
 //BA.debugLineNum = 5183;BA.debugLine="Mean = Total / NbP";
_mean = _total/(double)_nbp;
 //BA.debugLineNum = 5184;BA.debugLine="sMean = Graph.Bottom - (Mean - Scale(sY(0)).MinVa";
_smean = (int) (_graph.Bottom /*int*/ -(_mean-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5186;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMean, Graph.Right";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smean),(float) (_graph.Right /*int*/ ),(float) (_smean),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 5187;BA.debugLine="End Sub";
return "";
}
public String  _drawbarmeanlinevalueh() throws Exception{
b4a.example.xchart._pointdata _pd = null;
int _i = 0;
int _smean = 0;
int _smean0 = 0;
int _h = 0;
int _y0 = 0;
int _x0 = 0;
int _ip0 = 0;
int _ip1 = 0;
int _nbp = 0;
double _total = 0;
double _mean = 0;
int _ip = 0;
String _txt = "";
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rcttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rctmean = null;
double _txtw = 0;
double _txtx0 = 0;
double _txtx1 = 0;
 //BA.debugLineNum = 5336;BA.debugLine="Private Sub DrawBarMeanLineValueH";
 //BA.debugLineNum = 5337;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 5339;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5340;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 5342;BA.debugLine="If PD.YArray.Length > 1 Then Return";
if (_pd.YArray /*double[]*/ .length>1) { 
if (true) return "";};
 //BA.debugLineNum = 5344;BA.debugLine="Private i, sMean, sMean0, h, y0, x0, iP0, iP1, Nb";
_i = 0;
_smean = 0;
_smean0 = 0;
_h = 0;
_y0 = 0;
_x0 = 0;
_ip0 = 0;
_ip1 = 0;
_nbp = 0;
 //BA.debugLineNum = 5345;BA.debugLine="Private Total, Mean As Double";
_total = 0;
_mean = 0;
 //BA.debugLineNum = 5346;BA.debugLine="If Zoom.ScalesOnZoomedPart = False Then";
if (_zoom.ScalesOnZoomedPart /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 5347;BA.debugLine="iP0 = 0";
_ip0 = (int) (0);
 //BA.debugLineNum = 5348;BA.debugLine="iP1 = Points.Size - 1";
_ip1 = (int) (_points.getSize()-1);
 //BA.debugLineNum = 5349;BA.debugLine="NbP = Points.Size";
_nbp = _points.getSize();
 }else {
 //BA.debugLineNum = 5351;BA.debugLine="iP0 = Zoom.BeginIndex";
_ip0 = _zoom.BeginIndex /*int*/ ;
 //BA.debugLineNum = 5352;BA.debugLine="iP1 = Zoom.EndIndex";
_ip1 = _zoom.EndIndex /*int*/ ;
 //BA.debugLineNum = 5353;BA.debugLine="NbP = Zoom.NbVisiblePoints";
_nbp = _zoom.NbVisiblePoints /*int*/ ;
 };
 //BA.debugLineNum = 5356;BA.debugLine="For i = iP0 To iP1";
{
final int step16 = 1;
final int limit16 = _ip1;
_i = _ip0 ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 5357;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5358;BA.debugLine="Total = Total + PD.YArray(0)";
_total = _total+_pd.YArray /*double[]*/ [(int) (0)];
 }
};
 //BA.debugLineNum = 5360;BA.debugLine="Mean = Total / NbP";
_mean = _total/(double)_nbp;
 //BA.debugLineNum = 5361;BA.debugLine="sMean0 = Mean * Scale(sY(0)).Scale";
_smean0 = (int) (_mean*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5362;BA.debugLine="sMean = Graph.Left + (Mean - Scale(sY(0)).MinVal)";
_smean = (int) (_graph.Left /*int*/ +(_mean-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5364;BA.debugLine="If Scale(sY(0)).MinVal = 0 And Scale(sY(0)).MaxVa";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ ==0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 5365;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step24 = 1;
final int limit24 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 5366;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5367;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5369;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5370;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5371;BA.debugLine="h = PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5372;BA.debugLine="x0 = sMean + 1.35 * Texts.ScaleTextHeight";
_x0 = (int) (_smean+1.35*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5373;BA.debugLine="If sMean0 > h + 0.75 * Texts.ScaleTextHeight Th";
if (_smean0>_h+0.75*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5374;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5375;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - (ip + 0.5";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5377;BA.debugLine="y0 = Graph.Top + Graph.XOffset + (ip + 0.5) *";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 5379;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 5382;BA.debugLine="If i > Zoom.EndIndex Then";
if (_i>_zoom.EndIndex /*int*/ ) { 
 //BA.debugLineNum = 5383;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5384;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - 0.5 * Grap";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -0.5*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5386;BA.debugLine="y0 = Graph.Top + Graph.XOffset + 0.5 * Graph.Y";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +0.5*_graph.YInterval /*int*/ );
 };
 };
 }else if(_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5390;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step48 = 1;
final int limit48 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit48 ;_i = _i + step48 ) {
 //BA.debugLineNum = 5391;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5392;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5394;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5395;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5396;BA.debugLine="h = -PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (-_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5397;BA.debugLine="x0 = sMean - 0.3 * Texts.ScaleTextHeight";
_x0 = (int) (_smean-0.3*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5398;BA.debugLine="If -sMean0 > h + 0.3 * Texts.ScaleTextHeight Th";
if (-_smean0>_h+0.3*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5399;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5400;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - (ip + 0.5";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5402;BA.debugLine="y0 = Graph.Top + Graph.XOffset + (ip + 0.5) *";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 5404;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 5407;BA.debugLine="If i > Zoom.EndIndex Then";
if (_i>_zoom.EndIndex /*int*/ ) { 
 //BA.debugLineNum = 5408;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5409;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - 0.5 * Grap";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -0.5*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5411;BA.debugLine="y0 = Graph.Top + Graph.XOffset + 0.5 * Graph.Y";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +0.5*_graph.YInterval /*int*/ );
 };
 };
 }else {
 //BA.debugLineNum = 5415;BA.debugLine="If Mean >= 0 Then";
if (_mean>=0) { 
 //BA.debugLineNum = 5416;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step73 = 1;
final int limit73 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit73 ;_i = _i + step73 ) {
 //BA.debugLineNum = 5417;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5418;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5420;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5421;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5422;BA.debugLine="h = PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5423;BA.debugLine="x0 = sMean - 1.45 * Texts.ScaleTextHeight";
_x0 = (int) (_smean-1.45*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5424;BA.debugLine="If Mean >= 0 And sMean0 > h + 0.75 * Texts.Sca";
if (_mean>=0 && _smean0>_h+0.75*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5425;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5426;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - (ip  + 0";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5428;BA.debugLine="y0 = Graph.Top + Graph.XOffset + (ip + 0.5)";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 5430;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 5433;BA.debugLine="If i > Zoom.EndIndex Then";
if (_i>_zoom.EndIndex /*int*/ ) { 
 //BA.debugLineNum = 5434;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5435;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - 0.5 * Gra";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -0.5*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5437;BA.debugLine="y0 = Graph.Top + Graph.XOffset + 0.5 * Graph.";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +0.5*_graph.YInterval /*int*/ );
 };
 };
 }else {
 //BA.debugLineNum = 5441;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step97 = 1;
final int limit97 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit97 ;_i = _i + step97 ) {
 //BA.debugLineNum = 5442;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5443;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5445;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5446;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5447;BA.debugLine="h = -PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (-_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5448;BA.debugLine="x0 = sMean + 0.3 * Texts.ScaleTextHeight";
_x0 = (int) (_smean+0.3*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5449;BA.debugLine="If Mean < 0 And -sMean0 > h + 0.3 * Texts.Scal";
if (_mean<0 && -_smean0>_h+0.3*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5450;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5451;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - (ip + 0.";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5453;BA.debugLine="y0 = Graph.Top + Graph.XOffset + (ip + 0.5)";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 5455;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 5458;BA.debugLine="If i > Zoom.EndIndex Then";
if (_i>_zoom.EndIndex /*int*/ ) { 
 //BA.debugLineNum = 5459;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5460;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - 0.5 * Gra";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -0.5*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 5462;BA.debugLine="y0 = Graph.Top + Graph.XOffset + 0.5 * Graph.";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +0.5*_graph.YInterval /*int*/ );
 };
 };
 };
 };
 //BA.debugLineNum = 5468;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 5469;BA.debugLine="Private rctText, rctMean As B4XRect";
_rcttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rctmean = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5470;BA.debugLine="Private txtW, txtX0, txtX1 As Double";
_txtw = 0;
_txtx0 = 0;
_txtx1 = 0;
 //BA.debugLineNum = 5471;BA.debugLine="If BMVNFUsed = False Then";
if (_bmvnfused==__c.False) { 
 //BA.debugLineNum = 5472;BA.debugLine="txt = NumberFormat3(Mean, 6)";
_txt = _numberformat3(_mean,(int) (6));
 }else {
 //BA.debugLineNum = 5474;BA.debugLine="txt = NumberFormat2(Mean, BMVNF.MinimumIntegers,";
_txt = __c.NumberFormat2(_mean,_bmvnf.MinimumIntegers /*int*/ ,_bmvnf.MaximumFractions /*int*/ ,_bmvnf.MinimumFractions /*int*/ ,_bmvnf.GroupingUsed /*boolean*/ );
 };
 //BA.debugLineNum = 5476;BA.debugLine="rctText = xcvsGraph.MeasureText(txt, Texts.ScaleF";
_rcttext = _xcvsgraph.MeasureText(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5477;BA.debugLine="txtW = 4dip + rctText.Width";
_txtw = __c.DipToCurrent((int) (4))+_rcttext.getWidth();
 //BA.debugLineNum = 5478;BA.debugLine="txtX0 = x0 + 1.2 * rctText.Top";
_txtx0 = _x0+1.2*_rcttext.getTop();
 //BA.debugLineNum = 5479;BA.debugLine="txtX1 = txtX0 + 1.3 * rctText.Height";
_txtx1 = _txtx0+1.3*_rcttext.getHeight();
 //BA.debugLineNum = 5480;BA.debugLine="rctMean.Initialize(txtX0, y0 - txtW / 2, txtX1, y";
_rctmean.Initialize((float) (_txtx0),(float) (_y0-_txtw/(double)2),(float) (_txtx1),(float) (_y0+_txtw/(double)2));
 //BA.debugLineNum = 5481;BA.debugLine="If y0 + txtW / 2 + 3dip >= Graph.Bottom Then";
if (_y0+_txtw/(double)2+__c.DipToCurrent((int) (3))>=_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 5482;BA.debugLine="rctMean.Top = Graph.Bottom - txtW -3dip";
_rctmean.setTop((float) (_graph.Bottom /*int*/ -_txtw-__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 5483;BA.debugLine="rctMean.Height = txtW";
_rctmean.setHeight((float) (_txtw));
 };
 //BA.debugLineNum = 5486;BA.debugLine="xcvsGraph.DrawRect(rctMean, Graph.ChartBackground";
_xcvsgraph.DrawRect(_rctmean,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 5487;BA.debugLine="xcvsGraph.DrawTextRotated(txt, x0, y0, Texts.Scal";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_x0),(float) (_y0),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MeanLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"),(float) (-90));
 //BA.debugLineNum = 5488;BA.debugLine="End Sub";
return "";
}
public String  _drawbarmeanlinevaluev() throws Exception{
b4a.example.xchart._pointdata _pd = null;
int _i = 0;
int _smean = 0;
int _smean0 = 0;
int _h = 0;
int _x0 = 0;
int _y0 = 0;
int _yt = 0;
int _ip0 = 0;
int _ip1 = 0;
int _nbp = 0;
double _total = 0;
double _mean = 0;
int _ip = 0;
String _txt = "";
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rcttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rctmean = null;
double _txtw = 0;
double _txth = 0;
 //BA.debugLineNum = 5191;BA.debugLine="Private Sub DrawBarMeanLineValueV";
 //BA.debugLineNum = 5192;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 5194;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5195;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 5197;BA.debugLine="If PD.YArray.Length > 1 Then Return";
if (_pd.YArray /*double[]*/ .length>1) { 
if (true) return "";};
 //BA.debugLineNum = 5199;BA.debugLine="Private i, sMean, sMean0, h, x0, y0, yt, iP0, iP1";
_i = 0;
_smean = 0;
_smean0 = 0;
_h = 0;
_x0 = 0;
_y0 = 0;
_yt = 0;
_ip0 = 0;
_ip1 = 0;
_nbp = 0;
 //BA.debugLineNum = 5200;BA.debugLine="Private Total, Mean As Double";
_total = 0;
_mean = 0;
 //BA.debugLineNum = 5201;BA.debugLine="If Zoom.ScalesOnZoomedPart = False Then";
if (_zoom.ScalesOnZoomedPart /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 5202;BA.debugLine="iP0 = 0";
_ip0 = (int) (0);
 //BA.debugLineNum = 5203;BA.debugLine="iP1 = Points.Size - 1";
_ip1 = (int) (_points.getSize()-1);
 //BA.debugLineNum = 5204;BA.debugLine="NbP = Points.Size";
_nbp = _points.getSize();
 }else {
 //BA.debugLineNum = 5206;BA.debugLine="iP0 = Zoom.BeginIndex";
_ip0 = _zoom.BeginIndex /*int*/ ;
 //BA.debugLineNum = 5207;BA.debugLine="iP1 = Zoom.EndIndex";
_ip1 = _zoom.EndIndex /*int*/ ;
 //BA.debugLineNum = 5208;BA.debugLine="NbP = Zoom.NbVisiblePoints";
_nbp = _zoom.NbVisiblePoints /*int*/ ;
 };
 //BA.debugLineNum = 5211;BA.debugLine="For iP0 = 0 To iP1";
{
final int step16 = 1;
final int limit16 = _ip1;
_ip0 = (int) (0) ;
for (;_ip0 <= limit16 ;_ip0 = _ip0 + step16 ) {
 //BA.debugLineNum = 5212;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5213;BA.debugLine="Total = Total + PD.YArray(0)";
_total = _total+_pd.YArray /*double[]*/ [(int) (0)];
 }
};
 //BA.debugLineNum = 5215;BA.debugLine="Mean = Total / NbP";
_mean = _total/(double)_nbp;
 //BA.debugLineNum = 5216;BA.debugLine="sMean0 = Mean * Scale(sY(0)).Scale";
_smean0 = (int) (_mean*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5217;BA.debugLine="sMean = Graph.Bottom - (Mean - Scale(sY(0)).MinVa";
_smean = (int) (_graph.Bottom /*int*/ -(_mean-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5219;BA.debugLine="If Scale(sY(0)).MinVal = 0 And Scale(sY(0)).MaxVa";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ ==0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 5220;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step24 = 1;
final int limit24 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 5221;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5222;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5224;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5225;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5226;BA.debugLine="h = PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5227;BA.debugLine="If sMean0 > h + 0.75 * Texts.ScaleTextHeight Th";
if (_smean0>_h+0.75*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5228;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip  + 0.5)";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 5229;BA.debugLine="y0 = sMean - 1.35 * Texts.ScaleTextHeight";
_y0 = (int) (_smean-1.35*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5230;BA.debugLine="yt = sMean - 0.3 * Texts.ScaleTextHeight";
_yt = (int) (_smean-0.3*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5231;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else if(_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5235;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step38 = 1;
final int limit38 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit38 ;_i = _i + step38 ) {
 //BA.debugLineNum = 5236;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5237;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5239;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5240;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5241;BA.debugLine="h = -PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (-_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5242;BA.debugLine="If -sMean0 > h + 0.3 * Texts.ScaleTextHeight Th";
if (-_smean0>_h+0.3*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5243;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip  + 0.5)";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 5244;BA.debugLine="y0 = sMean + 0.3 * Texts.ScaleTextHeight";
_y0 = (int) (_smean+0.3*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5245;BA.debugLine="yt = sMean + 1.2 * Texts.ScaleTextHeight";
_yt = (int) (_smean+1.2*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5246;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
 //BA.debugLineNum = 5250;BA.debugLine="If Mean >= 0 Then";
if (_mean>=0) { 
 //BA.debugLineNum = 5251;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step53 = 1;
final int limit53 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit53 ;_i = _i + step53 ) {
 //BA.debugLineNum = 5252;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5253;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5255;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5256;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5257;BA.debugLine="h = PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5258;BA.debugLine="If Mean >= 0 And sMean0 > h + 0.75 * Texts.Sca";
if (_mean>=0 && _smean0>_h+0.75*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5259;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip  + 0.5)";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 5260;BA.debugLine="y0 = sMean - 1.45 * Texts.ScaleTextHeight";
_y0 = (int) (_smean-1.45*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5261;BA.debugLine="yt = sMean - 0.3 * Texts.ScaleTextHeight";
_yt = (int) (_smean-0.3*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5262;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
 //BA.debugLineNum = 5266;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step67 = 1;
final int limit67 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit67 ;_i = _i + step67 ) {
 //BA.debugLineNum = 5267;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5268;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5270;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5271;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5272;BA.debugLine="h = -PD.YArray(0) * Scale(sY(0)).Scale";
_h = (int) (-_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5273;BA.debugLine="If Mean < 0 And -sMean0 > h + 0.3 * Texts.Scal";
if (_mean<0 && -_smean0>_h+0.3*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5274;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip  + 0.5)";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 5275;BA.debugLine="y0 = sMean + 0.3 * Texts.ScaleTextHeight";
_y0 = (int) (_smean+0.3*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5276;BA.debugLine="yt = sMean + 1.2 * Texts.ScaleTextHeight";
_yt = (int) (_smean+1.2*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5277;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 };
 //BA.debugLineNum = 5283;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 5284;BA.debugLine="Private rctText, rctMean As B4XRect";
_rcttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rctmean = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5285;BA.debugLine="Private txtW, txtH As Double";
_txtw = 0;
_txth = 0;
 //BA.debugLineNum = 5286;BA.debugLine="If BMVNFUsed = False Then";
if (_bmvnfused==__c.False) { 
 //BA.debugLineNum = 5287;BA.debugLine="txt = NumberFormat3(Mean, 6)";
_txt = _numberformat3(_mean,(int) (6));
 }else {
 //BA.debugLineNum = 5289;BA.debugLine="txt = NumberFormat2(Mean, BMVNF.MinimumIntegers,";
_txt = __c.NumberFormat2(_mean,_bmvnf.MinimumIntegers /*int*/ ,_bmvnf.MaximumFractions /*int*/ ,_bmvnf.MinimumFractions /*int*/ ,_bmvnf.GroupingUsed /*boolean*/ );
 };
 //BA.debugLineNum = 5291;BA.debugLine="rctText = xcvsGraph.MeasureText(txt, Texts.ScaleF";
_rcttext = _xcvsgraph.MeasureText(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5292;BA.debugLine="txtW = 4dip + rctText.Width";
_txtw = __c.DipToCurrent((int) (4))+_rcttext.getWidth();
 //BA.debugLineNum = 5293;BA.debugLine="txtH = 1.2 * rctText.Height";
_txth = 1.2*_rcttext.getHeight();
 //BA.debugLineNum = 5294;BA.debugLine="rctMean.Initialize(x0 - txtW / 2, y0, x0 + txtW /";
_rctmean.Initialize((float) (_x0-_txtw/(double)2),(float) (_y0),(float) (_x0+_txtw/(double)2),(float) (_y0+_txth));
 //BA.debugLineNum = 5295;BA.debugLine="xcvsGraph.DrawRect(rctMean, Graph.ChartBackground";
_xcvsgraph.DrawRect(_rctmean,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 5296;BA.debugLine="xcvsGraph.DrawText(txt, x0, yt, Texts.ScaleFont,";
_xcvsgraph.DrawText(ba,_txt,(float) (_x0),(float) (_yt),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MeanLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 5298;BA.debugLine="End Sub";
return "";
}
public String  _drawbarsh() throws Exception{
int _i = 0;
int _j = 0;
int _x = 0;
int _h = 0;
int _y = 0;
int _y0 = 0;
int _sign = 0;
int[] _cols = null;
int[] _acols = null;
String[] _names = null;
String _gradientorientation = "";
b4a.example.xchart._itemdata _id = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
b4a.example.bitmapcreator _bmpcreate = null;
int _mxaxis0 = 0;
b4a.example.xchart._pointdata _pd = null;
int _ip = 0;
double[] _py = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rb = null;
b4a.example.bitmapcreator _bmc1 = null;
 //BA.debugLineNum = 4975;BA.debugLine="Private Sub DrawBarsH";
 //BA.debugLineNum = 4976;BA.debugLine="Private i, j, x, h, y, y0, Sign As Int";
_i = 0;
_j = 0;
_x = 0;
_h = 0;
_y = 0;
_y0 = 0;
_sign = 0;
 //BA.debugLineNum = 4977;BA.debugLine="Private Cols(Items.Size), ACols(Items.Size) As In";
_cols = new int[_items.getSize()];
;
_acols = new int[_items.getSize()];
;
 //BA.debugLineNum = 4978;BA.debugLine="Private Names(Items.Size), GradientOrientation As";
_names = new String[_items.getSize()];
java.util.Arrays.fill(_names,"");
_gradientorientation = "";
 //BA.debugLineNum = 4980;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 4981;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 4982;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 4983;BA.debugLine="Cols(i) = ID.Color";
_cols[_i] = _id.Color /*int*/ ;
 //BA.debugLineNum = 4984;BA.debugLine="Private ARGB As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 4985;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4986;BA.debugLine="BmpCreate.Initialize(10, 10)";
_bmpcreate._initialize(ba,(int) (10),(int) (10));
 //BA.debugLineNum = 4987;BA.debugLine="BmpCreate.ColorToARGB(Cols(i), ARGB)";
_bmpcreate._colortoargb(_cols[_i],_argb);
 //BA.debugLineNum = 4988;BA.debugLine="ACols(i) = xui.Color_ARGB(Graph.GradientColorsAl";
_acols[_i] = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 4989;BA.debugLine="Names(i) = ID.Name";
_names[_i] = _id.Name /*String*/ ;
 }
};
 //BA.debugLineNum = 4992;BA.debugLine="If Graph.ChartType = \"H_BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("H_BAR")) { 
 //BA.debugLineNum = 4993;BA.debugLine="Private mXAxis0 = Graph.Left - Scale(sY(0)).MinV";
_mxaxis0 = (int) (_graph.Left /*int*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4995;BA.debugLine="If Graph.IncludeBarMeanLine = True Then";
if (_graph.IncludeBarMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4996;BA.debugLine="DrawBarMeanLineH";
_drawbarmeanlineh();
 };
 //BA.debugLineNum = 4999;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outs";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 5000;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step21 = 1;
final int limit21 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 5001;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5002;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5004;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5005;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5006;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5007;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5009;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5010;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - (ip + 0.5)";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ +_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 5011;BA.debugLine="Sign = -1";
_sign = (int) (-1);
 }else {
 //BA.debugLineNum = 5013;BA.debugLine="y0 = Graph.Top + Graph.XOffset + (ip + 0.5) *";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ -_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 5014;BA.debugLine="Sign = 1";
_sign = (int) (1);
 };
 //BA.debugLineNum = 5017;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step35 = 1;
final int limit35 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit35 ;_j = _j + step35 ) {
 //BA.debugLineNum = 5018;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5019;BA.debugLine="y = y0 + j * Graph.BarSubWidth * Sign";
_y = (int) (_y0+_j*_graph.BarSubWidth /*int*/ *_sign);
 //BA.debugLineNum = 5021;BA.debugLine="If Scale(sY(0)).Automatic = False Then ' manua";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 5022;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5023;BA.debugLine="h = (py(j) - Scale(sY(0)).MinVal) * Scale(sY";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5024;BA.debugLine="r.Initialize(Graph.Left, y + Graph.BarSubWid";
_r.Initialize((float) (_graph.Left /*int*/ ),(float) (_y+_graph.BarSubWidth /*int*/ *_sign),(float) (_graph.Left /*int*/ +_h),(float) (_y));
 //BA.debugLineNum = 5025;BA.debugLine="GradientOrientation = \"LEFT_RIGHT\"";
_gradientorientation = "LEFT_RIGHT";
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5027;BA.debugLine="h = (py(j) - Scale(sY(0)).MaxVal) * Scale(sY";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5028;BA.debugLine="r.Initialize(Graph.Right + h, y + Graph.BarS";
_r.Initialize((float) (_graph.Right /*int*/ +_h),(float) (_y+_graph.BarSubWidth /*int*/ *_sign),(float) (_graph.Right /*int*/ ),(float) (_y));
 //BA.debugLineNum = 5029;BA.debugLine="GradientOrientation = \"RIGHT_LEFT\"";
_gradientorientation = "RIGHT_LEFT";
 }else {
 //BA.debugLineNum = 5031;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5032;BA.debugLine="If h > 0 Then";
if (_h>0) { 
 //BA.debugLineNum = 5033;BA.debugLine="r.Initialize(mXAxis0, y + Graph.BarSubWidth";
_r.Initialize((float) (_mxaxis0),(float) (_y+_graph.BarSubWidth /*int*/ *_sign),(float) (_mxaxis0+_h),(float) (_y));
 //BA.debugLineNum = 5034;BA.debugLine="GradientOrientation = \"LEFT_RIGHT\"";
_gradientorientation = "LEFT_RIGHT";
 }else {
 //BA.debugLineNum = 5036;BA.debugLine="r.Initialize(mXAxis0  + h, y + Graph.BarSub";
_r.Initialize((float) (_mxaxis0+_h),(float) (_y+_graph.BarSubWidth /*int*/ *_sign),(float) (_mxaxis0),(float) (_y));
 //BA.debugLineNum = 5037;BA.debugLine="GradientOrientation = \"RIGHT_LEFT\"";
_gradientorientation = "RIGHT_LEFT";
 };
 };
 }else {
 //BA.debugLineNum = 5041;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5042;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5043;BA.debugLine="If h < 0 Then";
if (_h<0) { 
 //BA.debugLineNum = 5044;BA.debugLine="r.Initialize(mXAxis0 + h, y - Graph.BarSubW";
_r.Initialize((float) (_mxaxis0+_h),(float) (_y-_graph.BarSubWidth /*int*/ ),(float) (_mxaxis0),(float) (_y));
 }else {
 //BA.debugLineNum = 5046;BA.debugLine="r.Initialize(mXAxis0, y - Graph.BarSubWidth";
_r.Initialize((float) (_mxaxis0),(float) (_y-_graph.BarSubWidth /*int*/ ),(float) (_mxaxis0+_h),(float) (_y));
 };
 }else {
 //BA.debugLineNum = 5049;BA.debugLine="If h < 0 Then";
if (_h<0) { 
 //BA.debugLineNum = 5050;BA.debugLine="r.Initialize(mXAxis0 + h, y, mXAxis0, y + G";
_r.Initialize((float) (_mxaxis0+_h),(float) (_y),(float) (_mxaxis0),(float) (_y+_graph.BarSubWidth /*int*/ ));
 }else {
 //BA.debugLineNum = 5052;BA.debugLine="r.Initialize(mXAxis0, y, mXAxis0 + h, y + G";
_r.Initialize((float) (_mxaxis0),(float) (_y),(float) (_mxaxis0+_h),(float) (_y+_graph.BarSubWidth /*int*/ ));
 };
 };
 };
 //BA.debugLineNum = 5056;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 5057;BA.debugLine="xcvsGraph.DrawRect(r, Cols(j), True, 1dip)";
_xcvsgraph.DrawRect(_r,_cols[_j],__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 5059;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 5060;BA.debugLine="rb.Initialize(0, 0, Max(1, Abs(h)), Graph.Bar";
_rb.Initialize((float) (0),(float) (0),(float) (__c.Max(1,__c.Abs(_h))),(float) (_graph.BarSubWidth /*int*/ ));
 //BA.debugLineNum = 5061;BA.debugLine="bmc1.Initialize(Max(1, Abs(h)), Graph.BarSubW";
_bmc1._initialize(ba,(int) (__c.Max(1,__c.Abs(_h))),_graph.BarSubWidth /*int*/ );
 //BA.debugLineNum = 5062;BA.debugLine="If h > 0 Then";
if (_h>0) { 
 //BA.debugLineNum = 5063;BA.debugLine="GradientOrientation = \"RIGHT_LEFT\"";
_gradientorientation = "RIGHT_LEFT";
 }else {
 //BA.debugLineNum = 5065;BA.debugLine="GradientOrientation = \"LEFT_RIGHT\"";
_gradientorientation = "LEFT_RIGHT";
 };
 //BA.debugLineNum = 5067;BA.debugLine="bmc1.FillGradient(Array As Int(Cols(j), ACols";
_bmc1._fillgradient(new int[]{_cols[_j],_acols[_j]},_rb,_gradientorientation);
 //BA.debugLineNum = 5068;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 }
};
 }
};
 //BA.debugLineNum = 5072;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 5074;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5075;BA.debugLine="If mXAxis0 = Graph.Left Or mXAxis0 = Graph.Top";
if (_mxaxis0==_graph.Left /*int*/  || _mxaxis0==_graph.Top /*int*/ ) { 
 //BA.debugLineNum = 5076;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 5078;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5079;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 5081;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 //BA.debugLineNum = 5086;BA.debugLine="If Graph.IncludeBarMeanLine = True Then";
if (_graph.IncludeBarMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5087;BA.debugLine="DrawBarMeanLineValueH";
_drawbarmeanlinevalueh();
 };
 //BA.debugLineNum = 5090;BA.debugLine="If Graph.IncludeValues = True Then";
if (_graph.IncludeValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5091;BA.debugLine="If PD.YArray.Length = 1 Then";
if (_pd.YArray /*double[]*/ .length==1) { 
 //BA.debugLineNum = 5092;BA.debugLine="DrawBarValuesSingleH";
_drawbarvaluessingleh();
 }else {
 //BA.debugLineNum = 5094;BA.debugLine="DrawBarValuesMultiH";
_drawbarvaluesmultih();
 };
 };
 }else {
 //BA.debugLineNum = 5098;BA.debugLine="Private mXAxis0 = Graph.Left As Int";
_mxaxis0 = _graph.Left /*int*/ ;
 //BA.debugLineNum = 5100;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outs";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 5101;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step114 = 1;
final int limit114 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit114 ;_i = _i + step114 ) {
 //BA.debugLineNum = 5102;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5103;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 5105;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5106;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5107;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5108;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 5109;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - (ip + 0.5)";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ -_graph.BarWidth /*int*/ /(double)2);
 }else {
 //BA.debugLineNum = 5111;BA.debugLine="y0 = Graph.Top + Graph.XOffset + (ip + 0.5) *";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ -_graph.BarWidth /*int*/ /(double)2);
 };
 //BA.debugLineNum = 5113;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5115;BA.debugLine="x = mXAxis0";
_x = _mxaxis0;
 //BA.debugLineNum = 5116;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step127 = 1;
final int limit127 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit127 ;_j = _j + step127 ) {
 //BA.debugLineNum = 5117;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5118;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5119;BA.debugLine="r.Initialize(x, y0, x + h, y0 + Graph.BarWidth";
_r.Initialize((float) (_x),(float) (_y0),(float) (_x+_h),(float) (_y0+_graph.BarWidth /*int*/ ));
 //BA.debugLineNum = 5120;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 5121;BA.debugLine="xcvsGraph.DrawRect(r, Cols(j), True, 1dip)";
_xcvsgraph.DrawRect(_r,_cols[_j],__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 5123;BA.debugLine="rb.Initialize(0, 0, Max(1, Abs(h)), Graph.Bar";
_rb.Initialize((float) (0),(float) (0),(float) (__c.Max(1,__c.Abs(_h))),(float) (_graph.BarWidth /*int*/ ));
 //BA.debugLineNum = 5124;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 5125;BA.debugLine="bmc1.Initialize(Max(1, Abs(h)), Graph.BarWidt";
_bmc1._initialize(ba,(int) (__c.Max(1,__c.Abs(_h))),_graph.BarWidth /*int*/ );
 //BA.debugLineNum = 5126;BA.debugLine="bmc1.FillGradient(Array As Int(Cols(j), ACols";
_bmc1._fillgradient(new int[]{_cols[_j],_acols[_j]},_rb,"RIGHT_LEFT");
 //BA.debugLineNum = 5127;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 //BA.debugLineNum = 5129;BA.debugLine="x = x + h";
_x = (int) (_x+_h);
 }
};
 }
};
 //BA.debugLineNum = 5132;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 5134;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5135;BA.debugLine="If mXAxis0 = Graph.Left Or mXAxis0 = Graph.Top";
if (_mxaxis0==_graph.Left /*int*/  || _mxaxis0==_graph.Top /*int*/ ) { 
 //BA.debugLineNum = 5136;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 5138;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5139;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 5141;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 };
 //BA.debugLineNum = 5147;BA.debugLine="If HLines.Size > 0 Then";
if (_hlines.getSize()>0) { 
 //BA.debugLineNum = 5148;BA.debugLine="DrawHorizontalLinesValueH";
_drawhorizontallinesvalueh();
 };
 //BA.debugLineNum = 5151;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _items.getSize()>0) { 
 //BA.debugLineNum = 5152;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 5155;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 5156;BA.debugLine="End Sub";
return "";
}
public String  _drawbarsv() throws Exception{
int _i = 0;
int _j = 0;
int _x0 = 0;
int _x = 0;
int _h = 0;
int _y = 0;
int[] _cols = null;
int[] _acols = null;
String[] _names = null;
String _gradientorientation = "";
b4a.example.xchart._itemdata _id = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
b4a.example.bitmapcreator _bmpcreate = null;
int _myaxis0 = 0;
b4a.example.xchart._pointdata _pd = null;
int _ip = 0;
double[] _py = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rb = null;
b4a.example.bitmapcreator _bmc1 = null;
int _barwidth_2 = 0;
int _barwidth_28 = 0;
int _color = 0;
int _acolor = 0;
int _acolori = 0;
int _acolord = 0;
double _volumemax = 0;
double _volumescale = 0;
int _yo = 0;
int _yt = 0;
int _yl = 0;
int _yc = 0;
int _linewidth = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rc = null;
int _acolort = 0;
int _yh = 0;
 //BA.debugLineNum = 4585;BA.debugLine="Private Sub DrawBarsV";
 //BA.debugLineNum = 4586;BA.debugLine="Private i, j, x0, x, h, y As Int";
_i = 0;
_j = 0;
_x0 = 0;
_x = 0;
_h = 0;
_y = 0;
 //BA.debugLineNum = 4587;BA.debugLine="Private Cols(Items.Size), ACols(Items.Size) As In";
_cols = new int[_items.getSize()];
;
_acols = new int[_items.getSize()];
;
 //BA.debugLineNum = 4588;BA.debugLine="Private Names(Items.Size), GradientOrientation As";
_names = new String[_items.getSize()];
java.util.Arrays.fill(_names,"");
_gradientorientation = "";
 //BA.debugLineNum = 4590;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 4591;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 4592;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 4593;BA.debugLine="Cols(i) = ID.Color";
_cols[_i] = _id.Color /*int*/ ;
 //BA.debugLineNum = 4594;BA.debugLine="Private ARGB As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 4595;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4596;BA.debugLine="BmpCreate.Initialize(10, 10)";
_bmpcreate._initialize(ba,(int) (10),(int) (10));
 //BA.debugLineNum = 4597;BA.debugLine="BmpCreate.ColorToARGB(Cols(i), ARGB)";
_bmpcreate._colortoargb(_cols[_i],_argb);
 //BA.debugLineNum = 4598;BA.debugLine="ACols(i) = xui.Color_ARGB(Graph.GradientColorsAl";
_acols[_i] = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 4599;BA.debugLine="Names(i) = ID.Name";
_names[_i] = _id.Name /*String*/ ;
 }
};
 //BA.debugLineNum = 4602;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"BAR","STACKED_BAR","CANDLE","WATERFALL")) {
case 0: {
 //BA.debugLineNum = 4604;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY(0)).M";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4606;BA.debugLine="If Graph.IncludeBarMeanLine = True Then";
if (_graph.IncludeBarMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4607;BA.debugLine="DrawBarMeanLineV";
_drawbarmeanlinev();
 };
 //BA.debugLineNum = 4610;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing out";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4611;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step22 = 1;
final int limit22 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit22 ;_i = _i + step22 ) {
 //BA.debugLineNum = 4612;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4613;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 4615;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 4616;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4617;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 4618;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ -_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 4619;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 4621;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step30 = 1;
final int limit30 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit30 ;_j = _j + step30 ) {
 //BA.debugLineNum = 4622;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4623;BA.debugLine="x = x0 + j * Graph.BarSubWidth";
_x = (int) (_x0+_j*_graph.BarSubWidth /*int*/ );
 //BA.debugLineNum = 4625;BA.debugLine="If Scale(sY(0)).Automatic = False Then ' manu";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4626;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 4627;BA.debugLine="h = (py(j) - Scale(sY(0)).MinVal) * Scale(s";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4628;BA.debugLine="r.Initialize(x, Graph.Bottom - h, x + Graph";
_r.Initialize((float) (_x),(float) (_graph.Bottom /*int*/ -_h),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 4629;BA.debugLine="GradientOrientation = \"TOP_BOTTOM\"";
_gradientorientation = "TOP_BOTTOM";
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 4631;BA.debugLine="h = (py(j) - Scale(sY(0)).MaxVal) * Scale(s";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4632;BA.debugLine="r.Initialize(x, Graph.Top, x + Graph.BarSub";
_r.Initialize((float) (_x),(float) (_graph.Top /*int*/ ),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_graph.Top /*int*/ -_h));
 //BA.debugLineNum = 4633;BA.debugLine="GradientOrientation = \"BOTTOM_TOP\"";
_gradientorientation = "BOTTOM_TOP";
 }else {
 //BA.debugLineNum = 4635;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4636;BA.debugLine="If h > 0 Then";
if (_h>0) { 
 //BA.debugLineNum = 4637;BA.debugLine="r.Initialize(x, mYAxis0 - h, x + Graph.Bar";
_r.Initialize((float) (_x),(float) (_myaxis0-_h),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_myaxis0));
 //BA.debugLineNum = 4638;BA.debugLine="GradientOrientation = \"TOP_BOTTOM\"";
_gradientorientation = "TOP_BOTTOM";
 }else {
 //BA.debugLineNum = 4640;BA.debugLine="r.Initialize(x, mYAxis0, x + Graph.BarSubW";
_r.Initialize((float) (_x),(float) (_myaxis0),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_myaxis0-_h));
 //BA.debugLineNum = 4641;BA.debugLine="GradientOrientation = \"BOTTOM_TOP\"";
_gradientorientation = "BOTTOM_TOP";
 };
 };
 }else {
 //BA.debugLineNum = 4645;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4646;BA.debugLine="If h > 0 Then";
if (_h>0) { 
 //BA.debugLineNum = 4647;BA.debugLine="r.Initialize(x, mYAxis0 - h, x + Graph.BarS";
_r.Initialize((float) (_x),(float) (_myaxis0-_h),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_myaxis0));
 }else {
 //BA.debugLineNum = 4649;BA.debugLine="r.Initialize(x, mYAxis0, x + Graph.BarSubWi";
_r.Initialize((float) (_x),(float) (_myaxis0),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_myaxis0-_h));
 };
 };
 //BA.debugLineNum = 4653;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4654;BA.debugLine="xcvsGraph.DrawRect(r, Cols(j), True, 1dip)";
_xcvsgraph.DrawRect(_r,_cols[_j],__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 4656;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4657;BA.debugLine="rb.Initialize(0, 0, Graph.BarSubWidth, Max(1";
_rb.Initialize((float) (0),(float) (0),(float) (_graph.BarSubWidth /*int*/ ),(float) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 4658;BA.debugLine="bmc1.Initialize(Graph.BarSubWidth, Max(1, Ab";
_bmc1._initialize(ba,_graph.BarSubWidth /*int*/ ,(int) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 4659;BA.debugLine="If h > 0 Then";
if (_h>0) { 
 //BA.debugLineNum = 4660;BA.debugLine="GradientOrientation = \"TOP_BOTTOM\"";
_gradientorientation = "TOP_BOTTOM";
 }else {
 //BA.debugLineNum = 4662;BA.debugLine="GradientOrientation = \"BOTTOM_TOP\"";
_gradientorientation = "BOTTOM_TOP";
 };
 //BA.debugLineNum = 4664;BA.debugLine="bmc1.FillGradient(Array As Int(Cols(j), ACol";
_bmc1._fillgradient(new int[]{_cols[_j],_acols[_j]},_rb,_gradientorientation);
 //BA.debugLineNum = 4665;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 }
};
 }
};
 //BA.debugLineNum = 4669;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4671;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4672;BA.debugLine="If mYAxis0 = Graph.Top Or mYAxis0 = Graph.Bott";
if (_myaxis0==_graph.Top /*int*/  || _myaxis0==_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 4673;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4675;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True The";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4676;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4678;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 //BA.debugLineNum = 4683;BA.debugLine="If Graph.IncludeValues = True Then";
if (_graph.IncludeValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4684;BA.debugLine="If PD.YArray.Length = 1 Then";
if (_pd.YArray /*double[]*/ .length==1) { 
 //BA.debugLineNum = 4685;BA.debugLine="DrawBarValuesSingleV";
_drawbarvaluessinglev();
 }else {
 //BA.debugLineNum = 4687;BA.debugLine="DrawBarValuesMultiV";
_drawbarvaluesmultiv();
 };
 };
 //BA.debugLineNum = 4691;BA.debugLine="If Graph.IncludeBarMeanLine = True Then";
if (_graph.IncludeBarMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4692;BA.debugLine="DrawBarMeanLineValueV";
_drawbarmeanlinevaluev();
 };
 break; }
case 1: {
 //BA.debugLineNum = 4695;BA.debugLine="Private mYAxis0 = Graph.Bottom As Int";
_myaxis0 = _graph.Bottom /*int*/ ;
 //BA.debugLineNum = 4697;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing out";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4698;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step101 = 1;
final int limit101 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit101 ;_i = _i + step101 ) {
 //BA.debugLineNum = 4699;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4700;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 4702;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 4703;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4704;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 4705;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ -_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 4706;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 4708;BA.debugLine="y = mYAxis0";
_y = _myaxis0;
 //BA.debugLineNum = 4709;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step110 = 1;
final int limit110 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit110 ;_j = _j + step110 ) {
 //BA.debugLineNum = 4710;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4711;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4712;BA.debugLine="r.Initialize(x0, y - h, x0 + Graph.BarWidth,";
_r.Initialize((float) (_x0),(float) (_y-_h),(float) (_x0+_graph.BarWidth /*int*/ ),(float) (_y));
 //BA.debugLineNum = 4713;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4714;BA.debugLine="xcvsGraph.DrawRect(r, Cols(j), True, 1dip)";
_xcvsgraph.DrawRect(_r,_cols[_j],__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 4716;BA.debugLine="rb.Initialize(0, 0, Graph.BarWidth, Max(1, A";
_rb.Initialize((float) (0),(float) (0),(float) (_graph.BarWidth /*int*/ ),(float) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 4717;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4718;BA.debugLine="bmc1.Initialize(Graph.BarWidth, Max(1, Abs(h";
_bmc1._initialize(ba,_graph.BarWidth /*int*/ ,(int) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 4719;BA.debugLine="bmc1.FillGradient(Array As Int(Cols(j), ACol";
_bmc1._fillgradient(new int[]{_cols[_j],_acols[_j]},_rb,"TOP_BOTTOM");
 //BA.debugLineNum = 4720;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 //BA.debugLineNum = 4722;BA.debugLine="y = y - h";
_y = (int) (_y-_h);
 }
};
 }
};
 //BA.debugLineNum = 4725;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4727;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4728;BA.debugLine="If mYAxis0 = Graph.Top Or mYAxis0 = Graph.Bott";
if (_myaxis0==_graph.Top /*int*/  || _myaxis0==_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 4729;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4730;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 }else {
 //BA.debugLineNum = 4733;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True The";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4734;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4736;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 break; }
case 2: {
 //BA.debugLineNum = 4741;BA.debugLine="Private BarWidth_2, BarWidth_28 As Int";
_barwidth_2 = 0;
_barwidth_28 = 0;
 //BA.debugLineNum = 4742;BA.debugLine="BarWidth_2 = Graph.BarWidth / 2";
_barwidth_2 = (int) (_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 4743;BA.debugLine="If BarWidth_2 >= 6dip Then";
if (_barwidth_2>=__c.DipToCurrent((int) (6))) { 
 //BA.debugLineNum = 4744;BA.debugLine="BarWidth_28 = BarWidth_2 * 0.7 'used for CANDL";
_barwidth_28 = (int) (_barwidth_2*0.7);
 }else {
 //BA.debugLineNum = 4746;BA.debugLine="BarWidth_28 = BarWidth_2";
_barwidth_28 = _barwidth_2;
 };
 //BA.debugLineNum = 4748;BA.debugLine="Private mYAxis0 As Int";
_myaxis0 = 0;
 //BA.debugLineNum = 4749;BA.debugLine="Private Color, AColor, AColorI, AColorD As Int";
_color = 0;
_acolor = 0;
_acolori = 0;
_acolord = 0;
 //BA.debugLineNum = 4751;BA.debugLine="Private ARGB As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 4752;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4753;BA.debugLine="BmpCreate.ColorToARGB(Bar.IncreaseColor, ARGB)";
_bmpcreate._colortoargb(_bar.IncreaseColor /*int*/ ,_argb);
 //BA.debugLineNum = 4754;BA.debugLine="AColorI = xui.Color_ARGB(Graph.GradientColorsAl";
_acolori = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 4755;BA.debugLine="BmpCreate.ColorToARGB(Bar.DecreaseColor, ARGB)";
_bmpcreate._colortoargb(_bar.DecreaseColor /*int*/ ,_argb);
 //BA.debugLineNum = 4756;BA.debugLine="AColorD = xui.Color_ARGB(Graph.GradientColorsAl";
_acolord = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 4758;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal *";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4759;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing out";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4761;BA.debugLine="If Bar.CandleDisplayVolume = True Then";
if (_bar.CandleDisplayVolume /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4762;BA.debugLine="Private VolumeMax, VolumeScale As Double";
_volumemax = 0;
_volumescale = 0;
 //BA.debugLineNum = 4763;BA.debugLine="VolumeMax = -1e10";
_volumemax = -1e10;
 //BA.debugLineNum = 4764;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step161 = 1;
final int limit161 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit161 ;_i = _i + step161 ) {
 //BA.debugLineNum = 4765;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4766;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 4768;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 4769;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4770;BA.debugLine="VolumeMax = Max(VolumeMax, PD.YArray(4))";
_volumemax = __c.Max(_volumemax,_pd.YArray /*double[]*/ [(int) (4)]);
 }
};
 //BA.debugLineNum = 4772;BA.debugLine="VolumeScale = 0.2 * Graph.Height / VolumeMax";
_volumescale = 0.2*_graph.Height /*int*/ /(double)_volumemax;
 };
 //BA.debugLineNum = 4775;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step170 = 1;
final int limit170 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit170 ;_i = _i + step170 ) {
 //BA.debugLineNum = 4776;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4777;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 4779;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 4780;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4781;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 4782;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 4783;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 4785;BA.debugLine="y = mYAxis0";
_y = _myaxis0;
 //BA.debugLineNum = 4786;BA.debugLine="Private yo, yt, yl, yc As Int";
_yo = 0;
_yt = 0;
_yl = 0;
_yc = 0;
 //BA.debugLineNum = 4787;BA.debugLine="yo = Graph.Bottom - (py(0) - Scale(sY(0)).MinV";
_yo = (int) (_graph.Bottom /*int*/ -(_py[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4788;BA.debugLine="yt = Graph.Bottom - (py(1) - Scale(sY(0)).MinV";
_yt = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4789;BA.debugLine="yl = Graph.Bottom - (py(2) - Scale(sY(0)).MinV";
_yl = (int) (_graph.Bottom /*int*/ -(_py[(int) (2)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4790;BA.debugLine="yc = Graph.Bottom - (py(3) - Scale(sY(0)).MinV";
_yc = (int) (_graph.Bottom /*int*/ -(_py[(int) (3)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4791;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4792;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4793;BA.debugLine="r.Initialize(x0, y - h, x0 + Graph.BarWidth, y";
_r.Initialize((float) (_x0),(float) (_y-_h),(float) (_x0+_graph.BarWidth /*int*/ ),(float) (_y));
 //BA.debugLineNum = 4795;BA.debugLine="Private LineWidth As Int";
_linewidth = 0;
 //BA.debugLineNum = 4796;BA.debugLine="LineWidth = Bar.WickWidth";
_linewidth = _bar.WickWidth /*int*/ ;
 //BA.debugLineNum = 4797;BA.debugLine="If Bar.WickWidth > 0 And Graph.BarWidth < 10di";
if (_bar.WickWidth /*int*/ >0 && _graph.BarWidth /*int*/ <__c.DipToCurrent((int) (10))) { 
 //BA.debugLineNum = 4798;BA.debugLine="LineWidth = 1dip";
_linewidth = __c.DipToCurrent((int) (1));
 };
 //BA.debugLineNum = 4800;BA.debugLine="xcvsGraph.DrawLine(x0, yt, x0, yl, Bar.WickCol";
_xcvsgraph.DrawLine((float) (_x0),(float) (_yt),(float) (_x0),(float) (_yl),_bar.WickColor /*int*/ ,(float) (_linewidth));
 //BA.debugLineNum = 4801;BA.debugLine="If py(3) = py(0) Then";
if (_py[(int) (3)]==_py[(int) (0)]) { 
 //BA.debugLineNum = 4802;BA.debugLine="xcvsGraph.DrawLine(x0 - BarWidth_2, yc, x0 +";
_xcvsgraph.DrawLine((float) (_x0-_barwidth_2),(float) (_yc),(float) (_x0+_barwidth_2),(float) (_yo),_bar.WickColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else if(__c.Abs(_yc-_yo)<=__c.DipToCurrent((int) (3))) { 
 //BA.debugLineNum = 4804;BA.debugLine="If py(0) > py(3) Then";
if (_py[(int) (0)]>_py[(int) (3)]) { 
 //BA.debugLineNum = 4805;BA.debugLine="yc = (yc + yo) / 2";
_yc = (int) ((_yc+_yo)/(double)2);
 //BA.debugLineNum = 4806;BA.debugLine="xcvsGraph.DrawLine(x0 - BarWidth_2, yc, x0 +";
_xcvsgraph.DrawLine((float) (_x0-_barwidth_2),(float) (_yc),(float) (_x0+_barwidth_2),(float) (_yc),_bar.DecreaseColor /*int*/ ,(float) (__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 4807;BA.debugLine="AColor = AColorD";
_acolor = _acolord;
 }else {
 //BA.debugLineNum = 4809;BA.debugLine="yc = (yc + yo) / 2";
_yc = (int) ((_yc+_yo)/(double)2);
 //BA.debugLineNum = 4810;BA.debugLine="xcvsGraph.DrawLine(x0 - BarWidth_2, yc, x0 +";
_xcvsgraph.DrawLine((float) (_x0-_barwidth_2),(float) (_yc),(float) (_x0+_barwidth_2),(float) (_yc),_bar.IncreaseColor /*int*/ ,(float) (__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 4811;BA.debugLine="AColor = AColorI";
_acolor = _acolori;
 };
 }else {
 //BA.debugLineNum = 4814;BA.debugLine="If py(0) > py(3) Then";
if (_py[(int) (0)]>_py[(int) (3)]) { 
 //BA.debugLineNum = 4815;BA.debugLine="r.Initialize(x0 - BarWidth_2, yo, x0 + BarWi";
_r.Initialize((float) (_x0-_barwidth_2),(float) (_yo),(float) (_x0+_barwidth_2),(float) (_yc));
 //BA.debugLineNum = 4816;BA.debugLine="Color = Bar.DecreaseColor";
_color = _bar.DecreaseColor /*int*/ ;
 //BA.debugLineNum = 4817;BA.debugLine="AColor = AColorD";
_acolor = _acolord;
 //BA.debugLineNum = 4818;BA.debugLine="GradientOrientation = \"BOTTOM_TOP\"";
_gradientorientation = "BOTTOM_TOP";
 }else {
 //BA.debugLineNum = 4820;BA.debugLine="r.Initialize(x0 - BarWidth_2, yc, x0 + BarWi";
_r.Initialize((float) (_x0-_barwidth_2),(float) (_yc),(float) (_x0+_barwidth_2),(float) (_yo));
 //BA.debugLineNum = 4821;BA.debugLine="Color = Bar.IncreaseColor";
_color = _bar.IncreaseColor /*int*/ ;
 //BA.debugLineNum = 4822;BA.debugLine="AColor = AColorI";
_acolor = _acolori;
 //BA.debugLineNum = 4823;BA.debugLine="GradientOrientation = \"TOP_BOTTOM\"";
_gradientorientation = "TOP_BOTTOM";
 };
 //BA.debugLineNum = 4826;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4827;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 1dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 4829;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4830;BA.debugLine="rb.Initialize(0, 0, r.Width, r.Height)";
_rb.Initialize((float) (0),(float) (0),_r.getWidth(),_r.getHeight());
 //BA.debugLineNum = 4831;BA.debugLine="bmc1.Initialize(r.Width, r.Height)";
_bmc1._initialize(ba,(int) (_r.getWidth()),(int) (_r.getHeight()));
 //BA.debugLineNum = 4832;BA.debugLine="bmc1.FillGradient(Array As Int(Color, AColor";
_bmc1._fillgradient(new int[]{_color,_acolor},_rb,_gradientorientation);
 //BA.debugLineNum = 4833;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundC";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4834;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 //BA.debugLineNum = 4837;BA.debugLine="If Bar.DrawBodyBorder = True Then";
if (_bar.DrawBodyBorder /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4838;BA.debugLine="xcvsGraph.DrawRect(r, Bar.WickColor, False,";
_xcvsgraph.DrawRect(_r,_bar.WickColor /*int*/ ,__c.False,(float) (_linewidth));
 };
 };
 //BA.debugLineNum = 4841;BA.debugLine="If Bar.CandleDisplayVolume = True Then";
if (_bar.CandleDisplayVolume /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4842;BA.debugLine="Private rc As B4XRect";
_rc = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4843;BA.debugLine="rc.Initialize(x0 - BarWidth_28, Graph.Bottom";
_rc.Initialize((float) (_x0-_barwidth_28),(float) (_graph.Bottom /*int*/ -_py[(int) (4)]*_volumescale),(float) (_x0+_barwidth_28),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 4844;BA.debugLine="xcvsGraph.DrawRect(rc, AColor, True, 1dip)";
_xcvsgraph.DrawRect(_rc,_acolor,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 }
};
 //BA.debugLineNum = 4847;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4849;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4850;BA.debugLine="If mYAxis0 = Graph.Top Or mYAxis0 = Graph.Bott";
if (_myaxis0==_graph.Top /*int*/  || _myaxis0==_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 4851;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4852;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 }else {
 //BA.debugLineNum = 4855;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True The";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4856;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4858;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 break; }
case 3: {
 //BA.debugLineNum = 4863;BA.debugLine="Private BarWidth_2 = Graph.BarWidth / 2 As Int";
_barwidth_2 = (int) (_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 4864;BA.debugLine="Private mYAxis0 As Int";
_myaxis0 = 0;
 //BA.debugLineNum = 4865;BA.debugLine="Private AColor, AColorT, AColorI, AColorD As In";
_acolor = 0;
_acolort = 0;
_acolori = 0;
_acolord = 0;
 //BA.debugLineNum = 4867;BA.debugLine="Private ARGB As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 4868;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4869;BA.debugLine="BmpCreate.ColorToARGB(Bar.TotalBarColor, ARGB)";
_bmpcreate._colortoargb(_bar.TotalBarColor /*int*/ ,_argb);
 //BA.debugLineNum = 4870;BA.debugLine="AColorT = xui.Color_ARGB(Graph.GradientColorsAl";
_acolort = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 4871;BA.debugLine="BmpCreate.ColorToARGB(Bar.IncreaseColor, ARGB)";
_bmpcreate._colortoargb(_bar.IncreaseColor /*int*/ ,_argb);
 //BA.debugLineNum = 4872;BA.debugLine="AColorI = xui.Color_ARGB(Graph.GradientColorsAl";
_acolori = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 4873;BA.debugLine="BmpCreate.ColorToARGB(Bar.DecreaseColor, ARGB)";
_bmpcreate._colortoargb(_bar.DecreaseColor /*int*/ ,_argb);
 //BA.debugLineNum = 4874;BA.debugLine="AColorD = xui.Color_ARGB(Graph.GradientColorsAl";
_acolord = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 4876;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal *";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4877;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing out";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4878;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step265 = 1;
final int limit265 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit265 ;_i = _i + step265 ) {
 //BA.debugLineNum = 4879;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4880;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 4882;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 4883;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4884;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 4885;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ -_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 4886;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 4888;BA.debugLine="Private yh, yl, yt As Int";
_yh = 0;
_yl = 0;
_yt = 0;
 //BA.debugLineNum = 4889;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4890;BA.debugLine="Private Color As Int";
_color = 0;
 //BA.debugLineNum = 4892;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 4893;BA.debugLine="If py(0) > 0 Then";
if (_py[(int) (0)]>0) { 
 //BA.debugLineNum = 4894;BA.debugLine="yh = mYAxis0 - py(1)  * Scale(sY(0)).Scale";
_yh = (int) (_myaxis0-_py[(int) (1)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4895;BA.debugLine="yl = mYAxis0";
_yl = _myaxis0;
 //BA.debugLineNum = 4896;BA.debugLine="yt = yh";
_yt = _yh;
 }else {
 //BA.debugLineNum = 4898;BA.debugLine="yh = mYAxis0";
_yh = _myaxis0;
 //BA.debugLineNum = 4899;BA.debugLine="yl = mYAxis0 - py(1) * Scale(sY(0)).Scale";
_yl = (int) (_myaxis0-_py[(int) (1)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4900;BA.debugLine="yt = yl";
_yt = _yl;
 };
 //BA.debugLineNum = 4902;BA.debugLine="r.Initialize(x0, yh, x0 + Graph.BarWidth, yl)";
_r.Initialize((float) (_x0),(float) (_yh),(float) (_x0+_graph.BarWidth /*int*/ ),(float) (_yl));
 //BA.debugLineNum = 4903;BA.debugLine="Color = Bar.TotalBarColor";
_color = _bar.TotalBarColor /*int*/ ;
 //BA.debugLineNum = 4904;BA.debugLine="AColor = AColorT";
_acolor = _acolort;
 }else {
 //BA.debugLineNum = 4906;BA.debugLine="If py(0) > 0 Then";
if (_py[(int) (0)]>0) { 
 //BA.debugLineNum = 4907;BA.debugLine="yh = mYAxis0 - (Max(py(1) - py(0), py(1))) *";
_yh = (int) (_myaxis0-(__c.Max(_py[(int) (1)]-_py[(int) (0)],_py[(int) (1)]))*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4908;BA.debugLine="yl = mYAxis0 - (Min(py(1) - py(0), py(1))) *";
_yl = (int) (_myaxis0-(__c.Min(_py[(int) (1)]-_py[(int) (0)],_py[(int) (1)]))*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4909;BA.debugLine="yt = mYAxis0 - (py(1) - py(0)) * Scale(sY(0)";
_yt = (int) (_myaxis0-(_py[(int) (1)]-_py[(int) (0)])*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4910;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4911;BA.debugLine="r.Initialize(x0, yh, x0 + Graph.BarWidth, yl";
_r.Initialize((float) (_x0),(float) (_yh),(float) (_x0+_graph.BarWidth /*int*/ ),(float) (_yl));
 //BA.debugLineNum = 4912;BA.debugLine="Color = Bar.IncreaseColor";
_color = _bar.IncreaseColor /*int*/ ;
 //BA.debugLineNum = 4913;BA.debugLine="AColor = AColorI";
_acolor = _acolori;
 }else {
 //BA.debugLineNum = 4915;BA.debugLine="yh = mYAxis0 - (Max(py(1) - py(0), py(1))) *";
_yh = (int) (_myaxis0-(__c.Max(_py[(int) (1)]-_py[(int) (0)],_py[(int) (1)]))*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4916;BA.debugLine="yl = mYAxis0 - (Min(py(1) - py(0), py(1))) *";
_yl = (int) (_myaxis0-(__c.Min(_py[(int) (1)]-_py[(int) (0)],_py[(int) (1)]))*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4917;BA.debugLine="yt = mYAxis0 - (py(1) - py(0)) * Scale(sY(0)";
_yt = (int) (_myaxis0-(_py[(int) (1)]-_py[(int) (0)])*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4918;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4919;BA.debugLine="r.Initialize(x0, yh, x0 + Graph.BarWidth, yl";
_r.Initialize((float) (_x0),(float) (_yh),(float) (_x0+_graph.BarWidth /*int*/ ),(float) (_yl));
 //BA.debugLineNum = 4920;BA.debugLine="Color = Bar.DecreaseColor";
_color = _bar.DecreaseColor /*int*/ ;
 //BA.debugLineNum = 4921;BA.debugLine="AColor = AColorD";
_acolor = _acolord;
 };
 };
 //BA.debugLineNum = 4924;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4925;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 1dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 4927;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 4928;BA.debugLine="rb.Initialize(0, 0, r.Width, r.Height)";
_rb.Initialize((float) (0),(float) (0),_r.getWidth(),_r.getHeight());
 //BA.debugLineNum = 4929;BA.debugLine="bmc1.Initialize(r.Width, r.Height)";
_bmc1._initialize(ba,(int) (_r.getWidth()),(int) (_r.getHeight()));
 //BA.debugLineNum = 4930;BA.debugLine="If py(0) > 0 Then";
if (_py[(int) (0)]>0) { 
 //BA.debugLineNum = 4931;BA.debugLine="GradientOrientation = \"TOP_BOTTOM\"";
_gradientorientation = "TOP_BOTTOM";
 }else {
 //BA.debugLineNum = 4933;BA.debugLine="GradientOrientation = \"BOTTOM_TOP\"";
_gradientorientation = "BOTTOM_TOP";
 };
 //BA.debugLineNum = 4935;BA.debugLine="bmc1.FillGradient(Array As Int(Color, AColor)";
_bmc1._fillgradient(new int[]{_color,_acolor},_rb,_gradientorientation);
 //BA.debugLineNum = 4936;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 //BA.debugLineNum = 4938;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 4939;BA.debugLine="xcvsGraph.DrawLine(x0 - Graph.XInterval, yt,";
_xcvsgraph.DrawLine((float) (_x0-_graph.XInterval /*double*/ ),(float) (_yt),(float) (_x0+_graph.BarWidth /*int*/ ),(float) (_yt),_bar.WickColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 }
};
 //BA.debugLineNum = 4942;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4944;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4945;BA.debugLine="If mYAxis0 = Graph.Top Or mYAxis0 = Graph.Bott";
if (_myaxis0==_graph.Top /*int*/  || _myaxis0==_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 4946;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4947;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 }else {
 //BA.debugLineNum = 4950;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True The";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4951;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4953;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 //BA.debugLineNum = 4958;BA.debugLine="If Graph.IncludeValues = True Then";
if (_graph.IncludeValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4959;BA.debugLine="DrawWaterfallValues";
_drawwaterfallvalues();
 };
 break; }
}
;
 //BA.debugLineNum = 4963;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _items.getSize()>0) { 
 //BA.debugLineNum = 4964;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 4967;BA.debugLine="If HLines.Size > 0 Then";
if (_hlines.getSize()>0) { 
 //BA.debugLineNum = 4968;BA.debugLine="DrawHorizontalLinesValue";
_drawhorizontallinesvalue();
 };
 //BA.debugLineNum = 4971;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 4972;BA.debugLine="End Sub";
return "";
}
public String  _drawbarvaluesmultih() throws Exception{
int _i = 0;
int _x = 0;
int _xt = 0;
int _dx = 0;
int _yt = 0;
int _y0 = 0;
double _h = 0;
int _col = 0;
int _mxaxis0 = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttextbackground = null;
int _textwidth = 0;
String _valtext = "";
float _localtextsize = 0f;
int _localtextheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _localfont = null;
b4a.example.xchart._itemdata _id = null;
String _textalignment = "";
b4a.example.xchart._pointdata _pd = null;
int _ip = 0;
double[] _py = null;
int _j = 0;
 //BA.debugLineNum = 6387;BA.debugLine="Private Sub DrawBarValuesMultiH";
 //BA.debugLineNum = 6388;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 6390;BA.debugLine="Private i, x, xt, dx, yt, y0 As Int";
_i = 0;
_x = 0;
_xt = 0;
_dx = 0;
_yt = 0;
_y0 = 0;
 //BA.debugLineNum = 6391;BA.debugLine="Private h As Double";
_h = 0;
 //BA.debugLineNum = 6392;BA.debugLine="Private Col As Int";
_col = 0;
 //BA.debugLineNum = 6393;BA.debugLine="Private mXAxis0 As Int";
_mxaxis0 = 0;
 //BA.debugLineNum = 6394;BA.debugLine="mXAxis0 = Graph.Left - Scale(sY(0)).MinVal * Scal";
_mxaxis0 = (int) (_graph.Left /*int*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6395;BA.debugLine="Private rectText, rectTextBackground As B4XRect";
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttextbackground = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6396;BA.debugLine="Private TextWidth As Int";
_textwidth = 0;
 //BA.debugLineNum = 6397;BA.debugLine="Private valText As String";
_valtext = "";
 //BA.debugLineNum = 6398;BA.debugLine="Private LocalTextSize As Float";
_localtextsize = 0f;
 //BA.debugLineNum = 6399;BA.debugLine="Private LocalTextHeight As Int";
_localtextheight = 0;
 //BA.debugLineNum = 6400;BA.debugLine="Private LocalFont As B4XFont";
_localfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 6401;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 6403;BA.debugLine="ID = Items.Get(0)";
_id = (b4a.example.xchart._itemdata)(_items.Get((int) (0)));
 //BA.debugLineNum = 6405;BA.debugLine="LocalFont = Texts.ScaleFont";
_localfont = _texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 6406;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight";
_localtextheight = _texts.ScaleTextHeight /*int*/ ;
 //BA.debugLineNum = 6407;BA.debugLine="LocalTextSize = Texts.ScaleTextSize";
_localtextsize = _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 6409;BA.debugLine="Private TextAlignment As String";
_textalignment = "";
 //BA.debugLineNum = 6412;BA.debugLine="If Texts.ScaleTextHeight * 1.5 + 4dip > Graph.Bar";
if (_texts.ScaleTextHeight /*int*/ *1.5+__c.DipToCurrent((int) (4))>_graph.BarSubWidth /*int*/ ) { 
 //BA.debugLineNum = 6413;BA.debugLine="rectText = xcvsGraph.MeasureText(\"10\", Texts.Sca";
_recttext = _xcvsgraph.MeasureText("10",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 6414;BA.debugLine="LocalTextSize = Min(Texts.ScaleTextSize, Texts.S";
_localtextsize = (float) (__c.Min(_texts.ScaleTextSize /*float*/ ,_texts.ScaleTextSize /*float*/ *_graph.BarSubWidth /*int*/ /(double)_texts.ScaleTextHeight /*int*/ /(double)1.2));
 //BA.debugLineNum = 6415;BA.debugLine="LocalFont = xui.CreateFont2(Texts.ScaleFont, Loc";
_localfont = _xui.CreateFont2(_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_localtextsize);
 //BA.debugLineNum = 6416;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight * LocalT";
_localtextheight = (int) (_texts.ScaleTextHeight /*int*/ *_localtextsize/(double)_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 6417;BA.debugLine="If LocalTextSize < 6 Then";
if (_localtextsize<6) { 
 //BA.debugLineNum = 6418;BA.debugLine="Log(\"Bar value text size too small\")";
__c.LogImpl("910813471","Bar value text size too small",0);
 //BA.debugLineNum = 6419;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 6423;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step29 = 1;
final int limit29 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit29 ;_i = _i + step29 ) {
 //BA.debugLineNum = 6424;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6425;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 6427;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 6428;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6429;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 6430;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 6431;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 6432;BA.debugLine="y0 = Graph.Bottom - Graph.XOffset - (ip + 0.5)";
_y0 = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ +_graph.BarWidth /*int*/ /(double)2-_graph.BarSubWidth /*int*/ /(double)2);
 }else {
 //BA.debugLineNum = 6434;BA.debugLine="y0 = Graph.Top + Graph.XOffset + (ip + 0.5) * G";
_y0 = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ -_graph.BarWidth /*int*/ /(double)2+_graph.BarSubWidth /*int*/ /(double)2);
 };
 //BA.debugLineNum = 6436;BA.debugLine="For j = 0 To py.Length - 1";
{
final int step41 = 1;
final int limit41 = (int) (_py.length-1);
_j = (int) (0) ;
for (;_j <= limit41 ;_j = _j + step41 ) {
 //BA.debugLineNum = 6437;BA.debugLine="If py(0) >= Scale(sY(0)).MinVal And py(0) <= Sc";
if (_py[(int) (0)]>=_scale[_sy[(int) (0)]].MinVal /*double*/  && _py[(int) (0)]<=_scale[_sy[(int) (0)]].MaxVal /*double*/ ) { 
 //BA.debugLineNum = 6438;BA.debugLine="ID = Items.Get(j)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_j));
 //BA.debugLineNum = 6439;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 6440;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = _py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 6442;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 6443;BA.debugLine="h = (py(j) - Scale(sY(0)).MinVal) * Scale(sY";
_h = (_py[_j]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 6445;BA.debugLine="h = (py(j) - Scale(sY(0)).MaxVal) * Scale(sY";
_h = (_py[_j]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 };
 };
 //BA.debugLineNum = 6448;BA.debugLine="valText = NumberFormat3(py(j), Values.MaxDigit";
_valtext = _numberformat3(_py[_j],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 6449;BA.debugLine="rectText = xcvsGraph.MeasureText(valText, Loca";
_recttext = _xcvsgraph.MeasureText(_valtext,_localfont);
 //BA.debugLineNum = 6450;BA.debugLine="TextWidth = rectText.Width + 0.5 * LocalTextHe";
_textwidth = (int) (_recttext.getWidth()+0.5*_localtextheight);
 //BA.debugLineNum = 6451;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 6452;BA.debugLine="yt = y0 - rectText.CenterY - j * Graph.BarSub";
_yt = (int) (_y0-_recttext.getCenterY()-_j*_graph.BarSubWidth /*int*/ );
 }else {
 //BA.debugLineNum = 6454;BA.debugLine="yt = y0 - rectText.CenterY + j * Graph.BarSub";
_yt = (int) (_y0-_recttext.getCenterY()+_j*_graph.BarSubWidth /*int*/ );
 };
 //BA.debugLineNum = 6456;BA.debugLine="rectTextBackground.Initialize(x, yt + 1.1 * re";
_recttextbackground.Initialize((float) (_x),(float) (_yt+1.1*_recttext.getTop()),(float) (_x+_localtextheight),(float) (_yt-0.1*_recttext.getTop()));
 //BA.debugLineNum = 6457;BA.debugLine="rectTextBackground.Width = TextWidth";
_recttextbackground.setWidth(_textwidth);
 //BA.debugLineNum = 6458;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 6459;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 6460;BA.debugLine="xt = mXAxis0 + h / 2";
_xt = (int) (_mxaxis0+_h/(double)2);
 }else {
 //BA.debugLineNum = 6462;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 6463;BA.debugLine="xt = Graph.Left + h / 2";
_xt = (int) (_graph.Left /*int*/ +_h/(double)2);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 6465;BA.debugLine="xt = Graph.Right + h / 2";
_xt = (int) (_graph.Right /*int*/ +_h/(double)2);
 };
 };
 //BA.debugLineNum = 6468;BA.debugLine="TextAlignment = \"CENTER\"";
_textalignment = "CENTER";
 //BA.debugLineNum = 6469;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 6471;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 6472;BA.debugLine="x = mXAxis0 + h";
_x = (int) (_mxaxis0+_h);
 }else {
 //BA.debugLineNum = 6474;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 6475;BA.debugLine="x = Graph.Left + h";
_x = (int) (_graph.Left /*int*/ +_h);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 6477;BA.debugLine="x = Graph.Right + h";
_x = (int) (_graph.Right /*int*/ +_h);
 };
 };
 //BA.debugLineNum = 6480;BA.debugLine="dx = 0.25 * LocalTextHeight";
_dx = (int) (0.25*_localtextheight);
 //BA.debugLineNum = 6481;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 6482;BA.debugLine="If Scale(sY(0)).MaxVal <= 0 Then";
if (_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 6483;BA.debugLine="xt = x - dx - 2dip";
_xt = (int) (_x-_dx-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 6484;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6485;BA.debugLine="rectTextBackground.Left = x - TextWidth - 2";
_recttextbackground.setLeft((float) (_x-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6486;BA.debugLine="rectTextBackground.Right = rectTextBackgrou";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 }else {
 //BA.debugLineNum = 6488;BA.debugLine="xt = x + dx + 2dip";
_xt = (int) (_x+_dx+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 6489;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6490;BA.debugLine="rectTextBackground.Left = x + 2dip";
_recttextbackground.setLeft((float) (_x+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6491;BA.debugLine="rectTextBackground.Right = rectTextBackgrou";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 };
 }else if(_h>0) { 
 //BA.debugLineNum = 6494;BA.debugLine="If Abs(h) + TextWidth < Graph.Right - mXAxis";
if (__c.Abs(_h)+_textwidth<_graph.Right /*int*/ -_mxaxis0) { 
 //BA.debugLineNum = 6495;BA.debugLine="xt = x + dx";
_xt = (int) (_x+_dx);
 //BA.debugLineNum = 6496;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6497;BA.debugLine="rectTextBackground.Left = xt - dx";
_recttextbackground.setLeft((float) (_xt-_dx));
 }else {
 //BA.debugLineNum = 6499;BA.debugLine="xt = mXAxis0 + dx";
_xt = (int) (_mxaxis0+_dx);
 //BA.debugLineNum = 6500;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6501;BA.debugLine="rectTextBackground.Left = xt - TextWidth -";
_recttextbackground.setLeft((float) (_xt-_textwidth-_dx));
 };
 }else {
 //BA.debugLineNum = 6504;BA.debugLine="If Abs(h) + TextWidth < mXAxis0 - Graph.Left";
if (__c.Abs(_h)+_textwidth<_mxaxis0-_graph.Left /*int*/ ) { 
 //BA.debugLineNum = 6505;BA.debugLine="xt = x - dx";
_xt = (int) (_x-_dx);
 //BA.debugLineNum = 6506;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6507;BA.debugLine="rectTextBackground.Left = xt - TextWidth +";
_recttextbackground.setLeft((float) (_xt-_textwidth+_dx));
 }else {
 //BA.debugLineNum = 6509;BA.debugLine="xt = mXAxis0 + dx";
_xt = (int) (_mxaxis0+_dx);
 //BA.debugLineNum = 6510;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6511;BA.debugLine="rectTextBackground.Left = xt - dx";
_recttextbackground.setLeft((float) (_xt-_dx));
 };
 };
 //BA.debugLineNum = 6514;BA.debugLine="rectTextBackground.Right = rectTextBackground";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 //BA.debugLineNum = 6515;BA.debugLine="rectTextBackground.Width = TextWidth";
_recttextbackground.setWidth(_textwidth);
 //BA.debugLineNum = 6517;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundC";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6518;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 6520;BA.debugLine="xcvsGraph.DrawText(valText, xt, yt, LocalFont,";
_xcvsgraph.DrawText(ba,_valtext,(float) (_xt),(float) (_yt),_localfont,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,_textalignment));
 };
 }
};
 }
};
 //BA.debugLineNum = 6524;BA.debugLine="End Sub";
return "";
}
public String  _drawbarvaluesmultiv() throws Exception{
int _i = 0;
int _ip = 0;
int _j = 0;
int _h = 0;
int _x = 0;
int _x0 = 0;
int _xt = 0;
int _dy = 0;
int _y = 0;
int _yt = 0;
int _col = 0;
int _myaxis0 = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttextbackground = null;
int _textwidth = 0;
String _localbarvalueorientation = "";
String _valtext = "";
float _localtextsize = 0f;
int _localtextheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _localfont = null;
b4a.example.xchart._itemdata _id = null;
boolean _forexit = false;
b4a.example.xchart._pointdata _pd = null;
double[] _py = null;
String _textalignment = "";
 //BA.debugLineNum = 5564;BA.debugLine="Private Sub DrawBarValuesMultiV";
 //BA.debugLineNum = 5565;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 5567;BA.debugLine="Private i, ip, j, h, x, x0, xt, dy, y, yt As Int";
_i = 0;
_ip = 0;
_j = 0;
_h = 0;
_x = 0;
_x0 = 0;
_xt = 0;
_dy = 0;
_y = 0;
_yt = 0;
 //BA.debugLineNum = 5568;BA.debugLine="Private Col As Int";
_col = 0;
 //BA.debugLineNum = 5569;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY(0)).Min";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5570;BA.debugLine="Private rectText, rectTextBackground As B4XRect";
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttextbackground = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5571;BA.debugLine="Private TextWidth As Int";
_textwidth = 0;
 //BA.debugLineNum = 5572;BA.debugLine="Private LocalBarValueOrientation As String";
_localbarvalueorientation = "";
 //BA.debugLineNum = 5573;BA.debugLine="Private valText As String";
_valtext = "";
 //BA.debugLineNum = 5574;BA.debugLine="Private LocalTextSize As Float";
_localtextsize = 0f;
 //BA.debugLineNum = 5575;BA.debugLine="Private LocalTextHeight As Int";
_localtextheight = 0;
 //BA.debugLineNum = 5576;BA.debugLine="Private LocalFont As B4XFont";
_localfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 5577;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 5578;BA.debugLine="Private ForExit = False As Boolean";
_forexit = __c.False;
 //BA.debugLineNum = 5579;BA.debugLine="ID = Items.Get(0)";
_id = (b4a.example.xchart._itemdata)(_items.Get((int) (0)));
 //BA.debugLineNum = 5581;BA.debugLine="LocalBarValueOrientation = Graph.BarValueOrientat";
_localbarvalueorientation = _graph.BarValueOrientation /*String*/ ;
 //BA.debugLineNum = 5582;BA.debugLine="LocalFont = Texts.ScaleFont";
_localfont = _texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 5583;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight";
_localtextheight = _texts.ScaleTextHeight /*int*/ ;
 //BA.debugLineNum = 5584;BA.debugLine="LocalTextSize = Texts.ScaleTextSize";
_localtextsize = _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 5586;BA.debugLine="If Graph.BarValueOrientation = \"HORIZONTAL\" Then";
if ((_graph.BarValueOrientation /*String*/ ).equals("HORIZONTAL")) { 
 //BA.debugLineNum = 5588;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step20 = 1;
final int limit20 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 5589;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5590;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5591;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5592;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5593;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step25 = 1;
final int limit25 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit25 ;_j = _j + step25 ) {
 //BA.debugLineNum = 5594;BA.debugLine="rectText = xcvsGraph.MeasureText(NumberFormat3";
_recttext = _xcvsgraph.MeasureText(_numberformat3(_py[_j],_values.MaxDigits /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5595;BA.debugLine="TextWidth = rectText.Width + 1.5 * Texts.Scale";
_textwidth = (int) (_recttext.getWidth()+1.5*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5596;BA.debugLine="If TextWidth + 0.1 * Texts.ScaleTextHeight > G";
if (_textwidth+0.1*_texts.ScaleTextHeight /*int*/ >_graph.BarSubWidth /*int*/ ) { 
 //BA.debugLineNum = 5597;BA.debugLine="LocalBarValueOrientation = \"VERTICAL\"";
_localbarvalueorientation = "VERTICAL";
 //BA.debugLineNum = 5598;BA.debugLine="Log(\"xChart BarValueOrientation set to VERTIC";
__c.LogImpl("910551330","xChart BarValueOrientation set to VERTICAL",0);
 //BA.debugLineNum = 5599;BA.debugLine="ForExit = True";
_forexit = __c.True;
 //BA.debugLineNum = 5600;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 5603;BA.debugLine="If ForExit = True Then";
if (_forexit==__c.True) { 
 //BA.debugLineNum = 5604;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 5609;BA.debugLine="If LocalBarValueOrientation = \"VERTICAL\" Then";
if ((_localbarvalueorientation).equals("VERTICAL")) { 
 //BA.debugLineNum = 5610;BA.debugLine="Private TextAlignment As String";
_textalignment = "";
 //BA.debugLineNum = 5613;BA.debugLine="If Texts.ScaleTextHeight * 1.5 + 4dip > Graph.Ba";
if (_texts.ScaleTextHeight /*int*/ *1.5+__c.DipToCurrent((int) (4))>_graph.BarSubWidth /*int*/ ) { 
 //BA.debugLineNum = 5614;BA.debugLine="rectText = xcvsGraph.MeasureText(\"10\", Texts.Sc";
_recttext = _xcvsgraph.MeasureText("10",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5615;BA.debugLine="LocalTextSize = Min(Texts.ScaleTextSize, Texts.";
_localtextsize = (float) (__c.Min(_texts.ScaleTextSize /*float*/ ,_texts.ScaleTextSize /*float*/ *_graph.BarSubWidth /*int*/ /(double)_texts.ScaleTextHeight /*int*/ /(double)1.2));
 //BA.debugLineNum = 5616;BA.debugLine="LocalFont = xui.CreateFont2(Texts.ScaleFont, Lo";
_localfont = _xui.CreateFont2(_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_localtextsize);
 //BA.debugLineNum = 5617;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight * Local";
_localtextheight = (int) (_texts.ScaleTextHeight /*int*/ *_localtextsize/(double)_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 5618;BA.debugLine="If LocalTextSize < 6 Then";
if (_localtextsize<6) { 
 //BA.debugLineNum = 5619;BA.debugLine="Log(\"Bar value text size too small\")";
__c.LogImpl("910551351","Bar value text size too small",0);
 //BA.debugLineNum = 5620;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 5624;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step52 = 1;
final int limit52 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit52 ;_i = _i + step52 ) {
 //BA.debugLineNum = 5625;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5627;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5628;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5629;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5630;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5632;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ -_graph.BarWidth /*int*/ /(double)2+_graph.BarSubWidth /*int*/ /(double)2+0.43*_localtextheight);
 //BA.debugLineNum = 5633;BA.debugLine="For j = 0 To py.Length - 1";
{
final int step59 = 1;
final int limit59 = (int) (_py.length-1);
_j = (int) (0) ;
for (;_j <= limit59 ;_j = _j + step59 ) {
 //BA.debugLineNum = 5634;BA.debugLine="If py(0) >= Scale(sY(0)).MinVal And py(0) <= S";
if (_py[(int) (0)]>=_scale[_sy[(int) (0)]].MinVal /*double*/  && _py[(int) (0)]<=_scale[_sy[(int) (0)]].MaxVal /*double*/ ) { 
 //BA.debugLineNum = 5635;BA.debugLine="ID = Items.Get(j)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_j));
 //BA.debugLineNum = 5636;BA.debugLine="xt = x0 + j * Graph.BarSubWidth";
_xt = (int) (_x0+_j*_graph.BarSubWidth /*int*/ );
 //BA.debugLineNum = 5637;BA.debugLine="x = xt - 0.9 * LocalTextHeight";
_x = (int) (_xt-0.9*_localtextheight);
 //BA.debugLineNum = 5638;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5639;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5641;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5642;BA.debugLine="h = (py(j) - Scale(sY(0)).MinVal) * Scale(s";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5644;BA.debugLine="h = (py(j) - Scale(sY(0)).MaxVal) * Scale(s";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 };
 //BA.debugLineNum = 5647;BA.debugLine="valText = NumberFormat3(py(j), Values.MaxDigi";
_valtext = _numberformat3(_py[_j],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 5648;BA.debugLine="rectText = xcvsGraph.MeasureText(valText, Loc";
_recttext = _xcvsgraph.MeasureText(_valtext,_localfont);
 //BA.debugLineNum = 5649;BA.debugLine="TextWidth = rectText.Width + 0.5 * LocalTextH";
_textwidth = (int) (_recttext.getWidth()+0.5*_localtextheight);
 //BA.debugLineNum = 5650;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 5651;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(s";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5652;BA.debugLine="yt = mYAxis0 - h / 2";
_yt = (int) (_myaxis0-_h/(double)2);
 }else {
 //BA.debugLineNum = 5654;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5655;BA.debugLine="yt = Graph.Bottom - h / 2";
_yt = (int) (_graph.Bottom /*int*/ -_h/(double)2);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5657;BA.debugLine="yt = Graph.Top - h / 2";
_yt = (int) (_graph.Top /*int*/ -_h/(double)2);
 };
 };
 //BA.debugLineNum = 5660;BA.debugLine="TextAlignment = \"CENTER\"";
_textalignment = "CENTER";
 //BA.debugLineNum = 5661;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 5663;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(s";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5664;BA.debugLine="y = mYAxis0 - h";
_y = (int) (_myaxis0-_h);
 }else {
 //BA.debugLineNum = 5666;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5667;BA.debugLine="y = Graph.Bottom - h";
_y = (int) (_graph.Bottom /*int*/ -_h);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5669;BA.debugLine="y = Graph.Top - h";
_y = (int) (_graph.Top /*int*/ -_h);
 };
 };
 //BA.debugLineNum = 5672;BA.debugLine="dy = 0.25 * LocalTextHeight";
_dy = (int) (0.25*_localtextheight);
 //BA.debugLineNum = 5673;BA.debugLine="rectTextBackground.Initialize(x, y, x + Loca";
_recttextbackground.Initialize((float) (_x),(float) (_y),(float) (_x+_localtextheight),(float) (_y+_textwidth));
 //BA.debugLineNum = 5674;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 5675;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 5676;BA.debugLine="If Scale(sY(0)).MinVal < 0 And Scale(sY(0))";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5677;BA.debugLine="yt = y + dy + 2dip";
_yt = (int) (_y+_dy+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5678;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 5679;BA.debugLine="rectTextBackground.Top = y + 2dip";
_recttextbackground.setTop((float) (_y+__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 5681;BA.debugLine="yt = y - dy - 2dip";
_yt = (int) (_y-_dy-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5682;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 5683;BA.debugLine="rectTextBackground.Top = y - TextWidth - 2";
_recttextbackground.setTop((float) (_y-_textwidth-__c.DipToCurrent((int) (2))));
 };
 }else if(_h>0) { 
 //BA.debugLineNum = 5686;BA.debugLine="If Abs(h) + TextWidth > mYAxis0 - Graph.Top";
if (__c.Abs(_h)+_textwidth>_myaxis0-_graph.Top /*int*/ ) { 
 //BA.debugLineNum = 5687;BA.debugLine="yt = mYAxis0 + dy + 2dip";
_yt = (int) (_myaxis0+_dy+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5688;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 5689;BA.debugLine="rectTextBackground.Top = mYAxis0 + 2dip";
_recttextbackground.setTop((float) (_myaxis0+__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 5691;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 5692;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 5693;BA.debugLine="rectTextBackground.Top = y - TextWidth";
_recttextbackground.setTop((float) (_y-_textwidth));
 };
 }else {
 //BA.debugLineNum = 5696;BA.debugLine="If Abs(h) + TextWidth > Graph.Bottom - mYAx";
if (__c.Abs(_h)+_textwidth>_graph.Bottom /*int*/ -_myaxis0) { 
 //BA.debugLineNum = 5697;BA.debugLine="yt = mYAxis0 - dy- 2dip";
_yt = (int) (_myaxis0-_dy-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5698;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 5699;BA.debugLine="rectTextBackground.Top = mYAxis0 - TextWid";
_recttextbackground.setTop((float) (_myaxis0-_textwidth-__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 5701;BA.debugLine="yt = y + dy";
_yt = (int) (_y+_dy);
 //BA.debugLineNum = 5702;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 5703;BA.debugLine="rectTextBackground.Top = y";
_recttextbackground.setTop((float) (_y));
 };
 };
 //BA.debugLineNum = 5706;BA.debugLine="rectTextBackground.Bottom = rectTextBackgrou";
_recttextbackground.setBottom((float) (_recttextbackground.getTop()+_textwidth));
 //BA.debugLineNum = 5707;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 5709;BA.debugLine="Col = GetContrastColor(Graph.ChartBackground";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 5710;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 5712;BA.debugLine="xcvsGraph.DrawTextRotated(valText, xt, yt, Lo";
_xcvsgraph.DrawTextRotated(ba,_valtext,(float) (_xt),(float) (_yt),_localfont,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,_textalignment),(float) (-90));
 };
 }
};
 }
};
 }else {
 //BA.debugLineNum = 5717;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step142 = 1;
final int limit142 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit142 ;_i = _i + step142 ) {
 //BA.debugLineNum = 5718;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5720;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5721;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5722;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5723;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5724;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ -_graph.BarWidth /*int*/ /(double)2+_graph.BarSubWidth /*int*/ /(double)2);
 //BA.debugLineNum = 5725;BA.debugLine="For j = 0 To py.Length - 1";
{
final int step149 = 1;
final int limit149 = (int) (_py.length-1);
_j = (int) (0) ;
for (;_j <= limit149 ;_j = _j + step149 ) {
 //BA.debugLineNum = 5726;BA.debugLine="ID = Items.Get(j)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_j));
 //BA.debugLineNum = 5727;BA.debugLine="xt = x0 + j * Graph.BarSubWidth";
_xt = (int) (_x0+_j*_graph.BarSubWidth /*int*/ );
 //BA.debugLineNum = 5728;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5729;BA.debugLine="h = py(j) * Scale(sY(0)).Scale";
_h = (int) (_py[_j]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5731;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5732;BA.debugLine="h = (py(j) - Scale(sY(0)).MinVal) * Scale(sY";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5734;BA.debugLine="h = (py(j) - Scale(sY(0)).MaxVal) * Scale(sY";
_h = (int) ((_py[_j]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 };
 //BA.debugLineNum = 5737;BA.debugLine="valText = NumberFormat3(py(j), Values.MaxDigit";
_valtext = _numberformat3(_py[_j],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 5738;BA.debugLine="rectText = xcvsGraph.MeasureText(valText, Loca";
_recttext = _xcvsgraph.MeasureText(_valtext,_localfont);
 //BA.debugLineNum = 5739;BA.debugLine="TextWidth = rectText.Width + 0.5 * LocalTextHe";
_textwidth = (int) (_recttext.getWidth()+0.5*_localtextheight);
 //BA.debugLineNum = 5740;BA.debugLine="If Abs(h) > 2.25 * Texts.ScaleTextHeight Then";
if (__c.Abs(_h)>2.25*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5741;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5742;BA.debugLine="y = mYAxis0 - h / 2";
_y = (int) (_myaxis0-_h/(double)2);
 }else {
 //BA.debugLineNum = 5744;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5745;BA.debugLine="y = Graph.Bottom - h / 2";
_y = (int) (_graph.Bottom /*int*/ -_h/(double)2);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5747;BA.debugLine="y = Graph.Top - h / 2";
_y = (int) (_graph.Top /*int*/ -_h/(double)2);
 };
 };
 //BA.debugLineNum = 5750;BA.debugLine="If h >= 0 Then";
if (_h>=0) { 
 //BA.debugLineNum = 5751;BA.debugLine="y = y + 0.45 * Texts.ScaleTextHeight";
_y = (int) (_y+0.45*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 5753;BA.debugLine="y = y + 0.38 * Texts.ScaleTextHeight";
_y = (int) (_y+0.38*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 5755;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 5757;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5758;BA.debugLine="y = mYAxis0 - h";
_y = (int) (_myaxis0-_h);
 }else {
 //BA.debugLineNum = 5760;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5761;BA.debugLine="y = Graph.Bottom - h";
_y = (int) (_graph.Bottom /*int*/ -_h);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5763;BA.debugLine="y = Graph.Top - h";
_y = (int) (_graph.Top /*int*/ -_h);
 };
 };
 //BA.debugLineNum = 5766;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 5767;BA.debugLine="If Scale(sY(0)).MinVal < 0 And Scale(sY(0)).";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5768;BA.debugLine="y = y + 1.45 * Texts.ScaleTextHeight";
_y = (int) (_y+1.45*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 5770;BA.debugLine="y = y - 1.5 * Texts.ScaleTextHeight / 3";
_y = (int) (_y-1.5*_texts.ScaleTextHeight /*int*/ /(double)3);
 };
 }else if(_h>0) { 
 //BA.debugLineNum = 5773;BA.debugLine="y = y - 1.5 * Texts.ScaleTextHeight / 3";
_y = (int) (_y-1.5*_texts.ScaleTextHeight /*int*/ /(double)3);
 }else {
 //BA.debugLineNum = 5775;BA.debugLine="y = y + 1.45 * Texts.ScaleTextHeight";
_y = (int) (_y+1.45*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 5777;BA.debugLine="rectTextBackground.Initialize(xt - TextWidth";
_recttextbackground.Initialize((float) (_xt-_textwidth/(double)2),(float) (_y+1.1*_recttext.getTop()),(float) (_xt+_textwidth/(double)2),(float) (_y-0.1*_recttext.getTop()));
 //BA.debugLineNum = 5778;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundC";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 5779;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 5781;BA.debugLine="xcvsGraph.DrawText(valText, xt, y, Texts.Scale";
_xcvsgraph.DrawText(ba,_valtext,(float) (_xt),(float) (_y),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
 }
};
 };
 //BA.debugLineNum = 5785;BA.debugLine="End Sub";
return "";
}
public String  _drawbarvaluessingleh() throws Exception{
int _i = 0;
int _x = 0;
int _xt = 0;
int _dx = 0;
int _y = 0;
int _yt = 0;
double _h = 0;
int _col = 0;
int _mxaxis0 = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttextbackground = null;
int _textwidth = 0;
String _valtext = "";
float _localtextsize = 0f;
int _localtextheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _localfont = null;
b4a.example.xchart._itemdata _id = null;
String _textalignment = "";
b4a.example.xchart._pointdata _pd = null;
int _ip = 0;
double[] _py = null;
 //BA.debugLineNum = 6251;BA.debugLine="Private Sub DrawBarValuesSingleH";
 //BA.debugLineNum = 6252;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 6254;BA.debugLine="Private i, x, xt, dx, y, yt As Int";
_i = 0;
_x = 0;
_xt = 0;
_dx = 0;
_y = 0;
_yt = 0;
 //BA.debugLineNum = 6255;BA.debugLine="Private h As Double";
_h = 0;
 //BA.debugLineNum = 6256;BA.debugLine="Private Col As Int";
_col = 0;
 //BA.debugLineNum = 6257;BA.debugLine="Private mXAxis0 As Int";
_mxaxis0 = 0;
 //BA.debugLineNum = 6258;BA.debugLine="Private rectText, rectTextBackground As B4XRect";
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttextbackground = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6259;BA.debugLine="Private TextWidth As Int";
_textwidth = 0;
 //BA.debugLineNum = 6260;BA.debugLine="Private valText As String";
_valtext = "";
 //BA.debugLineNum = 6261;BA.debugLine="Private LocalTextSize As Float";
_localtextsize = 0f;
 //BA.debugLineNum = 6262;BA.debugLine="Private LocalTextHeight As Int";
_localtextheight = 0;
 //BA.debugLineNum = 6263;BA.debugLine="Private LocalFont As B4XFont";
_localfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 6264;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 6266;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 6267;BA.debugLine="mXAxis0 = Graph.Left";
_mxaxis0 = _graph.Left /*int*/ ;
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 6269;BA.debugLine="mXAxis0 = Graph.Right";
_mxaxis0 = _graph.Right /*int*/ ;
 }else {
 //BA.debugLineNum = 6271;BA.debugLine="mXAxis0 = Graph.Left - Scale(sY(0)).MinVal * Sca";
_mxaxis0 = (int) (_graph.Left /*int*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 6274;BA.debugLine="ID = Items.Get(0)";
_id = (b4a.example.xchart._itemdata)(_items.Get((int) (0)));
 //BA.debugLineNum = 6276;BA.debugLine="LocalFont = Texts.ScaleFont";
_localfont = _texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 6277;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight";
_localtextheight = _texts.ScaleTextHeight /*int*/ ;
 //BA.debugLineNum = 6278;BA.debugLine="LocalTextSize = Texts.ScaleTextSize";
_localtextsize = _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 6280;BA.debugLine="Private TextAlignment As String";
_textalignment = "";
 //BA.debugLineNum = 6283;BA.debugLine="If Texts.ScaleTextHeight * 1.5 + 4dip > Graph.Bar";
if (_texts.ScaleTextHeight /*int*/ *1.5+__c.DipToCurrent((int) (4))>_graph.BarWidth /*int*/ ) { 
 //BA.debugLineNum = 6284;BA.debugLine="rectText = xcvsGraph.MeasureText(\"10\", Texts.Sca";
_recttext = _xcvsgraph.MeasureText("10",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 6285;BA.debugLine="LocalTextSize = Min(Texts.ScaleTextSize, Texts.S";
_localtextsize = (float) (__c.Min(_texts.ScaleTextSize /*float*/ ,_texts.ScaleTextSize /*float*/ *_graph.BarWidth /*int*/ /(double)_texts.ScaleTextHeight /*int*/ /(double)1.2));
 //BA.debugLineNum = 6286;BA.debugLine="LocalFont = xui.CreateFont2(Texts.ScaleFont, Loc";
_localfont = _xui.CreateFont2(_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_localtextsize);
 //BA.debugLineNum = 6287;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight * LocalT";
_localtextheight = (int) (_texts.ScaleTextHeight /*int*/ *_localtextsize/(double)_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 6288;BA.debugLine="If LocalTextSize < 6 Then";
if (_localtextsize<6) { 
 //BA.debugLineNum = 6289;BA.debugLine="Log(\"Bar value text size too small\")";
__c.LogImpl("910747942","Bar value text size too small",0);
 //BA.debugLineNum = 6290;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 6294;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step35 = 1;
final int limit35 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit35 ;_i = _i + step35 ) {
 //BA.debugLineNum = 6295;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6296;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 6298;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 6299;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6300;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 6301;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 6302;BA.debugLine="valText = NumberFormat3(py(0), Values.MaxDigits)";
_valtext = _numberformat3(_py[(int) (0)],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 6304;BA.debugLine="If py(0) >= Scale(sY(0)).MinVal And py(0) <= Sca";
if (_py[(int) (0)]>=_scale[_sy[(int) (0)]].MinVal /*double*/  && _py[(int) (0)]<=_scale[_sy[(int) (0)]].MaxVal /*double*/ ) { 
 //BA.debugLineNum = 6305;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 6306;BA.debugLine="yt = Graph.Bottom - Graph.XOffset - (ip + 0.5)";
_yt = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 6308;BA.debugLine="yt = Graph.Top + Graph.XOffset + (ip + 0.5) *";
_yt = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 6310;BA.debugLine="y = yt - 0.7 * LocalTextHeight";
_y = (int) (_yt-0.7*_localtextheight);
 //BA.debugLineNum = 6311;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(0";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 6312;BA.debugLine="h = py(0) * Scale(sY(0)).Scale";
_h = _py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 6314;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 6315;BA.debugLine="h = (py(0) - Scale(sY(0)).MinVal) * Scale(sY(";
_h = (_py[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 6317;BA.debugLine="h = (py(0) - Scale(sY(0)).MaxVal) * Scale(sY(";
_h = (_py[(int) (0)]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 };
 };
 //BA.debugLineNum = 6320;BA.debugLine="rectText = xcvsGraph.MeasureText(py(0), LocalFo";
_recttext = _xcvsgraph.MeasureText(BA.NumberToString(_py[(int) (0)]),_localfont);
 //BA.debugLineNum = 6321;BA.debugLine="yt = yt - rectText.CenterY";
_yt = (int) (_yt-_recttext.getCenterY());
 //BA.debugLineNum = 6322;BA.debugLine="TextWidth = rectText.Width + LocalTextHeight";
_textwidth = (int) (_recttext.getWidth()+_localtextheight);
 //BA.debugLineNum = 6323;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 6324;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 6325;BA.debugLine="xt = mXAxis0 + h / 2";
_xt = (int) (_mxaxis0+_h/(double)2);
 }else {
 //BA.debugLineNum = 6327;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 6328;BA.debugLine="xt = Graph.Left + h / 2";
_xt = (int) (_graph.Left /*int*/ +_h/(double)2);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 6330;BA.debugLine="xt = Graph.Right + h / 2";
_xt = (int) (_graph.Right /*int*/ +_h/(double)2);
 };
 };
 //BA.debugLineNum = 6333;BA.debugLine="TextAlignment = \"CENTER\"";
_textalignment = "CENTER";
 //BA.debugLineNum = 6334;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 6336;BA.debugLine="x = mXAxis0 + h";
_x = (int) (_mxaxis0+_h);
 //BA.debugLineNum = 6337;BA.debugLine="dx = 0.5 * LocalTextHeight";
_dx = (int) (0.5*_localtextheight);
 //BA.debugLineNum = 6338;BA.debugLine="rectTextBackground.Initialize(x, y, x + TextWi";
_recttextbackground.Initialize((float) (_x),(float) (_y),(float) (_x+_textwidth),(float) (_y+1.4*_localtextheight));
 //BA.debugLineNum = 6339;BA.debugLine="rectTextBackground.Width = TextWidth";
_recttextbackground.setWidth(_textwidth);
 //BA.debugLineNum = 6340;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 6341;BA.debugLine="If Scale(sY(0)).MinVal < 0 And Scale(sY(0)).M";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 6342;BA.debugLine="xt = x - dx + 2dip";
_xt = (int) (_x-_dx+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 6343;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6344;BA.debugLine="rectTextBackground.Left = x - TextWidth - 2d";
_recttextbackground.setLeft((float) (_x-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6345;BA.debugLine="rectTextBackground.Right = rectTextBackgroun";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 }else {
 //BA.debugLineNum = 6347;BA.debugLine="xt = x + dx - 2dip";
_xt = (int) (_x+_dx-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 6348;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6349;BA.debugLine="rectTextBackground.Left = x + 2dip";
_recttextbackground.setLeft((float) (_x+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6350;BA.debugLine="rectTextBackground.Right = rectTextBackgroun";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 };
 }else if(_h<0) { 
 //BA.debugLineNum = 6353;BA.debugLine="If Abs(h) + TextWidth > mXAxis0 - Graph.Left";
if (__c.Abs(_h)+_textwidth>_mxaxis0-_graph.Left /*int*/ ) { 
 //BA.debugLineNum = 6354;BA.debugLine="xt = mXAxis0 + h + dx + 2dip";
_xt = (int) (_mxaxis0+_h+_dx+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 6355;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6356;BA.debugLine="rectTextBackground.Left = mXAxis0 + h + 2dip";
_recttextbackground.setLeft((float) (_mxaxis0+_h+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6357;BA.debugLine="rectTextBackground.Right = rectTextBackgroun";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 }else {
 //BA.debugLineNum = 6359;BA.debugLine="xt = x - dx";
_xt = (int) (_x-_dx);
 //BA.debugLineNum = 6360;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6361;BA.debugLine="rectTextBackground.Left = x - TextWidth";
_recttextbackground.setLeft((float) (_x-_textwidth));
 //BA.debugLineNum = 6362;BA.debugLine="rectTextBackground.Right = rectTextBackgroun";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 };
 }else {
 //BA.debugLineNum = 6365;BA.debugLine="If Abs(h) + TextWidth > Graph.Right - mXAxis0";
if (__c.Abs(_h)+_textwidth>_graph.Right /*int*/ -_mxaxis0) { 
 //BA.debugLineNum = 6366;BA.debugLine="xt = mXAxis0  + h - dx - 2dip";
_xt = (int) (_mxaxis0+_h-_dx-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 6367;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6368;BA.debugLine="rectTextBackground.Left = mXAxis0  + h - Tex";
_recttextbackground.setLeft((float) (_mxaxis0+_h-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6369;BA.debugLine="rectTextBackground.Right = rectTextBackgroun";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 }else {
 //BA.debugLineNum = 6371;BA.debugLine="xt = x + dx";
_xt = (int) (_x+_dx);
 //BA.debugLineNum = 6372;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6373;BA.debugLine="rectTextBackground.Left = x";
_recttextbackground.setLeft((float) (_x));
 //BA.debugLineNum = 6374;BA.debugLine="rectTextBackground.Right = rectTextBackgroun";
_recttextbackground.setRight((float) (_recttextbackground.getLeft()+_textwidth));
 };
 };
 //BA.debugLineNum = 6378;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundCo";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6379;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.C";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 6381;BA.debugLine="xcvsGraph.DrawText(valText, xt, yt, LocalFont,";
_xcvsgraph.DrawText(ba,_valtext,(float) (_xt),(float) (_yt),_localfont,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,_textalignment));
 };
 }
};
 //BA.debugLineNum = 6384;BA.debugLine="End Sub";
return "";
}
public String  _drawbarvaluessinglev() throws Exception{
int _i = 0;
int _ip = 0;
int _h = 0;
int _x = 0;
int _xt = 0;
int _dy = 0;
int _y = 0;
int _yt = 0;
int _col = 0;
int _myaxis0 = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttextbackground = null;
int _textwidth = 0;
String _localbarvalueorientation = "";
String _valtext = "";
float _localtextsize = 0f;
int _localtextheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _localfont = null;
b4a.example.xchart._itemdata _id = null;
b4a.example.xchart._pointdata _pd = null;
double[] _py = null;
String _textalignment = "";
 //BA.debugLineNum = 5788;BA.debugLine="Private Sub DrawBarValuesSingleV";
 //BA.debugLineNum = 5789;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 5791;BA.debugLine="Private i, ip, h, x, xt, dy, y, yt As Int";
_i = 0;
_ip = 0;
_h = 0;
_x = 0;
_xt = 0;
_dy = 0;
_y = 0;
_yt = 0;
 //BA.debugLineNum = 5792;BA.debugLine="Private Col As Int";
_col = 0;
 //BA.debugLineNum = 5793;BA.debugLine="Private mYAxis0 As Int";
_myaxis0 = 0;
 //BA.debugLineNum = 5794;BA.debugLine="Private rectText, rectTextBackground As B4XRect";
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttextbackground = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5795;BA.debugLine="Private TextWidth As Int";
_textwidth = 0;
 //BA.debugLineNum = 5796;BA.debugLine="Private LocalBarValueOrientation As String";
_localbarvalueorientation = "";
 //BA.debugLineNum = 5797;BA.debugLine="Private valText As String";
_valtext = "";
 //BA.debugLineNum = 5798;BA.debugLine="Private LocalTextSize As Float";
_localtextsize = 0f;
 //BA.debugLineNum = 5799;BA.debugLine="Private LocalTextHeight As Int";
_localtextheight = 0;
 //BA.debugLineNum = 5800;BA.debugLine="Private LocalFont As B4XFont";
_localfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 5801;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 5803;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal * Sc";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5805;BA.debugLine="ID = Items.Get(0)";
_id = (b4a.example.xchart._itemdata)(_items.Get((int) (0)));
 //BA.debugLineNum = 5807;BA.debugLine="LocalBarValueOrientation = Graph.BarValueOrientat";
_localbarvalueorientation = _graph.BarValueOrientation /*String*/ ;
 //BA.debugLineNum = 5808;BA.debugLine="LocalFont = Texts.ScaleFont";
_localfont = _texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 5809;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight";
_localtextheight = _texts.ScaleTextHeight /*int*/ ;
 //BA.debugLineNum = 5810;BA.debugLine="LocalTextSize = Texts.ScaleTextSize";
_localtextsize = _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 5812;BA.debugLine="If Graph.BarValueOrientation = \"HORIZONTAL\" Then";
if ((_graph.BarValueOrientation /*String*/ ).equals("HORIZONTAL")) { 
 //BA.debugLineNum = 5813;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step20 = 1;
final int limit20 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 5814;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5816;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5817;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5818;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5819;BA.debugLine="rectText = xcvsGraph.MeasureText(NumberFormat3(";
_recttext = _xcvsgraph.MeasureText(_numberformat3(_py[(int) (0)],_values.MaxDigits /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5820;BA.debugLine="TextWidth = rectText.Width + 1.5 * Texts.ScaleT";
_textwidth = (int) (_recttext.getWidth()+1.5*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 5821;BA.debugLine="If TextWidth + 0.1 * Texts.ScaleTextHeight > Gr";
if (_textwidth+0.1*_texts.ScaleTextHeight /*int*/ >_graph.XInterval /*double*/ ) { 
 //BA.debugLineNum = 5822;BA.debugLine="LocalBarValueOrientation = \"VERTICAL\"";
_localbarvalueorientation = "VERTICAL";
 //BA.debugLineNum = 5823;BA.debugLine="Log(\"xChart BarValueOrientation set to VERTICA";
__c.LogImpl("910616867","xChart BarValueOrientation set to VERTICAL",0);
 //BA.debugLineNum = 5824;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 5829;BA.debugLine="If LocalBarValueOrientation = \"VERTICAL\" Then";
if ((_localbarvalueorientation).equals("VERTICAL")) { 
 //BA.debugLineNum = 5830;BA.debugLine="Private TextAlignment As String";
_textalignment = "";
 //BA.debugLineNum = 5833;BA.debugLine="If Texts.ScaleTextHeight * 1.5 + 4dip > Graph.Ba";
if (_texts.ScaleTextHeight /*int*/ *1.5+__c.DipToCurrent((int) (4))>_graph.BarWidth /*int*/ ) { 
 //BA.debugLineNum = 5834;BA.debugLine="rectText = xcvsGraph.MeasureText(\"10\", Texts.Sc";
_recttext = _xcvsgraph.MeasureText("10",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5835;BA.debugLine="LocalTextSize = Min(Texts.ScaleTextSize, Texts.";
_localtextsize = (float) (__c.Min(_texts.ScaleTextSize /*float*/ ,_texts.ScaleTextSize /*float*/ *_graph.BarWidth /*int*/ /(double)_texts.ScaleTextHeight /*int*/ /(double)1.2));
 //BA.debugLineNum = 5836;BA.debugLine="LocalFont = xui.CreateFont2(Texts.ScaleFont, Lo";
_localfont = _xui.CreateFont2(_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_localtextsize);
 //BA.debugLineNum = 5837;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight * Local";
_localtextheight = (int) (_texts.ScaleTextHeight /*int*/ *_localtextsize/(double)_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 5838;BA.debugLine="If LocalTextSize < 6 Then";
if (_localtextsize<6) { 
 //BA.debugLineNum = 5839;BA.debugLine="Log(\"Bar value text size too small\")";
__c.LogImpl("910616883","Bar value text size too small",0);
 //BA.debugLineNum = 5840;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 5844;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step46 = 1;
final int limit46 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit46 ;_i = _i + step46 ) {
 //BA.debugLineNum = 5845;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5847;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5848;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5849;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5850;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5851;BA.debugLine="valText = NumberFormat3(py(0), Values.MaxDigits";
_valtext = _numberformat3(_py[(int) (0)],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 5853;BA.debugLine="If py(0) >= Round2(Scale(sY(0)).MinVal, 14) And";
if (_py[(int) (0)]>=__c.Round2(_scale[_sy[(int) (0)]].MinVal /*double*/ ,(int) (14)) && _py[(int) (0)]<=__c.Round2(_scale[_sy[(int) (0)]].MaxVal /*double*/ ,(int) (14))) { 
 //BA.debugLineNum = 5854;BA.debugLine="xt = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_xt = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ +0.4*_localtextheight);
 //BA.debugLineNum = 5855;BA.debugLine="x = xt - 0.9 * LocalTextHeight";
_x = (int) (_xt-0.9*_localtextheight);
 //BA.debugLineNum = 5856;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5857;BA.debugLine="h = py(0) * Scale(sY(0)).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5859;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5860;BA.debugLine="h = (py(0) - Scale(sY(0)).MinVal) * Scale(sY";
_h = (int) ((_py[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5862;BA.debugLine="h = (py(0) - Scale(sY(0)).MaxVal) * Scale(sY";
_h = (int) ((_py[(int) (0)]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 };
 //BA.debugLineNum = 5865;BA.debugLine="rectText = xcvsGraph.MeasureText(valText, Loca";
_recttext = _xcvsgraph.MeasureText(_valtext,_localfont);
 //BA.debugLineNum = 5866;BA.debugLine="TextWidth = rectText.Width + LocalTextHeight";
_textwidth = (int) (_recttext.getWidth()+_localtextheight);
 //BA.debugLineNum = 5867;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 5868;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5869;BA.debugLine="yt = mYAxis0 - h / 2";
_yt = (int) (_myaxis0-_h/(double)2);
 }else {
 //BA.debugLineNum = 5871;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5872;BA.debugLine="yt = Graph.Bottom - h / 2";
_yt = (int) (_graph.Bottom /*int*/ -_h/(double)2);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5874;BA.debugLine="yt = Graph.Top - h / 2";
_yt = (int) (_graph.Top /*int*/ -_h/(double)2);
 };
 };
 //BA.debugLineNum = 5877;BA.debugLine="TextAlignment = \"CENTER\"";
_textalignment = "CENTER";
 //BA.debugLineNum = 5878;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 5880;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5881;BA.debugLine="y = mYAxis0 - h";
_y = (int) (_myaxis0-_h);
 }else {
 //BA.debugLineNum = 5883;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5884;BA.debugLine="y = Graph.Bottom - h";
_y = (int) (_graph.Bottom /*int*/ -_h);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5886;BA.debugLine="y = Graph.Top - h";
_y = (int) (_graph.Top /*int*/ -_h);
 };
 };
 //BA.debugLineNum = 5889;BA.debugLine="dy = 0.25 * LocalTextHeight";
_dy = (int) (0.25*_localtextheight);
 //BA.debugLineNum = 5890;BA.debugLine="rectTextBackground.Initialize(x, y, x + Local";
_recttextbackground.Initialize((float) (_x),(float) (_y),(float) (_x+_localtextheight),(float) (_y+_textwidth));
 //BA.debugLineNum = 5891;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 5892;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 5893;BA.debugLine="If Scale(sY(0)).MinVal < 0 And Scale(sY(0)).";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5894;BA.debugLine="yt = y + dy + 2dip";
_yt = (int) (_y+_dy+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5895;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 5896;BA.debugLine="rectTextBackground.Top = y + 2dip";
_recttextbackground.setTop((float) (_y+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 5897;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 5899;BA.debugLine="yt = y - dy - 2dip";
_yt = (int) (_y-_dy-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5900;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 5901;BA.debugLine="rectTextBackground.Top = y - TextWidth - 2d";
_recttextbackground.setTop((float) (_y-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 5902;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 };
 }else if(_h>0) { 
 //BA.debugLineNum = 5905;BA.debugLine="If Abs(h) + TextWidth > mYAxis0 - Graph.Top";
if (__c.Abs(_h)+_textwidth>_myaxis0-_graph.Top /*int*/ ) { 
 //BA.debugLineNum = 5906;BA.debugLine="yt = mYAxis0 + dy + 2dip";
_yt = (int) (_myaxis0+_dy+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5907;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 5908;BA.debugLine="rectTextBackground.Top = mYAxis0 + 2dip";
_recttextbackground.setTop((float) (_myaxis0+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 5909;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 5911;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 5912;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 5913;BA.debugLine="rectTextBackground.Top = y - TextWidth";
_recttextbackground.setTop((float) (_y-_textwidth));
 //BA.debugLineNum = 5914;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 };
 }else {
 //BA.debugLineNum = 5917;BA.debugLine="If Abs(h) + TextWidth > Graph.Bottom - mYAxi";
if (__c.Abs(_h)+_textwidth>_graph.Bottom /*int*/ -_myaxis0) { 
 //BA.debugLineNum = 5918;BA.debugLine="yt = mYAxis0 - dy- 2dip";
_yt = (int) (_myaxis0-_dy-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 5919;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 5920;BA.debugLine="rectTextBackground.Top = mYAxis0 - TextWidt";
_recttextbackground.setTop((float) (_myaxis0-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 5921;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 5923;BA.debugLine="yt = y + dy";
_yt = (int) (_y+_dy);
 //BA.debugLineNum = 5924;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 5925;BA.debugLine="rectTextBackground.Top = y";
_recttextbackground.setTop((float) (_y));
 //BA.debugLineNum = 5926;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 };
 };
 //BA.debugLineNum = 5930;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundC";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 5931;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 5933;BA.debugLine="xcvsGraph.DrawTextRotated(valText, xt, yt, Loc";
_xcvsgraph.DrawTextRotated(ba,_valtext,(float) (_xt),(float) (_yt),_localfont,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,_textalignment),(float) (-90));
 };
 }
};
 }else {
 //BA.debugLineNum = 5937;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step136 = 1;
final int limit136 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit136 ;_i = _i + step136 ) {
 //BA.debugLineNum = 5938;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 5940;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 5941;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 5942;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 5943;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 5944;BA.debugLine="valText = NumberFormat3(py(0), Values.MaxDigits";
_valtext = _numberformat3(_py[(int) (0)],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 5946;BA.debugLine="x = Graph.Left + Graph.XOffset + (ip + 0.5) * G";
_x = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 5947;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(0";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5948;BA.debugLine="h = py(0) * Scale(sY(0)).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5950;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5951;BA.debugLine="h = (py(0) - Scale(sY(0)).MinVal) * Scale(sY(";
_h = (int) ((_py[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 5953;BA.debugLine="h = (py(0) - Scale(sY(0)).MaxVal) * Scale(sY(";
_h = (int) ((_py[(int) (0)]-_scale[_sy[(int) (0)]].MaxVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 };
 //BA.debugLineNum = 5956;BA.debugLine="If Abs(h) > 2.25 * Texts.ScaleTextHeight Then";
if (__c.Abs(_h)>2.25*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 5957;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5958;BA.debugLine="y = mYAxis0 - h / 2";
_y = (int) (_myaxis0-_h/(double)2);
 }else {
 //BA.debugLineNum = 5960;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5961;BA.debugLine="y = Graph.Bottom - h / 2";
_y = (int) (_graph.Bottom /*int*/ -_h/(double)2);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5963;BA.debugLine="y = Graph.Top - h / 2";
_y = (int) (_graph.Top /*int*/ -_h/(double)2);
 };
 };
 //BA.debugLineNum = 5966;BA.debugLine="If h >= 0 Then";
if (_h>=0) { 
 //BA.debugLineNum = 5967;BA.debugLine="y = y + 0.45 * Texts.ScaleTextHeight";
_y = (int) (_y+0.45*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 5969;BA.debugLine="y = y + 0.38 * Texts.ScaleTextHeight";
_y = (int) (_y+0.38*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 5971;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 5973;BA.debugLine="If Scale(sY(0)).Automatic = True Or (Scale(sY(";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True || (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0)) { 
 //BA.debugLineNum = 5974;BA.debugLine="y = mYAxis0 - h";
_y = (int) (_myaxis0-_h);
 }else {
 //BA.debugLineNum = 5976;BA.debugLine="If Scale(sY(0)).MinVal >= 0 Then";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ >=0) { 
 //BA.debugLineNum = 5977;BA.debugLine="y = Graph.Bottom - h";
_y = (int) (_graph.Bottom /*int*/ -_h);
 }else if(_scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5979;BA.debugLine="y = Graph.Top - h";
_y = (int) (_graph.Top /*int*/ -_h);
 };
 };
 //BA.debugLineNum = 5982;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 5983;BA.debugLine="If Scale(sY(0)).MinVal < 0 And Scale(sY(0)).M";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 5984;BA.debugLine="y = y + 1.45 * Texts.ScaleTextHeight";
_y = (int) (_y+1.45*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 5986;BA.debugLine="y = y - 1.5 * Texts.ScaleTextHeight / 3";
_y = (int) (_y-1.5*_texts.ScaleTextHeight /*int*/ /(double)3);
 };
 }else if(_h>0) { 
 //BA.debugLineNum = 5989;BA.debugLine="y = y - 1.5 * Texts.ScaleTextHeight / 3";
_y = (int) (_y-1.5*_texts.ScaleTextHeight /*int*/ /(double)3);
 }else {
 //BA.debugLineNum = 5991;BA.debugLine="y = y + 1.45 * Texts.ScaleTextHeight";
_y = (int) (_y+1.45*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 5994;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundCo";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 5995;BA.debugLine="rectTextBackground.Initialize(x - TextWidth /";
_recttextbackground.Initialize((float) (_x-_textwidth/(double)2),(float) (_y+1.1*_recttext.getTop()),(float) (_x+_textwidth/(double)2),(float) (_y-0.1*_recttext.getTop()));
 //BA.debugLineNum = 5996;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.C";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 5998;BA.debugLine="xcvsGraph.DrawText(valText, x, y, Texts.ScaleFo";
_xcvsgraph.DrawText(ba,_valtext,(float) (_x),(float) (_y),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
 };
 //BA.debugLineNum = 6001;BA.debugLine="End Sub";
return "";
}
public String  _drawbubblecircle(int _x,int _y,double _val,b4a.example.xchart._bubbledata _bd) throws Exception{
int _radius = 0;
int _col = 0;
 //BA.debugLineNum = 4569;BA.debugLine="Private Sub DrawBubbleCircle(x As Int, y As Int, V";
 //BA.debugLineNum = 4570;BA.debugLine="Private Radius, col As Int";
_radius = 0;
_col = 0;
 //BA.debugLineNum = 4572;BA.debugLine="col = BD.Color - Graph.AreaFillAlphaValue";
_col = (int) (_bd.Color /*int*/ -_graph.AreaFillAlphaValue /*int*/ );
 //BA.debugLineNum = 4573;BA.debugLine="Radius = Max(mBubbleRadiusMin, mBubbleRadiusMax *";
_radius = (int) (__c.Max(_mbubbleradiusmin,_mbubbleradiusmax*__c.Sqrt(_val/(double)_mbubblevalminmax[(int) (1)])/(double)2));
 //BA.debugLineNum = 4575;BA.debugLine="xcvsGraph.DrawCircle(x, y, Radius, col, True, 1di";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_radius),_col,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4576;BA.debugLine="xcvsGraph.DrawCircle(x, y, Radius, BD.Color, Fals";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_radius),_bd.Color /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4578;BA.debugLine="BD.x = x";
_bd.x /*int*/  = _x;
 //BA.debugLineNum = 4579;BA.debugLine="BD.y = y";
_bd.y /*int*/  = _y;
 //BA.debugLineNum = 4580;BA.debugLine="BD.Radius = Radius";
_bd.Radius /*int*/  = _radius;
 //BA.debugLineNum = 4581;BA.debugLine="Bubbles.Add(BD)";
_bubbles.Add((Object)(_bd));
 //BA.debugLineNum = 4582;BA.debugLine="End Sub";
return "";
}
public String  _drawbubbles() throws Exception{
int _i = 0;
int _l = 0;
b4a.example.xchart._itemdata _id = null;
double[] _yxval = null;
int _x0 = 0;
int _y0 = 0;
b4a.example.xchart._bubbledata _bd = null;
int _myaxis0 = 0;
int _mxaxis0 = 0;
 //BA.debugLineNum = 4501;BA.debugLine="Private Sub DrawBubbles";
 //BA.debugLineNum = 4502;BA.debugLine="Private i, l As Int";
_i = 0;
_l = 0;
 //BA.debugLineNum = 4503;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 4504;BA.debugLine="Private yxVal() As Double";
_yxval = new double[(int) (0)];
;
 //BA.debugLineNum = 4505;BA.debugLine="Private x0, y0 As Int";
_x0 = 0;
_y0 = 0;
 //BA.debugLineNum = 4507;BA.debugLine="If Items.Size = 0 Then Return";
if (_items.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 4509;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4511;BA.debugLine="mBubbleRadiusMin = mBubbleDiameterMin * Min(Graph";
_mbubbleradiusmin = (int) (_mbubblediametermin*__c.Min(_graph.Width /*int*/ ,_graph.Height /*int*/ )/(double)100);
 //BA.debugLineNum = 4512;BA.debugLine="mBubbleRadiusMax = mBubbleDiameterMax * Min(Graph";
_mbubbleradiusmax = (int) (_mbubblediametermax*__c.Min(_graph.Width /*int*/ ,_graph.Height /*int*/ )/(double)100);
 //BA.debugLineNum = 4514;BA.debugLine="Bubbles.Clear";
_bubbles.Clear();
 //BA.debugLineNum = 4515;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit10 ;_l = _l + step10 ) {
 //BA.debugLineNum = 4516;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 4517;BA.debugLine="For i = 0 To ID.YXArray.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 4518;BA.debugLine="yxVal = ID.YXArray.Get(i)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 4519;BA.debugLine="x0 = Graph.Left + (yxVal(0) - Scale(sX).MinVal)";
_x0 = (int) (_graph.Left /*int*/ +(_yxval[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4520;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4521;BA.debugLine="y0 = Graph.Bottom - (yxVal(1) - Scale(sY(0)).M";
_y0 = (int) (_graph.Bottom /*int*/ -(_yxval[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4523;BA.debugLine="y0 = Graph.Top + (yxVal(1) - Scale(sY(0)).MinV";
_y0 = (int) (_graph.Top /*int*/ +(_yxval[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4525;BA.debugLine="Private BD As BubbleData";
_bd = new b4a.example.xchart._bubbledata();
 //BA.debugLineNum = 4526;BA.debugLine="BD.Initialize";
_bd.Initialize();
 //BA.debugLineNum = 4527;BA.debugLine="BD.ItemIndex = l";
_bd.ItemIndex /*int*/  = _l;
 //BA.debugLineNum = 4528;BA.debugLine="BD.PointIndex = i";
_bd.PointIndex /*int*/  = _i;
 //BA.debugLineNum = 4529;BA.debugLine="BD.Color = ID.Color";
_bd.Color /*int*/  = _id.Color /*int*/ ;
 //BA.debugLineNum = 4530;BA.debugLine="DrawBubbleCircle(x0, y0, yxVal(2), BD)";
_drawbubblecircle(_x0,_y0,_yxval[(int) (2)],_bd);
 }
};
 }
};
 //BA.debugLineNum = 4533;BA.debugLine="Bubbles.SortType(\"Radius\", True)";
_bubbles.SortType("Radius",__c.True);
 //BA.debugLineNum = 4535;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4537;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4538;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4539;BA.debugLine="Private mYAxis0 As Int";
_myaxis0 = 0;
 //BA.debugLineNum = 4540;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4541;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal *";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4543;BA.debugLine="mYAxis0 = Graph.Top - Scale(sY(0)).MinVal * Sca";
_myaxis0 = (int) (_graph.Top /*int*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4545;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4546;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4548;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 4552;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4553;BA.debugLine="If Scale(sX).MinVal< 0 And Scale(sX).MaxVal > 0 T";
if (_scale[_sx].MinVal /*double*/ <0 && _scale[_sx].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4554;BA.debugLine="Private mXAxis0 = Graph.Left - Scale(sX).MinVal";
_mxaxis0 = (int) (_graph.Left /*int*/ -_scale[_sx].MinVal /*double*/ *_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4555;BA.debugLine="If Scale(sX).YZeroAxisHighlight = True Then";
if (_scale[_sx].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4556;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0,";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4558;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0,";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 4562;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And (Zoom.NbVis";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && (_zoom.NbVisiblePoints /*int*/ >0 || (_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE"))) { 
 //BA.debugLineNum = 4563;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 4566;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 4567;BA.debugLine="End Sub";
return "";
}
public String  _drawbubblevalues(float _cursx,float _cursy) throws Exception{
double _pointx = 0;
double _pointy = 0;
int _ib = 0;
int _radius = 0;
boolean _found = false;
b4a.example.xchart._bubbledata _bd = null;
int _cx = 0;
int _cy = 0;
b4a.example.xchart._itemdata _id = null;
double[] _yx = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rectdisplay = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
int _wcurvename = 0;
int _wtextx = 0;
int _wtexty = 0;
int _wtextval = 0;
int _x = 0;
int _y = 0;
int _yrecttop = 0;
int _texttop = 0;
int _textleft = 0;
int _hdisplay = 0;
int _wdisplay = 0;
String _txtx = "";
String _txty = "";
String _txtval = "";
 //BA.debugLineNum = 8738;BA.debugLine="Private Sub DrawBubbleValues(CursX As Float, CursY";
 //BA.debugLineNum = 8739;BA.debugLine="Private PointX, PointY As Double";
_pointx = 0;
_pointy = 0;
 //BA.debugLineNum = 8740;BA.debugLine="Private ib As Int";
_ib = 0;
 //BA.debugLineNum = 8741;BA.debugLine="Private Radius As Int";
_radius = 0;
 //BA.debugLineNum = 8742;BA.debugLine="Private Found = False As Boolean";
_found = __c.False;
 //BA.debugLineNum = 8744;BA.debugLine="PointX = Scale(sX).MinVal + (CursX - Graph.Left)";
_pointx = _scale[_sx].MinVal /*double*/ +(_cursx-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ ;
 //BA.debugLineNum = 8746;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8747;BA.debugLine="PointY = Scale(sY(0)).MaxVal - (CursY - Graph.To";
_pointy = _scale[_sy[(int) (0)]].MaxVal /*double*/ -(_cursy-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 8749;BA.debugLine="PointY = Scale(sY(0)).MinVal + (CursY - Graph.To";
_pointy = _scale[_sy[(int) (0)]].MinVal /*double*/ +(_cursy-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 };
 //BA.debugLineNum = 8752;BA.debugLine="For ib = 0 To Bubbles.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bubbles.getSize()-1);
_ib = (int) (0) ;
for (;_ib <= limit11 ;_ib = _ib + step11 ) {
 //BA.debugLineNum = 8753;BA.debugLine="Private BD As BubbleData";
_bd = new b4a.example.xchart._bubbledata();
 //BA.debugLineNum = 8755;BA.debugLine="BD = Bubbles.Get(ib)";
_bd = (b4a.example.xchart._bubbledata)(_bubbles.Get(_ib));
 //BA.debugLineNum = 8757;BA.debugLine="Radius = Sqrt((CursX - BD.x) * (CursX - BD.x) +";
_radius = (int) (__c.Sqrt((_cursx-_bd.x /*int*/ )*(_cursx-_bd.x /*int*/ )+(_cursy-_bd.y /*int*/ )*(_cursy-_bd.y /*int*/ )));
 //BA.debugLineNum = 8758;BA.debugLine="If mBubbleSmallSnap = False And Radius <= BD.Rad";
if (_mbubblesmallsnap==__c.False && _radius<=_bd.Radius /*int*/  || _mbubblesmallsnap==__c.True && _radius<=__c.DipToCurrent((int) (3))) { 
 //BA.debugLineNum = 8759;BA.debugLine="Found = True";
_found = __c.True;
 //BA.debugLineNum = 8760;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 8764;BA.debugLine="xcvsCursor.ClearRect(xcvsCursor.TargetRect)";
_xcvscursor.ClearRect(_xcvscursor.getTargetRect());
 //BA.debugLineNum = 8765;BA.debugLine="xcvsValues.ClearRect(xcvsValues.TargetRect)";
_xcvsvalues.ClearRect(_xcvsvalues.getTargetRect());
 //BA.debugLineNum = 8767;BA.debugLine="If mYXChartDisplayCrossHair = True Then";
if (_myxchartdisplaycrosshair==__c.True) { 
 //BA.debugLineNum = 8768;BA.debugLine="If Found = False Then";
if (_found==__c.False) { 
 //BA.debugLineNum = 8769;BA.debugLine="xcvsCursor.DrawLine(CursX, Graph.Top, CursX, Gr";
_xcvscursor.DrawLine(_cursx,(float) (_graph.Top /*int*/ ),_cursx,(float) (_graph.Bottom /*int*/ ),_myxchartcrosshaircolor,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 8770;BA.debugLine="xcvsCursor.DrawLine(Graph.Left, CursY, Graph.Ri";
_xcvscursor.DrawLine((float) (_graph.Left /*int*/ ),_cursy,(float) (_graph.Right /*int*/ ),_cursy,_myxchartcrosshaircolor,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 8772;BA.debugLine="Private cx, cy As Int";
_cx = 0;
_cy = 0;
 //BA.debugLineNum = 8773;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 8774;BA.debugLine="Private YX() As Double";
_yx = new double[(int) (0)];
;
 //BA.debugLineNum = 8775;BA.debugLine="ID = Items.Get(BD.ItemIndex)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_bd.ItemIndex /*int*/ ));
 //BA.debugLineNum = 8776;BA.debugLine="YX = ID.YXArray.Get(BD.PointIndex)";
_yx = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_bd.PointIndex /*int*/ ));
 //BA.debugLineNum = 8777;BA.debugLine="cx = (YX(0) - Scale(sX).MinVal) * Scale(sX).Sca";
_cx = (int) ((_yx[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ +_graph.Left /*int*/ );
 //BA.debugLineNum = 8778;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8779;BA.debugLine="cy =  Graph.Bottom - (YX(1) - Scale(sY(0)).Min";
_cy = (int) (_graph.Bottom /*int*/ -(_yx[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 8781;BA.debugLine="cy =  Graph.Top + (YX(1) - Scale(sY(0)).MinVal";
_cy = (int) (_graph.Top /*int*/ +(_yx[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 8783;BA.debugLine="xcvsCursor.DrawLine(cx, Graph.Top, cx, Graph.Bo";
_xcvscursor.DrawLine((float) (_cx),(float) (_graph.Top /*int*/ ),(float) (_cx),(float) (_graph.Bottom /*int*/ ),_bd.Color /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 8784;BA.debugLine="xcvsCursor.DrawLine(Graph.Left, cy, Graph.Right";
_xcvscursor.DrawLine((float) (_graph.Left /*int*/ ),(float) (_cy),(float) (_graph.Right /*int*/ ),(float) (_cy),_bd.Color /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 8788;BA.debugLine="If mYXChartDisplayValues = True Then";
if (_myxchartdisplayvalues==__c.True) { 
 //BA.debugLineNum = 8789;BA.debugLine="Private rectDisplay, rectText As B4XRect";
_rectdisplay = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 8790;BA.debugLine="Private wCurveName, wTextX, wTextY,wTextVal As I";
_wcurvename = 0;
_wtextx = 0;
_wtexty = 0;
_wtextval = 0;
 //BA.debugLineNum = 8791;BA.debugLine="Private x, y, yRectTop, TextTop, TextLeft, hDisp";
_x = 0;
_y = 0;
_yrecttop = 0;
_texttop = 0;
_textleft = 0;
_hdisplay = 0;
_wdisplay = 0;
 //BA.debugLineNum = 8792;BA.debugLine="Private txtX, txtY, txtVal As String";
_txtx = "";
_txty = "";
_txtval = "";
 //BA.debugLineNum = 8794;BA.debugLine="rectText = xcvsCursor.MeasureText(\"My\", Texts.Sc";
_recttext = _xcvscursor.MeasureText("My",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8795;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8796;BA.debugLine="txtX = \"       x = \" & NumberFormat3(YX(0), 6)";
_txtx = "       x = "+_numberformat3(_yx[(int) (0)],(int) (6));
 //BA.debugLineNum = 8797;BA.debugLine="txtY = \"       y = \" & NumberFormat3(YX(1), 6)";
_txty = "       y = "+_numberformat3(_yx[(int) (1)],(int) (6));
 //BA.debugLineNum = 8798;BA.debugLine="txtVal = \"value = \" & NumberFormat3(YX(2), 6)";
_txtval = "value = "+_numberformat3(_yx[(int) (2)],(int) (6));
 //BA.debugLineNum = 8799;BA.debugLine="wCurveName = MeasureTextWidth(ID.Name, Texts.Sc";
_wcurvename = _measuretextwidth(_id.Name /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8800;BA.debugLine="wTextX = MeasureTextWidth(txtX, Texts.ScaleFont";
_wtextx = _measuretextwidth(_txtx,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8801;BA.debugLine="wTextY = MeasureTextWidth(txtY, Texts.ScaleFont";
_wtexty = _measuretextwidth(_txty,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8802;BA.debugLine="wTextVal = MeasureTextWidth(txtVal, Texts.Scale";
_wtextval = _measuretextwidth(_txtval,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8803;BA.debugLine="wDisplay = Max(wCurveName, wTextX)";
_wdisplay = (int) (__c.Max(_wcurvename,_wtextx));
 //BA.debugLineNum = 8804;BA.debugLine="wDisplay = Max(wTextVal, wDisplay)";
_wdisplay = (int) (__c.Max(_wtextval,_wdisplay));
 //BA.debugLineNum = 8805;BA.debugLine="wDisplay = Max(wTextY, wDisplay) + 10dip";
_wdisplay = (int) (__c.Max(_wtexty,_wdisplay)+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 8806;BA.debugLine="hDisplay = 4.2 * rectText.Height + 10dip";
_hdisplay = (int) (4.2*_recttext.getHeight()+__c.DipToCurrent((int) (10)));
 }else {
 //BA.debugLineNum = 8808;BA.debugLine="txtX = \"x = \" & NumberFormat3(PointX, 6)";
_txtx = "x = "+_numberformat3(_pointx,(int) (6));
 //BA.debugLineNum = 8809;BA.debugLine="txtY = \"y = \" & NumberFormat3(PointY, 6)";
_txty = "y = "+_numberformat3(_pointy,(int) (6));
 //BA.debugLineNum = 8810;BA.debugLine="wTextX = MeasureTextWidth(txtX, Texts.ScaleFont";
_wtextx = _measuretextwidth(_txtx,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8811;BA.debugLine="wTextY = MeasureTextWidth(txtY, Texts.ScaleFont";
_wtexty = _measuretextwidth(_txty,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8812;BA.debugLine="wDisplay = Max(wTextX, wTextY) + 10dip";
_wdisplay = (int) (__c.Max(_wtextx,_wtexty)+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 8813;BA.debugLine="hDisplay = 2 * rectText.Height + 10dip";
_hdisplay = (int) (2*_recttext.getHeight()+__c.DipToCurrent((int) (10)));
 };
 //BA.debugLineNum = 8816;BA.debugLine="If mYXChartDisplayPosition = \"CORNERS\" Then";
if ((_myxchartdisplayposition).equals("CORNERS")) { 
 //BA.debugLineNum = 8817;BA.debugLine="yRectTop = Graph.Top + 2dip '2dip to be insides";
_yrecttop = (int) (_graph.Top /*int*/ +__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 8818;BA.debugLine="TextTop = yRectTop + 5dip";
_texttop = (int) (_yrecttop+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 8819;BA.debugLine="If CursX < (Graph.Left + Graph.Right) / 2 Then";
if (_cursx<(_graph.Left /*int*/ +_graph.Right /*int*/ )/(double)2) { 
 //BA.debugLineNum = 8820;BA.debugLine="TextLeft = Graph.Left + 5dip";
_textleft = (int) (_graph.Left /*int*/ +__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 8821;BA.debugLine="rectDisplay.Initialize(Graph.Left + 2dip, yRec";
_rectdisplay.Initialize((float) (_graph.Left /*int*/ +__c.DipToCurrent((int) (2))),(float) (_yrecttop),(float) (_graph.Left /*int*/ +_wdisplay),(float) (_yrecttop+_hdisplay));
 }else {
 //BA.debugLineNum = 8823;BA.debugLine="TextLeft = Graph.Right - wDisplay + 3dip	'3dip";
_textleft = (int) (_graph.Right /*int*/ -_wdisplay+__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 8824;BA.debugLine="rectDisplay.Initialize(Graph.Right - wDisplay";
_rectdisplay.Initialize((float) (_graph.Right /*int*/ -_wdisplay-__c.DipToCurrent((int) (2))),(float) (_yrecttop),(float) (_graph.Right /*int*/ -__c.DipToCurrent((int) (2))),(float) (_yrecttop+_hdisplay));
 };
 }else {
 //BA.debugLineNum = 8833;BA.debugLine="x = Max(Graph.Left + 5dip, CursX - wDisplay / 2";
_x = (int) (__c.Max(_graph.Left /*int*/ +__c.DipToCurrent((int) (5)),_cursx-_wdisplay/(double)2));
 //BA.debugLineNum = 8834;BA.debugLine="x = Min(Graph.Right - 5dip - wDisplay, x)";
_x = (int) (__c.Min(_graph.Right /*int*/ -__c.DipToCurrent((int) (5))-_wdisplay,_x));
 //BA.debugLineNum = 8835;BA.debugLine="TextLeft = x + 5dip";
_textleft = (int) (_x+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 8836;BA.debugLine="If CursY > Graph.Top + hDisplay + 10dip Then";
if (_cursy>_graph.Top /*int*/ +_hdisplay+__c.DipToCurrent((int) (10))) { 
 //BA.debugLineNum = 8837;BA.debugLine="y = CursY - hDisplay - 10dip";
_y = (int) (_cursy-_hdisplay-__c.DipToCurrent((int) (10)));
 }else {
 //BA.debugLineNum = 8839;BA.debugLine="y = CursY + 10dip";
_y = (int) (_cursy+__c.DipToCurrent((int) (10)));
 };
 //BA.debugLineNum = 8841;BA.debugLine="rectDisplay.Initialize(x, y, x + wDisplay, y +";
_rectdisplay.Initialize((float) (_x),(float) (_y),(float) (_x+_wdisplay),(float) (_y+_hdisplay));
 //BA.debugLineNum = 8842;BA.debugLine="TextTop = y + 5dip";
_texttop = (int) (_y+__c.DipToCurrent((int) (5)));
 };
 //BA.debugLineNum = 8846;BA.debugLine="xcvsValues.DrawRect(rectDisplay, Values.Backgrou";
_xcvsvalues.DrawRect(_rectdisplay,_values.BackgroundColor /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 8848;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8849;BA.debugLine="xcvsValues.DrawText(ID.Name, TextLeft, TextTop";
_xcvsvalues.DrawText(ba,_id.Name /*String*/ ,(float) (_textleft),(float) (_texttop-_recttext.getTop()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_id.Color /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8850;BA.debugLine="xcvsValues.DrawText(txtVal, TextLeft, TextTop -";
_xcvsvalues.DrawText(ba,_txtval,(float) (_textleft),(float) (_texttop-_recttext.getTop()+_recttext.getHeight()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8851;BA.debugLine="xcvsValues.DrawText(txtX, TextLeft, TextTop - r";
_xcvsvalues.DrawText(ba,_txtx,(float) (_textleft),(float) (_texttop-_recttext.getTop()+2.1*_recttext.getHeight()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8852;BA.debugLine="xcvsValues.DrawText(txtY, TextLeft,  TextTop -";
_xcvsvalues.DrawText(ba,_txty,(float) (_textleft),(float) (_texttop-_recttext.getTop()+3.2*_recttext.getHeight()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8853;BA.debugLine="xcvsCursor.DrawCircle(BD.x, BD.y, BD.Radius, BD";
_xcvscursor.DrawCircle((float) (_bd.x /*int*/ ),(float) (_bd.y /*int*/ ),(float) (_bd.Radius /*int*/ ),_bd.Color /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 8855;BA.debugLine="xcvsValues.DrawText(txtX, TextLeft, TextTop - r";
_xcvsvalues.DrawText(ba,_txtx,(float) (_textleft),(float) (_texttop-_recttext.getTop()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8856;BA.debugLine="xcvsValues.DrawText(txtY, TextLeft,  TextTop -";
_xcvsvalues.DrawText(ba,_txty,(float) (_textleft),(float) (_texttop-_recttext.getTop()+_recttext.getHeight()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 };
 //BA.debugLineNum = 8859;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 //BA.debugLineNum = 8860;BA.debugLine="xcvsValues.Invalidate";
_xcvsvalues.Invalidate();
 //BA.debugLineNum = 8861;BA.debugLine="End Sub";
return "";
}
public String  _drawchart() throws Exception{
 //BA.debugLineNum = 3004;BA.debugLine="Public Sub DrawChart";
 //BA.debugLineNum = 3005;BA.debugLine="InitChart";
_initchart();
 //BA.debugLineNum = 3007;BA.debugLine="If Graph.Error = True Then";
if (_graph.Error /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3008;BA.debugLine="DrawError";
_drawerror();
 //BA.debugLineNum = 3009;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3012;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","AREA","STACKED_AREA","H_LINE","BAR","H_BAR","STACKED_BAR","H_STACKED_BAR","PIE","YX_CHART","BUBBLE","RADAR","CANDLE","WATERFALL")) {
case 0: {
 //BA.debugLineNum = 3014;BA.debugLine="GetXIntervals";
_getxintervals();
 //BA.debugLineNum = 3015;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 3016;BA.debugLine="If Scale(sY(0)).Logarithmic = True Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3017;BA.debugLine="DrawLinesLog";
_drawlineslog();
 }else {
 //BA.debugLineNum = 3019;BA.debugLine="If Items.Size > 1 And Items.Size <= NbMaxDiffe";
if (_items.getSize()>1 && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3020;BA.debugLine="DrawLinesNScales";
_drawlinesnscales();
 }else {
 //BA.debugLineNum = 3022;BA.debugLine="DrawLinesV";
_drawlinesv();
 };
 };
 break; }
case 1: {
 //BA.debugLineNum = 3026;BA.debugLine="GetXIntervals";
_getxintervals();
 //BA.debugLineNum = 3028;BA.debugLine="DrawArea";
_drawarea();
 break; }
case 2: {
 //BA.debugLineNum = 3030;BA.debugLine="GetXIntervals";
_getxintervals();
 //BA.debugLineNum = 3032;BA.debugLine="DrawStackedArea";
_drawstackedarea();
 break; }
case 3: {
 //BA.debugLineNum = 3034;BA.debugLine="GetXIntervals";
_getxintervals();
 //BA.debugLineNum = 3035;BA.debugLine="DrawGridH";
_drawgridh();
 //BA.debugLineNum = 3036;BA.debugLine="DrawLinesH";
_drawlinesh();
 break; }
case 4: {
 //BA.debugLineNum = 3038;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 3039;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 3040;BA.debugLine="DrawBarsV";
_drawbarsv();
 };
 break; }
case 5: {
 //BA.debugLineNum = 3043;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 3044;BA.debugLine="DrawGridH";
_drawgridh();
 //BA.debugLineNum = 3045;BA.debugLine="DrawBarsH";
_drawbarsh();
 };
 break; }
case 6: {
 //BA.debugLineNum = 3048;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 3049;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 3050;BA.debugLine="DrawBarsV";
_drawbarsv();
 };
 break; }
case 7: {
 //BA.debugLineNum = 3053;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 3054;BA.debugLine="DrawGridH";
_drawgridh();
 //BA.debugLineNum = 3055;BA.debugLine="DrawBarsH";
_drawbarsh();
 };
 break; }
case 8: {
 //BA.debugLineNum = 3058;BA.debugLine="DrawPies";
_drawpies();
 break; }
case 9: {
 //BA.debugLineNum = 3060;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 3061;BA.debugLine="If Items.Size <= NbMaxDifferentScales And Scale";
if (_items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3062;BA.debugLine="DrawYXLinesNScales";
_drawyxlinesnscales();
 }else {
 //BA.debugLineNum = 3064;BA.debugLine="DrawYXLines";
_drawyxlines();
 };
 break; }
case 10: {
 //BA.debugLineNum = 3067;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 3068;BA.debugLine="DrawBubbles";
_drawbubbles();
 break; }
case 11: {
 //BA.debugLineNum = 3070;BA.debugLine="DrawRadar";
_drawradar();
 break; }
case 12: {
 //BA.debugLineNum = 3072;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 3073;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 3074;BA.debugLine="DrawBarsV";
_drawbarsv();
 };
 break; }
case 13: {
 //BA.debugLineNum = 3077;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 3078;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 3079;BA.debugLine="DrawBarsV";
_drawbarsv();
 };
 break; }
}
;
 //BA.debugLineNum = 3086;BA.debugLine="End Sub";
return "";
}
public String  _drawemptychart() throws Exception{
 //BA.debugLineNum = 2998;BA.debugLine="Public Sub DrawEmptyChart";
 //BA.debugLineNum = 2999;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 3000;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 3001;BA.debugLine="End Sub";
return "";
}
public String  _drawerror() throws Exception{
double _x = 0;
double _y = 0;
 //BA.debugLineNum = 3088;BA.debugLine="Private Sub DrawError";
 //BA.debugLineNum = 3089;BA.debugLine="Private x, y As Double";
_x = 0;
_y = 0;
 //BA.debugLineNum = 3090;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 3091;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 3093;BA.debugLine="x = xcvsGraph.TargetRect.CenterX";
_x = _xcvsgraph.getTargetRect().getCenterX();
 //BA.debugLineNum = 3094;BA.debugLine="y = xcvsGraph.TargetRect.CenterY - 1.5 * Texts.Ti";
_y = _xcvsgraph.getTargetRect().getCenterY()-1.5*_texts.TitleTextHeight /*int*/ -1.5*_texts.SubtitleTextHeight /*int*/ ;
 //BA.debugLineNum = 3096;BA.debugLine="xcvsGraph.DrawText(\"E R R O R\", x, y, Texts.Title";
_xcvsgraph.DrawText(ba,"E R R O R",(float) (_x),(float) (_y),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 3097;BA.debugLine="y = y + 1.5 * Texts.TitleTextHeight";
_y = _y+1.5*_texts.TitleTextHeight /*int*/ ;
 //BA.debugLineNum = 3098;BA.debugLine="xcvsGraph.DrawText(Graph.Title & \"  \" & Graph.Cha";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ +"  "+_graph.ChartType /*String*/ +" chart",(float) (_x),(float) (_y),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 3099;BA.debugLine="y = y + 1.5 * Texts.SubtitleTextHeight";
_y = _y+1.5*_texts.SubtitleTextHeight /*int*/ ;
 //BA.debugLineNum = 3100;BA.debugLine="xcvsGraph.DrawText(Graph.ErrorText, x, y, Texts.S";
_xcvsgraph.DrawText(ba,_graph.ErrorText /*String*/ ,(float) (_x),(float) (_y),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 3101;BA.debugLine="End Sub";
return "";
}
public String  _drawgridh() throws Exception{
int _x1 = 0;
int _y = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rctouter = null;
 //BA.debugLineNum = 3179;BA.debugLine="Private Sub DrawGridH";
 //BA.debugLineNum = 3180;BA.debugLine="Private x1, y As Int";
_x1 = 0;
_y = 0;
 //BA.debugLineNum = 3182;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 3183;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 3184;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 3185;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3186;BA.debugLine="DrawScaleYH";
_drawscaleyh();
 };
 //BA.debugLineNum = 3188;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3189;BA.debugLine="If Graph.ChartType = \"H_LINE\" Then";
if ((_graph.ChartType /*String*/ ).equals("H_LINE")) { 
 //BA.debugLineNum = 3190;BA.debugLine="DrawScaleXHLine";
_drawscalexhline();
 }else {
 //BA.debugLineNum = 3192;BA.debugLine="DrawScaleXH";
_drawscalexh();
 };
 };
 //BA.debugLineNum = 3196;BA.debugLine="y = 0.45 * Texts.TitleTextHeight";
_y = (int) (0.45*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 3197;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3198;BA.debugLine="y = y + 0.9 * Texts.TitleTextHeight";
_y = (int) (_y+0.9*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 3200;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xpnlGraph.Width";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),(float) (_y),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 3203;BA.debugLine="If Graph.Subtitle <> \"\" Then";
if ((_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3204;BA.debugLine="y = y + 1.5 * Texts.SubtitleTextHeight";
_y = (int) (_y+1.5*_texts.SubtitleTextHeight /*int*/ );
 //BA.debugLineNum = 3206;BA.debugLine="xcvsGraph.DrawText(Graph.Subtitle, xpnlGraph.Wid";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),(float) (_y),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 3209;BA.debugLine="y = xpnlGraph.Height - 0.38 * Texts.AxisTextHeigh";
_y = (int) (_xpnlgraph.getHeight()-0.38*_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 3210;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" Then";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM")) { 
 //BA.debugLineNum = 3211;BA.debugLine="y = y - Legend.Height - 0.75 * Legend.TextHeight";
_y = (int) (_y-_legend.Height /*int*/ -0.75*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 3214;BA.debugLine="If Graph.YAxisName <> \"\" Then";
if ((_graph.YAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3215;BA.debugLine="If mHChartsXScaleOnTop = False Then";
if (_mhchartsxscaleontop==__c.False) { 
 //BA.debugLineNum = 3216;BA.debugLine="xcvsGraph.DrawText(Graph.YAxisName, Graph.Left";
_xcvsgraph.DrawText(ba,_graph.YAxisName /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }else {
 //BA.debugLineNum = 3218;BA.debugLine="y = Graph.Top - 4dip - 1.5 * Texts.ScaleTextHei";
_y = (int) (_graph.Top /*int*/ -__c.DipToCurrent((int) (4))-1.5*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3219;BA.debugLine="xcvsGraph.DrawText(Graph.YAxisName, Graph.Left";
_xcvsgraph.DrawText(ba,_graph.YAxisName /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 };
 //BA.debugLineNum = 3223;BA.debugLine="x1 = 1.5 * Texts.AxisTextHeight";
_x1 = (int) (1.5*_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 3224;BA.debugLine="If xui.IsB4i Then x1 = 1.2 * Texts.AxisTextHeight";
if (_xui.getIsB4i()) { 
_x1 = (int) (1.2*_texts.AxisTextHeight /*int*/ );};
 //BA.debugLineNum = 3225;BA.debugLine="If Graph.XAxisName <> \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3226;BA.debugLine="xcvsGraph.DrawTextRotated(Graph.XAxisName, x1, G";
_xcvsgraph.DrawTextRotated(ba,_graph.XAxisName /*String*/ ,(float) (_x1),(float) (_graph.Top /*int*/ +_graph.Height /*int*/ /(double)2),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"),(float) (-90));
 };
 //BA.debugLineNum = 3229;BA.debugLine="If Graph.DrawGridFrame = True Then";
if (_graph.DrawGridFrame /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3230;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCo";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3235;BA.debugLine="If Graph.DrawOuterFrame = True Then";
if (_graph.DrawOuterFrame /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3236;BA.debugLine="Private rctOuter As B4XRect";
_rctouter = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 3237;BA.debugLine="rctOuter.Initialize(0, 0, xpnlCursor.Width, xpnl";
_rctouter.Initialize((float) (0),(float) (0),(float) (_xpnlcursor.getWidth()),(float) (_xpnlcursor.getHeight()));
 //BA.debugLineNum = 3238;BA.debugLine="xcvsGraph.DrawRect(rctOuter, Graph.GridFrameColo";
_xcvsgraph.DrawRect(_rctouter,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (4))));
 };
 //BA.debugLineNum = 3240;BA.debugLine="End Sub";
return "";
}
public String  _drawgridv() throws Exception{
int _x1 = 0;
int _y = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rctouter = null;
 //BA.debugLineNum = 3104;BA.debugLine="Private Sub DrawGridV";
 //BA.debugLineNum = 3105;BA.debugLine="Private x1, y As Int";
_x1 = 0;
_y = 0;
 //BA.debugLineNum = 3107;BA.debugLine="If Graph.ChartType <> \"AREA\" And Graph.ChartType";
if ((_graph.ChartType /*String*/ ).equals("AREA") == false && (_graph.ChartType /*String*/ ).equals("STACKED_AREA") == false) { 
 //BA.debugLineNum = 3108;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 3109;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.C";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3111;BA.debugLine="If Scale(sY(0)).Logarithmic = True And (Graph.Cha";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.True && ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 3112;BA.debugLine="ScaleLog(sY(0)).Scale = Graph.Height / (ScaleLog";
_scalelog[_sy[(int) (0)]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scalelog[_sy[(int) (0)]].MantMax /*int*/ -_scalelog[_sy[(int) (0)]].MantMin /*int*/ );
 //BA.debugLineNum = 3113;BA.debugLine="DrawYScaleLog";
_drawyscalelog();
 }else {
 //BA.debugLineNum = 3115;BA.debugLine="If (Graph.ChartType = \"LINE\" Or Graph.ChartType";
if (((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("BUBBLE") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3116;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 3117;BA.debugLine="Scale(sY(i)).Scale = Graph.Height / (Scale(sY(";
_scale[_sy[_i]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy[_i]].MaxVal /*double*/ -_scale[_sy[_i]].MinVal /*double*/ );
 }
};
 //BA.debugLineNum = 3119;BA.debugLine="DrawScalesY";
_drawscalesy();
 }else {
 //BA.debugLineNum = 3121;BA.debugLine="Scale(sY(0)).Scale = Graph.Height / (Scale(sY(0";
_scale[_sy[(int) (0)]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy[(int) (0)]].MaxVal /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ );
 //BA.debugLineNum = 3122;BA.debugLine="DrawScaleY";
_drawscaley();
 };
 };
 //BA.debugLineNum = 3125;BA.debugLine="If Scale(sX).Logarithmic = True And Graph.ChartTy";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.True && (_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 3126;BA.debugLine="ScaleLog(sX).Scale = Graph.Width / (ScaleLog(sX)";
_scalelog[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scalelog[_sx].MantMax /*int*/ +_scalelog[_sx].LogMax /*double*/ -_scalelog[_sx].MantMin /*int*/ -_scalelog[_sx].LogMin /*double*/ );
 //BA.debugLineNum = 3127;BA.debugLine="DrawXScaleLog";
_drawxscalelog();
 }else {
 //BA.debugLineNum = 3129;BA.debugLine="DrawScaleX";
_drawscalex();
 };
 //BA.debugLineNum = 3131;BA.debugLine="If Graph.ChartType = \"BUBBLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 3132;BA.debugLine="DrawScaleX";
_drawscalex();
 };
 //BA.debugLineNum = 3135;BA.debugLine="y = 0.45 * Texts.TitleTextHeight";
_y = (int) (0.45*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 3136;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3137;BA.debugLine="y = y + 0.9 * Texts.TitleTextHeight";
_y = (int) (_y+0.9*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 3138;BA.debugLine="xcvsGraph.DrawText(Graph.Title, Graph.Left + Gra";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 3141;BA.debugLine="If Graph.Subtitle <> \"\" Then";
if ((_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3142;BA.debugLine="y = y + 1.5 * Texts.SubtitleTextHeight";
_y = (int) (_y+1.5*_texts.SubtitleTextHeight /*int*/ );
 //BA.debugLineNum = 3143;BA.debugLine="xcvsGraph.DrawText(Graph.Subtitle, Graph.Left +";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 3146;BA.debugLine="y = xpnlGraph.Height - 0.38 * Texts.AxisTextHeigh";
_y = (int) (_xpnlgraph.getHeight()-0.38*_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 3147;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Graph.Chart";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && (_graph.ChartType /*String*/ ).equals("CANDLE") == false && (_graph.ChartType /*String*/ ).equals("WATERFALL") == false) { 
 //BA.debugLineNum = 3148;BA.debugLine="y = y - Legend.Height - 0.75 * Legend.TextHeight";
_y = (int) (_y-_legend.Height /*int*/ -0.75*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 3151;BA.debugLine="If Graph.XAxisName <> \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3152;BA.debugLine="xcvsGraph.DrawText(Graph.XAxisName, Graph.Left +";
_xcvsgraph.DrawText(ba,_graph.XAxisName /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 3155;BA.debugLine="x1 = 1.5 * Texts.AxisTextHeight";
_x1 = (int) (1.5*_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 3156;BA.debugLine="If xui.IsB4i Then x1 = 1.2 * Texts.AxisTextHeight";
if (_xui.getIsB4i()) { 
_x1 = (int) (1.2*_texts.AxisTextHeight /*int*/ );};
 //BA.debugLineNum = 3157;BA.debugLine="If Graph.YAxisName <> \"\" Then";
if ((_graph.YAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 3158;BA.debugLine="xcvsGraph.DrawTextRotated(Graph.YAxisName, x1, G";
_xcvsgraph.DrawTextRotated(ba,_graph.YAxisName /*String*/ ,(float) (_x1),(float) (_graph.Top /*int*/ +_graph.Height /*int*/ /(double)2),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"),(float) (-90));
 };
 //BA.debugLineNum = 3160;BA.debugLine="If Graph.YAxisName2 <> \"\" And Items.Size <= NbMax";
if ((_graph.YAxisName2 /*String*/ ).equals("") == false && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3161;BA.debugLine="x1 = Graph.Right + RightScaleWidth + 2.2 * Texts";
_x1 = (int) (_graph.Right /*int*/ +_rightscalewidth+2.2*_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 3162;BA.debugLine="xcvsGraph.DrawTextRotated(Graph.YAxisName2, x1,";
_xcvsgraph.DrawTextRotated(ba,_graph.YAxisName2 /*String*/ ,(float) (_x1),(float) (_graph.Top /*int*/ +_graph.Height /*int*/ /(double)2),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"),(float) (-90));
 };
 //BA.debugLineNum = 3165;BA.debugLine="If Graph.DrawGridFrame = True Then";
if (_graph.DrawGridFrame /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3166;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCo";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3167;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, Graph.Bottom, Gra";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ),(float) (_graph.Right /*int*/ ),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3168;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, Graph.Top, Graph.";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ),(float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3171;BA.debugLine="If Graph.DrawOuterFrame = True Then";
if (_graph.DrawOuterFrame /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3172;BA.debugLine="Private rctOuter As B4XRect";
_rctouter = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 3173;BA.debugLine="rctOuter.Initialize(0, 0, xpnlCursor.Width, xpnl";
_rctouter.Initialize((float) (0),(float) (0),(float) (_xpnlcursor.getWidth()),(float) (_xpnlcursor.getHeight()));
 //BA.debugLineNum = 3174;BA.debugLine="xcvsGraph.DrawRect(rctOuter, Graph.GridFrameColo";
_xcvsgraph.DrawRect(_rctouter,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (4))));
 };
 //BA.debugLineNum = 3176;BA.debugLine="End Sub";
return "";
}
public String  _drawhorizontallines() throws Exception{
int _y = 0;
int _i = 0;
b4a.example.xchart._hline _hl = null;
 //BA.debugLineNum = 5491;BA.debugLine="Private Sub DrawHorizontalLines";
 //BA.debugLineNum = 5492;BA.debugLine="Private y As Int";
_y = 0;
 //BA.debugLineNum = 5494;BA.debugLine="For i = 0 To HLines.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_hlines.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 5495;BA.debugLine="Private HL As HLine";
_hl = new b4a.example.xchart._hline();
 //BA.debugLineNum = 5496;BA.debugLine="HL = HLines.Get(i)";
_hl = (b4a.example.xchart._hline)(_hlines.Get(_i));
 //BA.debugLineNum = 5497;BA.debugLine="y = Graph.Bottom - (HL.Value - Scale(sY(0)).MinV";
_y = (int) (_graph.Bottom /*int*/ -(_hl.Value /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5498;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, y, Graph.Right, y";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ ),(float) (_y),_hl.Color /*int*/ ,(float) (_hl.StrokeWidth /*int*/ ));
 }
};
 //BA.debugLineNum = 5500;BA.debugLine="End Sub";
return "";
}
public String  _drawhorizontallinesh() throws Exception{
int _i = 0;
b4a.example.xchart._hline _hl = null;
int _x = 0;
 //BA.debugLineNum = 5526;BA.debugLine="Private Sub DrawHorizontalLinesH";
 //BA.debugLineNum = 5527;BA.debugLine="For i = 0 To HLines.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_hlines.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 5528;BA.debugLine="Private HL As HLine";
_hl = new b4a.example.xchart._hline();
 //BA.debugLineNum = 5529;BA.debugLine="Private x As Int";
_x = 0;
 //BA.debugLineNum = 5530;BA.debugLine="HL = HLines.Get(i)";
_hl = (b4a.example.xchart._hline)(_hlines.Get(_i));
 //BA.debugLineNum = 5531;BA.debugLine="x = Graph.Left + (HL.Value - Scale(sY(0)).MinVal";
_x = (int) (_graph.Left /*int*/ +(_hl.Value /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5532;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Top, x, Graph.Bottom";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Top /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ ),_hl.Color /*int*/ ,(float) (_hl.StrokeWidth /*int*/ ));
 }
};
 //BA.debugLineNum = 5534;BA.debugLine="End Sub";
return "";
}
public String  _drawhorizontallinesvalue() throws Exception{
int _y = 0;
int _y1 = 0;
int _i = 0;
b4a.example.xchart._hline _hl = null;
int _x = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct1 = null;
 //BA.debugLineNum = 5503;BA.debugLine="Private Sub DrawHorizontalLinesValue";
 //BA.debugLineNum = 5504;BA.debugLine="Private y, y1 As Int";
_y = 0;
_y1 = 0;
 //BA.debugLineNum = 5506;BA.debugLine="For i = 0 To HLines.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_hlines.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 5507;BA.debugLine="Private HL As HLine";
_hl = new b4a.example.xchart._hline();
 //BA.debugLineNum = 5508;BA.debugLine="Private x As Int";
_x = 0;
 //BA.debugLineNum = 5509;BA.debugLine="HL = HLines.Get(i)";
_hl = (b4a.example.xchart._hline)(_hlines.Get(_i));
 //BA.debugLineNum = 5510;BA.debugLine="y = Graph.Bottom - (HL.Value - Scale(sY(0)).MinV";
_y = (int) (_graph.Bottom /*int*/ -(_hl.Value /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5512;BA.debugLine="If HL.DisplayValue = True Then";
if (_hl.DisplayValue /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5513;BA.debugLine="Private rct, rct1 As B4XRect";
_rct = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rct1 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5514;BA.debugLine="x = Graph.Left + 10dip";
_x = (int) (_graph.Left /*int*/ +__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 5515;BA.debugLine="rct = xcvsGraph.MeasureText(HL.Value, Texts.Sca";
_rct = _xcvsgraph.MeasureText(BA.NumberToString(_hl.Value /*double*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5516;BA.debugLine="y1 = y  - rct.CenterY";
_y1 = (int) (_y-_rct.getCenterY());
 //BA.debugLineNum = 5517;BA.debugLine="rct1.Initialize(x - 0.3 * rct.Height, y1 + rct.";
_rct1.Initialize((float) (_x-0.3*_rct.getHeight()),(float) (_y1+_rct.getTop()-0.2*_rct.getHeight()),(float) (_x+_rct.getWidth()+0.3*_rct.getHeight()),(float) (_y1+_rct.getBottom()+0.2*_rct.getHeight()));
 //BA.debugLineNum = 5518;BA.debugLine="xcvsGraph.DrawRect(rct1, Graph.ChartBackgroundC";
_xcvsgraph.DrawRect(_rct1,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 5519;BA.debugLine="xcvsGraph.DrawText(HL.Value, rct1.CenterX, y1,";
_xcvsgraph.DrawText(ba,BA.NumberToString(_hl.Value /*double*/ ),_rct1.getCenterX(),(float) (_y1),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_hl.Color /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 }
};
 //BA.debugLineNum = 5522;BA.debugLine="End Sub";
return "";
}
public String  _drawhorizontallinesvalueh() throws Exception{
int _i = 0;
b4a.example.xchart._hline _hl = null;
int _x = 0;
int _x1 = 0;
int _y = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct1 = null;
 //BA.debugLineNum = 5538;BA.debugLine="Private Sub DrawHorizontalLinesValueH";
 //BA.debugLineNum = 5539;BA.debugLine="For i = 0 To HLines.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_hlines.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 5540;BA.debugLine="Private HL As HLine";
_hl = new b4a.example.xchart._hline();
 //BA.debugLineNum = 5541;BA.debugLine="Private x, x1, y As Int";
_x = 0;
_x1 = 0;
_y = 0;
 //BA.debugLineNum = 5542;BA.debugLine="HL = HLines.Get(i)";
_hl = (b4a.example.xchart._hline)(_hlines.Get(_i));
 //BA.debugLineNum = 5543;BA.debugLine="x = Graph.Left + (HL.Value - Scale(sY(0)).MinVal";
_x = (int) (_graph.Left /*int*/ +(_hl.Value /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 5545;BA.debugLine="If HL.DisplayValue = True Then";
if (_hl.DisplayValue /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 5546;BA.debugLine="Private rct, rct1 As B4XRect";
_rct = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rct1 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 5547;BA.debugLine="rct = xcvsGraph.MeasureText(HL.Value, Texts.Sca";
_rct = _xcvsgraph.MeasureText(BA.NumberToString(_hl.Value /*double*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 5548;BA.debugLine="If mHChartsXScaleOnTop = False Then";
if (_mhchartsxscaleontop==__c.False) { 
 //BA.debugLineNum = 5549;BA.debugLine="y = Graph.Bottom - 10dip";
_y = (int) (_graph.Bottom /*int*/ -__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 5550;BA.debugLine="x1 = x - rct.CenterY";
_x1 = (int) (_x-_rct.getCenterY());
 //BA.debugLineNum = 5551;BA.debugLine="rct1.Initialize(x1 - 1.1 * rct.Height, y - 1.1";
_rct1.Initialize((float) (_x1-1.1*_rct.getHeight()),(float) (_y-1.1*_rct.getWidth()),(float) (_x1+0.1*_rct.getHeight()),(float) (_y+0.1*_rct.getWidth()));
 }else {
 //BA.debugLineNum = 5553;BA.debugLine="y = Graph.Top + 10dip";
_y = (int) (_graph.Top /*int*/ +__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 5554;BA.debugLine="x1 = x - rct.CenterY";
_x1 = (int) (_x-_rct.getCenterY());
 //BA.debugLineNum = 5555;BA.debugLine="rct1.Initialize(x1 - 1.1 * rct.Height, y - 1.1";
_rct1.Initialize((float) (_x1-1.1*_rct.getHeight()),(float) (_y-1.1*_rct.getWidth()),(float) (_x1+0.1*_rct.getHeight()),(float) (_y+0.1*_rct.getWidth()));
 };
 //BA.debugLineNum = 5557;BA.debugLine="xcvsGraph.DrawRect(rct1, Graph.ChartBackgroundC";
_xcvsgraph.DrawRect(_rct1,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 5558;BA.debugLine="xcvsGraph.DrawTextRotated(HL.Value, x1, y, Text";
_xcvsgraph.DrawTextRotated(ba,BA.NumberToString(_hl.Value /*double*/ ),(float) (_x1),(float) (_y),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_hl.Color /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"),(float) (-90));
 };
 }
};
 //BA.debugLineNum = 5561;BA.debugLine="End Sub";
return "";
}
public String  _drawitemvalues(int _x,int _y) throws Exception{
int _x1 = 0;
int _y1 = 0;
int _index = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rectvalues1 = null;
double _angle = 0;
b4a.example.xchart._pointdata _pd = null;
int _h = 0;
int _i = 0;
double _total = 0;
int _top = 0;
String _txt = "";
int _nb = 0;
boolean _scientificdisplay = false;
int _xcursor = 0;
 //BA.debugLineNum = 997;BA.debugLine="Private Sub DrawItemValues(x As Int, y As Int)";
 //BA.debugLineNum = 998;BA.debugLine="Private x1, y1 As Int";
_x1 = 0;
_y1 = 0;
 //BA.debugLineNum = 1000;BA.debugLine="If Graph.ChartType = \"PIE\" Then";
if ((_graph.ChartType /*String*/ ).equals("PIE")) { 
 //BA.debugLineNum = 1001;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1004;BA.debugLine="Private Index As Int";
_index = 0;
 //BA.debugLineNum = 1005;BA.debugLine="xcvsValues.ClearRect(Values.rectValues)";
_xcvsvalues.ClearRect(_values.rectValues /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 1006;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 1007;BA.debugLine="Private rectValues1 As B4XRect";
_rectvalues1 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 1008;BA.debugLine="rectValues1.Initialize(Values.rectValues.Left - 1";
_rectvalues1.Initialize((float) (_values.rectValues /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-1),_values.rectValues /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop(),_values.rectValues /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight(),_values.rectValues /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom());
 //BA.debugLineNum = 1009;BA.debugLine="xcvsValues.DrawRect(rectValues1, Values.Backgroun";
_xcvsvalues.DrawRect(_rectvalues1,_values.BackgroundColor /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 1010;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"BAR","STACKED_BAR","CANDLE","WATERFALL","H_BAR","H_STACKED_BAR","LINE","AREA","STACKED_AREA","H_LINE","RADAR")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 1012;BA.debugLine="Index =(x - Graph.Left - Graph.XOffset) / Graph";
_index = (int) ((_x-_graph.Left /*int*/ -_graph.XOffset /*int*/ )/(double)_graph.XInterval /*double*/ );
 break; }
case 4: 
case 5: {
 //BA.debugLineNum = 1014;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 1015;BA.debugLine="Index =(Graph.Bottom - y) / Graph.YInterval";
_index = (int) ((_graph.Bottom /*int*/ -_y)/(double)_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 1017;BA.debugLine="Index =(y - Graph.Top) / Graph.YInterval";
_index = (int) ((_y-_graph.Top /*int*/ )/(double)_graph.YInterval /*int*/ );
 };
 break; }
case 6: 
case 7: 
case 8: {
 //BA.debugLineNum = 1020;BA.debugLine="Index = (x - Graph.Left) / Scale(sX).Scale + 0.";
_index = (int) ((_x-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ +0.5);
 break; }
case 9: {
 //BA.debugLineNum = 1022;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 1023;BA.debugLine="Index = (Graph.Bottom - y) / Scale(sX).Scale +";
_index = (int) ((_graph.Bottom /*int*/ -_y)/(double)_scale[_sx].Scale /*double*/ +0.5);
 }else {
 //BA.debugLineNum = 1025;BA.debugLine="Index = (y - Graph.Top) / Scale(sX).Scale + 0.";
_index = (int) ((_y-_graph.Top /*int*/ )/(double)_scale[_sx].Scale /*double*/ +0.5);
 };
 break; }
case 10: {
 //BA.debugLineNum = 1028;BA.debugLine="Private Angle As Double";
_angle = 0;
 //BA.debugLineNum = 1029;BA.debugLine="Angle = (ATan2D(y - Graph.CenterY, x - Graph.Ce";
_angle = (__c.ATan2D(_y-_graph.CenterY /*int*/ ,_x-_graph.CenterX /*int*/ )+360-_graph.RadarStartAngle /*int*/ );
 //BA.debugLineNum = 1030;BA.debugLine="If Angle < 0 Then";
if (_angle<0) { 
 //BA.debugLineNum = 1031;BA.debugLine="Angle = Angle + 360";
_angle = _angle+360;
 }else if(_angle>360) { 
 //BA.debugLineNum = 1033;BA.debugLine="Angle = Angle - 360";
_angle = _angle-360;
 };
 //BA.debugLineNum = 1035;BA.debugLine="Index = Angle * Zoom.NbVisiblePoints / 360 + 0.";
_index = (int) (_angle*_zoom.NbVisiblePoints /*int*/ /(double)360+0.5);
 //BA.debugLineNum = 1036;BA.debugLine="Angle = 360 / Zoom.NbVisiblePoints * Index + Gr";
_angle = 360/(double)_zoom.NbVisiblePoints /*int*/ *_index+_graph.RadarStartAngle /*int*/ ;
 //BA.debugLineNum = 1037;BA.debugLine="x1 = Graph.CenterX + CosD(Angle) * Graph.Radius";
_x1 = (int) (_graph.CenterX /*int*/ +__c.CosD(_angle)*_graph.Radius /*float*/ );
 //BA.debugLineNum = 1038;BA.debugLine="y1 = Graph.CenterY + SinD(Angle) * Graph.Radius";
_y1 = (int) (_graph.CenterY /*int*/ +__c.SinD(_angle)*_graph.Radius /*float*/ );
 break; }
}
;
 //BA.debugLineNum = 1040;BA.debugLine="If Index = Zoom.NbVisiblePoints Then";
if (_index==_zoom.NbVisiblePoints /*int*/ ) { 
 //BA.debugLineNum = 1041;BA.debugLine="Index = Index - 1";
_index = (int) (_index-1);
 };
 //BA.debugLineNum = 1043;BA.debugLine="Index = Max(Index, 0)";
_index = (int) (__c.Max(_index,0));
 //BA.debugLineNum = 1044;BA.debugLine="Index = Min(Index, Zoom.NbVisiblePoints - 1)";
_index = (int) (__c.Min(_index,_zoom.NbVisiblePoints /*int*/ -1));
 //BA.debugLineNum = 1045;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 1046;BA.debugLine="PD = Points.Get(Index + Zoom.BeginIndex)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (_index+_zoom.BeginIndex /*int*/ )));
 //BA.debugLineNum = 1047;BA.debugLine="Private h, i, x, y As Int";
_h = 0;
_i = 0;
_x = 0;
_y = 0;
 //BA.debugLineNum = 1048;BA.debugLine="h = Values.TextHeight * 1.3";
_h = (int) (_values.TextHeight /*int*/ *1.3);
 //BA.debugLineNum = 1049;BA.debugLine="x = Values.MidPont";
_x = _values.MidPont /*int*/ ;
 //BA.debugLineNum = 1050;BA.debugLine="y = 1.2 * Values.TextHeight";
_y = (int) (1.2*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 1052;BA.debugLine="If Values.Show = False Then";
if (_values.Show /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1053;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 };
 //BA.debugLineNum = 1055;BA.debugLine="If Values.Show = True Or Values.ShowCursor = True";
if (_values.Show /*boolean*/ ==__c.True || _values.ShowCursor /*boolean*/ ==__c.True || _values.ShowOnHover /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1056;BA.debugLine="Private Total = 0 As Double";
_total = 0;
 //BA.debugLineNum = 1057;BA.debugLine="Private top As Int";
_top = 0;
 //BA.debugLineNum = 1058;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 1076;BA.debugLine="xcvsValues.DrawText(PD.X, x, y + 0.2 * h, Values";
_xcvsvalues.DrawText(ba,_pd.X /*String*/ ,(float) (_x),(float) (_y+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 1077;BA.debugLine="Private nb As Int";
_nb = 0;
 //BA.debugLineNum = 1078;BA.debugLine="Private ScientificDisplay = True As Boolean";
_scientificdisplay = __c.True;
 //BA.debugLineNum = 1079;BA.debugLine="nb = PD.YArray.Length - 1";
_nb = (int) (_pd.YArray /*double[]*/ .length-1);
 //BA.debugLineNum = 1080;BA.debugLine="If Graph.ChartType = \"CANDLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("CANDLE")) { 
 //BA.debugLineNum = 1081;BA.debugLine="ScientificDisplay = False";
_scientificdisplay = __c.False;
 //BA.debugLineNum = 1082;BA.debugLine="If Bar.CandleDisplayVolume = False Then";
if (_bar.CandleDisplayVolume /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1083;BA.debugLine="nb = nb -1";
_nb = (int) (_nb-1);
 };
 //BA.debugLineNum = 1085;BA.debugLine="For i = 0 To nb";
{
final int step68 = 1;
final int limit68 = _nb;
_i = (int) (0) ;
for (;_i <= limit68 ;_i = _i + step68 ) {
 //BA.debugLineNum = 1086;BA.debugLine="top = y + h * (i + 1)";
_top = (int) (_y+_h*(_i+1));
 //BA.debugLineNum = 1087;BA.debugLine="If i < 4 Then";
if (_i<4) { 
 //BA.debugLineNum = 1088;BA.debugLine="txt = NumberFormat2(PD.YArray(i), 1, 2, 2, Fa";
_txt = __c.NumberFormat2(_pd.YArray /*double[]*/ [_i],(int) (1),(int) (2),(int) (2),__c.False);
 }else {
 //BA.debugLineNum = 1090;BA.debugLine="txt = NumberFormat4(PD.YArray(i), Values.MaxD";
_txt = _numberformat4(_pd.YArray /*double[]*/ [_i],_values.MaxDigits /*int*/ ,_scientificdisplay);
 };
 //BA.debugLineNum = 1092;BA.debugLine="xcvsValues.DrawText(txt, x, top + 0.2 * h, Val";
_xcvsvalues.DrawText(ba,_txt,(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 1093;BA.debugLine="Total = Total + PD.YArray(i)";
_total = _total+_pd.YArray /*double[]*/ [_i];
 }
};
 }else {
 //BA.debugLineNum = 1096;BA.debugLine="For i = 0 To nb";
{
final int step79 = 1;
final int limit79 = _nb;
_i = (int) (0) ;
for (;_i <= limit79 ;_i = _i + step79 ) {
 //BA.debugLineNum = 1097;BA.debugLine="top = y + h * (i + 1)";
_top = (int) (_y+_h*(_i+1));
 //BA.debugLineNum = 1098;BA.debugLine="If PD.YArray(i) <> mMissingDataValue Then";
if (_pd.YArray /*double[]*/ [_i]!=_mmissingdatavalue) { 
 //BA.debugLineNum = 1099;BA.debugLine="txt = NumberFormat4(PD.YArray(i), Values.MaxD";
_txt = _numberformat4(_pd.YArray /*double[]*/ [_i],_values.MaxDigits /*int*/ ,_scientificdisplay);
 }else {
 //BA.debugLineNum = 1101;BA.debugLine="txt = \"NaN\"";
_txt = "NaN";
 };
 //BA.debugLineNum = 1103;BA.debugLine="xcvsValues.DrawText(txt, x, top + 0.2 * h, Val";
_xcvsvalues.DrawText(ba,_txt,(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 1104;BA.debugLine="Total = Total + PD.YArray(i)";
_total = _total+_pd.YArray /*double[]*/ [_i];
 }
};
 };
 //BA.debugLineNum = 1107;BA.debugLine="If Graph.ChartType.Contains(\"STACKED\") Then";
if (_graph.ChartType /*String*/ .contains("STACKED")) { 
 //BA.debugLineNum = 1108;BA.debugLine="top = y + h * (i + 1)";
_top = (int) (_y+_h*(_i+1));
 //BA.debugLineNum = 1109;BA.debugLine="xcvsValues.DrawText(NumberFormat3(Total, Values";
_xcvsvalues.DrawText(ba,_numberformat3(_total,_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 1113;BA.debugLine="If (Graph.ChartType = \"LINE\" Or Graph.ChartType";
if (((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("H_LINE") || (_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) && _pd.YArray /*double[]*/ .length==1) { 
 //BA.debugLineNum = 1114;BA.debugLine="top = top + 0.2 * h";
_top = (int) (_top+0.2*_h);
 //BA.debugLineNum = 1115;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1116;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 1117;BA.debugLine="xcvsValues.DrawText(NumberFormat3(MinMaxMeanVa";
_xcvsvalues.DrawText(ba,_numberformat3(_minmaxmeanvalues[(int) (1)],_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 1119;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1120;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 1121;BA.debugLine="xcvsValues.DrawText(NumberFormat3(MinMaxMeanVa";
_xcvsvalues.DrawText(ba,_numberformat3(_minmaxmeanvalues[(int) (2)],_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 1123;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1124;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 1125;BA.debugLine="xcvsValues.DrawText(NumberFormat3(MinMaxMeanVa";
_xcvsvalues.DrawText(ba,_numberformat3(_minmaxmeanvalues[(int) (0)],_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 };
 //BA.debugLineNum = 1132;BA.debugLine="Private xCursor As Int";
_xcursor = 0;
 //BA.debugLineNum = 1133;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"BAR","STACKED_BAR","CANDLE","WATERFALL","H_BAR","H_STACKED_BAR","LINE","AREA","STACKED_AREA","H_LINE","RADAR")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 1135;BA.debugLine="xCursor = (Index + 0.5) * Graph.XInterval + Gr";
_xcursor = (int) ((_index+0.5)*_graph.XInterval /*double*/ +_graph.Left /*int*/ +_graph.XOffset /*int*/ );
 //BA.debugLineNum = 1136;BA.debugLine="xcvsCursor.DrawLine(xCursor, Graph.Top, xCurso";
_xcvscursor.DrawLine((float) (_xcursor),(float) (_graph.Top /*int*/ ),(float) (_xcursor),(float) (_graph.Bottom /*int*/ ),_xui.Color_Red,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1137;BA.debugLine="Values.rectCursor.Initialize(xCursor - 2dip, 0";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_xcursor-__c.DipToCurrent((int) (2))),(float) (0),(float) (_xcursor+__c.DipToCurrent((int) (2))),(float) (_xpnlcursor.getHeight()));
 break; }
case 4: 
case 5: {
 //BA.debugLineNum = 1139;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 1140;BA.debugLine="xCursor = Graph.Bottom - (Index + 0.5) * Grap";
_xcursor = (int) (_graph.Bottom /*int*/ -(_index+0.5)*_graph.YInterval /*int*/ -_graph.XOffset /*int*/ );
 }else {
 //BA.debugLineNum = 1142;BA.debugLine="xCursor = Graph.Top + (Index + 0.5) * Graph.Y";
_xcursor = (int) (_graph.Top /*int*/ +(_index+0.5)*_graph.YInterval /*int*/ +_graph.XOffset /*int*/ );
 };
 //BA.debugLineNum = 1144;BA.debugLine="xcvsCursor.DrawLine( Graph.Left, xCursor, Grap";
_xcvscursor.DrawLine((float) (_graph.Left /*int*/ ),(float) (_xcursor),(float) (_graph.Right /*int*/ ),(float) (_xcursor),_xui.Color_Red,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1145;BA.debugLine="Values.rectCursor.Initialize(0, xCursor - 2dip";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (0),(float) (_xcursor-__c.DipToCurrent((int) (2))),(float) (_xpnlcursor.getWidth()),(float) (_xcursor+__c.DipToCurrent((int) (2))));
 break; }
case 6: 
case 7: 
case 8: {
 //BA.debugLineNum = 1147;BA.debugLine="xCursor = Index * Scale(sX).Scale + Graph.Left";
_xcursor = (int) (_index*_scale[_sx].Scale /*double*/ +_graph.Left /*int*/ );
 //BA.debugLineNum = 1148;BA.debugLine="xcvsCursor.DrawLine(xCursor, Graph.Top, xCurso";
_xcvscursor.DrawLine((float) (_xcursor),(float) (_graph.Top /*int*/ ),(float) (_xcursor),(float) (_graph.Bottom /*int*/ ),_xui.Color_Red,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1149;BA.debugLine="Values.rectCursor.Initialize(xCursor - 2dip, 0";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_xcursor-__c.DipToCurrent((int) (2))),(float) (0),(float) (_xcursor+__c.DipToCurrent((int) (2))),(float) (_xpnlcursor.getHeight()));
 break; }
case 9: {
 //BA.debugLineNum = 1151;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 1152;BA.debugLine="xCursor = Graph.Bottom - Index * Graph.YInter";
_xcursor = (int) (_graph.Bottom /*int*/ -_index*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 1154;BA.debugLine="xCursor = Graph.Top + Index * Graph.YInterval";
_xcursor = (int) (_graph.Top /*int*/ +_index*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 1156;BA.debugLine="xcvsCursor.DrawLine( Graph.Left, xCursor, Grap";
_xcvscursor.DrawLine((float) (_graph.Left /*int*/ ),(float) (_xcursor),(float) (_graph.Right /*int*/ ),(float) (_xcursor),_xui.Color_Red,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1157;BA.debugLine="Values.rectCursor.Initialize(0, xCursor - 2dip";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (0),(float) (_xcursor-__c.DipToCurrent((int) (2))),(float) (_xpnlcursor.getWidth()),(float) (_xcursor+__c.DipToCurrent((int) (2))));
 break; }
case 10: {
 //BA.debugLineNum = 1159;BA.debugLine="xcvsCursor.DrawLine(Graph.CenterX, Graph.Cente";
_xcvscursor.DrawLine((float) (_graph.CenterX /*int*/ ),(float) (_graph.CenterY /*int*/ ),(float) (_x1),(float) (_y1),_xui.Color_Red,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1160;BA.debugLine="Values.rectCursor = xcvsCursor.TargetRect";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = _xcvscursor.getTargetRect();
 break; }
}
;
 };
 //BA.debugLineNum = 1163;BA.debugLine="xcvsValues.Invalidate";
_xcvsvalues.Invalidate();
 //BA.debugLineNum = 1164;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 //BA.debugLineNum = 1165;BA.debugLine="End Sub";
return "";
}
public String  _drawlegend() throws Exception{
int _y = 0;
int _y1 = 0;
int _w = 0;
int _x = 0;
int _h = 0;
int _box = 0;
int _textverticaloffset = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
b4a.example.xchart._itemdata _item = null;
String _txt = "";
int _top = 0;
int _y0 = 0;
 //BA.debugLineNum = 6993;BA.debugLine="Private Sub DrawLegend";
 //BA.debugLineNum = 6994;BA.debugLine="Private y, y1, w, x As Int";
_y = 0;
_y1 = 0;
_w = 0;
_x = 0;
 //BA.debugLineNum = 6995;BA.debugLine="Private h As Int = 1.8 * Legend.TextHeight";
_h = (int) (1.8*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 6996;BA.debugLine="Private box As Int = 0.8 * Legend.TextHeight";
_box = (int) (0.8*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 6997;BA.debugLine="Private textVerticalOffset As Int = 0.3 * Legend.";
_textverticaloffset = (int) (0.3*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 6998;BA.debugLine="If xui.IsB4i Then textVerticalOffset = 0.45 * Leg";
if (_xui.getIsB4i()) { 
_textverticaloffset = (int) (0.45*_legend.TextHeight /*int*/ );};
 //BA.debugLineNum = 6999;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 7000;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 7002;BA.debugLine="y = 1.2 * Legend.TextHeight";
_y = (int) (1.2*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 7003;BA.debugLine="y = Graph.Top + 0.5 * box + 2dip";
_y = (int) (_graph.Top /*int*/ +0.5*_box+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 7004;BA.debugLine="Select Legend.IncludeLegend";
switch (BA.switchObjectToInt(_legend.IncludeLegend /*String*/ ,"TOP_RIGHT","BOTTOM")) {
case 0: {
 //BA.debugLineNum = 7006;BA.debugLine="h = Texts.AxisTextHeight * 1.2";
_h = (int) (_texts.AxisTextHeight /*int*/ *1.2);
 //BA.debugLineNum = 7007;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group13 = _items;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_item = (b4a.example.xchart._itemdata)(group13.Get(index13));
 //BA.debugLineNum = 7008;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 7009;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 7010;BA.debugLine="txt = txt & \" : \" & NumberFormat3(Item.Value,";
_txt = _txt+" : "+_numberformat3(_item.Value /*float*/ ,(int) (6));
 };
 //BA.debugLineNum = 7012;BA.debugLine="w = Max(w, MeasureTextWidth(txt, Legend.TextFo";
_w = (int) (__c.Max(_w,_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 //BA.debugLineNum = 7014;BA.debugLine="w = w + 2 * box + Texts.AxisTextHeight";
_w = (int) (_w+2*_box+_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 7015;BA.debugLine="x = Graph.Right - w - 2dip";
_x = (int) (_graph.Right /*int*/ -_w-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 7016;BA.debugLine="r.Initialize(x - box, y - 0.5 * box, x + w, y +";
_r.Initialize((float) (_x-_box),(float) (_y-0.5*_box),(float) (_x+_w),(float) (_y+_h*_items.getSize()+0.5*_box));
 //BA.debugLineNum = 7017;BA.debugLine="If Graph.ChartBackgroundColor = xui.Color_Trans";
if (_graph.ChartBackgroundColor /*int*/ ==_xui.Color_Transparent) { 
 //BA.debugLineNum = 7018;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 7020;BA.debugLine="xcvsGraph.DrawRect(r, Legend.BackgroundColor,";
_xcvsgraph.DrawRect(_r,_legend.BackgroundColor /*int*/ ,__c.True,(float) (0));
 };
 //BA.debugLineNum = 7022;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group28 = _items;
final int groupLen28 = group28.getSize()
;int index28 = 0;
;
for (; index28 < groupLen28;index28++){
_item = (b4a.example.xchart._itemdata)(group28.Get(index28));
 //BA.debugLineNum = 7023;BA.debugLine="Private top As Int = y + h * i";
_top = (int) (_y+_h*_i);
 //BA.debugLineNum = 7024;BA.debugLine="r.Initialize(x, top + 0.5 * h - 0.65 * box, x";
_r.Initialize((float) (_x),(float) (_top+0.5*_h-0.65*_box),(float) (_x+_box),(float) (_top+0.5*_h+0.35*_box));
 //BA.debugLineNum = 7025;BA.debugLine="xcvsGraph.DrawRect(r, Item.Color, True, 0)";
_xcvsgraph.DrawRect(_r,_item.Color /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 7026;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 7027;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 7028;BA.debugLine="txt = txt & \" : \" & NumberFormat3(Item.Value,";
_txt = _txt+" : "+_numberformat3(_item.Value /*float*/ ,(int) (6));
 };
 //BA.debugLineNum = 7030;BA.debugLine="xcvsGraph.DrawText(txt, x + box + box, top + 0";
_xcvsgraph.DrawText(ba,_txt,(float) (_x+_box+_box),(float) (_top+0.5*_h+_textverticaloffset),_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_legend.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 7031;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
 break; }
case 1: {
 //BA.debugLineNum = 7034;BA.debugLine="Private x, y0, y As Int";
_x = 0;
_y0 = 0;
_y = 0;
 //BA.debugLineNum = 7035;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 7036;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 7038;BA.debugLine="y0  = xpnlGraph.Height - Legend.Height + 0.9 *";
_y0 = (int) (_xpnlgraph.getHeight()-_legend.Height /*int*/ +0.9*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 7039;BA.debugLine="x = box";
_x = _box;
 //BA.debugLineNum = 7041;BA.debugLine="r.Initialize(0.5 * box, xpnlGraph.Height - Lege";
_r.Initialize((float) (0.5*_box),(float) (_xpnlgraph.getHeight()-_legend.Height /*int*/ -0.5*_box),(float) (_xpnlgraph.getWidth()-0.5*_box),(float) (_xpnlgraph.getHeight()-0.5*_box));
 //BA.debugLineNum = 7042;BA.debugLine="If Graph.ChartBackgroundColor = xui.Color_Trans";
if (_graph.ChartBackgroundColor /*int*/ ==_xui.Color_Transparent) { 
 //BA.debugLineNum = 7043;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 7045;BA.debugLine="xcvsGraph.DrawRect(r, Legend.BackgroundColor,";
_xcvsgraph.DrawRect(_r,_legend.BackgroundColor /*int*/ ,__c.True,(float) (0));
 };
 //BA.debugLineNum = 7048;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step51 = 1;
final int limit51 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
 //BA.debugLineNum = 7049;BA.debugLine="Private Item As ItemData";
_item = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 7050;BA.debugLine="Item = Items.Get(i)";
_item = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 7051;BA.debugLine="y = y0 + Legend.TextHeight * Legend.LineNumber";
_y = (int) (_y0+_legend.TextHeight /*int*/ *(double)(BA.ObjectToNumber(_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))));
 //BA.debugLineNum = 7052;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 7053;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 7054;BA.debugLine="txt = txt & \" : \" & NumberFormat3(Item.Value,";
_txt = _txt+" : "+_numberformat3(_item.Value /*float*/ ,(int) (6));
 };
 //BA.debugLineNum = 7056;BA.debugLine="If Legend.LineChange.Get(i) = True Then";
if ((_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 7057;BA.debugLine="x = box";
_x = _box;
 };
 //BA.debugLineNum = 7060;BA.debugLine="r.Initialize(x, y - box, x + box, y)";
_r.Initialize((float) (_x),(float) (_y-_box),(float) (_x+_box),(float) (_y));
 //BA.debugLineNum = 7061;BA.debugLine="xcvsGraph.DrawRect(r, Item.Color, True, 0)";
_xcvsgraph.DrawRect(_r,_item.Color /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 7062;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 7063;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 7064;BA.debugLine="txt = txt & \" : \" & NumberFormat3(Item.Value,";
_txt = _txt+" : "+_numberformat3(_item.Value /*float*/ ,(int) (6));
 };
 //BA.debugLineNum = 7068;BA.debugLine="y1 = y '+ 0.1 * box";
_y1 = _y;
 //BA.debugLineNum = 7074;BA.debugLine="xcvsGraph.DrawText(txt, x + 1.5 * box, y1, Leg";
_xcvsgraph.DrawText(ba,_txt,(float) (_x+1.5*_box),(float) (_y1),_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_legend.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 7075;BA.debugLine="x = x + 2.5 * box + MeasureTextWidth(txt, Lege";
_x = (int) (_x+2.5*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ));
 }
};
 break; }
}
;
 //BA.debugLineNum = 7078;BA.debugLine="End Sub";
return "";
}
public String  _drawlinesh() throws Exception{
int _i = 0;
int _ip = 0;
int _l = 0;
double _smax = 0;
double _smin = 0;
double _smean = 0;
b4a.example.xchart._itemdata _id = null;
anywheresoftware.b4a.objects.collections.List _lstcoords = null;
b4a.example.xchart._pointdata _pd = null;
int[] _coords = null;
int[] _coords0 = null;
int[] _coords1 = null;
int _myaxis0 = 0;
 //BA.debugLineNum = 3782;BA.debugLine="Private Sub DrawLinesH";
 //BA.debugLineNum = 3783;BA.debugLine="Private i, ip, l As Int";
_i = 0;
_ip = 0;
_l = 0;
 //BA.debugLineNum = 3785;BA.debugLine="If Items.Size = 1 And (MinMaxMeanValues(0) <> 0 O";
if (_items.getSize()==1 && (_minmaxmeanvalues[(int) (0)]!=0 || _minmaxmeanvalues[(int) (1)]!=0)) { 
 //BA.debugLineNum = 3786;BA.debugLine="Private sMax, sMin, sMean As Double";
_smax = 0;
_smin = 0;
_smean = 0;
 //BA.debugLineNum = 3787;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3788;BA.debugLine="sMin = Graph.Left + (MinMaxMeanValues(0) - Scal";
_smin = _graph.Left /*int*/ +(_minmaxmeanvalues[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3789;BA.debugLine="xcvsGraph.DrawLine(sMin, Graph.Top, sMin, Graph";
_xcvsgraph.DrawLine((float) (_smin),(float) (_graph.Top /*int*/ ),(float) (_smin),(float) (_graph.Bottom /*int*/ ),_graph.MinLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3791;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3792;BA.debugLine="sMax = Graph.Left + (MinMaxMeanValues(1) - Scal";
_smax = _graph.Left /*int*/ +(_minmaxmeanvalues[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3793;BA.debugLine="xcvsGraph.DrawLine(sMax, Graph.Top, sMax, Graph";
_xcvsgraph.DrawLine((float) (_smax),(float) (_graph.Top /*int*/ ),(float) (_smax),(float) (_graph.Bottom /*int*/ ),_graph.MaxLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3795;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3796;BA.debugLine="sMean = Graph.Left + (MinMaxMeanValues(2) - Sca";
_smean = _graph.Left /*int*/ +(_minmaxmeanvalues[(int) (2)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3797;BA.debugLine="xcvsGraph.DrawLine(sMean, Graph.Top, sMean, Gra";
_xcvsgraph.DrawLine((float) (_smean),(float) (_graph.Top /*int*/ ),(float) (_smean),(float) (_graph.Bottom /*int*/ ),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 //BA.debugLineNum = 3801;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit17 ;_l = _l + step17 ) {
 //BA.debugLineNum = 3802;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 3803;BA.debugLine="Private lstCoords As List";
_lstcoords = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3805;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 3806;BA.debugLine="If ID.HideLine = False Then";
if (_id.HideLine /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3807;BA.debugLine="lstCoords.Initialize";
_lstcoords.Initialize();
 //BA.debugLineNum = 3808;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step23 = 1;
final int limit23 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 3809;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3811;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3812;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3813;BA.debugLine="If PD.YArray(l) <> mMissingDataValue Then";
if (_pd.YArray /*double[]*/ [_l]!=_mmissingdatavalue) { 
 //BA.debugLineNum = 3814;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 3815;BA.debugLine="Coords(0) = Graph.Left + (PD.YArray(l) - Scal";
_coords[(int) (0)] = (int) (_graph.Left /*int*/ +(_pd.YArray /*double[]*/ [_l]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 3816;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 3817;BA.debugLine="Coords(1) = Graph.Bottom - ip * Graph.YInter";
_coords[(int) (1)] = (int) (_graph.Bottom /*int*/ -_ip*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 3819;BA.debugLine="Coords(1) = Graph.Top + ip * Graph.YInterval";
_coords[(int) (1)] = (int) (_graph.Top /*int*/ +_ip*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 3821;BA.debugLine="lstCoords.Add(Coords)";
_lstcoords.Add((Object)(_coords));
 };
 }
};
 //BA.debugLineNum = 3825;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing out";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 3827;BA.debugLine="For i = 1 To lstCoords.Size - 1";
{
final int step39 = 1;
final int limit39 = (int) (_lstcoords.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
 //BA.debugLineNum = 3828;BA.debugLine="Private Coords0(2), Coords1(2) As Int";
_coords0 = new int[(int) (2)];
;
_coords1 = new int[(int) (2)];
;
 //BA.debugLineNum = 3829;BA.debugLine="Coords0 = lstCoords.Get(i - 1)";
_coords0 = (int[])(_lstcoords.Get((int) (_i-1)));
 //BA.debugLineNum = 3830;BA.debugLine="Coords1 = lstCoords.Get(i)";
_coords1 = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 3831;BA.debugLine="xcvsGraph.DrawLine(Coords0(0), Coords0(1), Coo";
_xcvsgraph.DrawLine((float) (_coords0[(int) (0)]),(float) (_coords0[(int) (1)]),(float) (_coords1[(int) (0)]),(float) (_coords1[(int) (1)]),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 }
};
 //BA.debugLineNum = 3833;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 3835;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 3836;BA.debugLine="For i = 0 To lstCoords.Size - 1";
{
final int step47 = 1;
final int limit47 = (int) (_lstcoords.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit47 ;_i = _i + step47 ) {
 //BA.debugLineNum = 3837;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 3838;BA.debugLine="Coords = lstCoords.Get(i)";
_coords = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 3839;BA.debugLine="DrawPoint(Coords(0), Coords(1), ID.PointColor";
_drawpoint(_coords[(int) (0)],_coords[(int) (1)],_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }
};
 };
 };
 }
};
 //BA.debugLineNum = 3845;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 3846;BA.debugLine="Private mYAxis0 = Graph.Left - Scale(sY(0)).MinV";
_myaxis0 = (int) (_graph.Left /*int*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 3847;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3848;BA.debugLine="xcvsGraph.DrawLine( mYAxis0, Graph.Top, mYAxis0";
_xcvsgraph.DrawLine((float) (_myaxis0),(float) (_graph.Top /*int*/ ),(float) (_myaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 3850;BA.debugLine="xcvsGraph.DrawLine( mYAxis0, Graph.Top, mYAxis0";
_xcvsgraph.DrawLine((float) (_myaxis0),(float) (_graph.Top /*int*/ ),(float) (_myaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 3854;BA.debugLine="If HLines.Size > 0 And Scale(sY(0)).Different = F";
if (_hlines.getSize()>0 && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.False) { 
 };
 //BA.debugLineNum = 3858;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Zoom.NbVisi";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _zoom.NbVisiblePoints /*int*/ >0) { 
 //BA.debugLineNum = 3859;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 3862;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 3863;BA.debugLine="End Sub";
return "";
}
public String  _drawlineslog() throws Exception{
int _i = 0;
int _x0 = 0;
int _x1 = 0;
b4a.example.xchart._pointdata _pd = null;
int[] _cols = null;
int[] _strokewidths = null;
String[] _names = null;
double[] _py0 = null;
double[] _py1 = null;
double[] _psy0 = null;
double[] _psy1 = null;
b4a.example.xchart._itemdata _id = null;
int _j = 0;
 //BA.debugLineNum = 4178;BA.debugLine="Private Sub DrawLinesLog";
 //BA.debugLineNum = 4179;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 4180;BA.debugLine="Private x0, x1 As Int";
_x0 = 0;
_x1 = 0;
 //BA.debugLineNum = 4182;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4183;BA.debugLine="Private Cols(Items.Size), StrokeWidths(Items.Size";
_cols = new int[_items.getSize()];
;
_strokewidths = new int[_items.getSize()];
;
 //BA.debugLineNum = 4184;BA.debugLine="Private Names(Items.Size) As String";
_names = new String[_items.getSize()];
java.util.Arrays.fill(_names,"");
 //BA.debugLineNum = 4186;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 4187;BA.debugLine="x0 = Graph.Left";
_x0 = _graph.Left /*int*/ ;
 //BA.debugLineNum = 4188;BA.debugLine="Private py0(PD.YArray.Length), py1(PD.YArray.Leng";
_py0 = new double[_pd.YArray /*double[]*/ .length];
;
_py1 = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 4189;BA.debugLine="Private psy0(PD.YArray.Length), psy1(PD.YArray.Le";
_psy0 = new double[_pd.YArray /*double[]*/ .length];
;
_psy1 = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 4190;BA.debugLine="py0 = PD.YArray";
_py0 = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 4191;BA.debugLine="For i = 0 To py0.Length - 1";
{
final int step11 = 1;
final int limit11 = (int) (_py0.length-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 4192;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 4193;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 4194;BA.debugLine="Cols(i) = ID.Color";
_cols[_i] = _id.Color /*int*/ ;
 //BA.debugLineNum = 4195;BA.debugLine="Names(i) = ID.Name";
_names[_i] = _id.Name /*String*/ ;
 //BA.debugLineNum = 4196;BA.debugLine="StrokeWidths(i) = ID.StrokeWidth";
_strokewidths[_i] = _id.StrokeWidth /*int*/ ;
 //BA.debugLineNum = 4197;BA.debugLine="psy0(i) = Graph.Bottom - (Logarithm(py0(i), 10)";
_psy0[_i] = _graph.Bottom /*int*/ -(__c.Logarithm(_py0[_i],10)-_scalelog[_sy[(int) (0)]].MantMin /*int*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ ;
 }
};
 //BA.debugLineNum = 4200;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4201;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step20 = 1;
final int limit20 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 4202;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4203;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4204;BA.debugLine="py1 = PD.YArray";
_py1 = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 4205;BA.debugLine="x1 = Graph.Left + i * Scale(sX).Scale";
_x1 = (int) (_graph.Left /*int*/ +_i*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4206;BA.debugLine="For j = 0 To py1.Length - 1";
{
final int step25 = 1;
final int limit25 = (int) (_py1.length-1);
_j = (int) (0) ;
for (;_j <= limit25 ;_j = _j + step25 ) {
 //BA.debugLineNum = 4207;BA.debugLine="psy1(j) = Graph.Bottom - (Logarithm(py1(j), 10)";
_psy1[_j] = _graph.Bottom /*int*/ -(__c.Logarithm(_py1[_j],10)-_scalelog[_sy[(int) (0)]].MantMin /*int*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 4208;BA.debugLine="xcvsGraph.DrawLine(x0, psy0(j), x1, psy1(j), Co";
_xcvsgraph.DrawLine((float) (_x0),(float) (_psy0[_j]),(float) (_x1),(float) (_psy1[_j]),_cols[_j],(float) (_strokewidths[_j]));
 //BA.debugLineNum = 4209;BA.debugLine="psy0(j) = psy1(j)";
_psy0[_j] = _psy1[_j];
 }
};
 //BA.debugLineNum = 4211;BA.debugLine="x0 = x1";
_x0 = _x1;
 }
};
 //BA.debugLineNum = 4213;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4215;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Zoom.NbVisi";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _zoom.NbVisiblePoints /*int*/ >0) { 
 //BA.debugLineNum = 4216;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 4219;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 4220;BA.debugLine="End Sub";
return "";
}
public String  _drawlinesnscales() throws Exception{
int _i = 0;
int _ip = 0;
int _l = 0;
b4a.example.xchart._itemdata _id = null;
anywheresoftware.b4a.objects.collections.List _lstcoords = null;
b4a.example.xchart._pointdata _pd = null;
int[] _coords = null;
int[] _coords0 = null;
int[] _coords1 = null;
int _myaxis0 = 0;
 //BA.debugLineNum = 3866;BA.debugLine="Private Sub DrawLinesNScales";
 //BA.debugLineNum = 3867;BA.debugLine="Private i, ip, l As Int";
_i = 0;
_ip = 0;
_l = 0;
 //BA.debugLineNum = 3869;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit2 ;_l = _l + step2 ) {
 //BA.debugLineNum = 3870;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 3871;BA.debugLine="Private lstCoords As List";
_lstcoords = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3873;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 3874;BA.debugLine="If ID.HideLine = False Then";
if (_id.HideLine /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3875;BA.debugLine="lstCoords.Initialize";
_lstcoords.Initialize();
 //BA.debugLineNum = 3876;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step8 = 1;
final int limit8 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 3877;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3879;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3880;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3881;BA.debugLine="If PD.YArray(l) <> mMissingDataValue Then";
if (_pd.YArray /*double[]*/ [_l]!=_mmissingdatavalue) { 
 //BA.debugLineNum = 3882;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 3883;BA.debugLine="Coords(0) = Graph.Left + ip * Scale(sX).Scale";
_coords[(int) (0)] = (int) (_graph.Left /*int*/ +_ip*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 3884;BA.debugLine="If Scale(sY(l)).ReverseYScale = False Then";
if (_scale[_sy[_l]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3885;BA.debugLine="Coords(1) = Graph.Bottom - (PD.YArray(l) - S";
_coords[(int) (1)] = (int) (_graph.Bottom /*int*/ -(_pd.YArray /*double[]*/ [_l]-_scale[_sy[_l]].MinVal /*double*/ )*_scale[_sy[_l]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 3887;BA.debugLine="Coords(1) = Graph.Top + (PD.YArray(l) - Scal";
_coords[(int) (1)] = (int) (_graph.Top /*int*/ +(_pd.YArray /*double[]*/ [_l]-_scale[_sy[_l]].MinVal /*double*/ )*_scale[_sy[_l]].Scale /*double*/ );
 };
 //BA.debugLineNum = 3889;BA.debugLine="lstCoords.Add(Coords)";
_lstcoords.Add((Object)(_coords));
 };
 }
};
 //BA.debugLineNum = 3893;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing out";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 3895;BA.debugLine="For i = 1 To lstCoords.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_lstcoords.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 3896;BA.debugLine="Private Coords0(2), Coords1(2) As Int";
_coords0 = new int[(int) (2)];
;
_coords1 = new int[(int) (2)];
;
 //BA.debugLineNum = 3897;BA.debugLine="Coords0 = lstCoords.Get(i - 1)";
_coords0 = (int[])(_lstcoords.Get((int) (_i-1)));
 //BA.debugLineNum = 3898;BA.debugLine="Coords1 = lstCoords.Get(i)";
_coords1 = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 3899;BA.debugLine="xcvsGraph.DrawLine(Coords0(0), Coords0(1), Coo";
_xcvsgraph.DrawLine((float) (_coords0[(int) (0)]),(float) (_coords0[(int) (1)]),(float) (_coords1[(int) (0)]),(float) (_coords1[(int) (1)]),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 }
};
 //BA.debugLineNum = 3901;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 3903;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 3904;BA.debugLine="For i = 0 To lstCoords.Size - 1";
{
final int step32 = 1;
final int limit32 = (int) (_lstcoords.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
 //BA.debugLineNum = 3905;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 3906;BA.debugLine="Coords = lstCoords.Get(i)";
_coords = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 3907;BA.debugLine="DrawPoint(Coords(0), Coords(1), ID.PointColor";
_drawpoint(_coords[(int) (0)],_coords[(int) (1)],_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }
};
 };
 //BA.debugLineNum = 3911;BA.debugLine="If Scale(sY(l)).MinVal< 0 And Scale(sY(l)).MaxV";
if (_scale[_sy[_l]].MinVal /*double*/ <0 && _scale[_sy[_l]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 3912;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY(l)).";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[_l]].MinVal /*double*/ *_scale[_sy[_l]].Scale /*double*/ );
 //BA.debugLineNum = 3913;BA.debugLine="If Scale(sY(l)).YZeroAxisHighlight = True Then";
if (_scale[_sy[_l]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3914;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_id.Color /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 3916;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_id.Color /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 }
};
 //BA.debugLineNum = 3922;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Zoom.NbVisi";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _zoom.NbVisiblePoints /*int*/ >0) { 
 //BA.debugLineNum = 3923;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 3926;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 3927;BA.debugLine="End Sub";
return "";
}
public String  _drawlinesv() throws Exception{
int _i = 0;
int _ip = 0;
int _l = 0;
double _smax = 0;
double _smin = 0;
double _smean = 0;
b4a.example.xchart._itemdata _id = null;
anywheresoftware.b4a.objects.collections.List _lstcoords = null;
b4a.example.xchart._pointdata _pd = null;
int[] _coords = null;
int[] _coords0 = null;
int[] _coords1 = null;
int _myaxis0 = 0;
 //BA.debugLineNum = 3698;BA.debugLine="Private Sub DrawLinesV";
 //BA.debugLineNum = 3699;BA.debugLine="Private i, ip, l As Int";
_i = 0;
_ip = 0;
_l = 0;
 //BA.debugLineNum = 3701;BA.debugLine="If Items.Size = 1 And (MinMaxMeanValues(0) <> 0 O";
if (_items.getSize()==1 && (_minmaxmeanvalues[(int) (0)]!=0 || _minmaxmeanvalues[(int) (1)]!=0)) { 
 //BA.debugLineNum = 3702;BA.debugLine="Private sMax, sMin, sMean As Double";
_smax = 0;
_smin = 0;
_smean = 0;
 //BA.debugLineNum = 3703;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3704;BA.debugLine="sMin = Graph.Bottom - (MinMaxMeanValues(0) - Sc";
_smin = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3705;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMin, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smin),(float) (_graph.Right /*int*/ ),(float) (_smin),_graph.MinLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3707;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3708;BA.debugLine="sMax = Graph.Bottom - (MinMaxMeanValues(1) - Sc";
_smax = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3709;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMax, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smax),(float) (_graph.Right /*int*/ ),(float) (_smax),_graph.MaxLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3711;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3712;BA.debugLine="sMean = Graph.Bottom - (MinMaxMeanValues(2) - S";
_smean = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (2)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 3713;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMean, Graph.Rig";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smean),(float) (_graph.Right /*int*/ ),(float) (_smean),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 //BA.debugLineNum = 3717;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit17 ;_l = _l + step17 ) {
 //BA.debugLineNum = 3718;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 3719;BA.debugLine="Private lstCoords As List";
_lstcoords = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3721;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 3722;BA.debugLine="If ID.HideLine = False Then";
if (_id.HideLine /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3723;BA.debugLine="lstCoords.Initialize";
_lstcoords.Initialize();
 //BA.debugLineNum = 3724;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step23 = 1;
final int limit23 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 3725;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3727;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3728;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3729;BA.debugLine="If PD.YArray(l) <> mMissingDataValue Then";
if (_pd.YArray /*double[]*/ [_l]!=_mmissingdatavalue) { 
 //BA.debugLineNum = 3730;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 3731;BA.debugLine="Coords(0) = Graph.Left + ip * Scale(sX).Scale";
_coords[(int) (0)] = (int) (_graph.Left /*int*/ +_ip*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 3732;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3733;BA.debugLine="Coords(1) = Graph.Bottom - (PD.YArray(l) - S";
_coords[(int) (1)] = (int) (_graph.Bottom /*int*/ -(_pd.YArray /*double[]*/ [_l]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 3735;BA.debugLine="Coords(1) = Graph.Top + (PD.YArray(l) - Scal";
_coords[(int) (1)] = (int) (_graph.Top /*int*/ +(_pd.YArray /*double[]*/ [_l]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 3737;BA.debugLine="lstCoords.Add(Coords)";
_lstcoords.Add((Object)(_coords));
 };
 }
};
 //BA.debugLineNum = 3741;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing out";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 3743;BA.debugLine="For i = 1 To lstCoords.Size - 1";
{
final int step39 = 1;
final int limit39 = (int) (_lstcoords.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
 //BA.debugLineNum = 3744;BA.debugLine="Private Coords0(2), Coords1(2) As Int";
_coords0 = new int[(int) (2)];
;
_coords1 = new int[(int) (2)];
;
 //BA.debugLineNum = 3745;BA.debugLine="Coords0 = lstCoords.Get(i - 1)";
_coords0 = (int[])(_lstcoords.Get((int) (_i-1)));
 //BA.debugLineNum = 3746;BA.debugLine="Coords1 = lstCoords.Get(i)";
_coords1 = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 3747;BA.debugLine="xcvsGraph.DrawLine(Coords0(0), Coords0(1), Coo";
_xcvsgraph.DrawLine((float) (_coords0[(int) (0)]),(float) (_coords0[(int) (1)]),(float) (_coords1[(int) (0)]),(float) (_coords1[(int) (1)]),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 }
};
 //BA.debugLineNum = 3749;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 3751;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 3752;BA.debugLine="For i = 0 To lstCoords.Size - 1";
{
final int step47 = 1;
final int limit47 = (int) (_lstcoords.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit47 ;_i = _i + step47 ) {
 //BA.debugLineNum = 3753;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 3754;BA.debugLine="Coords = lstCoords.Get(i)";
_coords = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 3755;BA.debugLine="DrawPoint(Coords(0), Coords(1), ID.PointColor";
_drawpoint(_coords[(int) (0)],_coords[(int) (1)],_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }
};
 };
 };
 }
};
 //BA.debugLineNum = 3761;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 3762;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY(0)).Mi";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 3763;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3764;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 3766;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 3770;BA.debugLine="If HLines.Size > 0 And Scale(sY(0)).Different = F";
if (_hlines.getSize()>0 && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3771;BA.debugLine="DrawHorizontalLinesValue";
_drawhorizontallinesvalue();
 };
 //BA.debugLineNum = 3774;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Zoom.NbVisi";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _zoom.NbVisiblePoints /*int*/ >0) { 
 //BA.debugLineNum = 3775;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 3778;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 3779;BA.debugLine="End Sub";
return "";
}
public String  _drawpies() throws Exception{
float _total = 0f;
b4a.example.xchart._itemdata _item = null;
float _xy = 0f;
int _titleheight = 0;
int _deltaheight = 0;
float _radiustext = 0f;
float _startangle = 0f;
float _totalangle = 0f;
float _midangle = 0f;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rectcircle = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _mpath = null;
float _angle = 0f;
b4a.example.bitmapcreator._argbcolor _argb = null;
b4a.example.bitmapcreator _bmpcreate = null;
int _acol = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rb = null;
b4a.example.bitmapcreator _bc1 = null;
float _percentage = 0f;
int _x = 0;
int _y = 0;
String _txt = "";
 //BA.debugLineNum = 6527;BA.debugLine="Private Sub DrawPies";
 //BA.debugLineNum = 6528;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6530;BA.debugLine="Dim Total As Float";
_total = 0f;
 //BA.debugLineNum = 6531;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = (b4a.example.xchart._itemdata)(group3.Get(index3));
 //BA.debugLineNum = 6532;BA.debugLine="Total = Total + Item.Value";
_total = (float) (_total+_item.Value /*float*/ );
 }
};
 //BA.debugLineNum = 6535;BA.debugLine="Private xy As Float";
_xy = 0f;
 //BA.debugLineNum = 6536;BA.debugLine="Private TitleHeight = 0 As Int";
_titleheight = (int) (0);
 //BA.debugLineNum = 6537;BA.debugLine="Private DeltaHeight = 0 As Int";
_deltaheight = (int) (0);
 //BA.debugLineNum = 6539;BA.debugLine="If Graph.Title <> \"\" And Graph.Subtitle <> \"\" The";
if ((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6540;BA.debugLine="TitleHeight = 1.7 * Texts.TitleTextHeight";
_titleheight = (int) (1.7*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 6541;BA.debugLine="If (Texts.TitleTextWidth + Texts.SubtitleTextWid";
if ((_texts.TitleTextWidth /*int*/ +_texts.SubtitleTextWidth /*int*/ +__c.DipToCurrent((int) (40)))<_xpnlgraph.getWidth()) { 
 }else {
 //BA.debugLineNum = 6543;BA.debugLine="DeltaHeight = 1.5 * Texts.SubtitleTextHeight";
_deltaheight = (int) (1.5*_texts.SubtitleTextHeight /*int*/ );
 };
 }else if((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("")) { 
 //BA.debugLineNum = 6546;BA.debugLine="TitleHeight = 1.7 * Texts.TitleTextHeight";
_titleheight = (int) (1.7*_texts.TitleTextHeight /*int*/ );
 }else if((_graph.Title /*String*/ ).equals("") && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6548;BA.debugLine="TitleHeight = 1.7 * Texts.SubTitleTextHeight";
_titleheight = (int) (1.7*_texts.SubtitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 6550;BA.debugLine="Graph.Radius = Min(xpnlGraph.Width, (Graph.Height";
_graph.Radius /*float*/  = (float) (__c.Min(_xpnlgraph.getWidth(),(_graph.Height /*int*/ -_titleheight-_deltaheight))/(double)2-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 6552;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" Then";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 6553;BA.debugLine="If xpnlGraph.Width > xpnlGraph.Height Then";
if (_xpnlgraph.getWidth()>_xpnlgraph.getHeight()) { 
 //BA.debugLineNum = 6554;BA.debugLine="Graph.CenterX = Graph.Radius + 10dip";
_graph.CenterX /*int*/  = (int) (_graph.Radius /*float*/ +__c.DipToCurrent((int) (10)));
 }else {
 //BA.debugLineNum = 6556;BA.debugLine="Graph.CenterX = xpnlGraph.Width / 2";
_graph.CenterX /*int*/  = (int) (_xpnlgraph.getWidth()/(double)2);
 };
 }else {
 //BA.debugLineNum = 6559;BA.debugLine="Graph.CenterX = xpnlGraph.Width / 2";
_graph.CenterX /*int*/  = (int) (_xpnlgraph.getWidth()/(double)2);
 };
 //BA.debugLineNum = 6561;BA.debugLine="Graph.CenterY = Graph.Height - Graph.Radius - 10d";
_graph.CenterY /*int*/  = (int) (_graph.Height /*int*/ -_graph.Radius /*float*/ -__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 6563;BA.debugLine="If Graph.Title <> \"\" And Graph.Subtitle <> \"\" The";
if ((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6564;BA.debugLine="If DeltaHeight = 0 Then";
if (_deltaheight==0) { 
 //BA.debugLineNum = 6565;BA.debugLine="xy = (xpnlGraph.Width - Texts.TitleTextWidth -";
_xy = (float) ((_xpnlgraph.getWidth()-_texts.TitleTextWidth /*int*/ -_texts.SubtitleTextWidth /*int*/ -__c.DipToCurrent((int) (10)))/(double)2);
 //BA.debugLineNum = 6566;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xy, 1.3 * Texts";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,_xy,(float) (1.3*_texts.TitleTextHeight /*int*/ ),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 6567;BA.debugLine="xy = xy + Texts.TitleTextWidth + 20dip";
_xy = (float) (_xy+_texts.TitleTextWidth /*int*/ +__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 6568;BA.debugLine="xcvsGraph.DrawText(Graph.SubTitle, xy, 1.3 * Te";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,_xy,(float) (1.3*_texts.TitleTextHeight /*int*/ ),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 }else {
 //BA.debugLineNum = 6570;BA.debugLine="xy = 1.3 * Texts.TitleTextHeight";
_xy = (float) (1.3*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 6571;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xpnlGraph.Width";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),_xy,_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 6572;BA.debugLine="xy = xy + 1.3 * Texts.SubTitleTextHeight";
_xy = (float) (_xy+1.3*_texts.SubtitleTextHeight /*int*/ );
 //BA.debugLineNum = 6573;BA.debugLine="xcvsGraph.DrawText(Graph.SubTitle, xpnlGraph.Wi";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),_xy,_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 }else if((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("")) { 
 //BA.debugLineNum = 6576;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xpnlGraph.Width";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),(float) (1.3*_texts.TitleTextHeight /*int*/ ),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }else if((_graph.Title /*String*/ ).equals("") && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6578;BA.debugLine="xcvsGraph.DrawText(Graph.SubTitle, xpnlGraph.Wid";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),(float) (1.3*_texts.SubtitleTextHeight /*int*/ ),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 6581;BA.debugLine="Private RadiusText As Float = Graph.Radius * 0.7";
_radiustext = (float) (_graph.Radius /*float*/ *0.7);
 //BA.debugLineNum = 6582;BA.debugLine="Private StartAngle, TotalAngle, MidAngle As Float";
_startangle = 0f;
_totalangle = 0f;
_midangle = 0f;
 //BA.debugLineNum = 6583;BA.debugLine="TotalAngle = 360 - Graph.PieGapDegrees * Items.Si";
_totalangle = (float) (360-_graph.PieGapDegrees /*int*/ *_items.getSize());
 //BA.debugLineNum = 6584;BA.debugLine="Private rectCircle As B4XRect";
_rectcircle = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6585;BA.debugLine="rectCircle.Initialize(Graph.CenterX - Graph.Radiu";
_rectcircle.Initialize((float) (_graph.CenterX /*int*/ -_graph.Radius /*float*/ ),(float) (_graph.CenterY /*int*/ -_graph.Radius /*float*/ ),(float) (_graph.CenterX /*int*/ +_graph.Radius /*float*/ ),(float) (_graph.CenterY /*int*/ +_graph.Radius /*float*/ ));
 //BA.debugLineNum = 6587;BA.debugLine="StartAngle = Graph.PieStartAngle";
_startangle = (float) (_graph.PieStartAngle /*int*/ );
 //BA.debugLineNum = 6588;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group54 = _items;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_item = (b4a.example.xchart._itemdata)(group54.Get(index54));
 //BA.debugLineNum = 6589;BA.debugLine="Private mPath As B4XPath";
_mpath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 6590;BA.debugLine="Private Angle As Float = Item.Value / Total * To";
_angle = (float) (_item.Value /*float*/ /(double)_total*_totalangle);
 //BA.debugLineNum = 6591;BA.debugLine="If Angle = TotalAngle Then";
if (_angle==_totalangle) { 
 //BA.debugLineNum = 6592;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 6593;BA.debugLine="xcvsGraph.DrawCircle(Graph.CenterX, Graph.Cent";
_xcvsgraph.DrawCircle((float) (_graph.CenterX /*int*/ ),(float) (_graph.CenterY /*int*/ ),_graph.Radius /*float*/ ,_item.Color /*int*/ ,__c.True,(float) (0));
 }else {
 };
 }else {
 //BA.debugLineNum = 6597;BA.debugLine="Private ARGB As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 6598;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 6599;BA.debugLine="Private Acol As Int";
_acol = 0;
 //BA.debugLineNum = 6600;BA.debugLine="BmpCreate.Initialize(10, 10)";
_bmpcreate._initialize(ba,(int) (10),(int) (10));
 //BA.debugLineNum = 6601;BA.debugLine="BmpCreate.ColorToARGB(Item.Color, ARGB)";
_bmpcreate._colortoargb(_item.Color /*int*/ ,_argb);
 //BA.debugLineNum = 6602;BA.debugLine="Acol = xui.Color_ARGB(Graph.GradientColorsAlpha";
_acol = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 6604;BA.debugLine="mPath.InitializeArc(Graph.CenterX, Graph.Center";
_mpath.InitializeArc((float) (_graph.CenterX /*int*/ ),(float) (_graph.CenterY /*int*/ ),_graph.Radius /*float*/ ,_startangle,_angle);
 //BA.debugLineNum = 6605;BA.debugLine="StartAngle = StartAngle + Angle + Graph.PieGapD";
_startangle = (float) (_startangle+_angle+_graph.PieGapDegrees /*int*/ );
 //BA.debugLineNum = 6606;BA.debugLine="xcvsGraph.ClipPath(mPath)";
_xcvsgraph.ClipPath(_mpath);
 //BA.debugLineNum = 6607;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 6608;BA.debugLine="xcvsGraph.DrawCircle(Graph.CenterX, Graph.Cent";
_xcvsgraph.DrawCircle((float) (_graph.CenterX /*int*/ ),(float) (_graph.CenterY /*int*/ ),_graph.Radius /*float*/ ,_item.Color /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 6610;BA.debugLine="Private rb As B4XRect";
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6611;BA.debugLine="rb.Initialize(0, 0, 2 * Graph.Radius, 2 * Grap";
_rb.Initialize((float) (0),(float) (0),(float) (2*_graph.Radius /*float*/ ),(float) (2*_graph.Radius /*float*/ ));
 //BA.debugLineNum = 6612;BA.debugLine="Private bc1 As BitmapCreator";
_bc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 6613;BA.debugLine="bc1.Initialize(2 * Graph.Radius, 2 * Graph.Rad";
_bc1._initialize(ba,(int) (2*_graph.Radius /*float*/ ),(int) (2*_graph.Radius /*float*/ ));
 //BA.debugLineNum = 6614;BA.debugLine="bc1.FillRadialGradient(Array As Int(Acol, Item";
_bc1._fillradialgradient(new int[]{_acol,_item.Color /*int*/ },_rb);
 //BA.debugLineNum = 6615;BA.debugLine="xcvsGraph.DrawBitmap(bc1.Bitmap, rectCircle)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bc1._getbitmap().getObject()),_rectcircle);
 };
 //BA.debugLineNum = 6617;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 };
 }
};
 //BA.debugLineNum = 6621;BA.debugLine="If Graph.PieAddPercentage Then";
if (_graph.PieAddPercentage /*boolean*/ ) { 
 //BA.debugLineNum = 6622;BA.debugLine="Private Percentage As Float";
_percentage = 0f;
 //BA.debugLineNum = 6624;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group87 = _items;
final int groupLen87 = group87.getSize()
;int index87 = 0;
;
for (; index87 < groupLen87;index87++){
_item = (b4a.example.xchart._itemdata)(group87.Get(index87));
 //BA.debugLineNum = 6625;BA.debugLine="Private mPath As B4XPath";
_mpath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 6626;BA.debugLine="Private Angle As Float = Item.Value / Total * T";
_angle = (float) (_item.Value /*float*/ /(double)_total*_totalangle);
 //BA.debugLineNum = 6627;BA.debugLine="If Angle = TotalAngle Then";
if (_angle==_totalangle) { 
 //BA.debugLineNum = 6628;BA.debugLine="xcvsGraph.DrawCircle(Graph.CenterX, Graph.Cent";
_xcvsgraph.DrawCircle((float) (_graph.CenterX /*int*/ ),(float) (_graph.CenterY /*int*/ ),_graph.Radius /*float*/ ,_item.Color /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 6630;BA.debugLine="StartAngle = StartAngle + Angle + Graph.PieGap";
_startangle = (float) (_startangle+_angle+_graph.PieGapDegrees /*int*/ );
 //BA.debugLineNum = 6631;BA.debugLine="Private x, y As Int";
_x = 0;
_y = 0;
 //BA.debugLineNum = 6632;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 6633;BA.debugLine="MidAngle = StartAngle - Angle /2 - Graph.PieGa";
_midangle = (float) (_startangle-_angle/(double)2-_graph.PieGapDegrees /*int*/ );
 //BA.debugLineNum = 6634;BA.debugLine="x = Graph.CenterX + RadiusText * CosD(MidAngle";
_x = (int) (_graph.CenterX /*int*/ +_radiustext*__c.CosD(_midangle));
 //BA.debugLineNum = 6635;BA.debugLine="y = Graph.CenterY + RadiusText * SinD(MidAngle";
_y = (int) (_graph.CenterY /*int*/ +_radiustext*__c.SinD(_midangle)+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 6636;BA.debugLine="Percentage = Item.Value / Total * 100";
_percentage = (float) (_item.Value /*float*/ /(double)_total*100);
 //BA.debugLineNum = 6637;BA.debugLine="txt = NumberFormat2(Percentage, 1, mPiePercent";
_txt = __c.NumberFormat2(_percentage,(int) (1),_mpiepercentagenbfractions,_mpiepercentagenbfractions,__c.False)+" %";
 //BA.debugLineNum = 6638;BA.debugLine="xcvsGraph.DrawText(txt, x, y, Texts.AxisFont,";
_xcvsgraph.DrawText(ba,_txt,(float) (_x),(float) (_y),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_getcontrastcolor(_item.Color /*int*/ ),BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 }
};
 };
 //BA.debugLineNum = 6643;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _items.getSize()>0) { 
 //BA.debugLineNum = 6644;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 6647;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 6648;BA.debugLine="End Sub";
return "";
}
public String  _drawpoint(int _x,int _y,int _color,String _pointtype,boolean _filled,int _strokewidth) throws Exception{
int _dx = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _tripath = null;
 //BA.debugLineNum = 4223;BA.debugLine="Private Sub DrawPoint(X As Int, Y As Int, Color As";
 //BA.debugLineNum = 4224;BA.debugLine="Private dx As Int";
_dx = 0;
 //BA.debugLineNum = 4226;BA.debugLine="If x < Graph.Left Or x > Graph.Right Or Y < Graph";
if (_x<_graph.Left /*int*/  || _x>_graph.Right /*int*/  || _y<_graph.Top /*int*/  || _y>_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 4227;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4230;BA.debugLine="dx = Max(4dip, 1.4 * StrokeWidth)";
_dx = (int) (__c.Max(__c.DipToCurrent((int) (4)),1.4*_strokewidth));
 //BA.debugLineNum = 4231;BA.debugLine="Select PointType";
switch (BA.switchObjectToInt(_pointtype,"CIRCLE","SQUARE","TRIANGLE","RHOMBUS","CROSS+","CROSSX","CROSSx")) {
case 0: {
 //BA.debugLineNum = 4233;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 4234;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Graph.ChartBack";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4235;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Color, Filled,";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_color,_filled,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4237;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Color, True, 2d";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_color,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4238;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Color, False, 2";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_color,__c.False,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 1: {
 //BA.debugLineNum = 4241;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4242;BA.debugLine="r.Initialize(X - dx, Y - dx, X + dx, Y + dx)";
_r.Initialize((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx));
 //BA.debugLineNum = 4243;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 4244;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4245;BA.debugLine="xcvsGraph.DrawRect(r, Color, Filled, 2dip)";
_xcvsgraph.DrawRect(_r,_color,_filled,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4247;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 2dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4248;BA.debugLine="xcvsGraph.DrawRect(r, Color, False, 2dip)";
_xcvsgraph.DrawRect(_r,_color,__c.False,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 2: {
 //BA.debugLineNum = 4251;BA.debugLine="Private triPath As B4XPath";
_tripath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 4252;BA.debugLine="triPath.Initialize(X - dx, Y + 0.8 * dx)";
_tripath.Initialize((float) (_x-_dx),(float) (_y+0.8*_dx));
 //BA.debugLineNum = 4253;BA.debugLine="triPath.LineTo(X, Y - 1.2 * dx)";
_tripath.LineTo((float) (_x),(float) (_y-1.2*_dx));
 //BA.debugLineNum = 4254;BA.debugLine="triPath.LineTo(X + dx, Y + 0.8 * dx)";
_tripath.LineTo((float) (_x+_dx),(float) (_y+0.8*_dx));
 //BA.debugLineNum = 4255;BA.debugLine="triPath.LineTo(X - dx, Y + 0.8 * dx)";
_tripath.LineTo((float) (_x-_dx),(float) (_y+0.8*_dx));
 //BA.debugLineNum = 4256;BA.debugLine="xcvsGraph.ClipPath(triPath)";
_xcvsgraph.ClipPath(_tripath);
 //BA.debugLineNum = 4257;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4258;BA.debugLine="r.Initialize(X - dx, Y - dx, X + dx, Y + dx)";
_r.Initialize((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx));
 //BA.debugLineNum = 4260;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 4261;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4262;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4263;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X, Y - dx,";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4264;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y + dx,";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4265;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X + dx, Y +";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4267;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 1dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4268;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4269;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X, Y - dx,";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4270;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y + dx,";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4271;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X + dx, Y +";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 3: {
 //BA.debugLineNum = 4274;BA.debugLine="Private triPath As B4XPath";
_tripath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 4275;BA.debugLine="triPath.Initialize(X - dx, Y)";
_tripath.Initialize((float) (_x-_dx),(float) (_y));
 //BA.debugLineNum = 4276;BA.debugLine="triPath.LineTo(X, Y -  dx)";
_tripath.LineTo((float) (_x),(float) (_y-_dx));
 //BA.debugLineNum = 4277;BA.debugLine="triPath.LineTo(X + dx, Y)";
_tripath.LineTo((float) (_x+_dx),(float) (_y));
 //BA.debugLineNum = 4278;BA.debugLine="triPath.LineTo(X, Y + dx)";
_tripath.LineTo((float) (_x),(float) (_y+_dx));
 //BA.debugLineNum = 4279;BA.debugLine="triPath.LineTo(X - dx, Y)";
_tripath.LineTo((float) (_x-_dx),(float) (_y));
 //BA.debugLineNum = 4280;BA.debugLine="xcvsGraph.ClipPath(triPath)";
_xcvsgraph.ClipPath(_tripath);
 //BA.debugLineNum = 4281;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 4282;BA.debugLine="r.Initialize(X - dx, Y - dx, X + dx, Y + dx)";
_r.Initialize((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx));
 //BA.debugLineNum = 4284;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 4285;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4286;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4287;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y, X, Y - dx, Color";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4288;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4289;BA.debugLine="xcvsGraph.DrawLine(X + dx, Y, X, Y + dx, Color";
_xcvsgraph.DrawLine((float) (_x+_dx),(float) (_y),(float) (_x),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4290;BA.debugLine="xcvsGraph.DrawLine(X, Y + dx, X - dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y+_dx),(float) (_x-_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4292;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 1dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4293;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4294;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y, X, Y - dx, Color";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4295;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4296;BA.debugLine="xcvsGraph.DrawLine(X + dx, Y, X, Y + dx, Color";
_xcvsgraph.DrawLine((float) (_x+_dx),(float) (_y),(float) (_x),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4297;BA.debugLine="xcvsGraph.DrawLine(X, Y + dx, X - dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y+_dx),(float) (_x-_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 4: {
 //BA.debugLineNum = 4300;BA.debugLine="dx = dx + 1dip";
_dx = (int) (_dx+__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 4301;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X, Y + dx, Color,";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4302;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y, X + dx, Y, Color,";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y),(float) (_x+_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 break; }
case 5: 
case 6: {
 //BA.debugLineNum = 4304;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X + dx, Y -";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x+_dx),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4305;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y - dx, X + dx, Y +";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 4307;BA.debugLine="End Sub";
return "";
}
public String  _drawradar() throws Exception{
int _i = 0;
int _j = 0;
int _x0 = 0;
int _x1 = 0;
int _xt = 0;
int _y0 = 0;
int _y1 = 0;
int _dy = 0;
int _dy0 = 0;
int[] _cols = null;
int[] _acols = null;
String[] _names = null;
double _angledelta = 0;
float _widthlabel = 0f;
float _xy = 0f;
int _titleheight = 0;
int _deltaheight = 0;
b4a.example.xchart._pointdata _pd = null;
int _rr = 0;
double _dr = 0;
String _align = "";
double _radarscale = 0;
b4a.example.xchart._itemdata _id = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _pth = null;
String _txt = "";
float _dy1 = 0f;
int _step1 = 0;
 //BA.debugLineNum = 6651;BA.debugLine="Private Sub DrawRadar";
 //BA.debugLineNum = 6652;BA.debugLine="Private i, j, x0, x1, xt, y0, y1, dy, dy0 As Int";
_i = 0;
_j = 0;
_x0 = 0;
_x1 = 0;
_xt = 0;
_y0 = 0;
_y1 = 0;
_dy = 0;
_dy0 = 0;
 //BA.debugLineNum = 6653;BA.debugLine="Private Cols(Items.Size), ACols(Items.Size) As In";
_cols = new int[_items.getSize()];
;
_acols = new int[_items.getSize()];
;
 //BA.debugLineNum = 6654;BA.debugLine="Private Names(Items.Size) As String";
_names = new String[_items.getSize()];
java.util.Arrays.fill(_names,"");
 //BA.debugLineNum = 6655;BA.debugLine="Private AngleDelta As Double";
_angledelta = 0;
 //BA.debugLineNum = 6657;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6659;BA.debugLine="Private WidthLabel, xy As Float";
_widthlabel = 0f;
_xy = 0f;
 //BA.debugLineNum = 6660;BA.debugLine="Private TitleHeight = 0 As Int";
_titleheight = (int) (0);
 //BA.debugLineNum = 6661;BA.debugLine="Private DeltaHeight = 0 As Int";
_deltaheight = (int) (0);
 //BA.debugLineNum = 6663;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6664;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step10 = 1;
final int limit10 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 6665;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6666;BA.debugLine="WidthLabel = Max(WidthLabel, MeasureTextWidth(PD";
_widthlabel = (float) (__c.Max(_widthlabel,_measuretextwidth(_pd.X /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 //BA.debugLineNum = 6669;BA.debugLine="If Graph.Title <> \"\" And Graph.Subtitle <> \"\" The";
if ((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6670;BA.debugLine="TitleHeight = 2 * Texts.TitleTextHeight";
_titleheight = (int) (2*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 6671;BA.debugLine="If (Texts.TitleTextWidth + Texts.SubtitleTextWid";
if ((_texts.TitleTextWidth /*int*/ +_texts.SubtitleTextWidth /*int*/ +__c.DipToCurrent((int) (40)))<_xpnlgraph.getWidth()) { 
 }else {
 //BA.debugLineNum = 6673;BA.debugLine="DeltaHeight = 1 * Texts.SubtitleTextHeight";
_deltaheight = (int) (1*_texts.SubtitleTextHeight /*int*/ );
 };
 }else if((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("")) { 
 //BA.debugLineNum = 6676;BA.debugLine="TitleHeight = 2 * Texts.TitleTextHeight";
_titleheight = (int) (2*_texts.TitleTextHeight /*int*/ );
 }else if((_graph.Title /*String*/ ).equals("") && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6678;BA.debugLine="TitleHeight = 2 * Texts.SubTitleTextHeight";
_titleheight = (int) (2*_texts.SubtitleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 6680;BA.debugLine="TitleHeight = 2.2 * Texts.ScaleTextHeight";
_titleheight = (int) (2.2*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 6682;BA.debugLine="Graph.Radius = Min((Graph.Width - 2 * (WidthLabel";
_graph.Radius /*float*/  = (float) (__c.Min((_graph.Width /*int*/ -2*(_widthlabel+_graph.Left /*int*/ )),_graph.Height /*int*/ -_titleheight-_deltaheight)/(double)2);
 //BA.debugLineNum = 6683;BA.debugLine="xpnlValues.Top = Graph.Top";
_xpnlvalues.setTop(_graph.Top /*int*/ );
 //BA.debugLineNum = 6685;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" Then";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 6686;BA.debugLine="If Graph.Width > Graph.Height Then";
if (_graph.Width /*int*/ >_graph.Height /*int*/ ) { 
 //BA.debugLineNum = 6687;BA.debugLine="Graph.CenterX = Graph.Radius + Texts.ScaleTextH";
_graph.CenterX /*int*/  = (int) (_graph.Radius /*float*/ +_texts.ScaleTextHeight /*int*/ +_widthlabel);
 //BA.debugLineNum = 6688;BA.debugLine="Graph.Right = Graph.CenterX + Graph.Radius + Te";
_graph.Right /*int*/  = (int) (_graph.CenterX /*int*/ +_graph.Radius /*float*/ +_texts.ScaleTextHeight /*int*/ +_widthlabel);
 }else {
 //BA.debugLineNum = 6690;BA.debugLine="Graph.CenterX = xpnlGraph.Width / 2";
_graph.CenterX /*int*/  = (int) (_xpnlgraph.getWidth()/(double)2);
 //BA.debugLineNum = 6691;BA.debugLine="Graph.Right = xpnlGraph.Width";
_graph.Right /*int*/  = _xpnlgraph.getWidth();
 };
 }else {
 //BA.debugLineNum = 6694;BA.debugLine="Graph.CenterX = xpnlGraph.Width / 2";
_graph.CenterX /*int*/  = (int) (_xpnlgraph.getWidth()/(double)2);
 //BA.debugLineNum = 6695;BA.debugLine="Graph.Right = xpnlGraph.Width";
_graph.Right /*int*/  = _xpnlgraph.getWidth();
 };
 //BA.debugLineNum = 6698;BA.debugLine="Graph.CenterY = (Graph.Top + TitleHeight + DeltaH";
_graph.CenterY /*int*/  = (int) ((_graph.Top /*int*/ +_titleheight+_deltaheight+_texts.ScaleTextHeight /*int*/ +_graph.Height /*int*/ -_texts.ScaleTextHeight /*int*/ )/(double)2);
 //BA.debugLineNum = 6701;BA.debugLine="If Graph.Title <> \"\" And Graph.Subtitle <> \"\" The";
if ((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6702;BA.debugLine="If DeltaHeight = 0 Then";
if (_deltaheight==0) { 
 //BA.debugLineNum = 6703;BA.debugLine="xy = (xpnlGraph.Width - Texts.TitleTextWidth -";
_xy = (float) ((_xpnlgraph.getWidth()-_texts.TitleTextWidth /*int*/ -_texts.SubtitleTextWidth /*int*/ -__c.DipToCurrent((int) (10)))/(double)2);
 //BA.debugLineNum = 6704;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xy, 1.3 * Texts";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,_xy,(float) (1.3*_texts.TitleTextHeight /*int*/ ),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 6705;BA.debugLine="xy = xy + Texts.TitleTextWidth + 20dip";
_xy = (float) (_xy+_texts.TitleTextWidth /*int*/ +__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 6706;BA.debugLine="xcvsGraph.DrawText(Graph.SubTitle, xy, 1.3 * Te";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,_xy,(float) (1.3*_texts.TitleTextHeight /*int*/ ),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 }else {
 //BA.debugLineNum = 6708;BA.debugLine="xy = 1.3 * Texts.TitleTextHeight";
_xy = (float) (1.3*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 6709;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xpnlGraph.Width";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),_xy,_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 6710;BA.debugLine="xy = xy + 1.3 * Texts.SubTitleTextHeight";
_xy = (float) (_xy+1.3*_texts.SubtitleTextHeight /*int*/ );
 //BA.debugLineNum = 6711;BA.debugLine="xcvsGraph.DrawText(Graph.SubTitle, xpnlGraph.Wi";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),_xy,_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 }else if((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("")) { 
 //BA.debugLineNum = 6714;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xpnlGraph.Width";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),(float) (1.3*_texts.TitleTextHeight /*int*/ ),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }else if((_graph.Title /*String*/ ).equals("") && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 6716;BA.debugLine="xcvsGraph.DrawText(Graph.SubTitle, xpnlGraph.Wid";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,(float) (_xpnlgraph.getWidth()/(double)2),(float) (1.3*_texts.SubtitleTextHeight /*int*/ ),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 6719;BA.debugLine="AngleDelta = 360 / Zoom.NbVisiblePoints";
_angledelta = 360/(double)_zoom.NbVisiblePoints /*int*/ ;
 //BA.debugLineNum = 6722;BA.debugLine="If Graph.RadarDrawScale = True Then";
if (_graph.RadarDrawScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 6723;BA.debugLine="Private rr As Int";
_rr = 0;
 //BA.debugLineNum = 6724;BA.debugLine="Private dr As Double";
_dr = 0;
 //BA.debugLineNum = 6725;BA.debugLine="dr = Graph.Radius / Scale(sY(0)).NbIntervals";
_dr = _graph.Radius /*float*/ /(double)_scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
 //BA.debugLineNum = 6726;BA.debugLine="Select Graph.RadarScaleType";
switch (BA.switchObjectToInt(_graph.RadarScaleType /*String*/ ,"SPIDER","CIRCLE")) {
case 0: {
 //BA.debugLineNum = 6728;BA.debugLine="For i = 1 To Scale(sY(0)).NbIntervals";
{
final int step66 = 1;
final int limit66 = _scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit66 ;_i = _i + step66 ) {
 //BA.debugLineNum = 6729;BA.debugLine="rr = i * dr";
_rr = (int) (_i*_dr);
 //BA.debugLineNum = 6730;BA.debugLine="x0 = Graph.CenterX + rr * CosD(Graph.RadarSta";
_x0 = (int) (_graph.CenterX /*int*/ +_rr*__c.CosD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6731;BA.debugLine="y0 = Graph.CenterY + rr * SinD(Graph.RadarSta";
_y0 = (int) (_graph.CenterY /*int*/ +_rr*__c.SinD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6732;BA.debugLine="For j = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step70 = 1;
final int limit70 = _zoom.EndIndex /*int*/ ;
_j = _zoom.BeginIndex /*int*/  ;
for (;_j <= limit70 ;_j = _j + step70 ) {
 //BA.debugLineNum = 6733;BA.debugLine="x1 = Graph.CenterX + rr * CosD(Graph.RadarSt";
_x1 = (int) (_graph.CenterX /*int*/ +_rr*__c.CosD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6734;BA.debugLine="y1 = Graph.CenterY + rr * SinD(Graph.RadarSt";
_y1 = (int) (_graph.CenterY /*int*/ +_rr*__c.SinD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6735;BA.debugLine="xcvsGraph.DrawLine(x0, y0, x1, y1, Graph.Gri";
_xcvsgraph.DrawLine((float) (_x0),(float) (_y0),(float) (_x1),(float) (_y1),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6736;BA.debugLine="x0 = x1";
_x0 = _x1;
 //BA.debugLineNum = 6737;BA.debugLine="y0 = y1";
_y0 = _y1;
 }
};
 //BA.debugLineNum = 6739;BA.debugLine="x1 = Graph.CenterX + rr * CosD(Graph.RadarSta";
_x1 = (int) (_graph.CenterX /*int*/ +_rr*__c.CosD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6740;BA.debugLine="y1 = Graph.CenterY + rr * SinD(Graph.RadarSta";
_y1 = (int) (_graph.CenterY /*int*/ +_rr*__c.SinD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6741;BA.debugLine="xcvsGraph.DrawLine(x0, y0, x1, y1, Graph.Grid";
_xcvsgraph.DrawLine((float) (_x0),(float) (_y0),(float) (_x1),(float) (_y1),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 }
};
 break; }
case 1: {
 //BA.debugLineNum = 6744;BA.debugLine="For i = 1 To Scale(sY(0)).NbIntervals";
{
final int step82 = 1;
final int limit82 = _scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit82 ;_i = _i + step82 ) {
 //BA.debugLineNum = 6745;BA.debugLine="rr = i * dr";
_rr = (int) (_i*_dr);
 //BA.debugLineNum = 6746;BA.debugLine="xcvsGraph.DrawCircle(Graph.CenterX, Graph.Cen";
_xcvsgraph.DrawCircle((float) (_graph.CenterX /*int*/ ),(float) (_graph.CenterY /*int*/ ),(float) (_rr),_graph.GridColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 }
};
 break; }
}
;
 };
 //BA.debugLineNum = 6752;BA.debugLine="Private Align As String";
_align = "";
 //BA.debugLineNum = 6753;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step89 = 1;
final int limit89 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit89 ;_i = _i + step89 ) {
 //BA.debugLineNum = 6754;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6755;BA.debugLine="x1 = Graph.CenterX + Graph.Radius * CosD(Graph.R";
_x1 = (int) (_graph.CenterX /*int*/ +_graph.Radius /*float*/ *__c.CosD(_graph.RadarStartAngle /*int*/ +_angledelta*_i));
 //BA.debugLineNum = 6756;BA.debugLine="y1 = Graph.CenterY + Graph.Radius * SinD(Graph.R";
_y1 = (int) (_graph.CenterY /*int*/ +_graph.Radius /*float*/ *__c.SinD(_graph.RadarStartAngle /*int*/ +_angledelta*_i));
 //BA.debugLineNum = 6757;BA.debugLine="xcvsGraph.DrawLine(Graph.CenterX, Graph.CenterY,";
_xcvsgraph.DrawLine((float) (_graph.CenterX /*int*/ ),(float) (_graph.CenterY /*int*/ ),(float) (_x1),(float) (_y1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6758;BA.debugLine="dy0 = Texts.ScaleTextHeight";
_dy0 = _texts.ScaleTextHeight /*int*/ ;
 //BA.debugLineNum = 6759;BA.debugLine="dy = 0.3 * Texts.ScaleTextHeight + dy0 * SinD(Gr";
_dy = (int) (0.3*_texts.ScaleTextHeight /*int*/ +_dy0*__c.SinD(_graph.RadarStartAngle /*int*/ +_angledelta*_i));
 //BA.debugLineNum = 6760;BA.debugLine="If Abs(x1 - Graph.CenterX) < 20dip Then";
if (__c.Abs(_x1-_graph.CenterX /*int*/ )<__c.DipToCurrent((int) (20))) { 
 //BA.debugLineNum = 6761;BA.debugLine="Align = \"CENTER\"";
_align = "CENTER";
 //BA.debugLineNum = 6762;BA.debugLine="xt = x1";
_xt = _x1;
 }else if(_x1>(_graph.CenterX /*int*/ +__c.DipToCurrent((int) (10)))) { 
 //BA.debugLineNum = 6764;BA.debugLine="Align = \"LEFT\"";
_align = "LEFT";
 //BA.debugLineNum = 6765;BA.debugLine="xt = x1 + 5dip";
_xt = (int) (_x1+__c.DipToCurrent((int) (5)));
 }else {
 //BA.debugLineNum = 6767;BA.debugLine="Align = \"RIGHT\"";
_align = "RIGHT";
 //BA.debugLineNum = 6768;BA.debugLine="xt = x1 - 5dip";
_xt = (int) (_x1-__c.DipToCurrent((int) (5)));
 };
 //BA.debugLineNum = 6770;BA.debugLine="xcvsGraph.DrawText(PD.X, xt, y1 + dy, Texts.Scal";
_xcvsgraph.DrawText(ba,_pd.X /*String*/ ,(float) (_xt),(float) (_y1+_dy),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,_align));
 }
};
 //BA.debugLineNum = 6774;BA.debugLine="Private RadarScale As Double";
_radarscale = 0;
 //BA.debugLineNum = 6775;BA.debugLine="RadarScale = Graph.Radius / (Scale(sY(0)).MaxVal";
_radarscale = _graph.Radius /*float*/ /(double)(_scale[_sy[(int) (0)]].MaxVal /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ );
 //BA.debugLineNum = 6777;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step110 = 1;
final int limit110 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit110 ;_i = _i + step110 ) {
 //BA.debugLineNum = 6778;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 6779;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6780;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 6781;BA.debugLine="Cols(i) = ID.Color";
_cols[_i] = _id.Color /*int*/ ;
 //BA.debugLineNum = 6783;BA.debugLine="ACols(i) = Cols(i) - Graph.AreaFillAlphaValue";
_acols[_i] = (int) (_cols[_i]-_graph.AreaFillAlphaValue /*int*/ );
 //BA.debugLineNum = 6784;BA.debugLine="Names(i) = ID.Name";
_names[_i] = _id.Name /*String*/ ;
 //BA.debugLineNum = 6785;BA.debugLine="If ID.Filled = True Then";
if (_id.Filled /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 6786;BA.debugLine="Private pth As B4XPath";
_pth = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 6787;BA.debugLine="For j = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step119 = 1;
final int limit119 = _zoom.EndIndex /*int*/ ;
_j = _zoom.BeginIndex /*int*/  ;
for (;_j <= limit119 ;_j = _j + step119 ) {
 //BA.debugLineNum = 6788;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6789;BA.debugLine="PD = Points.Get(j)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_j));
 //BA.debugLineNum = 6790;BA.debugLine="x0 = Graph.CenterX + (PD.YArray(i) - Scale(sY(";
_x0 = (int) (_graph.CenterX /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.CosD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6791;BA.debugLine="y0 = Graph.CenterY + (PD.YArray(i) - Scale(sY(";
_y0 = (int) (_graph.CenterY /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.SinD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6792;BA.debugLine="If j = 0 Then";
if (_j==0) { 
 //BA.debugLineNum = 6793;BA.debugLine="pth.Initialize(x0, y0)";
_pth.Initialize((float) (_x0),(float) (_y0));
 }else {
 //BA.debugLineNum = 6795;BA.debugLine="pth.LineTo(x0, y0)";
_pth.LineTo((float) (_x0),(float) (_y0));
 };
 }
};
 //BA.debugLineNum = 6798;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 6799;BA.debugLine="x0 = Graph.CenterX + (PD.YArray(i) - Scale(sY(0";
_x0 = (int) (_graph.CenterX /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.CosD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6800;BA.debugLine="y0 = Graph.CenterY + (PD.YArray(i) - Scale(sY(0";
_y0 = (int) (_graph.CenterY /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.SinD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6801;BA.debugLine="pth.LineTo(x0, y0)";
_pth.LineTo((float) (_x0),(float) (_y0));
 //BA.debugLineNum = 6803;BA.debugLine="xcvsGraph.DrawPath(pth, ACols(i), True, 1dip)";
_xcvsgraph.DrawPath(_pth,_acols[_i],__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 6806;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 6807;BA.debugLine="x0 = Graph.CenterX + (PD.YArray(i) - Scale(sY(0)";
_x0 = (int) (_graph.CenterX /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.CosD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6808;BA.debugLine="y0 = Graph.CenterY + (PD.YArray(i) - Scale(sY(0)";
_y0 = (int) (_graph.CenterY /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.SinD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6809;BA.debugLine="For j = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step139 = 1;
final int limit139 = _zoom.EndIndex /*int*/ ;
_j = _zoom.BeginIndex /*int*/  ;
for (;_j <= limit139 ;_j = _j + step139 ) {
 //BA.debugLineNum = 6810;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6811;BA.debugLine="PD = Points.Get(j)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_j));
 //BA.debugLineNum = 6812;BA.debugLine="x1 = Graph.CenterX + (PD.YArray(i) - Scale(sY(0";
_x1 = (int) (_graph.CenterX /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.CosD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6813;BA.debugLine="y1 = Graph.CenterY + (PD.YArray(i) - Scale(sY(0";
_y1 = (int) (_graph.CenterY /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.SinD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6814;BA.debugLine="xcvsGraph.DrawLine(x0, y0, x1, y1, Cols(i), ID.";
_xcvsgraph.DrawLine((float) (_x0),(float) (_y0),(float) (_x1),(float) (_y1),_cols[_i],(float) (_id.StrokeWidth /*int*/ ));
 //BA.debugLineNum = 6815;BA.debugLine="x0 = x1";
_x0 = _x1;
 //BA.debugLineNum = 6816;BA.debugLine="y0 = y1";
_y0 = _y1;
 }
};
 //BA.debugLineNum = 6818;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 6819;BA.debugLine="x1 = Graph.CenterX + (PD.YArray(i) - Scale(sY(0)";
_x1 = (int) (_graph.CenterX /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.CosD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6820;BA.debugLine="y1 = Graph.CenterY + (PD.YArray(i) - Scale(sY(0)";
_y1 = (int) (_graph.CenterY /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.SinD(_graph.RadarStartAngle /*int*/ ));
 //BA.debugLineNum = 6821;BA.debugLine="xcvsGraph.DrawLine(x0, y0, x1, y1, Cols(i), ID.S";
_xcvsgraph.DrawLine((float) (_x0),(float) (_y0),(float) (_x1),(float) (_y1),_cols[_i],(float) (_id.StrokeWidth /*int*/ ));
 //BA.debugLineNum = 6823;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 6824;BA.debugLine="For j = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step153 = 1;
final int limit153 = _zoom.EndIndex /*int*/ ;
_j = _zoom.BeginIndex /*int*/  ;
for (;_j <= limit153 ;_j = _j + step153 ) {
 //BA.debugLineNum = 6825;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6826;BA.debugLine="PD = Points.Get(j)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_j));
 //BA.debugLineNum = 6827;BA.debugLine="x0 = Graph.CenterX + (PD.YArray(i) - Scale(sY(";
_x0 = (int) (_graph.CenterX /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.CosD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6828;BA.debugLine="y0 = Graph.CenterY + (PD.YArray(i) - Scale(sY(";
_y0 = (int) (_graph.CenterY /*int*/ +(_pd.YArray /*double[]*/ [_i]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_radarscale*__c.SinD(_graph.RadarStartAngle /*int*/ +_angledelta*_j));
 //BA.debugLineNum = 6829;BA.debugLine="DrawPoint(x0, y0, ID.PointColor, ID.PointType,";
_drawpoint(_x0,_y0,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }
};
 };
 }
};
 //BA.debugLineNum = 6835;BA.debugLine="If Graph.RadarDrawScaleValues = True Then";
if (_graph.RadarDrawScaleValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 6836;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 6837;BA.debugLine="Private dy1 As Float";
_dy1 = 0f;
 //BA.debugLineNum = 6838;BA.debugLine="Private Step1 As Int";
_step1 = 0;
 //BA.debugLineNum = 6840;BA.debugLine="dy1 = Graph.Radius / Scale(sY(0)).NbIntervals";
_dy1 = (float) (_graph.Radius /*float*/ /(double)_scale[_sy[(int) (0)]].NbIntervals /*int*/ );
 //BA.debugLineNum = 6841;BA.debugLine="If 1.2 * Texts.ScaleTextHeight < dy1 Then";
if (1.2*_texts.ScaleTextHeight /*int*/ <_dy1) { 
 //BA.debugLineNum = 6842;BA.debugLine="Step1 = -1";
_step1 = (int) (-1);
 }else {
 //BA.debugLineNum = 6844;BA.debugLine="Step1 = -2";
_step1 = (int) (-2);
 };
 //BA.debugLineNum = 6846;BA.debugLine="x1 = Graph.CenterX - 0.3 * Texts.ScaleTextHeight";
_x1 = (int) (_graph.CenterX /*int*/ -0.3*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 6847;BA.debugLine="y0 = Graph.CenterY + 0.5 * Texts.ScaleTextHeight";
_y0 = (int) (_graph.CenterY /*int*/ +0.5*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 6848;BA.debugLine="For i = Scale(sY(0)).NbIntervals To 1 Step Step1";
{
final int step174 = _step1;
final int limit174 = (int) (1);
_i = _scale[_sy[(int) (0)]].NbIntervals /*int*/  ;
for (;(step174 > 0 && _i <= limit174) || (step174 < 0 && _i >= limit174) ;_i = ((int)(0 + _i + step174))  ) {
 //BA.debugLineNum = 6849;BA.debugLine="y1 = y0 - i * dy1";
_y1 = (int) (_y0-_i*_dy1);
 //BA.debugLineNum = 6850;BA.debugLine="txt = NumberFormat3(Scale(sY(0)).MinVal + i * S";
_txt = _numberformat3(_scale[_sy[(int) (0)]].MinVal /*double*/ +_i*_scale[_sy[(int) (0)]].Interval /*double*/ ,(int) (6));
 //BA.debugLineNum = 6851;BA.debugLine="xcvsGraph.DrawText(txt, x1, y1, Texts.ScaleFont";
_xcvsgraph.DrawText(ba,_txt,(float) (_x1),(float) (_y1),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 }
};
 };
 //BA.debugLineNum = 6855;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _items.getSize()>0) { 
 //BA.debugLineNum = 6856;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 6859;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 6860;BA.debugLine="End Sub";
return "";
}
public String  _drawscalesy() throws Exception{
int _i = 0;
int _l = 0;
int[] _x = null;
int[] _dy = null;
int _y = 0;
int _y1 = 0;
String _txt = "";
b4a.example.xchart._itemdata _id = null;
String[] _alignment = null;
 //BA.debugLineNum = 3340;BA.debugLine="Private Sub DrawScalesY";
 //BA.debugLineNum = 3341;BA.debugLine="Private i, l, x(NbMaxDifferentScales), dy(NbMaxDi";
_i = 0;
_l = 0;
_x = new int[_nbmaxdifferentscales];
;
_dy = new int[_nbmaxdifferentscales];
;
_y = 0;
_y1 = 0;
 //BA.debugLineNum = 3342;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 3343;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 3344;BA.debugLine="Private Alignment(4) As String";
_alignment = new String[(int) (4)];
java.util.Arrays.fill(_alignment,"");
 //BA.debugLineNum = 3345;BA.debugLine="Alignment(0) = \"RIGHT\"";
_alignment[(int) (0)] = "RIGHT";
 //BA.debugLineNum = 3346;BA.debugLine="Alignment(1) = \"LEFT\"";
_alignment[(int) (1)] = "LEFT";
 //BA.debugLineNum = 3347;BA.debugLine="Alignment(2) = \"RIGHT\"";
_alignment[(int) (2)] = "RIGHT";
 //BA.debugLineNum = 3348;BA.debugLine="Alignment(3) = \"LEFT\"";
_alignment[(int) (3)] = "LEFT";
 //BA.debugLineNum = 3350;BA.debugLine="x(0) = Graph.Left - 0.75 * Texts.ScaleTextHeight";
_x[(int) (0)] = (int) (_graph.Left /*int*/ -0.75*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3351;BA.debugLine="x(1) = Graph.Right + 0.75 * Texts.ScaleTextHeight";
_x[(int) (1)] = (int) (_graph.Right /*int*/ +0.75*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3352;BA.debugLine="x(2) = Graph.Left - 0.75 * Texts.ScaleTextHeight";
_x[(int) (2)] = (int) (_graph.Left /*int*/ -0.75*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3353;BA.debugLine="x(3) = Graph.Right + 0.75 * Texts.ScaleTextHeight";
_x[(int) (3)] = (int) (_graph.Right /*int*/ +0.75*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3354;BA.debugLine="dy(0) = 0.52 * Texts.ScaleTextHeight";
_dy[(int) (0)] = (int) (0.52*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3355;BA.debugLine="dy(1) = 0.52 * Texts.ScaleTextHeight";
_dy[(int) (1)] = (int) (0.52*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3356;BA.debugLine="dy(2) = -0.48 * Texts.ScaleTextHeight";
_dy[(int) (2)] = (int) (-0.48*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3357;BA.debugLine="dy(3) = -0.48 * Texts.ScaleTextHeight";
_dy[(int) (3)] = (int) (-0.48*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3377;BA.debugLine="y1 = Graph.Bottom";
_y1 = _graph.Bottom /*int*/ ;
 //BA.debugLineNum = 3378;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit18 ;_l = _l + step18 ) {
 //BA.debugLineNum = 3379;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 3380;BA.debugLine="For i = 0 To Scale(sY(0)).NbIntervals";
{
final int step20 = 1;
final int limit20 = _scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 3381;BA.debugLine="y = Graph.Bottom - i * Graph.YInterval";
_y = (int) (_graph.Bottom /*int*/ -_i*_graph.YInterval /*int*/ );
 //BA.debugLineNum = 3382;BA.debugLine="If Graph.DrawHorizontalGridLines = True Then";
if (_graph.DrawHorizontalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3383;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, y, Graph.Right,";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ ),(float) (_y),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3386;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3387;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - 4dip, y, Graph";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (4))),(float) (_y),(float) (_graph.Left /*int*/ ),(float) (_y),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3388;BA.debugLine="If Scale(sY(0)).Different = True Then";
if (_scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3389;BA.debugLine="xcvsGraph.DrawLine(Graph.Right, y, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Right /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ +__c.DipToCurrent((int) (4))),(float) (_y),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3391;BA.debugLine="If Scale(sY(l)).MinVal = 0 And Scale(sY(l)).Ma";
if (_scale[_sy[_l]].MinVal /*double*/ ==0 && _scale[_sy[_l]].MaxVal /*double*/ ==0 && _scale[_sy[_l]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3392;BA.debugLine="txt = \"\"";
_txt = "";
 }else {
 //BA.debugLineNum = 3394;BA.debugLine="If Scale(sY(0)).ReverseYScale = True And (Gra";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.True && ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 3395;BA.debugLine="txt = NumberFormat3(Scale(sY(l)).MaxVal - i";
_txt = _numberformat3(_scale[_sy[_l]].MaxVal /*double*/ -_i*_scale[_sy[_l]].Interval /*double*/ ,(int) (6));
 }else {
 //BA.debugLineNum = 3397;BA.debugLine="txt = NumberFormat3(Scale(sY(l)).MinVal + i";
_txt = _numberformat3(_scale[_sy[_l]].MinVal /*double*/ +_i*_scale[_sy[_l]].Interval /*double*/ ,(int) (6));
 };
 };
 //BA.debugLineNum = 3401;BA.debugLine="If i = 0 Or MeasureTextHeight(txt, Texts.Scale";
if (_i==0 || _measuretextheight(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )*1.8<_y1-_y) { 
 //BA.debugLineNum = 3403;BA.debugLine="xcvsGraph.DrawText(txt, x(l), y + dy(l), Text";
_xcvsgraph.DrawText(ba,_txt,(float) (_x[_l]),(float) (_y+_dy[_l]),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_id.Color /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,_alignment[_l]));
 //BA.debugLineNum = 3404;BA.debugLine="y1 = y";
_y1 = _y;
 };
 };
 }
};
 }
};
 //BA.debugLineNum = 3409;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, Graph.Top, Graph.L";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ),(float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3410;BA.debugLine="End Sub";
return "";
}
public String  _drawscalex() throws Exception{
int _i = 0;
int _ip = 0;
int _x = 0;
int _x1 = 0;
int _xinterval = 0;
int _l1 = 0;
String _txt = "";
double _h1 = 0;
double _h2 = 0;
double _h3 = 0;
double _h4 = 0;
double _h5 = 0;
b4a.example.xchart._pointdata _pd = null;
 //BA.debugLineNum = 3455;BA.debugLine="Private Sub DrawScaleX";
 //BA.debugLineNum = 3456;BA.debugLine="Private i, ip, x, x1, XInterval, l1 As Int";
_i = 0;
_ip = 0;
_x = 0;
_x1 = 0;
_xinterval = 0;
_l1 = 0;
 //BA.debugLineNum = 3457;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 3458;BA.debugLine="Private h1, h2, h3, h4, h5 As Double";
_h1 = 0;
_h2 = 0;
_h3 = 0;
_h4 = 0;
_h5 = 0;
 //BA.debugLineNum = 3467;BA.debugLine="h1 = 1.65";
_h1 = 1.65;
 //BA.debugLineNum = 3468;BA.debugLine="h2 = 0.38";
_h2 = 0.38;
 //BA.debugLineNum = 3469;BA.debugLine="h3 = 0.45";
_h3 = 0.45;
 //BA.debugLineNum = 3470;BA.debugLine="h4 = 0.6";
_h4 = 0.6;
 //BA.debugLineNum = 3471;BA.debugLine="h5 = 1.2";
_h5 = 1.2;
 //BA.debugLineNum = 3473;BA.debugLine="l1 = 4dip";
_l1 = __c.DipToCurrent((int) (4));
 //BA.debugLineNum = 3475;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Or Graph.ChartType";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 3476;BA.debugLine="XInterval = Graph.Width / Scale(sX).NbIntervals";
_xinterval = (int) (_graph.Width /*int*/ /(double)_scale[_sx].NbIntervals /*int*/ );
 //BA.debugLineNum = 3477;BA.debugLine="For i = 0 To Scale(sX).NbIntervals";
{
final int step12 = 1;
final int limit12 = _scale[_sx].NbIntervals /*int*/ ;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 3478;BA.debugLine="x = Graph.Left + i * XInterval";
_x = (int) (_graph.Left /*int*/ +_i*_xinterval);
 //BA.debugLineNum = 3479;BA.debugLine="txt = NumberFormat3(Scale(sX).MinVal + i * Scal";
_txt = _numberformat3(_scale[_sx].MinVal /*double*/ +_i*_scale[_sx].Interval /*double*/ ,(int) (6));
 //BA.debugLineNum = 3480;BA.debugLine="If Graph.DrawVerticalGridLines = True Then";
if (_graph.DrawVerticalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3481;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Top, x, Graph.Bott";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Top /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ ),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3483;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3484;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 3486;BA.debugLine="If (x - x1) > 1.3 * MeasureTextWidth(txt, Te";
if ((_x-_x1)>1.3*_measuretextwidth(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ) || _ip==0) { 
 //BA.debugLineNum = 3487;BA.debugLine="xcvsGraph.DrawText(txt, x, Graph.Bottom + h";
_xcvsgraph.DrawText(ba,_txt,(float) (_x),(float) (_graph.Bottom /*int*/ +_h1*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 3488;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
case 1: {
 //BA.debugLineNum = 3491;BA.debugLine="If (x - x1) > 1.8 * Texts.ScaleTextHeight Th";
if ((_x-_x1)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3492;BA.debugLine="xcvsGraph.DrawTextRotated(txt, x + h2 * Tex";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_x+_h2*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-90));
 //BA.debugLineNum = 3493;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
case 2: {
 //BA.debugLineNum = 3496;BA.debugLine="If (x - x1) > 1.8 * Texts.ScaleTextHeight Th";
if ((_x-_x1)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3497;BA.debugLine="xcvsGraph.DrawTextRotated(txt, x + h3 * Tex";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_x+_h3*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h5*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-45));
 //BA.debugLineNum = 3498;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
}
;
 //BA.debugLineNum = 3501;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Bottom, x, Graph.B";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Bottom /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3503;BA.debugLine="x1 = x";
_x1 = _x;
 }
};
 }else {
 //BA.debugLineNum = 3506;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step41 = 1;
final int limit41 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit41 ;_i = _i + step41 ) {
 //BA.debugLineNum = 3507;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3509;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3510;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3511;BA.debugLine="If Graph.ChartType = \"LINE\" Or Graph.ChartType";
if ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) { 
 //BA.debugLineNum = 3512;BA.debugLine="x = Graph.Left + ip * Scale(sX).Scale";
_x = (int) (_graph.Left /*int*/ +_ip*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 3514;BA.debugLine="x = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_x = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 };
 //BA.debugLineNum = 3516;BA.debugLine="If PD.ShowTick = True Then";
if (_pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3517;BA.debugLine="If Graph.DrawVerticalGridLines = True Then";
if (_graph.DrawVerticalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3518;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Top, x, Graph.Bot";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Top /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ ),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3520;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3521;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 3523;BA.debugLine="If (x - x1) > 1.3 * MeasureTextWidth(PD.X,";
if ((_x-_x1)>1.3*_measuretextwidth(_pd.X /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ) || _ip==0) { 
 //BA.debugLineNum = 3524;BA.debugLine="xcvsGraph.DrawText(PD.X, x, Graph.Bottom +";
_xcvsgraph.DrawText(ba,_pd.X /*String*/ ,(float) (_x),(float) (_graph.Bottom /*int*/ +_h1*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 3525;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
case 1: {
 //BA.debugLineNum = 3528;BA.debugLine="If (x - x1) > 1.8 * Texts.ScaleTextHeight T";
if ((_x-_x1)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3529;BA.debugLine="xcvsGraph.DrawTextRotated(PD.X, x + h2 * T";
_xcvsgraph.DrawTextRotated(ba,_pd.X /*String*/ ,(float) (_x+_h2*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-90));
 //BA.debugLineNum = 3530;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
case 2: {
 //BA.debugLineNum = 3533;BA.debugLine="If (x - x1) > 1.8 * Texts.ScaleTextHeight T";
if ((_x-_x1)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3534;BA.debugLine="xcvsGraph.DrawTextRotated(PD.X, x + h3 * T";
_xcvsgraph.DrawTextRotated(ba,_pd.X /*String*/ ,(float) (_x+_h3*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h5*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-45));
 //BA.debugLineNum = 3535;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
}
;
 //BA.debugLineNum = 3538;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Bottom, x, Graph.";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Bottom /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 }
};
 //BA.debugLineNum = 3542;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3543;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, Graph.Bottom, Gr";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ),(float) (_graph.Right /*int*/ ),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 //BA.debugLineNum = 3546;BA.debugLine="End Sub";
return "";
}
public String  _drawscalexh() throws Exception{
int _i = 0;
int _y = 0;
int _y1 = 0;
int _l1 = 0;
b4a.example.xchart._pointdata _pd = null;
int _ip = 0;
 //BA.debugLineNum = 3550;BA.debugLine="Private Sub DrawScaleXH";
 //BA.debugLineNum = 3551;BA.debugLine="Private i, y, y1, l1 As Int";
_i = 0;
_y = 0;
_y1 = 0;
_l1 = 0;
 //BA.debugLineNum = 3553;BA.debugLine="l1 = 4dip";
_l1 = __c.DipToCurrent((int) (4));
 //BA.debugLineNum = 3555;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 3556;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step4 = 1;
final int limit4 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 3557;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3558;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 3560;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3561;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3562;BA.debugLine="y = Graph.Bottom - Graph.XOffset - (ip + 0.5) *";
_y = (int) (_graph.Bottom /*int*/ -_graph.XOffset /*int*/ -(_ip+0.5)*_graph.YInterval /*int*/ );
 //BA.debugLineNum = 3563;BA.debugLine="If PD.ShowTick = True Then";
if (_pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3564;BA.debugLine="If Graph.DrawHorizontalGridLines = True Then";
if (_graph.DrawHorizontalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3565;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, y, Graph.Right";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ ),(float) (_y),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3567;BA.debugLine="If Abs(y - y1) > 1.8 * Texts.ScaleTextHeight T";
if (__c.Abs(_y-_y1)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3568;BA.debugLine="xcvsGraph.DrawText(PD.X, Graph.Left - 0.6 * T";
_xcvsgraph.DrawText(ba,_pd.X /*String*/ ,(float) (_graph.Left /*int*/ -0.6*_texts.ScaleTextHeight /*int*/ ),(float) (_y+0.4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 3569;BA.debugLine="y1 = y";
_y1 = _y;
 //BA.debugLineNum = 3570;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - l1, y, Graph.";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -_l1),(float) (_y),(float) (_graph.Left /*int*/ ),(float) (_y),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 }
};
 }else {
 //BA.debugLineNum = 3575;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step22 = 1;
final int limit22 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit22 ;_i = _i + step22 ) {
 //BA.debugLineNum = 3576;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3577;BA.debugLine="Private ip As Int";
_ip = 0;
 //BA.debugLineNum = 3579;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3580;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3581;BA.debugLine="y = Graph.Top + Graph.XOffset + (ip + 0.5) * Gr";
_y = (int) (_graph.Top /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.YInterval /*int*/ );
 //BA.debugLineNum = 3582;BA.debugLine="If PD.ShowTick = True Then";
if (_pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3583;BA.debugLine="If Graph.DrawHorizontalGridLines = True Then";
if (_graph.DrawHorizontalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3584;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, y, Graph.Right";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ ),(float) (_y),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3586;BA.debugLine="If Abs(y - y1) > 1.8 * Texts.ScaleTextHeight T";
if (__c.Abs(_y-_y1)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3587;BA.debugLine="xcvsGraph.DrawText(PD.X, Graph.Left - 0.6 * T";
_xcvsgraph.DrawText(ba,_pd.X /*String*/ ,(float) (_graph.Left /*int*/ -0.6*_texts.ScaleTextHeight /*int*/ ),(float) (_y+0.4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 3588;BA.debugLine="y1 = y";
_y1 = _y;
 };
 //BA.debugLineNum = 3590;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - l1, y, Graph.L";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -_l1),(float) (_y),(float) (_graph.Left /*int*/ ),(float) (_y),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 }
};
 };
 //BA.debugLineNum = 3594;BA.debugLine="End Sub";
return "";
}
public String  _drawscalexhline() throws Exception{
int _i = 0;
int _ip = 0;
int _h1 = 0;
int _y = 0;
int _y1 = 0;
int _y2 = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
b4a.example.xchart._pointdata _pd = null;
 //BA.debugLineNum = 3598;BA.debugLine="Private Sub DrawScaleXHLine";
 //BA.debugLineNum = 3599;BA.debugLine="Private i, ip, h1, y, y1, y2 As Int";
_i = 0;
_ip = 0;
_h1 = 0;
_y = 0;
_y1 = 0;
_y2 = 0;
 //BA.debugLineNum = 3600;BA.debugLine="Private rectText As B4XRect";
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 3602;BA.debugLine="rectText = xcvsGraph.MeasureText(\"0\", Texts.Scale";
_recttext = _xcvsgraph.MeasureText("0",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 3604;BA.debugLine="y2 = 10000";
_y2 = (int) (10000);
 //BA.debugLineNum = 3606;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step5 = 1;
final int limit5 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 3607;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 3609;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 3610;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 3611;BA.debugLine="If mHChartsTicksTopDown = False Then";
if (_mhchartstickstopdown==__c.False) { 
 //BA.debugLineNum = 3612;BA.debugLine="y = Graph.Bottom - ip * Graph.YInterval";
_y = (int) (_graph.Bottom /*int*/ -_ip*_graph.YInterval /*int*/ );
 }else {
 //BA.debugLineNum = 3614;BA.debugLine="y = Graph.Top + ip * Graph.YInterval";
_y = (int) (_graph.Top /*int*/ +_ip*_graph.YInterval /*int*/ );
 };
 //BA.debugLineNum = 3616;BA.debugLine="y1 = y - rectText.CenterY";
_y1 = (int) (_y-_recttext.getCenterY());
 //BA.debugLineNum = 3617;BA.debugLine="h1 = 1.8 * rectText.Height";
_h1 = (int) (1.8*_recttext.getHeight());
 //BA.debugLineNum = 3618;BA.debugLine="If PD.ShowTick = True Then";
if (_pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3619;BA.debugLine="If Graph.DrawVerticalGridLines = True Then";
if (_graph.DrawVerticalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3620;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, y, Graph.Right,";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ ),(float) (_y),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3622;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3623;BA.debugLine="If Abs((y2 - y1)) > h1 Then";
if (__c.Abs((_y2-_y1))>_h1) { 
 //BA.debugLineNum = 3624;BA.debugLine="xcvsGraph.DrawText(PD.X, Graph.Left - 6dip, y";
_xcvsgraph.DrawText(ba,_pd.X /*String*/ ,(float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (6))),(float) (_y1),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 3625;BA.debugLine="y2 = y1";
_y2 = _y1;
 };
 //BA.debugLineNum = 3627;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - 4dip, y, Graph";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (4))),(float) (_y),(float) (_graph.Left /*int*/ ),(float) (_y),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 }
};
 //BA.debugLineNum = 3631;BA.debugLine="End Sub";
return "";
}
public String  _drawscaley() throws Exception{
int _i = 0;
int _y = 0;
int _y1 = 0;
String _txt = "";
 //BA.debugLineNum = 3243;BA.debugLine="Private Sub DrawScaleY";
 //BA.debugLineNum = 3244;BA.debugLine="Private i, y, y1 As Int";
_i = 0;
_y = 0;
_y1 = 0;
 //BA.debugLineNum = 3245;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 3247;BA.debugLine="y1 = Graph.Bottom";
_y1 = _graph.Bottom /*int*/ ;
 //BA.debugLineNum = 3248;BA.debugLine="For i = 0 To Scale(sY(0)).NbIntervals";
{
final int step4 = 1;
final int limit4 = _scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 3249;BA.debugLine="y = Graph.Bottom - i * Graph.YInterval";
_y = (int) (_graph.Bottom /*int*/ -_i*_graph.YInterval /*int*/ );
 //BA.debugLineNum = 3251;BA.debugLine="If Graph.DrawHorizontalGridLines = True Then";
if (_graph.DrawHorizontalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3252;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, y, Graph.Right,";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ ),(float) (_y),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3255;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3256;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - 4dip, y, Graph.";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (4))),(float) (_y),(float) (_graph.Left /*int*/ ),(float) (_y),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3257;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0 && _scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3258;BA.debugLine="txt = \"\"";
_txt = "";
 }else {
 //BA.debugLineNum = 3260;BA.debugLine="If Scale(sY(0)).ReverseYScale = True And (Grap";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.True && ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE"))) { 
 //BA.debugLineNum = 3261;BA.debugLine="txt = NumberFormat3(Scale(sY(0)).MaxVal - i *";
_txt = _numberformat3(_scale[_sy[(int) (0)]].MaxVal /*double*/ -_i*_scale[_sy[(int) (0)]].Interval /*double*/ ,(int) (6));
 }else {
 //BA.debugLineNum = 3263;BA.debugLine="txt = NumberFormat3(Scale(sY(0)).MinVal + i *";
_txt = _numberformat3(_scale[_sy[(int) (0)]].MinVal /*double*/ +_i*_scale[_sy[(int) (0)]].Interval /*double*/ ,(int) (6));
 };
 };
 //BA.debugLineNum = 3267;BA.debugLine="If i = 0 Or MeasureTextHeight(txt, Texts.ScaleF";
if (_i==0 || _measuretextheight(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )*1.8<_y1-_y) { 
 //BA.debugLineNum = 3269;BA.debugLine="xcvsGraph.DrawText(txt, Graph.Left - 0.75 * Te";
_xcvsgraph.DrawText(ba,_txt,(float) (_graph.Left /*int*/ -0.75*_texts.ScaleTextHeight /*int*/ ),(float) (_y+0.52*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 3275;BA.debugLine="y1 = y";
_y1 = _y;
 };
 };
 }
};
 //BA.debugLineNum = 3279;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3280;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, Graph.Top, Graph.";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ),(float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 3283;BA.debugLine="If HLines.Size > 0 And Scale(sY(0)).Different = F";
if (_hlines.getSize()>0 && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3284;BA.debugLine="DrawHorizontalLines";
_drawhorizontallines();
 };
 //BA.debugLineNum = 3286;BA.debugLine="End Sub";
return "";
}
public String  _drawscaleyh() throws Exception{
int _i = 0;
int _x = 0;
int _x1 = 0;
int _ytext = 0;
int _ytickt = 0;
int _ytickb = 0;
String _txt = "";
double _h1 = 0;
 //BA.debugLineNum = 3290;BA.debugLine="Private Sub DrawScaleYH";
 //BA.debugLineNum = 3291;BA.debugLine="Private i, x, x1, yText, yTickT, yTickB As Int";
_i = 0;
_x = 0;
_x1 = 0;
_ytext = 0;
_ytickt = 0;
_ytickb = 0;
 //BA.debugLineNum = 3292;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 3293;BA.debugLine="Private h1 As Double";
_h1 = 0;
 //BA.debugLineNum = 3298;BA.debugLine="h1 = 1.65";
_h1 = 1.65;
 //BA.debugLineNum = 3301;BA.debugLine="x1 = Graph.Left";
_x1 = _graph.Left /*int*/ ;
 //BA.debugLineNum = 3302;BA.debugLine="If mHChartsXScaleOnTop = False Then";
if (_mhchartsxscaleontop==__c.False) { 
 //BA.debugLineNum = 3303;BA.debugLine="yText = Graph.Bottom + h1 * Texts.ScaleTextHeigh";
_ytext = (int) (_graph.Bottom /*int*/ +_h1*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3304;BA.debugLine="yTickT = Graph.Bottom";
_ytickt = _graph.Bottom /*int*/ ;
 //BA.debugLineNum = 3305;BA.debugLine="yTickB = Graph.Bottom + 4dip";
_ytickb = (int) (_graph.Bottom /*int*/ +__c.DipToCurrent((int) (4)));
 }else {
 //BA.debugLineNum = 3307;BA.debugLine="yText = Graph.Top - 0.6 * Texts.ScaleTextHeight";
_ytext = (int) (_graph.Top /*int*/ -0.6*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 3308;BA.debugLine="yTickT = Graph.Top - 4dip";
_ytickt = (int) (_graph.Top /*int*/ -__c.DipToCurrent((int) (4)));
 //BA.debugLineNum = 3309;BA.debugLine="yTickB = Graph.Top";
_ytickb = _graph.Top /*int*/ ;
 };
 //BA.debugLineNum = 3311;BA.debugLine="For i = 0 To Scale(sY(0)).NbIntervals";
{
final int step15 = 1;
final int limit15 = _scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 3312;BA.debugLine="x = Graph.Left + i * Graph.XInterval";
_x = (int) (_graph.Left /*int*/ +_i*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 3314;BA.debugLine="If Graph.DrawVerticalGridLines = True Then";
if (_graph.DrawVerticalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3315;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Top, x, Graph.Botto";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Top /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ ),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3318;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3319;BA.debugLine="xcvsGraph.DrawLine(x, yTickT, x, yTickB, Graph.";
_xcvsgraph.DrawLine((float) (_x),(float) (_ytickt),(float) (_x),(float) (_ytickb),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3320;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0 && _scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3321;BA.debugLine="txt = \"\"";
_txt = "";
 }else {
 //BA.debugLineNum = 3323;BA.debugLine="txt = NumberFormat3(Scale(sY(0)).MinVal + i *";
_txt = _numberformat3(_scale[_sy[(int) (0)]].MinVal /*double*/ +_i*_scale[_sy[(int) (0)]].Interval /*double*/ ,(int) (6));
 };
 //BA.debugLineNum = 3326;BA.debugLine="If i = 0 Or (x - x1) > 1.3 * MeasureTextWidth(t";
if (_i==0 || (_x-_x1)>1.3*_measuretextwidth(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )) { 
 //BA.debugLineNum = 3327;BA.debugLine="xcvsGraph.DrawText(txt, x, yText, Texts.ScaleF";
_xcvsgraph.DrawText(ba,_txt,(float) (_x),(float) (_ytext),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 3328;BA.debugLine="x1 = x";
_x1 = _x;
 };
 };
 }
};
 //BA.debugLineNum = 3332;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, Graph.Bottom, Grap";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ),(float) (_graph.Right /*int*/ ),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3334;BA.debugLine="If HLines.Size > 0 Then";
if (_hlines.getSize()>0) { 
 //BA.debugLineNum = 3335;BA.debugLine="DrawHorizontalLinesH";
_drawhorizontallinesh();
 };
 //BA.debugLineNum = 3337;BA.debugLine="End Sub";
return "";
}
public String  _drawstackedarea() throws Exception{
int _i = 0;
int _ip = 0;
int _l = 0;
int _myaxis0 = 0;
double _smax = 0;
double _smin = 0;
double _smean = 0;
b4a.example.xchart._itemdata _id = null;
anywheresoftware.b4a.objects.collections.List _lstcoords = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _ptharea = null;
b4a.example.xchart._pointdata _pd = null;
int[] _coords = null;
int[] _coords0 = null;
int[] _coords1 = null;
 //BA.debugLineNum = 4052;BA.debugLine="Private Sub DrawStackedArea";
 //BA.debugLineNum = 4053;BA.debugLine="Private i, ip, l, mYAxis0 As Int";
_i = 0;
_ip = 0;
_l = 0;
_myaxis0 = 0;
 //BA.debugLineNum = 4055;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 4056;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 4058;BA.debugLine="If Items.Size = 1 And (MinMaxMeanValues(0) <> 0 O";
if (_items.getSize()==1 && (_minmaxmeanvalues[(int) (0)]!=0 || _minmaxmeanvalues[(int) (1)]!=0)) { 
 //BA.debugLineNum = 4059;BA.debugLine="Private sMax, sMin, sMean As Double";
_smax = 0;
_smin = 0;
_smean = 0;
 //BA.debugLineNum = 4060;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4061;BA.debugLine="sMin = Graph.Bottom - (MinMaxMeanValues(0) - Sc";
_smin = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 4062;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMin, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smin),(float) (_graph.Right /*int*/ ),(float) (_smin),_graph.MinLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 4064;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4065;BA.debugLine="sMax = Graph.Bottom - (MinMaxMeanValues(1) - Sc";
_smax = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 4066;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMax, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smax),(float) (_graph.Right /*int*/ ),(float) (_smax),_graph.MaxLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 4068;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4069;BA.debugLine="sMean = Graph.Bottom - (MinMaxMeanValues(2) - S";
_smean = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (2)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 4070;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMean, Graph.Rig";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smean),(float) (_graph.Right /*int*/ ),(float) (_smean),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 //BA.debugLineNum = 4074;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4075;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal * S";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else if(_scale[_sy[(int) (0)]].MinVal /*double*/ <0) { 
 //BA.debugLineNum = 4077;BA.debugLine="mYAxis0 = Graph.Top";
_myaxis0 = _graph.Top /*int*/ ;
 }else {
 //BA.debugLineNum = 4079;BA.debugLine="mYAxis0 = Graph.Bottom";
_myaxis0 = _graph.Bottom /*int*/ ;
 };
 //BA.debugLineNum = 4082;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 4083;BA.debugLine="Private lstCoords As List";
_lstcoords = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4084;BA.debugLine="Private pthArea As B4XPath";
_ptharea = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 4086;BA.debugLine="lstCoords.Initialize";
_lstcoords.Initialize();
 //BA.debugLineNum = 4087;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step30 = 1;
final int limit30 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit30 ;_i = _i + step30 ) {
 //BA.debugLineNum = 4088;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4090;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 4091;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4092;BA.debugLine="Private Coords(PD.YArray.Length + 1) As Int";
_coords = new int[(int) (_pd.YArray /*double[]*/ .length+1)];
;
 //BA.debugLineNum = 4093;BA.debugLine="Coords(0) = Graph.Left + ip * Scale(sX).Scale";
_coords[(int) (0)] = (int) (_graph.Left /*int*/ +_ip*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4094;BA.debugLine="Coords(1) = Graph.Bottom - (PD.YArray(0) - Scale";
_coords[(int) (1)] = (int) (_graph.Bottom /*int*/ -(_pd.YArray /*double[]*/ [(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4095;BA.debugLine="For l = 1 To PD.YArray.Length - 1";
{
final int step37 = 1;
final int limit37 = (int) (_pd.YArray /*double[]*/ .length-1);
_l = (int) (1) ;
for (;_l <= limit37 ;_l = _l + step37 ) {
 //BA.debugLineNum = 4096;BA.debugLine="Coords(l + 1) = Coords(l) - (PD.YArray(l) - Sca";
_coords[(int) (_l+1)] = (int) (_coords[_l]-(_pd.YArray /*double[]*/ [_l]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }
};
 //BA.debugLineNum = 4098;BA.debugLine="lstCoords.Add(Coords)";
_lstcoords.Add((Object)(_coords));
 }
};
 //BA.debugLineNum = 4101;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4102;BA.debugLine="For l = Items.Size - 1 To 0 Step -1";
{
final int step43 = -1;
final int limit43 = (int) (0);
_l = (int) (_items.getSize()-1) ;
for (;_l >= limit43 ;_l = _l + step43 ) {
 //BA.debugLineNum = 4103;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 4104;BA.debugLine="pthArea.Initialize(Graph.Left, Graph.Bottom)";
_ptharea.Initialize((float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 4105;BA.debugLine="For i = 0 To lstCoords.Size - 1";
{
final int step46 = 1;
final int limit46 = (int) (_lstcoords.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
 //BA.debugLineNum = 4106;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 4107;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 4108;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 4109;BA.debugLine="Private Coords0(2) As Int";
_coords0 = new int[(int) (2)];
;
 //BA.debugLineNum = 4110;BA.debugLine="Coords0 = lstCoords.Get(i)";
_coords0 = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 4111;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 4112;BA.debugLine="pthArea.Initialize(Coords0(0), mYAxis0)";
_ptharea.Initialize((float) (_coords0[(int) (0)]),(float) (_myaxis0));
 };
 //BA.debugLineNum = 4114;BA.debugLine="pthArea.LineTo(Coords0(0), Coords0(l + 1))";
_ptharea.LineTo((float) (_coords0[(int) (0)]),(float) (_coords0[(int) (_l+1)]));
 }
};
 //BA.debugLineNum = 4117;BA.debugLine="If l = 0 Then";
if (_l==0) { 
 //BA.debugLineNum = 4118;BA.debugLine="pthArea.LineTo(Coords0(0), mYAxis0)";
_ptharea.LineTo((float) (_coords0[(int) (0)]),(float) (_myaxis0));
 //BA.debugLineNum = 4119;BA.debugLine="pthArea.LineTo(Graph.Left, mYAxis0)	'??? Missin";
_ptharea.LineTo((float) (_graph.Left /*int*/ ),(float) (_myaxis0));
 }else {
 //BA.debugLineNum = 4121;BA.debugLine="For i = lstCoords.Size - 1 To 0 Step -1";
{
final int step61 = -1;
final int limit61 = (int) (0);
_i = (int) (_lstcoords.getSize()-1) ;
for (;_i >= limit61 ;_i = _i + step61 ) {
 //BA.debugLineNum = 4122;BA.debugLine="Private Coords0(2) As Int";
_coords0 = new int[(int) (2)];
;
 //BA.debugLineNum = 4123;BA.debugLine="Coords0 = lstCoords.Get(i)";
_coords0 = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 4124;BA.debugLine="pthArea.LineTo(Coords0(0), Coords0(l))";
_ptharea.LineTo((float) (_coords0[(int) (0)]),(float) (_coords0[_l]));
 }
};
 };
 //BA.debugLineNum = 4128;BA.debugLine="xcvsGraph.DrawPath(pthArea, ID.Color - Graph.Are";
_xcvsgraph.DrawPath(_ptharea,(int) (_id.Color /*int*/ -_graph.AreaFillAlphaValue /*int*/ ),__c.True,(float) (_id.StrokeWidth /*int*/ ));
 }
};
 //BA.debugLineNum = 4130;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4132;BA.debugLine="DrawGridV";
_drawgridv();
 //BA.debugLineNum = 4134;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4135;BA.debugLine="For l = Items.Size - 1 To 0 Step -1";
{
final int step72 = -1;
final int limit72 = (int) (0);
_l = (int) (_items.getSize()-1) ;
for (;_l >= limit72 ;_l = _l + step72 ) {
 //BA.debugLineNum = 4136;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 4137;BA.debugLine="For i = 1 To lstCoords.Size - 1";
{
final int step74 = 1;
final int limit74 = (int) (_lstcoords.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
 //BA.debugLineNum = 4138;BA.debugLine="Private Coords0(2), Coords1(2) As Int";
_coords0 = new int[(int) (2)];
;
_coords1 = new int[(int) (2)];
;
 //BA.debugLineNum = 4139;BA.debugLine="Coords0 = lstCoords.Get(i - 1)";
_coords0 = (int[])(_lstcoords.Get((int) (_i-1)));
 //BA.debugLineNum = 4140;BA.debugLine="Coords1 = lstCoords.Get(i)";
_coords1 = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 4141;BA.debugLine="xcvsGraph.DrawLine(Coords0(0), Coords0(l + 1),";
_xcvsgraph.DrawLine((float) (_coords0[(int) (0)]),(float) (_coords0[(int) (_l+1)]),(float) (_coords1[(int) (0)]),(float) (_coords1[(int) (_l+1)]),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 }
};
 }
};
 //BA.debugLineNum = 4145;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4147;BA.debugLine="For l = Items.Size - 1 To 0 Step -1";
{
final int step82 = -1;
final int limit82 = (int) (0);
_l = (int) (_items.getSize()-1) ;
for (;_l >= limit82 ;_l = _l + step82 ) {
 //BA.debugLineNum = 4148;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 4149;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 4150;BA.debugLine="For i = 0 To lstCoords.Size - 1";
{
final int step85 = 1;
final int limit85 = (int) (_lstcoords.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit85 ;_i = _i + step85 ) {
 //BA.debugLineNum = 4151;BA.debugLine="Private Coords(2) As Int";
_coords = new int[(int) (2)];
;
 //BA.debugLineNum = 4152;BA.debugLine="Coords = lstCoords.Get(i)";
_coords = (int[])(_lstcoords.Get(_i));
 //BA.debugLineNum = 4153;BA.debugLine="DrawPoint(Coords(0), Coords(l + 1), ID.PointCo";
_drawpoint(_coords[(int) (0)],_coords[(int) (_l+1)],_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }
};
 };
 }
};
 //BA.debugLineNum = 4158;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4159;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4160;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4162;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 4166;BA.debugLine="If HLines.Size > 0 And Scale(sY(0)).Different = F";
if (_hlines.getSize()>0 && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4167;BA.debugLine="DrawHorizontalLinesValue";
_drawhorizontallinesvalue();
 };
 //BA.debugLineNum = 4170;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Zoom.NbVisi";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _zoom.NbVisiblePoints /*int*/ >0) { 
 //BA.debugLineNum = 4171;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 4174;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 4175;BA.debugLine="End Sub";
return "";
}
public String  _drawwaterfallvalues() throws Exception{
int _i = 0;
int _ip = 0;
int _h = 0;
int _x = 0;
int _xt = 0;
int _dy = 0;
int _y = 0;
int _yt = 0;
int _col = 0;
int _myaxis0 = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttextbackground = null;
int _textwidth = 0;
int _textheight = 0;
String _localbarvalueorientation = "";
String _valtext = "";
float _localtextsize = 0f;
int _localtextheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _localfont = null;
b4a.example.xchart._pointdata _pd = null;
double[] _py = null;
String _textalignment = "";
int _dyt = 0;
int _dyb = 0;
 //BA.debugLineNum = 6004;BA.debugLine="Private Sub DrawWaterfallValues";
 //BA.debugLineNum = 6005;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 6007;BA.debugLine="Private i, ip, h, x, xt, dy, y, yt As Int";
_i = 0;
_ip = 0;
_h = 0;
_x = 0;
_xt = 0;
_dy = 0;
_y = 0;
_yt = 0;
 //BA.debugLineNum = 6008;BA.debugLine="Private Col As Int";
_col = 0;
 //BA.debugLineNum = 6009;BA.debugLine="Private mYAxis0 As Int";
_myaxis0 = 0;
 //BA.debugLineNum = 6010;BA.debugLine="Private rectText, rectTextBackground As B4XRect";
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttextbackground = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6011;BA.debugLine="Private TextWidth, TextHeight As Int";
_textwidth = 0;
_textheight = 0;
 //BA.debugLineNum = 6012;BA.debugLine="Private LocalBarValueOrientation As String";
_localbarvalueorientation = "";
 //BA.debugLineNum = 6013;BA.debugLine="Private valText As String";
_valtext = "";
 //BA.debugLineNum = 6014;BA.debugLine="Private LocalTextSize As Float";
_localtextsize = 0f;
 //BA.debugLineNum = 6015;BA.debugLine="Private LocalTextHeight As Int";
_localtextheight = 0;
 //BA.debugLineNum = 6016;BA.debugLine="Private LocalFont As B4XFont";
_localfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 6018;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal * Sc";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6020;BA.debugLine="LocalBarValueOrientation = Graph.BarValueOrientat";
_localbarvalueorientation = _graph.BarValueOrientation /*String*/ ;
 //BA.debugLineNum = 6021;BA.debugLine="LocalFont = Texts.ScaleFont";
_localfont = _texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 6022;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight";
_localtextheight = _texts.ScaleTextHeight /*int*/ ;
 //BA.debugLineNum = 6023;BA.debugLine="LocalTextSize = Texts.ScaleTextSize";
_localtextsize = _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 6025;BA.debugLine="If Graph.BarValueOrientation = \"HORIZONTAL\" Then";
if ((_graph.BarValueOrientation /*String*/ ).equals("HORIZONTAL")) { 
 //BA.debugLineNum = 6026;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step18 = 1;
final int limit18 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 6027;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6029;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6030;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 6031;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 6032;BA.debugLine="rectText = xcvsGraph.MeasureText(NumberFormat3(";
_recttext = _xcvsgraph.MeasureText(_numberformat3(_py[(int) (0)],_values.MaxDigits /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 6033;BA.debugLine="TextWidth = rectText.Width + 1.5 * Texts.ScaleT";
_textwidth = (int) (_recttext.getWidth()+1.5*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 6034;BA.debugLine="If TextWidth + 0.1 * Texts.ScaleTextHeight > Gr";
if (_textwidth+0.1*_texts.ScaleTextHeight /*int*/ >_graph.XInterval /*double*/ ) { 
 //BA.debugLineNum = 6035;BA.debugLine="LocalBarValueOrientation = \"VERTICAL\"";
_localbarvalueorientation = "VERTICAL";
 //BA.debugLineNum = 6036;BA.debugLine="Log(\"xChart BarValueOrientation set to VERTICA";
__c.LogImpl("910682400","xChart BarValueOrientation set to VERTICAL",0);
 //BA.debugLineNum = 6037;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 6042;BA.debugLine="If LocalBarValueOrientation = \"VERTICAL\" Then";
if ((_localbarvalueorientation).equals("VERTICAL")) { 
 //BA.debugLineNum = 6043;BA.debugLine="Private TextAlignment As String";
_textalignment = "";
 //BA.debugLineNum = 6046;BA.debugLine="If Texts.ScaleTextHeight * 1.5 + 4dip > Graph.Ba";
if (_texts.ScaleTextHeight /*int*/ *1.5+__c.DipToCurrent((int) (4))>_graph.BarWidth /*int*/ ) { 
 //BA.debugLineNum = 6047;BA.debugLine="rectText = xcvsGraph.MeasureText(\"10\", Texts.Sc";
_recttext = _xcvsgraph.MeasureText("10",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 6048;BA.debugLine="LocalTextSize = Min(Texts.ScaleTextSize, Texts.";
_localtextsize = (float) (__c.Min(_texts.ScaleTextSize /*float*/ ,_texts.ScaleTextSize /*float*/ *_graph.BarWidth /*int*/ /(double)_texts.ScaleTextHeight /*int*/ /(double)1.2));
 //BA.debugLineNum = 6049;BA.debugLine="LocalFont = xui.CreateFont2(Texts.ScaleFont, Lo";
_localfont = _xui.CreateFont2(_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_localtextsize);
 //BA.debugLineNum = 6050;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight * Local";
_localtextheight = (int) (_texts.ScaleTextHeight /*int*/ *_localtextsize/(double)_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 6051;BA.debugLine="If LocalTextSize < 6 Then";
if (_localtextsize<6) { 
 //BA.debugLineNum = 6052;BA.debugLine="Log(\"Bar value text size too small\")";
__c.LogImpl("910682416","Bar value text size too small",0);
 //BA.debugLineNum = 6053;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 6057;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step44 = 1;
final int limit44 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit44 ;_i = _i + step44 ) {
 //BA.debugLineNum = 6058;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6060;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 6061;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6062;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 6063;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 6064;BA.debugLine="valText = NumberFormat3(py(0), Values.MaxDigits";
_valtext = _numberformat3(_py[(int) (0)],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 6066;BA.debugLine="If Min(py(0), py(1)) >= Round2(Scale(sY(0)).Min";
if (__c.Min(_py[(int) (0)],_py[(int) (1)])>=__c.Round2(_scale[_sy[(int) (0)]].MinVal /*double*/ ,(int) (14)) && __c.Min(_py[(int) (0)],_py[(int) (1)])<=__c.Round2(_scale[_sy[(int) (0)]].MaxVal /*double*/ ,(int) (14))) { 
 //BA.debugLineNum = 6067;BA.debugLine="xt = Graph.Left + Graph.XOffset + (ip + 0.5) *";
_xt = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ +0.4*_localtextheight);
 //BA.debugLineNum = 6068;BA.debugLine="x = xt - 0.8 * LocalTextHeight";
_x = (int) (_xt-0.8*_localtextheight);
 //BA.debugLineNum = 6069;BA.debugLine="rectText = xcvsGraph.MeasureText(valText, Loca";
_recttext = _xcvsgraph.MeasureText(_valtext,_localfont);
 //BA.debugLineNum = 6070;BA.debugLine="TextWidth = 0.8 * LocalTextHeight + rectText.W";
_textwidth = (int) (0.8*_localtextheight+_recttext.getWidth());
 //BA.debugLineNum = 6071;BA.debugLine="dy = 0.4 * LocalTextHeight";
_dy = (int) (0.4*_localtextheight);
 //BA.debugLineNum = 6073;BA.debugLine="If py(0) >= 0 Then";
if (_py[(int) (0)]>=0) { 
 //BA.debugLineNum = 6074;BA.debugLine="h = Graph.Height - (py(1) - Scale(sY(0)).MinV";
_h = (int) (_graph.Height /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6075;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 6076;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).Min";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6077;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 6078;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6079;BA.debugLine="Col = GetContrastColor(Graph.ChartBackground";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6080;BA.debugLine="rectTextBackground.Initialize(x, y - TextWid";
_recttextbackground.Initialize((float) (_x),(float) (_y-_textwidth),(float) (_x+_localtextheight),(float) (_y));
 //BA.debugLineNum = 6081;BA.debugLine="rectTextBackground.Top = y - TextWidth - 2di";
_recttextbackground.setTop((float) (_y-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6082;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 6083;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 6085;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6086;BA.debugLine="h = (py(0) - Scale(sY(0)).MinVal) * Scale(s";
_h = (int) ((_py[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 6088;BA.debugLine="h = py(0) * Scale(sY(0)).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 6090;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 6091;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).Mi";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6092;BA.debugLine="yt = y + dy";
_yt = (int) (_y+_dy);
 //BA.debugLineNum = 6093;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6094;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6095;BA.debugLine="Col = GetContrastColor(Bar.WickColor)";
_col = _getcontrastcolor(_bar.WickColor /*int*/ );
 }else {
 //BA.debugLineNum = 6097;BA.debugLine="Col = GetContrastColor(Bar.IncreaseColor)";
_col = _getcontrastcolor(_bar.IncreaseColor /*int*/ );
 };
 //BA.debugLineNum = 6099;BA.debugLine="rectTextBackground.Initialize(x, y, x + Loc";
_recttextbackground.Initialize((float) (_x),(float) (_y),(float) (_x+_localtextheight),(float) (_y+_textwidth));
 //BA.debugLineNum = 6100;BA.debugLine="rectTextBackground.Top = y + 2dip";
_recttextbackground.setTop((float) (_y+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6101;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 6103;BA.debugLine="If PD.BarType = \"V\" Then";
if ((_pd.BarType /*String*/ ).equals("V")) { 
 //BA.debugLineNum = 6104;BA.debugLine="y = Graph.Bottom - (py(1) - py(0) - Scale(";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_py[(int) (0)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6105;BA.debugLine="yt = y + dy";
_yt = (int) (_y+_dy);
 //BA.debugLineNum = 6106;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6107;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgrou";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6108;BA.debugLine="rectTextBackground.Initialize(x, y, x + Lo";
_recttextbackground.Initialize((float) (_x),(float) (_y),(float) (_x+_localtextheight),(float) (_y+_textwidth));
 //BA.debugLineNum = 6109;BA.debugLine="rectTextBackground.Top = y + 2dip";
_recttextbackground.setTop((float) (_y+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6110;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 6111;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Gra";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 }else {
 //BA.debugLineNum = 6116;BA.debugLine="h = (py(1) - Scale(sY(0)).MinVal) * Scale(sY(";
_h = (int) ((_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6117;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 6118;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).Min";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6119;BA.debugLine="yt = y + dy";
_yt = (int) (_y+_dy);
 //BA.debugLineNum = 6120;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 6121;BA.debugLine="Col = GetContrastColor(Graph.ChartBackground";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6122;BA.debugLine="rectTextBackground.Initialize(x, y, x + Loca";
_recttextbackground.Initialize((float) (_x),(float) (_y),(float) (_x+_localtextheight),(float) (_y+_textwidth));
 //BA.debugLineNum = 6123;BA.debugLine="rectTextBackground.Top = y + 2dip";
_recttextbackground.setTop((float) (_y+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6124;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 6125;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 6127;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6128;BA.debugLine="h = mYAxis0 - py(0) * Scale(sY(0)).Scale";
_h = (int) (_myaxis0-_py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 6130;BA.debugLine="h = py(0) * Scale(sY(0)).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 6132;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 6133;BA.debugLine="y = mYAxis0 - py(1) * Scale(sY(0)).Scale";
_y = (int) (_myaxis0-_py[(int) (1)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6134;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 6135;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6136;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6137;BA.debugLine="Col = GetContrastColor(Bar.WickColor)";
_col = _getcontrastcolor(_bar.WickColor /*int*/ );
 }else {
 //BA.debugLineNum = 6139;BA.debugLine="Col = GetContrastColor(Bar.DecreaseColor)";
_col = _getcontrastcolor(_bar.DecreaseColor /*int*/ );
 };
 //BA.debugLineNum = 6141;BA.debugLine="rectTextBackground.Initialize(x, y - TextWi";
_recttextbackground.Initialize((float) (_x),(float) (_y-_textwidth),(float) (_x+_localtextheight),(float) (_y));
 //BA.debugLineNum = 6142;BA.debugLine="rectTextBackground.Top = y - TextWidth - 2d";
_recttextbackground.setTop((float) (_y-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6143;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 6145;BA.debugLine="y = mYAxis0 - (py(1) - py(0)) * Scale(sY(0)";
_y = (int) (_myaxis0-(_py[(int) (1)]-_py[(int) (0)])*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6146;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 6147;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 6148;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroun";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6149;BA.debugLine="rectTextBackground.Initialize(x, y - TextWi";
_recttextbackground.Initialize((float) (_x),(float) (_y-_textwidth),(float) (_x+_localtextheight),(float) (_y));
 //BA.debugLineNum = 6150;BA.debugLine="rectTextBackground.Top = y - TextWidth - 2d";
_recttextbackground.setTop((float) (_y-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6151;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 6152;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Grap";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 //BA.debugLineNum = 6156;BA.debugLine="xcvsGraph.DrawTextRotated(valText, xt, yt, Loc";
_xcvsgraph.DrawTextRotated(ba,_valtext,(float) (_xt),(float) (_yt),_localfont,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,_textalignment),(float) (-90));
 };
 }
};
 }else {
 //BA.debugLineNum = 6160;BA.debugLine="Private dyt, dyb As Int";
_dyt = 0;
_dyb = 0;
 //BA.debugLineNum = 6162;BA.debugLine="TextHeight = Texts.ScaleTextHeight * 1.2";
_textheight = (int) (_texts.ScaleTextHeight /*int*/ *1.2);
 //BA.debugLineNum = 6163;BA.debugLine="rectText = xcvsGraph.MeasureText(10, LocalFont)";
_recttext = _xcvsgraph.MeasureText(BA.NumberToString(10),_localfont);
 //BA.debugLineNum = 6164;BA.debugLine="dyt = 0.35 * TextHeight";
_dyt = (int) (0.35*_textheight);
 //BA.debugLineNum = 6165;BA.debugLine="dyb = 0.9 * TextHeight";
_dyb = (int) (0.9*_textheight);
 //BA.debugLineNum = 6167;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step149 = 1;
final int limit149 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit149 ;_i = _i + step149 ) {
 //BA.debugLineNum = 6168;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6170;BA.debugLine="ip = i - Zoom.BeginIndex";
_ip = (int) (_i-_zoom.BeginIndex /*int*/ );
 //BA.debugLineNum = 6171;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6172;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 6173;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 6174;BA.debugLine="valText = NumberFormat3(py(0), Values.MaxDigits";
_valtext = _numberformat3(_py[(int) (0)],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 6175;BA.debugLine="rectText = xcvsGraph.MeasureText(valText, Local";
_recttext = _xcvsgraph.MeasureText(_valtext,_localfont);
 //BA.debugLineNum = 6176;BA.debugLine="TextWidth = rectText.Width + Texts.ScaleTextHei";
_textwidth = (int) (_recttext.getWidth()+_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 6177;BA.debugLine="TextAlignment = \"CENTER\"";
_textalignment = "CENTER";
 //BA.debugLineNum = 6179;BA.debugLine="x = Graph.Left + Graph.XOffset + (ip + 0.5) * G";
_x = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_ip+0.5)*_graph.XInterval /*double*/ );
 //BA.debugLineNum = 6181;BA.debugLine="If py(0) >= 0 Then";
if (_py[(int) (0)]>=0) { 
 //BA.debugLineNum = 6182;BA.debugLine="h = Graph.Height - (py(1) - Scale(sY(0)).MinVa";
_h = (int) (_graph.Height /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ -__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 6183;BA.debugLine="If Abs(h) > TextHeight Then";
if (__c.Abs(_h)>_textheight) { 
 //BA.debugLineNum = 6184;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).MinV";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6185;BA.debugLine="yt = y - dyt";
_yt = (int) (_y-_dyt);
 //BA.debugLineNum = 6186;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundC";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6187;BA.debugLine="rectTextBackground.Initialize(x - TextWidth /";
_recttextbackground.Initialize((float) (_x-_textwidth/(double)2),(float) (_y-_textheight-__c.DipToCurrent((int) (2))),(float) (_x+_textwidth/(double)2),(float) (_y-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6188;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 6190;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6191;BA.debugLine="h = py(0) * Scale(sY(0)).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 6193;BA.debugLine="h = py(0) * Scale(sY(0)).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 6195;BA.debugLine="If Abs(h) > TextHeight Then";
if (__c.Abs(_h)>_textheight) { 
 //BA.debugLineNum = 6198;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6199;BA.debugLine="Col = GetContrastColor(Bar.WickColor)";
_col = _getcontrastcolor(_bar.WickColor /*int*/ );
 //BA.debugLineNum = 6200;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).Mi";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 6202;BA.debugLine="Col = GetContrastColor(Bar.DecreaseColor)";
_col = _getcontrastcolor(_bar.DecreaseColor /*int*/ );
 //BA.debugLineNum = 6203;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).Mi";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 6205;BA.debugLine="yt = y + dyb";
_yt = (int) (_y+_dyb);
 }else {
 //BA.debugLineNum = 6207;BA.debugLine="y = Graph.Bottom - (py(1) - (py(0)) - Scale(";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-(_py[(int) (0)])-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6208;BA.debugLine="yt = y + dyb";
_yt = (int) (_y+_dyb);
 //BA.debugLineNum = 6209;BA.debugLine="Col = GetContrastColor(Graph.ChartBackground";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6210;BA.debugLine="rectTextBackground.Initialize(x - TextWidth";
_recttextbackground.Initialize((float) (_x-_textwidth/(double)2),(float) (_y+__c.DipToCurrent((int) (2))),(float) (_x+_textwidth/(double)2),(float) (_y+_textheight+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6211;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 }else {
 //BA.debugLineNum = 6215;BA.debugLine="h = (py(1) - Scale(sY(0)).MinVal) * Scale(sY(0";
_h = (int) ((_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6216;BA.debugLine="If Abs(h) > TextHeight Then";
if (__c.Abs(_h)>_textheight) { 
 //BA.debugLineNum = 6217;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).MinV";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6218;BA.debugLine="yt = y + dyb";
_yt = (int) (_y+_dyb);
 //BA.debugLineNum = 6219;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundC";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6220;BA.debugLine="rectTextBackground.Initialize(x - TextWidth /";
_recttextbackground.Initialize((float) (_x-_textwidth/(double)2),(float) (_y+__c.DipToCurrent((int) (2))),(float) (_x+_textwidth/(double)2),(float) (_y+_textheight+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6221;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 6223;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6224;BA.debugLine="h = py(1) * Scale(sY(0)).Scale";
_h = (int) (_py[(int) (1)]*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 6226;BA.debugLine="h = Abs(py(1) - py(0)) * Scale(sY(0)).Scale";
_h = (int) (__c.Abs(_py[(int) (1)]-_py[(int) (0)])*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 6228;BA.debugLine="If Abs(h) > TextHeight Then";
if (__c.Abs(_h)>_textheight) { 
 //BA.debugLineNum = 6229;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).Min";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6230;BA.debugLine="yt = y - dyt";
_yt = (int) (_y-_dyt);
 //BA.debugLineNum = 6231;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 6232;BA.debugLine="Col = GetContrastColor(Bar.WickColor)";
_col = _getcontrastcolor(_bar.WickColor /*int*/ );
 }else {
 //BA.debugLineNum = 6234;BA.debugLine="Col = GetContrastColor(Bar.DecreaseColor)";
_col = _getcontrastcolor(_bar.DecreaseColor /*int*/ );
 };
 }else {
 //BA.debugLineNum = 6237;BA.debugLine="y = Graph.Bottom - (py(1) - Scale(sY(0)).Min";
_y = (int) (_graph.Bottom /*int*/ -(_py[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 6238;BA.debugLine="yt = y + dyb";
_yt = (int) (_y+_dyb);
 //BA.debugLineNum = 6239;BA.debugLine="Col = GetContrastColor(Graph.ChartBackground";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 6240;BA.debugLine="rectTextBackground.Initialize(x - TextWidth";
_recttextbackground.Initialize((float) (_x-_textwidth/(double)2),(float) (_y+__c.DipToCurrent((int) (2))),(float) (_x+_textwidth/(double)2),(float) (_y+_textheight+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 6241;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 };
 //BA.debugLineNum = 6245;BA.debugLine="xcvsGraph.DrawText(valText, x, yt, Texts.ScaleF";
_xcvsgraph.DrawText(ba,_valtext,(float) (_x),(float) (_yt),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
 };
 //BA.debugLineNum = 6248;BA.debugLine="End Sub";
return "";
}
public String  _drawxscalelog() throws Exception{
int _xi = 0;
int _x0 = 0;
int _xn = 0;
int _manti = 0;
int _logi = 0;
int _l1 = 0;
String _txt = "";
double _val0 = 0;
double _h1 = 0;
double _h2 = 0;
double _h3 = 0;
double _h4 = 0;
double _h5 = 0;
 //BA.debugLineNum = 3634;BA.debugLine="Private Sub DrawXScaleLog";
 //BA.debugLineNum = 3635;BA.debugLine="Private xi, x0, xn, Manti, Logi, l1 As Int";
_xi = 0;
_x0 = 0;
_xn = 0;
_manti = 0;
_logi = 0;
_l1 = 0;
 //BA.debugLineNum = 3636;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 3637;BA.debugLine="Private Val0 As Double";
_val0 = 0;
 //BA.debugLineNum = 3638;BA.debugLine="Private h1, h2, h3, h4, h5 As Double";
_h1 = 0;
_h2 = 0;
_h3 = 0;
_h4 = 0;
_h5 = 0;
 //BA.debugLineNum = 3647;BA.debugLine="h1 = 1.1";
_h1 = 1.1;
 //BA.debugLineNum = 3648;BA.debugLine="h2 = 0.25";
_h2 = 0.25;
 //BA.debugLineNum = 3649;BA.debugLine="h3 = 0.3";
_h3 = 0.3;
 //BA.debugLineNum = 3650;BA.debugLine="h4 = 0.6";
_h4 = 0.6;
 //BA.debugLineNum = 3651;BA.debugLine="h5 = 0.8";
_h5 = 0.8;
 //BA.debugLineNum = 3653;BA.debugLine="l1 = 4dip";
_l1 = __c.DipToCurrent((int) (4));
 //BA.debugLineNum = 3655;BA.debugLine="x0 = Graph.Left - (ScaleLog(sX).MantMin + ScaleLo";
_x0 = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 3656;BA.debugLine="Val0 = -1";
_val0 = -1;
 //BA.debugLineNum = 3657;BA.debugLine="Manti = ScaleLog(sX).MantMin";
_manti = _scalelog[_sx].MantMin /*int*/ ;
 //BA.debugLineNum = 3658;BA.debugLine="Logi = ScaleLog(sX).LogMinIndex";
_logi = _scalelog[_sx].LogMinIndex /*int*/ ;
 //BA.debugLineNum = 3659;BA.debugLine="Do While Val0 < Scale(sX).MaxVal";
while (_val0<_scale[_sx].MaxVal /*double*/ ) {
 //BA.debugLineNum = 3660;BA.debugLine="xi = x0 + (ScaleLog(sX).Logs(Logi) + Manti) * Sc";
_xi = (int) (_x0+(_scalelog[_sx].Logs /*double[]*/ [_logi]+_manti)*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 3661;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Bottom - 4dip, xi,";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Bottom /*int*/ -__c.DipToCurrent((int) (4))),(float) (_xi),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3662;BA.debugLine="If ScaleLog(sX).Logs(Logi) <> 0 Then";
if (_scalelog[_sx].Logs /*double[]*/ [_logi]!=0) { 
 //BA.debugLineNum = 3663;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Top, xi, Graph.Bot";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Top /*int*/ ),(float) (_xi),(float) (_graph.Bottom /*int*/ ),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 3665;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Top, xi, Graph.Bot";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Top /*int*/ ),(float) (_xi),(float) (_graph.Bottom /*int*/ ),_graph.GridColorDark /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 3667;BA.debugLine="Val0 = Power(10, ScaleLog(sX).Logs(Logi) + Manti";
_val0 = __c.Power(10,_scalelog[_sx].Logs /*double[]*/ [_logi]+_manti);
 //BA.debugLineNum = 3668;BA.debugLine="txt = NumberFormat3(Val0, 6)";
_txt = _numberformat3(_val0,(int) (6));
 //BA.debugLineNum = 3670;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 3672;BA.debugLine="If (xi - xn) > 1.3 * MeasureTextWidth(txt, Tex";
if ((_xi-_xn)>1.3*_measuretextwidth(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )) { 
 //BA.debugLineNum = 3673;BA.debugLine="xcvsGraph.DrawText(txt, xi, Graph.Bottom + h1";
_xcvsgraph.DrawText(ba,_txt,(float) (_xi),(float) (_graph.Bottom /*int*/ +_h1*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 3674;BA.debugLine="xn = xi";
_xn = _xi;
 };
 break; }
case 1: {
 //BA.debugLineNum = 3677;BA.debugLine="If (xi - xn) > 1.8 * Texts.ScaleTextHeight The";
if ((_xi-_xn)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3678;BA.debugLine="xcvsGraph.DrawTextRotated(txt, xi + h2 * Text";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_xi+_h2*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-90));
 //BA.debugLineNum = 3679;BA.debugLine="xn = xi";
_xn = _xi;
 };
 break; }
case 2: {
 //BA.debugLineNum = 3682;BA.debugLine="If (xi - xn) > 1.8 * Texts.ScaleTextHeight The";
if ((_xi-_xn)>1.8*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 3683;BA.debugLine="xcvsGraph.DrawTextRotated(txt, xi + h3 * Text";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_xi+_h3*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h5*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-45));
 //BA.debugLineNum = 3684;BA.debugLine="xn = xi";
_xn = _xi;
 };
 //BA.debugLineNum = 3686;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Bottom, xi, Graph";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Bottom /*int*/ ),(float) (_xi),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 3689;BA.debugLine="Logi = Logi + 1";
_logi = (int) (_logi+1);
 //BA.debugLineNum = 3690;BA.debugLine="If Logi = ScaleLog(sX).Logs.Length - 1 Then";
if (_logi==_scalelog[_sx].Logs /*double[]*/ .length-1) { 
 //BA.debugLineNum = 3691;BA.debugLine="Logi = 0";
_logi = (int) (0);
 //BA.debugLineNum = 3692;BA.debugLine="Manti = Manti + 1";
_manti = (int) (_manti+1);
 };
 }
;
 //BA.debugLineNum = 3695;BA.debugLine="End Sub";
return "";
}
public String  _drawyscalelog() throws Exception{
int _yi = 0;
int _y0 = 0;
int _manti = 0;
int _logi = 0;
String _txt = "";
double _val0 = 0;
 //BA.debugLineNum = 3413;BA.debugLine="Private Sub DrawYScaleLog";
 //BA.debugLineNum = 3414;BA.debugLine="Private yi, y0, Manti, Logi As Int";
_yi = 0;
_y0 = 0;
_manti = 0;
_logi = 0;
 //BA.debugLineNum = 3415;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 3416;BA.debugLine="Private Val0 As Double";
_val0 = 0;
 //BA.debugLineNum = 3418;BA.debugLine="ScaleLog(sY(0)).Scale = Graph.Height / (ScaleLog(";
_scalelog[_sy[(int) (0)]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scalelog[_sy[(int) (0)]].MantMax /*int*/ +_scalelog[_sy[(int) (0)]].LogMax /*double*/ -_scalelog[_sy[(int) (0)]].MantMin /*int*/ -_scalelog[_sy[(int) (0)]].LogMin /*double*/ );
 //BA.debugLineNum = 3419;BA.debugLine="y0 = Graph.Bottom + (ScaleLog(sY(0)).MantMin + Sc";
_y0 = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy[(int) (0)]].MantMin /*int*/ +_scalelog[_sy[(int) (0)]].LogMin /*double*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 3420;BA.debugLine="Val0 = -1";
_val0 = -1;
 //BA.debugLineNum = 3421;BA.debugLine="Manti = ScaleLog(sY(0)).MantMin";
_manti = _scalelog[_sy[(int) (0)]].MantMin /*int*/ ;
 //BA.debugLineNum = 3422;BA.debugLine="Logi = ScaleLog(sY(0)).LogMinIndex";
_logi = _scalelog[_sy[(int) (0)]].LogMinIndex /*int*/ ;
 //BA.debugLineNum = 3423;BA.debugLine="Do While Val0 < Round2(Scale(sY(0)).MaxVal, 12)";
while (_val0<__c.Round2(_scale[_sy[(int) (0)]].MaxVal /*double*/ ,(int) (12))) {
 //BA.debugLineNum = 3424;BA.debugLine="yi = y0 - (ScaleLog(sY(0)).Logs(Logi) + Manti) *";
_yi = (int) (_y0-(_scalelog[_sy[(int) (0)]].Logs /*double[]*/ [_logi]+_manti)*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 3425;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - 4dip, yi, Graph.";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (4))),(float) (_yi),(float) (_graph.Left /*int*/ ),(float) (_yi),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 3426;BA.debugLine="If Graph.DrawHorizontalGridLines = True Then";
if (_graph.DrawHorizontalGridLines /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3427;BA.debugLine="If ScaleLog(sY(0)).Logs(Logi) <> 0 Then";
if (_scalelog[_sy[(int) (0)]].Logs /*double[]*/ [_logi]!=0) { 
 //BA.debugLineNum = 3428;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, yi, Graph.Right";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_yi),(float) (_graph.Right /*int*/ ),(float) (_yi),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 3430;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, yi, Graph.Right";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_yi),(float) (_graph.Right /*int*/ ),(float) (_yi),_graph.GridColorDark /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 3434;BA.debugLine="If Scale(sY(0)).DrawYScale = True Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 3435;BA.debugLine="Val0 = Round2(Power(10, ScaleLog(sY(0)).Logs(Lo";
_val0 = __c.Round2(__c.Power(10,_scalelog[_sy[(int) (0)]].Logs /*double[]*/ [_logi]+_manti),(int) (12));
 //BA.debugLineNum = 3436;BA.debugLine="txt = NumberFormat3(Val0, 6)";
_txt = _numberformat3(_val0,(int) (6));
 //BA.debugLineNum = 3438;BA.debugLine="xcvsGraph.DrawText(txt, Graph.Left - 0.75 * Text";
_xcvsgraph.DrawText(ba,_txt,(float) (_graph.Left /*int*/ -0.75*_texts.ScaleTextHeight /*int*/ ),(float) (_yi+0.52*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 3445;BA.debugLine="Logi = Logi + 1";
_logi = (int) (_logi+1);
 //BA.debugLineNum = 3446;BA.debugLine="If Logi = ScaleLog(sY(0)).Logs.Length - 1 Then";
if (_logi==_scalelog[_sy[(int) (0)]].Logs /*double[]*/ .length-1) { 
 //BA.debugLineNum = 3447;BA.debugLine="Logi = 0";
_logi = (int) (0);
 //BA.debugLineNum = 3448;BA.debugLine="Manti = Manti + 1";
_manti = (int) (_manti+1);
 };
 };
 }
;
 //BA.debugLineNum = 3452;BA.debugLine="End Sub";
return "";
}
public String  _drawyxchartvalues(float _cursx,float _cursy) throws Exception{
double _pointx = 0;
double _pointy = 0;
double _logval = 0;
int _ic = 0;
int _ip = 0;
int _x0 = 0;
int _y0 = 0;
int _xi = 0;
int _yi = 0;
boolean _found = false;
b4a.example.xchart._itemdata _id = null;
double _dx = 0;
double _dy = 0;
double[] _yx = null;
int _cx = 0;
int _cy = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rectdisplay = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
int _wcurvename = 0;
int _wtextx = 0;
int _wtexty = 0;
int _x = 0;
int _y = 0;
int _yrecttop = 0;
int _texttop = 0;
int _textleft = 0;
int _hdisplay = 0;
int _wdisplay = 0;
String _txtx = "";
String _txty = "";
 //BA.debugLineNum = 8511;BA.debugLine="Private Sub DrawYXChartValues(CursX As Float, Curs";
 //BA.debugLineNum = 8512;BA.debugLine="Private PointX, PointY, LogVal As Double";
_pointx = 0;
_pointy = 0;
_logval = 0;
 //BA.debugLineNum = 8513;BA.debugLine="Private ic, ip As Int";
_ic = 0;
_ip = 0;
 //BA.debugLineNum = 8514;BA.debugLine="Private x0, y0, xi, yi As Int";
_x0 = 0;
_y0 = 0;
_xi = 0;
_yi = 0;
 //BA.debugLineNum = 8515;BA.debugLine="Private Found = False As Boolean";
_found = __c.False;
 //BA.debugLineNum = 8517;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8518;BA.debugLine="PointX = Scale(sX).MinVal + (CursX - Graph.Left)";
_pointx = _scale[_sx].MinVal /*double*/ +(_cursx-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 8520;BA.debugLine="LogVal = (CursX - Graph.Left) / ScaleLog(sX).Sca";
_logval = (_cursx-_graph.Left /*int*/ )/(double)_scalelog[_sx].Scale /*double*/ +_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ ;
 //BA.debugLineNum = 8521;BA.debugLine="PointX = Power(10, LogVal)";
_pointx = __c.Power(10,_logval);
 };
 //BA.debugLineNum = 8524;BA.debugLine="If Scale(sY(0)).Logarithmic = False Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8525;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8526;BA.debugLine="PointY = Scale(sY(0)).MaxVal - (CursY - Graph.T";
_pointy = _scale[_sy[(int) (0)]].MaxVal /*double*/ -(_cursy-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 8528;BA.debugLine="PointY = Scale(sY(0)).MinVal + (CursY - Graph.T";
_pointy = _scale[_sy[(int) (0)]].MinVal /*double*/ +(_cursy-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 };
 }else {
 //BA.debugLineNum = 8531;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8532;BA.debugLine="LogVal = ScaleLog(sY(0)).MantMax + ScaleLog(sY(";
_logval = _scalelog[_sy[(int) (0)]].MantMax /*int*/ +_scalelog[_sy[(int) (0)]].LogMax /*double*/ -(_cursy-_graph.Top /*int*/ )/(double)_scalelog[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 8534;BA.debugLine="LogVal = ScaleLog(sY(0)).MantMin - ScaleLog(sY(";
_logval = _scalelog[_sy[(int) (0)]].MantMin /*int*/ -_scalelog[_sy[(int) (0)]].LogMin /*double*/ +(_cursy-_graph.Top /*int*/ )/(double)_scalelog[_sy[(int) (0)]].Scale /*double*/ ;
 };
 //BA.debugLineNum = 8536;BA.debugLine="PointY = Power(10, LogVal)";
_pointy = __c.Power(10,_logval);
 };
 //BA.debugLineNum = 8539;BA.debugLine="If Scale(sX).Logarithmic = False And Scale(sY(0))";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False && _scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8540;BA.debugLine="For ic = 0 To Items.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_items.getSize()-1);
_ic = (int) (0) ;
for (;_ic <= limit26 ;_ic = _ic + step26 ) {
 //BA.debugLineNum = 8541;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 8542;BA.debugLine="Private dx, dy As Double";
_dx = 0;
_dy = 0;
 //BA.debugLineNum = 8544;BA.debugLine="ID = Items.Get(ic)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_ic));
 //BA.debugLineNum = 8545;BA.debugLine="dx = 5dip / Scale(sX).Scale";
_dx = __c.DipToCurrent((int) (5))/(double)_scale[_sx].Scale /*double*/ ;
 //BA.debugLineNum = 8546;BA.debugLine="dy = 5dip / Scale(sY(0)).Scale";
_dy = __c.DipToCurrent((int) (5))/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 8548;BA.debugLine="For ip = 0 To ID.YXArray.Size - 1";
{
final int step32 = 1;
final int limit32 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_ip = (int) (0) ;
for (;_ip <= limit32 ;_ip = _ip + step32 ) {
 //BA.debugLineNum = 8549;BA.debugLine="Private YX(2) As Double";
_yx = new double[(int) (2)];
;
 //BA.debugLineNum = 8550;BA.debugLine="YX = ID.YXArray.Get(ip)";
_yx = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_ip));
 //BA.debugLineNum = 8551;BA.debugLine="If Abs(YX(0) - PointX) < dx And Abs(YX(1) - Po";
if (__c.Abs(_yx[(int) (0)]-_pointx)<_dx && __c.Abs(_yx[(int) (1)]-_pointy)<_dy) { 
 //BA.debugLineNum = 8552;BA.debugLine="Found = True";
_found = __c.True;
 //BA.debugLineNum = 8553;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 8556;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8557;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else if(_scale[_sx].Logarithmic /*boolean*/ ==__c.True && _scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8561;BA.debugLine="For ic = 0 To Items.Size - 1";
{
final int step45 = 1;
final int limit45 = (int) (_items.getSize()-1);
_ic = (int) (0) ;
for (;_ic <= limit45 ;_ic = _ic + step45 ) {
 //BA.debugLineNum = 8562;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 8563;BA.debugLine="Private dx, dy As Double";
_dx = 0;
_dy = 0;
 //BA.debugLineNum = 8565;BA.debugLine="ID = Items.Get(ic)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_ic));
 //BA.debugLineNum = 8566;BA.debugLine="dx = 5dip";
_dx = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 8567;BA.debugLine="dy = 5dip / Scale(sY(0)).Scale";
_dy = __c.DipToCurrent((int) (5))/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 //BA.debugLineNum = 8569;BA.debugLine="xi = Graph.Left - (ScaleLog(sX).MantMin + Scale";
_xi = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 8570;BA.debugLine="For ip = 0 To ID.YXArray.Size - 1";
{
final int step52 = 1;
final int limit52 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_ip = (int) (0) ;
for (;_ip <= limit52 ;_ip = _ip + step52 ) {
 //BA.debugLineNum = 8571;BA.debugLine="Private YX(2) As Double";
_yx = new double[(int) (2)];
;
 //BA.debugLineNum = 8572;BA.debugLine="YX = ID.YXArray.Get(ip)";
_yx = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_ip));
 //BA.debugLineNum = 8573;BA.debugLine="x0 = xi + Logarithm(YX(0), 10) * ScaleLog(sX).";
_x0 = (int) (_xi+__c.Logarithm(_yx[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 8574;BA.debugLine="If Abs(x0 - CursX) < dx And Abs(YX(1) - PointY";
if (__c.Abs(_x0-_cursx)<_dx && __c.Abs(_yx[(int) (1)]-_pointy)<_dy) { 
 //BA.debugLineNum = 8575;BA.debugLine="Found = True";
_found = __c.True;
 //BA.debugLineNum = 8576;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 8579;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8580;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else if(_scale[_sx].Logarithmic /*boolean*/ ==__c.False && _scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 8584;BA.debugLine="For ic = 0 To Items.Size - 1";
{
final int step66 = 1;
final int limit66 = (int) (_items.getSize()-1);
_ic = (int) (0) ;
for (;_ic <= limit66 ;_ic = _ic + step66 ) {
 //BA.debugLineNum = 8585;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 8586;BA.debugLine="Private dx, dy As Double";
_dx = 0;
_dy = 0;
 //BA.debugLineNum = 8588;BA.debugLine="ID = Items.Get(ic)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_ic));
 //BA.debugLineNum = 8589;BA.debugLine="dx = 5dip / Scale(sX).Scale";
_dx = __c.DipToCurrent((int) (5))/(double)_scale[_sx].Scale /*double*/ ;
 //BA.debugLineNum = 8590;BA.debugLine="dy = 5dip";
_dy = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 8592;BA.debugLine="yi = Graph.Bottom + (ScaleLog(sY(0)).MantMin +";
_yi = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy[(int) (0)]].MantMin /*int*/ +_scalelog[_sy[(int) (0)]].LogMin /*double*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 8593;BA.debugLine="For ip = 0 To ID.YXArray.Size - 1";
{
final int step73 = 1;
final int limit73 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_ip = (int) (0) ;
for (;_ip <= limit73 ;_ip = _ip + step73 ) {
 //BA.debugLineNum = 8594;BA.debugLine="Private YX(2) As Double";
_yx = new double[(int) (2)];
;
 //BA.debugLineNum = 8595;BA.debugLine="YX = ID.YXArray.Get(ip)";
_yx = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_ip));
 //BA.debugLineNum = 8596;BA.debugLine="y0 = yi - Logarithm(YX(1), 10) * ScaleLog(sY(0";
_y0 = (int) (_yi-__c.Logarithm(_yx[(int) (1)],10)*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 8597;BA.debugLine="If Abs(YX(0) - PointX) < dx And Abs(y0 - CursY";
if (__c.Abs(_yx[(int) (0)]-_pointx)<_dx && __c.Abs(_y0-_cursy)<_dy) { 
 //BA.debugLineNum = 8598;BA.debugLine="Found = True";
_found = __c.True;
 //BA.debugLineNum = 8599;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 8602;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8603;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else if(_scale[_sx].Logarithmic /*boolean*/ ==__c.True && _scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 8607;BA.debugLine="For ic = 0 To Items.Size - 1";
{
final int step87 = 1;
final int limit87 = (int) (_items.getSize()-1);
_ic = (int) (0) ;
for (;_ic <= limit87 ;_ic = _ic + step87 ) {
 //BA.debugLineNum = 8608;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 8609;BA.debugLine="Private dx, dy As Double";
_dx = 0;
_dy = 0;
 //BA.debugLineNum = 8611;BA.debugLine="ID = Items.Get(ic)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_ic));
 //BA.debugLineNum = 8612;BA.debugLine="dx = 5dip";
_dx = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 8613;BA.debugLine="dy = 5dip";
_dy = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 8615;BA.debugLine="xi = Graph.Left - (ScaleLog(sX).MantMin + Scale";
_xi = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 8616;BA.debugLine="yi = Graph.Bottom + (ScaleLog(sY(0)).MantMin +";
_yi = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy[(int) (0)]].MantMin /*int*/ +_scalelog[_sy[(int) (0)]].LogMin /*double*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 8617;BA.debugLine="For ip = 0 To ID.YXArray.Size - 1";
{
final int step95 = 1;
final int limit95 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_ip = (int) (0) ;
for (;_ip <= limit95 ;_ip = _ip + step95 ) {
 //BA.debugLineNum = 8618;BA.debugLine="Private YX(2) As Double";
_yx = new double[(int) (2)];
;
 //BA.debugLineNum = 8619;BA.debugLine="YX = ID.YXArray.Get(ip)";
_yx = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_ip));
 //BA.debugLineNum = 8620;BA.debugLine="x0 = xi + Logarithm(YX(0), 10) * ScaleLog(sX).";
_x0 = (int) (_xi+__c.Logarithm(_yx[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 8621;BA.debugLine="y0 = yi - Logarithm(YX(1), 10) * ScaleLog(sY(0";
_y0 = (int) (_yi-__c.Logarithm(_yx[(int) (1)],10)*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 8623;BA.debugLine="If Abs(x0 - CursX) < dx And Abs(y0 - CursY) <";
if (__c.Abs(_x0-_cursx)<_dx && __c.Abs(_y0-_cursy)<_dy) { 
 //BA.debugLineNum = 8624;BA.debugLine="Found = True";
_found = __c.True;
 //BA.debugLineNum = 8625;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 8628;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8629;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 8634;BA.debugLine="xcvsCursor.ClearRect(xcvsCursor.TargetRect)";
_xcvscursor.ClearRect(_xcvscursor.getTargetRect());
 //BA.debugLineNum = 8635;BA.debugLine="xcvsValues.ClearRect(xcvsValues.TargetRect)";
_xcvsvalues.ClearRect(_xcvsvalues.getTargetRect());
 //BA.debugLineNum = 8637;BA.debugLine="If mYXChartDisplayCrossHair = True Then";
if (_myxchartdisplaycrosshair==__c.True) { 
 //BA.debugLineNum = 8638;BA.debugLine="If Found = False Then";
if (_found==__c.False) { 
 //BA.debugLineNum = 8639;BA.debugLine="xcvsCursor.DrawLine(CursX, Graph.Top, CursX, Gr";
_xcvscursor.DrawLine(_cursx,(float) (_graph.Top /*int*/ ),_cursx,(float) (_graph.Bottom /*int*/ ),_myxchartcrosshaircolor,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 8640;BA.debugLine="xcvsCursor.DrawLine(Graph.Left, CursY, Graph.Ri";
_xcvscursor.DrawLine((float) (_graph.Left /*int*/ ),_cursy,(float) (_graph.Right /*int*/ ),_cursy,_myxchartcrosshaircolor,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 8642;BA.debugLine="Private cx, cy As Int";
_cx = 0;
_cy = 0;
 //BA.debugLineNum = 8643;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8644;BA.debugLine="cx = (YX(0) - Scale(sX).MinVal) * Scale(sX).Sc";
_cx = (int) ((_yx[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ +_graph.Left /*int*/ );
 }else {
 //BA.debugLineNum = 8646;BA.debugLine="xi = Graph.Left - (ScaleLog(sX).MantMin + Scal";
_xi = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 8647;BA.debugLine="cx = xi + Logarithm(YX(0), 10) * ScaleLog(sX).";
_cx = (int) (_xi+__c.Logarithm(_yx[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 };
 //BA.debugLineNum = 8650;BA.debugLine="If Scale(sY(0)).Logarithmic = False Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8651;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 8652;BA.debugLine="cy =  Graph.Bottom - (YX(1) - Scale(sY(0)).Mi";
_cy = (int) (_graph.Bottom /*int*/ -(_yx[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 8654;BA.debugLine="cy =  Graph.Top + (YX(1) - Scale(sY(0)).MinVa";
_cy = (int) (_graph.Top /*int*/ +(_yx[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 }else {
 //BA.debugLineNum = 8657;BA.debugLine="yi = Graph.Bottom + (ScaleLog(sY(0)).MantMin +";
_yi = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy[(int) (0)]].MantMin /*int*/ +_scalelog[_sy[(int) (0)]].LogMin /*double*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 8658;BA.debugLine="cy = yi - Logarithm(YX(1), 10) * ScaleLog(sY(0";
_cy = (int) (_yi-__c.Logarithm(_yx[(int) (1)],10)*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 8660;BA.debugLine="xcvsCursor.DrawLine(cx, Graph.Top, cx, Graph.Bo";
_xcvscursor.DrawLine((float) (_cx),(float) (_graph.Top /*int*/ ),(float) (_cx),(float) (_graph.Bottom /*int*/ ),_id.Color /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 8661;BA.debugLine="xcvsCursor.DrawLine(Graph.Left, cy, Graph.Right";
_xcvscursor.DrawLine((float) (_graph.Left /*int*/ ),(float) (_cy),(float) (_graph.Right /*int*/ ),(float) (_cy),_id.Color /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 8662;BA.debugLine="If ID.PointType = \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE")) { 
 //BA.debugLineNum = 8663;BA.debugLine="xcvsCursor.DrawCircle(cx, cy, 5dip, ID.Color,";
_xcvscursor.DrawCircle((float) (_cx),(float) (_cy),(float) (__c.DipToCurrent((int) (5))),_id.Color /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 };
 //BA.debugLineNum = 8668;BA.debugLine="If mYXChartDisplayValues = True Then";
if (_myxchartdisplayvalues==__c.True) { 
 //BA.debugLineNum = 8669;BA.debugLine="Private rectDisplay, rectText As B4XRect";
_rectdisplay = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 8670;BA.debugLine="Private wCurveName, wTextX, wTextY As Int";
_wcurvename = 0;
_wtextx = 0;
_wtexty = 0;
 //BA.debugLineNum = 8671;BA.debugLine="Private x, y, yRectTop, TextTop, TextLeft, hDisp";
_x = 0;
_y = 0;
_yrecttop = 0;
_texttop = 0;
_textleft = 0;
_hdisplay = 0;
_wdisplay = 0;
 //BA.debugLineNum = 8672;BA.debugLine="Private txtX, txtY As String";
_txtx = "";
_txty = "";
 //BA.debugLineNum = 8674;BA.debugLine="rectText = xcvsCursor.MeasureText(\"My\", Texts.Sc";
_recttext = _xcvscursor.MeasureText("My",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8675;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8676;BA.debugLine="txtX = \"x = \" & NumberFormat3(YX(0), 6)";
_txtx = "x = "+_numberformat3(_yx[(int) (0)],(int) (6));
 //BA.debugLineNum = 8677;BA.debugLine="txtY = \"y = \" & NumberFormat3(YX(1), 6)";
_txty = "y = "+_numberformat3(_yx[(int) (1)],(int) (6));
 //BA.debugLineNum = 8678;BA.debugLine="wCurveName = MeasureTextWidth(ID.Name, Texts.Sc";
_wcurvename = _measuretextwidth(_id.Name /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8679;BA.debugLine="wTextX = MeasureTextWidth(txtX, Texts.ScaleFont";
_wtextx = _measuretextwidth(_txtx,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8680;BA.debugLine="wTextY = MeasureTextWidth(txtY, Texts.ScaleFont";
_wtexty = _measuretextwidth(_txty,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8681;BA.debugLine="wDisplay = Max(wCurveName, wTextX)";
_wdisplay = (int) (__c.Max(_wcurvename,_wtextx));
 //BA.debugLineNum = 8682;BA.debugLine="wDisplay = Max(wTextY, wDisplay) + 10dip";
_wdisplay = (int) (__c.Max(_wtexty,_wdisplay)+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 8683;BA.debugLine="hDisplay = 3.1 * rectText.Height + 10dip";
_hdisplay = (int) (3.1*_recttext.getHeight()+__c.DipToCurrent((int) (10)));
 }else {
 //BA.debugLineNum = 8685;BA.debugLine="txtX = \"x = \" & NumberFormat3(PointX, 6)";
_txtx = "x = "+_numberformat3(_pointx,(int) (6));
 //BA.debugLineNum = 8686;BA.debugLine="txtY = \"y = \" & NumberFormat3(PointY, 6)";
_txty = "y = "+_numberformat3(_pointy,(int) (6));
 //BA.debugLineNum = 8687;BA.debugLine="wTextX = MeasureTextWidth(txtX, Texts.ScaleFont";
_wtextx = _measuretextwidth(_txtx,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8688;BA.debugLine="wTextY = MeasureTextWidth(txtY, Texts.ScaleFont";
_wtexty = _measuretextwidth(_txty,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 8689;BA.debugLine="wDisplay = Max(wTextX, wTextY) + 10dip";
_wdisplay = (int) (__c.Max(_wtextx,_wtexty)+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 8690;BA.debugLine="hDisplay = 2 * rectText.Height + 10dip";
_hdisplay = (int) (2*_recttext.getHeight()+__c.DipToCurrent((int) (10)));
 };
 //BA.debugLineNum = 8693;BA.debugLine="If mYXChartDisplayPosition = \"CORNERS\" Then";
if ((_myxchartdisplayposition).equals("CORNERS")) { 
 //BA.debugLineNum = 8694;BA.debugLine="yRectTop = Graph.Top + 2dip '2dip to be insides";
_yrecttop = (int) (_graph.Top /*int*/ +__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 8695;BA.debugLine="TextTop = yRectTop + 5dip";
_texttop = (int) (_yrecttop+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 8696;BA.debugLine="If CursX < (Graph.Left + Graph.Right) / 2 Then";
if (_cursx<(_graph.Left /*int*/ +_graph.Right /*int*/ )/(double)2) { 
 //BA.debugLineNum = 8697;BA.debugLine="TextLeft = Graph.Left + 5dip";
_textleft = (int) (_graph.Left /*int*/ +__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 8698;BA.debugLine="rectDisplay.Initialize(Graph.Left + 2dip, yRec";
_rectdisplay.Initialize((float) (_graph.Left /*int*/ +__c.DipToCurrent((int) (2))),(float) (_yrecttop),(float) (_graph.Left /*int*/ +_wdisplay),(float) (_yrecttop+_hdisplay));
 }else {
 //BA.debugLineNum = 8700;BA.debugLine="TextLeft = Graph.Right - wDisplay + 3dip	'3dip";
_textleft = (int) (_graph.Right /*int*/ -_wdisplay+__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 8701;BA.debugLine="rectDisplay.Initialize(Graph.Right - wDisplay";
_rectdisplay.Initialize((float) (_graph.Right /*int*/ -_wdisplay-__c.DipToCurrent((int) (2))),(float) (_yrecttop),(float) (_graph.Right /*int*/ -__c.DipToCurrent((int) (2))),(float) (_yrecttop+_hdisplay));
 };
 }else {
 //BA.debugLineNum = 8710;BA.debugLine="x = Max(Graph.Left + 5dip, CursX - wDisplay / 2";
_x = (int) (__c.Max(_graph.Left /*int*/ +__c.DipToCurrent((int) (5)),_cursx-_wdisplay/(double)2));
 //BA.debugLineNum = 8711;BA.debugLine="x = Min(Graph.Right - 5dip - wDisplay, x)";
_x = (int) (__c.Min(_graph.Right /*int*/ -__c.DipToCurrent((int) (5))-_wdisplay,_x));
 //BA.debugLineNum = 8712;BA.debugLine="TextLeft = x + 5dip";
_textleft = (int) (_x+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 8713;BA.debugLine="If CursY > Graph.Top + hDisplay + 10dip Then";
if (_cursy>_graph.Top /*int*/ +_hdisplay+__c.DipToCurrent((int) (10))) { 
 //BA.debugLineNum = 8714;BA.debugLine="y = CursY - hDisplay - 10dip";
_y = (int) (_cursy-_hdisplay-__c.DipToCurrent((int) (10)));
 }else {
 //BA.debugLineNum = 8716;BA.debugLine="y = CursY + 10dip";
_y = (int) (_cursy+__c.DipToCurrent((int) (10)));
 };
 //BA.debugLineNum = 8718;BA.debugLine="rectDisplay.Initialize(x, y, x + wDisplay, y +";
_rectdisplay.Initialize((float) (_x),(float) (_y),(float) (_x+_wdisplay),(float) (_y+_hdisplay));
 //BA.debugLineNum = 8719;BA.debugLine="TextTop = y + 5dip";
_texttop = (int) (_y+__c.DipToCurrent((int) (5)));
 };
 //BA.debugLineNum = 8723;BA.debugLine="xcvsValues.DrawRect(rectDisplay, Values.Backgrou";
_xcvsvalues.DrawRect(_rectdisplay,_values.BackgroundColor /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 8725;BA.debugLine="If Found = True Then";
if (_found==__c.True) { 
 //BA.debugLineNum = 8726;BA.debugLine="xcvsValues.DrawText(ID.Name, TextLeft, TextTop";
_xcvsvalues.DrawText(ba,_id.Name /*String*/ ,(float) (_textleft),(float) (_texttop-_recttext.getTop()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_id.Color /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8727;BA.debugLine="xcvsValues.DrawText(txtX, TextLeft, TextTop - r";
_xcvsvalues.DrawText(ba,_txtx,(float) (_textleft),(float) (_texttop-_recttext.getTop()+_recttext.getHeight()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8728;BA.debugLine="xcvsValues.DrawText(txtY, TextLeft,  TextTop -";
_xcvsvalues.DrawText(ba,_txty,(float) (_textleft),(float) (_texttop-_recttext.getTop()+2.1*_recttext.getHeight()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 }else {
 //BA.debugLineNum = 8730;BA.debugLine="xcvsValues.DrawText(txtX, TextLeft, TextTop - r";
_xcvsvalues.DrawText(ba,_txtx,(float) (_textleft),(float) (_texttop-_recttext.getTop()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 8731;BA.debugLine="xcvsValues.DrawText(txtY, TextLeft,  TextTop -";
_xcvsvalues.DrawText(ba,_txty,(float) (_textleft),(float) (_texttop-_recttext.getTop()+_recttext.getHeight()),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 };
 //BA.debugLineNum = 8734;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 //BA.debugLineNum = 8735;BA.debugLine="xcvsValues.Invalidate";
_xcvsvalues.Invalidate();
 //BA.debugLineNum = 8736;BA.debugLine="End Sub";
return "";
}
public String  _drawyxlines() throws Exception{
int _i = 0;
int _l = 0;
b4a.example.xchart._itemdata _id = null;
double[] _yxval = null;
int _x0 = 0;
int _y0 = 0;
int _x1 = 0;
int _y1 = 0;
int _xi = 0;
int _yi = 0;
int _myaxis0 = 0;
int _mxaxis0 = 0;
 //BA.debugLineNum = 4310;BA.debugLine="Private Sub DrawYXLines";
 //BA.debugLineNum = 4311;BA.debugLine="Private i, l As Int";
_i = 0;
_l = 0;
 //BA.debugLineNum = 4312;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 4313;BA.debugLine="Private yxVal(2) As Double";
_yxval = new double[(int) (2)];
;
 //BA.debugLineNum = 4314;BA.debugLine="Private x0, y0, x1, y1, xi, yi As Int";
_x0 = 0;
_y0 = 0;
_x1 = 0;
_y1 = 0;
_xi = 0;
_yi = 0;
 //BA.debugLineNum = 4316;BA.debugLine="If Items.Size = 0 Then Return";
if (_items.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 4318;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4319;BA.debugLine="xi = Graph.Left - (ScaleLog(sX).MantMin + ScaleLo";
_xi = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4320;BA.debugLine="yi = Graph.Bottom + (ScaleLog(sY(0)).MantMin + Sc";
_yi = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy[(int) (0)]].MantMin /*int*/ +_scalelog[_sy[(int) (0)]].LogMin /*double*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4321;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit9 ;_l = _l + step9 ) {
 //BA.debugLineNum = 4322;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 4323;BA.debugLine="yxVal = ID.YXArray.Get(0)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
 //BA.debugLineNum = 4324;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4325;BA.debugLine="x0 = Graph.Left + (yxVal(0) - Scale(sX).MinVal)";
_x0 = (int) (_graph.Left /*int*/ +(_yxval[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4327;BA.debugLine="x0 = xi + Logarithm(yxVal(0), 10) * ScaleLog(sX";
_x0 = (int) (_xi+__c.Logarithm(_yxval[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 };
 //BA.debugLineNum = 4329;BA.debugLine="If Scale(sY(0)).Logarithmic = False Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4330;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4331;BA.debugLine="y0 = Graph.Bottom - (yxVal(1) - Scale(sY(0)).M";
_y0 = (int) (_graph.Bottom /*int*/ -(_yxval[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4333;BA.debugLine="y0 = Graph.Top + (yxVal(1) - Scale(sY(0)).MinV";
_y0 = (int) (_graph.Top /*int*/ +(_yxval[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 }else {
 //BA.debugLineNum = 4336;BA.debugLine="y0 = yi - Logarithm(yxVal(1), 10) * ScaleLog(sY";
_y0 = (int) (_yi-__c.Logarithm(_yxval[(int) (1)],10)*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4339;BA.debugLine="If ID.YXArray.Size = 1 Then";
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
 //BA.debugLineNum = 4340;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 4341;BA.debugLine="DrawPoint(x0, y0, ID.PointColor, ID.PointType,";
_drawpoint(_x0,_y0,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 };
 }else {
 //BA.debugLineNum = 4344;BA.debugLine="For i = 1 To ID.YXArray.Size - 1";
{
final int step31 = 1;
final int limit31 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (1) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
 //BA.debugLineNum = 4345;BA.debugLine="yxVal = ID.YXArray.Get(i)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 4346;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4347;BA.debugLine="x1 = Graph.Left + (yxVal(0) - Scale(sX).MinVa";
_x1 = (int) (_graph.Left /*int*/ +(_yxval[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4349;BA.debugLine="x1 = xi + Logarithm(yxVal(0), 10) * ScaleLog(";
_x1 = (int) (_xi+__c.Logarithm(_yxval[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 };
 //BA.debugLineNum = 4351;BA.debugLine="If Scale(sY(0)).Logarithmic = False Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4352;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4353;BA.debugLine="y1 = Graph.Bottom - (yxVal(1) - Scale(sY(0))";
_y1 = (int) (_graph.Bottom /*int*/ -(_yxval[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4355;BA.debugLine="y1 = Graph.Top + (yxVal(1) - Scale(sY(0)).Mi";
_y1 = (int) (_graph.Top /*int*/ +(_yxval[(int) (1)]-_scale[_sy[(int) (0)]].MinVal /*double*/ )*_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 }else {
 //BA.debugLineNum = 4358;BA.debugLine="y1 = yi - Logarithm(yxVal(1), 10) * ScaleLog(";
_y1 = (int) (_yi-__c.Logarithm(_yxval[(int) (1)],10)*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4360;BA.debugLine="If ID.DrawLine = True Then";
if (_id.DrawLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4361;BA.debugLine="xcvsGraph.DrawLine(x0, y0, x1, y1 , ID.Color,";
_xcvsgraph.DrawLine((float) (_x0),(float) (_y0),(float) (_x1),(float) (_y1),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 };
 //BA.debugLineNum = 4363;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 4364;BA.debugLine="DrawPoint(x0, y0, ID.PointColor, ID.PointType";
_drawpoint(_x0,_y0,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 //BA.debugLineNum = 4365;BA.debugLine="If i = ID.YXArray.Size - 1 Then";
if (_i==_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
 //BA.debugLineNum = 4366;BA.debugLine="DrawPoint(x1, y1, ID.PointColor, ID.PointTyp";
_drawpoint(_x1,_y1,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 };
 };
 //BA.debugLineNum = 4369;BA.debugLine="x0 = x1";
_x0 = _x1;
 //BA.debugLineNum = 4370;BA.debugLine="y0 = y1";
_y0 = _y1;
 }
};
 };
 }
};
 //BA.debugLineNum = 4375;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4377;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4378;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4379;BA.debugLine="Private mYAxis0 As Int";
_myaxis0 = 0;
 //BA.debugLineNum = 4380;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4381;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal *";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4383;BA.debugLine="mYAxis0 = Graph.Top - Scale(sY(0)).MinVal * Sca";
_myaxis0 = (int) (_graph.Top /*int*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4385;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4386;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4388;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 4392;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4393;BA.debugLine="If Scale(sX).MinVal< 0 And Scale(sX).MaxVal > 0 T";
if (_scale[_sx].MinVal /*double*/ <0 && _scale[_sx].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4394;BA.debugLine="Private mXAxis0 = Graph.Left - Scale(sX).MinVal";
_mxaxis0 = (int) (_graph.Left /*int*/ -_scale[_sx].MinVal /*double*/ *_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4395;BA.debugLine="If Scale(sX).YZeroAxisHighlight = True Then";
if (_scale[_sx].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4396;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0,";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4398;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0,";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 4402;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And (Zoom.NbVis";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && (_zoom.NbVisiblePoints /*int*/ >0 || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 4403;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 4406;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 4407;BA.debugLine="End Sub";
return "";
}
public String  _drawyxlinesnscales() throws Exception{
int _i = 0;
int _l = 0;
b4a.example.xchart._itemdata _id = null;
double[] _yxval = null;
int _x0 = 0;
int _y0 = 0;
int _x1 = 0;
int _y1 = 0;
int _xi = 0;
int _yi = 0;
int _myaxis0 = 0;
int _mxaxis0 = 0;
 //BA.debugLineNum = 4410;BA.debugLine="Private Sub DrawYXLinesNScales";
 //BA.debugLineNum = 4411;BA.debugLine="Private i, l As Int";
_i = 0;
_l = 0;
 //BA.debugLineNum = 4412;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 4413;BA.debugLine="Private yxVal(2) As Double";
_yxval = new double[(int) (2)];
;
 //BA.debugLineNum = 4414;BA.debugLine="Private x0, y0, x1, y1, xi, yi As Int";
_x0 = 0;
_y0 = 0;
_x1 = 0;
_y1 = 0;
_xi = 0;
_yi = 0;
 //BA.debugLineNum = 4416;BA.debugLine="If Items.Size = 0 Then Return";
if (_items.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 4418;BA.debugLine="xcvsGraph.ClipPath(pthGrid)	'avoids drawing outsi";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 4419;BA.debugLine="xi = Graph.Left - (ScaleLog(sX).MantMin + ScaleLo";
_xi = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4420;BA.debugLine="yi = Graph.Bottom + (ScaleLog(sY(0)).MantMin + Sc";
_yi = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy[(int) (0)]].MantMin /*int*/ +_scalelog[_sy[(int) (0)]].LogMin /*double*/ )*_scalelog[_sy[(int) (0)]].Scale /*double*/ );
 //BA.debugLineNum = 4421;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit9 ;_l = _l + step9 ) {
 //BA.debugLineNum = 4422;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 4423;BA.debugLine="yxVal = ID.YXArray.Get(0)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
 //BA.debugLineNum = 4424;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4425;BA.debugLine="x0 = Graph.Left + (yxVal(0) - Scale(sX).MinVal)";
_x0 = (int) (_graph.Left /*int*/ +(_yxval[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4427;BA.debugLine="x0 = xi + Logarithm(yxVal(0), 10) * ScaleLog(sX";
_x0 = (int) (_xi+__c.Logarithm(_yxval[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 };
 //BA.debugLineNum = 4429;BA.debugLine="If Scale(sY(0)).Logarithmic = False Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4430;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4431;BA.debugLine="y0 = Graph.Bottom - (yxVal(1) - Scale(sY(l)).M";
_y0 = (int) (_graph.Bottom /*int*/ -(_yxval[(int) (1)]-_scale[_sy[_l]].MinVal /*double*/ )*_scale[_sy[_l]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4433;BA.debugLine="y0 = Graph.Top + (yxVal(1) - Scale(sY(l)).MinV";
_y0 = (int) (_graph.Top /*int*/ +(_yxval[(int) (1)]-_scale[_sy[_l]].MinVal /*double*/ )*_scale[_sy[_l]].Scale /*double*/ );
 };
 }else {
 //BA.debugLineNum = 4436;BA.debugLine="y0 = yi - Logarithm(yxVal(1), 10) * ScaleLog(sY";
_y0 = (int) (_yi-__c.Logarithm(_yxval[(int) (1)],10)*_scalelog[_sy[_l]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4439;BA.debugLine="For i = 0 To ID.YXArray.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
 //BA.debugLineNum = 4440;BA.debugLine="yxVal = ID.YXArray.Get(i)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 4441;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4442;BA.debugLine="x1 = Graph.Left + (yxVal(0) - Scale(sX).MinVal";
_x1 = (int) (_graph.Left /*int*/ +(_yxval[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4444;BA.debugLine="x1 = xi + Logarithm(yxVal(0), 10) * ScaleLog(s";
_x1 = (int) (_xi+__c.Logarithm(_yxval[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 };
 //BA.debugLineNum = 4446;BA.debugLine="If Scale(sY(0)).Logarithmic = False Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4447;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4448;BA.debugLine="y1 = Graph.Bottom - (yxVal(1) - Scale(sY(l)).";
_y1 = (int) (_graph.Bottom /*int*/ -(_yxval[(int) (1)]-_scale[_sy[_l]].MinVal /*double*/ )*_scale[_sy[_l]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4450;BA.debugLine="y1 = Graph.Top + (yxVal(1) - Scale(sY(l)).Min";
_y1 = (int) (_graph.Top /*int*/ +(_yxval[(int) (1)]-_scale[_sy[_l]].MinVal /*double*/ )*_scale[_sy[_l]].Scale /*double*/ );
 };
 }else {
 //BA.debugLineNum = 4453;BA.debugLine="y1 = yi - Logarithm(yxVal(1), 10) * ScaleLog(s";
_y1 = (int) (_yi-__c.Logarithm(_yxval[(int) (1)],10)*_scalelog[_sy[_l]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4455;BA.debugLine="If ID.DrawLine = True Then";
if (_id.DrawLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4456;BA.debugLine="xcvsGraph.DrawLine(x0, y0, x1, y1 , ID.Color,";
_xcvsgraph.DrawLine((float) (_x0),(float) (_y0),(float) (_x1),(float) (_y1),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 };
 //BA.debugLineNum = 4458;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 4459;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 4460;BA.debugLine="DrawPoint(x0, y0, ID.PointColor, ID.PointType";
_drawpoint(_x0,_y0,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }else {
 //BA.debugLineNum = 4462;BA.debugLine="DrawPoint(x1, y1, ID.PointColor, ID.PointType";
_drawpoint(_x1,_y1,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.PointFilled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 };
 };
 //BA.debugLineNum = 4465;BA.debugLine="x0 = x1";
_x0 = _x1;
 //BA.debugLineNum = 4466;BA.debugLine="y0 = y1";
_y0 = _y1;
 }
};
 }
};
 //BA.debugLineNum = 4470;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 4472;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4473;BA.debugLine="If Scale(sY(0)).MinVal< 0 And Scale(sY(0)).MaxVal";
if (_scale[_sy[(int) (0)]].MinVal /*double*/ <0 && _scale[_sy[(int) (0)]].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4474;BA.debugLine="Private mYAxis0 As Int";
_myaxis0 = 0;
 //BA.debugLineNum = 4475;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4476;BA.debugLine="mYAxis0 = Graph.Bottom + Scale(sY(0)).MinVal *";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 4478;BA.debugLine="mYAxis0 = Graph.Top - Scale(sY(0)).MinVal * Sca";
_myaxis0 = (int) (_graph.Top /*int*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ *_scale[_sy[(int) (0)]].Scale /*double*/ );
 };
 //BA.debugLineNum = 4480;BA.debugLine="If Scale(sY(0)).YZeroAxisHighlight = True Then";
if (_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 4481;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 4483;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.R";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 4487;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 4488;BA.debugLine="If Scale(sX).MinVal< 0 And Scale(sX).MaxVal > 0 T";
if (_scale[_sx].MinVal /*double*/ <0 && _scale[_sx].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 4489;BA.debugLine="Private mXAxis0 = Graph.Left - Scale(sX).MinVal";
_mxaxis0 = (int) (_graph.Left /*int*/ -_scale[_sx].MinVal /*double*/ *_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 4490;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0,";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 4493;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And (Zoom.NbVis";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && (_zoom.NbVisiblePoints /*int*/ >0 || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 4494;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 4497;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 4498;BA.debugLine="End Sub";
return "";
}
public int  _getareafillalphavalue() throws Exception{
 //BA.debugLineNum = 8132;BA.debugLine="Public Sub getAreaFillAlphaValue As Int";
 //BA.debugLineNum = 8134;BA.debugLine="Return (256 + Graph.AreaFillAlphaValue / 16777216";
if (true) return (int) ((256+_graph.AreaFillAlphaValue /*int*/ /(double)16777216));
 //BA.debugLineNum = 8135;BA.debugLine="End Sub";
return 0;
}
public boolean  _getautomaticscale() throws Exception{
 //BA.debugLineNum = 7401;BA.debugLine="Public Sub getAutomaticScale As Boolean";
 //BA.debugLineNum = 7402;BA.debugLine="Return Scale(sY(0)).Automatic";
if (true) return _scale[_sy[(int) (0)]].Automatic /*boolean*/ ;
 //BA.debugLineNum = 7403;BA.debugLine="End Sub";
return false;
}
public boolean  _getautomatictextsizes() throws Exception{
 //BA.debugLineNum = 7503;BA.debugLine="Public Sub getAutomaticTextSizes As Boolean";
 //BA.debugLineNum = 7504;BA.debugLine="Return Texts.AutomaticTextSizes";
if (true) return _texts.AutomaticTextSizes /*boolean*/ ;
 //BA.debugLineNum = 7505;BA.debugLine="End Sub";
return false;
}
public float  _getaxistextsize() throws Exception{
 //BA.debugLineNum = 7525;BA.debugLine="Public Sub getAxisTextSize As Float";
 //BA.debugLineNum = 7526;BA.debugLine="Return Texts.AxisTextSize";
if (true) return _texts.AxisTextSize /*float*/ ;
 //BA.debugLineNum = 7527;BA.debugLine="End Sub";
return 0f;
}
public int  _getbarmarginmode() throws Exception{
 //BA.debugLineNum = 8032;BA.debugLine="Public Sub getBarMarginMode As Int";
 //BA.debugLineNum = 8033;BA.debugLine="Return Graph.BarMarginMode";
if (true) return _graph.BarMarginMode /*int*/ ;
 //BA.debugLineNum = 8034;BA.debugLine="End Sub";
return 0;
}
public double[]  _getbarpointsminmaxvalues() throws Exception{
int _j = 0;
double[] _minmax = null;
int _i = 0;
double[] _yvals = null;
b4a.example.xchart._pointdata _pd = null;
int _nb = 0;
double _total = 0;
 //BA.debugLineNum = 2724;BA.debugLine="Private Sub GetBarPointsMinMaxValues As Double()";
 //BA.debugLineNum = 2725;BA.debugLine="Private j, j As Int";
_j = 0;
_j = 0;
 //BA.debugLineNum = 2726;BA.debugLine="Private MinMax(2) As Double";
_minmax = new double[(int) (2)];
;
 //BA.debugLineNum = 2728;BA.debugLine="If Points.Size > 0 Then";
if (_points.getSize()>0) { 
 //BA.debugLineNum = 2730;BA.debugLine="If Graph.ChartType = \"BAR\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("BAR") || (_graph.ChartType /*String*/ ).equals("H_BAR") || (_graph.ChartType /*String*/ ).equals("RADAR") || (_graph.ChartType /*String*/ ).equals("CANDLE")) { 
 //BA.debugLineNum = 2732;BA.debugLine="MinMax(1) = -1E10";
_minmax[(int) (1)] = -1e10;
 //BA.debugLineNum = 2733;BA.debugLine="MinMax(0) = 1E10";
_minmax[(int) (0)] = 1e10;
 //BA.debugLineNum = 2736;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 2737;BA.debugLine="Private YVals() As Double";
_yvals = new double[(int) (0)];
;
 //BA.debugLineNum = 2738;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 2739;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2740;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2741;BA.debugLine="Private nb As Int";
_nb = 0;
 //BA.debugLineNum = 2742;BA.debugLine="nb = PD.YArray.Length - 1";
_nb = (int) (_pd.YArray /*double[]*/ .length-1);
 //BA.debugLineNum = 2743;BA.debugLine="If Graph.ChartType = \"CANDLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("CANDLE")) { 
 //BA.debugLineNum = 2744;BA.debugLine="nb = nb - 1";
_nb = (int) (_nb-1);
 };
 //BA.debugLineNum = 2747;BA.debugLine="For j = 0 To nb";
{
final int step17 = 1;
final int limit17 = _nb;
_j = (int) (0) ;
for (;_j <= limit17 ;_j = _j + step17 ) {
 //BA.debugLineNum = 2748;BA.debugLine="MinMax(1) = Max(MinMax(1), YVals(j))";
_minmax[(int) (1)] = __c.Max(_minmax[(int) (1)],_yvals[_j]);
 //BA.debugLineNum = 2749;BA.debugLine="MinMax(0) = Min(MinMax(0), YVals(j))";
_minmax[(int) (0)] = __c.Min(_minmax[(int) (0)],_yvals[_j]);
 }
};
 }
};
 //BA.debugLineNum = 2752;BA.debugLine="MinMaxMeanValues(0) = MinMax(0)";
_minmaxmeanvalues[(int) (0)] = _minmax[(int) (0)];
 //BA.debugLineNum = 2753;BA.debugLine="MinMaxMeanValues(1) = MinMax(1)";
_minmaxmeanvalues[(int) (1)] = _minmax[(int) (1)];
 //BA.debugLineNum = 2754;BA.debugLine="If Graph.ChartType <> \"CANDLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("CANDLE") == false) { 
 //BA.debugLineNum = 2755;BA.debugLine="If MinMax(0) > 0 And MinMax(1) > 0 Then";
if (_minmax[(int) (0)]>0 && _minmax[(int) (1)]>0) { 
 //BA.debugLineNum = 2756;BA.debugLine="MinMax(0) = 0";
_minmax[(int) (0)] = 0;
 };
 //BA.debugLineNum = 2758;BA.debugLine="If MinMax(0) < 0 And MinMax(1) < 0 Then";
if (_minmax[(int) (0)]<0 && _minmax[(int) (1)]<0) { 
 //BA.debugLineNum = 2759;BA.debugLine="MinMax(1) = 0";
_minmax[(int) (1)] = 0;
 };
 }else {
 //BA.debugLineNum = 2762;BA.debugLine="If Bar.CandleDisplayVolume = True Then";
if (_bar.CandleDisplayVolume /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2764;BA.debugLine="MinMaxMeanValues(0) = MinMaxMeanValues(0) - (";
_minmaxmeanvalues[(int) (0)] = _minmaxmeanvalues[(int) (0)]-(_minmaxmeanvalues[(int) (1)]-_minmaxmeanvalues[(int) (0)])/(double)9;
 //BA.debugLineNum = 2765;BA.debugLine="MinMax(0) = MinMaxMeanValues(0)";
_minmax[(int) (0)] = _minmaxmeanvalues[(int) (0)];
 };
 };
 }else {
 //BA.debugLineNum = 2770;BA.debugLine="MinMax(1) = 0";
_minmax[(int) (1)] = 0;
 //BA.debugLineNum = 2771;BA.debugLine="MinMax(0) = 0";
_minmax[(int) (0)] = 0;
 //BA.debugLineNum = 2774;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step40 = 1;
final int limit40 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit40 ;_i = _i + step40 ) {
 //BA.debugLineNum = 2775;BA.debugLine="Private YVals(), Total As Double";
_yvals = new double[(int) (0)];
;
_total = 0;
 //BA.debugLineNum = 2776;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 2777;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2778;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2779;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step45 = 1;
final int limit45 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit45 ;_j = _j + step45 ) {
 //BA.debugLineNum = 2780;BA.debugLine="Total = Total + YVals(j)";
_total = _total+_yvals[_j];
 }
};
 //BA.debugLineNum = 2782;BA.debugLine="MinMax(1) = Max(MinMax(1), Total)";
_minmax[(int) (1)] = __c.Max(_minmax[(int) (1)],_total);
 }
};
 //BA.debugLineNum = 2784;BA.debugLine="MinMaxMeanValues(0) = MinMax(0)";
_minmaxmeanvalues[(int) (0)] = _minmax[(int) (0)];
 //BA.debugLineNum = 2785;BA.debugLine="MinMaxMeanValues(1) = MinMax(1)";
_minmaxmeanvalues[(int) (1)] = _minmax[(int) (1)];
 };
 };
 //BA.debugLineNum = 2789;BA.debugLine="Return MinMax";
if (true) return _minmax;
 //BA.debugLineNum = 2790;BA.debugLine="End Sub";
return null;
}
public String  _getbarvalueorientation() throws Exception{
 //BA.debugLineNum = 8015;BA.debugLine="Public Sub getBarValueOrientation As String";
 //BA.debugLineNum = 8016;BA.debugLine="Return Graph.BarValueOrientation";
if (true) return _graph.BarValueOrientation /*String*/ ;
 //BA.debugLineNum = 8017;BA.debugLine="End Sub";
return "";
}
public double  _getbubblediametermax() throws Exception{
 //BA.debugLineNum = 8457;BA.debugLine="Public Sub getBubbleDiameterMax As Double";
 //BA.debugLineNum = 8458;BA.debugLine="Return mBubbleDiameterMax";
if (true) return _mbubblediametermax;
 //BA.debugLineNum = 8459;BA.debugLine="End Sub";
return 0;
}
public double  _getbubblediametermin() throws Exception{
 //BA.debugLineNum = 8444;BA.debugLine="Public Sub getBubbleDiameterMin As Double";
 //BA.debugLineNum = 8445;BA.debugLine="Return mBubbleDiameterMin";
if (true) return _mbubblediametermin;
 //BA.debugLineNum = 8446;BA.debugLine="End Sub";
return 0;
}
public boolean  _getbubblesmallsnap() throws Exception{
 //BA.debugLineNum = 8469;BA.debugLine="Public Sub getBubbleSmallSnap As Boolean";
 //BA.debugLineNum = 8470;BA.debugLine="Return mBubbleSmallSnap";
if (true) return _mbubblesmallsnap;
 //BA.debugLineNum = 8471;BA.debugLine="End Sub";
return false;
}
public boolean  _getcandledisplayvolume() throws Exception{
 //BA.debugLineNum = 8372;BA.debugLine="Public Sub getCandleDisplayVolume As Boolean";
 //BA.debugLineNum = 8373;BA.debugLine="Return Bar.CandleDisplayVolume";
if (true) return _bar.CandleDisplayVolume /*boolean*/ ;
 //BA.debugLineNum = 8374;BA.debugLine="End Sub";
return false;
}
public boolean  _getcandledrawbodyborder() throws Exception{
 //BA.debugLineNum = 8421;BA.debugLine="Public Sub getCandleDrawBodyBorder As Boolean";
 //BA.debugLineNum = 8422;BA.debugLine="Return Bar.DrawBodyBorder";
if (true) return _bar.DrawBodyBorder /*boolean*/ ;
 //BA.debugLineNum = 8423;BA.debugLine="End Sub";
return false;
}
public int  _getcandlewickcolor() throws Exception{
 //BA.debugLineNum = 8361;BA.debugLine="Public Sub getCandleWickColor As Int";
 //BA.debugLineNum = 8362;BA.debugLine="Return Bar.WickColor";
if (true) return _bar.WickColor /*int*/ ;
 //BA.debugLineNum = 8363;BA.debugLine="End Sub";
return 0;
}
public int  _getcandlewickwidth() throws Exception{
 //BA.debugLineNum = 8384;BA.debugLine="Public Sub getCandleWickWidth As Int";
 //BA.debugLineNum = 8385;BA.debugLine="Return Bar.WickWidth / xui.Scale";
if (true) return (int) (_bar.WickWidth /*int*/ /(double)_xui.getScale());
 //BA.debugLineNum = 8386;BA.debugLine="End Sub";
return 0;
}
public String  _getcharttype() throws Exception{
 //BA.debugLineNum = 7441;BA.debugLine="Public Sub getChartType As String";
 //BA.debugLineNum = 7442;BA.debugLine="Return Graph.ChartType";
if (true) return _graph.ChartType /*String*/ ;
 //BA.debugLineNum = 7443;BA.debugLine="End Sub";
return "";
}
public int  _getcontrastcolor(int _color) throws Exception{
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
int _yiq = 0;
 //BA.debugLineNum = 6962;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
 //BA.debugLineNum = 6963;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
 //BA.debugLineNum = 6965;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
 //BA.debugLineNum = 6966;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
 //BA.debugLineNum = 6967;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
 //BA.debugLineNum = 6968;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
 //BA.debugLineNum = 6970;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
 //BA.debugLineNum = 6972;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
 //BA.debugLineNum = 6973;BA.debugLine="Return xui.Color_Black";
if (true) return _xui.Color_Black;
 }else {
 //BA.debugLineNum = 6975;BA.debugLine="Return xui.Color_White";
if (true) return _xui.Color_White;
 };
 //BA.debugLineNum = 6977;BA.debugLine="End Sub";
return 0;
}
public int  _getcursorindex(float _x,float _y) throws Exception{
int _index = 0;
double _angle = 0;
 //BA.debugLineNum = 1167;BA.debugLine="Private Sub GetCursorIndex(X As Float, Y As Float)";
 //BA.debugLineNum = 1168;BA.debugLine="Private Index As Int";
_index = 0;
 //BA.debugLineNum = 1170;BA.debugLine="If Graph.ChartType <> \"PIE\" Then";
if ((_graph.ChartType /*String*/ ).equals("PIE") == false) { 
 //BA.debugLineNum = 1171;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"BAR","STACKED_BAR","CANDLE","WATERFALL","LINE","AREA","STACKED_AREA","RADAR")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 1173;BA.debugLine="Index =(x - Graph.Left - Graph.XOffset) / Grap";
_index = (int) ((_x-_graph.Left /*int*/ -_graph.XOffset /*int*/ )/(double)_graph.XInterval /*double*/ );
 break; }
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 1175;BA.debugLine="Index = (x - Graph.Left) / Scale(sX).Scale + 0";
_index = (int) ((_x-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ +0.5+_zoom.BeginIndex /*int*/ );
 break; }
case 7: {
 //BA.debugLineNum = 1177;BA.debugLine="Private Angle As Double";
_angle = 0;
 //BA.debugLineNum = 1178;BA.debugLine="Angle = ATan2D(y - Graph.CenterY, x - Graph.Ce";
_angle = __c.ATan2D(_y-_graph.CenterY /*int*/ ,_x-_graph.CenterX /*int*/ );
 //BA.debugLineNum = 1179;BA.debugLine="If Angle < 0 Then";
if (_angle<0) { 
 //BA.debugLineNum = 1180;BA.debugLine="Angle = Angle + 360";
_angle = _angle+360;
 };
 //BA.debugLineNum = 1182;BA.debugLine="Index = Angle * Zoom.NbVisiblePoints / 360 + 0";
_index = (int) (_angle*_zoom.NbVisiblePoints /*int*/ /(double)360+0.5);
 //BA.debugLineNum = 1183;BA.debugLine="Angle = 360 / Zoom.NbVisiblePoints * Index";
_angle = 360/(double)_zoom.NbVisiblePoints /*int*/ *_index;
 //BA.debugLineNum = 1184;BA.debugLine="Angle = (ATan2D(y - Graph.CenterY, x - Graph.C";
_angle = (__c.ATan2D(_y-_graph.CenterY /*int*/ ,_x-_graph.CenterX /*int*/ )+360-_graph.RadarStartAngle /*int*/ );
 //BA.debugLineNum = 1185;BA.debugLine="If Angle < 0 Then";
if (_angle<0) { 
 //BA.debugLineNum = 1186;BA.debugLine="Angle = Angle + 360";
_angle = _angle+360;
 }else if(_angle>360) { 
 //BA.debugLineNum = 1188;BA.debugLine="Angle = Angle - 360";
_angle = _angle-360;
 };
 //BA.debugLineNum = 1190;BA.debugLine="Index = Angle * Zoom.NbVisiblePoints / 360 + 0";
_index = (int) (_angle*_zoom.NbVisiblePoints /*int*/ /(double)360+0.5);
 break; }
}
;
 //BA.debugLineNum = 1192;BA.debugLine="Index = Max(Index, Zoom.BeginIndex)";
_index = (int) (__c.Max(_index,_zoom.BeginIndex /*int*/ ));
 //BA.debugLineNum = 1193;BA.debugLine="Index = Min(Index, Zoom.EndIndex)";
_index = (int) (__c.Min(_index,_zoom.EndIndex /*int*/ ));
 };
 //BA.debugLineNum = 1196;BA.debugLine="Return Index";
if (true) return _index;
 //BA.debugLineNum = 1197;BA.debugLine="End Sub";
return 0;
}
public int  _getdecreasecolor() throws Exception{
 //BA.debugLineNum = 8411;BA.debugLine="Public Sub getDecreaseColor As Int";
 //BA.debugLineNum = 8412;BA.debugLine="Return Bar.DecreaseColor";
if (true) return _bar.DecreaseColor /*int*/ ;
 //BA.debugLineNum = 8413;BA.debugLine="End Sub";
return 0;
}
public boolean  _getdifferentscales() throws Exception{
 //BA.debugLineNum = 7417;BA.debugLine="Public Sub getDifferentScales As Boolean";
 //BA.debugLineNum = 7418;BA.debugLine="Return Scale(sY(0)).Different";
if (true) return _scale[_sy[(int) (0)]].Different /*boolean*/ ;
 //BA.debugLineNum = 7419;BA.debugLine="End Sub";
return false;
}
public boolean  _getdisplaycursor() throws Exception{
 //BA.debugLineNum = 7574;BA.debugLine="Public Sub getDisplayCursor As Boolean";
 //BA.debugLineNum = 7575;BA.debugLine="Return Values.ShowCursor";
if (true) return _values.ShowCursor /*boolean*/ ;
 //BA.debugLineNum = 7576;BA.debugLine="End Sub";
return false;
}
public boolean  _getdisplayvalues() throws Exception{
 //BA.debugLineNum = 7584;BA.debugLine="Public Sub getDisplayValues As Boolean";
 //BA.debugLineNum = 7585;BA.debugLine="Return Values.Show";
if (true) return _values.Show /*boolean*/ ;
 //BA.debugLineNum = 7586;BA.debugLine="End Sub";
return false;
}
public boolean  _getdisplayvaluesonhover() throws Exception{
 //BA.debugLineNum = 7594;BA.debugLine="Public Sub getDisplayValuesOnHover As Boolean";
 //BA.debugLineNum = 7595;BA.debugLine="Return Values.ShowOnHover";
if (true) return _values.ShowOnHover /*boolean*/ ;
 //BA.debugLineNum = 7596;BA.debugLine="End Sub";
return false;
}
public boolean  _getdrawgridframe() throws Exception{
 //BA.debugLineNum = 7732;BA.debugLine="Public Sub getDrawGridFrame As Boolean";
 //BA.debugLineNum = 7733;BA.debugLine="Return Graph.DrawGridFrame";
if (true) return _graph.DrawGridFrame /*boolean*/ ;
 //BA.debugLineNum = 7734;BA.debugLine="End Sub";
return false;
}
public boolean  _getdrawhorizontalgridlines() throws Exception{
 //BA.debugLineNum = 7742;BA.debugLine="Public Sub getDrawHorizontalGridLines As Boolean";
 //BA.debugLineNum = 7743;BA.debugLine="Return Graph.DrawHorizontalGridLines";
if (true) return _graph.DrawHorizontalGridLines /*boolean*/ ;
 //BA.debugLineNum = 7744;BA.debugLine="End Sub";
return false;
}
public boolean  _getdrawouterframe() throws Exception{
 //BA.debugLineNum = 7923;BA.debugLine="Public Sub getDrawOuterFrame As Boolean";
 //BA.debugLineNum = 7924;BA.debugLine="Return Graph.DrawOuterFrame";
if (true) return _graph.DrawOuterFrame /*boolean*/ ;
 //BA.debugLineNum = 7925;BA.debugLine="End Sub";
return false;
}
public boolean  _getdrawverticalgridlines() throws Exception{
 //BA.debugLineNum = 7752;BA.debugLine="Public Sub getDrawVerticalGridLines As Boolean";
 //BA.debugLineNum = 7753;BA.debugLine="Return Graph.DrawVerticalGridLines";
if (true) return _graph.DrawVerticalGridLines /*boolean*/ ;
 //BA.debugLineNum = 7754;BA.debugLine="End Sub";
return false;
}
public boolean  _getdrawxscale() throws Exception{
 //BA.debugLineNum = 7659;BA.debugLine="Public Sub getDrawXScale As Boolean";
 //BA.debugLineNum = 7660;BA.debugLine="Return Scale(sX).DrawXScale";
if (true) return _scale[_sx].DrawXScale /*boolean*/ ;
 //BA.debugLineNum = 7661;BA.debugLine="End Sub";
return false;
}
public boolean  _getdrawyscale() throws Exception{
 //BA.debugLineNum = 7671;BA.debugLine="Public Sub getDrawYScale As Boolean";
 //BA.debugLineNum = 7672;BA.debugLine="Return Scale(sY(0)).DrawYScale";
if (true) return _scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ;
 //BA.debugLineNum = 7673;BA.debugLine="End Sub";
return false;
}
public boolean  _getgradientcolors() throws Exception{
 //BA.debugLineNum = 7684;BA.debugLine="Public Sub getGradientColors As Boolean";
 //BA.debugLineNum = 7685;BA.debugLine="Return Graph.GradientColors";
if (true) return _graph.GradientColors /*boolean*/ ;
 //BA.debugLineNum = 7686;BA.debugLine="End Sub";
return false;
}
public int  _getgradientcolorsalpha() throws Exception{
 //BA.debugLineNum = 7695;BA.debugLine="Public Sub getGradientColorsAlpha As Int";
 //BA.debugLineNum = 7696;BA.debugLine="Return Graph.GradientColorsAlpha";
if (true) return _graph.GradientColorsAlpha /*int*/ ;
 //BA.debugLineNum = 7697;BA.debugLine="End Sub";
return 0;
}
public boolean  _gethchartstickstopdown() throws Exception{
 //BA.debugLineNum = 8247;BA.debugLine="Public Sub getHChartsTicksTopDown As Boolean";
 //BA.debugLineNum = 8248;BA.debugLine="Return mHChartsTicksTopDown";
if (true) return _mhchartstickstopdown;
 //BA.debugLineNum = 8249;BA.debugLine="End Sub";
return false;
}
public boolean  _gethchartsxscaleontop() throws Exception{
 //BA.debugLineNum = 8233;BA.debugLine="Public Sub getHChartsXScaleOnTop As Boolean";
 //BA.debugLineNum = 8234;BA.debugLine="Return mHChartsXScaleOnTop";
if (true) return _mhchartsxscaleontop;
 //BA.debugLineNum = 8235;BA.debugLine="End Sub";
return false;
}
public int  _getheight() throws Exception{
 //BA.debugLineNum = 7483;BA.debugLine="Public Sub getHeight As Int";
 //BA.debugLineNum = 7484;BA.debugLine="Return mBase.Height";
if (true) return _mbase.getHeight();
 //BA.debugLineNum = 7485;BA.debugLine="End Sub";
return 0;
}
public boolean  _getincludebarmeanline() throws Exception{
 //BA.debugLineNum = 7391;BA.debugLine="Public Sub getIncludeBarMeanLine As Boolean";
 //BA.debugLineNum = 7392;BA.debugLine="Return Graph.IncludeBarMeanLine";
if (true) return _graph.IncludeBarMeanLine /*boolean*/ ;
 //BA.debugLineNum = 7393;BA.debugLine="End Sub";
return false;
}
public String  _getincludelegend() throws Exception{
 //BA.debugLineNum = 7370;BA.debugLine="Public Sub getIncludeLegend As String";
 //BA.debugLineNum = 7371;BA.debugLine="Return Legend.IncludeLegend";
if (true) return _legend.IncludeLegend /*String*/ ;
 //BA.debugLineNum = 7372;BA.debugLine="End Sub";
return "";
}
public boolean  _getincludemaxline() throws Exception{
 //BA.debugLineNum = 7944;BA.debugLine="Public Sub getIncludeMaxLine As Boolean";
 //BA.debugLineNum = 7945;BA.debugLine="Return Graph.IncludeMaxLine";
if (true) return _graph.IncludeMaxLine /*boolean*/ ;
 //BA.debugLineNum = 7946;BA.debugLine="End Sub";
return false;
}
public boolean  _getincludemeanline() throws Exception{
 //BA.debugLineNum = 7955;BA.debugLine="Public Sub getIncludeMeanLine As Boolean";
 //BA.debugLineNum = 7956;BA.debugLine="Return Graph.IncludeMeanLine";
if (true) return _graph.IncludeMeanLine /*boolean*/ ;
 //BA.debugLineNum = 7957;BA.debugLine="End Sub";
return false;
}
public boolean  _getincludeminline() throws Exception{
 //BA.debugLineNum = 7933;BA.debugLine="Public Sub getIncludeMinLine As Boolean";
 //BA.debugLineNum = 7934;BA.debugLine="Return Graph.IncludeMinLine";
if (true) return _graph.IncludeMinLine /*boolean*/ ;
 //BA.debugLineNum = 7935;BA.debugLine="End Sub";
return false;
}
public boolean  _getincludevalues() throws Exception{
 //BA.debugLineNum = 7381;BA.debugLine="Public Sub getIncludeValues As Boolean";
 //BA.debugLineNum = 7382;BA.debugLine="Return Graph.IncludeValues";
if (true) return _graph.IncludeValues /*boolean*/ ;
 //BA.debugLineNum = 7383;BA.debugLine="End Sub";
return false;
}
public int  _getincreasecolor() throws Exception{
 //BA.debugLineNum = 8398;BA.debugLine="Public Sub getIncreaseColor As Int";
 //BA.debugLineNum = 8399;BA.debugLine="Return Bar.IncreaseColor";
if (true) return _bar.IncreaseColor /*int*/ ;
 //BA.debugLineNum = 8400;BA.debugLine="End Sub";
return 0;
}
public String  _getkeepdisplayvalues() throws Exception{
 //BA.debugLineNum = 8213;BA.debugLine="Public Sub getKeepDisplayValues As String";
 //BA.debugLineNum = 8214;BA.debugLine="Return mKeepDisplayValues";
if (true) return _mkeepdisplayvalues;
 //BA.debugLineNum = 8215;BA.debugLine="End Sub";
return "";
}
public int  _getleft() throws Exception{
 //BA.debugLineNum = 7455;BA.debugLine="Public Sub getLeft As Int";
 //BA.debugLineNum = 7456;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 7457;BA.debugLine="End Sub";
return 0;
}
public String  _getlegendlinenumbers(int _limit) throws Exception{
int _x = 0;
int _box = 0;
boolean _alltoobig = false;
int _i = 0;
b4a.example.xchart._itemdata _item = null;
String _txt = "";
 //BA.debugLineNum = 7081;BA.debugLine="Private Sub GetLegendLineNumbers(Limit As Int)";
 //BA.debugLineNum = 7082;BA.debugLine="Private x As Int";
_x = 0;
 //BA.debugLineNum = 7083;BA.debugLine="Private box As Int = 1.05 * Legend.TextHeight";
_box = (int) (1.05*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 7085;BA.debugLine="Legend.LineNumber = 1";
_legend.LineNumber /*int*/  = (int) (1);
 //BA.debugLineNum = 7086;BA.debugLine="Legend.LineNumbers.Clear";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 //BA.debugLineNum = 7087;BA.debugLine="Legend.LineChange.Clear";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 //BA.debugLineNum = 7089;BA.debugLine="Private AllTooBig = False As Boolean";
_alltoobig = __c.False;
 //BA.debugLineNum = 7091;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 7092;BA.debugLine="Private Item As ItemData";
_item = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 7093;BA.debugLine="Item = Items.Get(i)";
_item = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 7094;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 7095;BA.debugLine="If Graph.ChartType = \"PIE\" And Legend.IncludeLeg";
if ((_graph.ChartType /*String*/ ).equals("PIE") && (_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _graph.IncludeValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 7096;BA.debugLine="txt = txt & \" : \" & NumberFormat3(Item.Value, 6";
_txt = _txt+" : "+_numberformat3(_item.Value /*float*/ ,(int) (6));
 };
 //BA.debugLineNum = 7098;BA.debugLine="If 1.85 * box + MeasureTextWidth(txt, Legend.Tex";
if (1.85*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )>_limit) { 
 //BA.debugLineNum = 7099;BA.debugLine="AllTooBig = True";
_alltoobig = __c.True;
 };
 }
};
 //BA.debugLineNum = 7103;BA.debugLine="If AllTooBig = True Then";
if (_alltoobig==__c.True) { 
 //BA.debugLineNum = 7104;BA.debugLine="Legend.LineNumber = Items.Size";
_legend.LineNumber /*int*/  = _items.getSize();
 //BA.debugLineNum = 7105;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step20 = 1;
final int limit20 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 7106;BA.debugLine="Legend.LineChange.Add(True)";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.True));
 //BA.debugLineNum = 7107;BA.debugLine="Legend.LineNumbers.Add(i)";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i));
 }
};
 }else {
 //BA.debugLineNum = 7110;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 7111;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
 //BA.debugLineNum = 7112;BA.debugLine="Private Item As ItemData";
_item = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 7113;BA.debugLine="Item = Items.Get(i)";
_item = (b4a.example.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 7114;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 7115;BA.debugLine="If Graph.ChartType = \"PIE\" And Legend.IncludeLe";
if ((_graph.ChartType /*String*/ ).equals("PIE") && (_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _graph.IncludeValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 7116;BA.debugLine="txt = txt & \" : \" & NumberFormat3(Item.Value,";
_txt = _txt+" : "+_numberformat3(_item.Value /*float*/ ,(int) (6));
 };
 //BA.debugLineNum = 7118;BA.debugLine="x = x + 1.85 * box + MeasureTextWidth(txt, Lege";
_x = (int) (_x+1.85*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ));
 //BA.debugLineNum = 7119;BA.debugLine="If x > Limit Then";
if (_x>_limit) { 
 //BA.debugLineNum = 7120;BA.debugLine="x = 1.85 * box + MeasureTextWidth(txt, Legend.";
_x = (int) (1.85*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ));
 //BA.debugLineNum = 7121;BA.debugLine="Legend.LineNumber = Legend.LineNumber + 1";
_legend.LineNumber /*int*/  = (int) (_legend.LineNumber /*int*/ +1);
 //BA.debugLineNum = 7122;BA.debugLine="Legend.LineChange.Add(True)";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.True));
 }else {
 //BA.debugLineNum = 7124;BA.debugLine="Legend.LineChange.Add(False)";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.False));
 };
 //BA.debugLineNum = 7126;BA.debugLine="Legend.LineNumbers.Add(Legend.LineNumber - 1)";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_legend.LineNumber /*int*/ -1));
 }
};
 };
 //BA.debugLineNum = 7129;BA.debugLine="End Sub";
return "";
}
public float  _getlegendtextsize() throws Exception{
 //BA.debugLineNum = 7549;BA.debugLine="Public Sub getLegendTextSize As Float";
 //BA.debugLineNum = 7550;BA.debugLine="Return Legend.TextSize";
if (true) return _legend.TextSize /*float*/ ;
 //BA.debugLineNum = 7551;BA.debugLine="End Sub";
return 0f;
}
public double[]  _getlinepointsminmaxmeanvalues(int _axis) throws Exception{
int _i = 0;
int _j = 0;
int _nbpoints = 0;
int _ip0 = 0;
int _ip1 = 0;
double[] _mmmvalues = null;
double[] _yvals = null;
b4a.example.xchart._pointdata _pd = null;
double _total = 0;
b4a.example.xchart._itemdata _id = null;
int _l = 0;
double[] _yxval = null;
 //BA.debugLineNum = 2793;BA.debugLine="Private Sub GetLinePointsMinMaxMeanValues(Axis As";
 //BA.debugLineNum = 2794;BA.debugLine="Private i, j, NbPoints, iP0, iP1 As Int";
_i = 0;
_j = 0;
_nbpoints = 0;
_ip0 = 0;
_ip1 = 0;
 //BA.debugLineNum = 2795;BA.debugLine="Private MMMValues(3) As Double";
_mmmvalues = new double[(int) (3)];
;
 //BA.debugLineNum = 2796;BA.debugLine="MMMValues(1) = -1E10";
_mmmvalues[(int) (1)] = -1e10;
 //BA.debugLineNum = 2797;BA.debugLine="MMMValues(0) = 1E10";
_mmmvalues[(int) (0)] = 1e10;
 //BA.debugLineNum = 2798;BA.debugLine="MMMValues(2) = 0";
_mmmvalues[(int) (2)] = 0;
 //BA.debugLineNum = 2800;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","H_LINE","AREA","STACKED_AREA","YX_CHART","BUBBLE")) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 2802;BA.debugLine="If Zoom.ScalesOnZoomedPart = False Then";
if (_zoom.ScalesOnZoomedPart /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2803;BA.debugLine="iP0 = 0";
_ip0 = (int) (0);
 //BA.debugLineNum = 2804;BA.debugLine="iP1 = Points.Size - 1";
_ip1 = (int) (_points.getSize()-1);
 }else {
 //BA.debugLineNum = 2806;BA.debugLine="iP0 = Zoom.BeginIndex";
_ip0 = _zoom.BeginIndex /*int*/ ;
 //BA.debugLineNum = 2807;BA.debugLine="iP1 = Zoom.EndIndex";
_ip1 = _zoom.EndIndex /*int*/ ;
 };
 //BA.debugLineNum = 2809;BA.debugLine="If Scale(Axis).Different = False Then 'mono sca";
if (_scale[_axis].Different /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2810;BA.debugLine="NbPoints = 0";
_nbpoints = (int) (0);
 //BA.debugLineNum = 2811;BA.debugLine="For i = iP0 To iP1";
{
final int step17 = 1;
final int limit17 = _ip1;
_i = _ip0 ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 2812;BA.debugLine="Private YVals() As Double";
_yvals = new double[(int) (0)];
;
 //BA.debugLineNum = 2813;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 2814;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2815;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2816;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step22 = 1;
final int limit22 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit22 ;_j = _j + step22 ) {
 //BA.debugLineNum = 2817;BA.debugLine="If YVals(j) <> mMissingDataValue Then";
if (_yvals[_j]!=_mmissingdatavalue) { 
 //BA.debugLineNum = 2818;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YVals(j))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yvals[_j]);
 //BA.debugLineNum = 2819;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YVals(j))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yvals[_j]);
 //BA.debugLineNum = 2820;BA.debugLine="MMMValues(2) = MMMValues(2) + YVals(j)";
_mmmvalues[(int) (2)] = _mmmvalues[(int) (2)]+_yvals[_j];
 //BA.debugLineNum = 2821;BA.debugLine="NbPoints = NbPoints + 1";
_nbpoints = (int) (_nbpoints+1);
 };
 }
};
 }
};
 }else {
 //BA.debugLineNum = 2826;BA.debugLine="NbPoints = 0";
_nbpoints = (int) (0);
 //BA.debugLineNum = 2827;BA.debugLine="For i = iP0 To iP1";
{
final int step33 = 1;
final int limit33 = _ip1;
_i = _ip0 ;
for (;_i <= limit33 ;_i = _i + step33 ) {
 //BA.debugLineNum = 2828;BA.debugLine="Private YVals() As Double";
_yvals = new double[(int) (0)];
;
 //BA.debugLineNum = 2829;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 2830;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2831;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2832;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step38 = 1;
final int limit38 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit38 ;_j = _j + step38 ) {
 //BA.debugLineNum = 2833;BA.debugLine="If YVals(Axis - 1) <> mMissingDataValue Then";
if (_yvals[(int) (_axis-1)]!=_mmissingdatavalue) { 
 //BA.debugLineNum = 2834;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YVals(Axis";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yvals[(int) (_axis-1)]);
 //BA.debugLineNum = 2835;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YVals(Axis";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yvals[(int) (_axis-1)]);
 //BA.debugLineNum = 2836;BA.debugLine="MMMValues(2) = MMMValues(2) + YVals(Axis -";
_mmmvalues[(int) (2)] = _mmmvalues[(int) (2)]+_yvals[(int) (_axis-1)];
 //BA.debugLineNum = 2837;BA.debugLine="NbPoints = NbPoints + 1";
_nbpoints = (int) (_nbpoints+1);
 };
 }
};
 }
};
 };
 //BA.debugLineNum = 2842;BA.debugLine="MMMValues(2) = MMMValues(2) / NbPoints";
_mmmvalues[(int) (2)] = _mmmvalues[(int) (2)]/(double)_nbpoints;
 break; }
case 3: {
 //BA.debugLineNum = 2844;BA.debugLine="MMMValues(1) = 0";
_mmmvalues[(int) (1)] = 0;
 //BA.debugLineNum = 2845;BA.debugLine="MMMValues(0) = 0";
_mmmvalues[(int) (0)] = 0;
 //BA.debugLineNum = 2846;BA.debugLine="MMMValues(2) = 0";
_mmmvalues[(int) (2)] = 0;
 //BA.debugLineNum = 2849;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step53 = 1;
final int limit53 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit53 ;_i = _i + step53 ) {
 //BA.debugLineNum = 2850;BA.debugLine="Private YVals(), Total As Double";
_yvals = new double[(int) (0)];
;
_total = 0;
 //BA.debugLineNum = 2851;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 2852;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2853;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2854;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step58 = 1;
final int limit58 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit58 ;_j = _j + step58 ) {
 //BA.debugLineNum = 2855;BA.debugLine="Total = Total + YVals(j)";
_total = _total+_yvals[_j];
 }
};
 //BA.debugLineNum = 2857;BA.debugLine="MMMValues(1) = Max(MMMValues(1), Total)";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_total);
 }
};
 //BA.debugLineNum = 2859;BA.debugLine="MinMaxMeanValues(0) = MMMValues(0)";
_minmaxmeanvalues[(int) (0)] = _mmmvalues[(int) (0)];
 //BA.debugLineNum = 2860;BA.debugLine="MinMaxMeanValues(1) = MMMValues(1)";
_minmaxmeanvalues[(int) (1)] = _mmmvalues[(int) (1)];
 break; }
case 4: 
case 5: {
 //BA.debugLineNum = 2862;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 2863;BA.debugLine="If Graph.ChartType = \"BUBBLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 2864;BA.debugLine="mBubbleValMinMax(1) = -1E10";
_mbubblevalminmax[(int) (1)] = -1e10;
 //BA.debugLineNum = 2865;BA.debugLine="mBubbleValMinMax(0) = 1E10";
_mbubblevalminmax[(int) (0)] = 1e10;
 };
 //BA.debugLineNum = 2867;BA.debugLine="If Scale(Axis).Different = False Then 'mono sca";
if (_scale[_axis].Different /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2868;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step72 = 1;
final int limit72 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit72 ;_l = _l + step72 ) {
 //BA.debugLineNum = 2869;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 2870;BA.debugLine="For i = 0 To ID.YXArray.Size - 1";
{
final int step74 = 1;
final int limit74 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
 //BA.debugLineNum = 2871;BA.debugLine="Private YXVal() As Double";
_yxval = new double[(int) (0)];
;
 //BA.debugLineNum = 2872;BA.debugLine="YXVal = ID.YXArray.Get(i)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 2873;BA.debugLine="If Axis = sX Then  'X axis";
if (_axis==_sx) { 
 //BA.debugLineNum = 2874;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YXVal(0))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yxval[(int) (0)]);
 //BA.debugLineNum = 2875;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YXVal(0))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yxval[(int) (0)]);
 }else {
 //BA.debugLineNum = 2877;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YXVal(1))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yxval[(int) (1)]);
 //BA.debugLineNum = 2878;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YXVal(1))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yxval[(int) (1)]);
 };
 //BA.debugLineNum = 2880;BA.debugLine="If Graph.ChartType = \"BUBBLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 2881;BA.debugLine="mBubbleValMinMax(1) = Max(mBubbleValMinMax(";
_mbubblevalminmax[(int) (1)] = __c.Max(_mbubblevalminmax[(int) (1)],_yxval[(int) (2)]);
 //BA.debugLineNum = 2882;BA.debugLine="mBubbleValMinMax(0) = Min(mBubbleValMinMax(";
_mbubblevalminmax[(int) (0)] = __c.Min(_mbubblevalminmax[(int) (0)],_yxval[(int) (2)]);
 };
 }
};
 }
};
 }else {
 //BA.debugLineNum = 2887;BA.debugLine="ID = Items.Get(Axis - 1)";
_id = (b4a.example.xchart._itemdata)(_items.Get((int) (_axis-1)));
 //BA.debugLineNum = 2888;BA.debugLine="For i = 0 To ID.YXArray.Size - 1";
{
final int step92 = 1;
final int limit92 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit92 ;_i = _i + step92 ) {
 //BA.debugLineNum = 2889;BA.debugLine="Private YXVal() As Double";
_yxval = new double[(int) (0)];
;
 //BA.debugLineNum = 2890;BA.debugLine="YXVal = ID.YXArray.Get(i)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 2891;BA.debugLine="If Axis = sX Then  'X axis";
if (_axis==_sx) { 
 //BA.debugLineNum = 2892;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YXVal(0))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yxval[(int) (0)]);
 //BA.debugLineNum = 2893;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YXVal(0))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yxval[(int) (0)]);
 //BA.debugLineNum = 2894;BA.debugLine="MMMValues(2) = MMMValues(2) + YXVal(0)";
_mmmvalues[(int) (2)] = _mmmvalues[(int) (2)]+_yxval[(int) (0)];
 }else {
 //BA.debugLineNum = 2896;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YXVal(1))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yxval[(int) (1)]);
 //BA.debugLineNum = 2897;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YXVal(1))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yxval[(int) (1)]);
 //BA.debugLineNum = 2898;BA.debugLine="MMMValues(2) = MMMValues(2) + YXVal(1)";
_mmmvalues[(int) (2)] = _mmmvalues[(int) (2)]+_yxval[(int) (1)];
 };
 }
};
 };
 //BA.debugLineNum = 2902;BA.debugLine="MMMValues(2) = 0";
_mmmvalues[(int) (2)] = 0;
 break; }
}
;
 //BA.debugLineNum = 2905;BA.debugLine="MinMaxMeanValues(0) = MMMValues(0)";
_minmaxmeanvalues[(int) (0)] = _mmmvalues[(int) (0)];
 //BA.debugLineNum = 2906;BA.debugLine="MinMaxMeanValues(1) = MMMValues(1)";
_minmaxmeanvalues[(int) (1)] = _mmmvalues[(int) (1)];
 //BA.debugLineNum = 2907;BA.debugLine="MinMaxMeanValues(2) = MMMValues(2)";
_minmaxmeanvalues[(int) (2)] = _mmmvalues[(int) (2)];
 //BA.debugLineNum = 2909;BA.debugLine="Return MMMValues";
if (true) return _mmmvalues;
 //BA.debugLineNum = 2910;BA.debugLine="End Sub";
return null;
}
public int  _getmaxnumberbars() throws Exception{
int _maxbars = 0;
int _minwidth = 0;
int _margin = 0;
 //BA.debugLineNum = 8866;BA.debugLine="Public Sub GetMaxNumberBars As Int";
 //BA.debugLineNum = 8867;BA.debugLine="Private MaxBars As Int";
_maxbars = 0;
 //BA.debugLineNum = 8868;BA.debugLine="Private MinWidth = 5dip As Int";
_minwidth = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 8869;BA.debugLine="Private Margin = 0.02 * xpnlGraph.Width As Int";
_margin = (int) (0.02*_xpnlgraph.getWidth());
 //BA.debugLineNum = 8871;BA.debugLine="InitChart";
_initchart();
 //BA.debugLineNum = 8872;BA.debugLine="MaxBars = (Graph.Width - Margin) / MinWidth - 1";
_maxbars = (int) ((_graph.Width /*int*/ -_margin)/(double)_minwidth-1);
 //BA.debugLineNum = 8873;BA.debugLine="Return MaxBars";
if (true) return _maxbars;
 //BA.debugLineNum = 8874;BA.debugLine="End Sub";
return 0;
}
public int  _getmaxnumberbars2() throws Exception{
int _maxbars = 0;
int _minitemwidth = 0;
int _margin = 0;
int _space = 0;
 //BA.debugLineNum = 8880;BA.debugLine="Public Sub GetMaxNumberBars2 As Int";
 //BA.debugLineNum = 8881;BA.debugLine="Private MaxBars, MinItemWidth As Int";
_maxbars = 0;
_minitemwidth = 0;
 //BA.debugLineNum = 8883;BA.debugLine="InitTextSizes";
_inittextsizes();
 //BA.debugLineNum = 8884;BA.debugLine="Graph.Left = MeasureTextWidth(\"-99999\", Texts.Sca";
_graph.Left /*int*/  = (int) (_measuretextwidth("-99999",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )+1.05*_texts.ScaleTextHeight /*int*/ +__c.DipToCurrent((int) (15)));
 //BA.debugLineNum = 8886;BA.debugLine="Graph.Left = Graph.Left + Texts.AxisTextHeight *";
_graph.Left /*int*/  = (int) (_graph.Left /*int*/ +_texts.AxisTextHeight /*int*/ *1.8);
 //BA.debugLineNum = 8887;BA.debugLine="Graph.Right = xpnlGraph.Width - 1.5 * Texts.Scale";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-1.5*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 8888;BA.debugLine="Graph.Width = Graph.Right - Graph.Left";
_graph.Width /*int*/  = (int) (_graph.Right /*int*/ -_graph.Left /*int*/ );
 //BA.debugLineNum = 8890;BA.debugLine="Private Margin = 0.02 * Graph.Width As Int";
_margin = (int) (0.02*_graph.Width /*int*/ );
 //BA.debugLineNum = 8892;BA.debugLine="Private Space As Int";
_space = 0;
 //BA.debugLineNum = 8894;BA.debugLine="Space = 1dip";
_space = __c.DipToCurrent((int) (1));
 //BA.debugLineNum = 8895;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 8896;BA.debugLine="MinItemWidth = 4dip * Items.Size + Space";
_minitemwidth = (int) (__c.DipToCurrent((int) (4))*_items.getSize()+_space);
 }else {
 //BA.debugLineNum = 8898;BA.debugLine="MinItemWidth = 4dip + Space";
_minitemwidth = (int) (__c.DipToCurrent((int) (4))+_space);
 };
 //BA.debugLineNum = 8901;BA.debugLine="MaxBars = (Graph.Width - Margin) / MinItemWidth";
_maxbars = (int) ((_graph.Width /*int*/ -_margin)/(double)_minitemwidth);
 //BA.debugLineNum = 8902;BA.debugLine="Return MaxBars";
if (true) return _maxbars;
 //BA.debugLineNum = 8903;BA.debugLine="End Sub";
return 0;
}
public double  _getmissingdatavalue() throws Exception{
 //BA.debugLineNum = 8321;BA.debugLine="Public Sub getMissingDataValue As Double";
 //BA.debugLineNum = 8322;BA.debugLine="Return mMissingDataValue";
if (true) return _mmissingdatavalue;
 //BA.debugLineNum = 8323;BA.debugLine="End Sub";
return 0;
}
public int  _getnbpoints() throws Exception{
 //BA.debugLineNum = 7899;BA.debugLine="Public Sub getNbPoints As Int";
 //BA.debugLineNum = 7901;BA.debugLine="Return Points.Size";
if (true) return _points.getSize();
 //BA.debugLineNum = 7902;BA.debugLine="End Sub";
return 0;
}
public int  _getnbxintervals() throws Exception{
 //BA.debugLineNum = 7842;BA.debugLine="Public Sub getNbXIntervals As Int";
 //BA.debugLineNum = 7843;BA.debugLine="Return Scale(sX).NbIntervals";
if (true) return _scale[_sx].NbIntervals /*int*/ ;
 //BA.debugLineNum = 7844;BA.debugLine="End Sub";
return 0;
}
public int  _getnbyintervals() throws Exception{
 //BA.debugLineNum = 7828;BA.debugLine="Public Sub getNbYIntervals As Int";
 //BA.debugLineNum = 7829;BA.debugLine="Return Scale(sY(0)).NbIntervals";
if (true) return _scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
 //BA.debugLineNum = 7830;BA.debugLine="End Sub";
return 0;
}
public boolean  _getpieaddpercentage() throws Exception{
 //BA.debugLineNum = 8067;BA.debugLine="Public Sub getPieAddPercentage As Boolean";
 //BA.debugLineNum = 8068;BA.debugLine="Return Graph.PieAddPercentage";
if (true) return _graph.PieAddPercentage /*boolean*/ ;
 //BA.debugLineNum = 8069;BA.debugLine="End Sub";
return false;
}
public int  _getpiegapdegrees() throws Exception{
 //BA.debugLineNum = 8057;BA.debugLine="Public Sub getPieGapDegrees As Int";
 //BA.debugLineNum = 8058;BA.debugLine="Return Graph.PieGapDegrees";
if (true) return _graph.PieGapDegrees /*int*/ ;
 //BA.debugLineNum = 8059;BA.debugLine="End Sub";
return 0;
}
public int  _getpiepercentagenbfractions() throws Exception{
 //BA.debugLineNum = 8077;BA.debugLine="Public Sub getPiePercentageNbFractions As Int";
 //BA.debugLineNum = 8078;BA.debugLine="Return mPiePercentageNbFractions";
if (true) return _mpiepercentagenbfractions;
 //BA.debugLineNum = 8079;BA.debugLine="End Sub";
return 0;
}
public int  _getpiestartangle() throws Exception{
 //BA.debugLineNum = 8047;BA.debugLine="Public Sub getPieStartAngle As Int";
 //BA.debugLineNum = 8048;BA.debugLine="Return Graph.PieStartAngle";
if (true) return _graph.PieStartAngle /*int*/ ;
 //BA.debugLineNum = 8049;BA.debugLine="End Sub";
return 0;
}
public boolean  _getradardrawscale() throws Exception{
 //BA.debugLineNum = 8176;BA.debugLine="Public Sub getRadarDrawScale As Boolean";
 //BA.debugLineNum = 8177;BA.debugLine="Return Graph.RadarDrawScale";
if (true) return _graph.RadarDrawScale /*boolean*/ ;
 //BA.debugLineNum = 8178;BA.debugLine="End Sub";
return false;
}
public boolean  _getradardrawscalevalues() throws Exception{
 //BA.debugLineNum = 8186;BA.debugLine="Public Sub getRadarDrawScaleValues As Boolean";
 //BA.debugLineNum = 8187;BA.debugLine="Return Graph.RadarDrawScaleValues";
if (true) return _graph.RadarDrawScaleValues /*boolean*/ ;
 //BA.debugLineNum = 8188;BA.debugLine="End Sub";
return false;
}
public String  _getradarscaletype() throws Exception{
 //BA.debugLineNum = 8196;BA.debugLine="Public Sub getRadarScaleType As String";
 //BA.debugLineNum = 8197;BA.debugLine="Return Graph.RadarScaleType";
if (true) return _graph.RadarScaleType /*String*/ ;
 //BA.debugLineNum = 8198;BA.debugLine="End Sub";
return "";
}
public int  _getradarstartangle() throws Exception{
 //BA.debugLineNum = 8165;BA.debugLine="Public Sub getRadarStartAngle As Int";
 //BA.debugLineNum = 8166;BA.debugLine="Return Graph.RadarStartAngle";
if (true) return _graph.RadarStartAngle /*int*/ ;
 //BA.debugLineNum = 8167;BA.debugLine="End Sub";
return 0;
}
public boolean  _getreverseyscale() throws Exception{
 //BA.debugLineNum = 8332;BA.debugLine="Public Sub getReverseYScale As Boolean";
 //BA.debugLineNum = 8333;BA.debugLine="Return Scale(sY(0)).ReverseYScale";
if (true) return _scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ;
 //BA.debugLineNum = 8334;BA.debugLine="End Sub";
return false;
}
public double  _getrotation() throws Exception{
 //BA.debugLineNum = 7912;BA.debugLine="Public Sub getRotation As Double";
 //BA.debugLineNum = 7913;BA.debugLine="Return Graph.Rotation";
if (true) return _graph.Rotation /*double*/ ;
 //BA.debugLineNum = 7914;BA.debugLine="End Sub";
return 0;
}
public double  _getscalemant(double _scalemant0,int _axis) throws Exception{
double _scalemant1 = 0;
int _i = 0;
 //BA.debugLineNum = 2704;BA.debugLine="Private Sub GetScaleMant(ScaleMant0 As Double, Axi";
 //BA.debugLineNum = 2705;BA.debugLine="Private ScaleMant1 As Double";
_scalemant1 = 0;
 //BA.debugLineNum = 2707;BA.debugLine="ScaleLogVals(Axis)";
_scalelogvals(_axis);
 //BA.debugLineNum = 2709;BA.debugLine="If Round2(ScaleMant0, 14) <= Round2(ScaleLog(Axis";
if (__c.Round2(_scalemant0,(int) (14))<=__c.Round2(_scalelog[_axis].Logs /*double[]*/ [(int) (0)],(int) (14))) { 
 //BA.debugLineNum = 2710;BA.debugLine="ScaleMant1 = 0";
_scalemant1 = 0;
 }else {
 //BA.debugLineNum = 2712;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step6 = 1;
final int limit6 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 2713;BA.debugLine="If Round2(ScaleMant0, 14) > Round2(ScaleLog(Axi";
if (__c.Round2(_scalemant0,(int) (14))>__c.Round2(_scalelog[_axis].Logs /*double[]*/ [_i],(int) (14)) && __c.Round2(_scalemant0,(int) (14))<=__c.Round2(_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)],(int) (14))) { 
 //BA.debugLineNum = 2714;BA.debugLine="ScaleMant1 = Logarithm(ScaleLog(Axis).Vals(i +";
_scalemant1 = __c.Logarithm(_scalelog[_axis].Vals /*double[]*/ [(int) (_i+1)],10);
 //BA.debugLineNum = 2715;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 2720;BA.debugLine="Return ScaleMant1";
if (true) return _scalemant1;
 //BA.debugLineNum = 2721;BA.debugLine="End Sub";
return 0;
}
public boolean  _getscalesonzoomedpart() throws Exception{
 //BA.debugLineNum = 8349;BA.debugLine="Public Sub getScalesOnZoomedPart As Boolean";
 //BA.debugLineNum = 8350;BA.debugLine="Return Zoom.ScalesOnZoomedPart";
if (true) return _zoom.ScalesOnZoomedPart /*boolean*/ ;
 //BA.debugLineNum = 8351;BA.debugLine="End Sub";
return false;
}
public float  _getscaletextsize() throws Exception{
 //BA.debugLineNum = 7537;BA.debugLine="Public Sub getScaleTextSize As Float";
 //BA.debugLineNum = 7538;BA.debugLine="Return Texts.ScaleTextSize";
if (true) return _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 7539;BA.debugLine="End Sub";
return 0f;
}
public String  _getscalevalues() throws Exception{
 //BA.debugLineNum = 7606;BA.debugLine="Public Sub getScaleValues As String";
 //BA.debugLineNum = 7607;BA.debugLine="Return Scale(sY(0)).ScaleValues";
if (true) return _scale[_sy[(int) (0)]].ScaleValues /*String*/ ;
 //BA.debugLineNum = 7608;BA.debugLine="End Sub";
return "";
}
public String  _getscalexvalueslog() throws Exception{
 //BA.debugLineNum = 7643;BA.debugLine="Public Sub getScaleXValuesLog As String";
 //BA.debugLineNum = 7644;BA.debugLine="Return ScaleLog(sX).ScaleValues";
if (true) return _scalelog[_sx].ScaleValues /*String*/ ;
 //BA.debugLineNum = 7645;BA.debugLine="End Sub";
return "";
}
public String  _getscaleyvalueslog() throws Exception{
 //BA.debugLineNum = 7626;BA.debugLine="Public Sub getScaleYValuesLog As String";
 //BA.debugLineNum = 7627;BA.debugLine="Return ScaleLog(sY(0)).ScaleValues";
if (true) return _scalelog[_sy[(int) (0)]].ScaleValues /*String*/ ;
 //BA.debugLineNum = 7628;BA.debugLine="End Sub";
return "";
}
public int  _getsemitransparentcolor(int _color,int _alpha) throws Exception{
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
int _yiq = 0;
 //BA.debugLineNum = 6979;BA.debugLine="Private Sub GetSemiTransparentColor(Color As Int,";
 //BA.debugLineNum = 6980;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
 //BA.debugLineNum = 6982;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
 //BA.debugLineNum = 6983;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
 //BA.debugLineNum = 6984;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
 //BA.debugLineNum = 6985;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
 //BA.debugLineNum = 6987;BA.debugLine="a = Alpha";
_a = _alpha;
 //BA.debugLineNum = 6989;BA.debugLine="Return xui.Color_ARGB(a, r, g, b)";
if (true) return _xui.Color_ARGB(_a,_r,_g,_b);
 //BA.debugLineNum = 6990;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getsnapshot() throws Exception{
 //BA.debugLineNum = 7905;BA.debugLine="Public Sub getSnapshot As B4XBitmap";
 //BA.debugLineNum = 7906;BA.debugLine="Return xpnlGraph.Snapshot";
if (true) return _xpnlgraph.Snapshot();
 //BA.debugLineNum = 7907;BA.debugLine="End Sub";
return null;
}
public String  _getsubtitle() throws Exception{
 //BA.debugLineNum = 7986;BA.debugLine="Public Sub getSubtitle As String";
 //BA.debugLineNum = 7987;BA.debugLine="Return Graph.Subtitle";
if (true) return _graph.Subtitle /*String*/ ;
 //BA.debugLineNum = 7988;BA.debugLine="End Sub";
return "";
}
public float  _getsubtitletextsize() throws Exception{
 //BA.debugLineNum = 7996;BA.debugLine="Public Sub getSubtitleTextSize As Float";
 //BA.debugLineNum = 7997;BA.debugLine="Return Texts.AxisTextSize";
if (true) return _texts.AxisTextSize /*float*/ ;
 //BA.debugLineNum = 7998;BA.debugLine="End Sub";
return 0f;
}
public String  _gettitle() throws Exception{
 //BA.debugLineNum = 7230;BA.debugLine="Public Sub getTitle As String";
 //BA.debugLineNum = 7231;BA.debugLine="Return Graph.Title";
if (true) return _graph.Title /*String*/ ;
 //BA.debugLineNum = 7232;BA.debugLine="End Sub";
return "";
}
public float  _gettitletextsize() throws Exception{
 //BA.debugLineNum = 7513;BA.debugLine="Public Sub getTitleTextSize As Float";
 //BA.debugLineNum = 7514;BA.debugLine="Return Texts.TitleTextSize";
if (true) return _texts.TitleTextSize /*float*/ ;
 //BA.debugLineNum = 7515;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop() throws Exception{
 //BA.debugLineNum = 7464;BA.debugLine="Public Sub getTop As Int";
 //BA.debugLineNum = 7465;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 7466;BA.debugLine="End Sub";
return 0;
}
public float  _getvaluestextsize() throws Exception{
 //BA.debugLineNum = 7561;BA.debugLine="Public Sub getValuesTextSize As Float";
 //BA.debugLineNum = 7562;BA.debugLine="Return Values.TextSize";
if (true) return _values.TextSize /*float*/ ;
 //BA.debugLineNum = 7563;BA.debugLine="End Sub";
return 0f;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 7493;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 7494;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 7495;BA.debugLine="End Sub";
return false;
}
public double[]  _getwaterfallminmaxvalues() throws Exception{
int _i = 0;
double _total = 0;
double[] _mmmvalues = null;
b4a.example.xchart._pointdata _pd = null;
 //BA.debugLineNum = 2913;BA.debugLine="Private Sub GetWaterfallMinMaxValues As Double()";
 //BA.debugLineNum = 2914;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 2915;BA.debugLine="Private Total, MMMValues(3) As Double";
_total = 0;
_mmmvalues = new double[(int) (3)];
;
 //BA.debugLineNum = 2917;BA.debugLine="MMMValues(1) = -1E10";
_mmmvalues[(int) (1)] = -1e10;
 //BA.debugLineNum = 2918;BA.debugLine="MMMValues(0) = 1E10";
_mmmvalues[(int) (0)] = 1e10;
 //BA.debugLineNum = 2919;BA.debugLine="MMMValues(2) = 0";
_mmmvalues[(int) (2)] = 0;
 //BA.debugLineNum = 2921;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 2922;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 2923;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2924;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 2925;BA.debugLine="PD.YArray(1) = PD.YArray(0)";
_pd.YArray /*double[]*/ [(int) (1)] = _pd.YArray /*double[]*/ [(int) (0)];
 //BA.debugLineNum = 2926;BA.debugLine="Total = PD.YArray(0)";
_total = _pd.YArray /*double[]*/ [(int) (0)];
 }else {
 //BA.debugLineNum = 2928;BA.debugLine="If PD.BarType = \"T\" Then";
if ((_pd.BarType /*String*/ ).equals("T")) { 
 //BA.debugLineNum = 2929;BA.debugLine="PD.YArray(0) = Total";
_pd.YArray /*double[]*/ [(int) (0)] = _total;
 //BA.debugLineNum = 2930;BA.debugLine="PD.YArray(1) = Total";
_pd.YArray /*double[]*/ [(int) (1)] = _total;
 }else {
 //BA.debugLineNum = 2932;BA.debugLine="Total = Total + PD.YArray(0)";
_total = _total+_pd.YArray /*double[]*/ [(int) (0)];
 //BA.debugLineNum = 2933;BA.debugLine="PD.YArray(1) = Total";
_pd.YArray /*double[]*/ [(int) (1)] = _total;
 };
 };
 //BA.debugLineNum = 2936;BA.debugLine="MMMValues(1) = Max(MMMValues(1), PD.YArray(1))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_pd.YArray /*double[]*/ [(int) (1)]);
 //BA.debugLineNum = 2937;BA.debugLine="MMMValues(0) = Min(MMMValues(0), PD.YArray(1))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_pd.YArray /*double[]*/ [(int) (1)]);
 //BA.debugLineNum = 2940;BA.debugLine="MinMaxMeanValues(0) = MMMValues(0)";
_minmaxmeanvalues[(int) (0)] = _mmmvalues[(int) (0)];
 //BA.debugLineNum = 2941;BA.debugLine="MinMaxMeanValues(1) = MMMValues(1)";
_minmaxmeanvalues[(int) (1)] = _mmmvalues[(int) (1)];
 }
};
 //BA.debugLineNum = 2944;BA.debugLine="Return MMMValues";
if (true) return _mmmvalues;
 //BA.debugLineNum = 2945;BA.debugLine="End Sub";
return null;
}
public int  _getwaterfalltotalbarcolor() throws Exception{
 //BA.debugLineNum = 8433;BA.debugLine="Public Sub getWaterfallTotalBarColor As Int";
 //BA.debugLineNum = 8434;BA.debugLine="Return Bar.TotalBarColor";
if (true) return _bar.TotalBarColor /*int*/ ;
 //BA.debugLineNum = 8435;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth() throws Exception{
 //BA.debugLineNum = 7473;BA.debugLine="Public Sub getWidth As Int";
 //BA.debugLineNum = 7474;BA.debugLine="Return mBase.Width";
if (true) return _mbase.getWidth();
 //BA.debugLineNum = 7475;BA.debugLine="End Sub";
return 0;
}
public String  _getxaxisname() throws Exception{
 //BA.debugLineNum = 7239;BA.debugLine="Public Sub getXAxisName As String";
 //BA.debugLineNum = 7240;BA.debugLine="Return Graph.XAxisName";
if (true) return _graph.XAxisName /*String*/ ;
 //BA.debugLineNum = 7241;BA.debugLine="End Sub";
return "";
}
public String  _getxintervals() throws Exception{
int _i = 0;
b4a.example.xchart._pointdata _pd = null;
 //BA.debugLineNum = 6891;BA.debugLine="Private Sub GetXIntervals";
 //BA.debugLineNum = 6892;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 6894;BA.debugLine="For i = Zoom.BeginIndex To Zoom.EndIndex";
{
final int step2 = 1;
final int limit2 = _zoom.EndIndex /*int*/ ;
_i = _zoom.BeginIndex /*int*/  ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 6895;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 6896;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 6897;BA.debugLine="If PD.ShowTick = True Then";
if (_pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 6898;BA.debugLine="Scale(sX).NbIntervals = Scale(sX).NbIntervals +";
_scale[_sx].NbIntervals /*int*/  = (int) (_scale[_sx].NbIntervals /*int*/ +1);
 };
 }
};
 //BA.debugLineNum = 6901;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 6902;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 6903;BA.debugLine="Scale(sX).Scale = Graph.Height";
_scale[_sx].Scale /*double*/  = _graph.Height /*int*/ ;
 }else {
 //BA.debugLineNum = 6905;BA.debugLine="Scale(sX).Scale = Graph.Height / (Zoom.NbVisibl";
_scale[_sx].Scale /*double*/  = _graph.Height /*int*/ /(double)(_zoom.NbVisiblePoints /*int*/ -1);
 };
 }else {
 //BA.debugLineNum = 6908;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 6909;BA.debugLine="Scale(sX).Scale = Graph.Width";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ ;
 }else {
 //BA.debugLineNum = 6911;BA.debugLine="Scale(sX).Scale = Graph.Width / (Zoom.NbVisible";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_zoom.NbVisiblePoints /*int*/ -1);
 };
 };
 //BA.debugLineNum = 6914;BA.debugLine="End Sub";
return "";
}
public double  _getxmaxvalue() throws Exception{
 //BA.debugLineNum = 8119;BA.debugLine="Public Sub getXMaxValue As Double";
 //BA.debugLineNum = 8120;BA.debugLine="Return Scale(sX).MaxManu";
if (true) return _scale[_sx].MaxManu /*double*/ ;
 //BA.debugLineNum = 8121;BA.debugLine="End Sub";
return 0;
}
public double  _getxminvalue() throws Exception{
 //BA.debugLineNum = 8109;BA.debugLine="Public Sub getXMinValue As Double";
 //BA.debugLineNum = 8110;BA.debugLine="Return Scale(sX).MinManu";
if (true) return _scale[_sx].MinManu /*double*/ ;
 //BA.debugLineNum = 8111;BA.debugLine="End Sub";
return 0;
}
public boolean  _getxscalelogarithmic() throws Exception{
 //BA.debugLineNum = 8100;BA.debugLine="Public Sub getXScaleLogarithmic As Boolean";
 //BA.debugLineNum = 8101;BA.debugLine="Return Scale(sX).Logarithmic";
if (true) return _scale[_sx].Logarithmic /*boolean*/ ;
 //BA.debugLineNum = 8102;BA.debugLine="End Sub";
return false;
}
public double  _getxscalemaxvalue() throws Exception{
 //BA.debugLineNum = 7344;BA.debugLine="Public Sub getXScaleMaxValue As Double";
 //BA.debugLineNum = 7345;BA.debugLine="Return Scale(sX).MaxVal";
if (true) return _scale[_sx].MaxVal /*double*/ ;
 //BA.debugLineNum = 7346;BA.debugLine="End Sub";
return 0;
}
public double  _getxscaleminvalue() throws Exception{
 //BA.debugLineNum = 7358;BA.debugLine="Public Sub getXScaleMinValue As Double";
 //BA.debugLineNum = 7359;BA.debugLine="Return Scale(sX).MinVal";
if (true) return _scale[_sx].MinVal /*double*/ ;
 //BA.debugLineNum = 7360;BA.debugLine="End Sub";
return 0;
}
public String  _getxscaletextorientation() throws Exception{
 //BA.debugLineNum = 7431;BA.debugLine="Public Sub getXScaleTextOrientation As String";
 //BA.debugLineNum = 7432;BA.debugLine="Return Graph.XScaleTextOrientation";
if (true) return _graph.XScaleTextOrientation /*String*/ ;
 //BA.debugLineNum = 7433;BA.debugLine="End Sub";
return "";
}
public int  _getxscalewidth() throws Exception{
int _width = 0;
int _i = 0;
b4a.example.xchart._pointdata _pd = null;
 //BA.debugLineNum = 2948;BA.debugLine="Private Sub GetXScaleWidth As Int";
 //BA.debugLineNum = 2949;BA.debugLine="Private Width As Int";
_width = 0;
 //BA.debugLineNum = 2951;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Or Graph.ChartTyp";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 2952;BA.debugLine="If Scale(sY(0)).Automatic = True Then";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2953;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sX";
_width = _measuretextwidth(_numberformat3(_scale[_sx].MaxVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2954;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 2955;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }else {
 //BA.debugLineNum = 2957;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sX";
_width = _measuretextwidth(_numberformat3(_scale[_sx].MaxVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2958;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 2959;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 2960;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MaxVal /*double*/ -_scale[_sy[(int) (0)]].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 2961;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MinVal /*double*/ +_scale[_sy[(int) (0)]].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 };
 }else {
 //BA.debugLineNum = 2965;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 2966;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 2967;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2968;BA.debugLine="If (Graph.ChartType = \"LINE\" Or Graph.ChartType";
if (((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) && _pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2969;BA.debugLine="Width = Max(Width, MeasureTextWidth(PD.X, Text";
_width = (int) (__c.Max(_width,_measuretextwidth(_pd.X /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }else {
 //BA.debugLineNum = 2971;BA.debugLine="Width = Max(Width, MeasureTextWidth(PD.X, Text";
_width = (int) (__c.Max(_width,_measuretextwidth(_pd.X /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 };
 }
};
 };
 //BA.debugLineNum = 2975;BA.debugLine="Return Width";
if (true) return _width;
 //BA.debugLineNum = 2976;BA.debugLine="End Sub";
return 0;
}
public boolean  _getxzeroaxis() throws Exception{
 //BA.debugLineNum = 7853;BA.debugLine="Public Sub getXZeroAxis As Boolean";
 //BA.debugLineNum = 7854;BA.debugLine="Return Scale(sX).YZeroAxis";
if (true) return _scale[_sx].YZeroAxis /*boolean*/ ;
 //BA.debugLineNum = 7855;BA.debugLine="End Sub";
return false;
}
public boolean  _getxzeroaxishighlight() throws Exception{
 //BA.debugLineNum = 7863;BA.debugLine="Public Sub getXZeroAxisHighlight As Boolean";
 //BA.debugLineNum = 7864;BA.debugLine="Return Scale(sX).YZeroAxisHighlight";
if (true) return _scale[_sx].YZeroAxisHighlight /*boolean*/ ;
 //BA.debugLineNum = 7865;BA.debugLine="End Sub";
return false;
}
public String  _getyaxisname() throws Exception{
 //BA.debugLineNum = 7249;BA.debugLine="Public Sub getYAxisName As String";
 //BA.debugLineNum = 7250;BA.debugLine="Return Graph.YAxisName";
if (true) return _graph.YAxisName /*String*/ ;
 //BA.debugLineNum = 7251;BA.debugLine="End Sub";
return "";
}
public String  _getyaxisname2() throws Exception{
 //BA.debugLineNum = 7260;BA.debugLine="Public Sub getYAxisName2 As String";
 //BA.debugLineNum = 7261;BA.debugLine="Return Graph.YAxisName2";
if (true) return _graph.YAxisName2 /*String*/ ;
 //BA.debugLineNum = 7262;BA.debugLine="End Sub";
return "";
}
public double  _getymaxvalue() throws Exception{
 //BA.debugLineNum = 8153;BA.debugLine="Public Sub getYMaxValue As Double";
 //BA.debugLineNum = 8154;BA.debugLine="Return Scale(sY(0)).MaxManu";
if (true) return _scale[_sy[(int) (0)]].MaxManu /*double*/ ;
 //BA.debugLineNum = 8155;BA.debugLine="End Sub";
return 0;
}
public double  _getyminvalue() throws Exception{
 //BA.debugLineNum = 8143;BA.debugLine="Public Sub getYMinValue As Double";
 //BA.debugLineNum = 8144;BA.debugLine="Return Scale(sY(0)).MinManu";
if (true) return _scale[_sy[(int) (0)]].MinManu /*double*/ ;
 //BA.debugLineNum = 8145;BA.debugLine="End Sub";
return 0;
}
public boolean  _getyscalelogaritmic() throws Exception{
 //BA.debugLineNum = 8089;BA.debugLine="Public Sub getYScaleLogaritmic As Boolean";
 //BA.debugLineNum = 8090;BA.debugLine="Return Scale(sY(0)).Logarithmic";
if (true) return _scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ;
 //BA.debugLineNum = 8091;BA.debugLine="End Sub";
return false;
}
public double  _getyscalemaxvalue() throws Exception{
 //BA.debugLineNum = 7271;BA.debugLine="Public Sub getYScaleMaxValue As Double";
 //BA.debugLineNum = 7272;BA.debugLine="Return Scale(sY(0)).MaxVal";
if (true) return _scale[_sy[(int) (0)]].MaxVal /*double*/ ;
 //BA.debugLineNum = 7273;BA.debugLine="End Sub";
return 0;
}
public double  _getyscaleminvalue() throws Exception{
 //BA.debugLineNum = 7307;BA.debugLine="Public Sub getYScaleMinValue As Double";
 //BA.debugLineNum = 7308;BA.debugLine="Return Scale(sY(0)).MinVal";
if (true) return _scale[_sy[(int) (0)]].MinVal /*double*/ ;
 //BA.debugLineNum = 7309;BA.debugLine="End Sub";
return 0;
}
public double  _getyscalenmaxvalue(int _index) throws Exception{
 //BA.debugLineNum = 7285;BA.debugLine="Public Sub GetYScaleNMaxValue(Index As Int) As Dou";
 //BA.debugLineNum = 7286;BA.debugLine="Return Scale(sY(Index)).MaxVal";
if (true) return _scale[_sy[_index]].MaxVal /*double*/ ;
 //BA.debugLineNum = 7287;BA.debugLine="End Sub";
return 0;
}
public double  _getyscalenminvalue(int _index) throws Exception{
 //BA.debugLineNum = 7321;BA.debugLine="Public Sub GetYScaleNMinValue(Index As Int) As Dou";
 //BA.debugLineNum = 7322;BA.debugLine="Return Scale(sY(Index)).MinVal";
if (true) return _scale[_sy[_index]].MinVal /*double*/ ;
 //BA.debugLineNum = 7323;BA.debugLine="End Sub";
return 0;
}
public int  _getyscalewidth(int _index) throws Exception{
int _width = 0;
int _i = 0;
 //BA.debugLineNum = 2979;BA.debugLine="Private Sub GetYScaleWidth(Index As Int) As Int";
 //BA.debugLineNum = 2980;BA.debugLine="Private Width As Int";
_width = 0;
 //BA.debugLineNum = 2982;BA.debugLine="If Scale(sY(0)).Automatic = True And Scale(sY(0))";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True && _scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2983;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sY(";
_width = _measuretextwidth(_numberformat3(_scale[_sy[_index]].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2984;BA.debugLine="For i = 1 To Scale(sY(Index)).NbIntervals";
{
final int step4 = 1;
final int limit4 = _scale[_sy[_index]].NbIntervals /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 2985;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy[_index]].MinVal /*double*/ +_i*_scale[_sy[_index]].IntervalAuto /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 }else {
 //BA.debugLineNum = 2988;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sY(";
_width = _measuretextwidth(_numberformat3(_scale[_sy[_index]].MaxVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2989;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy[_index]].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 2990;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy[_index]].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 2991;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy[_index]].MaxVal /*double*/ -_scale[_sy[(_index)]].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 2992;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy[_index]].MinVal /*double*/ +_scale[_sy[(_index)]].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 };
 //BA.debugLineNum = 2994;BA.debugLine="Return Width";
if (true) return _width;
 //BA.debugLineNum = 2995;BA.debugLine="End Sub";
return 0;
}
public int  _getyxchartcrosshaircolor() throws Exception{
 //BA.debugLineNum = 8310;BA.debugLine="Public Sub getYXChartCrossHairColor As Int";
 //BA.debugLineNum = 8311;BA.debugLine="Return mYXChartCrossHairColor";
if (true) return _myxchartcrosshaircolor;
 //BA.debugLineNum = 8312;BA.debugLine="End Sub";
return 0;
}
public int  _getyxchartcrosshairdeltay() throws Exception{
 //BA.debugLineNum = 8299;BA.debugLine="Public Sub getYXChartCrossHairDeltaY As Int";
 //BA.debugLineNum = 8300;BA.debugLine="Return mYXChartCrossHairColor";
if (true) return _myxchartcrosshaircolor;
 //BA.debugLineNum = 8301;BA.debugLine="End Sub";
return 0;
}
public boolean  _getyxchartdisplaycrosshair() throws Exception{
 //BA.debugLineNum = 8288;BA.debugLine="Public Sub getYXChartDisplayCrossHair As Boolean";
 //BA.debugLineNum = 8289;BA.debugLine="Return mYXChartDisplayCrossHair";
if (true) return _myxchartdisplaycrosshair;
 //BA.debugLineNum = 8290;BA.debugLine="End Sub";
return false;
}
public String  _getyxchartdisplayposition() throws Exception{
 //BA.debugLineNum = 8274;BA.debugLine="Public Sub getYXChartDisplayPosition As String";
 //BA.debugLineNum = 8275;BA.debugLine="Return mYXChartDisplayPosition";
if (true) return _myxchartdisplayposition;
 //BA.debugLineNum = 8276;BA.debugLine="End Sub";
return "";
}
public boolean  _getyxchartdisplayvalues() throws Exception{
 //BA.debugLineNum = 8260;BA.debugLine="Public Sub getYXChartDisplayValues As Boolean";
 //BA.debugLineNum = 8261;BA.debugLine="Return mYXChartDisplayValues";
if (true) return _myxchartdisplayvalues;
 //BA.debugLineNum = 8262;BA.debugLine="End Sub";
return false;
}
public boolean  _getyzeroaxis() throws Exception{
 //BA.debugLineNum = 7874;BA.debugLine="Public Sub getYZeroAxis As Boolean";
 //BA.debugLineNum = 7875;BA.debugLine="Return Scale(sY(0)).YZeroAxis";
if (true) return _scale[_sy[(int) (0)]].YZeroAxis /*boolean*/ ;
 //BA.debugLineNum = 7876;BA.debugLine="End Sub";
return false;
}
public boolean  _getyzeroaxishighlight() throws Exception{
 //BA.debugLineNum = 7887;BA.debugLine="Public Sub getYZeroAxisHighlight As Boolean";
 //BA.debugLineNum = 7888;BA.debugLine="Return Scale(sY(0)).YZeroAxisHighlight";
if (true) return _scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/ ;
 //BA.debugLineNum = 7889;BA.debugLine="End Sub";
return false;
}
public boolean  _getzoombarenabled() throws Exception{
 //BA.debugLineNum = 9085;BA.debugLine="Public Sub getZoomBarEnabled As Boolean";
 //BA.debugLineNum = 9086;BA.debugLine="Return Zoom.Enabled";
if (true) return _zoom.Enabled /*boolean*/ ;
 //BA.debugLineNum = 9087;BA.debugLine="End Sub";
return false;
}
public int  _getzoombeginindex() throws Exception{
 //BA.debugLineNum = 9066;BA.debugLine="Public Sub getZoomBeginIndex As Int";
 //BA.debugLineNum = 9067;BA.debugLine="Return Zoom.BeginIndex";
if (true) return _zoom.BeginIndex /*int*/ ;
 //BA.debugLineNum = 9068;BA.debugLine="End Sub";
return 0;
}
public int  _getzoombigstep() throws Exception{
 //BA.debugLineNum = 9060;BA.debugLine="Public Sub getZoomBigStep As Int";
 //BA.debugLineNum = 9061;BA.debugLine="Return Zoom.BigStep";
if (true) return _zoom.BigStep /*int*/ ;
 //BA.debugLineNum = 9062;BA.debugLine="End Sub";
return 0;
}
public int  _getzoomendindex() throws Exception{
 //BA.debugLineNum = 9072;BA.debugLine="Public Sub getZoomEndIndex As Int";
 //BA.debugLineNum = 9073;BA.debugLine="Return Zoom.EndIndex";
if (true) return _zoom.EndIndex /*int*/ ;
 //BA.debugLineNum = 9074;BA.debugLine="End Sub";
return 0;
}
public int  _getzoomnbvisiblepoints() throws Exception{
 //BA.debugLineNum = 9078;BA.debugLine="Public Sub getZoomNbVisiblePoints As Int";
 //BA.debugLineNum = 9079;BA.debugLine="Return Zoom.NbVisiblePoints";
if (true) return _zoom.NbVisiblePoints /*int*/ ;
 //BA.debugLineNum = 9080;BA.debugLine="End Sub";
return 0;
}
public int  _getzoomsmallstep() throws Exception{
 //BA.debugLineNum = 9054;BA.debugLine="Public Sub getZoomSmallStep As Int";
 //BA.debugLineNum = 9055;BA.debugLine="Return Zoom.SmallStep";
if (true) return _zoom.SmallStep /*int*/ ;
 //BA.debugLineNum = 9056;BA.debugLine="End Sub";
return 0;
}
public String  _hideline(int _lineindex,boolean _hidden) throws Exception{
b4a.example.xchart._itemdata _id = null;
 //BA.debugLineNum = 8481;BA.debugLine="Public Sub HideLine(LineIndex As Int, Hidden As Bo";
 //BA.debugLineNum = 8482;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 8484;BA.debugLine="ID = Items.Get(LineIndex)";
_id = (b4a.example.xchart._itemdata)(_items.Get(_lineindex));
 //BA.debugLineNum = 8485;BA.debugLine="ID.HideLine = Hidden";
_id.HideLine /*boolean*/  = _hidden;
 //BA.debugLineNum = 8486;BA.debugLine="End Sub";
return "";
}
public String  _initchart() throws Exception{
 //BA.debugLineNum = 1630;BA.debugLine="Private Sub InitChart";
 //BA.debugLineNum = 1631;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 1632;BA.debugLine="InitChartH";
_initcharth();
 }else {
 //BA.debugLineNum = 1634;BA.debugLine="InitChartV";
_initchartv();
 };
 //BA.debugLineNum = 1636;BA.debugLine="End Sub";
return "";
}
public String  _initcharth() throws Exception{
b4a.example.xchart._pointdata _pd = null;
int _margin = 0;
int _space = 0;
double _spaceratio = 0;
int _limit = 0;
 //BA.debugLineNum = 2032;BA.debugLine="Private Sub InitChartH";
 //BA.debugLineNum = 2033;BA.debugLine="InitTextSizes";
_inittextsizes();
 //BA.debugLineNum = 2034;BA.debugLine="InitValues";
_initvalues();
 //BA.debugLineNum = 2036;BA.debugLine="If Zoom.EndIndex = 0 Then";
if (_zoom.EndIndex /*int*/ ==0) { 
 //BA.debugLineNum = 2037;BA.debugLine="Zoom.BeginIndex = 0";
_zoom.BeginIndex /*int*/  = (int) (0);
 //BA.debugLineNum = 2038;BA.debugLine="Zoom.EndIndex = Points.Size - 1";
_zoom.EndIndex /*int*/  = (int) (_points.getSize()-1);
 //BA.debugLineNum = 2039;BA.debugLine="Zoom.NbVisiblePoints = Points.Size";
_zoom.NbVisiblePoints /*int*/  = _points.getSize();
 };
 //BA.debugLineNum = 2042;BA.debugLine="xcvsCursor.ClearRect(xcvsCursor.TargetRect)";
_xcvscursor.ClearRect(_xcvscursor.getTargetRect());
 //BA.debugLineNum = 2043;BA.debugLine="xcvsValues.ClearRect(xcvsValues.TargetRect)";
_xcvsvalues.ClearRect(_xcvsvalues.getTargetRect());
 //BA.debugLineNum = 2045;BA.debugLine="If Zoom.NbVisiblePoints = 0 Then";
if (_zoom.NbVisiblePoints /*int*/ ==0) { 
 //BA.debugLineNum = 2046;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 2047;BA.debugLine="Graph.ErrorText = \"No data\"";
_graph.ErrorText /*String*/  = "No data";
 //BA.debugLineNum = 2048;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2051;BA.debugLine="If Scale(sY(0)).Automatic = True Then";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2052;BA.debugLine="CalcScaleAuto(sY(0))";
_calcscaleauto(_sy[(int) (0)]);
 }else {
 //BA.debugLineNum = 2054;BA.debugLine="CalcScaleManu(sY(0))";
_calcscalemanu(_sy[(int) (0)]);
 };
 //BA.debugLineNum = 2057;BA.debugLine="If Scale(sY(0)).DrawYScale = False Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2058;BA.debugLine="Graph.Left = 0.75 * Texts.AxisTextHeight";
_graph.Left /*int*/  = (int) (0.75*_texts.AxisTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 2060;BA.debugLine="Graph.Left = GetXScaleWidth + 1.05 * Texts.Scale";
_graph.Left /*int*/  = (int) (_getxscalewidth()+1.05*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2063;BA.debugLine="If Graph.XAxisName <> \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2064;BA.debugLine="Graph.Left = Graph.Left + Texts.AxisTextHeight *";
_graph.Left /*int*/  = (int) (_graph.Left /*int*/ +_texts.AxisTextHeight /*int*/ *1.8);
 };
 //BA.debugLineNum = 2066;BA.debugLine="If Scale(sY(0)).DrawYScale = False Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2067;BA.debugLine="Graph.Right = xpnlGraph.Width - 0.75 * Texts.Sca";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-0.75*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 2069;BA.debugLine="Graph.Right = xpnlGraph.Width - 2 * Texts.ScaleT";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-2*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2072;BA.debugLine="Graph.Width = Graph.Right - Graph.Left";
_graph.Width /*int*/  = (int) (_graph.Right /*int*/ -_graph.Left /*int*/ );
 //BA.debugLineNum = 2073;BA.debugLine="Graph.XInterval = Graph.Width / Scale(sY(0)).NbIn";
_graph.XInterval /*double*/  = _graph.Width /*int*/ /(double)_scale[_sy[(int) (0)]].NbIntervals /*int*/ ;
 //BA.debugLineNum = 2074;BA.debugLine="Graph.Width = Graph.XInterval * Scale(sY(0)).NbIn";
_graph.Width /*int*/  = (int) (_graph.XInterval /*double*/ *_scale[_sy[(int) (0)]].NbIntervals /*int*/ );
 //BA.debugLineNum = 2075;BA.debugLine="Graph.Right = Graph.Left + Graph.Width";
_graph.Right /*int*/  = (int) (_graph.Left /*int*/ +_graph.Width /*int*/ );
 //BA.debugLineNum = 2076;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2077;BA.debugLine="Graph.Top = 1.8 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (1.8*_texts.TitleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 2079;BA.debugLine="Graph.Top = 0.9 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (0.9*_texts.TitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2082;BA.debugLine="If Graph.Subtitle <> \"\" Then";
if ((_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2083;BA.debugLine="Graph.Top = Graph.Top + 1.5 * Texts.SubtitleText";
_graph.Top /*int*/  = (int) (_graph.Top /*int*/ +1.5*_texts.SubtitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2086;BA.debugLine="If Scale(sX).DrawXScale = False Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2087;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top - 0.";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -0.2*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 2089;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 2091;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top -";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -2.1*_texts.ScaleTextHeight /*int*/ );
 break; }
case 1: {
 //BA.debugLineNum = 2093;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top -";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -0.9*_texts.ScaleTextHeight /*int*/ -_getyscalewidth(_sy[(int) (0)]));
 break; }
case 2: {
 //BA.debugLineNum = 2095;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top -";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -0.9*_texts.ScaleTextHeight /*int*/ -_getyscalewidth(_sy[(int) (0)])*0.8);
 break; }
}
;
 };
 //BA.debugLineNum = 2099;BA.debugLine="If Graph.YAxisName <> \"\" Then";
if ((_graph.YAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2100;BA.debugLine="If mHChartsXScaleOnTop = True Then";
if (_mhchartsxscaleontop==__c.True) { 
 //BA.debugLineNum = 2101;BA.debugLine="Graph.Height = Graph.Height - 1.3 * Texts.AxisT";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -1.3*_texts.AxisTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 2103;BA.debugLine="Graph.Height = Graph.Height - 1.8 * Texts.AxisT";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -1.8*_texts.AxisTextHeight /*int*/ );
 };
 }else {
 //BA.debugLineNum = 2106;BA.debugLine="If Scale(sX).DrawXScale = False Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2107;BA.debugLine="Graph.Height = Graph.Height - 0.8 * Texts.Scale";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -0.8*_texts.ScaleTextHeight /*int*/ );
 };
 };
 //BA.debugLineNum = 2111;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _items.getSize()>0) { 
 //BA.debugLineNum = 2112;BA.debugLine="GetLegendLineNumbers(xpnlGraph.Width - 1.2 * Leg";
_getlegendlinenumbers((int) (_xpnlgraph.getWidth()-1.2*_legend.TextHeight /*int*/ ));
 //BA.debugLineNum = 2113;BA.debugLine="Legend.Height = (Legend.LineNumber + 0.8) * Lege";
_legend.Height /*int*/  = (int) ((_legend.LineNumber /*int*/ +0.8)*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2114;BA.debugLine="Graph.Height = Graph.Height - Legend.Height - 0.";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -_legend.Height /*int*/ -0.75*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 2117;BA.debugLine="BarWidth0 = False";
_barwidth0 = __c.False;
 //BA.debugLineNum = 2118;BA.debugLine="Private PD As PointData = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 2119;BA.debugLine="Private Margin As Int";
_margin = 0;
 //BA.debugLineNum = 2120;BA.debugLine="If Graph.ChartType = \"H_LINE\" Then";
if ((_graph.ChartType /*String*/ ).equals("H_LINE")) { 
 //BA.debugLineNum = 2121;BA.debugLine="Margin = 0";
_margin = (int) (0);
 //BA.debugLineNum = 2122;BA.debugLine="Graph.YInterval = (Graph.Height) / (Zoom.NbVisib";
_graph.YInterval /*int*/  = (int) ((_graph.Height /*int*/ )/(double)(_zoom.NbVisiblePoints /*int*/ -1));
 //BA.debugLineNum = 2123;BA.debugLine="Graph.Height =  Graph.YInterval * (Zoom.NbVisibl";
_graph.Height /*int*/  = (int) (_graph.YInterval /*int*/ *(_zoom.NbVisiblePoints /*int*/ -1)+_margin);
 }else {
 //BA.debugLineNum = 2125;BA.debugLine="Margin = 0.02 * Graph.Height";
_margin = (int) (0.02*_graph.Height /*int*/ );
 //BA.debugLineNum = 2126;BA.debugLine="Graph.YInterval = (Graph.Height - Margin) / Zoom";
_graph.YInterval /*int*/  = (int) ((_graph.Height /*int*/ -_margin)/(double)_zoom.NbVisiblePoints /*int*/ );
 //BA.debugLineNum = 2127;BA.debugLine="Graph.Height =  Graph.YInterval * Zoom.NbVisible";
_graph.Height /*int*/  = (int) (_graph.YInterval /*int*/ *_zoom.NbVisiblePoints /*int*/ +_margin);
 };
 //BA.debugLineNum = 2129;BA.debugLine="Graph.Bottom = Graph.Top + Graph.Height";
_graph.Bottom /*int*/  = (int) (_graph.Top /*int*/ +_graph.Height /*int*/ );
 //BA.debugLineNum = 2130;BA.debugLine="If mHChartsXScaleOnTop = True Then";
if (_mhchartsxscaleontop==__c.True) { 
 //BA.debugLineNum = 2131;BA.debugLine="Graph.Bottom = xpnlGraph.Height - 0.7 * Texts.Sc";
_graph.Bottom /*int*/  = (int) (_xpnlgraph.getHeight()-0.7*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2132;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Items.Siz";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _items.getSize()>0) { 
 //BA.debugLineNum = 2133;BA.debugLine="Graph.Bottom = Graph.Bottom - Legend.Height - 0";
_graph.Bottom /*int*/  = (int) (_graph.Bottom /*int*/ -_legend.Height /*int*/ -0.5*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 2135;BA.debugLine="Graph.Top = Graph.Bottom - Graph.Height";
_graph.Top /*int*/  = (int) (_graph.Bottom /*int*/ -_graph.Height /*int*/ );
 };
 //BA.debugLineNum = 2137;BA.debugLine="Graph.Rect.Initialize(Graph.Left, Graph.Top, Grap";
_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ),(float) (_graph.Right /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 2139;BA.debugLine="Scale(sY(0)).Scale = Graph.Width / (Scale(sY(0)).";
_scale[_sy[(int) (0)]].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_sy[(int) (0)]].MaxVal /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ );
 //BA.debugLineNum = 2140;BA.debugLine="Scale(sX).Scale = Graph.Height / (Scale(sX).MaxVa";
_scale[_sx].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sx].MaxVal /*double*/ -_scale[_sx].MinVal /*double*/ );
 //BA.debugLineNum = 2142;BA.debugLine="Private Space As Int";
_space = 0;
 //BA.debugLineNum = 2143;BA.debugLine="If Graph.ChartType = \"H_BAR\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("H_BAR") || (_graph.ChartType /*String*/ ).equals("H_STACKED_BAR")) { 
 //BA.debugLineNum = 2144;BA.debugLine="Select Items.Size";
switch (BA.switchObjectToInt(_items.getSize(),(int) (1),(int) (2),(int) (3))) {
case 0: {
 //BA.debugLineNum = 2146;BA.debugLine="If Zoom.NbVisiblePoints <= 40 Then";
if (_zoom.NbVisiblePoints /*int*/ <=40) { 
 //BA.debugLineNum = 2147;BA.debugLine="Private SpaceRatio As Double";
_spaceratio = 0;
 //BA.debugLineNum = 2148;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 2149;BA.debugLine="SpaceRatio = 1";
_spaceratio = 1;
 }else if(_zoom.NbVisiblePoints /*int*/ ==2) { 
 //BA.debugLineNum = 2151;BA.debugLine="SpaceRatio = 0.85";
_spaceratio = 0.85;
 }else if(_zoom.NbVisiblePoints /*int*/ ==3) { 
 //BA.debugLineNum = 2153;BA.debugLine="SpaceRatio = 0.75";
_spaceratio = 0.75;
 }else if(_zoom.NbVisiblePoints /*int*/ ==4) { 
 //BA.debugLineNum = 2155;BA.debugLine="SpaceRatio = 0.6";
_spaceratio = 0.6;
 }else if(_zoom.NbVisiblePoints /*int*/ ==5) { 
 //BA.debugLineNum = 2157;BA.debugLine="SpaceRatio = 0.5";
_spaceratio = 0.5;
 }else if(_zoom.NbVisiblePoints /*int*/ >5 && _zoom.NbVisiblePoints /*int*/ <=20) { 
 //BA.debugLineNum = 2159;BA.debugLine="SpaceRatio = 0.4";
_spaceratio = 0.4;
 }else if(_zoom.NbVisiblePoints /*int*/ >20 && _zoom.NbVisiblePoints /*int*/ <=30) { 
 //BA.debugLineNum = 2161;BA.debugLine="SpaceRatio = 0.3";
_spaceratio = 0.3;
 }else {
 //BA.debugLineNum = 2163;BA.debugLine="SpaceRatio = 0.2";
_spaceratio = 0.2;
 };
 //BA.debugLineNum = 2165;BA.debugLine="Space = Max(1dip, Graph.YInterval - Graph.Hei";
_space = (int) (__c.Max(__c.DipToCurrent((int) (1)),_graph.YInterval /*int*/ -_graph.Height /*int*/ /(double)((1+_spaceratio)*_zoom.NbVisiblePoints /*int*/ +2*_spaceratio)));
 }else {
 //BA.debugLineNum = 2167;BA.debugLine="If Zoom.NbVisiblePoints < 50 And Graph.YInter";
if (_zoom.NbVisiblePoints /*int*/ <50 && _graph.YInterval /*int*/ >=__c.DipToCurrent((int) (6))) { 
 //BA.debugLineNum = 2168;BA.debugLine="Space = 2dip";
_space = __c.DipToCurrent((int) (2));
 }else {
 //BA.debugLineNum = 2170;BA.debugLine="Space = 1dip";
_space = __c.DipToCurrent((int) (1));
 };
 };
 break; }
case 1: 
case 2: {
 //BA.debugLineNum = 2174;BA.debugLine="If Zoom.NbVisiblePoints <= 40 Then";
if (_zoom.NbVisiblePoints /*int*/ <=40) { 
 //BA.debugLineNum = 2175;BA.debugLine="Private SpaceRatio As Double";
_spaceratio = 0;
 //BA.debugLineNum = 2176;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 2177;BA.debugLine="SpaceRatio = 0.5";
_spaceratio = 0.5;
 }else if(_zoom.NbVisiblePoints /*int*/ ==2) { 
 //BA.debugLineNum = 2179;BA.debugLine="SpaceRatio = 0.42";
_spaceratio = 0.42;
 }else if(_zoom.NbVisiblePoints /*int*/ ==3) { 
 //BA.debugLineNum = 2181;BA.debugLine="SpaceRatio = 0.375";
_spaceratio = 0.375;
 }else if(_zoom.NbVisiblePoints /*int*/ ==4) { 
 //BA.debugLineNum = 2183;BA.debugLine="SpaceRatio = 0.3";
_spaceratio = 0.3;
 }else if(_zoom.NbVisiblePoints /*int*/ ==5) { 
 //BA.debugLineNum = 2185;BA.debugLine="SpaceRatio = 0.25";
_spaceratio = 0.25;
 }else if(_zoom.NbVisiblePoints /*int*/ >5 && _zoom.NbVisiblePoints /*int*/ <=20) { 
 //BA.debugLineNum = 2187;BA.debugLine="SpaceRatio = 0.2";
_spaceratio = 0.2;
 }else if(_zoom.NbVisiblePoints /*int*/ >20 && _zoom.NbVisiblePoints /*int*/ <=30) { 
 //BA.debugLineNum = 2189;BA.debugLine="SpaceRatio = 0.15";
_spaceratio = 0.15;
 }else {
 //BA.debugLineNum = 2191;BA.debugLine="SpaceRatio = 0.1";
_spaceratio = 0.1;
 };
 //BA.debugLineNum = 2193;BA.debugLine="Space = Max(1dip, Graph.YInterval - Graph.Hei";
_space = (int) (__c.Max(__c.DipToCurrent((int) (1)),_graph.YInterval /*int*/ -_graph.Height /*int*/ /(double)((1+_spaceratio)*_zoom.NbVisiblePoints /*int*/ +2*_spaceratio)));
 }else {
 //BA.debugLineNum = 2195;BA.debugLine="If Zoom.NbVisiblePoints < 50 And Graph.YInter";
if (_zoom.NbVisiblePoints /*int*/ <50 && _graph.YInterval /*int*/ >=__c.DipToCurrent((int) (6))) { 
 //BA.debugLineNum = 2196;BA.debugLine="Space = 2dip";
_space = __c.DipToCurrent((int) (2));
 }else {
 //BA.debugLineNum = 2198;BA.debugLine="Space = 1dip";
_space = __c.DipToCurrent((int) (1));
 };
 };
 break; }
default: {
 //BA.debugLineNum = 2202;BA.debugLine="If Zoom.NbVisiblePoints <= 40 Then";
if (_zoom.NbVisiblePoints /*int*/ <=40) { 
 //BA.debugLineNum = 2203;BA.debugLine="Private SpaceRatio As Double";
_spaceratio = 0;
 //BA.debugLineNum = 2204;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 2205;BA.debugLine="SpaceRatio = 0.3";
_spaceratio = 0.3;
 }else if(_zoom.NbVisiblePoints /*int*/ ==2) { 
 //BA.debugLineNum = 2207;BA.debugLine="SpaceRatio = 0.25";
_spaceratio = 0.25;
 }else if(_zoom.NbVisiblePoints /*int*/ ==3) { 
 //BA.debugLineNum = 2209;BA.debugLine="SpaceRatio = 0.22";
_spaceratio = 0.22;
 }else if(_zoom.NbVisiblePoints /*int*/ ==4) { 
 //BA.debugLineNum = 2211;BA.debugLine="SpaceRatio = 0.18";
_spaceratio = 0.18;
 }else if(_zoom.NbVisiblePoints /*int*/ ==5) { 
 //BA.debugLineNum = 2213;BA.debugLine="SpaceRatio = 0.25";
_spaceratio = 0.25;
 }else if(_zoom.NbVisiblePoints /*int*/ >5 && _zoom.NbVisiblePoints /*int*/ <=20) { 
 //BA.debugLineNum = 2215;BA.debugLine="SpaceRatio = 0.15";
_spaceratio = 0.15;
 }else if(_zoom.NbVisiblePoints /*int*/ >20 && _zoom.NbVisiblePoints /*int*/ <=30) { 
 //BA.debugLineNum = 2217;BA.debugLine="SpaceRatio = 0.1";
_spaceratio = 0.1;
 }else {
 //BA.debugLineNum = 2219;BA.debugLine="SpaceRatio = 0.1";
_spaceratio = 0.1;
 };
 //BA.debugLineNum = 2221;BA.debugLine="Space = Max(1dip, Graph.YInterval - Graph.Hei";
_space = (int) (__c.Max(__c.DipToCurrent((int) (1)),_graph.YInterval /*int*/ -_graph.Height /*int*/ /(double)((1+_spaceratio)*_zoom.NbVisiblePoints /*int*/ +2*_spaceratio)));
 }else {
 //BA.debugLineNum = 2223;BA.debugLine="If Zoom.NbVisiblePoints < 50 And Graph.YInter";
if (_zoom.NbVisiblePoints /*int*/ <50 && _graph.YInterval /*int*/ >=__c.DipToCurrent((int) (6))) { 
 //BA.debugLineNum = 2224;BA.debugLine="Space = 2dip";
_space = __c.DipToCurrent((int) (2));
 }else {
 //BA.debugLineNum = 2226;BA.debugLine="Space = 1dip";
_space = __c.DipToCurrent((int) (1));
 };
 };
 break; }
}
;
 //BA.debugLineNum = 2234;BA.debugLine="Private Limit As Int";
_limit = 0;
 //BA.debugLineNum = 2235;BA.debugLine="If Graph.ChartType = \"H_BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("H_BAR")) { 
 //BA.debugLineNum = 2236;BA.debugLine="Limit = 4dip * PD.YArray.Length";
_limit = (int) (__c.DipToCurrent((int) (4))*_pd.YArray /*double[]*/ .length);
 }else {
 //BA.debugLineNum = 2238;BA.debugLine="Limit = 4dip";
_limit = __c.DipToCurrent((int) (4));
 };
 //BA.debugLineNum = 2241;BA.debugLine="If Graph.YInterval - Space < Limit Then";
if (_graph.YInterval /*int*/ -_space<_limit) { 
 //BA.debugLineNum = 2242;BA.debugLine="Log(\"Bar width = too small !!! Drawing of Bar c";
__c.LogImpl("97405778","Bar width = too small !!! Drawing of Bar chart skipped",0);
 //BA.debugLineNum = 2243;BA.debugLine="BarWidth0 = True";
_barwidth0 = __c.True;
 };
 //BA.debugLineNum = 2246;BA.debugLine="Graph.XOffset = (Graph.Height - Graph.YInterval";
_graph.XOffset /*int*/  = (int) ((_graph.Height /*int*/ -_graph.YInterval /*int*/ *_zoom.NbVisiblePoints /*int*/ )/(double)2);
 //BA.debugLineNum = 2247;BA.debugLine="Graph.BarWidth = Graph.YInterval - Space";
_graph.BarWidth /*int*/  = (int) (_graph.YInterval /*int*/ -_space);
 //BA.debugLineNum = 2248;BA.debugLine="Graph.BarSubWidth = Graph.BarWidth / PD.YArray.L";
_graph.BarSubWidth /*int*/  = (int) (_graph.BarWidth /*int*/ /(double)_pd.YArray /*double[]*/ .length);
 //BA.debugLineNum = 2250;BA.debugLine="If Graph.ChartType = \"H_BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("H_BAR")) { 
 //BA.debugLineNum = 2252;BA.debugLine="If Graph.BarSubWidth < 4dip And BarWidth0 = Fal";
if (_graph.BarSubWidth /*int*/ <__c.DipToCurrent((int) (4)) && _barwidth0==__c.False) { 
 //BA.debugLineNum = 2253;BA.debugLine="Log(\"Bar width = too small !!! Drawing of Bar";
__c.LogImpl("97405789","Bar width = too small !!! Drawing of Bar chart skipped",0);
 //BA.debugLineNum = 2254;BA.debugLine="BarWidth0 = True";
_barwidth0 = __c.True;
 };
 };
 }else {
 //BA.debugLineNum = 2260;BA.debugLine="Graph.XOffset = 0";
_graph.XOffset /*int*/  = (int) (0);
 //BA.debugLineNum = 2261;BA.debugLine="Space = 0";
_space = (int) (0);
 //BA.debugLineNum = 2262;BA.debugLine="Margin = 0";
_margin = (int) (0);
 };
 //BA.debugLineNum = 2266;BA.debugLine="pthGrid.Initialize(Graph.Left - 1dip, Graph.Top -";
_pthgrid.Initialize((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (1))),(float) (_graph.Top /*int*/ -__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2267;BA.debugLine="pthGrid.LineTo(Graph.Right + 1dip, Graph.Top - 1d";
_pthgrid.LineTo((float) (_graph.Right /*int*/ +__c.DipToCurrent((int) (1))),(float) (_graph.Top /*int*/ -__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2268;BA.debugLine="pthGrid.LineTo(Graph.Right + 1dip, Graph.Bottom +";
_pthgrid.LineTo((float) (_graph.Right /*int*/ +__c.DipToCurrent((int) (1))),(float) (_graph.Bottom /*int*/ +__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2269;BA.debugLine="pthGrid.LineTo(Graph.Left - 1dip, Graph.Bottom +";
_pthgrid.LineTo((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (1))),(float) (_graph.Bottom /*int*/ +__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2270;BA.debugLine="pthGrid.LineTo(Graph.Left - 1dip, Graph.Top - 1di";
_pthgrid.LineTo((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (1))),(float) (_graph.Top /*int*/ -__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2272;BA.debugLine="InitValues";
_initvalues();
 //BA.debugLineNum = 2274;BA.debugLine="If Zoom.Active = True Then";
if (_zoom.Active /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2275;BA.debugLine="ZoomBarResize";
_zoombarresize();
 //BA.debugLineNum = 2276;BA.debugLine="ZoomCursorDraw";
_zoomcursordraw();
 };
 //BA.debugLineNum = 2278;BA.debugLine="End Sub";
return "";
}
public String  _initchartv() throws Exception{
b4a.example.xchart._itemdata _id = null;
int _i = 0;
int _widthxscale_2 = 0;
int _width = 0;
b4a.example.xchart._pointdata _pd = null;
int _margin = 0;
int _space = 0;
double _spaceratio = 0;
int _limit = 0;
 //BA.debugLineNum = 1639;BA.debugLine="Private Sub InitChartV";
 //BA.debugLineNum = 1640;BA.debugLine="InitTextSizes";
_inittextsizes();
 //BA.debugLineNum = 1642;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 1643;BA.debugLine="xcvsCursor.ClearRect(xcvsCursor.TargetRect)";
_xcvscursor.ClearRect(_xcvscursor.getTargetRect());
 //BA.debugLineNum = 1645;BA.debugLine="If Zoom.EndIndex = 0 Then";
if (_zoom.EndIndex /*int*/ ==0) { 
 //BA.debugLineNum = 1646;BA.debugLine="Zoom.BeginIndex = 0";
_zoom.BeginIndex /*int*/  = (int) (0);
 //BA.debugLineNum = 1647;BA.debugLine="Zoom.EndIndex = Max(Points.Size - 1, 0)";
_zoom.EndIndex /*int*/  = (int) (__c.Max(_points.getSize()-1,0));
 //BA.debugLineNum = 1648;BA.debugLine="Zoom.NbVisiblePoints = Points.Size";
_zoom.NbVisiblePoints /*int*/  = _points.getSize();
 };
 //BA.debugLineNum = 1652;BA.debugLine="If Zoom.Active = False And Graph.ChartType = \"LIN";
if (_zoom.Active /*boolean*/ ==__c.False && (_graph.ChartType /*String*/ ).equals("LINE")) { 
 //BA.debugLineNum = 1653;BA.debugLine="Zoom.EndIndex = Max(Points.Size - 1, 0)";
_zoom.EndIndex /*int*/  = (int) (__c.Max(_points.getSize()-1,0));
 //BA.debugLineNum = 1654;BA.debugLine="Zoom.NbVisiblePoints = Points.Size";
_zoom.NbVisiblePoints /*int*/  = _points.getSize();
 };
 //BA.debugLineNum = 1657;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"PIE","RADAR","YX_CHART","BUBBLE","WATERFALL")) {
case 0: {
 //BA.debugLineNum = 1659;BA.debugLine="Graph.Height = xpnlGraph.Height";
_graph.Height /*int*/  = _xpnlgraph.getHeight();
 //BA.debugLineNum = 1660;BA.debugLine="Graph.Top = Legend.TextHeight";
_graph.Top /*int*/  = _legend.TextHeight /*int*/ ;
 //BA.debugLineNum = 1661;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1662;BA.debugLine="Graph.Top = Graph.Top + Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (_graph.Top /*int*/ +_texts.TitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 1664;BA.debugLine="Graph.Right = xpnlGraph.Width - Legend.TextHeig";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 1665;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Items.Si";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _items.getSize()>0) { 
 //BA.debugLineNum = 1666;BA.debugLine="GetLegendLineNumbers(xpnlGraph.Width - 1.2 * L";
_getlegendlinenumbers((int) (_xpnlgraph.getWidth()-1.2*_legend.TextHeight /*int*/ ));
 //BA.debugLineNum = 1667;BA.debugLine="Legend.Height = (Legend.LineNumber + 0.8) * 1";
_legend.Height /*int*/  = (int) ((_legend.LineNumber /*int*/ +0.8)*1*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 1668;BA.debugLine="Graph.Height = Graph.Height - Legend.Height -";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -_legend.Height /*int*/ -0.75*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 1670;BA.debugLine="Return";
if (true) return "";
 break; }
case 1: {
 //BA.debugLineNum = 1672;BA.debugLine="If Zoom.NbVisiblePoints > 2 Then";
if (_zoom.NbVisiblePoints /*int*/ >2) { 
 //BA.debugLineNum = 1673;BA.debugLine="Graph.Height = xpnlGraph.Height";
_graph.Height /*int*/  = _xpnlgraph.getHeight();
 //BA.debugLineNum = 1675;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Items.S";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _items.getSize()>0) { 
 //BA.debugLineNum = 1676;BA.debugLine="GetLegendLineNumbers(xpnlGraph.Width - 1.2 *";
_getlegendlinenumbers((int) (_xpnlgraph.getWidth()-1.2*_legend.TextHeight /*int*/ ));
 //BA.debugLineNum = 1677;BA.debugLine="Legend.Height = (Legend.LineNumber + 0.8) * L";
_legend.Height /*int*/  = (int) ((_legend.LineNumber /*int*/ +0.8)*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 1678;BA.debugLine="Graph.Bottom = xpnlGraph.Height - Legend.Heig";
_graph.Bottom /*int*/  = (int) (_xpnlgraph.getHeight()-_legend.Height /*int*/ -0.75*_legend.TextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 1680;BA.debugLine="Graph.Bottom = xpnlGraph.Height - 1.2 * Texts";
_graph.Bottom /*int*/  = (int) (_xpnlgraph.getHeight()-1.2*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 1683;BA.debugLine="If Graph.Title <> \"\" And Graph.Subtitle <> \"\"";
if ((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1684;BA.debugLine="Graph.Top = 2 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (2*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 1685;BA.debugLine="If (Texts.TitleTextWidth + Texts.SubtitleText";
if ((_texts.TitleTextWidth /*int*/ +_texts.SubtitleTextWidth /*int*/ +__c.DipToCurrent((int) (40)))<_xpnlgraph.getWidth()) { 
 }else {
 //BA.debugLineNum = 1687;BA.debugLine="Graph.Top = Graph.Top + 1 * Texts.SubtitleTe";
_graph.Top /*int*/  = (int) (_graph.Top /*int*/ +1*_texts.SubtitleTextHeight /*int*/ );
 };
 }else if((_graph.Title /*String*/ ).equals("") == false && (_graph.Subtitle /*String*/ ).equals("")) { 
 //BA.debugLineNum = 1690;BA.debugLine="Graph.Top = 2 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (2*_texts.TitleTextHeight /*int*/ );
 }else if((_graph.Title /*String*/ ).equals("") && (_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1692;BA.debugLine="Graph.Top = 2 * Texts.SubTitleTextHeight";
_graph.Top /*int*/  = (int) (2*_texts.SubtitleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 1694;BA.debugLine="Graph.Top = Texts.ScaleTextHeight";
_graph.Top /*int*/  = _texts.ScaleTextHeight /*int*/ ;
 };
 //BA.debugLineNum = 1697;BA.debugLine="Graph.Height = Graph.Bottom - Graph.Top";
_graph.Height /*int*/  = (int) (_graph.Bottom /*int*/ -_graph.Top /*int*/ );
 //BA.debugLineNum = 1698;BA.debugLine="Graph.Left = 0.02 * xpnlGraph.Width";
_graph.Left /*int*/  = (int) (0.02*_xpnlgraph.getWidth());
 //BA.debugLineNum = 1699;BA.debugLine="Graph.Right = xpnlGraph.Width - Graph.Left";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-_graph.Left /*int*/ );
 //BA.debugLineNum = 1700;BA.debugLine="Graph.Width = Graph.Right - Graph.Left";
_graph.Width /*int*/  = (int) (_graph.Right /*int*/ -_graph.Left /*int*/ );
 //BA.debugLineNum = 1702;BA.debugLine="If Scale(sY(0)).Automatic = True Then";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1703;BA.debugLine="CalcScaleAuto(sY(0))";
_calcscaleauto(_sy[(int) (0)]);
 }else {
 //BA.debugLineNum = 1705;BA.debugLine="CalcScaleManu(sY(0))";
_calcscalemanu(_sy[(int) (0)]);
 };
 //BA.debugLineNum = 1708;BA.debugLine="InitValues";
_initvalues();
 //BA.debugLineNum = 1710;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 1712;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 1713;BA.debugLine="Graph.ErrorText = \"Only \" & Zoom.NbVisiblePoin";
_graph.ErrorText /*String*/  = "Only "+BA.NumberToString(_zoom.NbVisiblePoints /*int*/ )+" points. Minmum points for a RADAR chart is 3 !";
 //BA.debugLineNum = 1714;BA.debugLine="Return";
if (true) return "";
 };
 break; }
case 2: 
case 3: {
 //BA.debugLineNum = 1717;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.xchart._itemdata();
 //BA.debugLineNum = 1718;BA.debugLine="ID = Items.Get(0)";
_id = (b4a.example.xchart._itemdata)(_items.Get((int) (0)));
 //BA.debugLineNum = 1719;BA.debugLine="If ID.YXArray.Size = 0 Then";
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 1720;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 1721;BA.debugLine="Graph.ErrorText = \"No data\"";
_graph.ErrorText /*String*/  = "No data";
 //BA.debugLineNum = 1722;BA.debugLine="Return";
if (true) return "";
 };
 break; }
case 4: {
 //BA.debugLineNum = 1725;BA.debugLine="Scale(sY(0)).YZeroAxis = True";
_scale[_sy[(int) (0)]].YZeroAxis /*boolean*/  = __c.True;
 break; }
default: {
 //BA.debugLineNum = 1727;BA.debugLine="If Zoom.NbVisiblePoints = 0 Then";
if (_zoom.NbVisiblePoints /*int*/ ==0) { 
 //BA.debugLineNum = 1728;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 1729;BA.debugLine="Graph.ErrorText = \"No data\"";
_graph.ErrorText /*String*/  = "No data";
 //BA.debugLineNum = 1730;BA.debugLine="Return";
if (true) return "";
 };
 break; }
}
;
 //BA.debugLineNum = 1734;BA.debugLine="If (Graph.ChartType = \"LINE\" Or Graph.ChartType =";
if (((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART")) && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1735;BA.debugLine="If Scale(sY(0)).Automatic = True Then";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1736;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step85 = 1;
final int limit85 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit85 ;_i = _i + step85 ) {
 //BA.debugLineNum = 1737;BA.debugLine="CalcScaleAuto(sY(i))";
_calcscaleauto(_sy[_i]);
 }
};
 }else {
 //BA.debugLineNum = 1740;BA.debugLine="For i = 0 To Items.Size -1";
{
final int step89 = 1;
final int limit89 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit89 ;_i = _i + step89 ) {
 //BA.debugLineNum = 1741;BA.debugLine="CalcScaleManu(sY(i))";
_calcscalemanu(_sy[_i]);
 }
};
 };
 }else {
 //BA.debugLineNum = 1745;BA.debugLine="If Scale(sY(0)).Logarithmic = True And (Graph.Ch";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.True && ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 1746;BA.debugLine="If Scale(sY(0)).Automatic = True Then";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1747;BA.debugLine="CalcScaleLogAuto(sY(0))";
_calcscalelogauto(_sy[(int) (0)]);
 }else {
 //BA.debugLineNum = 1749;BA.debugLine="CalcScaleLogManu(sY(0))";
_calcscalelogmanu(_sy[(int) (0)]);
 };
 }else {
 //BA.debugLineNum = 1752;BA.debugLine="If Scale(sY(0)).Automatic = True Then";
if (_scale[_sy[(int) (0)]].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1753;BA.debugLine="CalcScaleAuto(sY(0))";
_calcscaleauto(_sy[(int) (0)]);
 }else {
 //BA.debugLineNum = 1755;BA.debugLine="CalcScaleManu(sY(0))";
_calcscalemanu(_sy[(int) (0)]);
 };
 };
 };
 //BA.debugLineNum = 1760;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Then";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 1761;BA.debugLine="If Scale(sX).Logarithmic = True Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1762;BA.debugLine="If Scale(sX).Automatic = True Then";
if (_scale[_sx].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1763;BA.debugLine="CalcScaleLogAuto(sX)";
_calcscalelogauto(_sx);
 }else {
 //BA.debugLineNum = 1765;BA.debugLine="CalcScaleLogManu(sX)";
_calcscalelogmanu(_sx);
 };
 }else {
 //BA.debugLineNum = 1768;BA.debugLine="If Scale(sX).Automatic = True Then";
if (_scale[_sx].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1769;BA.debugLine="CalcScaleAuto(sX)";
_calcscaleauto(_sx);
 }else {
 //BA.debugLineNum = 1771;BA.debugLine="CalcScaleManu(sX)";
_calcscalemanu(_sx);
 };
 };
 };
 //BA.debugLineNum = 1776;BA.debugLine="If Graph.ChartType = \"BUBBLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 1777;BA.debugLine="If Scale(sX).Automatic = True Then";
if (_scale[_sx].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1778;BA.debugLine="CalcScaleAuto(sX)";
_calcscaleauto(_sx);
 }else {
 //BA.debugLineNum = 1780;BA.debugLine="CalcScaleManu(sX)";
_calcscalemanu(_sx);
 };
 };
 //BA.debugLineNum = 1784;BA.debugLine="Private WidthXScale_2 As Int";
_widthxscale_2 = 0;
 //BA.debugLineNum = 1785;BA.debugLine="If Scale(sX).DrawXScale = True Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1786;BA.debugLine="WidthXScale_2 = GetXScaleWidth / 2";
_widthxscale_2 = (int) (_getxscalewidth()/(double)2);
 };
 //BA.debugLineNum = 1789;BA.debugLine="If Scale(sY(0)).DrawYScale = False Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1790;BA.debugLine="Graph.Left = 0.75 * Texts.AxisTextHeight '+ Widt";
_graph.Left /*int*/  = (int) (0.75*_texts.AxisTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 1792;BA.debugLine="If (Graph.ChartType = \"LINE\" Or Graph.ChartType";
if (((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE") || (_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1793;BA.debugLine="Private Width As Int";
_width = 0;
 //BA.debugLineNum = 1794;BA.debugLine="For i = 0 To NbMaxDifferentScales - 1 Step 2";
{
final int step139 = 2;
final int limit139 = (int) (_nbmaxdifferentscales-1);
_i = (int) (0) ;
for (;_i <= limit139 ;_i = _i + step139 ) {
 //BA.debugLineNum = 1795;BA.debugLine="Width = Max(Width, GetYScaleWidth(i))";
_width = (int) (__c.Max(_width,_getyscalewidth(_i)));
 }
};
 //BA.debugLineNum = 1797;BA.debugLine="Graph.Left = Width + 1.05 * Texts.ScaleTextHeig";
_graph.Left /*int*/  = (int) (_width+1.05*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 1799;BA.debugLine="Graph.Left = GetYScaleWidth(0) + 1.05 * Texts.S";
_graph.Left /*int*/  = (int) (_getyscalewidth((int) (0))+1.05*_texts.ScaleTextHeight /*int*/ );
 };
 };
 //BA.debugLineNum = 1803;BA.debugLine="If Graph.YAxisName <> \"\" Then";
if ((_graph.YAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1804;BA.debugLine="Graph.Left = Graph.Left + Texts.AxisTextHeight *";
_graph.Left /*int*/  = (int) (_graph.Left /*int*/ +_texts.AxisTextHeight /*int*/ *1.8);
 };
 //BA.debugLineNum = 1807;BA.debugLine="If Scale(sY(0)).DrawYScale = False Then";
if (_scale[_sy[(int) (0)]].DrawYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1808;BA.debugLine="Graph.Right = xpnlGraph.Width - 0.75 * Texts.Sca";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-0.75*_texts.ScaleTextHeight /*int*/ -_widthxscale_2);
 }else {
 //BA.debugLineNum = 1810;BA.debugLine="If (Graph.ChartType = \"LINE\" Or Graph.ChartType";
if (((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE") || (_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1811;BA.debugLine="Graph.Right = xpnlGraph.Width - 1.5 * Texts.Sca";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-1.5*_texts.ScaleTextHeight /*int*/ -_getyscalewidth((int) (1)));
 //BA.debugLineNum = 1812;BA.debugLine="For i = 1 To NbMaxDifferentScales - 1 Step 2";
{
final int step155 = 2;
final int limit155 = (int) (_nbmaxdifferentscales-1);
_i = (int) (1) ;
for (;_i <= limit155 ;_i = _i + step155 ) {
 //BA.debugLineNum = 1813;BA.debugLine="RightScaleWidth = Max(Width, GetYScaleWidth(i)";
_rightscalewidth = (int) (__c.Max(_width,_getyscalewidth(_i)));
 }
};
 //BA.debugLineNum = 1815;BA.debugLine="Graph.Right = xpnlGraph.Width - RightScaleWidth";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-_rightscalewidth-1.5*_texts.ScaleTextHeight /*int*/ -_widthxscale_2);
 }else {
 //BA.debugLineNum = 1817;BA.debugLine="Graph.Right = xpnlGraph.Width - 1.5 * Texts.Sca";
_graph.Right /*int*/  = (int) (_xpnlgraph.getWidth()-1.5*_texts.ScaleTextHeight /*int*/ -_widthxscale_2);
 };
 };
 //BA.debugLineNum = 1820;BA.debugLine="If Graph.YAxisName2 <> \"\" And Items.Size <= NbMax";
if ((_graph.YAxisName2 /*String*/ ).equals("") == false && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1821;BA.debugLine="Graph.Right = Graph.Right - Texts.AxisTextHeight";
_graph.Right /*int*/  = (int) (_graph.Right /*int*/ -_texts.AxisTextHeight /*int*/ *1.8);
 };
 //BA.debugLineNum = 1824;BA.debugLine="Graph.Width = Graph.Right - Graph.Left";
_graph.Width /*int*/  = (int) (_graph.Right /*int*/ -_graph.Left /*int*/ );
 //BA.debugLineNum = 1826;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Or Graph.ChartTyp";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 1827;BA.debugLine="Graph.Width = Floor(Graph.Width / Scale(sX).NbIn";
_graph.Width /*int*/  = (int) (__c.Floor(_graph.Width /*int*/ /(double)_scale[_sx].NbIntervals /*int*/ )*_scale[_sx].NbIntervals /*int*/ );
 //BA.debugLineNum = 1828;BA.debugLine="Graph.Right = Graph.Left + Graph.Width";
_graph.Right /*int*/  = (int) (_graph.Left /*int*/ +_graph.Width /*int*/ );
 //BA.debugLineNum = 1829;BA.debugLine="Scale(sY(0)).Scale = Graph.Height / (Scale(sY(0)";
_scale[_sy[(int) (0)]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy[(int) (0)]].MaxVal /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ );
 //BA.debugLineNum = 1830;BA.debugLine="Scale(sX).Scale = Graph.Width / (Scale(sX).MaxVa";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_sx].MaxVal /*double*/ -_scale[_sx].MinVal /*double*/ );
 }else {
 //BA.debugLineNum = 1832;BA.debugLine="If (Graph.ChartType = \"LINE\" Or Graph.ChartType";
if (((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART")) && _items.getSize()<=_nbmaxdifferentscales && _scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1833;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step174 = 1;
final int limit174 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit174 ;_i = _i + step174 ) {
 //BA.debugLineNum = 1834;BA.debugLine="Scale(sY(i)).Scale = Graph.Height / (Scale(sY(";
_scale[_sy[_i]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy[_i]].MaxVal /*double*/ -_scale[_sy[_i]].MinVal /*double*/ );
 }
};
 }else {
 //BA.debugLineNum = 1837;BA.debugLine="Scale(sY(0)).Scale = Graph.Height / (Scale(sY(0";
_scale[_sy[(int) (0)]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy[(int) (0)]].MaxVal /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ );
 };
 //BA.debugLineNum = 1839;BA.debugLine="Scale(sX).Scale = Graph.Width / (Scale(sX).MaxVa";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_sx].MaxVal /*double*/ -_scale[_sx].MinVal /*double*/ );
 };
 //BA.debugLineNum = 1842;BA.debugLine="If Graph.ChartType = \"BAR\" Or Graph.ChartType = \"";
if ((_graph.ChartType /*String*/ ).equals("BAR") || (_graph.ChartType /*String*/ ).equals("STACKED_BAR") || (_graph.ChartType /*String*/ ).equals("CANDLE") || (_graph.ChartType /*String*/ ).equals("WATERFALL")) { 
 //BA.debugLineNum = 1843;BA.debugLine="BarWidth0 = False";
_barwidth0 = __c.False;
 //BA.debugLineNum = 1844;BA.debugLine="Private PD As PointData = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 1845;BA.debugLine="Private Margin = 0.02 * Graph.Width As Int";
_margin = (int) (0.02*_graph.Width /*int*/ );
 //BA.debugLineNum = 1846;BA.debugLine="If Graph.BarMarginMode = 1 Then";
if (_graph.BarMarginMode /*int*/ ==1) { 
 //BA.debugLineNum = 1847;BA.debugLine="Graph.XInterval = (Graph.Width - Margin) / Zoom";
_graph.XInterval /*double*/  = (_graph.Width /*int*/ -_margin)/(double)_zoom.NbVisiblePoints /*int*/ ;
 }else {
 //BA.debugLineNum = 1849;BA.debugLine="Graph.XInterval = Floor((Graph.Width - Margin)";
_graph.XInterval /*double*/  = __c.Floor((_graph.Width /*int*/ -_margin)/(double)_zoom.NbVisiblePoints /*int*/ );
 };
 //BA.debugLineNum = 1852;BA.debugLine="Private Space As Int";
_space = 0;
 //BA.debugLineNum = 1853;BA.debugLine="If Graph.ChartType = \"BAR\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("BAR") || (_graph.ChartType /*String*/ ).equals("STACKED_BAR") || (_graph.ChartType /*String*/ ).equals("CANDLE") || (_graph.ChartType /*String*/ ).equals("WATERFALL")) { 
 //BA.debugLineNum = 1854;BA.debugLine="Select Items.Size";
switch (BA.switchObjectToInt(_items.getSize(),(int) (0),(int) (1),(int) (2),(int) (3))) {
case 0: 
case 1: {
 //BA.debugLineNum = 1856;BA.debugLine="If Zoom.NbVisiblePoints <= 40 Then";
if (_zoom.NbVisiblePoints /*int*/ <=40) { 
 //BA.debugLineNum = 1857;BA.debugLine="Private SpaceRatio As Double";
_spaceratio = 0;
 //BA.debugLineNum = 1858;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 1859;BA.debugLine="SpaceRatio = 1";
_spaceratio = 1;
 }else if(_zoom.NbVisiblePoints /*int*/ ==2) { 
 //BA.debugLineNum = 1861;BA.debugLine="SpaceRatio = 0.85";
_spaceratio = 0.85;
 }else if(_zoom.NbVisiblePoints /*int*/ ==3) { 
 //BA.debugLineNum = 1863;BA.debugLine="SpaceRatio = 0.75";
_spaceratio = 0.75;
 }else if(_zoom.NbVisiblePoints /*int*/ ==4) { 
 //BA.debugLineNum = 1865;BA.debugLine="SpaceRatio = 0.6";
_spaceratio = 0.6;
 }else if(_zoom.NbVisiblePoints /*int*/ ==5) { 
 //BA.debugLineNum = 1867;BA.debugLine="SpaceRatio = 0.5";
_spaceratio = 0.5;
 }else if(_zoom.NbVisiblePoints /*int*/ >5 && _zoom.NbVisiblePoints /*int*/ <=20) { 
 //BA.debugLineNum = 1869;BA.debugLine="SpaceRatio = 0.4";
_spaceratio = 0.4;
 }else if(_zoom.NbVisiblePoints /*int*/ >20 && _zoom.NbVisiblePoints /*int*/ <=30) { 
 //BA.debugLineNum = 1871;BA.debugLine="SpaceRatio = 0.3";
_spaceratio = 0.3;
 }else {
 //BA.debugLineNum = 1873;BA.debugLine="SpaceRatio = 0.2";
_spaceratio = 0.2;
 };
 //BA.debugLineNum = 1875;BA.debugLine="Space = Max(1dip, Graph.XInterval - Graph.Wi";
_space = (int) (__c.Max(__c.DipToCurrent((int) (1)),_graph.XInterval /*double*/ -_graph.Width /*int*/ /(double)((1+_spaceratio)*_zoom.NbVisiblePoints /*int*/ +2*_spaceratio)));
 }else {
 //BA.debugLineNum = 1877;BA.debugLine="If Zoom.NbVisiblePoints < 50 And Graph.XInte";
if (_zoom.NbVisiblePoints /*int*/ <50 && _graph.XInterval /*double*/ >=__c.DipToCurrent((int) (6))) { 
 //BA.debugLineNum = 1878;BA.debugLine="Space = 2dip";
_space = __c.DipToCurrent((int) (2));
 }else {
 //BA.debugLineNum = 1880;BA.debugLine="Space = 1dip";
_space = __c.DipToCurrent((int) (1));
 };
 };
 break; }
case 2: 
case 3: {
 //BA.debugLineNum = 1884;BA.debugLine="If Zoom.NbVisiblePoints <= 40 Then";
if (_zoom.NbVisiblePoints /*int*/ <=40) { 
 //BA.debugLineNum = 1885;BA.debugLine="Private SpaceRatio As Double";
_spaceratio = 0;
 //BA.debugLineNum = 1886;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 1887;BA.debugLine="SpaceRatio = 0.5";
_spaceratio = 0.5;
 }else if(_zoom.NbVisiblePoints /*int*/ ==2) { 
 //BA.debugLineNum = 1889;BA.debugLine="SpaceRatio = 0.42";
_spaceratio = 0.42;
 }else if(_zoom.NbVisiblePoints /*int*/ ==3) { 
 //BA.debugLineNum = 1891;BA.debugLine="SpaceRatio = 0.375";
_spaceratio = 0.375;
 }else if(_zoom.NbVisiblePoints /*int*/ ==4) { 
 //BA.debugLineNum = 1893;BA.debugLine="SpaceRatio = 0.3";
_spaceratio = 0.3;
 }else if(_zoom.NbVisiblePoints /*int*/ ==5) { 
 //BA.debugLineNum = 1895;BA.debugLine="SpaceRatio = 0.25";
_spaceratio = 0.25;
 }else if(_zoom.NbVisiblePoints /*int*/ >5 && _zoom.NbVisiblePoints /*int*/ <=20) { 
 //BA.debugLineNum = 1897;BA.debugLine="SpaceRatio = 0.2";
_spaceratio = 0.2;
 }else if(_zoom.NbVisiblePoints /*int*/ >20 && _zoom.NbVisiblePoints /*int*/ <=30) { 
 //BA.debugLineNum = 1899;BA.debugLine="SpaceRatio = 0.15";
_spaceratio = 0.15;
 }else {
 //BA.debugLineNum = 1901;BA.debugLine="SpaceRatio = 0.1";
_spaceratio = 0.1;
 };
 //BA.debugLineNum = 1903;BA.debugLine="Space = Max(1dip, Graph.XInterval - Graph.Wi";
_space = (int) (__c.Max(__c.DipToCurrent((int) (1)),_graph.XInterval /*double*/ -_graph.Width /*int*/ /(double)((1+_spaceratio)*_zoom.NbVisiblePoints /*int*/ +2*_spaceratio)));
 }else {
 //BA.debugLineNum = 1905;BA.debugLine="If Zoom.NbVisiblePoints < 50 And Graph.XInte";
if (_zoom.NbVisiblePoints /*int*/ <50 && _graph.XInterval /*double*/ >=__c.DipToCurrent((int) (6))) { 
 //BA.debugLineNum = 1906;BA.debugLine="Space = 2dip";
_space = __c.DipToCurrent((int) (2));
 }else {
 //BA.debugLineNum = 1908;BA.debugLine="Space = 1dip";
_space = __c.DipToCurrent((int) (1));
 };
 };
 break; }
default: {
 //BA.debugLineNum = 1912;BA.debugLine="If Zoom.NbVisiblePoints <= 40 Then";
if (_zoom.NbVisiblePoints /*int*/ <=40) { 
 //BA.debugLineNum = 1913;BA.debugLine="Private SpaceRatio As Double";
_spaceratio = 0;
 //BA.debugLineNum = 1914;BA.debugLine="If Zoom.NbVisiblePoints = 1 Then";
if (_zoom.NbVisiblePoints /*int*/ ==1) { 
 //BA.debugLineNum = 1915;BA.debugLine="SpaceRatio = 0.3";
_spaceratio = 0.3;
 }else if(_zoom.NbVisiblePoints /*int*/ ==2) { 
 //BA.debugLineNum = 1917;BA.debugLine="SpaceRatio = 0.25";
_spaceratio = 0.25;
 }else if(_zoom.NbVisiblePoints /*int*/ ==3) { 
 //BA.debugLineNum = 1919;BA.debugLine="SpaceRatio = 0.22";
_spaceratio = 0.22;
 }else if(_zoom.NbVisiblePoints /*int*/ ==4) { 
 //BA.debugLineNum = 1921;BA.debugLine="SpaceRatio = 0.18";
_spaceratio = 0.18;
 }else if(_zoom.NbVisiblePoints /*int*/ ==5) { 
 //BA.debugLineNum = 1923;BA.debugLine="SpaceRatio = 0.25";
_spaceratio = 0.25;
 }else if(_zoom.NbVisiblePoints /*int*/ >5 && _zoom.NbVisiblePoints /*int*/ <=20) { 
 //BA.debugLineNum = 1925;BA.debugLine="SpaceRatio = 0.15";
_spaceratio = 0.15;
 }else if(_zoom.NbVisiblePoints /*int*/ >20 && _zoom.NbVisiblePoints /*int*/ <=30) { 
 //BA.debugLineNum = 1927;BA.debugLine="SpaceRatio = 0.1";
_spaceratio = 0.1;
 }else {
 //BA.debugLineNum = 1929;BA.debugLine="SpaceRatio = 0.1";
_spaceratio = 0.1;
 };
 //BA.debugLineNum = 1931;BA.debugLine="Space = Max(1dip, Graph.XInterval - Graph.Wi";
_space = (int) (__c.Max(__c.DipToCurrent((int) (1)),_graph.XInterval /*double*/ -_graph.Width /*int*/ /(double)((1+_spaceratio)*_zoom.NbVisiblePoints /*int*/ +2*_spaceratio)));
 }else {
 //BA.debugLineNum = 1933;BA.debugLine="If Zoom.NbVisiblePoints < 50 And Graph.XInte";
if (_zoom.NbVisiblePoints /*int*/ <50 && _graph.XInterval /*double*/ >=__c.DipToCurrent((int) (6))) { 
 //BA.debugLineNum = 1934;BA.debugLine="Space = 2dip";
_space = __c.DipToCurrent((int) (2));
 }else {
 //BA.debugLineNum = 1936;BA.debugLine="Space = 1dip";
_space = __c.DipToCurrent((int) (1));
 };
 };
 break; }
}
;
 }else {
 //BA.debugLineNum = 1941;BA.debugLine="Space = Margin";
_space = _margin;
 };
 //BA.debugLineNum = 1944;BA.debugLine="Private Limit As Int";
_limit = 0;
 //BA.debugLineNum = 1945;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 1946;BA.debugLine="Limit = 4dip * PD.YArray.Length";
_limit = (int) (__c.DipToCurrent((int) (4))*_pd.YArray /*double[]*/ .length);
 }else {
 //BA.debugLineNum = 1948;BA.debugLine="Limit = 4dip";
_limit = __c.DipToCurrent((int) (4));
 };
 //BA.debugLineNum = 1951;BA.debugLine="If Graph.XInterval - Space < Limit Then";
if (_graph.XInterval /*double*/ -_space<_limit) { 
 //BA.debugLineNum = 1952;BA.debugLine="Log(\"Bar width = too small !!! Drawing of Bar c";
__c.LogImpl("97340345","Bar width = too small !!! Drawing of Bar chart skipped",0);
 //BA.debugLineNum = 1953;BA.debugLine="BarWidth0 = True";
_barwidth0 = __c.True;
 };
 //BA.debugLineNum = 1956;BA.debugLine="If Graph.BarMarginMode = 1 Then";
if (_graph.BarMarginMode /*int*/ ==1) { 
 //BA.debugLineNum = 1957;BA.debugLine="Graph.XOffset = Margin / 2";
_graph.XOffset /*int*/  = (int) (_margin/(double)2);
 //BA.debugLineNum = 1958;BA.debugLine="Graph.Width = Graph.XInterval * Zoom.NbVisibleP";
_graph.Width /*int*/  = (int) (_graph.XInterval /*double*/ *_zoom.NbVisiblePoints /*int*/ +_margin);
 //BA.debugLineNum = 1959;BA.debugLine="Graph.Right = Graph.Left + Graph.Width";
_graph.Right /*int*/  = (int) (_graph.Left /*int*/ +_graph.Width /*int*/ );
 }else {
 //BA.debugLineNum = 1961;BA.debugLine="Graph.XOffset = (Graph.Width - Graph.XInterval";
_graph.XOffset /*int*/  = (int) ((_graph.Width /*int*/ -_graph.XInterval /*double*/ *_zoom.NbVisiblePoints /*int*/ )/(double)2);
 };
 //BA.debugLineNum = 1963;BA.debugLine="Graph.BarWidth = Graph.XInterval - Space";
_graph.BarWidth /*int*/  = (int) (_graph.XInterval /*double*/ -_space);
 //BA.debugLineNum = 1964;BA.debugLine="Graph.BarSubWidth = Graph.BarWidth / PD.YArray.L";
_graph.BarSubWidth /*int*/  = (int) (_graph.BarWidth /*int*/ /(double)_pd.YArray /*double[]*/ .length);
 //BA.debugLineNum = 1966;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 1968;BA.debugLine="If Graph.BarSubWidth < 4dip And BarWidth0 = Fal";
if (_graph.BarSubWidth /*int*/ <__c.DipToCurrent((int) (4)) && _barwidth0==__c.False) { 
 //BA.debugLineNum = 1969;BA.debugLine="Log(\"Bar width = too small !!! Drawing of Bar";
__c.LogImpl("97340362","Bar width = too small !!! Drawing of Bar chart skipped",0);
 //BA.debugLineNum = 1970;BA.debugLine="BarWidth0 = True";
_barwidth0 = __c.True;
 };
 };
 };
 //BA.debugLineNum = 1975;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1976;BA.debugLine="Graph.Top = 1.8 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (1.8*_texts.TitleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 1978;BA.debugLine="Graph.Top = 0.9 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (0.9*_texts.TitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 1981;BA.debugLine="If Graph.Subtitle <> \"\" Then";
if ((_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1982;BA.debugLine="Graph.Top = Graph.Top + 1.5 * Texts.SubtitleText";
_graph.Top /*int*/  = (int) (_graph.Top /*int*/ +1.5*_texts.SubtitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 1985;BA.debugLine="If Scale(sX).DrawXScale = False Then";
if (_scale[_sx].DrawXScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1986;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top - 0.";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -0.5*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 1988;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 1990;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top -";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -2.1*_texts.ScaleTextHeight /*int*/ );
 break; }
case 1: {
 //BA.debugLineNum = 1992;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top -";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -0.9*_texts.ScaleTextHeight /*int*/ -_getxscalewidth());
 break; }
case 2: {
 //BA.debugLineNum = 1994;BA.debugLine="Graph.Height = xpnlGraph.Height - Graph.Top -";
_graph.Height /*int*/  = (int) (_xpnlgraph.getHeight()-_graph.Top /*int*/ -0.9*_texts.ScaleTextHeight /*int*/ -_getxscalewidth()*0.8);
 break; }
}
;
 };
 //BA.debugLineNum = 1997;BA.debugLine="If Graph.XAxisName <> \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1998;BA.debugLine="Graph.Height = Graph.Height - 1.3 * Texts.AxisTe";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -1.3*_texts.AxisTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2001;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _items.getSize()>0 && (_graph.ChartType /*String*/ ).equals("CANDLE") == false) { 
 //BA.debugLineNum = 2002;BA.debugLine="GetLegendLineNumbers(xpnlGraph.Width - 1.2 * Leg";
_getlegendlinenumbers((int) (_xpnlgraph.getWidth()-1.2*_legend.TextHeight /*int*/ ));
 //BA.debugLineNum = 2003;BA.debugLine="Legend.Height = (Legend.LineNumber + 0.8) * Lege";
_legend.Height /*int*/  = (int) ((_legend.LineNumber /*int*/ +0.8)*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2004;BA.debugLine="Graph.Height = Graph.Height - Legend.Height - 0.";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -_legend.Height /*int*/ -0.75*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 2007;BA.debugLine="Graph.YInterval = Graph.Height / Scale(sY(0)).NbI";
_graph.YInterval /*int*/  = (int) (_graph.Height /*int*/ /(double)_scale[_sy[(int) (0)]].NbIntervals /*int*/ );
 //BA.debugLineNum = 2008;BA.debugLine="Graph.Height =  Graph.YInterval * Scale(sY(0)).Nb";
_graph.Height /*int*/  = (int) (_graph.YInterval /*int*/ *_scale[_sy[(int) (0)]].NbIntervals /*int*/ );
 //BA.debugLineNum = 2009;BA.debugLine="Graph.Bottom = Graph.Top + Graph.Height";
_graph.Bottom /*int*/  = (int) (_graph.Top /*int*/ +_graph.Height /*int*/ );
 //BA.debugLineNum = 2010;BA.debugLine="Graph.Rect.Initialize(Graph.Left, Graph.Top, Grap";
_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ),(float) (_graph.Right /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 2012;BA.debugLine="If Graph.ChartType = \"AREA\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) { 
 //BA.debugLineNum = 2013;BA.debugLine="Scale(sY(0)).Scale = Graph.Height / (Scale(sY(0)";
_scale[_sy[(int) (0)]].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy[(int) (0)]].MaxVal /*double*/ -_scale[_sy[(int) (0)]].MinVal /*double*/ );
 };
 //BA.debugLineNum = 2017;BA.debugLine="pthGrid.Initialize(Graph.Left - 1dip, Graph.Top -";
_pthgrid.Initialize((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (1))),(float) (_graph.Top /*int*/ -__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2018;BA.debugLine="pthGrid.LineTo(Graph.Right + 1dip, Graph.Top - 1d";
_pthgrid.LineTo((float) (_graph.Right /*int*/ +__c.DipToCurrent((int) (1))),(float) (_graph.Top /*int*/ -__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2019;BA.debugLine="pthGrid.LineTo(Graph.Right + 1dip, Graph.Bottom +";
_pthgrid.LineTo((float) (_graph.Right /*int*/ +__c.DipToCurrent((int) (1))),(float) (_graph.Bottom /*int*/ +__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2020;BA.debugLine="pthGrid.LineTo(Graph.Left - 1dip, Graph.Bottom +";
_pthgrid.LineTo((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (1))),(float) (_graph.Bottom /*int*/ +__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2021;BA.debugLine="pthGrid.LineTo(Graph.Left - 1dip, Graph.Top - 1di";
_pthgrid.LineTo((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (1))),(float) (_graph.Top /*int*/ -__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2023;BA.debugLine="InitValues";
_initvalues();
 //BA.debugLineNum = 2025;BA.debugLine="If Zoom.Active = True Then";
if (_zoom.Active /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2026;BA.debugLine="ZoomBarResize";
_zoombarresize();
 //BA.debugLineNum = 2027;BA.debugLine="ZoomCursorDraw";
_zoomcursordraw();
 };
 //BA.debugLineNum = 2029;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 222;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 223;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 224;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 226;BA.debugLine="sX = 0";
_sx = (int) (0);
 //BA.debugLineNum = 227;BA.debugLine="sY(0) = 1";
_sy[(int) (0)] = (int) (1);
 //BA.debugLineNum = 228;BA.debugLine="sY(1) = 2";
_sy[(int) (1)] = (int) (2);
 //BA.debugLineNum = 229;BA.debugLine="sY(2) = 3";
_sy[(int) (2)] = (int) (3);
 //BA.debugLineNum = 230;BA.debugLine="sY(3) = 4";
_sy[(int) (3)] = (int) (4);
 //BA.debugLineNum = 232;BA.debugLine="LongClickTimer.Initialize(\"LongClickTimer\", 300)";
_longclicktimer.Initialize(ba,"LongClickTimer",(long) (300));
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public String  _inittextsizes() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fntx = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fnt = null;
int _graphsize = 0;
 //BA.debugLineNum = 2281;BA.debugLine="Private Sub InitTextSizes";
 //BA.debugLineNum = 2282;BA.debugLine="Private fntx As B4XFont";
_fntx = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 2284;BA.debugLine="If Texts.CustomFontName <> \"\" Then";
if ((_texts.CustomFontName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2285;BA.debugLine="If Texts.CustomFontName.EndsWith(\"ttf\") Then";
if (_texts.CustomFontName /*String*/ .endsWith("ttf")) { 
 //BA.debugLineNum = 2291;BA.debugLine="Private fnt As Typeface";
_fnt = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 2292;BA.debugLine="fnt = Typeface.LoadFromAssets(Texts.CustomFontN";
_fnt = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets(_texts.CustomFontName /*String*/ )));
 //BA.debugLineNum = 2293;BA.debugLine="fntx = xui.CreateFont(fnt, 10)";
_fntx = _xui.CreateFont((android.graphics.Typeface)(_fnt.getObject()),(float) (10));
 }else {
 //BA.debugLineNum = 2315;BA.debugLine="Texts.CustomFontName = \"\"";
_texts.CustomFontName /*String*/  = "";
 //BA.debugLineNum = 2316;BA.debugLine="Texts.CustomFontScale = 1";
_texts.CustomFontScale /*double*/  = 1;
 };
 };
 //BA.debugLineNum = 2336;BA.debugLine="If Texts.AutomaticTextSizes = True Then";
if (_texts.AutomaticTextSizes /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2337;BA.debugLine="Private GraphSize As Int";
_graphsize = 0;
 //BA.debugLineNum = 2338;BA.debugLine="GraphSize = Min(xpnlGraph.Width, xpnlGraph.Heigh";
_graphsize = (int) (__c.Min(_xpnlgraph.getWidth(),_xpnlgraph.getHeight())/(double)_xui.getScale());
 //BA.debugLineNum = 2339;BA.debugLine="Texts.TitleTextSize = (1 + (GraphSize - 250)/100";
_texts.TitleTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*18*_texts.CustomFontScale /*double*/ );
 //BA.debugLineNum = 2340;BA.debugLine="Texts.SubtitleTextSize = (1 + (GraphSize - 250)/";
_texts.SubtitleTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*16*_texts.CustomFontScale /*double*/ );
 //BA.debugLineNum = 2341;BA.debugLine="Texts.AxisTextSize = (1 + (GraphSize - 250)/1000";
_texts.AxisTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*14*_texts.CustomFontScale /*double*/ );
 //BA.debugLineNum = 2342;BA.debugLine="Legend.TextSize = (1 + (GraphSize - 250)/1000) *";
_legend.TextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*14*_texts.CustomFontScale /*double*/ );
 //BA.debugLineNum = 2343;BA.debugLine="Texts.ScaleTextSize = (1 + (GraphSize - 250)/100";
_texts.ScaleTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*12*_texts.CustomFontScale /*double*/ );
 //BA.debugLineNum = 2344;BA.debugLine="Values.TextSize = (1 + (GraphSize - 250)/1000) *";
_values.TextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*14*_texts.CustomFontScale /*double*/ );
 };
 //BA.debugLineNum = 2347;BA.debugLine="If Texts.CustomFontName = \"\" Then";
if ((_texts.CustomFontName /*String*/ ).equals("")) { 
 //BA.debugLineNum = 2348;BA.debugLine="Texts.TitleFont = xui.CreateDefaultFont(Texts.Ti";
_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.TitleTextSize /*float*/ );
 //BA.debugLineNum = 2349;BA.debugLine="Texts.SubtitleFont = xui.CreateDefaultFont(Texts";
_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.SubtitleTextSize /*float*/ );
 //BA.debugLineNum = 2350;BA.debugLine="Texts.AxisFont = xui.CreateDefaultFont(Texts.Axi";
_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.AxisTextSize /*float*/ );
 //BA.debugLineNum = 2351;BA.debugLine="Texts.ScaleFont = xui.CreateDefaultFont(Texts.Sc";
_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 2352;BA.debugLine="Legend.TextFont = xui.CreateDefaultFont(Legend.T";
_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_legend.TextSize /*float*/ );
 //BA.debugLineNum = 2353;BA.debugLine="Values.TextFont = xui.CreateDefaultFont(Values.T";
_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_values.TextSize /*float*/ );
 }else {
 //BA.debugLineNum = 2355;BA.debugLine="Texts.TitleFont = xui.CreateFont2(fntx, Texts.Ti";
_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont2(_fntx,_texts.TitleTextSize /*float*/ );
 //BA.debugLineNum = 2356;BA.debugLine="Texts.SubtitleFont = xui.CreateFont2(fntx, Texts";
_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont2(_fntx,_texts.SubtitleTextSize /*float*/ );
 //BA.debugLineNum = 2357;BA.debugLine="Texts.AxisFont = xui.CreateFont2(fntx, Texts.Axi";
_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont2(_fntx,_texts.AxisTextSize /*float*/ );
 //BA.debugLineNum = 2358;BA.debugLine="Texts.ScaleFont = xui.CreateFont2(fntx, Texts.Sc";
_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont2(_fntx,_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 2359;BA.debugLine="Legend.TextFont = xui.CreateFont2(fntx, Legend.T";
_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont2(_fntx,_legend.TextSize /*float*/ );
 //BA.debugLineNum = 2360;BA.debugLine="Values.TextFont = xui.CreateFont2(fntx, Values.T";
_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont2(_fntx,_values.TextSize /*float*/ );
 };
 //BA.debugLineNum = 2363;BA.debugLine="Texts.TitleTextHeight = MeasureTextHeight(\"Mg\", T";
_texts.TitleTextHeight /*int*/  = _measuretextheight("Mg",_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2364;BA.debugLine="Texts.TitleTextWidth = MeasureTextWidth(Graph.Tit";
_texts.TitleTextWidth /*int*/  = _measuretextwidth(_graph.Title /*String*/ ,_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2365;BA.debugLine="Texts.SubtitleTextHeight = MeasureTextHeight(\"Mg\"";
_texts.SubtitleTextHeight /*int*/  = _measuretextheight("Mg",_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2366;BA.debugLine="Texts.SubtitleTextWidth = MeasureTextWidth(Graph.";
_texts.SubtitleTextWidth /*int*/  = _measuretextwidth(_graph.Subtitle /*String*/ ,_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2367;BA.debugLine="Texts.AxisTextHeight =  MeasureTextHeight(\"Mg\", T";
_texts.AxisTextHeight /*int*/  = _measuretextheight("Mg",_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2368;BA.debugLine="Texts.ScaleTextHeight =  MeasureTextHeight(\"Mg\",";
_texts.ScaleTextHeight /*int*/  = _measuretextheight("Mg",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2369;BA.debugLine="Legend.TextHeight =  MeasureTextHeight(\"Mg\", Lege";
_legend.TextHeight /*int*/  = _measuretextheight("Mg",_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2370;BA.debugLine="Values.TextHeight = MeasureTextHeight(\"Mg\", Value";
_values.TextHeight /*int*/  = _measuretextheight("Mg",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2372;BA.debugLine="Graph.Error = False";
_graph.Error /*boolean*/  = __c.False;
 //BA.debugLineNum = 2373;BA.debugLine="Graph.ErrorText = \"\"";
_graph.ErrorText /*String*/  = "";
 //BA.debugLineNum = 2374;BA.debugLine="End Sub";
return "";
}
public String  _initvalues() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _i = 0;
int _linenumber = 0;
b4a.example.xchart._pointdata _pd = null;
int _itemwidth = 0;
String _txtx = "";
b4a.example.xchart._itemdata _item = null;
String _txt = "";
int _valuewidth = 0;
b4a.example.xchart._pointdata _pnt = null;
int _h = 0;
int _x = 0;
int _y = 0;
int _top = 0;
 //BA.debugLineNum = 727;BA.debugLine="Private Sub InitValues";
 //BA.debugLineNum = 728;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 729;BA.debugLine="Private i, LineNumber As Int";
_i = 0;
_linenumber = 0;
 //BA.debugLineNum = 731;BA.debugLine="If Graph.ChartType = \"RADAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("RADAR")) { 
 //BA.debugLineNum = 732;BA.debugLine="Values.Left = 5dip";
_values.Left /*int*/  = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 733;BA.debugLine="Values.Top = 5dip";
_values.Top /*int*/  = __c.DipToCurrent((int) (5));
 }else {
 //BA.debugLineNum = 735;BA.debugLine="Values.Left = Graph.Left + 2dip";
_values.Left /*int*/  = (int) (_graph.Left /*int*/ +__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 736;BA.debugLine="Values.Top = Graph.Top + 2dip";
_values.Top /*int*/  = (int) (_graph.Top /*int*/ +__c.DipToCurrent((int) (2)));
 };
 //BA.debugLineNum = 738;BA.debugLine="Values.MaxDigits = 6";
_values.MaxDigits /*int*/  = (int) (6);
 //BA.debugLineNum = 740;BA.debugLine="LineNumber = Items.Size + 1";
_linenumber = (int) (_items.getSize()+1);
 //BA.debugLineNum = 741;BA.debugLine="If Graph.ChartType = \"LINE\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("H_LINE") || (_graph.ChartType /*String*/ ).equals("AREA")) { 
 //BA.debugLineNum = 742;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.xchart._pointdata();
 //BA.debugLineNum = 743;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 744;BA.debugLine="If PD.YArray.Length = 1 Then";
if (_pd.YArray /*double[]*/ .length==1) { 
 //BA.debugLineNum = 745;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 746;BA.debugLine="LineNumber = LineNumber + 1";
_linenumber = (int) (_linenumber+1);
 };
 //BA.debugLineNum = 748;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 749;BA.debugLine="LineNumber = LineNumber + 1";
_linenumber = (int) (_linenumber+1);
 };
 //BA.debugLineNum = 751;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 752;BA.debugLine="LineNumber = LineNumber + 1";
_linenumber = (int) (_linenumber+1);
 };
 };
 }else if((_graph.ChartType /*String*/ ).equals("CANDLE")) { 
 //BA.debugLineNum = 756;BA.debugLine="LineNumber = 5";
_linenumber = (int) (5);
 //BA.debugLineNum = 757;BA.debugLine="If Bar.CandleDisplayVolume = True Then";
if (_bar.CandleDisplayVolume /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 758;BA.debugLine="LineNumber = LineNumber + 1";
_linenumber = (int) (_linenumber+1);
 };
 }else if((_graph.ChartType /*String*/ ).equals("WATERFALL")) { 
 //BA.debugLineNum = 761;BA.debugLine="LineNumber = 3";
_linenumber = (int) (3);
 };
 //BA.debugLineNum = 764;BA.debugLine="Values.Height = Values.TextHeight * 1.3 * (LineNu";
_values.Height /*int*/  = (int) (_values.TextHeight /*int*/ *1.3*(_linenumber+0.3));
 //BA.debugLineNum = 766;BA.debugLine="Private ItemWidth As Int";
_itemwidth = 0;
 //BA.debugLineNum = 767;BA.debugLine="Private txtX As String";
_txtx = "";
 //BA.debugLineNum = 768;BA.debugLine="If Graph.XAxisName = \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("")) { 
 //BA.debugLineNum = 769;BA.debugLine="txtX = \"x = \"";
_txtx = "x = ";
 }else {
 //BA.debugLineNum = 771;BA.debugLine="txtX = Graph.XAxisName & \" = \"";
_txtx = _graph.XAxisName /*String*/ +" = ";
 };
 //BA.debugLineNum = 773;BA.debugLine="ItemWidth = MeasureTextWidth(txtX, Values.TextFon";
_itemwidth = _measuretextwidth(_txtx,_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 774;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group43 = _items;
final int groupLen43 = group43.getSize()
;int index43 = 0;
;
for (; index43 < groupLen43;index43++){
_item = (b4a.example.xchart._itemdata)(group43.Get(index43));
 //BA.debugLineNum = 775;BA.debugLine="Private txt As String = Item.Name & \" = \"";
_txt = _item.Name /*String*/ +" = ";
 //BA.debugLineNum = 776;BA.debugLine="ItemWidth = Max(ItemWidth, MeasureTextWidth(txt,";
_itemwidth = (int) (__c.Max(_itemwidth,_measuretextwidth(_txt,_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 //BA.debugLineNum = 778;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"CANDLE","WATERFALL")) {
case 0: {
 //BA.debugLineNum = 780;BA.debugLine="ItemWidth = Max(ItemWidth, MeasureTextWidth(\"Op";
_itemwidth = (int) (__c.Max(_itemwidth,_measuretextwidth("Open = ",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 781;BA.debugLine="If Bar.CandleDisplayVolume = True Then";
if (_bar.CandleDisplayVolume /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 782;BA.debugLine="ItemWidth = Max(ItemWidth, MeasureTextWidth(\"V";
_itemwidth = (int) (__c.Max(_itemwidth,_measuretextwidth("Volume = ",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 };
 break; }
case 1: {
 //BA.debugLineNum = 785;BA.debugLine="ItemWidth = Max(ItemWidth, MeasureTextWidth(\"Va";
_itemwidth = (int) (__c.Max(_itemwidth,_measuretextwidth("Value = ",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 break; }
}
;
 //BA.debugLineNum = 787;BA.debugLine="If Graph.ChartType.Contains(\"STACKED\") Then";
if (_graph.ChartType /*String*/ .contains("STACKED")) { 
 //BA.debugLineNum = 788;BA.debugLine="ItemWidth = Max(ItemWidth, MeasureTextWidth(\"Tot";
_itemwidth = (int) (__c.Max(_itemwidth,_measuretextwidth("Total = ",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 789;BA.debugLine="Values.Height = Values.TextHeight * 1.3 * (Items";
_values.Height /*int*/  = (int) (_values.TextHeight /*int*/ *1.3*(_items.getSize()+2.3));
 };
 //BA.debugLineNum = 791;BA.debugLine="ItemWidth = ItemWidth + 1.8 * Values.TextHeight";
_itemwidth = (int) (_itemwidth+1.8*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 792;BA.debugLine="Values.MidPont = ItemWidth - 0.9 * Values.TextHei";
_values.MidPont /*int*/  = (int) (_itemwidth-0.9*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 794;BA.debugLine="Private ValueWidth As Int";
_valuewidth = 0;
 //BA.debugLineNum = 795;BA.debugLine="For Each pnt As PointData In Points";
{
final anywheresoftware.b4a.BA.IterableList group63 = _points;
final int groupLen63 = group63.getSize()
;int index63 = 0;
;
for (; index63 < groupLen63;index63++){
_pnt = (b4a.example.xchart._pointdata)(group63.Get(index63));
 //BA.debugLineNum = 796;BA.debugLine="txt = pnt.X";
_txt = _pnt.X /*String*/ ;
 //BA.debugLineNum = 797;BA.debugLine="ValueWidth = Max(ValueWidth, MeasureTextWidth(tx";
_valuewidth = (int) (__c.Max(_valuewidth,_measuretextwidth(_txt,_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 798;BA.debugLine="For i = 0 To pnt.YArray.Length - 1";
{
final int step66 = 1;
final int limit66 = (int) (_pnt.YArray /*double[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit66 ;_i = _i + step66 ) {
 //BA.debugLineNum = 799;BA.debugLine="txt = NumberFormat3(pnt.YArray(i), Values.MaxDi";
_txt = _numberformat3(_pnt.YArray /*double[]*/ [_i],_values.MaxDigits /*int*/ );
 //BA.debugLineNum = 800;BA.debugLine="ValueWidth = Max(ValueWidth, MeasureTextWidth(t";
_valuewidth = (int) (__c.Max(_valuewidth,_measuretextwidth(_txt,_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 }
};
 //BA.debugLineNum = 804;BA.debugLine="Values.Width = ItemWidth + ValueWidth + 0.05 * Va";
_values.Width /*int*/  = (int) (_itemwidth+_valuewidth+0.05*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 805;BA.debugLine="If Graph.ChartType = \"RADAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("RADAR")) { 
 //BA.debugLineNum = 806;BA.debugLine="Values.rectCursor.Initialize(0, 0, xpnlCursor.Wi";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (0),(float) (0),(float) (_xpnlcursor.getWidth()),(float) (_xpnlcursor.getHeight()));
 }else {
 //BA.debugLineNum = 808;BA.debugLine="Values.rectCursor.Initialize(0, 0, 5dip, xpnlCur";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (0),(float) (0),(float) (__c.DipToCurrent((int) (5))),(float) (_xpnlcursor.getHeight()));
 };
 //BA.debugLineNum = 810;BA.debugLine="Values.rectValues.Initialize(Values.MidPont, 0, V";
_values.rectValues /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_values.MidPont /*int*/ ),(float) (0),(float) (_values.Width /*int*/ ),(float) (_values.Height /*int*/ ));
 //BA.debugLineNum = 811;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Or Graph.ChartTyp";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 812;BA.debugLine="xpnlValues.Left = 0";
_xpnlvalues.setLeft((int) (0));
 //BA.debugLineNum = 813;BA.debugLine="xpnlValues.Top = 0";
_xpnlvalues.setTop((int) (0));
 //BA.debugLineNum = 814;BA.debugLine="xpnlValues.Width = xpnlGraph.Width";
_xpnlvalues.setWidth(_xpnlgraph.getWidth());
 //BA.debugLineNum = 815;BA.debugLine="xpnlValues.Height = xpnlGraph.Height";
_xpnlvalues.setHeight(_xpnlgraph.getHeight());
 //BA.debugLineNum = 816;BA.debugLine="xcvsValues.Resize(xpnlGraph.Width, xpnlGraph.Hei";
_xcvsvalues.Resize((float) (_xpnlgraph.getWidth()),(float) (_xpnlgraph.getHeight()));
 }else {
 //BA.debugLineNum = 818;BA.debugLine="xpnlValues.Left = Values.Left";
_xpnlvalues.setLeft(_values.Left /*int*/ );
 //BA.debugLineNum = 819;BA.debugLine="xpnlValues.Top = Values.Top";
_xpnlvalues.setTop(_values.Top /*int*/ );
 //BA.debugLineNum = 820;BA.debugLine="xpnlValues.Width = Values.Width";
_xpnlvalues.setWidth(_values.Width /*int*/ );
 //BA.debugLineNum = 821;BA.debugLine="If Values.Position = \"TOP_RIGHT\" Then";
if ((_values.Position /*String*/ ).equals("TOP_RIGHT")) { 
 //BA.debugLineNum = 822;BA.debugLine="xpnlValues.Left = xpnlGraph.Width - Values.Left";
_xpnlvalues.setLeft((int) (_xpnlgraph.getWidth()-_values.Left /*int*/ -_values.Width /*int*/ -__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 824;BA.debugLine="xpnlValues.Height = Values.Height";
_xpnlvalues.setHeight(_values.Height /*int*/ );
 //BA.debugLineNum = 825;BA.debugLine="xcvsValues.Resize(Values.Width, Values.Height)";
_xcvsvalues.Resize((float) (_values.Width /*int*/ ),(float) (_values.Height /*int*/ ));
 //BA.debugLineNum = 827;BA.debugLine="r.Initialize(0, 0, Values.Width, Values.Height)";
_r.Initialize((float) (0),(float) (0),(float) (_values.Width /*int*/ ),(float) (_values.Height /*int*/ ));
 //BA.debugLineNum = 828;BA.debugLine="xcvsValues.ClearRect(r)";
_xcvsvalues.ClearRect(_r);
 //BA.debugLineNum = 829;BA.debugLine="xcvsValues.DrawRect(r, Values.BackgroundColor, T";
_xcvsvalues.DrawRect(_r,_values.BackgroundColor /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 831;BA.debugLine="Private h, i, x, y As Int";
_h = 0;
_i = 0;
_x = 0;
_y = 0;
 //BA.debugLineNum = 832;BA.debugLine="h = Values.TextHeight * 1.3";
_h = (int) (_values.TextHeight /*int*/ *1.3);
 //BA.debugLineNum = 833;BA.debugLine="x = Values.MidPont";
_x = _values.MidPont /*int*/ ;
 //BA.debugLineNum = 834;BA.debugLine="y = 1.2 * Values.TextHeight";
_y = (int) (1.2*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 835;BA.debugLine="If Graph.XAxisName = \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("")) { 
 //BA.debugLineNum = 836;BA.debugLine="xcvsValues.DrawText(txtX, x, y + 0.2 * h, Value";
_xcvsvalues.DrawText(ba,_txtx,(float) (_x),(float) (_y+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 }else {
 //BA.debugLineNum = 838;BA.debugLine="xcvsValues.DrawText(txtX, x, y + 0.2 * h, Value";
_xcvsvalues.DrawText(ba,_txtx,(float) (_x),(float) (_y+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 //BA.debugLineNum = 840;BA.debugLine="i = 1";
_i = (int) (1);
 //BA.debugLineNum = 841;BA.debugLine="Private top As Int";
_top = 0;
 //BA.debugLineNum = 842;BA.debugLine="If Graph.ChartType = \"CANDLE\" Then";
if ((_graph.ChartType /*String*/ ).equals("CANDLE")) { 
 //BA.debugLineNum = 844;BA.debugLine="top = y + 1.2 * h";
_top = (int) (_y+1.2*_h);
 //BA.debugLineNum = 845;BA.debugLine="xcvsValues.DrawText(\"Open = \", x, top, Values.T";
_xcvsvalues.DrawText(ba,"Open = ",(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 846;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 847;BA.debugLine="xcvsValues.DrawText(\"High = \", x, top, Values.T";
_xcvsvalues.DrawText(ba,"High = ",(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 848;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 849;BA.debugLine="xcvsValues.DrawText(\"Low = \", x, top, Values.Te";
_xcvsvalues.DrawText(ba,"Low = ",(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 850;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 851;BA.debugLine="xcvsValues.DrawText(\"Close = \", x, top, Values.";
_xcvsvalues.DrawText(ba,"Close = ",(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 852;BA.debugLine="If Bar.CandleDisplayVolume = True Then";
if (_bar.CandleDisplayVolume /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 853;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 854;BA.debugLine="xcvsValues.DrawText(\"Volume = \", x, top, Value";
_xcvsvalues.DrawText(ba,"Volume = ",(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 }else if((_graph.ChartType /*String*/ ).equals("WATERFALL")) { 
 //BA.debugLineNum = 857;BA.debugLine="top = y + 1.2 * h";
_top = (int) (_y+1.2*_h);
 //BA.debugLineNum = 858;BA.debugLine="xcvsValues.DrawText(\"Value = \", x, top, Values.";
_xcvsvalues.DrawText(ba,"Value = ",(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 859;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 860;BA.debugLine="xcvsValues.DrawText(\"Total = \", x, top, Values.";
_xcvsvalues.DrawText(ba,"Total = ",(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 }else {
 //BA.debugLineNum = 862;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group126 = _items;
final int groupLen126 = group126.getSize()
;int index126 = 0;
;
for (; index126 < groupLen126;index126++){
_item = (b4a.example.xchart._itemdata)(group126.Get(index126));
 //BA.debugLineNum = 863;BA.debugLine="top = y + h * i";
_top = (int) (_y+_h*_i);
 //BA.debugLineNum = 864;BA.debugLine="Private txt As String = Item.Name & \" = \"";
_txt = _item.Name /*String*/ +" = ";
 //BA.debugLineNum = 865;BA.debugLine="xcvsValues.DrawText(txt, x, top + 0.2 * h, Val";
_xcvsvalues.DrawText(ba,_txt,(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_item.Color /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 866;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
 };
 };
 //BA.debugLineNum = 871;BA.debugLine="If Graph.ChartType = \"LINE\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("H_LINE") || (_graph.ChartType /*String*/ ).equals("AREA") || (_graph.ChartType /*String*/ ).equals("STACKED_AREA")) { 
 //BA.debugLineNum = 872;BA.debugLine="If  Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 873;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 874;BA.debugLine="xcvsValues.DrawText(\"max = \", x, top + 0.2 * h,";
_xcvsvalues.DrawText(ba,"max = ",(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MaxLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 //BA.debugLineNum = 876;BA.debugLine="If  Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 877;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 878;BA.debugLine="xcvsValues.DrawText(\"mean = \", x, top + 0.2 * h";
_xcvsvalues.DrawText(ba,"mean = ",(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MeanLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 //BA.debugLineNum = 880;BA.debugLine="If  Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 881;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 882;BA.debugLine="xcvsValues.DrawText(\"min = \", x, top + 0.2 * h,";
_xcvsvalues.DrawText(ba,"min = ",(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MinLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 };
 //BA.debugLineNum = 886;BA.debugLine="If Graph.ChartType.Contains(\"STACKED\") Then";
if (_graph.ChartType /*String*/ .contains("STACKED")) { 
 //BA.debugLineNum = 887;BA.debugLine="Private top As Int = y + h * i";
_top = (int) (_y+_h*_i);
 //BA.debugLineNum = 888;BA.debugLine="Private txt As String = \"Total = \"";
_txt = "Total = ";
 //BA.debugLineNum = 889;BA.debugLine="xcvsValues.DrawText(txt, x, top + 0.2 * h, Value";
_xcvsvalues.DrawText(ba,_txt,(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 //BA.debugLineNum = 892;BA.debugLine="xpnlValues.BringToFront";
_xpnlvalues.BringToFront();
 //BA.debugLineNum = 893;BA.debugLine="xcvsValues.Invalidate";
_xcvsvalues.Invalidate();
 //BA.debugLineNum = 894;BA.debugLine="End Sub";
return "";
}
public String  _jumpto(int _index) throws Exception{
 //BA.debugLineNum = 9002;BA.debugLine="Public Sub JumpTo(Index As Int)";
 //BA.debugLineNum = 9003;BA.debugLine="If Zoom.Active = True And Index <> Zoom.BeginInde";
if (_zoom.Active /*boolean*/ ==__c.True && _index!=_zoom.BeginIndex /*int*/ ) { 
 //BA.debugLineNum = 9004;BA.debugLine="If Index <= 0 Then";
if (_index<=0) { 
 //BA.debugLineNum = 9005;BA.debugLine="Zoom.BeginIndex = 0";
_zoom.BeginIndex /*int*/  = (int) (0);
 //BA.debugLineNum = 9006;BA.debugLine="Zoom.BeginIndex = Index";
_zoom.BeginIndex /*int*/  = _index;
 }else if(_index+_zoom.NbVisiblePoints /*int*/ >_points.getSize()) { 
 //BA.debugLineNum = 9008;BA.debugLine="Zoom.BeginIndex = Points.Size - Zoom.NbVisibleP";
_zoom.BeginIndex /*int*/  = (int) (_points.getSize()-_zoom.NbVisiblePoints /*int*/ );
 }else {
 //BA.debugLineNum = 9010;BA.debugLine="Zoom.BeginIndex = Index";
_zoom.BeginIndex /*int*/  = _index;
 };
 //BA.debugLineNum = 9012;BA.debugLine="Zoom.EndIndex = Zoom.BeginIndex + Zoom.NbVisible";
_zoom.EndIndex /*int*/  = (int) (_zoom.BeginIndex /*int*/ +_zoom.NbVisiblePoints /*int*/ -1);
 //BA.debugLineNum = 9013;BA.debugLine="If Items.Size > 0 Or Graph.ChartType = \"CANDLE\"";
if (_items.getSize()>0 || (_graph.ChartType /*String*/ ).equals("CANDLE") && _points.getSize()>0) { 
 //BA.debugLineNum = 9014;BA.debugLine="DrawChart";
_drawchart();
 };
 };
 //BA.debugLineNum = 9017;BA.debugLine="End Sub";
return "";
}
public int  _measuretextheight(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct = null;
 //BA.debugLineNum = 6954;BA.debugLine="Private Sub MeasureTextHeight(Text As String, Font";
 //BA.debugLineNum = 6955;BA.debugLine="Private rct As B4XRect";
_rct = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6956;BA.debugLine="rct = xcvsCursor.MeasureText(Text, Font1)";
_rct = _xcvscursor.MeasureText(_text,_font1);
 //BA.debugLineNum = 6958;BA.debugLine="Return rct.Height";
if (true) return (int) (_rct.getHeight());
 //BA.debugLineNum = 6959;BA.debugLine="End Sub";
return 0;
}
public int  _measuretextwidth(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct = null;
 //BA.debugLineNum = 6948;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
 //BA.debugLineNum = 6949;BA.debugLine="Private rct As B4XRect";
_rct = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6950;BA.debugLine="rct = xcvsCursor.MeasureText(Text, Font1)";
_rct = _xcvscursor.MeasureText(_text,_font1);
 //BA.debugLineNum = 6951;BA.debugLine="Return rct.Width";
if (true) return (int) (_rct.getWidth());
 //BA.debugLineNum = 6952;BA.debugLine="End Sub";
return 0;
}
public String  _numberformat3(double _number,int _maxdigits) throws Exception{
double _mant = 0;
double _exp = 0;
double _lng = 0;
double _lng2 = 0;
String _str = "";
String _strminus = "";
 //BA.debugLineNum = 7134;BA.debugLine="Public Sub NumberFormat3(Number As Double, MaxDigi";
 //BA.debugLineNum = 7135;BA.debugLine="Private mant, exp, lng, lng2 As Double";
_mant = 0;
_exp = 0;
_lng = 0;
_lng2 = 0;
 //BA.debugLineNum = 7136;BA.debugLine="Private str, strMinus As String";
_str = "";
_strminus = "";
 //BA.debugLineNum = 7138;BA.debugLine="If Abs(Number) < 1e-11 Then Return \"0\"";
if (__c.Abs(_number)<1e-11) { 
if (true) return "0";};
 //BA.debugLineNum = 7140;BA.debugLine="If Number < 0 Then";
if (_number<0) { 
 //BA.debugLineNum = 7141;BA.debugLine="strMinus = \"-\"";
_strminus = "-";
 }else {
 //BA.debugLineNum = 7143;BA.debugLine="strMinus = \"\"";
_strminus = "";
 };
 //BA.debugLineNum = 7145;BA.debugLine="lng = Logarithm(Abs(Number), 10)";
_lng = __c.Logarithm(__c.Abs(_number),10);
 //BA.debugLineNum = 7146;BA.debugLine="exp = Floor(lng)";
_exp = __c.Floor(_lng);
 //BA.debugLineNum = 7147;BA.debugLine="If exp < 0 Then";
if (_exp<0) { 
 //BA.debugLineNum = 7148;BA.debugLine="lng2 = Floor(lng)";
_lng2 = __c.Floor(_lng);
 //BA.debugLineNum = 7149;BA.debugLine="lng = -lng2 + lng";
_lng = -_lng2+_lng;
 }else {
 //BA.debugLineNum = 7151;BA.debugLine="lng = lng - exp";
_lng = _lng-_exp;
 };
 //BA.debugLineNum = 7154;BA.debugLine="If exp < MaxDigits And exp > -5 Then";
if (_exp<_maxdigits && _exp>-5) { 
 //BA.debugLineNum = 7155;BA.debugLine="str = NumberFormat2(Number, 1, MaxDigits - 1 - e";
_str = __c.NumberFormat2(_number,(int) (1),(int) (_maxdigits-1-_exp),(int) (0),__c.False);
 }else if(_exp<=-5 && _exp>-7) { 
 //BA.debugLineNum = 7157;BA.debugLine="str = NumberFormat2(Number, 1, 9, 0, False)";
_str = __c.NumberFormat2(_number,(int) (1),(int) (9),(int) (0),__c.False);
 }else {
 //BA.debugLineNum = 7159;BA.debugLine="mant = Power(10, lng)";
_mant = __c.Power(10,_lng);
 //BA.debugLineNum = 7160;BA.debugLine="str = strMinus & NumberFormat2(mant, 1, MaxDigit";
_str = _strminus+__c.NumberFormat2(_mant,(int) (1),(int) (_maxdigits-1),(int) (0),__c.False);
 //BA.debugLineNum = 7161;BA.debugLine="str = str & \"E\" & exp";
_str = _str+"E"+BA.NumberToString(_exp);
 };
 //BA.debugLineNum = 7164;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 7165;BA.debugLine="End Sub";
return "";
}
public String  _numberformat4(double _number,int _maxdigits,boolean _scientific) throws Exception{
double _mant = 0;
double _exp = 0;
double _lng = 0;
double _lng2 = 0;
String _str = "";
String _strminus = "";
String _ext = "";
 //BA.debugLineNum = 7171;BA.debugLine="Public Sub NumberFormat4(Number As Double, MaxDigi";
 //BA.debugLineNum = 7172;BA.debugLine="Private mant, exp, lng, lng2 As Double";
_mant = 0;
_exp = 0;
_lng = 0;
_lng2 = 0;
 //BA.debugLineNum = 7173;BA.debugLine="Private str, strMinus As String";
_str = "";
_strminus = "";
 //BA.debugLineNum = 7175;BA.debugLine="If Abs(Number) < 1e-11 Then Return \"0\"";
if (__c.Abs(_number)<1e-11) { 
if (true) return "0";};
 //BA.debugLineNum = 7177;BA.debugLine="If Number < 0 Then";
if (_number<0) { 
 //BA.debugLineNum = 7178;BA.debugLine="strMinus = \"-\"";
_strminus = "-";
 }else {
 //BA.debugLineNum = 7180;BA.debugLine="strMinus = \"\"";
_strminus = "";
 };
 //BA.debugLineNum = 7184;BA.debugLine="If Scientific = True Then";
if (_scientific==__c.True) { 
 //BA.debugLineNum = 7185;BA.debugLine="lng = Logarithm(Abs(Number), 10)";
_lng = __c.Logarithm(__c.Abs(_number),10);
 //BA.debugLineNum = 7186;BA.debugLine="exp = Floor(lng)";
_exp = __c.Floor(_lng);
 //BA.debugLineNum = 7187;BA.debugLine="If exp < 0 Then";
if (_exp<0) { 
 //BA.debugLineNum = 7188;BA.debugLine="lng2 = Floor(lng)";
_lng2 = __c.Floor(_lng);
 //BA.debugLineNum = 7189;BA.debugLine="lng = -lng2 + lng";
_lng = -_lng2+_lng;
 }else {
 //BA.debugLineNum = 7191;BA.debugLine="lng = lng - exp";
_lng = _lng-_exp;
 };
 //BA.debugLineNum = 7194;BA.debugLine="If exp < MaxDigits And exp > -5 Then";
if (_exp<_maxdigits && _exp>-5) { 
 //BA.debugLineNum = 7195;BA.debugLine="str = NumberFormat2(Number, 1, MaxDigits - 1 -";
_str = __c.NumberFormat2(_number,(int) (1),(int) (_maxdigits-1-_exp),(int) (0),__c.False);
 }else if(_exp<=-5 && _exp>-7) { 
 //BA.debugLineNum = 7197;BA.debugLine="str = NumberFormat2(Number, 1, 9, 0, False)";
_str = __c.NumberFormat2(_number,(int) (1),(int) (9),(int) (0),__c.False);
 }else {
 //BA.debugLineNum = 7199;BA.debugLine="mant = Power(10, lng)";
_mant = __c.Power(10,_lng);
 //BA.debugLineNum = 7200;BA.debugLine="str = strMinus & NumberFormat2(mant, 1, MaxDigi";
_str = _strminus+__c.NumberFormat2(_mant,(int) (1),(int) (_maxdigits-1),(int) (0),__c.False);
 //BA.debugLineNum = 7201;BA.debugLine="str = str & \"E\" & exp";
_str = _str+"E"+BA.NumberToString(_exp);
 };
 }else {
 //BA.debugLineNum = 7204;BA.debugLine="Private ext As String";
_ext = "";
 //BA.debugLineNum = 7205;BA.debugLine="If Abs(Number) >= 1000000000 Then";
if (__c.Abs(_number)>=1000000000) { 
 //BA.debugLineNum = 7206;BA.debugLine="Number = Number / 1000000000";
_number = _number/(double)1000000000;
 //BA.debugLineNum = 7207;BA.debugLine="ext = \"G\"";
_ext = "G";
 }else if(__c.Abs(_number)>=1000000) { 
 //BA.debugLineNum = 7209;BA.debugLine="Number = Number / 1000000";
_number = _number/(double)1000000;
 //BA.debugLineNum = 7210;BA.debugLine="ext = \"M\"";
_ext = "M";
 }else if(__c.Abs(_number)>=1000) { 
 //BA.debugLineNum = 7212;BA.debugLine="Number = Number / 1000";
_number = _number/(double)1000;
 //BA.debugLineNum = 7213;BA.debugLine="ext = \"K\"";
_ext = "K";
 }else if(__c.Abs(_number)<=0.000000001) { 
 //BA.debugLineNum = 7215;BA.debugLine="ext = \"n\"";
_ext = "n";
 //BA.debugLineNum = 7216;BA.debugLine="Number = Number * 1000000000000";
_number = _number*1000000000000L;
 }else if(__c.Abs(_number)<=0.000001) { 
 //BA.debugLineNum = 7218;BA.debugLine="ext = \"μ\"";
_ext = "μ";
 //BA.debugLineNum = 7219;BA.debugLine="Number = Number * 1000000000";
_number = _number*1000000000;
 }else if(__c.Abs(_number)<=0.001) { 
 //BA.debugLineNum = 7221;BA.debugLine="ext = \"m\"";
_ext = "m";
 //BA.debugLineNum = 7222;BA.debugLine="Number = Number * 1000000";
_number = _number*1000000;
 };
 //BA.debugLineNum = 7224;BA.debugLine="str = NumberFormat2(Number, 1, MaxDigits, 0, Fal";
_str = __c.NumberFormat2(_number,(int) (1),_maxdigits,(int) (0),__c.False)+_ext;
 };
 //BA.debugLineNum = 7226;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 7227;BA.debugLine="End Sub";
return "";
}
public String  _removehorizontalline(double _value) throws Exception{
int _i = 0;
b4a.example.xchart._hline _hl = null;
 //BA.debugLineNum = 1616;BA.debugLine="Public Sub RemoveHorizontalLine(Value As Double)";
 //BA.debugLineNum = 1617;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1619;BA.debugLine="For i = HLines.Size - 1 To 0 Step -1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_hlines.getSize()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1620;BA.debugLine="Private HL As HLine";
_hl = new b4a.example.xchart._hline();
 //BA.debugLineNum = 1621;BA.debugLine="HL = HLines.Get(i)";
_hl = (b4a.example.xchart._hline)(_hlines.Get(_i));
 //BA.debugLineNum = 1622;BA.debugLine="If HL.Value = Value Then";
if (_hl.Value /*double*/ ==_value) { 
 //BA.debugLineNum = 1623;BA.debugLine="HLines.RemoveAt(i)";
_hlines.RemoveAt(_i);
 //BA.debugLineNum = 1624;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 1627;BA.debugLine="End Sub";
return "";
}
public String  _removepointdata(int _index) throws Exception{
 //BA.debugLineNum = 7966;BA.debugLine="Public Sub RemovePointData(Index As Int)";
 //BA.debugLineNum = 7967;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Or Graph.ChartTyp";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 7968;BA.debugLine="Log(\"This method is not valid for YXChat or Bubb";
__c.LogImpl("919595266","This method is not valid for YXChat or Bubble charts",0);
 }else {
 //BA.debugLineNum = 7970;BA.debugLine="Points.RemoveAt(Index)";
_points.RemoveAt(_index);
 };
 //BA.debugLineNum = 7972;BA.debugLine="End Sub";
return "";
}
public String  _scaleloglogvals(int _axis) throws Exception{
String[] _scales = null;
double[] _vals = null;
double[] _logs = null;
int _i = 0;
 //BA.debugLineNum = 2595;BA.debugLine="Private Sub ScaleLogLogVals(Axis As Int)";
 //BA.debugLineNum = 2596;BA.debugLine="Private Scales() As String";
_scales = new String[(int) (0)];
java.util.Arrays.fill(_scales,"");
 //BA.debugLineNum = 2597;BA.debugLine="Scales = Regex.Split(\"!\", ScaleLog(Axis).ScaleVal";
_scales = __c.Regex.Split("!",_scalelog[_axis].ScaleValues /*String*/ );
 //BA.debugLineNum = 2598;BA.debugLine="Private Vals(Scales.Length), Logs(Scales.Length)";
_vals = new double[_scales.length];
;
_logs = new double[_scales.length];
;
 //BA.debugLineNum = 2599;BA.debugLine="For i = 0 To Scales.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_scales.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 2600;BA.debugLine="Vals(i) = Scales(i)";
_vals[_i] = (double)(Double.parseDouble(_scales[_i]));
 //BA.debugLineNum = 2601;BA.debugLine="Logs(i) = Logarithm(Vals(i), 10)";
_logs[_i] = __c.Logarithm(_vals[_i],10);
 }
};
 //BA.debugLineNum = 2603;BA.debugLine="ScaleLog(Axis).Logs = Logs";
_scalelog[_axis].Logs /*double[]*/  = _logs;
 //BA.debugLineNum = 2604;BA.debugLine="ScaleLog(Axis).Vals = Vals";
_scalelog[_axis].Vals /*double[]*/  = _vals;
 //BA.debugLineNum = 2605;BA.debugLine="End Sub";
return "";
}
public String  _scalelogvals(int _axis) throws Exception{
String[] _scales = null;
double[] _vals = null;
double[] _logs = null;
int _i = 0;
 //BA.debugLineNum = 2582;BA.debugLine="Private Sub ScaleLogVals(Axis As Int)";
 //BA.debugLineNum = 2583;BA.debugLine="Private Scales() As String";
_scales = new String[(int) (0)];
java.util.Arrays.fill(_scales,"");
 //BA.debugLineNum = 2584;BA.debugLine="Scales = Regex.Split(\"!\", Scale(Axis).ScaleValues";
_scales = __c.Regex.Split("!",_scale[_axis].ScaleValues /*String*/ );
 //BA.debugLineNum = 2585;BA.debugLine="Private Vals(Scales.Length), Logs(Scales.Length)";
_vals = new double[_scales.length];
;
_logs = new double[_scales.length];
;
 //BA.debugLineNum = 2586;BA.debugLine="For i = 0 To Scales.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_scales.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 2587;BA.debugLine="Vals(i) = Scales(i)";
_vals[_i] = (double)(Double.parseDouble(_scales[_i]));
 //BA.debugLineNum = 2588;BA.debugLine="Logs(i) = Logarithm(Vals(i), 10)";
_logs[_i] = __c.Logarithm(_vals[_i],10);
 }
};
 //BA.debugLineNum = 2590;BA.debugLine="ScaleLog(Axis).Logs = Logs";
_scalelog[_axis].Logs /*double[]*/  = _logs;
 //BA.debugLineNum = 2591;BA.debugLine="ScaleLog(Axis).Vals = Vals";
_scalelog[_axis].Vals /*double[]*/  = _vals;
 //BA.debugLineNum = 2592;BA.debugLine="End Sub";
return "";
}
public String  _setareafillalphavalue(int _areafillalphavalue) throws Exception{
 //BA.debugLineNum = 8126;BA.debugLine="Public Sub setAreaFillAlphaValue(AreaFillAlphaValu";
 //BA.debugLineNum = 8127;BA.debugLine="Graph.AreaFillAlphaValue = Max(AreaFillAlphaValue";
_graph.AreaFillAlphaValue /*int*/  = (int) (__c.Max(_areafillalphavalue,0));
 //BA.debugLineNum = 8128;BA.debugLine="Graph.AreaFillAlphaValue = Min(AreaFillAlphaValue";
_graph.AreaFillAlphaValue /*int*/  = (int) (__c.Min(_areafillalphavalue,255));
 //BA.debugLineNum = 8129;BA.debugLine="Graph.AreaFillAlphaValue = (256 - Graph.AreaFillA";
_graph.AreaFillAlphaValue /*int*/  = (int) ((256-_graph.AreaFillAlphaValue /*int*/ )*16777216);
 //BA.debugLineNum = 8130;BA.debugLine="End Sub";
return "";
}
public String  _setautomaticscale(boolean _automaticscale) throws Exception{
 //BA.debugLineNum = 7405;BA.debugLine="Public Sub setAutomaticScale(AutomaticScale As Boo";
 //BA.debugLineNum = 7406;BA.debugLine="Scale(sY(0)).Automatic = AutomaticScale";
_scale[_sy[(int) (0)]].Automatic /*boolean*/  = _automaticscale;
 //BA.debugLineNum = 7407;BA.debugLine="Scale(sY(1)).Automatic = AutomaticScale";
_scale[_sy[(int) (1)]].Automatic /*boolean*/  = _automaticscale;
 //BA.debugLineNum = 7408;BA.debugLine="Scale(sY(2)).Automatic = AutomaticScale";
_scale[_sy[(int) (2)]].Automatic /*boolean*/  = _automaticscale;
 //BA.debugLineNum = 7409;BA.debugLine="Scale(sY(3)).Automatic = AutomaticScale";
_scale[_sy[(int) (3)]].Automatic /*boolean*/  = _automaticscale;
 //BA.debugLineNum = 7410;BA.debugLine="Scale(sX).Automatic = AutomaticScale";
_scale[_sx].Automatic /*boolean*/  = _automaticscale;
 //BA.debugLineNum = 7411;BA.debugLine="End Sub";
return "";
}
public String  _setautomatictextsizes(boolean _automatictextsizes) throws Exception{
 //BA.debugLineNum = 7507;BA.debugLine="Public Sub setAutomaticTextSizes(AutomaticTextSize";
 //BA.debugLineNum = 7508;BA.debugLine="Texts.AutomaticTextSizes = AutomaticTextSizes";
_texts.AutomaticTextSizes /*boolean*/  = _automatictextsizes;
 //BA.debugLineNum = 7509;BA.debugLine="End Sub";
return "";
}
public String  _setaxistextcolor(int _color) throws Exception{
 //BA.debugLineNum = 7766;BA.debugLine="Public Sub setAxisTextColor(Color As Int)";
 //BA.debugLineNum = 7767;BA.debugLine="Texts.AxisTextColor = Color";
_texts.AxisTextColor /*int*/  = _color;
 //BA.debugLineNum = 7768;BA.debugLine="End Sub";
return "";
}
public String  _setaxistextsize(float _axistextsize) throws Exception{
 //BA.debugLineNum = 7529;BA.debugLine="Public Sub setAxisTextSize(AxisTextSize As Float)";
 //BA.debugLineNum = 7530;BA.debugLine="Texts.AxisTextSize = AxisTextSize";
_texts.AxisTextSize /*float*/  = _axistextsize;
 //BA.debugLineNum = 7531;BA.debugLine="Texts.AxisFont = xui.CreateDefaultFont(Texts.Axis";
_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.AxisTextSize /*float*/ );
 //BA.debugLineNum = 7532;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 7533;BA.debugLine="End Sub";
return "";
}
public String  _setbarmarginmode(int _barmarginmode) throws Exception{
 //BA.debugLineNum = 8036;BA.debugLine="Public Sub setBarMarginMode(BarMarginMode As Int)";
 //BA.debugLineNum = 8037;BA.debugLine="If BarMarginMode >= 0 And BarMarginMode <= 2 Then";
if (_barmarginmode>=0 && _barmarginmode<=2) { 
 //BA.debugLineNum = 8038;BA.debugLine="Graph.BarMarginMode = BarMarginMode";
_graph.BarMarginMode /*int*/  = _barmarginmode;
 }else {
 //BA.debugLineNum = 8040;BA.debugLine="Log(\"Error: wrong BarMarginMode value. 0 , 1 or";
__c.LogImpl("920250628","Error: wrong BarMarginMode value. 0 , 1 or 2",0);
 };
 //BA.debugLineNum = 8042;BA.debugLine="End Sub";
return "";
}
public String  _setbarmeanvalueformat(int _minimumintegers,int _maximumfractions,int _minimumfractions,boolean _groupingused) throws Exception{
 //BA.debugLineNum = 7977;BA.debugLine="Public Sub SetBarMeanValueFormat(MinimumIntegers A";
 //BA.debugLineNum = 7978;BA.debugLine="BMVNFUsed = True";
_bmvnfused = __c.True;
 //BA.debugLineNum = 7979;BA.debugLine="BMVNF.MinimumIntegers = MinimumIntegers";
_bmvnf.MinimumIntegers /*int*/  = _minimumintegers;
 //BA.debugLineNum = 7980;BA.debugLine="BMVNF.MaximumFractions = MaximumFractions";
_bmvnf.MaximumFractions /*int*/  = _maximumfractions;
 //BA.debugLineNum = 7981;BA.debugLine="BMVNF.MinimumFractions = MinimumFractions";
_bmvnf.MinimumFractions /*int*/  = _minimumfractions;
 //BA.debugLineNum = 7982;BA.debugLine="BMVNF.GroupingUsed = GroupingUsed";
_bmvnf.GroupingUsed /*boolean*/  = _groupingused;
 //BA.debugLineNum = 7983;BA.debugLine="End Sub";
return "";
}
public String  _setbarvalueorientation(String _barvalueorientation) throws Exception{
 //BA.debugLineNum = 8019;BA.debugLine="Public Sub setBarValueOrientation(BarValueOrientat";
 //BA.debugLineNum = 8020;BA.debugLine="If BarValueOrientation = \"HORIZONTAL\" Or BarValue";
if ((_barvalueorientation).equals("HORIZONTAL") || (_barvalueorientation).equals("VERTICAL")) { 
 //BA.debugLineNum = 8021;BA.debugLine="Graph.BarValueOrientation = BarValueOrientation";
_graph.BarValueOrientation /*String*/  = _barvalueorientation;
 }else {
 //BA.debugLineNum = 8023;BA.debugLine="Log(\"Error: wrong BarValueOrientation value\")";
__c.LogImpl("920119556","Error: wrong BarValueOrientation value",0);
 };
 //BA.debugLineNum = 8025;BA.debugLine="End Sub";
return "";
}
public String  _setbubblediametermax(double _bubblediametermax) throws Exception{
 //BA.debugLineNum = 8461;BA.debugLine="Public Sub setBubbleDiameterMax(BubbleDiameterMax";
 //BA.debugLineNum = 8462;BA.debugLine="mBubbleDiameterMax = BubbleDiameterMax";
_mbubblediametermax = _bubblediametermax;
 //BA.debugLineNum = 8463;BA.debugLine="End Sub";
return "";
}
public String  _setbubblediametermin(double _bubblediametermin) throws Exception{
 //BA.debugLineNum = 8448;BA.debugLine="Public Sub setBubbleDiameterMin(BubbleDiameterMin";
 //BA.debugLineNum = 8449;BA.debugLine="mBubbleDiameterMin = BubbleDiameterMin";
_mbubblediametermin = _bubblediametermin;
 //BA.debugLineNum = 8450;BA.debugLine="End Sub";
return "";
}
public String  _setbubblesmallsnap(boolean _bubblesmallsnap) throws Exception{
 //BA.debugLineNum = 8473;BA.debugLine="Public Sub setBubbleSmallSnap(BubbleSmallSnap As B";
 //BA.debugLineNum = 8474;BA.debugLine="mBubbleSmallSnap = BubbleSmallSnap";
_mbubblesmallsnap = _bubblesmallsnap;
 //BA.debugLineNum = 8475;BA.debugLine="End Sub";
return "";
}
public String  _setcandledisplayvolume(boolean _candledisplayvolume) throws Exception{
 //BA.debugLineNum = 8376;BA.debugLine="Public Sub setCandleDisplayVolume(CandleDisplayVol";
 //BA.debugLineNum = 8377;BA.debugLine="Bar.CandleDisplayVolume = CandleDisplayVolume";
_bar.CandleDisplayVolume /*boolean*/  = _candledisplayvolume;
 //BA.debugLineNum = 8378;BA.debugLine="End Sub";
return "";
}
public String  _setcandledrawbodyborder(boolean _candledrawbodyborder) throws Exception{
 //BA.debugLineNum = 8425;BA.debugLine="Public Sub setCandleDrawBodyBorder(CandleDrawBodyB";
 //BA.debugLineNum = 8426;BA.debugLine="Bar.DrawBodyBorder = CandleDrawBodyBorder";
_bar.DrawBodyBorder /*boolean*/  = _candledrawbodyborder;
 //BA.debugLineNum = 8427;BA.debugLine="End Sub";
return "";
}
public String  _setcandlewickcolor(int _candlewickcolor) throws Exception{
 //BA.debugLineNum = 8365;BA.debugLine="Public Sub setCandleWickColor(CandleWickColor As I";
 //BA.debugLineNum = 8366;BA.debugLine="Bar.WickColor = CandleWickColor";
_bar.WickColor /*int*/  = _candlewickcolor;
 //BA.debugLineNum = 8367;BA.debugLine="End Sub";
return "";
}
public String  _setcandlewickwidth(int _candlewickwidth) throws Exception{
 //BA.debugLineNum = 8388;BA.debugLine="Public Sub setCandleWickWidth(CandleWickWidth As I";
 //BA.debugLineNum = 8389;BA.debugLine="CandleWickWidth = Max(0, CandleWickWidth)";
_candlewickwidth = (int) (__c.Max(0,_candlewickwidth));
 //BA.debugLineNum = 8390;BA.debugLine="Bar.WickWidth = CandleWickWidth * xui.Scale";
_bar.WickWidth /*int*/  = (int) (_candlewickwidth*_xui.getScale());
 //BA.debugLineNum = 8391;BA.debugLine="End Sub";
return "";
}
public String  _setchartbackgroundcolor(int _color) throws Exception{
 //BA.debugLineNum = 7708;BA.debugLine="Public Sub setChartBackgroundColor(Color As Int)";
 //BA.debugLineNum = 7709;BA.debugLine="Graph.ChartBackgroundColor = Color";
_graph.ChartBackgroundColor /*int*/  = _color;
 //BA.debugLineNum = 7710;BA.debugLine="End Sub";
return "";
}
public String  _setcharttype(String _charttype) throws Exception{
 //BA.debugLineNum = 7445;BA.debugLine="Public Sub setChartType(ChartType As String)";
 //BA.debugLineNum = 7446;BA.debugLine="Select ChartType";
switch (BA.switchObjectToInt(_charttype,"BAR","H_BAR","STACKED_BAR","H_STACKED_BAR","LINE","AREA","STACKED_AREA","H_LINE","PIE","YX_CHART","RADAR","CANDLE","WATERFALL","BUBBLE")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: 
case 13: {
 //BA.debugLineNum = 7448;BA.debugLine="Graph.ChartType = ChartType";
_graph.ChartType /*String*/  = _charttype;
 break; }
default: {
 //BA.debugLineNum = 7450;BA.debugLine="Log(\"Wrong chart type\")";
__c.LogImpl("913959173","Wrong chart type",0);
 break; }
}
;
 //BA.debugLineNum = 7452;BA.debugLine="End Sub";
return "";
}
public String  _setcustomfont(String _customfontname,double _customfontscale) throws Exception{
 //BA.debugLineNum = 9035;BA.debugLine="Public Sub SetCustomFont(CustomFontName As String,";
 //BA.debugLineNum = 9036;BA.debugLine="Texts.CustomFontName = CustomFontName";
_texts.CustomFontName /*String*/  = _customfontname;
 //BA.debugLineNum = 9037;BA.debugLine="If Texts.CustomFontName = \"\" Then 'default font";
if ((_texts.CustomFontName /*String*/ ).equals("")) { 
 //BA.debugLineNum = 9038;BA.debugLine="Texts.CustomFontScale = 1";
_texts.CustomFontScale /*double*/  = 1;
 }else {
 //BA.debugLineNum = 9040;BA.debugLine="Texts.CustomFontScale = CustomFontScale";
_texts.CustomFontScale /*double*/  = _customfontscale;
 };
 //BA.debugLineNum = 9042;BA.debugLine="End Sub";
return "";
}
public String  _setdecreasecolor(int _decreasecolor) throws Exception{
 //BA.debugLineNum = 8415;BA.debugLine="Public Sub setDecreaseColor(DecreaseColor As Int)";
 //BA.debugLineNum = 8416;BA.debugLine="Bar.DecreaseColor = DecreaseColor";
_bar.DecreaseColor /*int*/  = _decreasecolor;
 //BA.debugLineNum = 8417;BA.debugLine="End Sub";
return "";
}
public String  _setdifferentscales(boolean _differentscales) throws Exception{
 //BA.debugLineNum = 7421;BA.debugLine="Public Sub setDifferentScales(DifferentScales As B";
 //BA.debugLineNum = 7422;BA.debugLine="Scale(sY(0)).Different = DifferentScales";
_scale[_sy[(int) (0)]].Different /*boolean*/  = _differentscales;
 //BA.debugLineNum = 7423;BA.debugLine="Scale(sY(1)).Different = DifferentScales";
_scale[_sy[(int) (1)]].Different /*boolean*/  = _differentscales;
 //BA.debugLineNum = 7424;BA.debugLine="Scale(sY(2)).Different = DifferentScales";
_scale[_sy[(int) (2)]].Different /*boolean*/  = _differentscales;
 //BA.debugLineNum = 7425;BA.debugLine="Scale(sY(3)).Different = DifferentScales";
_scale[_sy[(int) (3)]].Different /*boolean*/  = _differentscales;
 //BA.debugLineNum = 7426;BA.debugLine="End Sub";
return "";
}
public String  _setdisplaycursor(boolean _displaycursor) throws Exception{
 //BA.debugLineNum = 7578;BA.debugLine="Public Sub setDisplayCursor(DisplayCursor As Boole";
 //BA.debugLineNum = 7579;BA.debugLine="Values.ShowCursor = DisplayCursor";
_values.ShowCursor /*boolean*/  = _displaycursor;
 //BA.debugLineNum = 7580;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayvalues(boolean _displayvalues) throws Exception{
 //BA.debugLineNum = 7588;BA.debugLine="Public Sub setDisplayValues(DisplayValues As Boole";
 //BA.debugLineNum = 7589;BA.debugLine="Values.Show = DisplayValues";
_values.Show /*boolean*/  = _displayvalues;
 //BA.debugLineNum = 7590;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayvaluesonhover(boolean _displayvaluesonhover) throws Exception{
 //BA.debugLineNum = 7598;BA.debugLine="Public Sub setDisplayValuesOnHover(DisplayValuesOn";
 //BA.debugLineNum = 7599;BA.debugLine="Values.ShowOnHover = DisplayValuesOnHover";
_values.ShowOnHover /*boolean*/  = _displayvaluesonhover;
 //BA.debugLineNum = 7600;BA.debugLine="End Sub";
return "";
}
public String  _setdrawgridframe(boolean _drawgridframe) throws Exception{
 //BA.debugLineNum = 7728;BA.debugLine="Public Sub setDrawGridFrame(DrawGridFrame As Boole";
 //BA.debugLineNum = 7729;BA.debugLine="Graph.DrawGridFrame = DrawGridFrame";
_graph.DrawGridFrame /*boolean*/  = _drawgridframe;
 //BA.debugLineNum = 7730;BA.debugLine="End Sub";
return "";
}
public String  _setdrawhorizontalgridlines(boolean _drawhorizontalgridlines) throws Exception{
 //BA.debugLineNum = 7738;BA.debugLine="Public Sub setDrawHorizontalGridLines(DrawHorizont";
 //BA.debugLineNum = 7739;BA.debugLine="Graph.DrawHorizontalGridLines = DrawHorizontalGri";
_graph.DrawHorizontalGridLines /*boolean*/  = _drawhorizontalgridlines;
 //BA.debugLineNum = 7740;BA.debugLine="End Sub";
return "";
}
public String  _setdrawouterframe(boolean _drawouterframe) throws Exception{
 //BA.debugLineNum = 7927;BA.debugLine="Public Sub setDrawOuterFrame (DrawOuterFrame As Bo";
 //BA.debugLineNum = 7928;BA.debugLine="Graph.DrawOuterFrame = DrawOuterFrame";
_graph.DrawOuterFrame /*boolean*/  = _drawouterframe;
 //BA.debugLineNum = 7929;BA.debugLine="End Sub";
return "";
}
public String  _setdrawverticalgridlines(boolean _drawverticalgridlines) throws Exception{
 //BA.debugLineNum = 7748;BA.debugLine="Public Sub setDrawVerticalGridLines(DrawVerticalGr";
 //BA.debugLineNum = 7749;BA.debugLine="Graph.DrawVerticalGridLines = DrawVerticalGridLin";
_graph.DrawVerticalGridLines /*boolean*/  = _drawverticalgridlines;
 //BA.debugLineNum = 7750;BA.debugLine="End Sub";
return "";
}
public String  _setdrawxscale(boolean _drawxscale) throws Exception{
 //BA.debugLineNum = 7663;BA.debugLine="Public Sub setDrawXScale(DrawXScale As Boolean)";
 //BA.debugLineNum = 7664;BA.debugLine="Scale(sX).DrawXScale = DrawXScale";
_scale[_sx].DrawXScale /*boolean*/  = _drawxscale;
 //BA.debugLineNum = 7665;BA.debugLine="End Sub";
return "";
}
public String  _setdrawyscale(boolean _drawyscale) throws Exception{
 //BA.debugLineNum = 7675;BA.debugLine="Public Sub setDrawYScale(DrawYScale As Boolean)";
 //BA.debugLineNum = 7676;BA.debugLine="Scale(sY(0)).DrawYScale = DrawYScale";
_scale[_sy[(int) (0)]].DrawYScale /*boolean*/  = _drawyscale;
 //BA.debugLineNum = 7677;BA.debugLine="Scale(sY(1)).DrawYScale = DrawYScale";
_scale[_sy[(int) (1)]].DrawYScale /*boolean*/  = _drawyscale;
 //BA.debugLineNum = 7678;BA.debugLine="Scale(sY(2)).DrawYScale = DrawYScale";
_scale[_sy[(int) (2)]].DrawYScale /*boolean*/  = _drawyscale;
 //BA.debugLineNum = 7679;BA.debugLine="Scale(sY(3)).DrawYScale = DrawYScale";
_scale[_sy[(int) (3)]].DrawYScale /*boolean*/  = _drawyscale;
 //BA.debugLineNum = 7680;BA.debugLine="End Sub";
return "";
}
public String  _setgradientcolors(boolean _gradientcolors) throws Exception{
 //BA.debugLineNum = 7688;BA.debugLine="Public Sub setGradientColors(GradientColors As Boo";
 //BA.debugLineNum = 7689;BA.debugLine="Graph.GradientColors = GradientColors";
_graph.GradientColors /*boolean*/  = _gradientcolors;
 //BA.debugLineNum = 7690;BA.debugLine="End Sub";
return "";
}
public String  _setgradientcolorsalpha(int _gradientcolorsalpha) throws Exception{
 //BA.debugLineNum = 7699;BA.debugLine="Public Sub setGradientColorsAlpha(GradientColorsAl";
 //BA.debugLineNum = 7700;BA.debugLine="Graph.GradientColorsAlpha = GradientColorsAlpha";
_graph.GradientColorsAlpha /*int*/  = _gradientcolorsalpha;
 //BA.debugLineNum = 7701;BA.debugLine="Graph.GradientColorsAlpha = Max(0, Graph.Gradient";
_graph.GradientColorsAlpha /*int*/  = (int) (__c.Max(0,_graph.GradientColorsAlpha /*int*/ ));
 //BA.debugLineNum = 7702;BA.debugLine="Graph.GradientColorsAlpha = Min(255, Graph.Gradie";
_graph.GradientColorsAlpha /*int*/  = (int) (__c.Min(255,_graph.GradientColorsAlpha /*int*/ ));
 //BA.debugLineNum = 7703;BA.debugLine="End Sub";
return "";
}
public String  _setgridcolor(int _color) throws Exception{
 //BA.debugLineNum = 7722;BA.debugLine="Public Sub setGridColor(Color As Int)";
 //BA.debugLineNum = 7723;BA.debugLine="Graph.GridColor = Color";
_graph.GridColor /*int*/  = _color;
 //BA.debugLineNum = 7724;BA.debugLine="End Sub";
return "";
}
public String  _setgridframecolor(int _color) throws Exception{
 //BA.debugLineNum = 7715;BA.debugLine="Public Sub setGridFrameColor(Color As Int)";
 //BA.debugLineNum = 7716;BA.debugLine="Graph.GridFrameColor = Color";
_graph.GridFrameColor /*int*/  = _color;
 //BA.debugLineNum = 7717;BA.debugLine="End Sub";
return "";
}
public String  _sethchartstickstopdown(boolean _hchartstickstopdown) throws Exception{
 //BA.debugLineNum = 8251;BA.debugLine="Public Sub setHChartsTicksTopDown(HChartsTicksTopD";
 //BA.debugLineNum = 8252;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 8253;BA.debugLine="mHChartsTicksTopDown = HChartsTicksTopDown";
_mhchartstickstopdown = _hchartstickstopdown;
 };
 //BA.debugLineNum = 8256;BA.debugLine="End Sub";
return "";
}
public String  _sethchartsxscaleontop(boolean _hbarsxscaleontop) throws Exception{
 //BA.debugLineNum = 8237;BA.debugLine="Public Sub setHChartsXScaleOnTop(HBarsXScaleOnTop";
 //BA.debugLineNum = 8238;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 8239;BA.debugLine="mHChartsXScaleOnTop = HBarsXScaleOnTop";
_mhchartsxscaleontop = _hbarsxscaleontop;
 };
 //BA.debugLineNum = 8242;BA.debugLine="End Sub";
return "";
}
public String  _setheight(int _height) throws Exception{
 //BA.debugLineNum = 7487;BA.debugLine="Public Sub setHeight(Height As Int)";
 //BA.debugLineNum = 7488;BA.debugLine="mBase.Height = Height";
_mbase.setHeight(_height);
 //BA.debugLineNum = 7489;BA.debugLine="Base_Resize(mBase.Width, Height)";
_base_resize(_mbase.getWidth(),_height);
 //BA.debugLineNum = 7490;BA.debugLine="End Sub";
return "";
}
public String  _setincludebarmeanline(boolean _includebarmeanline) throws Exception{
 //BA.debugLineNum = 7395;BA.debugLine="Public Sub setIncludeBarMeanLine(IncludeBarMeanLin";
 //BA.debugLineNum = 7396;BA.debugLine="Graph.IncludeBarMeanLine = IncludeBarMeanLine";
_graph.IncludeBarMeanLine /*boolean*/  = _includebarmeanline;
 //BA.debugLineNum = 7397;BA.debugLine="End Sub";
return "";
}
public String  _setincludelegend(String _includelegend) throws Exception{
 //BA.debugLineNum = 7374;BA.debugLine="Public Sub setIncludeLegend(IncludeLegend As Strin";
 //BA.debugLineNum = 7375;BA.debugLine="Legend.IncludeLegend = IncludeLegend";
_legend.IncludeLegend /*String*/  = _includelegend;
 //BA.debugLineNum = 7376;BA.debugLine="End Sub";
return "";
}
public String  _setincludemaxline(boolean _includemaxline) throws Exception{
 //BA.debugLineNum = 7948;BA.debugLine="Public Sub setIncludeMaxLine (IncludeMaxLine As Bo";
 //BA.debugLineNum = 7949;BA.debugLine="Graph.IncludeMaxLine = IncludeMaxLine";
_graph.IncludeMaxLine /*boolean*/  = _includemaxline;
 //BA.debugLineNum = 7951;BA.debugLine="End Sub";
return "";
}
public String  _setincludemeanline(boolean _includemeanline) throws Exception{
 //BA.debugLineNum = 7959;BA.debugLine="Public Sub setIncludeMeanLine (IncludeMeanLine As";
 //BA.debugLineNum = 7960;BA.debugLine="Graph.IncludeMeanLine = IncludeMeanLine";
_graph.IncludeMeanLine /*boolean*/  = _includemeanline;
 //BA.debugLineNum = 7962;BA.debugLine="End Sub";
return "";
}
public String  _setincludeminline(boolean _includeminline) throws Exception{
 //BA.debugLineNum = 7937;BA.debugLine="Public Sub setIncludeMinLine (IncludeMinLine As Bo";
 //BA.debugLineNum = 7938;BA.debugLine="Graph.IncludeMinLine = IncludeMinLine";
_graph.IncludeMinLine /*boolean*/  = _includeminline;
 //BA.debugLineNum = 7940;BA.debugLine="End Sub";
return "";
}
public String  _setincludevalues(boolean _includevalues) throws Exception{
 //BA.debugLineNum = 7385;BA.debugLine="Public Sub setIncludeValues(IncludeValues As Boole";
 //BA.debugLineNum = 7386;BA.debugLine="Graph.IncludeValues = IncludeValues";
_graph.IncludeValues /*boolean*/  = _includevalues;
 //BA.debugLineNum = 7387;BA.debugLine="End Sub";
return "";
}
public String  _setincreasecolor(int _increasecolor) throws Exception{
 //BA.debugLineNum = 8402;BA.debugLine="Public Sub setIncreaseColor(IncreaseColor As Int)";
 //BA.debugLineNum = 8403;BA.debugLine="Bar.IncreaseColor = IncreaseColor";
_bar.IncreaseColor /*int*/  = _increasecolor;
 //BA.debugLineNum = 8404;BA.debugLine="End Sub";
return "";
}
public String  _setkeepdisplayvalues(String _keepdisplayvalues) throws Exception{
 //BA.debugLineNum = 8217;BA.debugLine="Public Sub setKeepDisplayValues(KeepDisplayValues";
 //BA.debugLineNum = 8218;BA.debugLine="Select KeepDisplayValues";
switch (BA.switchObjectToInt(_keepdisplayvalues,"NONE","CURSOR","BOTH")) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 8220;BA.debugLine="mKeepDisplayValues = KeepDisplayValues";
_mkeepdisplayvalues = _keepdisplayvalues;
 //BA.debugLineNum = 8222;BA.debugLine="If mKeepDisplayValues = False Then";
if ((_mkeepdisplayvalues).equals(BA.ObjectToString(__c.False))) { 
 //BA.debugLineNum = 8223;BA.debugLine="ClearDisplayedValues";
_cleardisplayedvalues();
 };
 break; }
default: {
 //BA.debugLineNum = 8226;BA.debugLine="Log(\"Wrong KeepDisplayValues value !\")";
__c.LogImpl("922347785","Wrong KeepDisplayValues value !",0);
 break; }
}
;
 //BA.debugLineNum = 8228;BA.debugLine="End Sub";
return "";
}
public String  _setleft(int _left) throws Exception{
 //BA.debugLineNum = 7459;BA.debugLine="Public Sub setLeft(Left As Int)";
 //BA.debugLineNum = 7460;BA.debugLine="mBase.Left = Left";
_mbase.setLeft(_left);
 //BA.debugLineNum = 7461;BA.debugLine="End Sub";
return "";
}
public String  _setlegendbackgroundcolor(int _color) throws Exception{
 //BA.debugLineNum = 7794;BA.debugLine="Public Sub setLegendBackgroundColor(Color As Int)";
 //BA.debugLineNum = 7795;BA.debugLine="Legend.BackgroundColor = Color";
_legend.BackgroundColor /*int*/  = _color;
 //BA.debugLineNum = 7796;BA.debugLine="End Sub";
return "";
}
public String  _setlegendtextcolor(int _color) throws Exception{
 //BA.debugLineNum = 7801;BA.debugLine="Public Sub setLegendTextColor(Color As Int)";
 //BA.debugLineNum = 7802;BA.debugLine="Legend.TextColor = Color";
_legend.TextColor /*int*/  = _color;
 //BA.debugLineNum = 7803;BA.debugLine="End Sub";
return "";
}
public String  _setlegendtextsize(float _legendtextsize) throws Exception{
 //BA.debugLineNum = 7553;BA.debugLine="Public Sub setLegendTextSize(LegendTextSize As Flo";
 //BA.debugLineNum = 7554;BA.debugLine="Legend.TextSize = LegendTextSize";
_legend.TextSize /*float*/  = _legendtextsize;
 //BA.debugLineNum = 7555;BA.debugLine="Legend.TextFont = xui.CreateDefaultFont(Legend.Te";
_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_legend.TextSize /*float*/ );
 //BA.debugLineNum = 7556;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 7557;BA.debugLine="End Sub";
return "";
}
public String  _setmaxlinecolor(int _color) throws Exception{
 //BA.debugLineNum = 7815;BA.debugLine="Public Sub setMaxLineColor(Color As Int)";
 //BA.debugLineNum = 7816;BA.debugLine="Graph.MaxLineColor = Color";
_graph.MaxLineColor /*int*/  = _color;
 //BA.debugLineNum = 7817;BA.debugLine="End Sub";
return "";
}
public String  _setmeanlinecolor(int _color) throws Exception{
 //BA.debugLineNum = 7822;BA.debugLine="Public Sub setMeanLineColor(Color As Int)";
 //BA.debugLineNum = 7823;BA.debugLine="Graph.MeanLineColor = Color";
_graph.MeanLineColor /*int*/  = _color;
 //BA.debugLineNum = 7824;BA.debugLine="End Sub";
return "";
}
public String  _setminlinecolor(int _color) throws Exception{
 //BA.debugLineNum = 7808;BA.debugLine="Public Sub setMinLineColor(Color As Int)";
 //BA.debugLineNum = 7809;BA.debugLine="Graph.MinLineColor = Color";
_graph.MinLineColor /*int*/  = _color;
 //BA.debugLineNum = 7810;BA.debugLine="End Sub";
return "";
}
public String  _setmissingdatavalue(double _missingdatavalue) throws Exception{
 //BA.debugLineNum = 8325;BA.debugLine="Public Sub setMissingDataValue(MissingDataValue As";
 //BA.debugLineNum = 8326;BA.debugLine="mMissingDataValue = MissingDataValue";
_mmissingdatavalue = _missingdatavalue;
 //BA.debugLineNum = 8327;BA.debugLine="End Sub";
return "";
}
public String  _setnbxintervals(int _nbxintervals) throws Exception{
 //BA.debugLineNum = 7846;BA.debugLine="Public Sub setNbXIntervals (NbXIntervals As Int)";
 //BA.debugLineNum = 7847;BA.debugLine="Scale(sX).NbIntervals = NbXIntervals";
_scale[_sx].NbIntervals /*int*/  = _nbxintervals;
 //BA.debugLineNum = 7848;BA.debugLine="End Sub";
return "";
}
public String  _setnbyintervals(int _nbyintervals) throws Exception{
 //BA.debugLineNum = 7832;BA.debugLine="Public Sub setNbYIntervals (NbYIntervals As Int)";
 //BA.debugLineNum = 7833;BA.debugLine="Scale(sY(0)).NbIntervals = NbYIntervals";
_scale[_sy[(int) (0)]].NbIntervals /*int*/  = _nbyintervals;
 //BA.debugLineNum = 7834;BA.debugLine="Scale(sY(1)).NbIntervals = NbYIntervals";
_scale[_sy[(int) (1)]].NbIntervals /*int*/  = _nbyintervals;
 //BA.debugLineNum = 7835;BA.debugLine="Scale(sY(2)).NbIntervals = NbYIntervals";
_scale[_sy[(int) (2)]].NbIntervals /*int*/  = _nbyintervals;
 //BA.debugLineNum = 7836;BA.debugLine="Scale(sY(3)).NbIntervals = NbYIntervals";
_scale[_sy[(int) (3)]].NbIntervals /*int*/  = _nbyintervals;
 //BA.debugLineNum = 7837;BA.debugLine="End Sub";
return "";
}
public String  _setpieaddpercentage(boolean _pieaddpercentage) throws Exception{
 //BA.debugLineNum = 8071;BA.debugLine="Public Sub setPieAddPercentage(PieAddPercentage As";
 //BA.debugLineNum = 8072;BA.debugLine="Graph.PieAddPercentage = PieAddPercentage";
_graph.PieAddPercentage /*boolean*/  = _pieaddpercentage;
 //BA.debugLineNum = 8073;BA.debugLine="End Sub";
return "";
}
public String  _setpiegapdegrees(int _piegapdegrees) throws Exception{
 //BA.debugLineNum = 8061;BA.debugLine="Public Sub setPieGapDegrees(PieGapDegrees As Int)";
 //BA.debugLineNum = 8062;BA.debugLine="Graph.PieGapDegrees = PieGapDegrees";
_graph.PieGapDegrees /*int*/  = _piegapdegrees;
 //BA.debugLineNum = 8063;BA.debugLine="End Sub";
return "";
}
public String  _setpiepercentagenbfractions(int _piepercentagenbfractions) throws Exception{
 //BA.debugLineNum = 8081;BA.debugLine="Public Sub setPiePercentageNbFractions(PiePercenta";
 //BA.debugLineNum = 8082;BA.debugLine="mPiePercentageNbFractions = Max(PiePercentageNbFr";
_mpiepercentagenbfractions = (int) (__c.Max(_piepercentagenbfractions,0));
 //BA.debugLineNum = 8083;BA.debugLine="mPiePercentageNbFractions = Min(mPiePercentageNbF";
_mpiepercentagenbfractions = (int) (__c.Min(_mpiepercentagenbfractions,2));
 //BA.debugLineNum = 8084;BA.debugLine="End Sub";
return "";
}
public String  _setpiestartangle(int _piestartangle) throws Exception{
 //BA.debugLineNum = 8051;BA.debugLine="Public Sub setPieStartAngle(PieStartAngle As Int)";
 //BA.debugLineNum = 8052;BA.debugLine="Graph.PieStartAngle = PieStartAngle";
_graph.PieStartAngle /*int*/  = _piestartangle;
 //BA.debugLineNum = 8053;BA.debugLine="End Sub";
return "";
}
public String  _setradardrawscale(boolean _radardrawscale) throws Exception{
 //BA.debugLineNum = 8180;BA.debugLine="Public Sub setRadarDrawScale(RadarDrawScale As Boo";
 //BA.debugLineNum = 8181;BA.debugLine="Graph.RadarDrawScale = RadarDrawScale";
_graph.RadarDrawScale /*boolean*/  = _radardrawscale;
 //BA.debugLineNum = 8182;BA.debugLine="End Sub";
return "";
}
public String  _setradardrawscalevalues(boolean _radardrawscalevalues) throws Exception{
 //BA.debugLineNum = 8190;BA.debugLine="Public Sub setRadarDrawScaleValues(RadarDrawScaleV";
 //BA.debugLineNum = 8191;BA.debugLine="Graph.RadarDrawScaleValues = RadarDrawScaleValues";
_graph.RadarDrawScaleValues /*boolean*/  = _radardrawscalevalues;
 //BA.debugLineNum = 8192;BA.debugLine="End Sub";
return "";
}
public String  _setradarscaletype(String _radarscaletype) throws Exception{
 //BA.debugLineNum = 8200;BA.debugLine="Public Sub setRadarScaleType(RadarScaleType As Str";
 //BA.debugLineNum = 8201;BA.debugLine="If RadarScaleType = \"SPIDER\" Or RadarScaleType =";
if ((_radarscaletype).equals("SPIDER") || (_radarscaletype).equals("CIRCLE")) { 
 //BA.debugLineNum = 8202;BA.debugLine="Graph.RadarScaleType = RadarScaleType";
_graph.RadarScaleType /*String*/  = _radarscaletype;
 }else {
 //BA.debugLineNum = 8204;BA.debugLine="Log(RadarScaleType & \"  Wrong type, must be SPID";
__c.LogImpl("922216708",_radarscaletype+"  Wrong type, must be SPIDER or CIRCLE)",0);
 };
 //BA.debugLineNum = 8206;BA.debugLine="End Sub";
return "";
}
public String  _setradarstartangle(int _startangle) throws Exception{
 //BA.debugLineNum = 8169;BA.debugLine="Public Sub setRadarStartAngle(StartAngle As Int)";
 //BA.debugLineNum = 8170;BA.debugLine="Graph.RadarStartAngle = StartAngle";
_graph.RadarStartAngle /*int*/  = _startangle;
 //BA.debugLineNum = 8171;BA.debugLine="End Sub";
return "";
}
public String  _setreverseyscale(boolean _reverseyscale) throws Exception{
 //BA.debugLineNum = 8336;BA.debugLine="Public Sub setReverseYScale(ReverseYScale As Boole";
 //BA.debugLineNum = 8337;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","YX_CHART","AREA","STACKED_AREA","BUBBLE")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 8339;BA.debugLine="Scale(sY(0)).ReverseYScale = ReverseYScale";
_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/  = _reverseyscale;
 //BA.debugLineNum = 8340;BA.debugLine="Scale(sY(1)).ReverseYScale = ReverseYScale";
_scale[_sy[(int) (1)]].ReverseYScale /*boolean*/  = _reverseyscale;
 //BA.debugLineNum = 8341;BA.debugLine="Scale(sY(2)).ReverseYScale = ReverseYScale";
_scale[_sy[(int) (2)]].ReverseYScale /*boolean*/  = _reverseyscale;
 //BA.debugLineNum = 8342;BA.debugLine="Scale(sY(3)).ReverseYScale = ReverseYScale";
_scale[_sy[(int) (3)]].ReverseYScale /*boolean*/  = _reverseyscale;
 break; }
}
;
 //BA.debugLineNum = 8344;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(double _rotation) throws Exception{
 //BA.debugLineNum = 7916;BA.debugLine="Public Sub setRotation (Rotation As Double)";
 //BA.debugLineNum = 7917;BA.debugLine="Graph.Rotation = Rotation";
_graph.Rotation /*double*/  = _rotation;
 //BA.debugLineNum = 7918;BA.debugLine="mBase.Rotation = Graph.Rotation";
_mbase.setRotation((float) (_graph.Rotation /*double*/ ));
 //BA.debugLineNum = 7919;BA.debugLine="End Sub";
return "";
}
public String  _setscalesonzoomedpart(boolean _scalesonzoomedpart) throws Exception{
 //BA.debugLineNum = 8353;BA.debugLine="Public Sub setScalesOnZoomedPart(ScalesOnZoomedPar";
 //BA.debugLineNum = 8354;BA.debugLine="Zoom.ScalesOnZoomedPart = ScalesOnZoomedPart";
_zoom.ScalesOnZoomedPart /*boolean*/  = _scalesonzoomedpart;
 //BA.debugLineNum = 8355;BA.debugLine="End Sub";
return "";
}
public String  _setscaletextcolor(int _color) throws Exception{
 //BA.debugLineNum = 7773;BA.debugLine="Public Sub setScaleTextColor(Color As Int)";
 //BA.debugLineNum = 7774;BA.debugLine="Texts.ScaleTextColor = Color";
_texts.ScaleTextColor /*int*/  = _color;
 //BA.debugLineNum = 7775;BA.debugLine="End Sub";
return "";
}
public String  _setscaletextsize(float _scaletextsize) throws Exception{
 //BA.debugLineNum = 7541;BA.debugLine="Public Sub setScaleTextSize(ScaleTextSize As Float";
 //BA.debugLineNum = 7542;BA.debugLine="Texts.ScaleTextSize = ScaleTextSize";
_texts.ScaleTextSize /*float*/  = _scaletextsize;
 //BA.debugLineNum = 7543;BA.debugLine="Texts.ScaleFont = xui.CreateDefaultFont(Texts.Sca";
_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 7544;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 7545;BA.debugLine="End Sub";
return "";
}
public String  _setscalevalues(String _scalevalues) throws Exception{
 //BA.debugLineNum = 7610;BA.debugLine="Public Sub setScaleValues(ScaleValues As String)";
 //BA.debugLineNum = 7611;BA.debugLine="If ScaleValues.StartsWith(\"1!\") = False Or ScaleV";
if (_scalevalues.startsWith("1!")==__c.False || _scalevalues.endsWith("!10")==__c.False) { 
 //BA.debugLineNum = 7612;BA.debugLine="Log(\"Wrong ScaleValues property\")";
__c.LogImpl("915925250","Wrong ScaleValues property",0);
 //BA.debugLineNum = 7613;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 7615;BA.debugLine="Scale(sY(0)).ScaleValues = ScaleValues";
_scale[_sy[(int) (0)]].ScaleValues /*String*/  = _scalevalues;
 //BA.debugLineNum = 7616;BA.debugLine="Scale(sY(1)).ScaleValues = ScaleValues";
_scale[_sy[(int) (1)]].ScaleValues /*String*/  = _scalevalues;
 //BA.debugLineNum = 7617;BA.debugLine="Scale(sY(2)).ScaleValues = ScaleValues";
_scale[_sy[(int) (2)]].ScaleValues /*String*/  = _scalevalues;
 //BA.debugLineNum = 7618;BA.debugLine="Scale(sY(3)).ScaleValues = ScaleValues";
_scale[_sy[(int) (3)]].ScaleValues /*String*/  = _scalevalues;
 //BA.debugLineNum = 7619;BA.debugLine="End Sub";
return "";
}
public String  _setscalexvalueslog(String _scalexvalueslog) throws Exception{
 //BA.debugLineNum = 7647;BA.debugLine="Public Sub setScaleXValuesLog(ScaleXValuesLog As S";
 //BA.debugLineNum = 7648;BA.debugLine="If ScaleXValuesLog.StartsWith(\"1!\") = False Or Sc";
if (_scalexvalueslog.startsWith("1!")==__c.False || _scalexvalueslog.endsWith("!10")==__c.False) { 
 //BA.debugLineNum = 7649;BA.debugLine="Log(\"Wrong ScaleXValuesLog property\")";
__c.LogImpl("916187394","Wrong ScaleXValuesLog property",0);
 //BA.debugLineNum = 7650;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 7652;BA.debugLine="ScaleLog(sX).ScaleValues = ScaleXValuesLog";
_scalelog[_sx].ScaleValues /*String*/  = _scalexvalueslog;
 //BA.debugLineNum = 7653;BA.debugLine="End Sub";
return "";
}
public String  _setscaleyvalueslog(String _scaleyvalueslog) throws Exception{
 //BA.debugLineNum = 7630;BA.debugLine="Public Sub setScaleYValuesLog(ScaleYValuesLog As S";
 //BA.debugLineNum = 7631;BA.debugLine="If ScaleYValuesLog.StartsWith(\"1!\") = False Or Sc";
if (_scaleyvalueslog.startsWith("1!")==__c.False || _scaleyvalueslog.endsWith("!10")==__c.False) { 
 //BA.debugLineNum = 7632;BA.debugLine="Log(\"Wrong ScaleYValuesLog property\")";
__c.LogImpl("916056322","Wrong ScaleYValuesLog property",0);
 //BA.debugLineNum = 7633;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 7635;BA.debugLine="ScaleLog(sY(0)).ScaleValues = ScaleYValuesLog";
_scalelog[_sy[(int) (0)]].ScaleValues /*String*/  = _scaleyvalueslog;
 //BA.debugLineNum = 7636;BA.debugLine="End Sub";
return "";
}
public String  _setsubtitle(String _subtitle) throws Exception{
 //BA.debugLineNum = 7990;BA.debugLine="Public Sub setSubtitle(Subtitle As String)";
 //BA.debugLineNum = 7991;BA.debugLine="Graph.Subtitle = Subtitle";
_graph.Subtitle /*String*/  = _subtitle;
 //BA.debugLineNum = 7992;BA.debugLine="End Sub";
return "";
}
public String  _setsubtitletextcolor(int _color) throws Exception{
 //BA.debugLineNum = 8009;BA.debugLine="Public Sub setSubtitleTextColor(Color As Int)";
 //BA.debugLineNum = 8010;BA.debugLine="Texts.SubtitleTextColor = Color";
_texts.SubtitleTextColor /*int*/  = _color;
 //BA.debugLineNum = 8011;BA.debugLine="End Sub";
return "";
}
public String  _setsubtitletextsize(float _subtitletextsize) throws Exception{
 //BA.debugLineNum = 8000;BA.debugLine="Public Sub setSubtitleTextSize(SubtitleTextSize As";
 //BA.debugLineNum = 8001;BA.debugLine="Texts.SubtitleTextSize = SubtitleTextSize";
_texts.SubtitleTextSize /*float*/  = _subtitletextsize;
 //BA.debugLineNum = 8002;BA.debugLine="Texts.SubtitleFont = xui.CreateDefaultFont(Texts.";
_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.SubtitleTextSize /*float*/ );
 //BA.debugLineNum = 8003;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 8004;BA.debugLine="End Sub";
return "";
}
public String  _settitle(String _title) throws Exception{
 //BA.debugLineNum = 7234;BA.debugLine="Public Sub setTitle(Title As String)";
 //BA.debugLineNum = 7235;BA.debugLine="Graph.Title = Title";
_graph.Title /*String*/  = _title;
 //BA.debugLineNum = 7236;BA.debugLine="End Sub";
return "";
}
public String  _settitletextcolor(int _color) throws Exception{
 //BA.debugLineNum = 7759;BA.debugLine="Public Sub setTitleTextColor(Color As Int)";
 //BA.debugLineNum = 7760;BA.debugLine="Texts.TitleTextColor = Color";
_texts.TitleTextColor /*int*/  = _color;
 //BA.debugLineNum = 7761;BA.debugLine="End Sub";
return "";
}
public String  _settitletextsize(float _titletextsize) throws Exception{
 //BA.debugLineNum = 7517;BA.debugLine="Public Sub setTitleTextSize(TitleTextSize As Float";
 //BA.debugLineNum = 7518;BA.debugLine="Texts.TitleTextSize = TitleTextSize";
_texts.TitleTextSize /*float*/  = _titletextsize;
 //BA.debugLineNum = 7519;BA.debugLine="Texts.TitleFont = xui.CreateDefaultFont(Texts.Tit";
_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.TitleTextSize /*float*/ );
 //BA.debugLineNum = 7520;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 7521;BA.debugLine="End Sub";
return "";
}
public String  _settop(int _top) throws Exception{
 //BA.debugLineNum = 7468;BA.debugLine="Public Sub setTop(Top As Int)";
 //BA.debugLineNum = 7469;BA.debugLine="mBase.Top = Top";
_mbase.setTop(_top);
 //BA.debugLineNum = 7470;BA.debugLine="End Sub";
return "";
}
public String  _setvaluesbackgroundcolor(int _color) throws Exception{
 //BA.debugLineNum = 7787;BA.debugLine="Public Sub setValuesBackgroundColor(Color As Int)";
 //BA.debugLineNum = 7788;BA.debugLine="Values.BackgroundColor = Color";
_values.BackgroundColor /*int*/  = _color;
 //BA.debugLineNum = 7789;BA.debugLine="End Sub";
return "";
}
public String  _setvaluestextcolor(int _color) throws Exception{
 //BA.debugLineNum = 7780;BA.debugLine="Public Sub setValuesTextColor(Color As Int)";
 //BA.debugLineNum = 7781;BA.debugLine="Values.TextColor = Color";
_values.TextColor /*int*/  = _color;
 //BA.debugLineNum = 7782;BA.debugLine="End Sub";
return "";
}
public String  _setvaluestextsize(float _valuestextsize) throws Exception{
 //BA.debugLineNum = 7565;BA.debugLine="Public Sub setValuesTextSize(ValuesTextSize As Flo";
 //BA.debugLineNum = 7566;BA.debugLine="Values.TextSize = ValuesTextSize";
_values.TextSize /*float*/  = _valuestextsize;
 //BA.debugLineNum = 7567;BA.debugLine="Values.TextFont = xui.CreateDefaultFont(Values.Te";
_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_values.TextSize /*float*/ );
 //BA.debugLineNum = 7568;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 7569;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 7497;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 7498;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 7499;BA.debugLine="End Sub";
return "";
}
public String  _setwaterfalltotalbarcolor(int _waterfalltotalbarcolor) throws Exception{
 //BA.debugLineNum = 8437;BA.debugLine="Public Sub setWaterfallTotalBarColor(WaterfallTota";
 //BA.debugLineNum = 8438;BA.debugLine="Bar.TotalBarColor = WaterfallTotalBarColor";
_bar.TotalBarColor /*int*/  = _waterfalltotalbarcolor;
 //BA.debugLineNum = 8439;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(int _width) throws Exception{
 //BA.debugLineNum = 7477;BA.debugLine="Public Sub setWidth(Width As Int)";
 //BA.debugLineNum = 7478;BA.debugLine="mBase.Width = Width";
_mbase.setWidth(_width);
 //BA.debugLineNum = 7479;BA.debugLine="Base_Resize(Width, mBase.Height)";
_base_resize(_width,_mbase.getHeight());
 //BA.debugLineNum = 7480;BA.debugLine="End Sub";
return "";
}
public String  _setxaxisname(String _xaxisname) throws Exception{
 //BA.debugLineNum = 7243;BA.debugLine="Public Sub setXAxisName(XAxisName As String)";
 //BA.debugLineNum = 7244;BA.debugLine="Graph.XAxisName = XAxisName";
_graph.XAxisName /*String*/  = _xaxisname;
 //BA.debugLineNum = 7245;BA.debugLine="End Sub";
return "";
}
public String  _setxmaxvalue(double _maxvalue) throws Exception{
 //BA.debugLineNum = 8137;BA.debugLine="Public Sub setXMaxValue(MaxValue As Double)";
 //BA.debugLineNum = 8138;BA.debugLine="Scale(sX).MaxManu = MaxValue";
_scale[_sx].MaxManu /*double*/  = _maxvalue;
 //BA.debugLineNum = 8139;BA.debugLine="Scale(sX).MaxVal = MaxValue";
_scale[_sx].MaxVal /*double*/  = _maxvalue;
 //BA.debugLineNum = 8140;BA.debugLine="End Sub";
return "";
}
public String  _setxminvalue(double _minvalue) throws Exception{
 //BA.debugLineNum = 8113;BA.debugLine="Public Sub setXMinValue(MinValue As Double)";
 //BA.debugLineNum = 8114;BA.debugLine="Scale(sX).MinManu = MinValue";
_scale[_sx].MinManu /*double*/  = _minvalue;
 //BA.debugLineNum = 8115;BA.debugLine="Scale(sX).MinVal = MinValue";
_scale[_sx].MinVal /*double*/  = _minvalue;
 //BA.debugLineNum = 8116;BA.debugLine="End Sub";
return "";
}
public String  _setxscalelogarithmic(boolean _xscalelogarithmic) throws Exception{
 //BA.debugLineNum = 8104;BA.debugLine="Public Sub setXScaleLogarithmic(XScaleLogarithmic";
 //BA.debugLineNum = 8105;BA.debugLine="Scale(sX).Logarithmic = XScaleLogarithmic";
_scale[_sx].Logarithmic /*boolean*/  = _xscalelogarithmic;
 //BA.debugLineNum = 8106;BA.debugLine="End Sub";
return "";
}
public String  _setxscalemaxvalue(double _xscalemaxvalue) throws Exception{
 //BA.debugLineNum = 7348;BA.debugLine="Public Sub setXScaleMaxValue(XScaleMaxValue As Dou";
 //BA.debugLineNum = 7349;BA.debugLine="Scale(sX).MaxManu = XScaleMaxValue";
_scale[_sx].MaxManu /*double*/  = _xscalemaxvalue;
 //BA.debugLineNum = 7350;BA.debugLine="Scale(sX).MaxVal = XScaleMaxValue";
_scale[_sx].MaxVal /*double*/  = _xscalemaxvalue;
 //BA.debugLineNum = 7351;BA.debugLine="Scale(sX).Automatic = False";
_scale[_sx].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 7352;BA.debugLine="End Sub";
return "";
}
public String  _setxscaleminvalue(double _xscaleminvalue) throws Exception{
 //BA.debugLineNum = 7362;BA.debugLine="Public Sub setXScaleMinValue(XScaleMinValue As Dou";
 //BA.debugLineNum = 7363;BA.debugLine="Scale(sX).MinManu = XScaleMinValue";
_scale[_sx].MinManu /*double*/  = _xscaleminvalue;
 //BA.debugLineNum = 7364;BA.debugLine="Scale(sX).MinVal = XScaleMinValue";
_scale[_sx].MinVal /*double*/  = _xscaleminvalue;
 //BA.debugLineNum = 7365;BA.debugLine="Scale(sX).Automatic = False";
_scale[_sx].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 7366;BA.debugLine="End Sub";
return "";
}
public String  _setxscaletextorientation(String _xscaletextorientation) throws Exception{
 //BA.debugLineNum = 7435;BA.debugLine="Public Sub setXScaleTextOrientation(XScaleTextOrie";
 //BA.debugLineNum = 7436;BA.debugLine="Graph.XScaleTextOrientation = XScaleTextOrientati";
_graph.XScaleTextOrientation /*String*/  = _xscaletextorientation;
 //BA.debugLineNum = 7437;BA.debugLine="End Sub";
return "";
}
public String  _setxzeroaxis(boolean _xzeroaxis) throws Exception{
 //BA.debugLineNum = 7857;BA.debugLine="Public Sub setXZeroAxis (XZeroAxis As Boolean)";
 //BA.debugLineNum = 7858;BA.debugLine="Scale(sX).YZeroAxis = XZeroAxis";
_scale[_sx].YZeroAxis /*boolean*/  = _xzeroaxis;
 //BA.debugLineNum = 7859;BA.debugLine="End Sub";
return "";
}
public String  _setxzeroaxishighlight(boolean _xzeroaxishighlight) throws Exception{
 //BA.debugLineNum = 7867;BA.debugLine="Public Sub setXZeroAxisHighlight (XZeroAxisHighlig";
 //BA.debugLineNum = 7868;BA.debugLine="Scale(sX).YZeroAxisHighlight = XZeroAxisHighlight";
_scale[_sx].YZeroAxisHighlight /*boolean*/  = _xzeroaxishighlight;
 //BA.debugLineNum = 7869;BA.debugLine="End Sub";
return "";
}
public String  _setyaxisname(String _yaxisname) throws Exception{
 //BA.debugLineNum = 7253;BA.debugLine="Public Sub setYAxisName(YAxisName As String)";
 //BA.debugLineNum = 7254;BA.debugLine="Graph.YAxisName = YAxisName";
_graph.YAxisName /*String*/  = _yaxisname;
 //BA.debugLineNum = 7255;BA.debugLine="End Sub";
return "";
}
public String  _setyaxisname2(String _yaxisname2) throws Exception{
 //BA.debugLineNum = 7264;BA.debugLine="Public Sub setYAxisName2(YAxisName2 As String)";
 //BA.debugLineNum = 7265;BA.debugLine="Graph.YAxisName2 = YAxisName2";
_graph.YAxisName2 /*String*/  = _yaxisname2;
 //BA.debugLineNum = 7266;BA.debugLine="End Sub";
return "";
}
public String  _setymaxvalue(double _maxvalue) throws Exception{
 //BA.debugLineNum = 8157;BA.debugLine="Public Sub setYMaxValue(MaxValue As Double)";
 //BA.debugLineNum = 8158;BA.debugLine="Scale(sY(0)).MaxManu = MaxValue";
_scale[_sy[(int) (0)]].MaxManu /*double*/  = _maxvalue;
 //BA.debugLineNum = 8159;BA.debugLine="Scale(sY(0)).MaxVal = MaxValue";
_scale[_sy[(int) (0)]].MaxVal /*double*/  = _maxvalue;
 //BA.debugLineNum = 8160;BA.debugLine="End Sub";
return "";
}
public String  _setyminvalue(double _minvalue) throws Exception{
 //BA.debugLineNum = 8147;BA.debugLine="Public Sub setYMinValue(MinValue As Double)";
 //BA.debugLineNum = 8148;BA.debugLine="Scale(sY(0)).MinManu = MinValue";
_scale[_sy[(int) (0)]].MinManu /*double*/  = _minvalue;
 //BA.debugLineNum = 8149;BA.debugLine="Scale(sY(0)).MinVal = MinValue";
_scale[_sy[(int) (0)]].MinVal /*double*/  = _minvalue;
 //BA.debugLineNum = 8150;BA.debugLine="End Sub";
return "";
}
public String  _setyscalelogaritmic(boolean _yscalelogarithmic) throws Exception{
 //BA.debugLineNum = 8093;BA.debugLine="Public Sub setYScaleLogaritmic(YScaleLogarithmic A";
 //BA.debugLineNum = 8094;BA.debugLine="Scale(sY(0)).Logarithmic = YScaleLogarithmic";
_scale[_sy[(int) (0)]].Logarithmic /*boolean*/  = _yscalelogarithmic;
 //BA.debugLineNum = 8095;BA.debugLine="End Sub";
return "";
}
public String  _setyscalemaxvalue(double _yscalemaxvalue) throws Exception{
 //BA.debugLineNum = 7275;BA.debugLine="Public Sub setYScaleMaxValue(YScaleMaxValue As Dou";
 //BA.debugLineNum = 7276;BA.debugLine="Scale(sY(0)).MaxManu = YScaleMaxValue";
_scale[_sy[(int) (0)]].MaxManu /*double*/  = _yscalemaxvalue;
 //BA.debugLineNum = 7277;BA.debugLine="Scale(sY(0)).MaxVal = YScaleMaxValue";
_scale[_sy[(int) (0)]].MaxVal /*double*/  = _yscalemaxvalue;
 //BA.debugLineNum = 7278;BA.debugLine="Scale(sY(0)).Automatic = False";
_scale[_sy[(int) (0)]].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 7279;BA.debugLine="End Sub";
return "";
}
public String  _setyscaleminvalue(double _yscaleminvalue) throws Exception{
 //BA.debugLineNum = 7311;BA.debugLine="Public Sub setYScaleMinValue(YScaleMinValue As Dou";
 //BA.debugLineNum = 7312;BA.debugLine="Scale(sY(0)).MinManu = YScaleMinValue";
_scale[_sy[(int) (0)]].MinManu /*double*/  = _yscaleminvalue;
 //BA.debugLineNum = 7313;BA.debugLine="Scale(sY(0)).MinVal = YScaleMinValue";
_scale[_sy[(int) (0)]].MinVal /*double*/  = _yscaleminvalue;
 //BA.debugLineNum = 7314;BA.debugLine="Scale(sY(0)).Automatic = False";
_scale[_sy[(int) (0)]].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 7315;BA.debugLine="End Sub";
return "";
}
public String  _setyscalenmaxvalue(int _index,double _yscalemaxvalue) throws Exception{
 //BA.debugLineNum = 7293;BA.debugLine="Public Sub SetYScaleNMaxValue(Index As Int, YScale";
 //BA.debugLineNum = 7294;BA.debugLine="If Index >= 0 And Index < NbMaxDifferentScales Th";
if (_index>=0 && _index<_nbmaxdifferentscales) { 
 //BA.debugLineNum = 7295;BA.debugLine="Scale(sY(Index)).MaxAuto = YScaleMaxValue";
_scale[_sy[_index]].MaxAuto /*double*/  = _yscalemaxvalue;
 //BA.debugLineNum = 7296;BA.debugLine="Scale(sY(Index)).MaxManu = YScaleMaxValue";
_scale[_sy[_index]].MaxManu /*double*/  = _yscalemaxvalue;
 //BA.debugLineNum = 7297;BA.debugLine="Scale(sY(Index)).MaxVal = YScaleMaxValue";
_scale[_sy[_index]].MaxVal /*double*/  = _yscalemaxvalue;
 //BA.debugLineNum = 7298;BA.debugLine="Scale(sY(Index)).Automatic = False";
_scale[_sy[_index]].Automatic /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 7300;BA.debugLine="Log(\"Wrong Index value \" & Index & \", must be be";
__c.LogImpl("912517383","Wrong Index value "+BA.NumberToString(_index)+", must be between 0 and 3",0);
 };
 //BA.debugLineNum = 7302;BA.debugLine="End Sub";
return "";
}
public String  _setyscalenminvalue(int _index,double _yscaleminvalue) throws Exception{
 //BA.debugLineNum = 7329;BA.debugLine="Public Sub SetYScaleNMinValue(Index As Int, YScale";
 //BA.debugLineNum = 7330;BA.debugLine="If Index >= 0 And Index < NbMaxDifferentScales Th";
if (_index>=0 && _index<_nbmaxdifferentscales) { 
 //BA.debugLineNum = 7331;BA.debugLine="Scale(sY(Index)).MinAuto = YScaleMinValue";
_scale[_sy[_index]].MinAuto /*double*/  = _yscaleminvalue;
 //BA.debugLineNum = 7332;BA.debugLine="Scale(sY(Index)).MinManu = YScaleMinValue";
_scale[_sy[_index]].MinManu /*double*/  = _yscaleminvalue;
 //BA.debugLineNum = 7333;BA.debugLine="Scale(sY(Index)).MinVal = YScaleMinValue";
_scale[_sy[_index]].MinVal /*double*/  = _yscaleminvalue;
 //BA.debugLineNum = 7334;BA.debugLine="Scale(sY(Index)).Automatic = False";
_scale[_sy[_index]].Automatic /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 7336;BA.debugLine="Log(\"Wrong Index value \" & Index & \", must be be";
__c.LogImpl("912779527","Wrong Index value "+BA.NumberToString(_index)+", must be between 0 and 3",0);
 };
 //BA.debugLineNum = 7338;BA.debugLine="End Sub";
return "";
}
public String  _setyxchartcrosshaircolor(int _yxchartcrosshaircolor) throws Exception{
 //BA.debugLineNum = 8314;BA.debugLine="Public Sub setYXChartCrossHairColor(YXChartCrossHa";
 //BA.debugLineNum = 8315;BA.debugLine="mYXChartCrossHairColor = YXChartCrossHairColor";
_myxchartcrosshaircolor = _yxchartcrosshaircolor;
 //BA.debugLineNum = 8316;BA.debugLine="End Sub";
return "";
}
public String  _setyxchartcrosshairdeltay(int _yxchartcrosshairdeltay) throws Exception{
 //BA.debugLineNum = 8303;BA.debugLine="Public Sub setYXChartCrossHairDeltaY(YXChartCrossH";
 //BA.debugLineNum = 8304;BA.debugLine="mYXChartCrossHairDeltaY = YXChartCrossHairDeltaY";
_myxchartcrosshairdeltay = _yxchartcrosshairdeltay;
 //BA.debugLineNum = 8305;BA.debugLine="End Sub";
return "";
}
public String  _setyxchartdisplaycrosshair(boolean _yxchartdisplaycrosshair) throws Exception{
 //BA.debugLineNum = 8292;BA.debugLine="Public Sub setYXChartDisplayCrossHair(YXChartDispl";
 //BA.debugLineNum = 8293;BA.debugLine="mYXChartDisplayCrossHair = YXChartDisplayCrossHai";
_myxchartdisplaycrosshair = _yxchartdisplaycrosshair;
 //BA.debugLineNum = 8294;BA.debugLine="End Sub";
return "";
}
public String  _setyxchartdisplayposition(String _yxchartdisplayposition) throws Exception{
 //BA.debugLineNum = 8278;BA.debugLine="Public Sub setYXChartDisplayPosition(YXChartDispla";
 //BA.debugLineNum = 8279;BA.debugLine="Select YXChartDisplayPosition";
switch (BA.switchObjectToInt(_yxchartdisplayposition,"CURSOR","CORNERS")) {
case 0: 
case 1: {
 //BA.debugLineNum = 8281;BA.debugLine="mYXChartDisplayPosition = YXChartDisplayPositio";
_myxchartdisplayposition = _yxchartdisplayposition;
 break; }
}
;
 //BA.debugLineNum = 8284;BA.debugLine="End Sub";
return "";
}
public String  _setyxchartdisplayvalues(boolean _yxchartdisplayvalues) throws Exception{
 //BA.debugLineNum = 8264;BA.debugLine="Public Sub setYXChartDisplayValues(YXChartDisplayV";
 //BA.debugLineNum = 8265;BA.debugLine="mYXChartDisplayValues = YXChartDisplayValues";
_myxchartdisplayvalues = _yxchartdisplayvalues;
 //BA.debugLineNum = 8267;BA.debugLine="End Sub";
return "";
}
public String  _setyzeroaxis(boolean _yzeroaxis) throws Exception{
 //BA.debugLineNum = 7878;BA.debugLine="Public Sub setYZeroAxis (YZeroAxis As Boolean)";
 //BA.debugLineNum = 7879;BA.debugLine="Scale(sY(0)).YZeroAxis = YZeroAxis";
_scale[_sy[(int) (0)]].YZeroAxis /*boolean*/  = _yzeroaxis;
 //BA.debugLineNum = 7880;BA.debugLine="Scale(sY(1)).YZeroAxis = YZeroAxis";
_scale[_sy[(int) (1)]].YZeroAxis /*boolean*/  = _yzeroaxis;
 //BA.debugLineNum = 7881;BA.debugLine="Scale(sY(2)).YZeroAxis = YZeroAxis";
_scale[_sy[(int) (2)]].YZeroAxis /*boolean*/  = _yzeroaxis;
 //BA.debugLineNum = 7882;BA.debugLine="Scale(sY(3)).YZeroAxis = YZeroAxis";
_scale[_sy[(int) (3)]].YZeroAxis /*boolean*/  = _yzeroaxis;
 //BA.debugLineNum = 7883;BA.debugLine="End Sub";
return "";
}
public String  _setyzeroaxishighlight(boolean _yzeroaxishighlight) throws Exception{
 //BA.debugLineNum = 7891;BA.debugLine="Public Sub setYZeroAxisHighlight (YZeroAxisHighlig";
 //BA.debugLineNum = 7892;BA.debugLine="Scale(sY(0)).YZeroAxisHighlight = YZeroAxisHighli";
_scale[_sy[(int) (0)]].YZeroAxisHighlight /*boolean*/  = _yzeroaxishighlight;
 //BA.debugLineNum = 7893;BA.debugLine="Scale(sY(1)).YZeroAxisHighlight = YZeroAxisHighli";
_scale[_sy[(int) (1)]].YZeroAxisHighlight /*boolean*/  = _yzeroaxishighlight;
 //BA.debugLineNum = 7894;BA.debugLine="Scale(sY(2)).YZeroAxisHighlight = YZeroAxisHighli";
_scale[_sy[(int) (2)]].YZeroAxisHighlight /*boolean*/  = _yzeroaxishighlight;
 //BA.debugLineNum = 7895;BA.debugLine="Scale(sY(3)).YZeroAxisHighlight = YZeroAxisHighli";
_scale[_sy[(int) (3)]].YZeroAxisHighlight /*boolean*/  = _yzeroaxishighlight;
 //BA.debugLineNum = 7896;BA.debugLine="End Sub";
return "";
}
public String  _setzoombarenabled(boolean _zoombarenabled) throws Exception{
 //BA.debugLineNum = 9089;BA.debugLine="Public Sub setZoomBarEnabled(ZoomBarEnabled As Boo";
 //BA.debugLineNum = 9090;BA.debugLine="Zoom.Enabled = ZoomBarEnabled";
_zoom.Enabled /*boolean*/  = _zoombarenabled;
 //BA.debugLineNum = 9091;BA.debugLine="End Sub";
return "";
}
public String  _setzoomindexes(int _beginindex,int _endindex) throws Exception{
int _val = 0;
 //BA.debugLineNum = 8908;BA.debugLine="Public Sub SetZoomIndexes(BeginIndex As Int, EndIn";
 //BA.debugLineNum = 8909;BA.debugLine="Private Val As Int";
_val = 0;
 //BA.debugLineNum = 8911;BA.debugLine="If BeginIndex = Zoom.BeginIndex And EndIndex = Zo";
if (_beginindex==_zoom.BeginIndex /*int*/  && _endindex==_zoom.EndIndex /*int*/ ) { 
 //BA.debugLineNum = 8912;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 8915;BA.debugLine="If Zoom.EndIndex = 0 Then";
if (_zoom.EndIndex /*int*/ ==0) { 
 //BA.debugLineNum = 8916;BA.debugLine="BeginIndex = Max(BeginIndex, 0)";
_beginindex = (int) (__c.Max(_beginindex,0));
 //BA.debugLineNum = 8917;BA.debugLine="EndIndex = Min(EndIndex, Points.Size - 1)";
_endindex = (int) (__c.Min(_endindex,_points.getSize()-1));
 }else {
 };
 //BA.debugLineNum = 8923;BA.debugLine="If EndIndex - BeginIndex > Points.Size - 1 Then";
if (_endindex-_beginindex>_points.getSize()-1) { 
 //BA.debugLineNum = 8924;BA.debugLine="BeginIndex = 0";
_beginindex = (int) (0);
 //BA.debugLineNum = 8925;BA.debugLine="EndIndex = Points.Size - 1";
_endindex = (int) (_points.getSize()-1);
 };
 //BA.debugLineNum = 8928;BA.debugLine="If BeginIndex > EndIndex Then";
if (_beginindex>_endindex) { 
 //BA.debugLineNum = 8929;BA.debugLine="Val = EndIndex";
_val = _endindex;
 //BA.debugLineNum = 8930;BA.debugLine="EndIndex = BeginIndex";
_endindex = _beginindex;
 //BA.debugLineNum = 8931;BA.debugLine="BeginIndex = Val";
_beginindex = _val;
 };
 //BA.debugLineNum = 8934;BA.debugLine="Zoom.BeginIndex = Max(0, BeginIndex)";
_zoom.BeginIndex /*int*/  = (int) (__c.Max(0,_beginindex));
 //BA.debugLineNum = 8935;BA.debugLine="Zoom.BeginIndex = Min(Zoom.BeginIndex, Points.Siz";
_zoom.BeginIndex /*int*/  = (int) (__c.Min(_zoom.BeginIndex /*int*/ ,_points.getSize()-2));
 //BA.debugLineNum = 8937;BA.debugLine="Zoom.EndIndex = Min(Points.Size - 1, EndIndex)";
_zoom.EndIndex /*int*/  = (int) (__c.Min(_points.getSize()-1,_endindex));
 //BA.debugLineNum = 8938;BA.debugLine="Zoom.NbVisiblePoints = EndIndex - BeginIndex + 1";
_zoom.NbVisiblePoints /*int*/  = (int) (_endindex-_beginindex+1);
 //BA.debugLineNum = 8940;BA.debugLine="If Zoom.NbVisiblePoints > Points.Size Then";
if (_zoom.NbVisiblePoints /*int*/ >_points.getSize()) { 
 //BA.debugLineNum = 8941;BA.debugLine="UnZoom";
_unzoom();
 }else if(_zoom.EndIndex /*int*/ >_points.getSize()-1) { 
 //BA.debugLineNum = 8943;BA.debugLine="Zoom.EndIndex = Points.Size - 1";
_zoom.EndIndex /*int*/  = (int) (_points.getSize()-1);
 //BA.debugLineNum = 8944;BA.debugLine="Zoom.BeginIndex = Zoom.EndIndex - Zoom.NbVisible";
_zoom.BeginIndex /*int*/  = (int) (_zoom.EndIndex /*int*/ -_zoom.NbVisiblePoints /*int*/ +1);
 };
 //BA.debugLineNum = 8947;BA.debugLine="If Zoom.NbVisiblePoints = Points.Size Then";
if (_zoom.NbVisiblePoints /*int*/ ==_points.getSize()) { 
 //BA.debugLineNum = 8948;BA.debugLine="Zoom.Active = False";
_zoom.Active /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 8950;BA.debugLine="Zoom.Active = True";
_zoom.Active /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 8953;BA.debugLine="If Zoom.Active = True Then";
if (_zoom.Active /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 8954;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 8955;BA.debugLine="If xpnlZoomBar.Visible = False Then";
if (_xpnlzoombar.getVisible()==__c.False) { 
 //BA.debugLineNum = 8956;BA.debugLine="xpnlGraph.Width = mBase.Width - Zoom.BarWidth";
_xpnlgraph.setWidth((int) (_mbase.getWidth()-_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 8957;BA.debugLine="xpnlCursor.Width = mBase.Width - Zoom.BarWidth";
_xpnlcursor.setWidth((int) (_mbase.getWidth()-_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 8958;BA.debugLine="xcvsGraph.Resize(xpnlGraph.Width, mBase.Height";
_xcvsgraph.Resize((float) (_xpnlgraph.getWidth()),(float) (_mbase.getHeight()));
 //BA.debugLineNum = 8959;BA.debugLine="xcvsCursor.Resize(xpnlCursor.Width, mBase.Heig";
_xcvscursor.Resize((float) (_xpnlcursor.getWidth()),(float) (_mbase.getHeight()));
 };
 //BA.debugLineNum = 8962;BA.debugLine="xpnlZoomBar.Visible = True";
_xpnlzoombar.setVisible(__c.True);
 //BA.debugLineNum = 8963;BA.debugLine="Zoom.CursorLength = Max(15dip, (xpnlZoomBar.Hei";
_zoom.CursorLength /*int*/  = (int) (__c.Max(__c.DipToCurrent((int) (15)),(_xpnlzoombar.getHeight()-2*_zoom.ButtonLength /*int*/ )/(double)_points.getSize()*_zoom.NbVisiblePoints /*int*/ ));
 }else {
 //BA.debugLineNum = 8965;BA.debugLine="If xpnlZoomBar.Visible = False Then";
if (_xpnlzoombar.getVisible()==__c.False) { 
 //BA.debugLineNum = 8966;BA.debugLine="xpnlGraph.Height = mBase.Height - xpnlZoomBar.";
_xpnlgraph.setHeight((int) (_mbase.getHeight()-_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 8967;BA.debugLine="xpnlCursor.Height = mBase.Height - xpnlZoomBar";
_xpnlcursor.setHeight((int) (_mbase.getHeight()-_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 8968;BA.debugLine="xcvsGraph.Resize(mBase.Width, xpnlGraph.Height";
_xcvsgraph.Resize((float) (_mbase.getWidth()),(float) (_xpnlgraph.getHeight()));
 //BA.debugLineNum = 8969;BA.debugLine="xcvsCursor.Resize(mBase.Width, xpnlGraph.Heigh";
_xcvscursor.Resize((float) (_mbase.getWidth()),(float) (_xpnlgraph.getHeight()));
 };
 //BA.debugLineNum = 8972;BA.debugLine="xpnlZoomBar.Visible = True";
_xpnlzoombar.setVisible(__c.True);
 //BA.debugLineNum = 8973;BA.debugLine="Zoom.CursorLength = Max(15dip, (xpnlZoomBar.Wid";
_zoom.CursorLength /*int*/  = (int) (__c.Max(__c.DipToCurrent((int) (15)),(_xpnlzoombar.getWidth()-2*_zoom.ButtonLength /*int*/ )/(double)_points.getSize()*_zoom.NbVisiblePoints /*int*/ ));
 };
 //BA.debugLineNum = 8975;BA.debugLine="ZoomCursorDraw";
_zoomcursordraw();
 //BA.debugLineNum = 8976;BA.debugLine="Zoom.BigStep = Zoom.NbVisiblePoints";
_zoom.BigStep /*int*/  = _zoom.NbVisiblePoints /*int*/ ;
 }else {
 //BA.debugLineNum = 8978;BA.debugLine="xpnlZoomBar.Visible = False";
_xpnlzoombar.setVisible(__c.False);
 };
 //BA.debugLineNum = 8980;BA.debugLine="End Sub";
return "";
}
public String  _setzoomsteps(int _smallstep,int _bigstep) throws Exception{
 //BA.debugLineNum = 9047;BA.debugLine="Public Sub SetZoomSteps(SmallStep As Int, BigStep";
 //BA.debugLineNum = 9048;BA.debugLine="Zoom.SmallStep = SmallStep";
_zoom.SmallStep /*int*/  = _smallstep;
 //BA.debugLineNum = 9049;BA.debugLine="Zoom.BigStep = BigStep";
_zoom.BigStep /*int*/  = _bigstep;
 //BA.debugLineNum = 9050;BA.debugLine="End Sub";
return "";
}
public String  _unzoom() throws Exception{
 //BA.debugLineNum = 8983;BA.debugLine="Public Sub UnZoom";
 //BA.debugLineNum = 8984;BA.debugLine="Zoom.NbVisiblePoints = Points.Size";
_zoom.NbVisiblePoints /*int*/  = _points.getSize();
 //BA.debugLineNum = 8985;BA.debugLine="Zoom.BeginIndex = 0";
_zoom.BeginIndex /*int*/  = (int) (0);
 //BA.debugLineNum = 8986;BA.debugLine="Zoom.EndIndex = Points.Size - 1";
_zoom.EndIndex /*int*/  = (int) (_points.getSize()-1);
 //BA.debugLineNum = 8987;BA.debugLine="Zoom.Active = False";
_zoom.Active /*boolean*/  = __c.False;
 //BA.debugLineNum = 8989;BA.debugLine="xpnlZoomBar.Visible = False";
_xpnlzoombar.setVisible(__c.False);
 //BA.debugLineNum = 8990;BA.debugLine="xpnlGraph.Height = mBase.Height";
_xpnlgraph.setHeight(_mbase.getHeight());
 //BA.debugLineNum = 8991;BA.debugLine="xpnlCursor.Height = mBase.Height";
_xpnlcursor.setHeight(_mbase.getHeight());
 //BA.debugLineNum = 8992;BA.debugLine="xcvsGraph.Resize(mBase.Width, mBase.Height)";
_xcvsgraph.Resize((float) (_mbase.getWidth()),(float) (_mbase.getHeight()));
 //BA.debugLineNum = 8993;BA.debugLine="xcvsCursor.Resize(mBase.Width, mBase.Height)";
_xcvscursor.Resize((float) (_mbase.getWidth()),(float) (_mbase.getHeight()));
 //BA.debugLineNum = 8995;BA.debugLine="If Points.Size > 0 Then";
if (_points.getSize()>0) { 
 //BA.debugLineNum = 8996;BA.debugLine="DrawChart";
_drawchart();
 };
 //BA.debugLineNum = 8998;BA.debugLine="End Sub";
return "";
}
public String  _xpnlcursor_touch(int _action,float _x,float _y) throws Exception{
double _pointx = 0;
double _pointy = 0;
double _logval = 0;
int _pointindex = 0;
 //BA.debugLineNum = 465;BA.debugLine="Private Sub xpnlCursor_Touch (Action As Int, X As";
 //BA.debugLineNum = 466;BA.debugLine="If Action = xpnlCursor.TOUCH_ACTION_MOVE_NOTOUCH";
if (_action==_xpnlcursor.TOUCH_ACTION_MOVE_NOTOUCH) { 
 //BA.debugLineNum = 467;BA.debugLine="If Values.Show = True And Values.ShowOnHover = T";
if (_values.Show /*boolean*/ ==__c.True && _values.ShowOnHover /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 468;BA.debugLine="If X > Graph.Left And X < Graph.Right And Y > G";
if (_x>_graph.Left /*int*/  && _x<_graph.Right /*int*/  && _y>_graph.Top /*int*/  && _y<_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 469;BA.debugLine="DrawItemValues(X, Y)";
_drawitemvalues((int) (_x),(int) (_y));
 //BA.debugLineNum = 470;BA.debugLine="xpnlValues.Visible = True";
_xpnlvalues.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 472;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 473;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 };
 };
 };
 //BA.debugLineNum = 478;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Then";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 479;BA.debugLine="If (Action = 0 Or Action = 2) And X >= Graph.Lef";
if ((_action==0 || _action==2) && _x>=_graph.Left /*int*/  && _x<=_graph.Right /*int*/  && _y>=_graph.Top /*int*/ +_myxchartcrosshairdeltay && _y<=_graph.Bottom /*int*/ +_myxchartcrosshairdeltay) { 
 //BA.debugLineNum = 480;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Touc";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Touch",(int) (2))) { 
 //BA.debugLineNum = 481;BA.debugLine="Private PointX, PointY, LogVal As Double";
_pointx = 0;
_pointy = 0;
_logval = 0;
 //BA.debugLineNum = 482;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 483;BA.debugLine="PointX = Scale(sX).MinVal + (X - Graph.Left)";
_pointx = _scale[_sx].MinVal /*double*/ +(_x-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 485;BA.debugLine="LogVal = (X - Graph.Left) / ScaleLog(sX).Scal";
_logval = (_x-_graph.Left /*int*/ )/(double)_scalelog[_sx].Scale /*double*/ +_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ ;
 //BA.debugLineNum = 486;BA.debugLine="PointX = Power(10, LogVal)";
_pointx = __c.Power(10,_logval);
 };
 //BA.debugLineNum = 489;BA.debugLine="If Scale(sY(0)).Logarithmic = False Then";
if (_scale[_sy[(int) (0)]].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 490;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 491;BA.debugLine="PointY = Scale(sY(0)).MaxVal - (Y - Graph.To";
_pointy = _scale[_sy[(int) (0)]].MaxVal /*double*/ -(_y-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 493;BA.debugLine="PointY = Scale(sY(0)).MinVal + (Y - Graph.To";
_pointy = _scale[_sy[(int) (0)]].MinVal /*double*/ +(_y-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 };
 }else {
 //BA.debugLineNum = 496;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 497;BA.debugLine="LogVal = ScaleLog(sY(0)).MantMax + ScaleLog(";
_logval = _scalelog[_sy[(int) (0)]].MantMax /*int*/ +_scalelog[_sy[(int) (0)]].LogMax /*double*/ -(_y-_graph.Top /*int*/ )/(double)_scalelog[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 499;BA.debugLine="LogVal = ScaleLog(sY(0)).MantMin - ScaleLog(";
_logval = _scalelog[_sy[(int) (0)]].MantMin /*int*/ -_scalelog[_sy[(int) (0)]].LogMin /*double*/ +(_y-_graph.Top /*int*/ )/(double)_scalelog[_sy[(int) (0)]].Scale /*double*/ ;
 };
 //BA.debugLineNum = 501;BA.debugLine="PointY = Power(10, LogVal)";
_pointy = __c.Power(10,_logval);
 };
 //BA.debugLineNum = 503;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Touc";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Touch",(Object)(_pointx),(Object)(_pointy));
 };
 //BA.debugLineNum = 506;BA.debugLine="If Scale(sY(0)).Different = False And (mYXChart";
if (_scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.False && (_myxchartdisplayvalues==__c.True || _myxchartdisplaycrosshair==__c.True)) { 
 //BA.debugLineNum = 507;BA.debugLine="xpnlValues.Visible = Values.Show";
_xpnlvalues.setVisible(_values.Show /*boolean*/ );
 //BA.debugLineNum = 508;BA.debugLine="If Values.Show = True Or Values.ShowCursor = T";
if (_values.Show /*boolean*/ ==__c.True || _values.ShowCursor /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 509;BA.debugLine="DrawYXChartValues(X, Y - mYXChartCrossHairDel";
_drawyxchartvalues(_x,(float) (_y-_myxchartcrosshairdeltay));
 };
 };
 }else if(_action==_xpnlcursor.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 513;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayV";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("CURSOR")) { 
 //BA.debugLineNum = 514;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 };
 //BA.debugLineNum = 516;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayV";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("VALUES")) { 
 //BA.debugLineNum = 517;BA.debugLine="xcvsCursor.ClearRect(xcvsCursor.TargetRect)";
_xcvscursor.ClearRect(_xcvscursor.getTargetRect());
 //BA.debugLineNum = 518;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 };
 }else if((_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 522;BA.debugLine="If (Action = 0 Or Action = 2) And X >= Graph.Lef";
if ((_action==0 || _action==2) && _x>=_graph.Left /*int*/  && _x<=_graph.Right /*int*/  && _y>=_graph.Top /*int*/ +_myxchartcrosshairdeltay && _y<=_graph.Bottom /*int*/ +_myxchartcrosshairdeltay) { 
 //BA.debugLineNum = 523;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Touc";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Touch",(int) (2))) { 
 //BA.debugLineNum = 524;BA.debugLine="Private PointX, PointY As Double";
_pointx = 0;
_pointy = 0;
 //BA.debugLineNum = 525;BA.debugLine="PointX = Scale(sX).MinVal + (X - Graph.Left) /";
_pointx = _scale[_sx].MinVal /*double*/ +(_x-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ ;
 //BA.debugLineNum = 526;BA.debugLine="If Scale(sY(0)).ReverseYScale = False Then";
if (_scale[_sy[(int) (0)]].ReverseYScale /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 527;BA.debugLine="PointY = Scale(sY(0)).MaxVal - (Y - Graph.Top";
_pointy = _scale[_sy[(int) (0)]].MaxVal /*double*/ -(_y-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 }else {
 //BA.debugLineNum = 529;BA.debugLine="PointY = Scale(sY(0)).MinVal + (Y - Graph.Top";
_pointy = _scale[_sy[(int) (0)]].MinVal /*double*/ +(_y-_graph.Top /*int*/ )/(double)_scale[_sy[(int) (0)]].Scale /*double*/ ;
 };
 //BA.debugLineNum = 531;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Touc";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Touch",(Object)(_pointx),(Object)(_pointy));
 };
 //BA.debugLineNum = 534;BA.debugLine="If Scale(sY(0)).Different = False And (mYXChart";
if (_scale[_sy[(int) (0)]].Different /*boolean*/ ==__c.False && (_myxchartdisplayvalues==__c.True || _myxchartdisplaycrosshair==__c.True)) { 
 //BA.debugLineNum = 535;BA.debugLine="xpnlValues.Visible = Values.Show";
_xpnlvalues.setVisible(_values.Show /*boolean*/ );
 //BA.debugLineNum = 536;BA.debugLine="If Values.Show = True Or Values.ShowCursor = T";
if (_values.Show /*boolean*/ ==__c.True || _values.ShowCursor /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 537;BA.debugLine="DrawBubbleValues(X, Y - mYXChartCrossHairDelt";
_drawbubblevalues(_x,(float) (_y-_myxchartcrosshairdeltay));
 };
 };
 }else if(_action==_xpnlcursor.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 541;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayV";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("CURSOR")) { 
 //BA.debugLineNum = 542;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 };
 //BA.debugLineNum = 544;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayV";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("VALUES")) { 
 //BA.debugLineNum = 545;BA.debugLine="xcvsCursor.ClearRect(xcvsCursor.TargetRect)";
_xcvscursor.ClearRect(_xcvscursor.getTargetRect());
 //BA.debugLineNum = 546;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 };
 };
 //BA.debugLineNum = 551;BA.debugLine="If Graph.ChartType = \"PIE\" Or Graph.ChartType = \"";
if ((_graph.ChartType /*String*/ ).equals("PIE") || (_graph.ChartType /*String*/ ).equals("YX_CHART") || (_graph.ChartType /*String*/ ).equals("BUBBLE")) { 
 //BA.debugLineNum = 553;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 556;BA.debugLine="Private PointIndex As Int";
_pointindex = 0;
 //BA.debugLineNum = 557;BA.debugLine="PointIndex = GetCursorIndex(X, Y)";
_pointindex = _getcursorindex(_x,_y);
 //BA.debugLineNum = 559;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Cursor";
if (_xui.SubExists(ba,_mcallback,_meventname+"_CursorTouch",(int) (2))) { 
 //BA.debugLineNum = 560;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Cursor";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_CursorTouch",(Object)(_action),(Object)(_pointindex));
 };
 //BA.debugLineNum = 563;BA.debugLine="If Values.Show = False Then	'does not display the";
if (_values.Show /*boolean*/ ==__c.False) { 
 };
 //BA.debugLineNum = 567;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_xpnlcursor.TOUCH_ACTION_DOWN,_xpnlcursor.TOUCH_ACTION_UP,_xpnlcursor.TOUCH_ACTION_MOVE)) {
case 0: {
 //BA.debugLineNum = 569;BA.debugLine="If Graph.ChartType = \"RADAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("RADAR")) { 
 //BA.debugLineNum = 570;BA.debugLine="DrawItemValues(X, Y)";
_drawitemvalues((int) (_x),(int) (_y));
 //BA.debugLineNum = 571;BA.debugLine="If xpnlGraph.Width >= Graph.Right + 10dip + xp";
if (_xpnlgraph.getWidth()>=_graph.Right /*int*/ +__c.DipToCurrent((int) (10))+_xpnlvalues.getWidth()) { 
 //BA.debugLineNum = 572;BA.debugLine="xpnlValues.Left = Graph.Right + 5dip";
_xpnlvalues.setLeft((int) (_graph.Right /*int*/ +__c.DipToCurrent((int) (5))));
 }else {
 //BA.debugLineNum = 574;BA.debugLine="If x > Graph.CenterX Then";
if (_x>_graph.CenterX /*int*/ ) { 
 //BA.debugLineNum = 575;BA.debugLine="xpnlValues.Left = 5dip";
_xpnlvalues.setLeft(__c.DipToCurrent((int) (5)));
 }else {
 //BA.debugLineNum = 577;BA.debugLine="xpnlValues.Left = xpnlGraph.Width - xpnlValu";
_xpnlvalues.setLeft((int) (_xpnlgraph.getWidth()-_xpnlvalues.getWidth()-__c.DipToCurrent((int) (5))));
 };
 };
 //BA.debugLineNum = 580;BA.debugLine="xpnlValues.Visible = Values.Show";
_xpnlvalues.setVisible(_values.Show /*boolean*/ );
 }else {
 //BA.debugLineNum = 582;BA.debugLine="If X > Graph.Left And X < Graph.Right And Y >";
if (_x>_graph.Left /*int*/  && _x<_graph.Right /*int*/  && _y>_graph.Top /*int*/  && _y<_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 583;BA.debugLine="xpnlValues.Visible = Values.Show";
_xpnlvalues.setVisible(_values.Show /*boolean*/ );
 //BA.debugLineNum = 584;BA.debugLine="DrawItemValues(X, Y)";
_drawitemvalues((int) (_x),(int) (_y));
 //BA.debugLineNum = 585;BA.debugLine="If X > Graph.Left And X < Graph.Left + Graph.";
if (_x>_graph.Left /*int*/  && _x<_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2 && ((_legend.IncludeLegend /*String*/ ).equals("NONE") || (_legend.IncludeLegend /*String*/ ).equals("BOTTOM"))) { 
 //BA.debugLineNum = 586;BA.debugLine="xpnlValues.Left = Graph.Right - xpnlValues.W";
_xpnlvalues.setLeft((int) (_graph.Right /*int*/ -_xpnlvalues.getWidth()-__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 588;BA.debugLine="xpnlValues.Left = Graph.Left + 2dip";
_xpnlvalues.setLeft((int) (_graph.Left /*int*/ +__c.DipToCurrent((int) (2))));
 };
 };
 };
 break; }
case 1: {
 //BA.debugLineNum = 593;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayV";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("CURSOR")) { 
 //BA.debugLineNum = 594;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 };
 //BA.debugLineNum = 596;BA.debugLine="If mKeepDisplayValues = \"NONE\" Or mKeepDisplayV";
if ((_mkeepdisplayvalues).equals("NONE") || (_mkeepdisplayvalues).equals("VALUES")) { 
 //BA.debugLineNum = 597;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 598;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 break; }
case 2: {
 //BA.debugLineNum = 605;BA.debugLine="If Graph.ChartType = \"RADAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("RADAR")) { 
 //BA.debugLineNum = 606;BA.debugLine="DrawItemValues(X, Y)";
_drawitemvalues((int) (_x),(int) (_y));
 //BA.debugLineNum = 607;BA.debugLine="If xpnlGraph.Width >= Graph.Right + 10dip + xp";
if (_xpnlgraph.getWidth()>=_graph.Right /*int*/ +__c.DipToCurrent((int) (10))+_xpnlvalues.getWidth()) { 
 //BA.debugLineNum = 608;BA.debugLine="xpnlValues.Left = Graph.Right + 5dip";
_xpnlvalues.setLeft((int) (_graph.Right /*int*/ +__c.DipToCurrent((int) (5))));
 }else {
 //BA.debugLineNum = 610;BA.debugLine="If x > Graph.CenterX Then";
if (_x>_graph.CenterX /*int*/ ) { 
 //BA.debugLineNum = 611;BA.debugLine="xpnlValues.Left = 5dip";
_xpnlvalues.setLeft(__c.DipToCurrent((int) (5)));
 }else {
 //BA.debugLineNum = 613;BA.debugLine="xpnlValues.Left = xpnlGraph.Width - xpnlValu";
_xpnlvalues.setLeft((int) (_xpnlgraph.getWidth()-_xpnlvalues.getWidth()-__c.DipToCurrent((int) (5))));
 };
 };
 //BA.debugLineNum = 616;BA.debugLine="If xpnlValues.Visible = False Then";
if (_xpnlvalues.getVisible()==__c.False) { 
 //BA.debugLineNum = 617;BA.debugLine="xpnlValues.Visible = True";
_xpnlvalues.setVisible(__c.True);
 };
 }else {
 //BA.debugLineNum = 620;BA.debugLine="If X > Graph.Left And X < Graph.Right And Y >";
if (_x>_graph.Left /*int*/  && _x<_graph.Right /*int*/  && _y>_graph.Top /*int*/  && _y<_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 621;BA.debugLine="If xpnlValues.Visible = False Then";
if (_xpnlvalues.getVisible()==__c.False) { 
 //BA.debugLineNum = 622;BA.debugLine="xpnlValues.Visible = Values.Show";
_xpnlvalues.setVisible(_values.Show /*boolean*/ );
 };
 //BA.debugLineNum = 624;BA.debugLine="DrawItemValues(X, Y)";
_drawitemvalues((int) (_x),(int) (_y));
 //BA.debugLineNum = 625;BA.debugLine="If X > Graph.Left And X < Graph.Left + Graph.";
if (_x>_graph.Left /*int*/  && _x<_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2 && ((_legend.IncludeLegend /*String*/ ).equals("NONE") || (_legend.IncludeLegend /*String*/ ).equals("BOTTOM"))) { 
 //BA.debugLineNum = 626;BA.debugLine="xpnlValues.Left = Graph.Right - xpnlValues.W";
_xpnlvalues.setLeft((int) (_graph.Right /*int*/ -_xpnlvalues.getWidth()-__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 628;BA.debugLine="xpnlValues.Left = Graph.Left + 2dip";
_xpnlvalues.setLeft((int) (_graph.Left /*int*/ +__c.DipToCurrent((int) (2))));
 };
 };
 };
 break; }
}
;
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return "";
}
public String  _xpnlzoombar_touch(int _action,float _x,float _y) throws Exception{
int _indexbegin = 0;
int _l = 0;
int _w = 0;
boolean _zoomevent = false;
 //BA.debugLineNum = 635;BA.debugLine="Private Sub xpnlZoomBar_Touch (Action As Int, X As";
 //BA.debugLineNum = 636;BA.debugLine="Private IndexBegin, L, W As Int";
_indexbegin = 0;
_l = 0;
_w = 0;
 //BA.debugLineNum = 637;BA.debugLine="Private ZoomEvent As Boolean";
_zoomevent = false;
 //BA.debugLineNum = 639;BA.debugLine="If Action = 100 Or Zoom.Enabled = False Then";
if (_action==100 || _zoom.Enabled /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 640;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 643;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 644;BA.debugLine="L = Y";
_l = (int) (_y);
 //BA.debugLineNum = 645;BA.debugLine="W = X";
_w = (int) (_x);
 }else {
 //BA.debugLineNum = 647;BA.debugLine="L = X";
_l = (int) (_x);
 //BA.debugLineNum = 648;BA.debugLine="W = Y";
_w = (int) (_y);
 };
 //BA.debugLineNum = 651;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_xpnlcursor.TOUCH_ACTION_DOWN,_xpnlcursor.TOUCH_ACTION_MOVE,_xpnlcursor.TOUCH_ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 654;BA.debugLine="If W > 0 And W < Zoom.BarWidth Then";
if (_w>0 && _w<_zoom.BarWidth /*int*/ ) { 
 //BA.debugLineNum = 655;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 657;BA.debugLine="ZoomEvent = False";
_zoomevent = __c.False;
 //BA.debugLineNum = 658;BA.debugLine="If L > 0 And L < Zoom.ButtonLength Then";
if (_l>0 && _l<_zoom.ButtonLength /*int*/ ) { 
 //BA.debugLineNum = 659;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Zo";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ZoomLeftButtonClick",(int) (0))) { 
 //BA.debugLineNum = 660;BA.debugLine="ZoomEvent = True";
_zoomevent = __c.True;
 //BA.debugLineNum = 661;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Zoo";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_ZoomLeftButtonClick");
 }else {
 //BA.debugLineNum = 663;BA.debugLine="IndexBegin = Max(0, Zoom.BeginIndex - Zoom.S";
_indexbegin = (int) (__c.Max(0,_zoom.BeginIndex /*int*/ -_zoom.SmallStep /*int*/ ));
 //BA.debugLineNum = 664;BA.debugLine="Zoom.EndIndex = Zoom.BeginIndex + Zoom.NbVis";
_zoom.EndIndex /*int*/  = (int) (_zoom.BeginIndex /*int*/ +_zoom.NbVisiblePoints /*int*/ -1);
 };
 }else if(_l>_zoom.BarLength /*int*/ -_zoom.ButtonLength /*int*/  && _l<_zoom.BarLength /*int*/ ) { 
 //BA.debugLineNum = 667;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Zo";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ZoomLeftAreaClick",(int) (0))) { 
 //BA.debugLineNum = 668;BA.debugLine="ZoomEvent = True";
_zoomevent = __c.True;
 //BA.debugLineNum = 669;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Zoo";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_ZoomLeftAreaClick");
 }else {
 //BA.debugLineNum = 671;BA.debugLine="Zoom.EndIndex = Min(Zoom.EndIndex + Zoom.Sma";
_zoom.EndIndex /*int*/  = (int) (__c.Min(_zoom.EndIndex /*int*/ +_zoom.SmallStep /*int*/ ,_points.getSize()-1));
 //BA.debugLineNum = 672;BA.debugLine="IndexBegin = Zoom.EndIndex - Zoom.NbVisibleP";
_indexbegin = (int) (_zoom.EndIndex /*int*/ -_zoom.NbVisiblePoints /*int*/ +1);
 };
 }else if(_l>_zoom.ButtonLength /*int*/  && _l<_zoom.CursorBegin /*int*/ ) { 
 //BA.debugLineNum = 675;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Zo";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ZoomRightButtonClick",(int) (0))) { 
 //BA.debugLineNum = 676;BA.debugLine="ZoomEvent = True";
_zoomevent = __c.True;
 //BA.debugLineNum = 677;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Zoo";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_ZoomRightButtonClick");
 }else {
 //BA.debugLineNum = 679;BA.debugLine="IndexBegin = Max(0, Zoom.BeginIndex - Zoom.B";
_indexbegin = (int) (__c.Max(0,_zoom.BeginIndex /*int*/ -_zoom.BigStep /*int*/ ));
 //BA.debugLineNum = 680;BA.debugLine="Zoom.EndIndex = Zoom.BeginIndex + Zoom.NbVis";
_zoom.EndIndex /*int*/  = (int) (_zoom.BeginIndex /*int*/ +_zoom.NbVisiblePoints /*int*/ -1);
 };
 }else if(_l>_zoom.CursorBegin /*int*/ +_zoom.CursorLength /*int*/  && _l<_zoom.BarLength /*int*/ -_zoom.ButtonLength /*int*/ ) { 
 //BA.debugLineNum = 683;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Zo";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ZoomRightAreaClick",(int) (0))) { 
 //BA.debugLineNum = 684;BA.debugLine="ZoomEvent = True";
_zoomevent = __c.True;
 //BA.debugLineNum = 685;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Zoo";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_ZoomRightAreaClick");
 }else {
 //BA.debugLineNum = 687;BA.debugLine="Zoom.EndIndex = Min(Points.Size - 1, Zoom.En";
_zoom.EndIndex /*int*/  = (int) (__c.Min(_points.getSize()-1,_zoom.EndIndex /*int*/ +_zoom.BigStep /*int*/ ));
 //BA.debugLineNum = 688;BA.debugLine="IndexBegin = Zoom.EndIndex - Zoom.NbVisibleP";
_indexbegin = (int) (_zoom.EndIndex /*int*/ -_zoom.NbVisiblePoints /*int*/ +1);
 };
 }else {
 //BA.debugLineNum = 691;BA.debugLine="IndexBegin = Zoom.BeginIndex";
_indexbegin = _zoom.BeginIndex /*int*/ ;
 //BA.debugLineNum = 692;BA.debugLine="Zoom.Move = True";
_zoom.Move /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 694;BA.debugLine="If ZoomEvent = False Then";
if (_zoomevent==__c.False) { 
 //BA.debugLineNum = 695;BA.debugLine="Zoom.Cursor0 = L";
_zoom.Cursor0 /*int*/  = _l;
 //BA.debugLineNum = 696;BA.debugLine="Zoom.CursorBegin0 = Zoom.CursorBegin";
_zoom.CursorBegin0 /*int*/  = _zoom.CursorBegin /*int*/ ;
 //BA.debugLineNum = 697;BA.debugLine="Zoom.CursorOn = True";
_zoom.CursorOn /*boolean*/  = __c.True;
 //BA.debugLineNum = 699;BA.debugLine="If IndexBegin <> Zoom.BeginIndex Then";
if (_indexbegin!=_zoom.BeginIndex /*int*/ ) { 
 //BA.debugLineNum = 700;BA.debugLine="Zoom.BeginIndex = IndexBegin";
_zoom.BeginIndex /*int*/  = _indexbegin;
 //BA.debugLineNum = 701;BA.debugLine="Zoom.EndIndex = Zoom.BeginIndex + Zoom.NbVis";
_zoom.EndIndex /*int*/  = (int) (_zoom.BeginIndex /*int*/ +_zoom.NbVisiblePoints /*int*/ -1);
 //BA.debugLineNum = 702;BA.debugLine="DrawChart";
_drawchart();
 //BA.debugLineNum = 703;BA.debugLine="ZoomCursorDraw";
_zoomcursordraw();
 };
 };
 };
 break; }
case 1: {
 //BA.debugLineNum = 708;BA.debugLine="If Zoom.CursorOn = True And Zoom.Move = True Th";
if (_zoom.CursorOn /*boolean*/ ==__c.True && _zoom.Move /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 709;BA.debugLine="Zoom.CursorBegin = Min(Zoom.CursorBegin0 + L -";
_zoom.CursorBegin /*int*/  = (int) (__c.Min(_zoom.CursorBegin0 /*int*/ +_l-_zoom.Cursor0 /*int*/ ,_zoom.BarLength /*int*/ -_zoom.ButtonLength /*int*/ -_zoom.CursorLength /*int*/ +10));
 //BA.debugLineNum = 710;BA.debugLine="Zoom.CursorBegin = Max(Zoom.CursorBegin, Zoom.";
_zoom.CursorBegin /*int*/  = (int) (__c.Max(_zoom.CursorBegin /*int*/ ,_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 712;BA.debugLine="IndexBegin = (Zoom.CursorBegin - Zoom.ButtonLe";
_indexbegin = (int) ((_zoom.CursorBegin /*int*/ -_zoom.ButtonLength /*int*/ )/(double)(_zoom.BarLength /*int*/ -2*_zoom.ButtonLength /*int*/ -_zoom.CursorLength /*int*/ )*(_points.getSize()-_zoom.NbVisiblePoints /*int*/ +1)+0.5);
 //BA.debugLineNum = 713;BA.debugLine="IndexBegin = Min(IndexBegin, Points.Size - Zoo";
_indexbegin = (int) (__c.Min(_indexbegin,_points.getSize()-_zoom.NbVisiblePoints /*int*/ ));
 //BA.debugLineNum = 714;BA.debugLine="If IndexBegin <> Zoom.BeginIndex Then";
if (_indexbegin!=_zoom.BeginIndex /*int*/ ) { 
 //BA.debugLineNum = 715;BA.debugLine="Zoom.BeginIndex = IndexBegin";
_zoom.BeginIndex /*int*/  = _indexbegin;
 //BA.debugLineNum = 716;BA.debugLine="Zoom.EndIndex = Zoom.BeginIndex + Zoom.NbVisi";
_zoom.EndIndex /*int*/  = (int) (_zoom.BeginIndex /*int*/ +_zoom.NbVisiblePoints /*int*/ -1);
 //BA.debugLineNum = 717;BA.debugLine="DrawChart";
_drawchart();
 //BA.debugLineNum = 718;BA.debugLine="ZoomCursorDraw";
_zoomcursordraw();
 };
 };
 break; }
case 2: {
 //BA.debugLineNum = 722;BA.debugLine="Zoom.CursorOn = False";
_zoom.CursorOn /*boolean*/  = __c.False;
 //BA.debugLineNum = 723;BA.debugLine="Zoom.Move = False";
_zoom.Move /*boolean*/  = __c.False;
 break; }
}
;
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return "";
}
public String  _zoombarinit() throws Exception{
 //BA.debugLineNum = 897;BA.debugLine="Private Sub ZoomBarInit";
 //BA.debugLineNum = 898;BA.debugLine="Zoom.Enabled = True";
_zoom.Enabled /*boolean*/  = __c.True;
 //BA.debugLineNum = 899;BA.debugLine="Zoom.ColorBar = xui.Color_RGB(196, 196, 196)";
_zoom.ColorBar /*int*/  = _xui.Color_RGB((int) (196),(int) (196),(int) (196));
 //BA.debugLineNum = 900;BA.debugLine="Zoom.ColorButton = xui.Color_RGB(240, 240, 240)";
_zoom.ColorButton /*int*/  = _xui.Color_RGB((int) (240),(int) (240),(int) (240));
 //BA.debugLineNum = 901;BA.debugLine="Zoom.ColorButtonFrame = xui.Color_RGB(148, 148, 1";
_zoom.ColorButtonFrame /*int*/  = _xui.Color_RGB((int) (148),(int) (148),(int) (148));
 //BA.debugLineNum = 903;BA.debugLine="Zoom.BarWidth = 16dip";
_zoom.BarWidth /*int*/  = __c.DipToCurrent((int) (16));
 //BA.debugLineNum = 904;BA.debugLine="Zoom.ButtonLength = 18dip";
_zoom.ButtonLength /*int*/  = __c.DipToCurrent((int) (18));
 //BA.debugLineNum = 905;BA.debugLine="Zoom.CornerRadius = 2dip";
_zoom.CornerRadius /*int*/  = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 906;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 907;BA.debugLine="xpnlZoomBar.Left = mBase.Width - Zoom.BarWidth";
_xpnlzoombar.setLeft((int) (_mbase.getWidth()-_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 908;BA.debugLine="xpnlZoomBar.Top = 0";
_xpnlzoombar.setTop((int) (0));
 //BA.debugLineNum = 909;BA.debugLine="xpnlZoomBar.Width = Zoom.BarWidth";
_xpnlzoombar.setWidth(_zoom.BarWidth /*int*/ );
 //BA.debugLineNum = 910;BA.debugLine="xpnlZoomBar.Height = mBase.Height";
_xpnlzoombar.setHeight(_mbase.getHeight());
 //BA.debugLineNum = 911;BA.debugLine="Zoom.BarLength = mBase.Height";
_zoom.BarLength /*int*/  = _mbase.getHeight();
 }else {
 //BA.debugLineNum = 913;BA.debugLine="xpnlZoomBar.Left = 0";
_xpnlzoombar.setLeft((int) (0));
 //BA.debugLineNum = 914;BA.debugLine="xpnlZoomBar.Top = mBase.Height - Zoom.BarWidth";
_xpnlzoombar.setTop((int) (_mbase.getHeight()-_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 915;BA.debugLine="xpnlZoomBar.Height = Zoom.BarWidth";
_xpnlzoombar.setHeight(_zoom.BarWidth /*int*/ );
 //BA.debugLineNum = 916;BA.debugLine="xpnlZoomBar.Width = mBase.Width";
_xpnlzoombar.setWidth(_mbase.getWidth());
 //BA.debugLineNum = 917;BA.debugLine="Zoom.BarLength = mBase.Width";
_zoom.BarLength /*int*/  = _mbase.getWidth();
 };
 //BA.debugLineNum = 919;BA.debugLine="xcvsZoomBar.Initialize(xpnlZoomBar)";
_xcvszoombar.Initialize(_xpnlzoombar);
 //BA.debugLineNum = 920;BA.debugLine="xpnlZoomBar.Visible = False";
_xpnlzoombar.setVisible(__c.False);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return "";
}
public String  _zoombarresize() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _pth = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
int _x0 = 0;
int _y0 = 0;
 //BA.debugLineNum = 924;BA.debugLine="Private Sub ZoomBarResize";
 //BA.debugLineNum = 925;BA.debugLine="Private pth As B4XPath";
_pth = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 926;BA.debugLine="Private rect As B4XRect";
_rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 927;BA.debugLine="Private x0, y0 As Int";
_x0 = 0;
_y0 = 0;
 //BA.debugLineNum = 929;BA.debugLine="xcvsZoomBar.ClearRect(xcvsZoomBar.TargetRect)";
_xcvszoombar.ClearRect(_xcvszoombar.getTargetRect());
 //BA.debugLineNum = 931;BA.debugLine="rect.Initialize(0, 0, xpnlZoomBar.Width, xpnlZoom";
_rect.Initialize((float) (0),(float) (0),(float) (_xpnlzoombar.getWidth()),(float) (_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 932;BA.debugLine="xcvsZoomBar.DrawRect(rect, Zoom.ColorBar, True, 1";
_xcvszoombar.DrawRect(_rect,_zoom.ColorBar /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 934;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 935;BA.debugLine="Zoom.BarLength = mBase.Height	'needed for B4i, I";
_zoom.BarLength /*int*/  = _mbase.getHeight();
 //BA.debugLineNum = 936;BA.debugLine="Private rect As B4XRect";
_rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 937;BA.debugLine="rect.Initialize(0, 0, Zoom.BarWidth, Zoom.Button";
_rect.Initialize((float) (0),(float) (0),(float) (_zoom.BarWidth /*int*/ ),(float) (_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 938;BA.debugLine="pth.InitializeRoundedRect(rect, Zoom.CornerRadiu";
_pth.InitializeRoundedRect(_rect,(float) (_zoom.CornerRadius /*int*/ ));
 //BA.debugLineNum = 939;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButton, True";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButton /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 940;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 942;BA.debugLine="pth.Initialize(0.5 * xpnlZoomBar.Width, 0.37 * Z";
_pth.Initialize((float) (0.5*_xpnlzoombar.getWidth()),(float) (0.37*_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 943;BA.debugLine="pth.LineTo(0.23 * xpnlZoomBar.Width, 0.62 * Zoom";
_pth.LineTo((float) (0.23*_xpnlzoombar.getWidth()),(float) (0.62*_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 944;BA.debugLine="pth.LineTo(0.77 * xpnlZoomBar.Width, 0.62 * Zoom";
_pth.LineTo((float) (0.77*_xpnlzoombar.getWidth()),(float) (0.62*_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 945;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 947;BA.debugLine="y0 = xpnlZoomBar.Height - Zoom.ButtonLength";
_y0 = (int) (_xpnlzoombar.getHeight()-_zoom.ButtonLength /*int*/ );
 //BA.debugLineNum = 948;BA.debugLine="rect.Initialize(0, y0, Zoom.BarWidth, xpnlZoomBa";
_rect.Initialize((float) (0),(float) (_y0),(float) (_zoom.BarWidth /*int*/ ),(float) (_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 949;BA.debugLine="y0 = Zoom.BarLength - Zoom.ButtonLength";
_y0 = (int) (_zoom.BarLength /*int*/ -_zoom.ButtonLength /*int*/ );
 //BA.debugLineNum = 950;BA.debugLine="rect.Initialize(0, y0, Zoom.BarWidth, Zoom.BarLe";
_rect.Initialize((float) (0),(float) (_y0),(float) (_zoom.BarWidth /*int*/ ),(float) (_zoom.BarLength /*int*/ ));
 //BA.debugLineNum = 951;BA.debugLine="pth.InitializeRoundedRect(rect, Zoom.CornerRadiu";
_pth.InitializeRoundedRect(_rect,(float) (_zoom.CornerRadius /*int*/ ));
 //BA.debugLineNum = 952;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButton, True";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButton /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 953;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 954;BA.debugLine="pth.Initialize(0.23 * Zoom.BarWidth, y0 + 0.38 *";
_pth.Initialize((float) (0.23*_zoom.BarWidth /*int*/ ),(float) (_y0+0.38*_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 955;BA.debugLine="pth.LineTo(0.5 * Zoom.BarWidth, y0 + 0.62 * Zoom";
_pth.LineTo((float) (0.5*_zoom.BarWidth /*int*/ ),(float) (_y0+0.62*_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 956;BA.debugLine="pth.LineTo(0.77 * Zoom.BarWidth, y0 + 0.38 * Zoo";
_pth.LineTo((float) (0.77*_zoom.BarWidth /*int*/ ),(float) (_y0+0.38*_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 957;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 959;BA.debugLine="rect.Initialize(0, 0, Zoom.ButtonLength, Zoom.Ba";
_rect.Initialize((float) (0),(float) (0),(float) (_zoom.ButtonLength /*int*/ ),(float) (_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 960;BA.debugLine="pth.InitializeRoundedRect(rect, Zoom.CornerRadiu";
_pth.InitializeRoundedRect(_rect,(float) (_zoom.CornerRadius /*int*/ ));
 //BA.debugLineNum = 961;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButton, True";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButton /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 962;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 964;BA.debugLine="pth.Initialize(0.37 * Zoom.ButtonLength, 0.5 * Z";
_pth.Initialize((float) (0.37*_zoom.ButtonLength /*int*/ ),(float) (0.5*_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 965;BA.debugLine="pth.LineTo(0.62 * Zoom.ButtonLength, 0.23 * Zoom";
_pth.LineTo((float) (0.62*_zoom.ButtonLength /*int*/ ),(float) (0.23*_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 966;BA.debugLine="pth.LineTo(0.62 * Zoom.ButtonLength, 0.77 * Zoom";
_pth.LineTo((float) (0.62*_zoom.ButtonLength /*int*/ ),(float) (0.77*_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 967;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 969;BA.debugLine="x0 = xpnlZoomBar.Width - Zoom.ButtonLength";
_x0 = (int) (_xpnlzoombar.getWidth()-_zoom.ButtonLength /*int*/ );
 //BA.debugLineNum = 970;BA.debugLine="rect.Initialize(x0, 0, xpnlZoomBar.Width, xpnlZo";
_rect.Initialize((float) (_x0),(float) (0),(float) (_xpnlzoombar.getWidth()),(float) (_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 971;BA.debugLine="pth.InitializeRoundedRect(rect, Zoom.CornerRadiu";
_pth.InitializeRoundedRect(_rect,(float) (_zoom.CornerRadius /*int*/ ));
 //BA.debugLineNum = 972;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButton, True";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButton /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 973;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 974;BA.debugLine="pth.Initialize(x0 + 0.38 * Zoom.ButtonLength, 0.";
_pth.Initialize((float) (_x0+0.38*_zoom.ButtonLength /*int*/ ),(float) (0.23*_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 975;BA.debugLine="pth.LineTo(x0 + 0.62 * Zoom.ButtonLength, 0.5 *";
_pth.LineTo((float) (_x0+0.62*_zoom.ButtonLength /*int*/ ),(float) (0.5*_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 976;BA.debugLine="pth.LineTo(x0 + 0.38 * Zoom.ButtonLength, 0.77 *";
_pth.LineTo((float) (_x0+0.38*_zoom.ButtonLength /*int*/ ),(float) (0.77*_zoom.BarWidth /*int*/ ));
 //BA.debugLineNum = 977;BA.debugLine="xcvsZoomBar.DrawPath(pth, Zoom.ColorButtonFrame,";
_xcvszoombar.DrawPath(_pth,_zoom.ColorButtonFrame /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 979;BA.debugLine="xcvsZoomBar.Invalidate";
_xcvszoombar.Invalidate();
 //BA.debugLineNum = 980;BA.debugLine="End Sub";
return "";
}
public String  _zoomcursordraw() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rectcursor = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rectbar = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _pthcursor = null;
 //BA.debugLineNum = 6863;BA.debugLine="Private Sub ZoomCursorDraw";
 //BA.debugLineNum = 6864;BA.debugLine="Private rectCursor, rectBar As B4XRect";
_rectcursor = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rectbar = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 6865;BA.debugLine="Private pthCursor As B4XPath";
_pthcursor = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 6867;BA.debugLine="If Graph.ChartType.CharAt(0) = \"H\" Then";
if (_graph.ChartType /*String*/ .charAt((int) (0))==BA.ObjectToChar("H")) { 
 //BA.debugLineNum = 6868;BA.debugLine="rectBar.Initialize(0, Zoom.ButtonLength, Zoom.Ba";
_rectbar.Initialize((float) (0),(float) (_zoom.ButtonLength /*int*/ ),(float) (_zoom.BarWidth /*int*/ ),(float) (_zoom.BarLength /*int*/ -_zoom.ButtonLength /*int*/ ));
 //BA.debugLineNum = 6869;BA.debugLine="xcvsZoomBar.DrawRect(rectBar, Zoom.ColorBar, Tru";
_xcvszoombar.DrawRect(_rectbar,_zoom.ColorBar /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6871;BA.debugLine="Zoom.CursorBegin = (xpnlZoomBar.Height - 2 * Zoo";
_zoom.CursorBegin /*int*/  = (int) ((_xpnlzoombar.getHeight()-2*_zoom.ButtonLength /*int*/ -_zoom.CursorLength /*int*/ )/(double)(_points.getSize()-_zoom.NbVisiblePoints /*int*/ )*_zoom.BeginIndex /*int*/ +_zoom.ButtonLength /*int*/ );
 //BA.debugLineNum = 6872;BA.debugLine="rectCursor.Initialize(0, Zoom.CursorBegin, Zoom.";
_rectcursor.Initialize((float) (0),(float) (_zoom.CursorBegin /*int*/ ),(float) (_zoom.BarWidth /*int*/ ),(float) (_zoom.CursorBegin /*int*/ +_zoom.CursorLength /*int*/ ));
 //BA.debugLineNum = 6873;BA.debugLine="pthCursor.InitializeRoundedRect(rectCursor, Zoom";
_pthcursor.InitializeRoundedRect(_rectcursor,(float) (_zoom.CornerRadius /*int*/ ));
 //BA.debugLineNum = 6874;BA.debugLine="xcvsZoomBar.DrawPath(pthCursor, Zoom.ColorButton";
_xcvszoombar.DrawPath(_pthcursor,_zoom.ColorButton /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6875;BA.debugLine="xcvsZoomBar.DrawPath(pthCursor, Zoom.ColorButton";
_xcvszoombar.DrawPath(_pthcursor,_zoom.ColorButtonFrame /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 6877;BA.debugLine="rectBar.Initialize(Zoom.ButtonLength, 0, Zoom.Ba";
_rectbar.Initialize((float) (_zoom.ButtonLength /*int*/ ),(float) (0),(float) (_zoom.BarLength /*int*/ -_zoom.ButtonLength /*int*/ ),(float) (_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 6878;BA.debugLine="xcvsZoomBar.DrawRect(rectBar, Zoom.ColorBar, Tru";
_xcvszoombar.DrawRect(_rectbar,_zoom.ColorBar /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6880;BA.debugLine="Zoom.CursorBegin = (Zoom.BarLength - 2 * Zoom.Bu";
_zoom.CursorBegin /*int*/  = (int) ((_zoom.BarLength /*int*/ -2*_zoom.ButtonLength /*int*/ -_zoom.CursorLength /*int*/ )/(double)(_points.getSize()-_zoom.NbVisiblePoints /*int*/ )*_zoom.BeginIndex /*int*/ +_zoom.ButtonLength /*int*/ );
 //BA.debugLineNum = 6881;BA.debugLine="rectCursor.Initialize(Zoom.CursorBegin, 0, Zoom.";
_rectcursor.Initialize((float) (_zoom.CursorBegin /*int*/ ),(float) (0),(float) (_zoom.CursorBegin /*int*/ +_zoom.CursorLength /*int*/ ),(float) (_xpnlzoombar.getHeight()));
 //BA.debugLineNum = 6882;BA.debugLine="pthCursor.InitializeRoundedRect(rectCursor, 3dip";
_pthcursor.InitializeRoundedRect(_rectcursor,(float) (__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 6883;BA.debugLine="xcvsZoomBar.DrawPath(pthCursor, Zoom.ColorButton";
_xcvszoombar.DrawPath(_pthcursor,_zoom.ColorButton /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 6884;BA.debugLine="xcvsZoomBar.DrawPath(pthCursor, Zoom.ColorButton";
_xcvszoombar.DrawPath(_pthcursor,_zoom.ColorButtonFrame /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 6887;BA.debugLine="xcvsZoomBar.Invalidate";
_xcvszoombar.Invalidate();
 //BA.debugLineNum = 6888;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
