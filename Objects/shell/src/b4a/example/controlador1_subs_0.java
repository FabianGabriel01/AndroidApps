package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class controlador1_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,139);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 139;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 142;BA.debugLine="Activity.LoadLayout(\"Controlador1\")";
Debug.ShouldStop(8192);
controlador1.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Controlador1")),controlador1.mostCurrent.activityBA);
 BA.debugLineNum = 145;BA.debugLine="isPanelVisibleConfig = False";
Debug.ShouldStop(65536);
controlador1._ispanelvisibleconfig = controlador1.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 146;BA.debugLine="isPanelVisibleCreations = False";
Debug.ShouldStop(131072);
controlador1._ispanelvisiblecreations = controlador1.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 148;BA.debugLine="EditTextIP.Initialize(\"IP\")";
Debug.ShouldStop(524288);
controlador1.mostCurrent._edittextip.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("IP")));
 BA.debugLineNum = 149;BA.debugLine="EditTextPort.Initialize(\"PORT\")";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._edittextport.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PORT")));
 BA.debugLineNum = 150;BA.debugLine="ConnectPLC.Initialize(\"ConnectPLC\")";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._connectplc.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ConnectPLC")));
 BA.debugLineNum = 153;BA.debugLine="btnConfig.Initialize(\"btnConfig\")";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._btnconfig.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnConfig")));
 BA.debugLineNum = 154;BA.debugLine="btnConfig.Text = \"C\"";
Debug.ShouldStop(33554432);
controlador1.mostCurrent._btnconfig.runMethod(true,"setText",BA.ObjectToCharSequence("C"));
 BA.debugLineNum = 155;BA.debugLine="btnConfig.Width = 50dip ' 5x5 in dp";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._btnconfig.runMethod(true,"setWidth",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 156;BA.debugLine="btnConfig.Height = 50dip";
Debug.ShouldStop(134217728);
controlador1.mostCurrent._btnconfig.runMethod(true,"setHeight",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 157;BA.debugLine="btnConfig.Color = Colors.Red ' Set button color";
Debug.ShouldStop(268435456);
controlador1.mostCurrent._btnconfig.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 158;BA.debugLine="Activity.AddView(btnConfig, 0, 0, btnConfig.Width";
Debug.ShouldStop(536870912);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btnconfig.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(controlador1.mostCurrent._btnconfig.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._btnconfig.runMethod(true,"getHeight")));
 BA.debugLineNum = 161;BA.debugLine="pnlSlidingConfig.Initialize(\"\")";
Debug.ShouldStop(1);
controlador1.mostCurrent._pnlslidingconfig.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 162;BA.debugLine="pnlSlidingConfig.Color = Colors.LightGray";
Debug.ShouldStop(2);
controlador1.mostCurrent._pnlslidingconfig.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 163;BA.debugLine="pnlSlidingConfig.Width = 100%x";
Debug.ShouldStop(4);
controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"setWidth",controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),controlador1.mostCurrent.activityBA));
 BA.debugLineNum = 164;BA.debugLine="pnlSlidingConfig.Height = 250dip";
Debug.ShouldStop(8);
controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"setHeight",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))));
 BA.debugLineNum = 165;BA.debugLine="pnlSlidingConfig.Left = -pnlSlidingConfig.Width '";
Debug.ShouldStop(16);
controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"getWidth").<Integer>get().intValue())));
 BA.debugLineNum = 166;BA.debugLine="Activity.AddView(pnlSlidingConfig, pnlSlidingConf";
Debug.ShouldStop(32);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._pnlslidingconfig.getObject())),(Object)(controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, 0)),(Object)(controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"getHeight")));
 BA.debugLineNum = 171;BA.debugLine="EditTextIP.Hint = \"Dirección IP\"";
Debug.ShouldStop(1024);
controlador1.mostCurrent._edittextip.runMethod(true,"setHint",BA.ObjectToString("Dirección IP"));
 BA.debugLineNum = 172;BA.debugLine="EditTextIP.HintColor = Colors.Black";
Debug.ShouldStop(2048);
controlador1.mostCurrent._edittextip.runMethod(true,"setHintColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 173;BA.debugLine="EditTextIP.InputType = EditTextIP.INPUT_TYPE_TEXT";
Debug.ShouldStop(4096);
controlador1.mostCurrent._edittextip.runMethod(true,"setInputType",controlador1.mostCurrent._edittextip.getField(true,"INPUT_TYPE_TEXT"));
 BA.debugLineNum = 174;BA.debugLine="pnlSlidingConfig.AddView(EditTextIP, 10%x, 5%y, 8";
Debug.ShouldStop(8192);
controlador1.mostCurrent._pnlslidingconfig.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._edittextip.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 176;BA.debugLine="EditTextPort.Hint = \"PUERTO\"";
Debug.ShouldStop(32768);
controlador1.mostCurrent._edittextport.runMethod(true,"setHint",BA.ObjectToString("PUERTO"));
 BA.debugLineNum = 177;BA.debugLine="EditTextPort.HintColor = Colors.Black";
Debug.ShouldStop(65536);
controlador1.mostCurrent._edittextport.runMethod(true,"setHintColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 178;BA.debugLine="EditTextPort.InputType = EditTextPort.INPUT_TYPE_";
Debug.ShouldStop(131072);
controlador1.mostCurrent._edittextport.runMethod(true,"setInputType",controlador1.mostCurrent._edittextport.getField(true,"INPUT_TYPE_TEXT"));
 BA.debugLineNum = 179;BA.debugLine="pnlSlidingConfig.AddView(EditTextPort, 10%x, 13%y";
Debug.ShouldStop(262144);
controlador1.mostCurrent._pnlslidingconfig.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._edittextport.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 13)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 181;BA.debugLine="ConnectPLC.Text = \"Conectar\"";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._connectplc.runMethod(true,"setText",BA.ObjectToCharSequence("Conectar"));
 BA.debugLineNum = 182;BA.debugLine="pnlSlidingConfig.AddView(ConnectPLC, 10%x, 23%y,";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._pnlslidingconfig.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._connectplc.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 23)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 186;BA.debugLine="btnCreations.Initialize(\"btnCreations\")";
Debug.ShouldStop(33554432);
controlador1.mostCurrent._btncreations.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnCreations")));
 BA.debugLineNum = 187;BA.debugLine="btnCreations.Text = \"+\"";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._btncreations.runMethod(true,"setText",BA.ObjectToCharSequence("+"));
 BA.debugLineNum = 188;BA.debugLine="btnCreations.Width = 50dip ' 5x5 in dp";
Debug.ShouldStop(134217728);
controlador1.mostCurrent._btncreations.runMethod(true,"setWidth",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 189;BA.debugLine="btnCreations.Height = 50dip";
Debug.ShouldStop(268435456);
controlador1.mostCurrent._btncreations.runMethod(true,"setHeight",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 190;BA.debugLine="btnCreations.Color = Colors.Blue ' Set button col";
Debug.ShouldStop(536870912);
controlador1.mostCurrent._btncreations.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 191;BA.debugLine="Activity.AddView(btnCreations, 0, 8%y, btnCreatio";
Debug.ShouldStop(1073741824);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btncreations.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent._btncreations.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._btncreations.runMethod(true,"getHeight")));
 BA.debugLineNum = 194;BA.debugLine="pnlSlidingCreations.Initialize(\"\")";
Debug.ShouldStop(2);
controlador1.mostCurrent._pnlslidingcreations.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 195;BA.debugLine="pnlSlidingCreations.Color = Colors.LightGray";
Debug.ShouldStop(4);
controlador1.mostCurrent._pnlslidingcreations.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 196;BA.debugLine="pnlSlidingCreations.Width = 100%x";
Debug.ShouldStop(8);
controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"setWidth",controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),controlador1.mostCurrent.activityBA));
 BA.debugLineNum = 197;BA.debugLine="pnlSlidingCreations.Height = 250dip";
Debug.ShouldStop(16);
controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"setHeight",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))));
 BA.debugLineNum = 198;BA.debugLine="pnlSlidingCreations.Left = -pnlSlidingCreations.W";
Debug.ShouldStop(32);
controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"getWidth").<Integer>get().intValue())));
 BA.debugLineNum = 199;BA.debugLine="Activity.AddView(pnlSlidingCreations, pnlSlidingC";
Debug.ShouldStop(64);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._pnlslidingcreations.getObject())),(Object)(controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, 0)),(Object)(controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"getHeight")));
 BA.debugLineNum = 201;BA.debugLine="LabelCreations.Initialize(\"\")";
Debug.ShouldStop(256);
controlador1.mostCurrent._labelcreations.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 202;BA.debugLine="LabelCreations.Text = \"Maximo 2 Vistas por Acción";
Debug.ShouldStop(512);
controlador1.mostCurrent._labelcreations.runMethod(true,"setText",BA.ObjectToCharSequence("Maximo 2 Vistas por Acción, 8 vistas en total"));
 BA.debugLineNum = 203;BA.debugLine="pnlSlidingCreations.AddView(LabelCreations, 15%x,";
Debug.ShouldStop(1024);
controlador1.mostCurrent._pnlslidingcreations.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._labelcreations.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 205;BA.debugLine="btnLeerHR.Initialize(\"LeerHR\")";
Debug.ShouldStop(4096);
controlador1.mostCurrent._btnleerhr.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("LeerHR")));
 BA.debugLineNum = 206;BA.debugLine="btnLeerHR.Text = \"Leer Holding Registers\"";
Debug.ShouldStop(8192);
controlador1.mostCurrent._btnleerhr.runMethod(true,"setText",BA.ObjectToCharSequence("Leer Holding Registers"));
 BA.debugLineNum = 207;BA.debugLine="pnlSlidingCreations.AddView(btnLeerHR, 10%x, 4%y,";
Debug.ShouldStop(16384);
controlador1.mostCurrent._pnlslidingcreations.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btnleerhr.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 209;BA.debugLine="btnEscribirHR.Initialize(\"EscribirHR\")";
Debug.ShouldStop(65536);
controlador1.mostCurrent._btnescribirhr.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("EscribirHR")));
 BA.debugLineNum = 210;BA.debugLine="btnEscribirHR.Text = \"Escribir Holding Registers\"";
Debug.ShouldStop(131072);
controlador1.mostCurrent._btnescribirhr.runMethod(true,"setText",BA.ObjectToCharSequence("Escribir Holding Registers"));
 BA.debugLineNum = 211;BA.debugLine="pnlSlidingCreations.AddView(btnEscribirHR, 10%x,";
Debug.ShouldStop(262144);
controlador1.mostCurrent._pnlslidingcreations.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btnescribirhr.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 213;BA.debugLine="btnONOFF.Initialize(\"ONOFF\")";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._btnonoff.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ONOFF")));
 BA.debugLineNum = 214;BA.debugLine="btnONOFF.Text = \"BOTON ON OFF\"";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._btnonoff.runMethod(true,"setText",BA.ObjectToCharSequence("BOTON ON OFF"));
 BA.debugLineNum = 215;BA.debugLine="pnlSlidingCreations.AddView(btnONOFF, 10%x, 16%y,";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._pnlslidingcreations.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btnonoff.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 16)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 217;BA.debugLine="btnHOLD.Initialize(\"HOLD\")";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._btnhold.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HOLD")));
 BA.debugLineNum = 218;BA.debugLine="btnHOLD.Text = \"BOTON HOLD\"";
Debug.ShouldStop(33554432);
controlador1.mostCurrent._btnhold.runMethod(true,"setText",BA.ObjectToCharSequence("BOTON HOLD"));
 BA.debugLineNum = 219;BA.debugLine="pnlSlidingCreations.AddView(btnHOLD, 10%x, 22%y,";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._pnlslidingcreations.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btnhold.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 22)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),controlador1.mostCurrent.activityBA)),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 225;BA.debugLine="PanelLeer1.Initialize(\"PanelLeer1\")";
Debug.ShouldStop(1);
controlador1.mostCurrent._panelleer1.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelLeer1")));
 BA.debugLineNum = 226;BA.debugLine="PanelLeer1.Color = Colors.Cyan";
Debug.ShouldStop(2);
controlador1.mostCurrent._panelleer1.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 227;BA.debugLine="PanelLeer1.Enabled = False";
Debug.ShouldStop(4);
controlador1.mostCurrent._panelleer1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 228;BA.debugLine="PanelLeer1.Visible = False";
Debug.ShouldStop(8);
controlador1.mostCurrent._panelleer1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 229;BA.debugLine="Direccion1.Initialize(\"Direccion1\")";
Debug.ShouldStop(16);
controlador1.mostCurrent._direccion1.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion1")));
 BA.debugLineNum = 230;BA.debugLine="Direccion1.Hint = \"# Reg a Leer\"";
Debug.ShouldStop(32);
controlador1.mostCurrent._direccion1.runMethod(true,"setHint",BA.ObjectToString("# Reg a Leer"));
 BA.debugLineNum = 231;BA.debugLine="Direccion1Res.Initialize(\"Direccion1Res\")";
Debug.ShouldStop(64);
controlador1.mostCurrent._direccion1res.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion1Res")));
 BA.debugLineNum = 232;BA.debugLine="Direccion1Res.Hint = \"              Valor\"";
Debug.ShouldStop(128);
controlador1.mostCurrent._direccion1res.runMethod(true,"setHint",BA.ObjectToString("              Valor"));
 BA.debugLineNum = 233;BA.debugLine="Direccion1Res.Enabled = False";
Debug.ShouldStop(256);
controlador1.mostCurrent._direccion1res.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 234;BA.debugLine="Activity.AddView(PanelLeer1, 100dip, 200dip, 200d";
Debug.ShouldStop(512);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelleer1.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 235;BA.debugLine="PanelLeer1.AddView(Direccion1, 0dip, 0dip, 190dip";
Debug.ShouldStop(1024);
controlador1.mostCurrent._panelleer1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion1.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 236;BA.debugLine="PanelLeer1.AddView(Direccion1Res, 0dip, 50dip, 19";
Debug.ShouldStop(2048);
controlador1.mostCurrent._panelleer1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion1res.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 238;BA.debugLine="PanelLeer2.Initialize(\"PanelLeer2\")";
Debug.ShouldStop(8192);
controlador1.mostCurrent._panelleer2.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelLeer2")));
 BA.debugLineNum = 239;BA.debugLine="PanelLeer2.Color = Colors.White";
Debug.ShouldStop(16384);
controlador1.mostCurrent._panelleer2.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 240;BA.debugLine="PanelLeer2.Enabled = False";
Debug.ShouldStop(32768);
controlador1.mostCurrent._panelleer2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 241;BA.debugLine="PanelLeer2.Visible = False";
Debug.ShouldStop(65536);
controlador1.mostCurrent._panelleer2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 242;BA.debugLine="Direccion2.Initialize(\"Direccion2\")";
Debug.ShouldStop(131072);
controlador1.mostCurrent._direccion2.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion2")));
 BA.debugLineNum = 243;BA.debugLine="Direccion2.Hint = \"# Reg a Leer\"";
Debug.ShouldStop(262144);
controlador1.mostCurrent._direccion2.runMethod(true,"setHint",BA.ObjectToString("# Reg a Leer"));
 BA.debugLineNum = 244;BA.debugLine="Direccion2Res.Initialize(\"Direccion2Res\")";
Debug.ShouldStop(524288);
controlador1.mostCurrent._direccion2res.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion2Res")));
 BA.debugLineNum = 245;BA.debugLine="Direccion2Res.Hint = \"              Valor\"";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._direccion2res.runMethod(true,"setHint",BA.ObjectToString("              Valor"));
 BA.debugLineNum = 246;BA.debugLine="Direccion2Res.Enabled = False";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._direccion2res.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 247;BA.debugLine="Activity.AddView(PanelLeer2, 10dip, 300dip, 200di";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelleer2.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 248;BA.debugLine="PanelLeer2.AddView(Direccion2, 0dip, 0dip, 190dip";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._panelleer2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion2.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 249;BA.debugLine="PanelLeer2.AddView(Direccion2Res, 0dip, 50dip, 19";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._panelleer2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion2res.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 253;BA.debugLine="PanelEscribir1.Initialize(\"PanelEscribir1\")";
