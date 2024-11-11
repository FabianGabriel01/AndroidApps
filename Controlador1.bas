B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Private FileName1 As String = "Controlador1.txt"
	
	Dim Timer1 As Timer
	

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	'region Config
	Private btnConfig As Button
	Private pnlSlidingConfig As Panel
	Private isPanelVisibleConfig As Boolean
	Private EditTextIP As EditText
	Private EditTextPort As EditText
	Private ConnectPLC As Button
	
	'region Creations
	Private btnCreations As Button
	Private pnlSlidingCreations As Panel
	Private isPanelVisibleCreations As Boolean
	
	'''CREATIONS BTNS!!!!!!!!!
	Private LabelCreations As Label
	Private btnLeerHR As Button
	Private btnEscribirHR As Button
	Private btnONOFF As Button
	Private btnHOLD As Button
	
	
	Dim LeerHRViews As Int = 0
	Dim EscribirHRViews As Int = 0
	Dim OnOffViews As Int = 0
	Dim HoldViews As Int = 0
	Dim TotalViews As Int = 0
	
	
	''REGION LEER PANELS
	Dim PanelLeer1 As Panel
	Dim xOffsetLeer1 As Float
	Dim yOffsetLeer1 As Float
	Dim draggingLeer1 As Boolean
	
	Dim Direccion1 As EditText
	Dim Direccion1Res As EditText
	
	Dim PanelLeer2 As Panel
	Dim xOffsetLeer2 As Float
	Dim yOffsetLeer2 As Float
	Dim draggingLeer2 As Boolean
	
	Dim Direccion2 As EditText
	Dim Direccion2Res As EditText
	
	'''REGION ESCRIBIR PANELS
	Dim PanelEscribir1 As Panel
	Dim xOffsetEscribir1 As Float
	Dim yOffsetEscribir1 As Float
	Dim draggingEscribir1 As Boolean
	
	Dim Direccion1Escribir As EditText
	Dim Direccion1EscribirValor As EditText
	Dim Direccion1EscribirBTN As Button
	
	Dim PanelEscribir2 As Panel
	Dim xOffsetEscribir2 As Float
	Dim yOffsetEscribir2 As Float
	Dim draggingEscribir2 As Boolean
	
	Dim Direccion2Escribir As EditText
	Dim Direccion2EscribirValor As EditText
	Dim Direccion2EscribirBTN As Button
	
	'''REGION ON OFF
	Dim PanelOnOff1 As Panel
	Dim xOffsetOnOff1 As Float
	Dim yOffsetOnOff1 As Float
	Dim draggingOnOff1 As Boolean
	
	Dim Direccion1OnOff As EditText
	Dim BTN1OnOff As Button
	
	Dim PanelOnOff2 As Panel
	Dim xOffsetOnOff2 As Float
	Dim yOffsetOnOff2 As Float
	Dim draggingOnOff2 As Boolean
	
	Dim Direccion2OnOff As EditText
	Dim BTN2OnOff As Button
	
	'''REGION HOLD
	Dim PanelHold1 As Panel
	Dim xOffsetHold1 As Float
	Dim yOffsetHold1 As Float
	Dim draggingHold1 As Boolean
	
	Dim Direccion1Hold As EditText
	Dim BTN1Hold As Button
	
	Dim PanelHold2 As Panel
	Dim xOffsetHold2 As Float
	Dim yOffsetHold2 As Float
	Dim draggingHold2 As Boolean
	
	Dim Direccion2Hold As EditText
	Dim BTN2Hold As Button
	
	
	'''CONNECTION PARAMS
	Private ModbusClient As ModbusTCP
	Private COMParameters As ConnectionParams
	Private ModbusState As Boolean = False
	
	
	'''graphs BTNSSS!!!!!!!!!
	Dim Graph As Button
	Private pnlSlideGraph As Panel
	Private isPanelVisibleGraph As Boolean
	Private LineChart1 As xChart
	
	
	
	