Debug.ShouldStop(268435456);
controlador1.mostCurrent._panelescribir1.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelEscribir1")));
 BA.debugLineNum = 254;BA.debugLine="PanelEscribir1.Color = Colors.DarkGray";
Debug.ShouldStop(536870912);
controlador1.mostCurrent._panelescribir1.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 255;BA.debugLine="PanelEscribir1.Enabled = False";
Debug.ShouldStop(1073741824);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 256;BA.debugLine="PanelEscribir1.Visible = False";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 257;BA.debugLine="Direccion1Escribir.Initialize(\"Direccion1Escribir";
Debug.ShouldStop(1);
controlador1.mostCurrent._direccion1escribir.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion1Escribir")));
 BA.debugLineNum = 258;BA.debugLine="Direccion1Escribir.Hint = \"#Reg a Escribir\"";
Debug.ShouldStop(2);
controlador1.mostCurrent._direccion1escribir.runMethod(true,"setHint",BA.ObjectToString("#Reg a Escribir"));
 BA.debugLineNum = 259;BA.debugLine="Direccion1EscribirValor.Initialize(\"Direccion1Esc";
Debug.ShouldStop(4);
controlador1.mostCurrent._direccion1escribirvalor.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion1EscribirValor")));
 BA.debugLineNum = 260;BA.debugLine="Direccion1EscribirValor.Hint = \"Valor\"";
Debug.ShouldStop(8);
controlador1.mostCurrent._direccion1escribirvalor.runMethod(true,"setHint",BA.ObjectToString("Valor"));
 BA.debugLineNum = 261;BA.debugLine="Direccion1EscribirValor.HintColor = Colors.Cyan";
Debug.ShouldStop(16);
controlador1.mostCurrent._direccion1escribirvalor.runMethod(true,"setHintColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 262;BA.debugLine="Direccion1EscribirValor.TextColor = Colors.Cyan";
Debug.ShouldStop(32);
controlador1.mostCurrent._direccion1escribirvalor.runMethod(true,"setTextColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 263;BA.debugLine="Direccion1EscribirValor.Enabled = False";
Debug.ShouldStop(64);
controlador1.mostCurrent._direccion1escribirvalor.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 264;BA.debugLine="Direccion1EscribirBTN.Initialize(\"Direccion1Escri";
Debug.ShouldStop(128);
controlador1.mostCurrent._direccion1escribirbtn.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion1EscribirBTN")));
 BA.debugLineNum = 265;BA.debugLine="Direccion1EscribirBTN.Text = \"Mandar a Registro\"";
Debug.ShouldStop(256);
controlador1.mostCurrent._direccion1escribirbtn.runMethod(true,"setText",BA.ObjectToCharSequence("Mandar a Registro"));
 BA.debugLineNum = 266;BA.debugLine="Activity.AddView(PanelEscribir1, 100dip, 200dip,";
Debug.ShouldStop(512);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelescribir1.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))));
 BA.debugLineNum = 267;BA.debugLine="PanelEscribir1.AddView(Direccion1Escribir, 0dip,";
Debug.ShouldStop(1024);
controlador1.mostCurrent._panelescribir1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion1escribir.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 268;BA.debugLine="PanelEscribir1.AddView(Direccion1EscribirValor, 0";
Debug.ShouldStop(2048);
controlador1.mostCurrent._panelescribir1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion1escribirvalor.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 269;BA.debugLine="PanelEscribir1.AddView(Direccion1EscribirBTN, 0di";
Debug.ShouldStop(4096);
controlador1.mostCurrent._panelescribir1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion1escribirbtn.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 271;BA.debugLine="PanelEscribir2.Initialize(\"PanelEscribir2\")";
Debug.ShouldStop(16384);
controlador1.mostCurrent._panelescribir2.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelEscribir2")));
 BA.debugLineNum = 272;BA.debugLine="PanelEscribir2.Color = Colors.DarkGray";
Debug.ShouldStop(32768);
controlador1.mostCurrent._panelescribir2.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 273;BA.debugLine="PanelEscribir2.Enabled = False";
Debug.ShouldStop(65536);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 274;BA.debugLine="PanelEscribir2.Visible = False";
Debug.ShouldStop(131072);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 275;BA.debugLine="Direccion2Escribir.Initialize(\"Direccion2Escribir";
Debug.ShouldStop(262144);
controlador1.mostCurrent._direccion2escribir.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion2Escribir")));
 BA.debugLineNum = 276;BA.debugLine="Direccion2Escribir.Hint = \"#Reg a Escribir\"";
Debug.ShouldStop(524288);
controlador1.mostCurrent._direccion2escribir.runMethod(true,"setHint",BA.ObjectToString("#Reg a Escribir"));
 BA.debugLineNum = 277;BA.debugLine="Direccion2EscribirValor.Initialize(\"Direccion2Esc";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._direccion2escribirvalor.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion2EscribirValor")));
 BA.debugLineNum = 278;BA.debugLine="Direccion2EscribirValor.Hint = \"Valor\"";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._direccion2escribirvalor.runMethod(true,"setHint",BA.ObjectToString("Valor"));
 BA.debugLineNum = 279;BA.debugLine="Direccion2EscribirValor.Enabled = False";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._direccion2escribirvalor.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 280;BA.debugLine="Direccion2EscribirValor.HintColor = Colors.Cyan";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._direccion2escribirvalor.runMethod(true,"setHintColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 281;BA.debugLine="Direccion2EscribirValor.TextColor = Colors.Cyan";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._direccion2escribirvalor.runMethod(true,"setTextColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 282;BA.debugLine="Direccion2EscribirBTN.Initialize(\"Direccion2Escri";
Debug.ShouldStop(33554432);
controlador1.mostCurrent._direccion2escribirbtn.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion2EscribirBTN")));
 BA.debugLineNum = 283;BA.debugLine="Direccion2EscribirBTN.Text = \"Mandar a Registro\"";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._direccion2escribirbtn.runMethod(true,"setText",BA.ObjectToCharSequence("Mandar a Registro"));
 BA.debugLineNum = 284;BA.debugLine="Activity.AddView(PanelEscribir2, 100dip, 200dip,";
Debug.ShouldStop(134217728);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelescribir2.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))));
 BA.debugLineNum = 285;BA.debugLine="PanelEscribir2.AddView(Direccion2Escribir, 0dip,";
Debug.ShouldStop(268435456);
controlador1.mostCurrent._panelescribir2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion2escribir.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 286;BA.debugLine="PanelEscribir2.AddView(Direccion2EscribirValor, 0";
Debug.ShouldStop(536870912);
controlador1.mostCurrent._panelescribir2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion2escribirvalor.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 287;BA.debugLine="PanelEscribir2.AddView(Direccion2EscribirBTN, 0di";
Debug.ShouldStop(1073741824);
controlador1.mostCurrent._panelescribir2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion2escribirbtn.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 290;BA.debugLine="PanelOnOff1.Initialize(\"PanelOnOff1\")";
Debug.ShouldStop(2);
controlador1.mostCurrent._panelonoff1.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelOnOff1")));
 BA.debugLineNum = 291;BA.debugLine="PanelOnOff1.Color = Colors.LightGray";
Debug.ShouldStop(4);
controlador1.mostCurrent._panelonoff1.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 292;BA.debugLine="PanelOnOff1.Enabled = False";
Debug.ShouldStop(8);
controlador1.mostCurrent._panelonoff1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 293;BA.debugLine="PanelOnOff1.Visible = False";
Debug.ShouldStop(16);
controlador1.mostCurrent._panelonoff1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 294;BA.debugLine="Direccion1OnOff.Initialize(\"Direccion1OnOff\")";
Debug.ShouldStop(32);
controlador1.mostCurrent._direccion1onoff.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion1OnOff")));
 BA.debugLineNum = 295;BA.debugLine="Direccion1OnOff.Hint = \"#Reg On/OFF\"";
Debug.ShouldStop(64);
controlador1.mostCurrent._direccion1onoff.runMethod(true,"setHint",BA.ObjectToString("#Reg On/OFF"));
 BA.debugLineNum = 296;BA.debugLine="BTN1OnOff.Initialize(\"BTN1OnOff\")";
Debug.ShouldStop(128);
controlador1.mostCurrent._btn1onoff.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("BTN1OnOff")));
 BA.debugLineNum = 297;BA.debugLine="BTN1OnOff.Text = \"Encender/Apagar\"";
Debug.ShouldStop(256);
controlador1.mostCurrent._btn1onoff.runMethod(true,"setText",BA.ObjectToCharSequence("Encender/Apagar"));
 BA.debugLineNum = 298;BA.debugLine="Activity.AddView(PanelOnOff1, 100dip, 200dip, 200";
Debug.ShouldStop(512);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelonoff1.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 299;BA.debugLine="PanelOnOff1.AddView(Direccion1OnOff, 0dip, 0dip,";
Debug.ShouldStop(1024);
controlador1.mostCurrent._panelonoff1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion1onoff.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 300;BA.debugLine="PanelOnOff1.AddView(BTN1OnOff, 0dip, 50dip, 190di";
Debug.ShouldStop(2048);
controlador1.mostCurrent._panelonoff1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btn1onoff.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 302;BA.debugLine="PanelOnOff2.Initialize(\"PanelOnOff2\")";
Debug.ShouldStop(8192);
controlador1.mostCurrent._panelonoff2.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelOnOff2")));
 BA.debugLineNum = 303;BA.debugLine="PanelOnOff2.Color = Colors.LightGray";
Debug.ShouldStop(16384);
controlador1.mostCurrent._panelonoff2.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 304;BA.debugLine="PanelOnOff2.Enabled = False";
Debug.ShouldStop(32768);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 305;BA.debugLine="PanelOnOff2.Visible = False";
Debug.ShouldStop(65536);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 306;BA.debugLine="Direccion2OnOff.Initialize(\"Direccion2OnOff\")";
Debug.ShouldStop(131072);
controlador1.mostCurrent._direccion2onoff.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion2OnOff")));
 BA.debugLineNum = 307;BA.debugLine="Direccion2OnOff.Hint = \"#Reg On/OFF\"";
Debug.ShouldStop(262144);
controlador1.mostCurrent._direccion2onoff.runMethod(true,"setHint",BA.ObjectToString("#Reg On/OFF"));
 BA.debugLineNum = 308;BA.debugLine="BTN2OnOff.Initialize(\"BTN2OnOff\")";
Debug.ShouldStop(524288);
controlador1.mostCurrent._btn2onoff.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("BTN2OnOff")));
 BA.debugLineNum = 309;BA.debugLine="BTN2OnOff.Text = \"Encender/Apagar\"";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._btn2onoff.runMethod(true,"setText",BA.ObjectToCharSequence("Encender/Apagar"));
 BA.debugLineNum = 310;BA.debugLine="Activity.AddView(PanelOnOff2, 100dip, 200dip, 200";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelonoff2.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 311;BA.debugLine="PanelOnOff2.AddView(Direccion2OnOff, 0dip, 0dip,";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._panelonoff2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion2onoff.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 312;BA.debugLine="PanelOnOff2.AddView(BTN2OnOff, 0dip, 50dip, 190di";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._panelonoff2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btn2onoff.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 315;BA.debugLine="PanelHold1.Initialize(\"PanelHold1\")";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._panelhold1.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelHold1")));
 BA.debugLineNum = 316;BA.debugLine="PanelHold1.Color = Colors.Magenta";
Debug.ShouldStop(134217728);
controlador1.mostCurrent._panelhold1.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 317;BA.debugLine="PanelHold1.Enabled = False";
Debug.ShouldStop(268435456);
controlador1.mostCurrent._panelhold1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 318;BA.debugLine="PanelHold1.Visible = False";
Debug.ShouldStop(536870912);
controlador1.mostCurrent._panelhold1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 319;BA.debugLine="Direccion1Hold.Initialize(\"Direccion1Hold\")";
Debug.ShouldStop(1073741824);
controlador1.mostCurrent._direccion1hold.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion1Hold")));
 BA.debugLineNum = 320;BA.debugLine="Direccion1Hold.Hint = \"#Reg\"";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._direccion1hold.runMethod(true,"setHint",BA.ObjectToString("#Reg"));
 BA.debugLineNum = 321;BA.debugLine="BTN1Hold.Initialize(\"BTN1Hold\")";
Debug.ShouldStop(1);
controlador1.mostCurrent._btn1hold.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("BTN1Hold")));
 BA.debugLineNum = 322;BA.debugLine="BTN1Hold.Text = \"HOLD\"";
Debug.ShouldStop(2);
controlador1.mostCurrent._btn1hold.runMethod(true,"setText",BA.ObjectToCharSequence("HOLD"));
 BA.debugLineNum = 323;BA.debugLine="Activity.AddView(PanelHold1, 100dip, 200dip, 200d";
Debug.ShouldStop(4);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelhold1.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 324;BA.debugLine="PanelHold1.AddView(Direccion1Hold, 0dip, 0dip, 19";
Debug.ShouldStop(8);
controlador1.mostCurrent._panelhold1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion1hold.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 325;BA.debugLine="PanelHold1.AddView(BTN1Hold, 0dip, 50dip, 190dip,";
Debug.ShouldStop(16);
controlador1.mostCurrent._panelhold1.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btn1hold.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 328;BA.debugLine="PanelHold2.Initialize(\"PanelHold2\")";
Debug.ShouldStop(128);
controlador1.mostCurrent._panelhold2.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelHold2")));
 BA.debugLineNum = 329;BA.debugLine="PanelHold2.Color = Colors.Magenta";
Debug.ShouldStop(256);
controlador1.mostCurrent._panelhold2.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 330;BA.debugLine="PanelHold2.Enabled = False";
Debug.ShouldStop(512);
controlador1.mostCurrent._panelhold2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 331;BA.debugLine="PanelHold2.Visible = False";
Debug.ShouldStop(1024);
controlador1.mostCurrent._panelhold2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 332;BA.debugLine="Direccion2Hold.Initialize(\"Direccion2Hold\")";
Debug.ShouldStop(2048);
controlador1.mostCurrent._direccion2hold.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Direccion2Hold")));
 BA.debugLineNum = 333;BA.debugLine="Direccion2Hold.Hint = \"#Reg\"";
Debug.ShouldStop(4096);
controlador1.mostCurrent._direccion2hold.runMethod(true,"setHint",BA.ObjectToString("#Reg"));
 BA.debugLineNum = 334;BA.debugLine="BTN2Hold.Initialize(\"BTN2Hold\")";
Debug.ShouldStop(8192);
controlador1.mostCurrent._btn2hold.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("BTN2Hold")));
 BA.debugLineNum = 335;BA.debugLine="BTN2Hold.Text = \"HOLD\"";
Debug.ShouldStop(16384);
controlador1.mostCurrent._btn2hold.runMethod(true,"setText",BA.ObjectToCharSequence("HOLD"));
 BA.debugLineNum = 336;BA.debugLine="Activity.AddView(PanelHold2, 100dip, 200dip, 200d";
Debug.ShouldStop(32768);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._panelhold2.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 337;BA.debugLine="PanelHold2.AddView(Direccion2Hold, 0dip, 0dip, 19";
Debug.ShouldStop(65536);
controlador1.mostCurrent._panelhold2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._direccion2hold.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 338;BA.debugLine="PanelHold2.AddView(BTN2Hold, 0dip, 50dip, 190dip,";
Debug.ShouldStop(131072);
controlador1.mostCurrent._panelhold2.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._btn2hold.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 341;BA.debugLine="Graph.Initialize(\"Graph\")";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._graph.runVoidMethod ("Initialize",controlador1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Graph")));
 BA.debugLineNum = 342;BA.debugLine="Graph.Text = \"G\"";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._graph.runMethod(true,"setText",BA.ObjectToCharSequence("G"));
 BA.debugLineNum = 343;BA.debugLine="Graph.Width = 50dip ' 5x5 in dp";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._graph.runMethod(true,"setWidth",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 344;BA.debugLine="Graph.Height = 50dip";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._graph.runMethod(true,"setHeight",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 345;BA.debugLine="Graph.Color = Colors.White ' Set button color";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._graph.runVoidMethod ("setColor",controlador1.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 346;BA.debugLine="Activity.AddView(Graph, 87%x, 0, Graph.Width, Gra";
Debug.ShouldStop(33554432);
controlador1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((controlador1.mostCurrent._graph.getObject())),(Object)(controlador1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 87)),controlador1.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(controlador1.mostCurrent._graph.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._graph.runMethod(true,"getHeight")));
 BA.debugLineNum = 354;BA.debugLine="pnlSlideGraph.Left = pnlSlideGraph.Width + 50";
Debug.ShouldStop(2);
controlador1.mostCurrent._pnlslidegraph.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._pnlslidegraph.runMethod(true,"getWidth"),RemoteObject.createImmutable(50)}, "+",1, 1));
 BA.debugLineNum = 358;BA.debugLine="LineChart1.ClearData";
Debug.ShouldStop(32);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_cleardata" /*RemoteObject*/ );
 BA.debugLineNum = 360;BA.debugLine="LineChart1.Title = \"Temperatura\"";
Debug.ShouldStop(128);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_settitle" /*RemoteObject*/ ,BA.ObjectToString("Temperatura"));
 BA.debugLineNum = 361;BA.debugLine="LineChart1.XAxisName = \"Tiempo\"";
Debug.ShouldStop(256);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setxaxisname" /*RemoteObject*/ ,BA.ObjectToString("Tiempo"));
 BA.debugLineNum = 362;BA.debugLine="LineChart1.YAxisName = \"Values\"";
Debug.ShouldStop(512);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setyaxisname" /*RemoteObject*/ ,BA.ObjectToString("Values"));
 BA.debugLineNum = 364;BA.debugLine="LineChart1.IncludeLegend = True";
Debug.ShouldStop(2048);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setincludelegend" /*RemoteObject*/ ,BA.ObjectToString(controlador1.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 365;BA.debugLine="LineChart1.YScaleMaxValue = 1";
Debug.ShouldStop(4096);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setyscalemaxvalue" /*RemoteObject*/ ,BA.numberCast(double.class, 1));
 BA.debugLineNum = 366;BA.debugLine="LineChart1.YScaleMinValue = -1";
Debug.ShouldStop(8192);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setyscaleminvalue" /*RemoteObject*/ ,BA.numberCast(double.class, -(double) (0 + 1)));
 BA.debugLineNum = 367;BA.debugLine="LineChart1.IncludeLegend = \"BOTTOM\"";
Debug.ShouldStop(16384);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setincludelegend" /*RemoteObject*/ ,BA.ObjectToString("BOTTOM"));
 BA.debugLineNum = 368;BA.debugLine="LineChart1.AutomaticScale = True";
Debug.ShouldStop(32768);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setautomaticscale" /*RemoteObject*/ ,controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 371;BA.debugLine="LineChart1.XScaleTextOrientation = \"45 DEGREES\"";
Debug.ShouldStop(262144);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setxscaletextorientation" /*RemoteObject*/ ,BA.ObjectToString("45 DEGREES"));
 BA.debugLineNum = 375;BA.debugLine="LineChart1.AddLine(\"Temperatura\", 0) '0 = random";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_addline" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Temperatura")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 379;BA.debugLine="LineChart1.AddLinePointData(\"Tiempo\", 0, True)";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_addlinepointdata" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Tiempo")),(Object)(BA.numberCast(double.class, 0)),(Object)(controlador1.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 385;BA.debugLine="LineChart1.ZoomBarEnabled = True";
Debug.ShouldStop(1);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_setzoombarenabled" /*RemoteObject*/ ,controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 387;BA.debugLine="LineChart1.DrawChart";
Debug.ShouldStop(4);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_drawchart" /*RemoteObject*/ );
 BA.debugLineNum = 391;BA.debugLine="FirstTimeCreated";
Debug.ShouldStop(64);
_firsttimecreated();
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_KeyPress (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,658);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 658;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 659;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, controlador1.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 660;BA.debugLine="Log(\"BACK PRESSED\")";
Debug.ShouldStop(524288);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","21966082",RemoteObject.createImmutable("BACK PRESSED"),0);
 BA.debugLineNum = 661;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 662;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(2097152);
controlador1.mostCurrent.__c.runVoidMethod ("StartActivity",controlador1.processBA,(Object)((controlador1.mostCurrent._main.getObject())));
 };
 BA.debugLineNum = 664;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Pause (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,654);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 654;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 655;BA.debugLine="Timer1.Enabled = False ' Stop the timer when acti";
Debug.ShouldStop(16384);
controlador1._timer1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 656;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,650);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","activity_resume");}
 BA.debugLineNum = 650;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animationpanel(RemoteObject _fromx,RemoteObject _tox,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("AnimationPanel (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,642);
if (RapidSub.canDelegate("animationpanel")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","animationpanel", _fromx, _tox, _obj);}
RemoteObject _anim = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
Debug.locals.put("fromX", _fromx);
Debug.locals.put("toX", _tox);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 642;BA.debugLine="Sub AnimationPanel(fromX As Int, toX As Int, Obj A";
Debug.ShouldStop(2);
 BA.debugLineNum = 643;BA.debugLine="Dim anim As Animation";
Debug.ShouldStop(4);
_anim = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("anim", _anim);
 BA.debugLineNum = 644;BA.debugLine="anim.InitializeTranslate(\"SlideAnimation\", fromX,";
Debug.ShouldStop(8);
_anim.runVoidMethod ("InitializeTranslate",controlador1.mostCurrent.activityBA,(Object)(BA.ObjectToString("SlideAnimation")),(Object)(BA.numberCast(float.class, _fromx)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _tox)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 645;BA.debugLine="anim.Duration = 300 ' Animation duration in milli";
Debug.ShouldStop(16);
_anim.runMethod(true,"setDuration",BA.numberCast(long.class, 300));
 BA.debugLineNum = 646;BA.debugLine="anim.Start(Obj)";
Debug.ShouldStop(32);
_anim.runVoidMethod ("Start",(Object)((_obj.getObject())));
 BA.debugLineNum = 647;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfig_click() throws Exception{
try {
		Debug.PushSubsStack("btnConfig_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,600);
if (RapidSub.canDelegate("btnconfig_click")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","btnconfig_click");}
 BA.debugLineNum = 600;BA.debugLine="Sub btnConfig_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 601;BA.debugLine="Log(\"Boton Configuration\")";
Debug.ShouldStop(16777216);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","21638401",RemoteObject.createImmutable("Boton Configuration"),0);
 BA.debugLineNum = 602;BA.debugLine="Log(isPanelVisibleConfig)";
Debug.ShouldStop(33554432);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","21638402",BA.ObjectToString(controlador1._ispanelvisibleconfig),0);
 BA.debugLineNum = 603;BA.debugLine="If isPanelVisibleConfig Then";
Debug.ShouldStop(67108864);
if (controlador1._ispanelvisibleconfig.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 605;BA.debugLine="AnimationPanel(1000, 0, pnlSlidingConfig)";
Debug.ShouldStop(268435456);
_animationpanel(BA.numberCast(int.class, 1000),BA.numberCast(int.class, 0),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), controlador1.mostCurrent._pnlslidingconfig.getObject()));
 BA.debugLineNum = 606;BA.debugLine="isPanelVisibleConfig = False";
Debug.ShouldStop(536870912);
controlador1._ispanelvisibleconfig = controlador1.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 607;BA.debugLine="pnlSlidingConfig.Left = -550dip";
Debug.ShouldStop(1073741824);
controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 550))).<Integer>get().intValue())));
 BA.debugLineNum = 608;BA.debugLine="btnCreations.Visible = True";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._btncreations.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 612;BA.debugLine="AnimationPanel(-550, 100, pnlSlidingConfig)";
Debug.ShouldStop(8);
_animationpanel(BA.numberCast(int.class, -(double) (0 + 550)),BA.numberCast(int.class, 100),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), controlador1.mostCurrent._pnlslidingconfig.getObject()));
 BA.debugLineNum = 613;BA.debugLine="isPanelVisibleConfig = True";
Debug.ShouldStop(16);
controlador1._ispanelvisibleconfig = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 614;BA.debugLine="pnlSlidingConfig.Left = 0dip";
Debug.ShouldStop(32);
controlador1.mostCurrent._pnlslidingconfig.runMethod(true,"setLeft",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 618;BA.debugLine="btnConfig.BringToFront";
Debug.ShouldStop(512);
controlador1.mostCurrent._btnconfig.runVoidMethod ("BringToFront");
 BA.debugLineNum = 619;BA.debugLine="btnCreations.Visible = False";
Debug.ShouldStop(1024);
controlador1.mostCurrent._btncreations.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncreations_click() throws Exception{
try {
		Debug.PushSubsStack("btnCreations_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,624);
if (RapidSub.canDelegate("btncreations_click")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","btncreations_click");}
 BA.debugLineNum = 624;BA.debugLine="Sub btnCreations_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 625;BA.debugLine="Log(\"Boton Creations\")";
Debug.ShouldStop(65536);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","21703937",RemoteObject.createImmutable("Boton Creations"),0);
 BA.debugLineNum = 626;BA.debugLine="Log(isPanelVisibleCreations)";
Debug.ShouldStop(131072);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","21703938",BA.ObjectToString(controlador1._ispanelvisiblecreations),0);
 BA.debugLineNum = 627;BA.debugLine="If isPanelVisibleCreations Then";
Debug.ShouldStop(262144);
if (controlador1._ispanelvisiblecreations.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 629;BA.debugLine="AnimationPanel(1000, 0, pnlSlidingCreations)";
Debug.ShouldStop(1048576);
_animationpanel(BA.numberCast(int.class, 1000),BA.numberCast(int.class, 0),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), controlador1.mostCurrent._pnlslidingcreations.getObject()));
 BA.debugLineNum = 630;BA.debugLine="isPanelVisibleCreations = False";
Debug.ShouldStop(2097152);
controlador1._ispanelvisiblecreations = controlador1.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 631;BA.debugLine="pnlSlidingCreations.Left = -550dip";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 550))).<Integer>get().intValue())));
 BA.debugLineNum = 632;BA.debugLine="btnConfig.Visible = True";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._btnconfig.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 635;BA.debugLine="AnimationPanel(-550, 100, pnlSlidingCreations)";
Debug.ShouldStop(67108864);
_animationpanel(BA.numberCast(int.class, -(double) (0 + 550)),BA.numberCast(int.class, 100),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), controlador1.mostCurrent._pnlslidingcreations.getObject()));
 BA.debugLineNum = 636;BA.debugLine="isPanelVisibleCreations = True";