End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	' Set the activity layout
	Activity.LoadLayout("Controlador1")

	' Initialize variables
	isPanelVisibleConfig = False
	isPanelVisibleCreations = False
	
	EditTextIP.Initialize("IP")
	EditTextPort.Initialize("PORT")
	ConnectPLC.Initialize("ConnectPLC")

	' Create and configure the mini button
	btnConfig.Initialize("btnConfig")
	btnConfig.Text = "C"
	btnConfig.Width = 50dip ' 5x5 in dp
	btnConfig.Height = 50dip
	btnConfig.Color = Colors.Red ' Set button color
	Activity.AddView(btnConfig, 0, 0, btnConfig.Width, btnConfig.Height)

	' Create and configure the sliding panel
	pnlSlidingConfig.Initialize("")
	pnlSlidingConfig.Color = Colors.LightGray
	pnlSlidingConfig.Width = 100%x
	pnlSlidingConfig.Height = 250dip
	pnlSlidingConfig.Left = -pnlSlidingConfig.Width ' Start off-screen
	Activity.AddView(pnlSlidingConfig, pnlSlidingConfig.Left, 0, pnlSlidingConfig.Width, pnlSlidingConfig.Height)
	
	
	
	
	EditTextIP.Hint = "Dirección IP"
	EditTextIP.HintColor = Colors.Black
	EditTextIP.InputType = EditTextIP.INPUT_TYPE_TEXT
	pnlSlidingConfig.AddView(EditTextIP, 10%x, 5%y, 80%x, 50dip)
	
	EditTextPort.Hint = "PUERTO"
	EditTextPort.HintColor = Colors.Black
	EditTextPort.InputType = EditTextPort.INPUT_TYPE_TEXT
	pnlSlidingConfig.AddView(EditTextPort, 10%x, 13%y, 80%x, 50dip)
	
	ConnectPLC.Text = "Conectar"
	pnlSlidingConfig.AddView(ConnectPLC, 10%x, 23%y, 80%x, 50dip)
	
	''''''''''''''CREATIONS REGION!!!!!!!!!
	' Create and configure the mini button
	btnCreations.Initialize("btnCreations")
	btnCreations.Text = "+"
	btnCreations.Width = 50dip ' 5x5 in dp
	btnCreations.Height = 50dip
	btnCreations.Color = Colors.Blue ' Set button color
	Activity.AddView(btnCreations, 0, 8%y, btnCreations.Width, btnCreations.Height)

	' Create and configure the sliding panel
	pnlSlidingCreations.Initialize("")
	pnlSlidingCreations.Color = Colors.LightGray
	pnlSlidingCreations.Width = 100%x
	pnlSlidingCreations.Height = 250dip
	pnlSlidingCreations.Left = -pnlSlidingCreations.Width ' Start off-screen
	Activity.AddView(pnlSlidingCreations, pnlSlidingCreations.Left, 0, pnlSlidingCreations.Width, pnlSlidingCreations.Height)
	
	LabelCreations.Initialize("")
	LabelCreations.Text = "Maximo 2 Vistas por Acción, 8 vistas en total"
	pnlSlidingCreations.AddView(LabelCreations, 15%x, 2%y, 80%x, 50dip)
	
	btnLeerHR.Initialize("LeerHR")
	btnLeerHR.Text = "Leer Holding Registers"
	pnlSlidingCreations.AddView(btnLeerHR, 10%x, 4%y, 80%x, 50dip)
	
	btnEscribirHR.Initialize("EscribirHR")
	btnEscribirHR.Text = "Escribir Holding Registers"
	pnlSlidingCreations.AddView(btnEscribirHR, 10%x, 10%y, 80%x, 50dip)
	
	btnONOFF.Initialize("ONOFF")
	btnONOFF.Text = "BOTON ON OFF"
	pnlSlidingCreations.AddView(btnONOFF, 10%x, 16%y, 80%x, 50dip)
	
	btnHOLD.Initialize("HOLD")
	btnHOLD.Text = "BOTON HOLD"
	pnlSlidingCreations.AddView(btnHOLD, 10%x, 22%y, 80%x, 50dip)
	
	'''''''''''''''''PANELS
	
	' Create the panel and add it to the activity
	''''LECTURAS
	PanelLeer1.Initialize("PanelLeer1")
	PanelLeer1.Color = Colors.Cyan
	PanelLeer1.Enabled = False
	PanelLeer1.Visible = False
	Direccion1.Initialize("Direccion1")
	Direccion1.Hint = "# Reg a Leer"
	Direccion1Res.Initialize("Direccion1Res")
	Direccion1Res.Hint = "              Valor"
	Direccion1Res.Enabled = False
	Activity.AddView(PanelLeer1, 100dip, 200dip, 200dip, 120dip) ' Set initial position and size
	PanelLeer1.AddView(Direccion1, 0dip, 0dip, 190dip, 50dip)
	PanelLeer1.AddView(Direccion1Res, 0dip, 50dip, 190dip, 50dip)
	
	PanelLeer2.Initialize("PanelLeer2")
	PanelLeer2.Color = Colors.White
	PanelLeer2.Enabled = False
	PanelLeer2.Visible = False
	Direccion2.Initialize("Direccion2")
	Direccion2.Hint = "# Reg a Leer"
	Direccion2Res.Initialize("Direccion2Res")
	Direccion2Res.Hint = "              Valor"
	Direccion2Res.Enabled = False
	Activity.AddView(PanelLeer2, 10dip, 300dip, 200dip, 120dip) ' Set initial position and size
	PanelLeer2.AddView(Direccion2, 0dip, 0dip, 190dip, 50dip)
	PanelLeer2.AddView(Direccion2Res, 0dip, 50dip, 190dip, 50dip)
	
	
	'''''ESCRITURAS
	PanelEscribir1.Initialize("PanelEscribir1")
	PanelEscribir1.Color = Colors.DarkGray
	PanelEscribir1.Enabled = False
	PanelEscribir1.Visible = False
	Direccion1Escribir.Initialize("Direccion1Escribir")
	Direccion1Escribir.Hint = "#Reg a Escribir"
	Direccion1EscribirValor.Initialize("Direccion1EscribirValor")
	Direccion1EscribirValor.Hint = "Valor"
	Direccion1EscribirValor.HintColor = Colors.Cyan
	Direccion1EscribirValor.TextColor = Colors.Cyan
	Direccion1EscribirValor.Enabled = False
	Direccion1EscribirBTN.Initialize("Direccion1EscribirBTN")
	Direccion1EscribirBTN.Text = "Mandar a Registro"
	Activity.AddView(PanelEscribir1, 100dip, 200dip, 200dip, 150dip)
	PanelEscribir1.AddView(Direccion1Escribir, 0dip, 0dip, 190dip, 50dip)
	PanelEscribir1.AddView(Direccion1EscribirValor, 0dip, 50dip, 190dip, 50dip)
	PanelEscribir1.AddView(Direccion1EscribirBTN, 0dip, 100dip, 190dip, 50dip)
	
	PanelEscribir2.Initialize("PanelEscribir2")
	PanelEscribir2.Color = Colors.DarkGray
	PanelEscribir2.Enabled = False
	PanelEscribir2.Visible = False
	Direccion2Escribir.Initialize("Direccion2Escribir")
	Direccion2Escribir.Hint = "#Reg a Escribir"
	Direccion2EscribirValor.Initialize("Direccion2EscribirValor")
	Direccion2EscribirValor.Hint = "Valor"
	Direccion2EscribirValor.Enabled = False
	Direccion2EscribirValor.HintColor = Colors.Cyan
	Direccion2EscribirValor.TextColor = Colors.Cyan
	Direccion2EscribirBTN.Initialize("Direccion2EscribirBTN")
	Direccion2EscribirBTN.Text = "Mandar a Registro"
	Activity.AddView(PanelEscribir2, 100dip, 200dip, 200dip, 150dip)
	PanelEscribir2.AddView(Direccion2Escribir, 0dip, 0dip, 190dip, 50dip)
	PanelEscribir2.AddView(Direccion2EscribirValor, 0dip, 50dip, 190dip, 50dip)
	PanelEscribir2.AddView(Direccion2EscribirBTN, 0dip, 100dip, 190dip, 50dip)
	
	''''''''''ON OFF
	PanelOnOff1.Initialize("PanelOnOff1")
	PanelOnOff1.Color = Colors.LightGray
	PanelOnOff1.Enabled = False
	PanelOnOff1.Visible = False
	Direccion1OnOff.Initialize("Direccion1OnOff")
	Direccion1OnOff.Hint = "#Reg On/OFF"
	BTN1OnOff.Initialize("BTN1OnOff")
	BTN1OnOff.Text = "Encender/Apagar"
	Activity.AddView(PanelOnOff1, 100dip, 200dip, 200dip, 120dip)
	PanelOnOff1.AddView(Direccion1OnOff, 0dip, 0dip, 190dip, 50dip)
	PanelOnOff1.AddView(BTN1OnOff, 0dip, 50dip, 190dip, 50dip)
	
	PanelOnOff2.Initialize("PanelOnOff2")
	PanelOnOff2.Color = Colors.LightGray
	PanelOnOff2.Enabled = False
	PanelOnOff2.Visible = False
	Direccion2OnOff.Initialize("Direccion2OnOff")
	Direccion2OnOff.Hint = "#Reg On/OFF"
	BTN2OnOff.Initialize("BTN2OnOff")
	BTN2OnOff.Text = "Encender/Apagar"
	Activity.AddView(PanelOnOff2, 100dip, 200dip, 200dip, 120dip)
	PanelOnOff2.AddView(Direccion2OnOff, 0dip, 0dip, 190dip, 50dip)
	PanelOnOff2.AddView(BTN2OnOff, 0dip, 50dip, 190dip, 50dip)
	
	''''''''''''''''HOLD!!!
	PanelHold1.Initialize("PanelHold1")
	PanelHold1.Color = Colors.Magenta
	PanelHold1.Enabled = False
	PanelHold1.Visible = False
	Direccion1Hold.Initialize("Direccion1Hold")
	Direccion1Hold.Hint = "#Reg"
	BTN1Hold.Initialize("BTN1Hold")
	BTN1Hold.Text = "HOLD"
	Activity.AddView(PanelHold1, 100dip, 200dip, 200dip, 120dip)
	PanelHold1.AddView(Direccion1Hold, 0dip, 0dip, 190dip, 50dip)
	PanelHold1.AddView(BTN1Hold, 0dip, 50dip, 190dip, 50dip)
	
	
	PanelHold2.Initialize("PanelHold2")
	PanelHold2.Color = Colors.Magenta
	PanelHold2.Enabled = False
	PanelHold2.Visible = False
	Direccion2Hold.Initialize("Direccion2Hold")
	Direccion2Hold.Hint = "#Reg"
	BTN2Hold.Initialize("BTN2Hold")
	BTN2Hold.Text = "HOLD"
	Activity.AddView(PanelHold2, 100dip, 200dip, 200dip, 120dip)
	PanelHold2.AddView(Direccion2Hold, 0dip, 0dip, 190dip, 50dip)
	PanelHold2.AddView(BTN2Hold, 0dip, 50dip, 190dip, 50dip)
	
	
	Graph.Initialize("Graph")	
	Graph.Text = "G"
	Graph.Width = 50dip ' 5x5 in dp
	Graph.Height = 50dip
	Graph.Color = Colors.White ' Set button color
	Activity.AddView(Graph, 87%x, 0, Graph.Width, Graph.Height)
	
'	pnlSlideGraph.Initialize("")
'	pnlSlideGraph.Color = Colors.LightGray
'	pnlSlideGraph.Width = 100%x
'	pnlSlideGraph.Height = 400dip
'	pnlSlideGraph.Left = pnlSlideGraph.Width ' Start off-screen
'	Activity.AddView(pnlSlideGraph, pnlSlideGraph.Left, 0, pnlSlideGraph.Width, pnlSlideGraph.Height)
	pnlSlideGraph.Left = pnlSlideGraph.Width
	
	' Initialize the line data
	'LineChart1.Initialize(Me, "")
	LineChart1.ClearData
	
	LineChart1.Title = "Temperatura"
	LineChart1.XAxisName = "Tiempo"
	LineChart1.YAxisName = "Values"
'	LineChart1.YAxisName = ""
	LineChart1.IncludeLegend = True
	LineChart1.YScaleMaxValue = 1
	LineChart1.YScaleMinValue = -1
	LineChart1.IncludeLegend = "BOTTOM"
	LineChart1.AutomaticScale = True
'	LineChart1.AutomaticScale = False
'	LineChart1.XScaleTextOrientation = "VERTICAL"
	LineChart1.XScaleTextOrientation = "45 DEGREES"
'	LineChart1.YScaleLogaritmic = True
'	LineChart1.ScaleYValuesLog = "1!1.5!2!3!5!7!10"
	
	LineChart1.AddLine("Temperatura", 0) '0 = random color


	'pnlSlideGraph.AddView(LineChart1, 0,0, pnlSlideGraph.Width, pnlSlideGraph.Height)
	LineChart1.AddLinePointData("Tiempo", 0, True)
'	LineChart1.AddLinePointData("Time2", 10, True)
'	LineChart1.AddLinePointData("Time3", 100, True)
'	LineChart1.AddLinePointData("Time4", 1000, True)
'	LineChart1.AddLinePointData("Time5", 10000, True)
'	LineChart1.AddLinePointData("Time6", 100000, True)
	LineChart1.ZoomBarEnabled = True
	
	LineChart1.DrawChart
	
	

	FirstTimeCreated

End Sub

Sub PanelLeer1_Touch (Action As Int, X As Float, Y As Float)
	Select Action
		Case Activity.ACTION_DOWN
			draggingLeer1 = True
			xOffsetLeer1 = X
			yOffsetLeer1 = Y

		Case Activity.ACTION_MOVE
			If draggingLeer1 Then
				Dim newX As Float = PanelLeer1.Left + (X - xOffsetLeer1)
				Dim newY As Float = PanelLeer1.Top + (Y - yOffsetLeer1)
				' Update the panel position
				PanelLeer1.SetLayout(newX, newY, PanelLeer1.Width, PanelLeer1.Height)
			End If

		Case Activity.ACTION_UP
			draggingLeer1 = False
	End Select
End Sub

Sub PanelLeer2_Touch (Action As Int, X As Float, Y As Float)
	Select Action
		Case Activity.ACTION_DOWN
			draggingLeer2 = True
			xOffsetLeer2 = X
			yOffsetLeer2 = Y

		Case Activity.ACTION_MOVE
			If draggingLeer2 Then
				Dim newX As Float = PanelLeer2.Left + (X - xOffsetLeer2)
				Dim newY As Float = PanelLeer2.Top + (Y - yOffsetLeer2)
				' Update the panel position
				PanelLeer2.SetLayout(newX, newY, PanelLeer2.Width, PanelLeer2.Height)
			End If

		Case Activity.ACTION_UP
			draggingLeer2 = False
	End Select
End Sub

Sub PanelEscribir1_Touch (Action As Int, X As Float, Y As Float)
	
	Select Action
		Case Activity.ACTION_DOWN
			draggingEscribir1 = True
			xOffsetEscribir1= X
			yOffsetEscribir1 = Y

		Case Activity.ACTION_MOVE
			If draggingEscribir1 Then
				Dim newX As Float = PanelEscribir1.Left + (X - xOffsetEscribir1)
				Dim newY As Float = PanelEscribir1.Top + (Y - yOffsetEscribir1)
				' Update the panel position
				PanelEscribir1.SetLayout(newX, newY, PanelEscribir1.Width, PanelEscribir1.Height)
			End If

		Case Activity.ACTION_UP
			draggingEscribir1 = False
	End Select
	
	
End Sub



Sub PanelEscribir2_Touch (Action As Int, X As Float, Y As Float)
	
	Select Action
		Case Activity.ACTION_DOWN
			draggingEscribir2 = True
			xOffsetEscribir2 = X
			yOffsetEscribir2 = Y

		Case Activity.ACTION_MOVE
			If draggingEscribir2 Then
				Dim newX As Float = PanelEscribir2.Left + (X - xOffsetEscribir2)
				Dim newY As Float = PanelEscribir2.Top + (Y - yOffsetEscribir2)
				' Update the panel position
				PanelEscribir2.SetLayout(newX, newY, PanelEscribir2.Width, PanelEscribir2.Height)
			End If

		Case Activity.ACTION_UP
			draggingEscribir2 = False
	End Select
	
	
End Sub

Sub PanelOnOff1_Touch (Action As Int, X As Float, Y As Float)
	
	Select Action
		Case Activity.ACTION_DOWN
			draggingOnOff1 = True
			xOffsetOnOff1 = X
			yOffsetOnOff1 = Y

		Case Activity.ACTION_MOVE
			If draggingOnOff1 Then
				Dim newX As Float = PanelOnOff1.Left + (X - xOffsetOnOff1)
				Dim newY As Float = PanelOnOff1.Top + (Y - yOffsetOnOff1)
				' Update the panel position
				PanelOnOff1.SetLayout(newX, newY, PanelOnOff1.Width, PanelOnOff1.Height)
			End If

		Case Activity.ACTION_UP
			draggingOnOff1 = False
	End Select
	
End Sub

Sub PanelOnOff2_Touch (Action As Int, X As Float, Y As Float)
	
	Select Action
		Case Activity.ACTION_DOWN
			draggingOnOff2 = True
			xOffsetOnOff2 = X
			yOffsetOnOff2 = Y

		Case Activity.ACTION_MOVE
			If draggingOnOff2 Then
				Dim newX As Float = PanelOnOff2.Left + (X - xOffsetOnOff2)
				Dim newY As Float = PanelOnOff2.Top + (Y - yOffsetOnOff2)
				' Update the panel position
				PanelOnOff2.SetLayout(newX, newY, PanelOnOff2.Width, PanelOnOff2.Height)
			End If

		Case Activity.ACTION_UP
			draggingOnOff2 = False
	End Select
	
End Sub

Sub PanelHold1_Touch (Action As Int, X As Float, Y As Float)
	
	Select Action
		Case Activity.ACTION_DOWN
			draggingHold1 = True
			xOffsetHold1 = X
			yOffsetHold1 = Y

		Case Activity.ACTION_MOVE
			If draggingHold1 Then
				Dim newX As Float = PanelHold1.Left + (X - xOffsetHold1)
				Dim newY As Float = PanelHold1.Top + (Y - yOffsetHold1)
				' Update the panel position
				PanelHold1.SetLayout(newX, newY, PanelHold1.Width, PanelHold1.Height)
			End If

		Case Activity.ACTION_UP
			draggingHold1 = False
	End Select
	
End Sub


Sub PanelHold2_Touch (Action As Int, X As Float, Y As Float)
	
	Select Action
		Case Activity.ACTION_DOWN
			draggingHold2 = True
			xOffsetHold2 = X
			yOffsetHold2 = Y

		Case Activity.ACTION_MOVE
			If draggingHold2 Then
				Dim newX As Float = PanelHold2.Left + (X - xOffsetHold2)
				Dim newY As Float = PanelHold2.Top + (Y - yOffsetHold2)
				' Update the panel position
				PanelHold2.SetLayout(newX, newY, PanelHold2.Width, PanelHold2.Height)
			End If

		Case Activity.ACTION_UP
			draggingHold2 = False
	End Select
	
End Sub

Sub Graph_Click
	Log("Boton Graficador")
	Log(isPanelVisibleGraph)
	If isPanelVisibleGraph Then
		' Slide the panel out
		AnimationPanel(100, 550, pnlSlideGraph)
		isPanelVisibleGraph = False
		pnlSlideGraph.Left = 550dip
		btnCreations.Visible = True
		btnConfig.Visible = True
		'btnCreations.Enabled = True
	Else
		' Slide the panel in
		AnimationPanel(550, 100, pnlSlideGraph)
		isPanelVisibleGraph = True
		pnlSlideGraph.Left = 0dip
		'pnlSlidingConfig.BringToFront
		'EditTextIP.BringToFront

		Graph.BringToFront
		btnCreations.Visible = False
		btnConfig.Visible = False
	End If
	'isPanelVisible = Not(isPanelVisible)
End Sub



Sub btnConfig_Click
	Log("Boton Configuration")
	Log(isPanelVisibleConfig)
	If isPanelVisibleConfig Then
		' Slide the panel out
		AnimationPanel(1000, 0, pnlSlidingConfig)
		isPanelVisibleConfig = False
		pnlSlidingConfig.Left = -550dip
		btnCreations.Visible = True
		'btnCreations.Enabled = True
	Else
		' Slide the panel in
		AnimationPanel(-550, 100, pnlSlidingConfig)
		isPanelVisibleConfig = True
		pnlSlidingConfig.Left = 0dip
		'pnlSlidingConfig.BringToFront
		'EditTextIP.BringToFront

		btnConfig.BringToFront
		btnCreations.Visible = False
	End If
	'isPanelVisible = Not(isPanelVisible)
End Sub

Sub btnCreations_Click
	Log("Boton Creations")
	Log(isPanelVisibleCreations)
	If isPanelVisibleCreations Then
		' Slide the panel out
		AnimationPanel(1000, 0, pnlSlidingCreations)
		isPanelVisibleCreations = False
		pnlSlidingCreations.Left = -550dip
		btnConfig.Visible = True
	Else
		' Slide the panel in
		AnimationPanel(-550, 100, pnlSlidingCreations)
		isPanelVisibleCreations = True
		pnlSlidingCreations.Left = 0dip
		btnConfig.Visible = False
	End If
End Sub

Sub AnimationPanel(fromX As Int, toX As Int, Obj As View)
	Dim anim As Animation
	anim.InitializeTranslate("SlideAnimation", fromX, 0, toX, 0)
	anim.Duration = 300 ' Animation duration in milliseconds
	anim.Start(Obj)
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	Timer1.Enabled = False ' Stop the timer when activity pauses
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		Log("BACK PRESSED")
		Activity.Finish
		StartActivity(Main)
	End If
	Return True
	
End Sub

Sub LeerHR_Click
	If CheckViewsLeerHR <=1 Then
		
		If CheckViewsLeerHR == 0 Then
			PanelLeer1.Enabled = True
			PanelLeer1.Visible = True
		Else If CheckViewsLeerHR == 1 Then
			PanelLeer2.Enabled = True
			PanelLeer2.Visible = True
		End If
		
		Log("LEER HR")
		Dim Writer As TextWriter
		Writer.Initialize(File.OpenOutput(File.DirInternal,FileName1,True))
		Writer.WriteLine("Lectura")
		Writer.Close
		
		
	Else
		ToastMessageShow("Maximas Vistas Alcanzadas", False)
		
	End If
	
End Sub

Sub LeerHR_LongClick
	If CheckViewsLeerHR <=2 And CheckViewsLeerHR > 0 Then
		Log("Eliminando Lectura")
		Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
		Log(LoadedInfo)
		If LoadedInfo == "" Then
			Log("Sin Vistas")
			Return
		Else
			Msgbox2Async("Eliminar vistas para Lectura HoldingRegisters?", "Lecturas HRs", "SI", "Cancel", "NO", Null, False)
			Wait For Msgbox_Result (Result As Int)
			If Result = DialogResponse.POSITIVE Then
				Dim index As Int = LoadedInfo.IndexOf("Lectura")
				If index <> -1 Then
					index = index + 1 ' Move past the last found index
					Dim textToSave As String = ""
					Dim after As String = LoadedInfo.Replace("Lectura", "")
					Log("DESPUES: "&after)
					File.WriteString(File.DirInternal, FileName1, textToSave) ' Write text to file
				
					File.WriteString(File.DirInternal, FileName1, after) ' Write text to file
					
					PanelLeer1.Enabled = False
					PanelLeer1.Visible = False
		
					PanelLeer2.Enabled = False
					PanelLeer2.Visible = False
					
					
					Return
				End If
			End If	
		End If
	Else
		ToastMessageShow("Ninguna Vista para Borrar!!", False)
	End If
	
End Sub

Sub EscribirHR_Click
	
	If CheckViewsEscribirHR <= 1 Then
		
		If CheckViewsEscribirHR == 0 Then
			PanelEscribir1.Enabled = True
			PanelEscribir1.Visible = True
		Else If CheckViewsEscribirHR == 1 Then
			PanelEscribir2.Enabled = True
			PanelEscribir2.Visible = True
		End If
		Log("ESCRIBIR HR")
		Dim Writer As TextWriter
		Writer.Initialize(File.OpenOutput(File.DirInternal,FileName1,True))
		Writer.WriteLine("Escritura")
		Writer.Close
		'Return	
	Else
		ToastMessageShow("Maximas Vistas Alcanzadas", False)
	End If
	
End Sub


Sub EscribirHR_LongClick
	If CheckViewsEscribirHR <=2 And CheckViewsEscribirHR > 0 Then
		Log("Eliminando Lectura")
		Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
		Log(LoadedInfo)
		If LoadedInfo == "" Then
			Log("Sin Vistas")
			Return
		Else
			Msgbox2Async("Eliminar vistas para Escritura HoldingRegisters?", "Escrituras HRs", "SI", "Cancel", "NO", Null, False)
			Wait For Msgbox_Result (Result As Int)
			If Result = DialogResponse.POSITIVE Then
				Dim index As Int = LoadedInfo.IndexOf("Escritura")
				If index <> -1 Then
					index = index + 1 ' Move past the last found index
					Dim textToSave As String = ""
					Dim after As String = LoadedInfo.Replace("Escritura", "")
					Log("DESPUES: "&after)
					File.WriteString(File.DirInternal, FileName1, textToSave) ' Write text to file
				
					File.WriteString(File.DirInternal, FileName1, after) ' Write text to file
					
					PanelEscribir1.Enabled = False
					PanelEscribir1.Visible = False
		
					PanelEscribir2.Enabled = False
					PanelEscribir2.Visible = False
					
					
					Return
				End If
			End If
		End If
	Else
		Log(CheckViewsEscribirHR)
		If CheckViewsEscribirHR > 2 Then
			Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
			Log(LoadedInfo)
			Dim index As Int = LoadedInfo.IndexOf("Escritura")
			Log(index)
			If index <> -1 Then
				index = index + 1 ' Move past the last found index
				Dim textToSave As String = ""
				Dim after As String = LoadedInfo.Replace("Escritura", "")
				Log("DESPUES: "&after)
				File.WriteString(File.DirInternal, FileName1, textToSave) ' Write text to file
				
				File.WriteString(File.DirInternal, FileName1, after) ' Write text to file
				Return
			End If
		End If
		
		ToastMessageShow("Ninguna Vista para Borrar!!", False)
	End If
	
End Sub

Sub ONOFF_Click
	
	If CheckViewsOnOff <= 1 Then
		
		If CheckViewsOnOff == 0 Then
			PanelOnOff1.Enabled = True
			PanelOnOff1.Visible = True
		Else If CheckViewsOnOff == 1 Then
			PanelOnOff2.Enabled = True
			PanelOnOff2.Visible = True
		End If
		
		Log("ON OFF")
		Dim Writer As TextWriter
		Writer.Initialize(File.OpenOutput(File.DirInternal,FileName1,True))
		Writer.WriteLine("OnOff")
		Writer.Close
		'Return
	Else
		ToastMessageShow("Maximas Vistas Alcanzadas", False)
	End If
	

	
End Sub

Sub ONOFF_LongClick

	If CheckViewsOnOff <=2 And CheckViewsOnOff > 0 Then
		Log("Eliminando Lectura")
		Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
		Log(LoadedInfo)
		If LoadedInfo == "" Then
			Log("Sin Vistas")
			Return
		Else
			Msgbox2Async("Eliminar vistas para Acción OnOff?", "APAGADO / ENCENDIDO", "SI", "Cancel", "NO", Null, False)
			Wait For Msgbox_Result (Result As Int)
			If Result = DialogResponse.POSITIVE Then
				Dim index As Int = LoadedInfo.IndexOf("OnOff")
				If index <> -1 Then
					index = index + 1 ' Move past the last found index
					Dim textToSave As String = ""
					Dim after As String = LoadedInfo.Replace("OnOff", "")
					Log("DESPUES: "&after)
					File.WriteString(File.DirInternal, FileName1, textToSave) ' Write text to file
				
					File.WriteString(File.DirInternal, FileName1, after) ' Write text to file
					
					PanelOnOff1.Enabled = False
					PanelOnOff1.Visible = False
					
					PanelOnOff2.Enabled = False
					PanelOnOff2.Visible = False
					
					
					Return
				End If
			End If
		End If
	Else
		ToastMessageShow("Ninguna Vista para Borrar!!", False)
	End If
	
End Sub

Sub HOLD_Click
	
	If CheckViewsHold <= 1 Then
		
		If CheckViewsHold == 0 Then
			PanelHold1.Enabled = True
			PanelHold1.Visible = True
		Else If CheckViewsHold == 1 Then
			PanelHold2.Enabled = True
			PanelHold2.Visible = True
		End If
		Log("HOLD")
		Dim Writer As TextWriter
		Writer.Initialize(File.OpenOutput(File.DirInternal,FileName1,True))
		Writer.WriteLine("Hold")
		Writer.Close
		'Return
		
	Else
		ToastMessageShow("Maximas Vistas Alcanzadas", False)
	End If
	
	

	
End Sub

Sub HOLD_LongClick

	If CheckViewsHold <=2 And CheckViewsHold > 0 Then
		Log("Eliminando Lectura")
		Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
		Log(LoadedInfo)
		If LoadedInfo == "" Then
			Log("Sin Vistas")
			Return
		Else
			Msgbox2Async("Eliminar vistas para Acción OnOff?", "APAGADO / ENCENDIDO", "SI", "Cancel", "NO", Null, False)
			Wait For Msgbox_Result (Result As Int)
			If Result = DialogResponse.POSITIVE Then
				Dim index As Int = LoadedInfo.IndexOf("Hold")
				If index <> -1 Then
					index = index + 1 ' Move past the last found index
					Dim textToSave As String = ""
					Dim after As String = LoadedInfo.Replace("Hold", "")
					Log("DESPUES: "&after)
					File.WriteString(File.DirInternal, FileName1, textToSave) ' Write text to file
					File.WriteString(File.DirInternal, FileName1, after) ' Write text to file
					
					PanelHold1.Enabled = False
					PanelHold1.Visible = False
					
					PanelHold2.Enabled = False
					PanelHold2.Visible = False
					
					Return
				End If
			End If
		End If
	Else
		ToastMessageShow("Ninguna Vista para Borrar!!", False)
	End If
	
End Sub

Sub FirstTimeCreated
	
	If Not (File.Exists(File.DirAssets, FileName1)) Then
		If File.Exists(File.DirInternal, FileName1) Then
			Log("YA Existe")
			ProgressDialogShow("Leyendo 'CONTROLADOR 1'")
			Sleep(3000)
			ProgressDialogHide
			LoadControlador
			Return
		Else
			File.Copy(File.DirAssets, FileName1, File.DirInternal, FileName1)
			ProgressDialogShow("CREANDO 'CONTROLADOR 1'")
			Sleep(3000)
			ProgressDialogHide
			LoadControlador
			Return
		End If
	End If
	
End Sub

Sub CheckViewsLeerHR As Int
	
	Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
	If LoadedInfo == "" Then
		Log("Vacio")
		Return 0
	Else
		Dim count1 As Int = 0
		Dim index1 As Int = 0
			
		Do While index1 > -1
			index1 = LoadedInfo.IndexOf2("Lectura", index1)
			If index1 <> -1 Then
				count1 = count1 + 1
				index1 = index1 + 1 ' Move past the last found index
			End If
		Loop
		Return count1
	End If
	
End Sub

Sub CheckViewsEscribirHR As Int
	
	Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
	If LoadedInfo == "" Then
		Log("Vacio")
		Return 0
	Else
		Dim count1 As Int = 0
		Dim index1 As Int = 0
			
		Do While index1 > -1
			index1 = LoadedInfo.IndexOf2("Escritura", index1)
			If index1 <> -1 Then
				count1 = count1 + 1
				index1 = index1 + 1 ' Move past the last found index
			End If
		Loop
		Return count1
	End If
	
End Sub

Sub CheckViewsOnOff As Int
	
	Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
	If LoadedInfo == "" Then
		Log("Vacio")
		Return 0
	Else
		Dim count1 As Int = 0
		Dim index1 As Int = 0
			
		Do While index1 > -1
			index1 = LoadedInfo.IndexOf2("OnOff", index1)
			If index1 <> -1 Then
				count1 = count1 + 1
				index1 = index1 + 1 ' Move past the last found index
			End If
		Loop
		Return count1
	End If
	
End Sub

Sub CheckViewsHold As Int
	
	Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
	If LoadedInfo == "" Then
		Log("Vacio")
		Return 0
	Else
		Dim count1 As Int = 0
		Dim index1 As Int = 0
			
		Do While index1 > -1
			index1 = LoadedInfo.IndexOf2("Hold", index1)
			If index1 <> -1 Then
				count1 = count1 + 1
				index1 = index1 + 1 ' Move past the last found index
			End If
		Loop
		Return count1
	End If
	
End Sub

Sub LoadControlador
	
	If File.Exists(File.DirInternal, FileName1) Then
		Dim LoadedInfo As String = File.ReadString(File.DirInternal, FileName1)
		Log(LoadedInfo)
		If LoadedInfo == "" Then
			ToastMessageShow("NINGUNA VISTA CREADA!", False)
		Else
			Log("Creando Vistas!")
			LeyendoVistas(LoadedInfo)
		End If
	End If
	
End Sub

Sub LeyendoVistas(Vistas As String)
	
	Log(Vistas)
	
	Dim count1 As Int = 0
	Dim index1 As Int = 0
	
	Dim count2 As Int = 0
	Dim index2 As Int = 0
	
	Dim count3 As Int = 0
	Dim index3 As Int = 0
	
	Dim count4 As Int = 0
	Dim index4 As Int = 0
	
	Do While index1 > -1
		index1 = Vistas.IndexOf2("Lectura", index1)
		If index1 <> -1 Then
			count1 = count1 + 1
			index1 = index1 + 1 ' Move past the last found index
		End If
	Loop
	
	Do While index2 > -1
		index2 = Vistas.IndexOf2("Escritura", index2)
		If index2 <> -1 Then
			count2 = count2 + 1
			index2 = index2 + 1 ' Move past the last found index
		End If
	Loop
	
	Do While index3 > -1
		index3 = Vistas.IndexOf2("OnOff", index3)
		If index3 <> -1 Then
			count3 = count3 + 1
			index3 = index3 + 1 ' Move past the last found index
		End If
	Loop
	
	Do While index4 > -1
		index4 = Vistas.IndexOf2("Hold", index4)
		If index4 <> -1 Then
			count4 = count4 + 1
			index4 = index4 + 1 ' Move past the last found index
		End If
	Loop
		
	Log("The word 'LeerHR' appears: " & count1 & " times.")
	Log("The word 'ESCRIBIR HR' appears: " & count2 & " times.")
	Log("The word 'ON OFF' appears: " & count3 & " times.")
	Log("The word 'HOLD' appears: " & count4 & " times.")
	LeerHRViews = count1
	EscribirHRViews = count2
	OnOffViews = count3
	HoldViews = count4
	TotalViews = count1 + count2 + count3 + count4
	Log("TOTAL VIEWS!!: " & TotalViews)
	
	If count1 > 0 Or count2 > 0 Or count3 > 0 Or count4 > 0 Then
		Log("Creando!")
		CreandoVistas(count1, count2, count3, count4)
	Else
		Log("Sin Vistas")
	End If

End Sub

Sub CreandoVistas(count1 As Int, count2 As Int, count3 As Int, count4 As Int)
	
	If count1 == 0 Then
		PanelLeer1.Enabled = False
		PanelLeer1.Visible = False
		
		PanelLeer2.Enabled = False
		PanelLeer2.Visible = False
		
	Else If count1 == 1 Then
		PanelLeer1.Enabled = True
		PanelLeer1.Visible = True
		
				
		PanelLeer2.Enabled = False
		PanelLeer2.Visible = False
	Else If count1 == 2 Then
		PanelLeer1.Enabled = True
		PanelLeer1.Visible = True
		
		PanelLeer2.Enabled = True
		PanelLeer2.Visible = True
	End If
	
	If count2 == 0 Then
		PanelEscribir1.Enabled = False
		PanelEscribir1.Visible = False
		
		PanelEscribir2.Enabled = False
		PanelEscribir2.Visible = False
		
	Else If count2 == 1 Then
		PanelEscribir1.Enabled = True
		PanelEscribir1.Visible = True
		
				
		PanelEscribir2.Enabled = False
		PanelEscribir2.Visible = False
	Else If count2 == 2 Then
		PanelEscribir1.Enabled = True
		PanelEscribir1.Visible = True
		
		PanelEscribir2.Enabled = True
		PanelEscribir2.Visible = True
	End If
	
	If count3 == 0 Then
		PanelOnOff1.Enabled = False
		PanelOnOff1.Visible = False
		
		PanelOnOff2.Enabled = False
		PanelOnOff2.Visible = False
		
	Else If count3 == 1 Then
		PanelOnOff2.Enabled = True
		PanelOnOff2.Visible = True
		
				
		PanelOnOff2.Enabled = False
		PanelOnOff2.Visible = False
	Else If count3 == 2 Then
		PanelOnOff2.Enabled = True
		PanelOnOff2.Visible = True
		
		PanelOnOff2.Enabled = True
		PanelOnOff2.Visible = True
	End If
	
	If count4 == 0 Then
		PanelHold1.Enabled = False
		PanelHold1.Visible = False
		
		PanelHold2.Enabled = False
		PanelHold2.Visible = False
		
	Else If count4 == 1 Then
		PanelHold1.Enabled = True
		PanelHold1.Visible = True
			
		PanelHold2.Enabled = False
		PanelHold2.Visible = False
	Else If count4 == 2 Then
		PanelHold1.Enabled = True
		PanelHold1.Visible = True
		
		PanelHold2.Enabled = True
		PanelHold2.Visible = True
	End If
	
End Sub


Sub ConnectPLC_Click
	Log("Conectando")
'	Try
'			
'		ModbusClient.Initialize(Me,"ModbusClient",1)
'		COMParameters.Initialize
'		COMParameters = ModbusClient.CreateConnection(Null,502,3600,200)
'		
'	Catch
'		Log(LastException)
'		Msgbox2Async("Looks like no PLC Found, want to SIMULATE?", "PLC ERROR CONNECTION", "Yes", "Cancel", "No", Null, False)
'		Wait For Msgbox_Result (Result As Int)
'		If Result = DialogResponse.POSITIVE Then
'			'...
'			
'			Timer1.Initialize("Timer1", 1000) ' 1 second interval
'			Timer1.Enabled = True ' Start the timer
'			
'			
'			
'			
'		End If
'	End Try

	Msgbox2Async("Looks like no PLC Found, want to SIMULATE?", "PLC ERROR CONNECTION", "Yes", "Cancel", "No", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		'...
			
		Timer1.Initialize("Timer1", 10000) ' 1 second interval
		Timer1.Enabled = True ' Start the timer
			
			
			
			
	End If

	
End Sub

Sub Timer1_Tick
	Log("Timer ticked!")
	DoAllStuff
	' Add your code here to execute on each tick
End Sub

Sub DoAllStuff
	
	Try
		Dim A As Int
		Dim B As Int
		
		A = Rnd(100, 1000)
		B = Rnd(1000, 1100)
		
		Direccion1.Text = A
		Direccion2.Text = B
		
		Dim asdf As String
		DateTime.TimeFormat = "hh:mm:ss"
		asdf = DateTime.Time(DateTime.Now)
		Log(asdf)
		
		LineChart1.AddLinePointData(asdf, A, True)
		
		LineChart1.DrawChart
		
		
		
	Catch
		Log(LastException)
	End Try
	
	
End Sub

'Sub Activity_Resume
'   Timer1.Enabled = True ' Resume the timer if activity resumes
'End Sub
'
'Sub Activity_Pause (UserClosed As Boolean)
'   Timer1.Enabled = False ' Stop the timer when activity pauses
'End Sub