Debug.ShouldStop(134217728);
controlador1._ispanelvisiblecreations = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 637;BA.debugLine="pnlSlidingCreations.Left = 0dip";
Debug.ShouldStop(268435456);
controlador1.mostCurrent._pnlslidingcreations.runMethod(true,"setLeft",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 638;BA.debugLine="btnConfig.Visible = False";
Debug.ShouldStop(536870912);
controlador1.mostCurrent._btnconfig.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 640;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkviewsescribirhr() throws Exception{
try {
		Debug.PushSubsStack("CheckViewsEscribirHR (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,988);
if (RapidSub.canDelegate("checkviewsescribirhr")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","checkviewsescribirhr");}
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _count1 = RemoteObject.createImmutable(0);
RemoteObject _index1 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 988;BA.debugLine="Sub CheckViewsEscribirHR As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 990;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
Debug.ShouldStop(536870912);
_loadedinfo = controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 991;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
 BA.debugLineNum = 992;BA.debugLine="Log(\"Vacio\")";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22686980",RemoteObject.createImmutable("Vacio"),0);
 BA.debugLineNum = 993;BA.debugLine="Return 0";
Debug.ShouldStop(1);
if (true) return BA.numberCast(int.class, 0);
 }else {
 BA.debugLineNum = 995;BA.debugLine="Dim count1 As Int = 0";
Debug.ShouldStop(4);
_count1 = BA.numberCast(int.class, 0);Debug.locals.put("count1", _count1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 996;BA.debugLine="Dim index1 As Int = 0";
Debug.ShouldStop(8);
_index1 = BA.numberCast(int.class, 0);Debug.locals.put("index1", _index1);Debug.locals.put("index1", _index1);
 BA.debugLineNum = 998;BA.debugLine="Do While index1 > -1";
Debug.ShouldStop(32);
while (RemoteObject.solveBoolean(">",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 999;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Escritura\", index";
Debug.ShouldStop(64);
_index1 = _loadedinfo.runMethod(true,"indexOf",(Object)(BA.ObjectToString("Escritura")),(Object)(_index1));Debug.locals.put("index1", _index1);
 BA.debugLineNum = 1000;BA.debugLine="If index1 <> -1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1001;BA.debugLine="count1 = count1 + 1";
Debug.ShouldStop(256);
_count1 = RemoteObject.solve(new RemoteObject[] {_count1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 1002;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
Debug.ShouldStop(512);
_index1 = RemoteObject.solve(new RemoteObject[] {_index1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index1", _index1);
 };
 }
;
 BA.debugLineNum = 1005;BA.debugLine="Return count1";
Debug.ShouldStop(4096);
if (true) return _count1;
 };
 BA.debugLineNum = 1008;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkviewshold() throws Exception{
try {
		Debug.PushSubsStack("CheckViewsHold (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1032);
if (RapidSub.canDelegate("checkviewshold")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","checkviewshold");}
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _count1 = RemoteObject.createImmutable(0);
RemoteObject _index1 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1032;BA.debugLine="Sub CheckViewsHold As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 1034;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
Debug.ShouldStop(512);
_loadedinfo = controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 1035;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1036;BA.debugLine="Log(\"Vacio\")";
Debug.ShouldStop(2048);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22818052",RemoteObject.createImmutable("Vacio"),0);
 BA.debugLineNum = 1037;BA.debugLine="Return 0";
Debug.ShouldStop(4096);
if (true) return BA.numberCast(int.class, 0);
 }else {
 BA.debugLineNum = 1039;BA.debugLine="Dim count1 As Int = 0";
Debug.ShouldStop(16384);
_count1 = BA.numberCast(int.class, 0);Debug.locals.put("count1", _count1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 1040;BA.debugLine="Dim index1 As Int = 0";
Debug.ShouldStop(32768);
_index1 = BA.numberCast(int.class, 0);Debug.locals.put("index1", _index1);Debug.locals.put("index1", _index1);
 BA.debugLineNum = 1042;BA.debugLine="Do While index1 > -1";
Debug.ShouldStop(131072);
while (RemoteObject.solveBoolean(">",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 1043;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Hold\", index1)";
Debug.ShouldStop(262144);
_index1 = _loadedinfo.runMethod(true,"indexOf",(Object)(BA.ObjectToString("Hold")),(Object)(_index1));Debug.locals.put("index1", _index1);
 BA.debugLineNum = 1044;BA.debugLine="If index1 <> -1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1045;BA.debugLine="count1 = count1 + 1";
Debug.ShouldStop(1048576);
_count1 = RemoteObject.solve(new RemoteObject[] {_count1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 1046;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
Debug.ShouldStop(2097152);
_index1 = RemoteObject.solve(new RemoteObject[] {_index1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index1", _index1);
 };
 }
;
 BA.debugLineNum = 1049;BA.debugLine="Return count1";
Debug.ShouldStop(16777216);
if (true) return _count1;
 };
 BA.debugLineNum = 1052;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkviewsleerhr() throws Exception{
try {
		Debug.PushSubsStack("CheckViewsLeerHR (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,966);
if (RapidSub.canDelegate("checkviewsleerhr")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","checkviewsleerhr");}
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _count1 = RemoteObject.createImmutable(0);
RemoteObject _index1 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 966;BA.debugLine="Sub CheckViewsLeerHR As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 968;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
Debug.ShouldStop(128);
_loadedinfo = controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 969;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
 BA.debugLineNum = 970;BA.debugLine="Log(\"Vacio\")";
Debug.ShouldStop(512);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22621444",RemoteObject.createImmutable("Vacio"),0);
 BA.debugLineNum = 971;BA.debugLine="Return 0";
Debug.ShouldStop(1024);
if (true) return BA.numberCast(int.class, 0);
 }else {
 BA.debugLineNum = 973;BA.debugLine="Dim count1 As Int = 0";
Debug.ShouldStop(4096);
_count1 = BA.numberCast(int.class, 0);Debug.locals.put("count1", _count1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 974;BA.debugLine="Dim index1 As Int = 0";
Debug.ShouldStop(8192);
_index1 = BA.numberCast(int.class, 0);Debug.locals.put("index1", _index1);Debug.locals.put("index1", _index1);
 BA.debugLineNum = 976;BA.debugLine="Do While index1 > -1";
Debug.ShouldStop(32768);
while (RemoteObject.solveBoolean(">",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 977;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"Lectura\", index1)";
Debug.ShouldStop(65536);
_index1 = _loadedinfo.runMethod(true,"indexOf",(Object)(BA.ObjectToString("Lectura")),(Object)(_index1));Debug.locals.put("index1", _index1);
 BA.debugLineNum = 978;BA.debugLine="If index1 <> -1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 979;BA.debugLine="count1 = count1 + 1";
Debug.ShouldStop(262144);
_count1 = RemoteObject.solve(new RemoteObject[] {_count1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 980;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
Debug.ShouldStop(524288);
_index1 = RemoteObject.solve(new RemoteObject[] {_index1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index1", _index1);
 };
 }
;
 BA.debugLineNum = 983;BA.debugLine="Return count1";
Debug.ShouldStop(4194304);
if (true) return _count1;
 };
 BA.debugLineNum = 986;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkviewsonoff() throws Exception{
try {
		Debug.PushSubsStack("CheckViewsOnOff (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1010);
if (RapidSub.canDelegate("checkviewsonoff")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","checkviewsonoff");}
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _count1 = RemoteObject.createImmutable(0);
RemoteObject _index1 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1010;BA.debugLine="Sub CheckViewsOnOff As Int";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1012;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.D";
Debug.ShouldStop(524288);
_loadedinfo = controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 1013;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1014;BA.debugLine="Log(\"Vacio\")";
Debug.ShouldStop(2097152);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22752516",RemoteObject.createImmutable("Vacio"),0);
 BA.debugLineNum = 1015;BA.debugLine="Return 0";
Debug.ShouldStop(4194304);
if (true) return BA.numberCast(int.class, 0);
 }else {
 BA.debugLineNum = 1017;BA.debugLine="Dim count1 As Int = 0";
Debug.ShouldStop(16777216);
_count1 = BA.numberCast(int.class, 0);Debug.locals.put("count1", _count1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 1018;BA.debugLine="Dim index1 As Int = 0";
Debug.ShouldStop(33554432);
_index1 = BA.numberCast(int.class, 0);Debug.locals.put("index1", _index1);Debug.locals.put("index1", _index1);
 BA.debugLineNum = 1020;BA.debugLine="Do While index1 > -1";
Debug.ShouldStop(134217728);
while (RemoteObject.solveBoolean(">",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 1021;BA.debugLine="index1 = LoadedInfo.IndexOf2(\"OnOff\", index1)";
Debug.ShouldStop(268435456);
_index1 = _loadedinfo.runMethod(true,"indexOf",(Object)(BA.ObjectToString("OnOff")),(Object)(_index1));Debug.locals.put("index1", _index1);
 BA.debugLineNum = 1022;BA.debugLine="If index1 <> -1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1023;BA.debugLine="count1 = count1 + 1";
Debug.ShouldStop(1073741824);
_count1 = RemoteObject.solve(new RemoteObject[] {_count1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 1024;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
Debug.ShouldStop(-2147483648);
_index1 = RemoteObject.solve(new RemoteObject[] {_index1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index1", _index1);
 };
 }
;
 BA.debugLineNum = 1027;BA.debugLine="Return count1";
Debug.ShouldStop(4);
if (true) return _count1;
 };
 BA.debugLineNum = 1030;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _connectplc_click() throws Exception{
try {
		Debug.PushSubsStack("ConnectPLC_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1229);
if (RapidSub.canDelegate("connectplc_click")) { b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","connectplc_click"); return;}
ResumableSub_ConnectPLC_Click rsub = new ResumableSub_ConnectPLC_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ConnectPLC_Click extends BA.ResumableSub {
public ResumableSub_ConnectPLC_Click(b4a.example.controlador1 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.controlador1 parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ConnectPLC_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1229);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1230;BA.debugLine="Log(\"Conectando\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","23080193",RemoteObject.createImmutable("Conectando"),0);
 BA.debugLineNum = 1253;BA.debugLine="Msgbox2Async(\"Looks like no PLC Found, want to SI";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Looks like no PLC Found, want to SIMULATE?")),(Object)(BA.ObjectToCharSequence("PLC ERROR CONNECTION")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("No")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),controlador1.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1254;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", controlador1.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "controlador1", "connectplc_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1255;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1258;BA.debugLine="Timer1.Initialize(\"Timer1\", 10000) ' 1 second in";
Debug.ShouldStop(512);
parent._timer1.runVoidMethod ("Initialize",controlador1.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 10000)));
 BA.debugLineNum = 1259;BA.debugLine="Timer1.Enabled = True ' Start the timer";
Debug.ShouldStop(1024);
parent._timer1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1267;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _creandovistas(RemoteObject _count1,RemoteObject _count2,RemoteObject _count3,RemoteObject _count4) throws Exception{
try {
		Debug.PushSubsStack("CreandoVistas (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1137);
if (RapidSub.canDelegate("creandovistas")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","creandovistas", _count1, _count2, _count3, _count4);}
Debug.locals.put("count1", _count1);
Debug.locals.put("count2", _count2);
Debug.locals.put("count3", _count3);
Debug.locals.put("count4", _count4);
 BA.debugLineNum = 1137;BA.debugLine="Sub CreandoVistas(count1 As Int, count2 As Int, co";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1139;BA.debugLine="If count1 == 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_count1,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1140;BA.debugLine="PanelLeer1.Enabled = False";
Debug.ShouldStop(524288);
controlador1.mostCurrent._panelleer1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1141;BA.debugLine="PanelLeer1.Visible = False";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._panelleer1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1143;BA.debugLine="PanelLeer2.Enabled = False";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._panelleer2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1144;BA.debugLine="PanelLeer2.Visible = False";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._panelleer2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1146;BA.debugLine="Else If count1 == 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_count1,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1147;BA.debugLine="PanelLeer1.Enabled = True";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._panelleer1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1148;BA.debugLine="PanelLeer1.Visible = True";
Debug.ShouldStop(134217728);
controlador1.mostCurrent._panelleer1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1151;BA.debugLine="PanelLeer2.Enabled = False";
Debug.ShouldStop(1073741824);
controlador1.mostCurrent._panelleer2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1152;BA.debugLine="PanelLeer2.Visible = False";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._panelleer2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1153;BA.debugLine="Else If count1 == 2 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_count1,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1154;BA.debugLine="PanelLeer1.Enabled = True";
Debug.ShouldStop(2);
controlador1.mostCurrent._panelleer1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1155;BA.debugLine="PanelLeer1.Visible = True";
Debug.ShouldStop(4);
controlador1.mostCurrent._panelleer1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1157;BA.debugLine="PanelLeer2.Enabled = True";
Debug.ShouldStop(16);
controlador1.mostCurrent._panelleer2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1158;BA.debugLine="PanelLeer2.Visible = True";
Debug.ShouldStop(32);
controlador1.mostCurrent._panelleer2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}}
;
 BA.debugLineNum = 1161;BA.debugLine="If count2 == 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_count2,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1162;BA.debugLine="PanelEscribir1.Enabled = False";
Debug.ShouldStop(512);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1163;BA.debugLine="PanelEscribir1.Visible = False";
Debug.ShouldStop(1024);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1165;BA.debugLine="PanelEscribir2.Enabled = False";
Debug.ShouldStop(4096);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1166;BA.debugLine="PanelEscribir2.Visible = False";
Debug.ShouldStop(8192);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1168;BA.debugLine="Else If count2 == 1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_count2,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1169;BA.debugLine="PanelEscribir1.Enabled = True";
Debug.ShouldStop(65536);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1170;BA.debugLine="PanelEscribir1.Visible = True";
Debug.ShouldStop(131072);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1173;BA.debugLine="PanelEscribir2.Enabled = False";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1174;BA.debugLine="PanelEscribir2.Visible = False";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1175;BA.debugLine="Else If count2 == 2 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_count2,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1176;BA.debugLine="PanelEscribir1.Enabled = True";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1177;BA.debugLine="PanelEscribir1.Visible = True";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1179;BA.debugLine="PanelEscribir2.Enabled = True";
Debug.ShouldStop(67108864);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1180;BA.debugLine="PanelEscribir2.Visible = True";
Debug.ShouldStop(134217728);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}}
;
 BA.debugLineNum = 1183;BA.debugLine="If count3 == 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_count3,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1184;BA.debugLine="PanelOnOff1.Enabled = False";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._panelonoff1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1185;BA.debugLine="PanelOnOff1.Visible = False";
Debug.ShouldStop(1);
controlador1.mostCurrent._panelonoff1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1187;BA.debugLine="PanelOnOff2.Enabled = False";
Debug.ShouldStop(4);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1188;BA.debugLine="PanelOnOff2.Visible = False";
Debug.ShouldStop(8);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1190;BA.debugLine="Else If count3 == 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_count3,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1191;BA.debugLine="PanelOnOff2.Enabled = True";
Debug.ShouldStop(64);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1192;BA.debugLine="PanelOnOff2.Visible = True";
Debug.ShouldStop(128);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1195;BA.debugLine="PanelOnOff2.Enabled = False";
Debug.ShouldStop(1024);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1196;BA.debugLine="PanelOnOff2.Visible = False";
Debug.ShouldStop(2048);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1197;BA.debugLine="Else If count3 == 2 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_count3,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1198;BA.debugLine="PanelOnOff2.Enabled = True";
Debug.ShouldStop(8192);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1199;BA.debugLine="PanelOnOff2.Visible = True";
Debug.ShouldStop(16384);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1201;BA.debugLine="PanelOnOff2.Enabled = True";
Debug.ShouldStop(65536);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1202;BA.debugLine="PanelOnOff2.Visible = True";
Debug.ShouldStop(131072);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}}
;
 BA.debugLineNum = 1205;BA.debugLine="If count4 == 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_count4,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1206;BA.debugLine="PanelHold1.Enabled = False";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._panelhold1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1207;BA.debugLine="PanelHold1.Visible = False";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._panelhold1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1209;BA.debugLine="PanelHold2.Enabled = False";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._panelhold2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1210;BA.debugLine="PanelHold2.Visible = False";
Debug.ShouldStop(33554432);
controlador1.mostCurrent._panelhold2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1212;BA.debugLine="Else If count4 == 1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_count4,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1213;BA.debugLine="PanelHold1.Enabled = True";
Debug.ShouldStop(268435456);
controlador1.mostCurrent._panelhold1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1214;BA.debugLine="PanelHold1.Visible = True";
Debug.ShouldStop(536870912);
controlador1.mostCurrent._panelhold1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1216;BA.debugLine="PanelHold2.Enabled = False";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._panelhold2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1217;BA.debugLine="PanelHold2.Visible = False";
Debug.ShouldStop(1);
controlador1.mostCurrent._panelhold2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 1218;BA.debugLine="Else If count4 == 2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_count4,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1219;BA.debugLine="PanelHold1.Enabled = True";
Debug.ShouldStop(4);
controlador1.mostCurrent._panelhold1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1220;BA.debugLine="PanelHold1.Visible = True";
Debug.ShouldStop(8);
controlador1.mostCurrent._panelhold1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1222;BA.debugLine="PanelHold2.Enabled = True";
Debug.ShouldStop(32);
controlador1.mostCurrent._panelhold2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1223;BA.debugLine="PanelHold2.Visible = True";
Debug.ShouldStop(64);
controlador1.mostCurrent._panelhold2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}}
;
 BA.debugLineNum = 1226;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _doallstuff() throws Exception{
try {
		Debug.PushSubsStack("DoAllStuff (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1274);
if (RapidSub.canDelegate("doallstuff")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","doallstuff");}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
RemoteObject _asdf = RemoteObject.createImmutable("");
 BA.debugLineNum = 1274;BA.debugLine="Sub DoAllStuff";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1276;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1277;BA.debugLine="Dim A As Int";
Debug.ShouldStop(268435456);
_a = RemoteObject.createImmutable(0);Debug.locals.put("A", _a);
 BA.debugLineNum = 1278;BA.debugLine="Dim B As Int";
Debug.ShouldStop(536870912);
_b = RemoteObject.createImmutable(0);Debug.locals.put("B", _b);
 BA.debugLineNum = 1280;BA.debugLine="A = Rnd(100, 1000)";
Debug.ShouldStop(-2147483648);
_a = controlador1.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 1000)));Debug.locals.put("A", _a);
 BA.debugLineNum = 1281;BA.debugLine="B = Rnd(1000, 1100)";
Debug.ShouldStop(1);
_b = controlador1.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1000)),(Object)(BA.numberCast(int.class, 1100)));Debug.locals.put("B", _b);
 BA.debugLineNum = 1283;BA.debugLine="Direccion1.Text = A";
Debug.ShouldStop(4);
controlador1.mostCurrent._direccion1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_a));
 BA.debugLineNum = 1284;BA.debugLine="Direccion2.Text = B";
Debug.ShouldStop(8);
controlador1.mostCurrent._direccion2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_b));
 BA.debugLineNum = 1286;BA.debugLine="Dim asdf As String";
Debug.ShouldStop(32);
_asdf = RemoteObject.createImmutable("");Debug.locals.put("asdf", _asdf);
 BA.debugLineNum = 1287;BA.debugLine="DateTime.TimeFormat = \"hh:mm:ss\"";
Debug.ShouldStop(64);
controlador1.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("hh:mm:ss"));
 BA.debugLineNum = 1288;BA.debugLine="asdf = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(128);
_asdf = controlador1.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(controlador1.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("asdf", _asdf);
 BA.debugLineNum = 1289;BA.debugLine="Log(asdf)";
Debug.ShouldStop(256);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","23211279",_asdf,0);
 BA.debugLineNum = 1291;BA.debugLine="LineChart1.AddLinePointData(asdf, A, True)";
Debug.ShouldStop(1024);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_addlinepointdata" /*RemoteObject*/ ,(Object)(_asdf),(Object)(BA.numberCast(double.class, _a)),(Object)(controlador1.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1293;BA.debugLine="LineChart1.DrawChart";
Debug.ShouldStop(4096);
controlador1.mostCurrent._linechart1.runClassMethod (b4a.example.xchart.class, "_drawchart" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",controlador1.processBA, e15.toString()); BA.debugLineNum = 1298;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","23211288",BA.ObjectToString(controlador1.mostCurrent.__c.runMethod(false,"LastException",controlador1.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1302;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escribirhr_click() throws Exception{
try {
		Debug.PushSubsStack("EscribirHR_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,732);
if (RapidSub.canDelegate("escribirhr_click")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","escribirhr_click");}
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
 BA.debugLineNum = 732;BA.debugLine="Sub EscribirHR_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 734;BA.debugLine="If CheckViewsEscribirHR <= 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("k",_checkviewsescribirhr(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 736;BA.debugLine="If CheckViewsEscribirHR == 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_checkviewsescribirhr(),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 737;BA.debugLine="PanelEscribir1.Enabled = True";
Debug.ShouldStop(1);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 738;BA.debugLine="PanelEscribir1.Visible = True";
Debug.ShouldStop(2);
controlador1.mostCurrent._panelescribir1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 739;BA.debugLine="Else If CheckViewsEscribirHR == 1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_checkviewsescribirhr(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 740;BA.debugLine="PanelEscribir2.Enabled = True";
Debug.ShouldStop(8);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 741;BA.debugLine="PanelEscribir2.Visible = True";
Debug.ShouldStop(16);
controlador1.mostCurrent._panelescribir2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 743;BA.debugLine="Log(\"ESCRIBIR HR\")";
Debug.ShouldStop(64);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22162699",RemoteObject.createImmutable("ESCRIBIR HR"),0);
 BA.debugLineNum = 744;BA.debugLine="Dim Writer As TextWriter";
Debug.ShouldStop(128);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("Writer", _writer);
 BA.debugLineNum = 745;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
Debug.ShouldStop(256);
_writer.runVoidMethod ("Initialize",(Object)((controlador1.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1),(Object)(controlador1.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 746;BA.debugLine="Writer.WriteLine(\"Escritura\")";
Debug.ShouldStop(512);
_writer.runVoidMethod ("WriteLine",(Object)(RemoteObject.createImmutable("Escritura")));
 BA.debugLineNum = 747;BA.debugLine="Writer.Close";
Debug.ShouldStop(1024);
_writer.runVoidMethod ("Close");
 }else {
 BA.debugLineNum = 750;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
Debug.ShouldStop(8192);
controlador1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas")),(Object)(controlador1.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 753;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _escribirhr_longclick() throws Exception{
try {
		Debug.PushSubsStack("EscribirHR_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,756);
if (RapidSub.canDelegate("escribirhr_longclick")) { b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","escribirhr_longclick"); return;}
ResumableSub_EscribirHR_LongClick rsub = new ResumableSub_EscribirHR_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EscribirHR_LongClick extends BA.ResumableSub {
public ResumableSub_EscribirHR_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.controlador1 parent;
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _texttosave = RemoteObject.createImmutable("");
RemoteObject _after = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EscribirHR_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,756);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 757;BA.debugLine="If CheckViewsEscribirHR <=2 And CheckViewsEscribi";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("k",_checkviewsescribirhr(),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean(">",_checkviewsescribirhr(),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 758;BA.debugLine="Log(\"Eliminando Lectura\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228226",RemoteObject.createImmutable("Eliminando Lectura"),0);
 BA.debugLineNum = 759;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
Debug.ShouldStop(4194304);
_loadedinfo = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 760;BA.debugLine="Log(LoadedInfo)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228228",_loadedinfo,0);
 BA.debugLineNum = 761;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 BA.debugLineNum = 762;BA.debugLine="Log(\"Sin Vistas\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228230",RemoteObject.createImmutable("Sin Vistas"),0);
 BA.debugLineNum = 763;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 765;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Escritura Ho";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Eliminar vistas para Escritura HoldingRegisters?")),(Object)(BA.ObjectToCharSequence("Escrituras HRs")),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("NO")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),controlador1.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 766;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", controlador1.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "controlador1", "escribirhr_longclick"), null);
this.state = 29;
return;
case 29:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 767;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 9:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 768;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Escritu";
Debug.ShouldStop(-2147483648);
_index = _loadedinfo.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("Escritura")));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 769;BA.debugLine="If index <> -1 Then";
Debug.ShouldStop(1);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 770;BA.debugLine="index = index + 1 ' Move past the last found";
Debug.ShouldStop(2);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index", _index);
 BA.debugLineNum = 771;BA.debugLine="Dim textToSave As String = \"\"";
Debug.ShouldStop(4);
_texttosave = BA.ObjectToString("");Debug.locals.put("textToSave", _texttosave);Debug.locals.put("textToSave", _texttosave);
 BA.debugLineNum = 772;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Esc";
Debug.ShouldStop(8);
_after = _loadedinfo.runMethod(true,"replace",(Object)(BA.ObjectToString("Escritura")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("after", _after);Debug.locals.put("after", _after);
 BA.debugLineNum = 773;BA.debugLine="Log(\"DESPUES: \"&after)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228241",RemoteObject.concat(RemoteObject.createImmutable("DESPUES: "),_after),0);
 BA.debugLineNum = 774;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(32);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_texttosave));
 BA.debugLineNum = 776;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(128);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_after));
 BA.debugLineNum = 778;BA.debugLine="PanelEscribir1.Enabled = False";
Debug.ShouldStop(512);
parent.mostCurrent._panelescribir1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 779;BA.debugLine="PanelEscribir1.Visible = False";
Debug.ShouldStop(1024);
parent.mostCurrent._panelescribir1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 781;BA.debugLine="PanelEscribir2.Enabled = False";
Debug.ShouldStop(4096);
parent.mostCurrent._panelescribir2.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 782;BA.debugLine="PanelEscribir2.Visible = False";
Debug.ShouldStop(8192);
parent.mostCurrent._panelescribir2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 785;BA.debugLine="Return";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 790;BA.debugLine="Log(CheckViewsEscribirHR)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228258",BA.NumberToString(_checkviewsescribirhr()),0);
 BA.debugLineNum = 791;BA.debugLine="If CheckViewsEscribirHR > 2 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 20:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",_checkviewsescribirhr(),BA.numberCast(double.class, 2))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 792;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File";
Debug.ShouldStop(8388608);
_loadedinfo = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 793;BA.debugLine="Log(LoadedInfo)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228261",_loadedinfo,0);
 BA.debugLineNum = 794;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Escritur";
Debug.ShouldStop(33554432);
_index = _loadedinfo.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("Escritura")));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 795;BA.debugLine="Log(index)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228263",BA.NumberToString(_index),0);
 BA.debugLineNum = 796;BA.debugLine="If index <> -1 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 797;BA.debugLine="index = index + 1 ' Move past the last found i";
Debug.ShouldStop(268435456);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index", _index);
 BA.debugLineNum = 798;BA.debugLine="Dim textToSave As String = \"\"";
Debug.ShouldStop(536870912);
_texttosave = BA.ObjectToString("");Debug.locals.put("textToSave", _texttosave);Debug.locals.put("textToSave", _texttosave);
 BA.debugLineNum = 799;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Escr";
Debug.ShouldStop(1073741824);
_after = _loadedinfo.runMethod(true,"replace",(Object)(BA.ObjectToString("Escritura")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("after", _after);Debug.locals.put("after", _after);
 BA.debugLineNum = 800;BA.debugLine="Log(\"DESPUES: \"&after)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22228268",RemoteObject.concat(RemoteObject.createImmutable("DESPUES: "),_after),0);
 BA.debugLineNum = 801;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_texttosave));
 BA.debugLineNum = 803;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(4);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_after));
 BA.debugLineNum = 804;BA.debugLine="Return";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 808;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 811;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _firsttimecreated() throws Exception{
try {
		Debug.PushSubsStack("FirstTimeCreated (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,944);
if (RapidSub.canDelegate("firsttimecreated")) { b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","firsttimecreated"); return;}
ResumableSub_FirstTimeCreated rsub = new ResumableSub_FirstTimeCreated(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FirstTimeCreated extends BA.ResumableSub {
public ResumableSub_FirstTimeCreated(b4a.example.controlador1 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.controlador1 parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FirstTimeCreated (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,944);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 946;BA.debugLine="If Not (File.Exists(File.DirAssets, FileName1)) T";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 10;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(parent._filename1)))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 947;BA.debugLine="If File.Exists(File.DirInternal, FileName1) Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1)).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 948;BA.debugLine="Log(\"YA Existe\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22555908",RemoteObject.createImmutable("YA Existe"),0);
 BA.debugLineNum = 949;BA.debugLine="ProgressDialogShow(\"Leyendo 'CONTROLADOR 1'\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",controlador1.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Leyendo 'CONTROLADOR 1'"))));
 BA.debugLineNum = 950;BA.debugLine="Sleep(3000)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",controlador1.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "controlador1", "firsttimecreated"),BA.numberCast(int.class, 3000));
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
 BA.debugLineNum = 951;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 952;BA.debugLine="LoadControlador";
Debug.ShouldStop(8388608);
_loadcontrolador();
 BA.debugLineNum = 953;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 955;BA.debugLine="File.Copy(File.DirAssets, FileName1, File.DirIn";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(parent._filename1),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1));
 BA.debugLineNum = 956;BA.debugLine="ProgressDialogShow(\"CREANDO 'CONTROLADOR 1'\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",controlador1.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("CREANDO 'CONTROLADOR 1'"))));
 BA.debugLineNum = 957;BA.debugLine="Sleep(3000)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",controlador1.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "controlador1", "firsttimecreated"),BA.numberCast(int.class, 3000));
this.state = 12;
return;
case 12:
//C
this.state = 9;
;
 BA.debugLineNum = 958;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 959;BA.debugLine="LoadControlador";
Debug.ShouldStop(1073741824);
_loadcontrolador();
 BA.debugLineNum = 960;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 964;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private btnConfig As Button";
controlador1.mostCurrent._btnconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private pnlSlidingConfig As Panel";
controlador1.mostCurrent._pnlslidingconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private isPanelVisibleConfig As Boolean";
controlador1._ispanelvisibleconfig = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 25;BA.debugLine="Private EditTextIP As EditText";
controlador1.mostCurrent._edittextip = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditTextPort As EditText";
controlador1.mostCurrent._edittextport = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ConnectPLC As Button";
controlador1.mostCurrent._connectplc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnCreations As Button";
controlador1.mostCurrent._btncreations = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private pnlSlidingCreations As Panel";
controlador1.mostCurrent._pnlslidingcreations = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private isPanelVisibleCreations As Boolean";
controlador1._ispanelvisiblecreations = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 35;BA.debugLine="Private LabelCreations As Label";
controlador1.mostCurrent._labelcreations = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private btnLeerHR As Button";
controlador1.mostCurrent._btnleerhr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private btnEscribirHR As Button";
controlador1.mostCurrent._btnescribirhr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnONOFF As Button";
controlador1.mostCurrent._btnonoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private btnHOLD As Button";
controlador1.mostCurrent._btnhold = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim LeerHRViews As Int = 0";
controlador1._leerhrviews = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 43;BA.debugLine="Dim EscribirHRViews As Int = 0";
controlador1._escribirhrviews = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 44;BA.debugLine="Dim OnOffViews As Int = 0";
controlador1._onoffviews = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 45;BA.debugLine="Dim HoldViews As Int = 0";
controlador1._holdviews = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 46;BA.debugLine="Dim TotalViews As Int = 0";
controlador1._totalviews = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 50;BA.debugLine="Dim PanelLeer1 As Panel";
controlador1.mostCurrent._panelleer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Dim xOffsetLeer1 As Float";
controlador1._xoffsetleer1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 52;BA.debugLine="Dim yOffsetLeer1 As Float";
controlador1._yoffsetleer1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 53;BA.debugLine="Dim draggingLeer1 As Boolean";
controlador1._draggingleer1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 55;BA.debugLine="Dim Direccion1 As EditText";
controlador1.mostCurrent._direccion1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Dim Direccion1Res As EditText";
controlador1.mostCurrent._direccion1res = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Dim PanelLeer2 As Panel";
controlador1.mostCurrent._panelleer2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Dim xOffsetLeer2 As Float";
controlador1._xoffsetleer2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 60;BA.debugLine="Dim yOffsetLeer2 As Float";
controlador1._yoffsetleer2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 61;BA.debugLine="Dim draggingLeer2 As Boolean";
controlador1._draggingleer2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 63;BA.debugLine="Dim Direccion2 As EditText";
controlador1.mostCurrent._direccion2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Dim Direccion2Res As EditText";
controlador1.mostCurrent._direccion2res = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Dim PanelEscribir1 As Panel";
controlador1.mostCurrent._panelescribir1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Dim xOffsetEscribir1 As Float";
controlador1._xoffsetescribir1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 69;BA.debugLine="Dim yOffsetEscribir1 As Float";
controlador1._yoffsetescribir1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 70;BA.debugLine="Dim draggingEscribir1 As Boolean";
controlador1._draggingescribir1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 72;BA.debugLine="Dim Direccion1Escribir As EditText";
controlador1.mostCurrent._direccion1escribir = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Dim Direccion1EscribirValor As EditText";
controlador1.mostCurrent._direccion1escribirvalor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Dim Direccion1EscribirBTN As Button";
controlador1.mostCurrent._direccion1escribirbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Dim PanelEscribir2 As Panel";
controlador1.mostCurrent._panelescribir2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Dim xOffsetEscribir2 As Float";
controlador1._xoffsetescribir2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 78;BA.debugLine="Dim yOffsetEscribir2 As Float";
controlador1._yoffsetescribir2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 79;BA.debugLine="Dim draggingEscribir2 As Boolean";
controlador1._draggingescribir2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 81;BA.debugLine="Dim Direccion2Escribir As EditText";
controlador1.mostCurrent._direccion2escribir = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Dim Direccion2EscribirValor As EditText";
controlador1.mostCurrent._direccion2escribirvalor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Dim Direccion2EscribirBTN As Button";
controlador1.mostCurrent._direccion2escribirbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Dim PanelOnOff1 As Panel";
controlador1.mostCurrent._panelonoff1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Dim xOffsetOnOff1 As Float";
controlador1._xoffsetonoff1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 88;BA.debugLine="Dim yOffsetOnOff1 As Float";
controlador1._yoffsetonoff1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 89;BA.debugLine="Dim draggingOnOff1 As Boolean";
controlador1._draggingonoff1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 91;BA.debugLine="Dim Direccion1OnOff As EditText";
controlador1.mostCurrent._direccion1onoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Dim BTN1OnOff As Button";
controlador1.mostCurrent._btn1onoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Dim PanelOnOff2 As Panel";
controlador1.mostCurrent._panelonoff2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Dim xOffsetOnOff2 As Float";
controlador1._xoffsetonoff2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 96;BA.debugLine="Dim yOffsetOnOff2 As Float";
controlador1._yoffsetonoff2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 97;BA.debugLine="Dim draggingOnOff2 As Boolean";
controlador1._draggingonoff2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 99;BA.debugLine="Dim Direccion2OnOff As EditText";
controlador1.mostCurrent._direccion2onoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Dim BTN2OnOff As Button";
controlador1.mostCurrent._btn2onoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Dim PanelHold1 As Panel";
controlador1.mostCurrent._panelhold1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Dim xOffsetHold1 As Float";
controlador1._xoffsethold1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 105;BA.debugLine="Dim yOffsetHold1 As Float";
controlador1._yoffsethold1 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 106;BA.debugLine="Dim draggingHold1 As Boolean";
controlador1._dragginghold1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 108;BA.debugLine="Dim Direccion1Hold As EditText";
controlador1.mostCurrent._direccion1hold = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Dim BTN1Hold As Button";
controlador1.mostCurrent._btn1hold = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Dim PanelHold2 As Panel";
controlador1.mostCurrent._panelhold2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Dim xOffsetHold2 As Float";
controlador1._xoffsethold2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 113;BA.debugLine="Dim yOffsetHold2 As Float";
controlador1._yoffsethold2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 114;BA.debugLine="Dim draggingHold2 As Boolean";
controlador1._dragginghold2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 116;BA.debugLine="Dim Direccion2Hold As EditText";
controlador1.mostCurrent._direccion2hold = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Dim BTN2Hold As Button";
controlador1.mostCurrent._btn2hold = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Private ModbusClient As ModbusTCP";
controlador1.mostCurrent._modbusclient = RemoteObject.createNew ("b4a.example.modbustcp");
 //BA.debugLineNum = 122;BA.debugLine="Private COMParameters As ConnectionParams";
controlador1.mostCurrent._comparameters = RemoteObject.createNew ("b4a.example.modbusservice._connectionparams");
 //BA.debugLineNum = 123;BA.debugLine="Private ModbusState As Boolean = False";
controlador1._modbusstate = controlador1.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 127;BA.debugLine="Dim Graph As Button";
controlador1.mostCurrent._graph = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private pnlSlideGraph As Panel";
controlador1.mostCurrent._pnlslidegraph = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private isPanelVisibleGraph As Boolean";
controlador1._ispanelvisiblegraph = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 130;BA.debugLine="Private LineChart1 As xChart";
controlador1.mostCurrent._linechart1 = RemoteObject.createNew ("b4a.example.xchart");
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _graph_click() throws Exception{
try {
		Debug.PushSubsStack("Graph_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,572);
if (RapidSub.canDelegate("graph_click")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","graph_click");}
 BA.debugLineNum = 572;BA.debugLine="Sub Graph_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 573;BA.debugLine="Log(\"Boton Graficador\")";
Debug.ShouldStop(268435456);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","21572865",RemoteObject.createImmutable("Boton Graficador"),0);
 BA.debugLineNum = 574;BA.debugLine="Log(isPanelVisibleGraph)";
Debug.ShouldStop(536870912);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","21572866",BA.ObjectToString(controlador1._ispanelvisiblegraph),0);
 BA.debugLineNum = 575;BA.debugLine="If isPanelVisibleGraph Then";
Debug.ShouldStop(1073741824);
if (controlador1._ispanelvisiblegraph.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 577;BA.debugLine="AnimationPanel(100, 550, pnlSlideGraph)";
Debug.ShouldStop(1);
_animationpanel(BA.numberCast(int.class, 100),BA.numberCast(int.class, 550),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), controlador1.mostCurrent._pnlslidegraph.getObject()));
 BA.debugLineNum = 578;BA.debugLine="isPanelVisibleGraph = False";
Debug.ShouldStop(2);
controlador1._ispanelvisiblegraph = controlador1.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 579;BA.debugLine="pnlSlideGraph.Left = 550dip";
Debug.ShouldStop(4);
controlador1.mostCurrent._pnlslidegraph.runMethod(true,"setLeft",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 550))));
 BA.debugLineNum = 580;BA.debugLine="btnCreations.Visible = True";
Debug.ShouldStop(8);
controlador1.mostCurrent._btncreations.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 581;BA.debugLine="btnConfig.Visible = True";
Debug.ShouldStop(16);
controlador1.mostCurrent._btnconfig.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 585;BA.debugLine="AnimationPanel(550, 100, pnlSlideGraph)";
Debug.ShouldStop(256);
_animationpanel(BA.numberCast(int.class, 550),BA.numberCast(int.class, 100),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), controlador1.mostCurrent._pnlslidegraph.getObject()));
 BA.debugLineNum = 586;BA.debugLine="isPanelVisibleGraph = True";
Debug.ShouldStop(512);
controlador1._ispanelvisiblegraph = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 587;BA.debugLine="pnlSlideGraph.Left = 0dip";
Debug.ShouldStop(1024);
controlador1.mostCurrent._pnlslidegraph.runMethod(true,"setLeft",controlador1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 591;BA.debugLine="Graph.BringToFront";
Debug.ShouldStop(16384);
controlador1.mostCurrent._graph.runVoidMethod ("BringToFront");
 BA.debugLineNum = 592;BA.debugLine="btnCreations.Visible = False";
Debug.ShouldStop(32768);
controlador1.mostCurrent._btncreations.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 593;BA.debugLine="btnConfig.Visible = False";
Debug.ShouldStop(65536);
controlador1.mostCurrent._btnconfig.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 596;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hold_click() throws Exception{
try {
		Debug.PushSubsStack("HOLD_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,879);
if (RapidSub.canDelegate("hold_click")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","hold_click");}
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
 BA.debugLineNum = 879;BA.debugLine="Sub HOLD_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 881;BA.debugLine="If CheckViewsHold <= 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("k",_checkviewshold(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 883;BA.debugLine="If CheckViewsHold == 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_checkviewshold(),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 884;BA.debugLine="PanelHold1.Enabled = True";
Debug.ShouldStop(524288);
controlador1.mostCurrent._panelhold1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 885;BA.debugLine="PanelHold1.Visible = True";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._panelhold1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 886;BA.debugLine="Else If CheckViewsHold == 1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_checkviewshold(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 887;BA.debugLine="PanelHold2.Enabled = True";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._panelhold2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 888;BA.debugLine="PanelHold2.Visible = True";
Debug.ShouldStop(8388608);
controlador1.mostCurrent._panelhold2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 890;BA.debugLine="Log(\"HOLD\")";
Debug.ShouldStop(33554432);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22424843",RemoteObject.createImmutable("HOLD"),0);
 BA.debugLineNum = 891;BA.debugLine="Dim Writer As TextWriter";
Debug.ShouldStop(67108864);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("Writer", _writer);
 BA.debugLineNum = 892;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
Debug.ShouldStop(134217728);
_writer.runVoidMethod ("Initialize",(Object)((controlador1.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1),(Object)(controlador1.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 893;BA.debugLine="Writer.WriteLine(\"Hold\")";
Debug.ShouldStop(268435456);
_writer.runVoidMethod ("WriteLine",(Object)(RemoteObject.createImmutable("Hold")));
 BA.debugLineNum = 894;BA.debugLine="Writer.Close";
Debug.ShouldStop(536870912);
_writer.runVoidMethod ("Close");
 }else {
 BA.debugLineNum = 898;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
Debug.ShouldStop(2);
controlador1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas")),(Object)(controlador1.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 904;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _hold_longclick() throws Exception{
try {
		Debug.PushSubsStack("HOLD_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,906);
if (RapidSub.canDelegate("hold_longclick")) { b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","hold_longclick"); return;}
ResumableSub_HOLD_LongClick rsub = new ResumableSub_HOLD_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HOLD_LongClick extends BA.ResumableSub {
public ResumableSub_HOLD_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.controlador1 parent;
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _texttosave = RemoteObject.createImmutable("");
RemoteObject _after = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HOLD_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,906);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 908;BA.debugLine="If CheckViewsHold <=2 And CheckViewsHold > 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("k",_checkviewshold(),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean(">",_checkviewshold(),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 909;BA.debugLine="Log(\"Eliminando Lectura\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22490371",RemoteObject.createImmutable("Eliminando Lectura"),0);
 BA.debugLineNum = 910;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
Debug.ShouldStop(8192);
_loadedinfo = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 911;BA.debugLine="Log(LoadedInfo)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22490373",_loadedinfo,0);
 BA.debugLineNum = 912;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 BA.debugLineNum = 913;BA.debugLine="Log(\"Sin Vistas\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22490375",RemoteObject.createImmutable("Sin Vistas"),0);
 BA.debugLineNum = 914;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 916;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Acción OnOff";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Eliminar vistas para Acción OnOff?")),(Object)(BA.ObjectToCharSequence("APAGADO / ENCENDIDO")),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("NO")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),controlador1.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 917;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", controlador1.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "controlador1", "hold_longclick"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 918;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (true) break;

case 9:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 919;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Hold\")";
Debug.ShouldStop(4194304);
_index = _loadedinfo.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("Hold")));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 920;BA.debugLine="If index <> -1 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 921;BA.debugLine="index = index + 1 ' Move past the last found";
Debug.ShouldStop(16777216);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index", _index);
 BA.debugLineNum = 922;BA.debugLine="Dim textToSave As String = \"\"";
Debug.ShouldStop(33554432);
_texttosave = BA.ObjectToString("");Debug.locals.put("textToSave", _texttosave);Debug.locals.put("textToSave", _texttosave);
 BA.debugLineNum = 923;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Hol";
Debug.ShouldStop(67108864);
_after = _loadedinfo.runMethod(true,"replace",(Object)(BA.ObjectToString("Hold")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("after", _after);Debug.locals.put("after", _after);
 BA.debugLineNum = 924;BA.debugLine="Log(\"DESPUES: \"&after)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22490386",RemoteObject.concat(RemoteObject.createImmutable("DESPUES: "),_after),0);
 BA.debugLineNum = 925;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_texttosave));
 BA.debugLineNum = 926;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_after));
 BA.debugLineNum = 928;BA.debugLine="PanelHold1.Enabled = False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._panelhold1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 929;BA.debugLine="PanelHold1.Visible = False";
Debug.ShouldStop(1);
parent.mostCurrent._panelhold1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 931;BA.debugLine="PanelHold2.Enabled = False";
Debug.ShouldStop(4);
parent.mostCurrent._panelhold2.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 932;BA.debugLine="PanelHold2.Visible = False";
Debug.ShouldStop(8);
parent.mostCurrent._panelhold2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 934;BA.debugLine="Return";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 939;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 942;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _leerhr_click() throws Exception{
try {
		Debug.PushSubsStack("LeerHR_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,668);
if (RapidSub.canDelegate("leerhr_click")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","leerhr_click");}
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
 BA.debugLineNum = 668;BA.debugLine="Sub LeerHR_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 669;BA.debugLine="If CheckViewsLeerHR <=1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("k",_checkviewsleerhr(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 671;BA.debugLine="If CheckViewsLeerHR == 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_checkviewsleerhr(),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 672;BA.debugLine="PanelLeer1.Enabled = True";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._panelleer1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 673;BA.debugLine="PanelLeer1.Visible = True";
Debug.ShouldStop(1);
controlador1.mostCurrent._panelleer1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 674;BA.debugLine="Else If CheckViewsLeerHR == 1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_checkviewsleerhr(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 675;BA.debugLine="PanelLeer2.Enabled = True";
Debug.ShouldStop(4);
controlador1.mostCurrent._panelleer2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 676;BA.debugLine="PanelLeer2.Visible = True";
Debug.ShouldStop(8);
controlador1.mostCurrent._panelleer2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 679;BA.debugLine="Log(\"LEER HR\")";
Debug.ShouldStop(64);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22031627",RemoteObject.createImmutable("LEER HR"),0);
 BA.debugLineNum = 680;BA.debugLine="Dim Writer As TextWriter";
Debug.ShouldStop(128);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("Writer", _writer);
 BA.debugLineNum = 681;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
Debug.ShouldStop(256);
_writer.runVoidMethod ("Initialize",(Object)((controlador1.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1),(Object)(controlador1.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 682;BA.debugLine="Writer.WriteLine(\"Lectura\")";
Debug.ShouldStop(512);
_writer.runVoidMethod ("WriteLine",(Object)(RemoteObject.createImmutable("Lectura")));
 BA.debugLineNum = 683;BA.debugLine="Writer.Close";
Debug.ShouldStop(1024);
_writer.runVoidMethod ("Close");
 }else {
 BA.debugLineNum = 687;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
Debug.ShouldStop(16384);
controlador1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas")),(Object)(controlador1.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _leerhr_longclick() throws Exception{
try {
		Debug.PushSubsStack("LeerHR_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,693);
if (RapidSub.canDelegate("leerhr_longclick")) { b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","leerhr_longclick"); return;}
ResumableSub_LeerHR_LongClick rsub = new ResumableSub_LeerHR_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LeerHR_LongClick extends BA.ResumableSub {
public ResumableSub_LeerHR_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.controlador1 parent;
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _texttosave = RemoteObject.createImmutable("");
RemoteObject _after = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LeerHR_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,693);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 694;BA.debugLine="If CheckViewsLeerHR <=2 And CheckViewsLeerHR > 0";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("k",_checkviewsleerhr(),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean(">",_checkviewsleerhr(),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 695;BA.debugLine="Log(\"Eliminando Lectura\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22097154",RemoteObject.createImmutable("Eliminando Lectura"),0);
 BA.debugLineNum = 696;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
Debug.ShouldStop(8388608);
_loadedinfo = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 697;BA.debugLine="Log(LoadedInfo)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22097156",_loadedinfo,0);
 BA.debugLineNum = 698;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 BA.debugLineNum = 699;BA.debugLine="Log(\"Sin Vistas\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22097158",RemoteObject.createImmutable("Sin Vistas"),0);
 BA.debugLineNum = 700;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 702;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Lectura Hold";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Eliminar vistas para Lectura HoldingRegisters?")),(Object)(BA.ObjectToCharSequence("Lecturas HRs")),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("NO")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),controlador1.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 703;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", controlador1.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "controlador1", "leerhr_longclick"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 704;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 705;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"Lectura";
Debug.ShouldStop(1);
_index = _loadedinfo.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("Lectura")));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 706;BA.debugLine="If index <> -1 Then";
Debug.ShouldStop(2);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 707;BA.debugLine="index = index + 1 ' Move past the last found";
Debug.ShouldStop(4);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index", _index);
 BA.debugLineNum = 708;BA.debugLine="Dim textToSave As String = \"\"";
Debug.ShouldStop(8);
_texttosave = BA.ObjectToString("");Debug.locals.put("textToSave", _texttosave);Debug.locals.put("textToSave", _texttosave);
 BA.debugLineNum = 709;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"Lec";
Debug.ShouldStop(16);
_after = _loadedinfo.runMethod(true,"replace",(Object)(BA.ObjectToString("Lectura")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("after", _after);Debug.locals.put("after", _after);
 BA.debugLineNum = 710;BA.debugLine="Log(\"DESPUES: \"&after)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22097169",RemoteObject.concat(RemoteObject.createImmutable("DESPUES: "),_after),0);
 BA.debugLineNum = 711;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_texttosave));
 BA.debugLineNum = 713;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_after));
 BA.debugLineNum = 715;BA.debugLine="PanelLeer1.Enabled = False";
Debug.ShouldStop(1024);
parent.mostCurrent._panelleer1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 716;BA.debugLine="PanelLeer1.Visible = False";
Debug.ShouldStop(2048);
parent.mostCurrent._panelleer1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 718;BA.debugLine="PanelLeer2.Enabled = False";
Debug.ShouldStop(8192);
parent.mostCurrent._panelleer2.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 719;BA.debugLine="PanelLeer2.Visible = False";
Debug.ShouldStop(16384);
parent.mostCurrent._panelleer2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 722;BA.debugLine="Return";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 727;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 730;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _leyendovistas(RemoteObject _vistas) throws Exception{
try {
		Debug.PushSubsStack("LeyendoVistas (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1069);
if (RapidSub.canDelegate("leyendovistas")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","leyendovistas", _vistas);}
RemoteObject _count1 = RemoteObject.createImmutable(0);
RemoteObject _index1 = RemoteObject.createImmutable(0);
RemoteObject _count2 = RemoteObject.createImmutable(0);
RemoteObject _index2 = RemoteObject.createImmutable(0);
RemoteObject _count3 = RemoteObject.createImmutable(0);
RemoteObject _index3 = RemoteObject.createImmutable(0);
RemoteObject _count4 = RemoteObject.createImmutable(0);
RemoteObject _index4 = RemoteObject.createImmutable(0);
Debug.locals.put("Vistas", _vistas);
 BA.debugLineNum = 1069;BA.debugLine="Sub LeyendoVistas(Vistas As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1071;BA.debugLine="Log(Vistas)";
Debug.ShouldStop(16384);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949122",_vistas,0);
 BA.debugLineNum = 1073;BA.debugLine="Dim count1 As Int = 0";
Debug.ShouldStop(65536);
_count1 = BA.numberCast(int.class, 0);Debug.locals.put("count1", _count1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 1074;BA.debugLine="Dim index1 As Int = 0";
Debug.ShouldStop(131072);
_index1 = BA.numberCast(int.class, 0);Debug.locals.put("index1", _index1);Debug.locals.put("index1", _index1);
 BA.debugLineNum = 1076;BA.debugLine="Dim count2 As Int = 0";
Debug.ShouldStop(524288);
_count2 = BA.numberCast(int.class, 0);Debug.locals.put("count2", _count2);Debug.locals.put("count2", _count2);
 BA.debugLineNum = 1077;BA.debugLine="Dim index2 As Int = 0";
Debug.ShouldStop(1048576);
_index2 = BA.numberCast(int.class, 0);Debug.locals.put("index2", _index2);Debug.locals.put("index2", _index2);
 BA.debugLineNum = 1079;BA.debugLine="Dim count3 As Int = 0";
Debug.ShouldStop(4194304);
_count3 = BA.numberCast(int.class, 0);Debug.locals.put("count3", _count3);Debug.locals.put("count3", _count3);
 BA.debugLineNum = 1080;BA.debugLine="Dim index3 As Int = 0";
Debug.ShouldStop(8388608);
_index3 = BA.numberCast(int.class, 0);Debug.locals.put("index3", _index3);Debug.locals.put("index3", _index3);
 BA.debugLineNum = 1082;BA.debugLine="Dim count4 As Int = 0";
Debug.ShouldStop(33554432);
_count4 = BA.numberCast(int.class, 0);Debug.locals.put("count4", _count4);Debug.locals.put("count4", _count4);
 BA.debugLineNum = 1083;BA.debugLine="Dim index4 As Int = 0";
Debug.ShouldStop(67108864);
_index4 = BA.numberCast(int.class, 0);Debug.locals.put("index4", _index4);Debug.locals.put("index4", _index4);
 BA.debugLineNum = 1085;BA.debugLine="Do While index1 > -1";
Debug.ShouldStop(268435456);
while (RemoteObject.solveBoolean(">",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 1086;BA.debugLine="index1 = Vistas.IndexOf2(\"Lectura\", index1)";
Debug.ShouldStop(536870912);
_index1 = _vistas.runMethod(true,"indexOf",(Object)(BA.ObjectToString("Lectura")),(Object)(_index1));Debug.locals.put("index1", _index1);
 BA.debugLineNum = 1087;BA.debugLine="If index1 <> -1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_index1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1088;BA.debugLine="count1 = count1 + 1";
Debug.ShouldStop(-2147483648);
_count1 = RemoteObject.solve(new RemoteObject[] {_count1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count1", _count1);
 BA.debugLineNum = 1089;BA.debugLine="index1 = index1 + 1 ' Move past the last found";
Debug.ShouldStop(1);
_index1 = RemoteObject.solve(new RemoteObject[] {_index1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index1", _index1);
 };
 }
;
 BA.debugLineNum = 1093;BA.debugLine="Do While index2 > -1";
Debug.ShouldStop(16);
while (RemoteObject.solveBoolean(">",_index2,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 1094;BA.debugLine="index2 = Vistas.IndexOf2(\"Escritura\", index2)";
Debug.ShouldStop(32);
_index2 = _vistas.runMethod(true,"indexOf",(Object)(BA.ObjectToString("Escritura")),(Object)(_index2));Debug.locals.put("index2", _index2);
 BA.debugLineNum = 1095;BA.debugLine="If index2 <> -1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_index2,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1096;BA.debugLine="count2 = count2 + 1";
Debug.ShouldStop(128);
_count2 = RemoteObject.solve(new RemoteObject[] {_count2,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count2", _count2);
 BA.debugLineNum = 1097;BA.debugLine="index2 = index2 + 1 ' Move past the last found";
Debug.ShouldStop(256);
_index2 = RemoteObject.solve(new RemoteObject[] {_index2,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index2", _index2);
 };
 }
;
 BA.debugLineNum = 1101;BA.debugLine="Do While index3 > -1";
Debug.ShouldStop(4096);
while (RemoteObject.solveBoolean(">",_index3,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 1102;BA.debugLine="index3 = Vistas.IndexOf2(\"OnOff\", index3)";
Debug.ShouldStop(8192);
_index3 = _vistas.runMethod(true,"indexOf",(Object)(BA.ObjectToString("OnOff")),(Object)(_index3));Debug.locals.put("index3", _index3);
 BA.debugLineNum = 1103;BA.debugLine="If index3 <> -1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_index3,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1104;BA.debugLine="count3 = count3 + 1";
Debug.ShouldStop(32768);
_count3 = RemoteObject.solve(new RemoteObject[] {_count3,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count3", _count3);
 BA.debugLineNum = 1105;BA.debugLine="index3 = index3 + 1 ' Move past the last found";
Debug.ShouldStop(65536);
_index3 = RemoteObject.solve(new RemoteObject[] {_index3,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index3", _index3);
 };
 }
;
 BA.debugLineNum = 1109;BA.debugLine="Do While index4 > -1";
Debug.ShouldStop(1048576);
while (RemoteObject.solveBoolean(">",_index4,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 1110;BA.debugLine="index4 = Vistas.IndexOf2(\"Hold\", index4)";
Debug.ShouldStop(2097152);
_index4 = _vistas.runMethod(true,"indexOf",(Object)(BA.ObjectToString("Hold")),(Object)(_index4));Debug.locals.put("index4", _index4);
 BA.debugLineNum = 1111;BA.debugLine="If index4 <> -1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_index4,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1112;BA.debugLine="count4 = count4 + 1";
Debug.ShouldStop(8388608);
_count4 = RemoteObject.solve(new RemoteObject[] {_count4,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count4", _count4);
 BA.debugLineNum = 1113;BA.debugLine="index4 = index4 + 1 ' Move past the last found";
Debug.ShouldStop(16777216);
_index4 = RemoteObject.solve(new RemoteObject[] {_index4,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index4", _index4);
 };
 }
;
 BA.debugLineNum = 1117;BA.debugLine="Log(\"The word 'LeerHR' appears: \" & count1 & \" ti";
Debug.ShouldStop(268435456);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949168",RemoteObject.concat(RemoteObject.createImmutable("The word 'LeerHR' appears: "),_count1,RemoteObject.createImmutable(" times.")),0);
 BA.debugLineNum = 1118;BA.debugLine="Log(\"The word 'ESCRIBIR HR' appears: \" & count2 &";
Debug.ShouldStop(536870912);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949169",RemoteObject.concat(RemoteObject.createImmutable("The word 'ESCRIBIR HR' appears: "),_count2,RemoteObject.createImmutable(" times.")),0);
 BA.debugLineNum = 1119;BA.debugLine="Log(\"The word 'ON OFF' appears: \" & count3 & \" ti";
Debug.ShouldStop(1073741824);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949170",RemoteObject.concat(RemoteObject.createImmutable("The word 'ON OFF' appears: "),_count3,RemoteObject.createImmutable(" times.")),0);
 BA.debugLineNum = 1120;BA.debugLine="Log(\"The word 'HOLD' appears: \" & count4 & \" time";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949171",RemoteObject.concat(RemoteObject.createImmutable("The word 'HOLD' appears: "),_count4,RemoteObject.createImmutable(" times.")),0);
 BA.debugLineNum = 1121;BA.debugLine="LeerHRViews = count1";
Debug.ShouldStop(1);
controlador1._leerhrviews = _count1;
 BA.debugLineNum = 1122;BA.debugLine="EscribirHRViews = count2";
Debug.ShouldStop(2);
controlador1._escribirhrviews = _count2;
 BA.debugLineNum = 1123;BA.debugLine="OnOffViews = count3";
Debug.ShouldStop(4);
controlador1._onoffviews = _count3;
 BA.debugLineNum = 1124;BA.debugLine="HoldViews = count4";
Debug.ShouldStop(8);
controlador1._holdviews = _count4;
 BA.debugLineNum = 1125;BA.debugLine="TotalViews = count1 + count2 + count3 + count4";
Debug.ShouldStop(16);
controlador1._totalviews = RemoteObject.solve(new RemoteObject[] {_count1,_count2,_count3,_count4}, "+++",3, 1);
 BA.debugLineNum = 1126;BA.debugLine="Log(\"TOTAL VIEWS!!: \" & TotalViews)";
Debug.ShouldStop(32);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949177",RemoteObject.concat(RemoteObject.createImmutable("TOTAL VIEWS!!: "),controlador1._totalviews),0);
 BA.debugLineNum = 1128;BA.debugLine="If count1 > 0 Or count2 > 0 Or count3 > 0 Or coun";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_count1,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_count2,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_count3,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_count4,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1129;BA.debugLine="Log(\"Creando!\")";
Debug.ShouldStop(256);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949180",RemoteObject.createImmutable("Creando!"),0);
 BA.debugLineNum = 1130;BA.debugLine="CreandoVistas(count1, count2, count3, count4)";
Debug.ShouldStop(512);
_creandovistas(_count1,_count2,_count3,_count4);
 }else {
 BA.debugLineNum = 1132;BA.debugLine="Log(\"Sin Vistas\")";
Debug.ShouldStop(2048);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22949183",RemoteObject.createImmutable("Sin Vistas"),0);
 };
 BA.debugLineNum = 1135;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcontrolador() throws Exception{
try {
		Debug.PushSubsStack("LoadControlador (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1054);
if (RapidSub.canDelegate("loadcontrolador")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","loadcontrolador");}
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
 BA.debugLineNum = 1054;BA.debugLine="Sub LoadControlador";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1056;BA.debugLine="If File.Exists(File.DirInternal, FileName1) Then";
Debug.ShouldStop(-2147483648);
if (controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1057;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
Debug.ShouldStop(1);
_loadedinfo = controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 1058;BA.debugLine="Log(LoadedInfo)";
Debug.ShouldStop(2);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22883588",_loadedinfo,0);
 BA.debugLineNum = 1059;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1060;BA.debugLine="ToastMessageShow(\"NINGUNA VISTA CREADA!\", False";
Debug.ShouldStop(8);
controlador1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("NINGUNA VISTA CREADA!")),(Object)(controlador1.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 1062;BA.debugLine="Log(\"Creando Vistas!\")";
Debug.ShouldStop(32);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22883592",RemoteObject.createImmutable("Creando Vistas!"),0);
 BA.debugLineNum = 1063;BA.debugLine="LeyendoVistas(LoadedInfo)";
Debug.ShouldStop(64);
_leyendovistas(_loadedinfo);
 };
 };
 BA.debugLineNum = 1067;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onoff_click() throws Exception{
try {
		Debug.PushSubsStack("ONOFF_Click (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,813);
if (RapidSub.canDelegate("onoff_click")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","onoff_click");}
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
 BA.debugLineNum = 813;BA.debugLine="Sub ONOFF_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 815;BA.debugLine="If CheckViewsOnOff <= 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("k",_checkviewsonoff(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 817;BA.debugLine="If CheckViewsOnOff == 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_checkviewsonoff(),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 818;BA.debugLine="PanelOnOff1.Enabled = True";
Debug.ShouldStop(131072);
controlador1.mostCurrent._panelonoff1.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 819;BA.debugLine="PanelOnOff1.Visible = True";
Debug.ShouldStop(262144);
controlador1.mostCurrent._panelonoff1.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 820;BA.debugLine="Else If CheckViewsOnOff == 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_checkviewsonoff(),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 821;BA.debugLine="PanelOnOff2.Enabled = True";
Debug.ShouldStop(1048576);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setEnabled",controlador1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 822;BA.debugLine="PanelOnOff2.Visible = True";
Debug.ShouldStop(2097152);
controlador1.mostCurrent._panelonoff2.runMethod(true,"setVisible",controlador1.mostCurrent.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 825;BA.debugLine="Log(\"ON OFF\")";
Debug.ShouldStop(16777216);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","22293772",RemoteObject.createImmutable("ON OFF"),0);
 BA.debugLineNum = 826;BA.debugLine="Dim Writer As TextWriter";
Debug.ShouldStop(33554432);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("Writer", _writer);
 BA.debugLineNum = 827;BA.debugLine="Writer.Initialize(File.OpenOutput(File.DirIntern";
Debug.ShouldStop(67108864);
_writer.runVoidMethod ("Initialize",(Object)((controlador1.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(controlador1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(controlador1._filename1),(Object)(controlador1.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 828;BA.debugLine="Writer.WriteLine(\"OnOff\")";
Debug.ShouldStop(134217728);
_writer.runVoidMethod ("WriteLine",(Object)(RemoteObject.createImmutable("OnOff")));
 BA.debugLineNum = 829;BA.debugLine="Writer.Close";
Debug.ShouldStop(268435456);
_writer.runVoidMethod ("Close");
 }else {
 BA.debugLineNum = 832;BA.debugLine="ToastMessageShow(\"Maximas Vistas Alcanzadas\", Fa";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Maximas Vistas Alcanzadas")),(Object)(controlador1.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _onoff_longclick() throws Exception{
try {
		Debug.PushSubsStack("ONOFF_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,839);
if (RapidSub.canDelegate("onoff_longclick")) { b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","onoff_longclick"); return;}
ResumableSub_ONOFF_LongClick rsub = new ResumableSub_ONOFF_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ONOFF_LongClick extends BA.ResumableSub {
public ResumableSub_ONOFF_LongClick(b4a.example.controlador1 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.controlador1 parent;
RemoteObject _loadedinfo = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _texttosave = RemoteObject.createImmutable("");
RemoteObject _after = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ONOFF_LongClick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,839);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 841;BA.debugLine="If CheckViewsOnOff <=2 And CheckViewsOnOff > 0 Th";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("k",_checkviewsonoff(),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean(">",_checkviewsonoff(),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 842;BA.debugLine="Log(\"Eliminando Lectura\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22359299",RemoteObject.createImmutable("Eliminando Lectura"),0);
 BA.debugLineNum = 843;BA.debugLine="Dim LoadedInfo As String = File.ReadString(File.";
Debug.ShouldStop(1024);
_loadedinfo = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1));Debug.locals.put("LoadedInfo", _loadedinfo);Debug.locals.put("LoadedInfo", _loadedinfo);
 BA.debugLineNum = 844;BA.debugLine="Log(LoadedInfo)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22359301",_loadedinfo,0);
 BA.debugLineNum = 845;BA.debugLine="If LoadedInfo == \"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_loadedinfo,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 BA.debugLineNum = 846;BA.debugLine="Log(\"Sin Vistas\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22359303",RemoteObject.createImmutable("Sin Vistas"),0);
 BA.debugLineNum = 847;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 849;BA.debugLine="Msgbox2Async(\"Eliminar vistas para Acción OnOff";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Eliminar vistas para Acción OnOff?")),(Object)(BA.ObjectToCharSequence("APAGADO / ENCENDIDO")),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("NO")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),controlador1.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 850;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", controlador1.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "controlador1", "onoff_longclick"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 851;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (true) break;

case 9:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 852;BA.debugLine="Dim index As Int = LoadedInfo.IndexOf(\"OnOff\")";
Debug.ShouldStop(524288);
_index = _loadedinfo.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("OnOff")));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 853;BA.debugLine="If index <> -1 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 854;BA.debugLine="index = index + 1 ' Move past the last found";
Debug.ShouldStop(2097152);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index", _index);
 BA.debugLineNum = 855;BA.debugLine="Dim textToSave As String = \"\"";
Debug.ShouldStop(4194304);
_texttosave = BA.ObjectToString("");Debug.locals.put("textToSave", _texttosave);Debug.locals.put("textToSave", _texttosave);
 BA.debugLineNum = 856;BA.debugLine="Dim after As String = LoadedInfo.Replace(\"OnO";
Debug.ShouldStop(8388608);
_after = _loadedinfo.runMethod(true,"replace",(Object)(BA.ObjectToString("OnOff")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("after", _after);Debug.locals.put("after", _after);
 BA.debugLineNum = 857;BA.debugLine="Log(\"DESPUES: \"&after)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22359314",RemoteObject.concat(RemoteObject.createImmutable("DESPUES: "),_after),0);
 BA.debugLineNum = 858;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_texttosave));
 BA.debugLineNum = 860;BA.debugLine="File.WriteString(File.DirInternal, FileName1,";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent._filename1),(Object)(_after));
 BA.debugLineNum = 862;BA.debugLine="PanelOnOff1.Enabled = False";
Debug.ShouldStop(536870912);
parent.mostCurrent._panelonoff1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 863;BA.debugLine="PanelOnOff1.Visible = False";
Debug.ShouldStop(1073741824);
parent.mostCurrent._panelonoff1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 865;BA.debugLine="PanelOnOff2.Enabled = False";
Debug.ShouldStop(1);
parent.mostCurrent._panelonoff2.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 866;BA.debugLine="PanelOnOff2.Visible = False";
Debug.ShouldStop(2);
parent.mostCurrent._panelonoff2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 869;BA.debugLine="Return";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 874;BA.debugLine="ToastMessageShow(\"Ninguna Vista para Borrar!!\",";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Ninguna Vista para Borrar!!")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 877;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _panelescribir1_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelEscribir1_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,435);
if (RapidSub.canDelegate("panelescribir1_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelescribir1_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 435;BA.debugLine="Sub PanelEscribir1_Touch (Action As Int, X As Floa";
Debug.ShouldStop(262144);
 BA.debugLineNum = 437;BA.debugLine="Select Action";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 439;BA.debugLine="draggingEscribir1 = True";
Debug.ShouldStop(4194304);
controlador1._draggingescribir1 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 440;BA.debugLine="xOffsetEscribir1= X";
Debug.ShouldStop(8388608);
controlador1._xoffsetescribir1 = _x;
 BA.debugLineNum = 441;BA.debugLine="yOffsetEscribir1 = Y";
Debug.ShouldStop(16777216);
controlador1._yoffsetescribir1 = _y;
 break; }
case 1: {
 BA.debugLineNum = 444;BA.debugLine="If draggingEscribir1 Then";
Debug.ShouldStop(134217728);
if (controlador1._draggingescribir1.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 445;BA.debugLine="Dim newX As Float = PanelEscribir1.Left + (X -";
Debug.ShouldStop(268435456);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelescribir1.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsetescribir1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 446;BA.debugLine="Dim newY As Float = PanelEscribir1.Top + (Y -";
Debug.ShouldStop(536870912);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelescribir1.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsetescribir1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 448;BA.debugLine="PanelEscribir1.SetLayout(newX, newY, PanelEscr";
Debug.ShouldStop(-2147483648);
controlador1.mostCurrent._panelescribir1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelescribir1.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelescribir1.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 452;BA.debugLine="draggingEscribir1 = False";
Debug.ShouldStop(8);
controlador1._draggingescribir1 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelescribir2_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelEscribir2_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,460);
if (RapidSub.canDelegate("panelescribir2_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelescribir2_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 460;BA.debugLine="Sub PanelEscribir2_Touch (Action As Int, X As Floa";
Debug.ShouldStop(2048);
 BA.debugLineNum = 462;BA.debugLine="Select Action";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 464;BA.debugLine="draggingEscribir2 = True";
Debug.ShouldStop(32768);
controlador1._draggingescribir2 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 465;BA.debugLine="xOffsetEscribir2 = X";
Debug.ShouldStop(65536);
controlador1._xoffsetescribir2 = _x;
 BA.debugLineNum = 466;BA.debugLine="yOffsetEscribir2 = Y";
Debug.ShouldStop(131072);
controlador1._yoffsetescribir2 = _y;
 break; }
case 1: {
 BA.debugLineNum = 469;BA.debugLine="If draggingEscribir2 Then";
Debug.ShouldStop(1048576);
if (controlador1._draggingescribir2.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 470;BA.debugLine="Dim newX As Float = PanelEscribir2.Left + (X -";
Debug.ShouldStop(2097152);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelescribir2.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsetescribir2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 471;BA.debugLine="Dim newY As Float = PanelEscribir2.Top + (Y -";
Debug.ShouldStop(4194304);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelescribir2.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsetescribir2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 473;BA.debugLine="PanelEscribir2.SetLayout(newX, newY, PanelEscr";
Debug.ShouldStop(16777216);
controlador1.mostCurrent._panelescribir2.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelescribir2.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelescribir2.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 477;BA.debugLine="draggingEscribir2 = False";
Debug.ShouldStop(268435456);
controlador1._draggingescribir2 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 481;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelhold1_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelHold1_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,527);
if (RapidSub.canDelegate("panelhold1_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelhold1_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 527;BA.debugLine="Sub PanelHold1_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(16384);
 BA.debugLineNum = 529;BA.debugLine="Select Action";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 531;BA.debugLine="draggingHold1 = True";
Debug.ShouldStop(262144);
controlador1._dragginghold1 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 532;BA.debugLine="xOffsetHold1 = X";
Debug.ShouldStop(524288);
controlador1._xoffsethold1 = _x;
 BA.debugLineNum = 533;BA.debugLine="yOffsetHold1 = Y";
Debug.ShouldStop(1048576);
controlador1._yoffsethold1 = _y;
 break; }
case 1: {
 BA.debugLineNum = 536;BA.debugLine="If draggingHold1 Then";
Debug.ShouldStop(8388608);
if (controlador1._dragginghold1.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 537;BA.debugLine="Dim newX As Float = PanelHold1.Left + (X - xOf";
Debug.ShouldStop(16777216);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelhold1.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsethold1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 538;BA.debugLine="Dim newY As Float = PanelHold1.Top + (Y - yOff";
Debug.ShouldStop(33554432);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelhold1.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsethold1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 540;BA.debugLine="PanelHold1.SetLayout(newX, newY, PanelHold1.Wi";
Debug.ShouldStop(134217728);
controlador1.mostCurrent._panelhold1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelhold1.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelhold1.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 544;BA.debugLine="draggingHold1 = False";
Debug.ShouldStop(-2147483648);
controlador1._dragginghold1 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelhold2_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelHold2_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,550);
if (RapidSub.canDelegate("panelhold2_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelhold2_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 550;BA.debugLine="Sub PanelHold2_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(32);
 BA.debugLineNum = 552;BA.debugLine="Select Action";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 554;BA.debugLine="draggingHold2 = True";
Debug.ShouldStop(512);
controlador1._dragginghold2 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 555;BA.debugLine="xOffsetHold2 = X";
Debug.ShouldStop(1024);
controlador1._xoffsethold2 = _x;
 BA.debugLineNum = 556;BA.debugLine="yOffsetHold2 = Y";
Debug.ShouldStop(2048);
controlador1._yoffsethold2 = _y;
 break; }
case 1: {
 BA.debugLineNum = 559;BA.debugLine="If draggingHold2 Then";
Debug.ShouldStop(16384);
if (controlador1._dragginghold2.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 560;BA.debugLine="Dim newX As Float = PanelHold2.Left + (X - xOf";
Debug.ShouldStop(32768);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelhold2.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsethold2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 561;BA.debugLine="Dim newY As Float = PanelHold2.Top + (Y - yOff";
Debug.ShouldStop(65536);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelhold2.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsethold2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 563;BA.debugLine="PanelHold2.SetLayout(newX, newY, PanelHold2.Wi";
Debug.ShouldStop(262144);
controlador1.mostCurrent._panelhold2.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelhold2.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelhold2.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 567;BA.debugLine="draggingHold2 = False";
Debug.ShouldStop(4194304);
controlador1._dragginghold2 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 570;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelleer1_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelLeer1_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,395);
if (RapidSub.canDelegate("panelleer1_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelleer1_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 395;BA.debugLine="Sub PanelLeer1_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(1024);
 BA.debugLineNum = 396;BA.debugLine="Select Action";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 398;BA.debugLine="draggingLeer1 = True";
Debug.ShouldStop(8192);
controlador1._draggingleer1 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 399;BA.debugLine="xOffsetLeer1 = X";
Debug.ShouldStop(16384);
controlador1._xoffsetleer1 = _x;
 BA.debugLineNum = 400;BA.debugLine="yOffsetLeer1 = Y";
Debug.ShouldStop(32768);
controlador1._yoffsetleer1 = _y;
 break; }
case 1: {
 BA.debugLineNum = 403;BA.debugLine="If draggingLeer1 Then";
Debug.ShouldStop(262144);
if (controlador1._draggingleer1.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 404;BA.debugLine="Dim newX As Float = PanelLeer1.Left + (X - xOf";
Debug.ShouldStop(524288);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelleer1.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsetleer1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 405;BA.debugLine="Dim newY As Float = PanelLeer1.Top + (Y - yOff";
Debug.ShouldStop(1048576);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelleer1.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsetleer1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 407;BA.debugLine="PanelLeer1.SetLayout(newX, newY, PanelLeer1.Wi";
Debug.ShouldStop(4194304);
controlador1.mostCurrent._panelleer1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelleer1.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelleer1.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 411;BA.debugLine="draggingLeer1 = False";
Debug.ShouldStop(67108864);
controlador1._draggingleer1 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelleer2_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelLeer2_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,415);
if (RapidSub.canDelegate("panelleer2_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelleer2_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 415;BA.debugLine="Sub PanelLeer2_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 416;BA.debugLine="Select Action";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 418;BA.debugLine="draggingLeer2 = True";
Debug.ShouldStop(2);
controlador1._draggingleer2 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 419;BA.debugLine="xOffsetLeer2 = X";
Debug.ShouldStop(4);
controlador1._xoffsetleer2 = _x;
 BA.debugLineNum = 420;BA.debugLine="yOffsetLeer2 = Y";
Debug.ShouldStop(8);
controlador1._yoffsetleer2 = _y;
 break; }
case 1: {
 BA.debugLineNum = 423;BA.debugLine="If draggingLeer2 Then";
Debug.ShouldStop(64);
if (controlador1._draggingleer2.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 424;BA.debugLine="Dim newX As Float = PanelLeer2.Left + (X - xOf";
Debug.ShouldStop(128);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelleer2.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsetleer2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 425;BA.debugLine="Dim newY As Float = PanelLeer2.Top + (Y - yOff";
Debug.ShouldStop(256);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelleer2.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsetleer2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 427;BA.debugLine="PanelLeer2.SetLayout(newX, newY, PanelLeer2.Wi";
Debug.ShouldStop(1024);
controlador1.mostCurrent._panelleer2.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelleer2.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelleer2.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 431;BA.debugLine="draggingLeer2 = False";
Debug.ShouldStop(16384);
controlador1._draggingleer2 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelonoff1_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelOnOff1_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,483);
if (RapidSub.canDelegate("panelonoff1_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelonoff1_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 483;BA.debugLine="Sub PanelOnOff1_Touch (Action As Int, X As Float,";
Debug.ShouldStop(4);
 BA.debugLineNum = 485;BA.debugLine="Select Action";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 487;BA.debugLine="draggingOnOff1 = True";
Debug.ShouldStop(64);
controlador1._draggingonoff1 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 488;BA.debugLine="xOffsetOnOff1 = X";
Debug.ShouldStop(128);
controlador1._xoffsetonoff1 = _x;
 BA.debugLineNum = 489;BA.debugLine="yOffsetOnOff1 = Y";
Debug.ShouldStop(256);
controlador1._yoffsetonoff1 = _y;
 break; }
case 1: {
 BA.debugLineNum = 492;BA.debugLine="If draggingOnOff1 Then";
Debug.ShouldStop(2048);
if (controlador1._draggingonoff1.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 493;BA.debugLine="Dim newX As Float = PanelOnOff1.Left + (X - xO";
Debug.ShouldStop(4096);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelonoff1.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsetonoff1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 494;BA.debugLine="Dim newY As Float = PanelOnOff1.Top + (Y - yOf";
Debug.ShouldStop(8192);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelonoff1.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsetonoff1}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 496;BA.debugLine="PanelOnOff1.SetLayout(newX, newY, PanelOnOff1.";
Debug.ShouldStop(32768);
controlador1.mostCurrent._panelonoff1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelonoff1.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelonoff1.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 500;BA.debugLine="draggingOnOff1 = False";
Debug.ShouldStop(524288);
controlador1._draggingonoff1 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 503;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelonoff2_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelOnOff2_Touch (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,505);
if (RapidSub.canDelegate("panelonoff2_touch")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","panelonoff2_touch", _action, _x, _y);}
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 505;BA.debugLine="Sub PanelOnOff2_Touch (Action As Int, X As Float,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 507;BA.debugLine="Select Action";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_action,controlador1.mostCurrent._activity.getField(true,"ACTION_DOWN"),controlador1.mostCurrent._activity.getField(true,"ACTION_MOVE"),controlador1.mostCurrent._activity.getField(true,"ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 509;BA.debugLine="draggingOnOff2 = True";
Debug.ShouldStop(268435456);
controlador1._draggingonoff2 = controlador1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 510;BA.debugLine="xOffsetOnOff2 = X";
Debug.ShouldStop(536870912);
controlador1._xoffsetonoff2 = _x;
 BA.debugLineNum = 511;BA.debugLine="yOffsetOnOff2 = Y";
Debug.ShouldStop(1073741824);
controlador1._yoffsetonoff2 = _y;
 break; }
case 1: {
 BA.debugLineNum = 514;BA.debugLine="If draggingOnOff2 Then";
Debug.ShouldStop(2);
if (controlador1._draggingonoff2.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 515;BA.debugLine="Dim newX As Float = PanelOnOff2.Left + (X - xO";
Debug.ShouldStop(4);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelonoff2.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_x,controlador1._xoffsetonoff2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newX", _newx);Debug.locals.put("newX", _newx);
 BA.debugLineNum = 516;BA.debugLine="Dim newY As Float = PanelOnOff2.Top + (Y - yOf";
Debug.ShouldStop(8);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {controlador1.mostCurrent._panelonoff2.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_y,controlador1._yoffsetonoff2}, "-",1, 0))}, "+",1, 0));Debug.locals.put("newY", _newy);Debug.locals.put("newY", _newy);
 BA.debugLineNum = 518;BA.debugLine="PanelOnOff2.SetLayout(newX, newY, PanelOnOff2.";
Debug.ShouldStop(32);
controlador1.mostCurrent._panelonoff2.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, _newx)),(Object)(BA.numberCast(int.class, _newy)),(Object)(controlador1.mostCurrent._panelonoff2.runMethod(true,"getWidth")),(Object)(controlador1.mostCurrent._panelonoff2.runMethod(true,"getHeight")));
 };
 break; }
case 2: {
 BA.debugLineNum = 522;BA.debugLine="draggingOnOff2 = False";
Debug.ShouldStop(512);
controlador1._draggingonoff2 = controlador1.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private FileName1 As String = \"Controlador1.txt\"";
controlador1._filename1 = BA.ObjectToString("Controlador1.txt");
 //BA.debugLineNum = 12;BA.debugLine="Dim Timer1 As Timer";
controlador1._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (controlador1) ","controlador1",2,controlador1.mostCurrent.activityBA,controlador1.mostCurrent,1269);
if (RapidSub.canDelegate("timer1_tick")) { return b4a.example.controlador1.remoteMe.runUserSub(false, "controlador1","timer1_tick");}
 BA.debugLineNum = 1269;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1270;BA.debugLine="Log(\"Timer ticked!\")";
Debug.ShouldStop(2097152);
controlador1.mostCurrent.__c.runVoidMethod ("LogImpl","23145729",RemoteObject.createImmutable("Timer ticked!"),0);
 BA.debugLineNum = 1271;BA.debugLine="DoAllStuff";
Debug.ShouldStop(4194304);
_doallstuff();
 BA.debugLineNum = 1272;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}