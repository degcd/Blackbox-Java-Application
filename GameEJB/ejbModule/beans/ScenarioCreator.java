package beans;

import java.awt.Image;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import entities.Answer;
import entities.Messagetype;
import entities.Node;
import entities.NodeMessage;
import exceptions.NodeNotFoundException;

public class ScenarioCreator {

	private static List<Node> scenarioOne = null;
	private static List<Node> scenarioTwo = null;

	public ScenarioCreator() {
		scenarioOne=new LinkedList();
		scenarioTwo=new LinkedList();
		scenarioOne = createScenarioOne();
		scenarioTwo = createScenarioTwo();
	}

	public List<Node> createScenarioOne() {
		List<Node> nodeList = new ArrayList<Node>();

		// Declaring all Nodes
		Node ausgangssituation = null;

		Node a2 = null;
		Node kd42 = null;
		Node sd87 = null;
		Node skd56 = null;
		Node ending1 = null;
		Node c1 = null;
		Node c2 = null;
		Node c3 = null;
		Node c3Alternativ = null;
		Node f1 = null;
		Node f2 = null;
		Node f3 = null;
		Node ending2 = null;
		Node d = null;
		Node d1 = null;
		Node d2 = null;
		Node d3 = null;
		Node g1 = null;
		Node ending4 = null;
		Node e1 = null;
		Node e2 = null;
		Node e3 = null;
		Node e4 = null;
		Node ending5 = null;
		Node ending6 = null;
		Node ending7 = null;

		// Filling Nodes with values
		// Ausgangssituation
		LinkedList<Answer> answersForCurrentNode = new LinkedList<Answer>();
		Answer answer1 = new Answer(
				"Kann das nicht jemand anderes �bernehmen? Ich stecke immer noch in den Ermittlungen bez�glich der Wasserleiche vom Fr�hlinger See fest.",
				ending1);
		answersForCurrentNode.add(answer1);
		Answer answer2 = new Answer("Super, worum geht's?", a2);
		answersForCurrentNode.add(answer2);
		LinkedList<NodeMessage> messageList = new LinkedList<NodeMessage>();
		NodeMessage message1 = new NodeMessage(Messagetype.Text, "Hey Joe, ich hab da einen neuen Fall f�r dich.",
				"Kommissar Thomas");
		messageList.add(message1);
		ausgangssituation = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// a2
		answer1 = new Answer(
				"H�rt sich spannend an. Leider hab ich gerade keinen Droiden frei, der diese Aufgaben �bernehmen kann.",
				ending1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Okay ich schicke schonmal einen Kontaktdroiden los. Leitest du mir die Akte weiter?",
				kd42);
		answersForCurrentNode.add(answer2);
		Answer answer3 = new Answer(
				"Okay ich schicke schonmal einen Spurendroiden los. Leitest du mir die Akte weiter?", sd87);
		answersForCurrentNode.add(answer3);
		Answer answer4 = new Answer(
				"Okay ich schicke schonmal einen Spuren- und Kontaktdroiden los. Leitest du mir die Akte weiter?",
				skd56);
		answersForCurrentNode.add(answer4);
		message1 = new NodeMessage(Messagetype.Text,
				"Eine junge Frau hat soeben einen toten Mann in ihrer Wohnung gefunden. Sie steht jetzt unter Schock. Jemand muss zu ihr, sie befragen und die Spuren m�ssen dort gesichert werden.",
				"Kommissar Thomas");
		messageList.add(message1);
		a2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// Ending1
		message1 = new NodeMessage(Messagetype.Text,
				"Es wurde zu sp�t gehandelt: Circa 30 Minuten nach dem ANruf bei der Polizei hat sich Frau M�ller erinnert, was passiert ist. Sie geriet in Panik und setzte die Wohnung in Flammen. So konnte der Mord und das Motiv nicht aufgekl�rt werden.",
				"Erz�hler");
		messageList.add(message1);
		ending1 = new Node(messageList, answersForCurrentNode);
		messageList.clear();

		// KD42
		answer1 = new Answer("Droide beruhige die Frau", c1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text,
				"Klar. Danke, dass du das �bernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas");
		messageList.add(message1);
		NodeMessage message2 = new NodeMessage(Messagetype.Image, "../ressources/kontaktdaten.jpg", 30,
				"Kommissar Thomas");
		messageList.add(message2);
		NodeMessage message3 = new NodeMessage(Messagetype.Text, "Ich bin bei Frau M�ller angekommen.", "Droide");
		messageList.add(message3);
		NodeMessage messgae4 = new NodeMessage(Messagetype.Image, "../ressources/tatort.jpg", "Droide");
		messageList.add(messgae4);
		kd42 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// SD87
		answer1 = new Answer("Schaue dir den Tartort genauer an und entnehme Proben f�r das Labor", c3);
		answersForCurrentNode.add(answer1);
		message1 = new NodeMessage(Messagetype.Text,
				"Klar. Danke, dass du das �bernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Image, "../ressources/kontaktdaten.jpg", 30, "Kommissar Thomas");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Ich bin bei Frau M�ller angekommen.", "Droide");
		messageList.add(message3);
		messgae4 = new NodeMessage(Messagetype.Image, "../ressources/tatort.jpg", "Droide");
		messageList.add(messgae4);
		sd87 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// SKD56
		answer1 = new Answer("Droide beruhige die Frau", c1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Schaue dir den Tartort genauer an und entnehme Proben f�r das Labor", c3);
		answersForCurrentNode.add(answer3);
		message1 = new NodeMessage(Messagetype.Text,
				"Klar. Danke, dass du das �bernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Image, "../ressources/kontaktdaten.jpg", 30, "Kommissar Thomas");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Ich bin bei Frau M�ller angekommen.", "Droide");
		messageList.add(message3);
		messgae4 = new NodeMessage(Messagetype.Image, "../ressources/tatort.jpg", "Droide");
		messageList.add(messgae4);
		skd56 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// Ending2
		message1 = new NodeMessage(Messagetype.Text,
				"Beim Versuch die Frau zu beruhigen wurde Frau M�ller hysterisch und schlug den Druiden gegen die Wand, sodass er besch�digt wurde und die Verbindung abbrach. W�hrend ein Neustart versucht wurde, hat die Frau alle Beweise beseitigt und einen Brand gelegt. So konnte der Mord und das Motiv nicht aufgekl�rt werden.",
				"Erz�hler");
		messageList.add(message1);
		ending2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// C2
		answer1 = new Answer("Wei� sie, warum ihr Vater un der Wohnung ist?", f1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Hatte jemand einen Grund ihn umzubringen?", f2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Hatte Frau M�ller irgendwelche Feinde oder m�glicherweise berufsbedingt Neider?", f3);
		answersForCurrentNode.add(answer3);
		message1 = new NodeMessage(Messagetype.Text,
				"Beim Opfer handelt es sich um den Vater der Frau. Wir befinden uns in der Wohnung der Frau. Sie hat ihren Vater erstochen aufgefunden als sie vom Einkaufen zur�ckkam.",
				"Droide");
		messageList.add(message1);
		c2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// C3
		answer1 = new Answer("Schaue dich weiter um und halte Ausschau nach der Mordwaffe", d);
		answersForCurrentNode.add(answer1);
		message1 = new NodeMessage(Messagetype.Text,
				"Ich habe Blutproben und Fingerabdr�cke sichergestellt. Eine Drohne ist jetzt auf dem Weg ins Labor. Es sieht nach einer t�dlichen Stichverletzung aus. Es befindet sich keine Mordwaffe am  unmittelbaren Tatort",
				"Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Okay, ich schicke dir den Spu-Si-Trupp zur Unterst�tzung.",
				"Droide");
		messageList.add(message2);
		c3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// C3Alternativ
		answer1 = new Answer("Schaue dich weiter um und halte Ausschau nach der Mordwaffe", d);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Droide beruhige die Frau", c1);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2);
		answersForCurrentNode.add(answer3);
		message1 = new NodeMessage(Messagetype.Text,
				"Ich habe Blutproben und Fingerabdr�cke sichergestellt. Eine Drohne ist jetzt auf dem Weg ins Labor. Es sieht nach einer t�dlichen Stichverletzung aus. Es befindet sich keine Mordwaffe am  unmittelbaren Tatort",
				"Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Okay, ich schicke dir den Spu-Si-Trupp zur Unterst�tzung.",
				"Droide");
		messageList.add(message2);
		c3Alternativ = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// f1
		answer1 = new Answer("Hatte jemand einen Grund ihn umzubringen?", f2);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Hat Frau M�ller irgendwelche Feinde oder m�glicherweise berufsbedingt Neider?", f3);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text,
				"Sie sagt, sie ist als Bloggerin viel unterwegs, deshalb hat er einen Schl�ssel, um ihre Katze zu versorgen",
				"Droide");
		messageList.add(message1);
		f1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// f2
		answer1 = new Answer("Hat Frau M�ller irgendwelche Feinde oder m�glicherweise berufsbedingt Neider?", f3);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Wei� sie, warum ihr Vater un der Wohnung ist?", f1);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Sie wei� nichts von m�glichen Feinden", "Droide");
		messageList.add(message1);
		f2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// f3
		answer1 = new Answer("Sehr gut, lass dir die Email zeigen und leite sie an mich weite.", ending4);
		answersForCurrentNode.add(answer1);
		message1 = new NodeMessage(Messagetype.Text,
				"�Guter Ansatzpunkt. Vielleicht hatte es der M�rder eigentlich auf sie abgesehen und ihr Vater war zur falschen Zeit am falschen Ort�",
				30, "Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Ja, sie hat letztens eine Droh-Email erhalten", "Droide");
		c3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending4
		message1 = new NodeMessage(Messagetype.Text,
				"Als die Frau den Laptop entsperrte, um dem Droiden die omin�se Droh-Email zu zeigen, war direkt ein Video zu sehen. Die Webkam hatte den Mord aufgezeichnet�!! Frau M�ller hat ihren Vater mit einem K�chenmesser erstochen. Als sie dies auf dem Bildschirm sah, wurde sie hysterisch und schlug den Droiden gegen die Wand, sodass er besch�digt wurde und die Verbindung abbrach. W�hrend ein Neustart versucht wurde, hat die Frau die restlichen Beweise beseitigt und einen Brand gelegt. So konnte ihr Motiv nicht aufgkl�rt werden",
				"Erz�hler");
		messageList.add(message1);
		ending4 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// d
		answer1 = new Answer("Geh ins Badezimmer.", d1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Starte in der K�che.", d2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Fang im Wohnzimmer an", d3);
		answersForCurrentNode.add(answer3);
		message1 = new NodeMessage(Messagetype.Text, "Wo soll ich anfangen?", "Droide");
		messageList.add(message1);
		d = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// d1
		answer1 = new Answer(" Epilepsie-Tabletten ", ending5);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Schlaftabletten", ending5);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer(" Schizophrenie-Tabletten", ending6);
		answersForCurrentNode.add(answer3);
		answer4 = new Answer("Magersucht-Tableetten", ending5);
		message1 = new NodeMessage(Messagetype.Image, "../ressources/pillenschrank.jpg", "Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Das ist das einzige Auff�llige, das ich gefunden habe. Kannst du herausfinden, was das f�r Tabletten sind",
				"Droide");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Kannst du mir noch eine Nahaufnahme schicken?", "Ich");
		messageList.add(message3);
		messgae4 = new NodeMessage(Messagetype.Image, "../ressources/medikament.jpg", "Droide");
		messageList.add(messgae4);
		NodeMessage message5 = new NodeMessage(Messagetype.Text, "Ok ich google jetzt", "Ich");
		d1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// d2
		answer1 = new Answer("Schicke eine Drohne mit der m�glichen Mordwaffe los und schau dich weiter um", g1);
		answersForCurrentNode.add(answer1);
		message1 = new NodeMessage(Messagetype.Image, "../ressources/kueche.jpg", "Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Hier wurde gekocht, die Dunstabzugshaube l�uft noch.", 10,
				"Droide");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"In der Sp�le liegt ein K�chenmesser- m�glicherweise die Mordwaffe.", "Droide");
		messageList.add(message3);
		messgae4 = new NodeMessage(Messagetype.Image, "../ressources/messer.jpg", "Droide");
		messageList.add(messgae4);
		message5 = new NodeMessage(Messagetype.Text, "Sehr gut!", "Ich");
		d2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// d3
		answer1 = new Answer("Das ist ja interessant.", ending7);
		answersForCurrentNode.add(answer1);
		message1 = new NodeMessage(Messagetype.Text,
				"Ich habe Frau M�ller ins Bad geschickt, um sich ein wenig frisch zu machen.", 10, "Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ich habe einen Laptop sichergestellt. Es befindet sich darauf ein Video. Anscheinend hat die Webcam den Mord aufgezeichnet.",
				"Droide");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Video, "../ressources/mordvideo.mp4", 10, "Droide");
		d3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// g1
		answer1 = new Answer("Geh ins Bad", d1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Geh ins Wohnzimmer", d3);
		answersForCurrentNode.add(answer2);
		g1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending5
		message1 = new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Frau M�ller ist zwar in der Zwischenzeit verschwunden, jedoch konnten die Mordwaffe, ein K�chenmesser, und ein Beweisvideo, das per Webcam eines Laptops im Wohnzimmer mitgeschnitten wurde, sichergestellt werden. Der Mord konnte somit aufgekl�rt werden. Jedoch wurden die Tabletten falsch identifiziert, sodass das Motiv der Frau unklar bleibt",
				"Erz�hler");
		messageList.add(message2);
		ending5 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending6
		message1 = new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Frau M�ller ist zwar in der Zwischenzeit verschwunden, jedoch konnten die Mordwaffe, ein K�chenmesser, und ein Beweisvideo, das per Webcam eines Laptops im Wohnzimmer mitgeschnitten wurde, sichergestellt werden. Die Tabletten haben die Schizophrenie der Frau aufgedeckt. So konnte sowohl der Mord, als auch das Motiv der Frau aufgekl�rt werden.",
				"Erz�hler");
		messageList.add(message2);
		ending6 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending7
		message1 = new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Als Frau M�ller ins Bad ging, konnte sie sich wieder erinnern, was passiert ist. Sie wurde hysterisch und schlug den Droiden gegen die Wand, sodass er besch�digt wurde und die Verbindung abbrach. W�hrend ein Neustart versucht wurde, hat die Frau die restlichen Beweise beseitigt und einen Brand gelegt. Gl�cklicherweise hatte der Droide schon kurz vorher das Video weitergeleitet, sodass der Mord aufgekl�rt werden konnte. Das Motiv bleibt jedoch unklar aufgrund mangelnder Beweise",
				"Erz�hler");
		messageList.add(message2);
		ending7 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		nodeList.add(ausgangssituation);
		nodeList.add(a2);
		nodeList.add(kd42);
		nodeList.add(sd87);
		nodeList.add(skd56);
		nodeList.add(ending1);
		nodeList.add(c1);
		nodeList.add(c2);
		nodeList.add(c3);
		nodeList.add(c3Alternativ);
		nodeList.add(f1);
		nodeList.add(f2);
		nodeList.add(f3);
		nodeList.add(ending2);
		nodeList.add(d);
		nodeList.add(d1);
		nodeList.add(d2);
		nodeList.add(d3);
		nodeList.add(g1);
		nodeList.add(ending4);
		nodeList.add(e1);
		nodeList.add(e2);
		nodeList.add(e3);
		nodeList.add(e4);
		nodeList.add(ending5);
		nodeList.add(ending6);
		nodeList.add(ending7);
		return nodeList;
	}

	public List<Node> createScenarioTwo() {
		List<Node> nodeList = new ArrayList<Node>();

		// Declaring all Nodes
		Node ausgangssituation = null;		
		Node ending1 = null;
		Node b2 = null;
		Node b3 = null;
		Node c1 = null;
		Node c2 = null;
		Node d1 = null;
		Node d2 = null;
		Node d3 = null;
		Node e1 = null;
		Node e2 = null;
		Node f1 = null;
		Node f2 = null;
		Node f3 = null;
		Node g1 = null;
		Node ending1_g2 = null;
		Node ending1_h1 = null;
		Node h2 = null;
		Node ending1_h3 = null;
		Node j1 = null;
		Node j2 = null;
		Node k1 = null;
		Node k2 = null;
		Node k3 = null;
		Node ending2_k4 = null;
		Node l1 = null;
		Node ending2_l2 = null;
		Node m1 = null;
		Node ending2_m2 = null;
		Node ending3_n1 = null;
		Node n2 = null;
		Node ending3_o1 = null;
		Node ending4_o2 = null;
		Node o3 = null;
		Node ending4_o4 = null;
		Node ending3_p1 = null;
		Node ending5_p2 = null;
		Node ending5_p3 = null;
		Node ending6_p4 = null;
		

		// Filling Nodes with values
		// Ausgangssituation
		LinkedList<Answer> answersForCurrentNode = new LinkedList<Answer>();
		Answer answer1 = new Answer(
				"Okay, dann überlasse ich es ab jetzt dir… falls du einen Schatz findest, sag mal Bescheid.", ending1);
		answersForCurrentNode.add(answer1);
		Answer answer2 = new Answer("Was?? Das kann doch kein Zufall sein!", b2);
		answersForCurrentNode.add(answer2);
		Answer answer3 = new Answer("Wie meinst du das? Woher kennst du die Personen auf dem Band?", b3);
		answersForCurrentNode.add(answer3);
		LinkedList<NodeMessage> messageList = new LinkedList<NodeMessage>();
		NodeMessage message1 = new NodeMessage(Messagetype.Text,
				"Onkel Peter! Du kannst dir nicht vorstellen, was ich gerade gefunden habe! Vielleicht ist es auch nur Fake, aber hier: höre selbst!",
				"Ich");
		messageList.add(message1);
		NodeMessage message2 = new NodeMessage(Messagetype.Voice, "../ressources/aufnahmeBlackbox.mp3", "Ich");
		messageList.add(message2);
		NodeMessage message3 = new NodeMessage(Messagetype.Text, "Kein Fake, ich kenne sie!", "Onkel");
		messageList.add(message3);
		ausgangssituation = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending1
		message1 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler");
		messageList.add(message1);
		ending1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// b2
		answer1 = new Answer("Ähm… Ein Freund hat mich darauf aufmerksam gemacht.", c1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Um ehrlich zu sein… Im Darknet… Ich hab nach dem neusten Shit an Drogen gesucht…", c2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Was?? Das kann doch kein Zufall sein!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ich kann es auch noch nicht fassen. Ich hoffe es geht ihnen gut… Aber sag mal, wo hast du die Aufnahme überhaupt gefunden?",
				"Onkel");
		messageList.add(message2);
		b2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// b3
		answer1 = new Answer("Ähm… Ein Freund hat mich darauf aufmerksam gemacht.", c1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Um ehrlich zu sein… Im Darknet… Ich hab nach dem neusten Shit an Drogen gesucht…", c2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Wie meinst du das? Woher kennst du die Personen auf dem Band?",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Dazu kommen wir gleich. Sag mir erstmal, wo du die Aufnahme gefunden hast?!", "Onkel");
		messageList.add(message2);
		b3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// c1
		answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Was genau waren das für Treffen?", e2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Ähm… Ein Freund hat mich darauf aufmerksam gemacht.", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Hm okay, sehr interessant.?", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??", "Ich");
		messageList.add(message3);
		c1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// c2
		answer1 = new Answer(
				"War ja mal wieder klar, so kennt man dich… Ich kann mal schauen, was sich da so machen lässt.", d1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer(
				"Ne sorry, ich besorge mir, wenn nur Stoff für mich alleine. Ich bin ja kein Dealer oder so…", d2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Hättest du mal früher was gesagt, ich habe gerade schon bestellt!", d3);
		answersForCurrentNode.add(answer3);
		message1 = new NodeMessage(Messagetype.Text,
				"Um ehrlich zu sein… Im Darknet… Ich hab nach dem neusten Shit an Drogen gesucht…", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Was? Das kann doch nicht dein Ernst sein!! Ich glaube das einfach nicht… Für mich bist du immer noch der zehnjährige kleine Junge, der sich ein Loch in den Bauch lacht, weil ich mich auf ein Furzkissen gesetzt habe...das du mir natürlich vorher untergeschoben hast! "
						+ "Naja… Wenn du schon mal dabei bist… kannst du mir ja evtl demnächst mal ein bisschen was mitbestellen?",
				"Onkel");
		messageList.add(message2);
		c2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// d1
		answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Was genau waren das für Treffen?", e2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text,
				"War ja mal wieder klar, so kennt man dich… Ich kann mal schauen, was sich da so machen lässt. Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als wären sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Gerücht rum, sie würden irgendetwas Bestimmtes suchen.",
				"Onkel");
		messageList.add(message2);
		d1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// d2
		answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Was genau waren das für Treffen?", e2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text,
				"Ne sorry, ich besorge mir, wenn nur Stoff für mich alleine. Ich bin ja kein Dealer oder so… Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als wären sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Gerücht rum, sie würden irgendetwas Bestimmtes suchen.",
				"Onkel");
		messageList.add(message2);
		d2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// d3
		answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Was genau waren das für Treffen?", e2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text,
				"Hättest du mal früher was gesagt, ich habe gerade schon bestellt! Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als wären sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Gerücht rum, sie würden irgendetwas Bestimmtes suchen.",
				"Onkel");
		messageList.add(message2);
		d3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// e1
		answer1 = new Answer("Warte auf mich, ich möchte auch mitkommen!", f1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Das ist doch viel zu gefährlich alleine!", f2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Sei vorsichtig!", f3);
		answersForCurrentNode.add(answer3);
		message1 = new NodeMessage(Messagetype.Text, "Hast du eine Vermutung, wonach deine Kollegen gesucht haben?",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Nein, leider nicht, aber ihre Spur schien immer heißer zu werden… Sie wurden mit jedem Mal unruhiger. Ich vermute, es muss ziemlich bedeutungsvoll gewesen sein.",
				10, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Weißt du was? Desto mehr ich darüber nachdenke, desto nervöser werde ich! Laut den Koordinaten aus der Tonaufnahme, befinde ich mich ganz in der Nähe! Ich werde ganz einfach meine Taschen packen und schauen, was mit meinen Kameraden passiert ist und ob es ihnen gut geht!",
				"Onkel");
		messageList.add(message3);
		e1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// e2
		answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
		answersForCurrentNode.add(answer1);
		message1 = new NodeMessage(Messagetype.Text, "Was genau waren das für Treffen?", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Diese Treffen finden alle paar Monate statt. Dort tragen alle aus unserem Gebiet, d.h. jegliche Forscher, ihre Erkenntnisse usw. der letzten Monate vor, z.B. was sie ausgegraben haben.",
				"Onkel");
		messageList.add(message2);
		e2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// f1
		answer1 = new Answer("Klar helfe ich dir!", g1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.",
				ending1_g2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Warte auf mich, ich möchte auch mitkommen!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Nein, das ist zu gefährlich… Außerdem dauert es viel zu lange, bis du hier bist. Aber du könntest mir bestimmt trotzdem irgendwie von zu Hause aus helfen, was hältst du davon?",
				"Onkel");
		messageList.add(message2);
		f1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// f2
		answer1 = new Answer("Klar helfe ich dir!", g1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.",
				ending1_g2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Das ist doch viel zu gefährlich alleine!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ach Quatsch, ich bin das gewohnt… Außerdem habe ich ja dich! Könnte sein, dass ich während meines Ausflugs deine Unterstützung brauche. Hast du Lust, mir zu helfen?",
				"Onkel");
		messageList.add(message2);
		f2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// f3
		answer1 = new Answer("Klar helfe ich dir!", g1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.",
				ending1_g2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Sei vorsichtig!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Das bin ich doch immer, sonst wäre ich schon längst tot. Möglicherweise könnte es sein, dass ich während meines Ausfluges deine Unterstützung brauche. Hast du Lust, mir zu helfen?",
				"Onkel");
		messageList.add(message2);
		f3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// g1
		answer1 = new Answer("Mit dem Auto.", ending1_h1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Mit einem Boot.", h2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Mit einem Flugzeug.", ending1_h3);
		answersForCurrentNode.add(answer3);
		message1 = new NodeMessage(Messagetype.Text, "Klar helfe ich dir!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Perfekt! Du kannst mich auch schon direkt beraten… Wie komme ich am besten zu den Koordinaten?",
				"Onkel");
		messageList.add(message2);
		g1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending1_g2
		message1 = new NodeMessage(Messagetype.Text,
				"Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Na gut, ich schaffe das auch alleine. Ich fliege jetzt mal zu den Koordinaten, ich habe mir ein Segelflugzeug gemietet. Ich halte dich auf dem Laufenden.",
				"Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler");
		messageList.add(message3);
		ending1_g2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending1_h1
		message1 = new NodeMessage(Messagetype.Text, "Mit dem Auto.", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ähm, ich denke nicht, dass du eine so gute Hilfe bist. Ich nehme lieber das Flugzeug.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler");
		messageList.add(message3);
		ending1_h1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// h2
		answer1 = new Answer("Siehst du das Flugzeug?", j1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Was siehst du?", j2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Mit einem Boot.", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Gut, ich mache mich auf den Weg. Ich melde mich, wenn ich auf der Insel angekommen bin.", 50, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Ich bin jetzt auf der Insel angekommen!", "Onkel");
		messageList.add(message3);
		h2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending1_h3
		message1 = new NodeMessage(Messagetype.Text, "Mit einem Flugzeug.", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Gut, ich mache mich auf den Weg. Ich melde mich, wenn ich auf der Insel angekommen bin.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler");
		messageList.add(message3);
		ending1_h3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// j1
		answer1 = new Answer("Siehst du etwas, was deine Kollegen gesucht haben könnten, eine Art Schatz?", k1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Kannst du erkennen, ob einer deiner Kollegen überlebt hat?", k2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Erkennst du, was die Ursache für den Absturz war?", k3);
		answersForCurrentNode.add(answer3);
		Answer answer4 = new Answer("Dann ruf lieber die Polizei!", ending2_k4);
		answersForCurrentNode.add(answer4);
		message1 = new NodeMessage(Messagetype.Text, "Siehst du das Flugzeug?", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ich sehe nichts außer Sandstrand und einen Wald aus Palmen. Ich denke, Ich gehe mal tiefer in den Palmenwald, ich melde mich gleich wieder.",
				20, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Ich habe das Flugzeug gefunden! Das sieht gar nicht gut aus… Das Flugzeug ist in den Fuß eines Berges geflogen und hat ein richtiges Loch reingeschlagen!",
				"Onkel");
		messageList.add(message3);
		j1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// j2
		answer1 = new Answer("Siehst du etwas, was deine Kollegen gesucht haben könnten, eine Art Schatz?", k1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Kannst du erkennen, ob einer deiner Kollegen überlebt hat?", k2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("Erkennst du, was die Ursache für den Absturz war?", k3);
		answersForCurrentNode.add(answer3);
		answer4 = new Answer("Dann ruf lieber die Polizei!", ending2_k4);
		answersForCurrentNode.add(answer4);
		message1 = new NodeMessage(Messagetype.Text, "Was siehst du?", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Ich sehe nichts außer Sandstrand und einen Wald aus Palmen. Ich denke, Ich gehe mal tiefer in den Palmenwald, ich melde mich gleich wieder.",
				20, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Ich habe das Flugzeug gefunden! Das sieht gar nicht gut aus… Das Flugzeug ist in den Fuß eines Berges geflogen und hat ein richtiges Loch reingeschlagen!",
				"Onkel");
		messageList.add(message3);
		j2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// k1
		answer1 = new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Dann ruf lieber die Polizei!", ending2_l2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text,
				"Siehst du etwas, was deine Kollegen gesucht haben könnten, eine Art Schatz?", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Nein. Ich sehe nur ganz viele einzelne Flugzeugteile…", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen überlebt hat?",
				"Ich");
		messageList.add(message3);
		NodeMessage message4 = new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal näher ran, warte kurz.",
				10, "Onkel");
		messageList.add(message4);
		NodeMessage message5 = new NodeMessage(Messagetype.Text,
				"Oh Gott, das sieht übel aus. Keiner bewegt sich. Ich denke, keiner hat überlebt, aber ich traue mich nicht ins Flugzeug…",
				"Onkel");
		messageList.add(message5);
		k1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// k2
		answer1 = new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Dann ruf lieber die Polizei!", ending2_l2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen überlebt hat?",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal näher ran, warte kurz.", 10,
				"Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Oh Gott, das sieht übel aus. Keiner bewegt sich. Ich denke, keiner hat überlebt, aber ich traue mich nicht ins Flugzeug…",
				"Onkel");
		messageList.add(message3);
		k2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// k3
		answer1 = new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Dann ruf lieber die Polizei!", ending2_l2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Erkennst du, was die Ursache für den Absturz war?", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Nein, keine Chance. Ich denke, das kann nur ein Profi.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen überlebt hat?",
				"Ich");
		messageList.add(message3);
		message4 = new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal näher ran, warte kurz.", 10,
				"Onkel");
		messageList.add(message4);
		message5 = new NodeMessage(Messagetype.Text,
				"Oh Gott, das sieht übel aus. Keiner bewegt sich. Ich denke, keiner hat überlebt, aber ich traue mich nicht ins Flugzeug…",
				"Onkel");
		messageList.add(message5);
		k3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending2_k4
		message1 = new NodeMessage(Messagetype.Text, "Dann ruf lieber die Polizei!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Du hast Recht, bis gleich!", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler");
		messageList.add(message3);
		ending2_k4 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// l1
		answer1 = new Answer(
				"Das ist aber komisch, dass es zieht… Normalerweise sollte im Berg doch kein Platz für Luft sein oder?",
				m1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer(
				"Also an deiner Stelle würde ich jetzt, so schnell es geht, aus dem Flugzeug verschwinden und die Polizei anrufen, bevor alles zusammenbricht.",
				ending2_m2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text, "Trau dich! Vielleicht lebt ja noch einer!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Okay, ich gehe rein…", 5, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Hier ist alles voller Blut, sowas habe ich noch nie gesehen! Niemand atmet mehr… Wahrscheinlich sind sie direkt kurz nach dem Absturz gestorben… Was für eine Schande…",
				5, "Onkel");
		messageList.add(message3);
		message4 = new NodeMessage(Messagetype.Text,
				"Ich habe irgendwie das Gefühl, dass es hier zieht… Ich glaube das kommt vorne vom Cockpit. Sieht ziemlich einsturzgefährdet aus. Es steckt halb im Berg.",
				"Onkel");
		messageList.add(message4);
		l1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending2_l2
		message1 = new NodeMessage(Messagetype.Text, "Dann ruf lieber die Polizei!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Du hast Recht, bis gleich!", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler");
		messageList.add(message3);
		ending2_l2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// m1
		answer1 = new Answer("Dann lass das mal lieber.", ending3_n1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("Dann schau einfach, wie weit du kommst!", n2);
		answersForCurrentNode.add(answer2);
		message1 = new NodeMessage(Messagetype.Text,
				"Das ist aber komisch, dass es zieht… Normalerweise sollte im Berg doch kein Platz für Luft sein oder?",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Normalerweise nicht… Jetzt hat mich mein Forscherherz gepackt! Ich schaue mal vorsichtig nach, ob ich die Ursache sehen kann.",
				10, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Tatsächlich! Hier ist eine Art unterirdische Höhle! Irgendwie wirkt es wie eine Art gewollter Eingang zu etwas… Eigentlich würde ich gerne nachschauen, wohin der Gang führt, aber ich habe keine Ausrüstung dabei.",
				"Onkel");
		messageList.add(message3);
		m1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending2_m2
		message1 = new NodeMessage(Messagetype.Text,
				"Also an deiner Stelle würde ich jetzt, so schnell es geht, aus dem Flugzeug verschwinden und die Polizei anrufen, bevor alles zusammenbricht.",
				"Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Du hast Recht, ich verschwinde hier.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler");
		messageList.add(message3);
		ending2_m2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending3_n1
		message1 = new NodeMessage(Messagetype.Text, "Dann lass das mal lieber.", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Okay, dann werde ich jetzt die Polizei rufen.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Nachdem dein Onkel die Polizei gerufen hat, entdeckte diese in der Höhle eine unterirdische Stadt mit antiken Schätzen. "
						+ "Zudem fand die Polizei heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. "
						+ "Diese News gingen durch die Medien, allerdings wurde der Held, nämlich dein Onkel, mit keinem Wort erwähnt...",
				"Erzähler");
		messageList.add(message3);
		ending3_n1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// n2
		answer1 = new Answer("Ich kann nichts finden!", ending3_o1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("1638", ending4_o2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("1738", o3);
		answersForCurrentNode.add(answer3);
		answer4 = new Answer("1836", ending4_o4);
		answersForCurrentNode.add(answer4);
		message1 = new NodeMessage(Messagetype.Text, "Dann schau einfach, wie weit du kommst!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Na gut, ich kann ja dann immer noch umdrehen…", 10, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Oh nein! Ich glaube, ich habe gerade eine Falle ausgelöst bzw. noch nicht ganz… Ich stecke mittendrin! Hier ist ein Bild! Kannst du mal GOOGLEN, wie man sie entschärfen kann? Sieht nach römischen Zahlen aus...",
				"Onkel");
		messageList.add(message3);
		message4 = new NodeMessage(Messagetype.Image, "../ressources/falle.jpg", "Onkel");
		messageList.add(message4);
		n2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending3_o1
		message1 = new NodeMessage(Messagetype.Text, "Ich kann nichts finden!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Okay, dann werde ich jetzt die Polizei rufen. Ich hoffe, sie können mir helfen.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler");
		messageList.add(message3);
		ending3_o1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending4_o2
		message1 = new NodeMessage(Messagetype.Text, "1638", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass die Falle falsch entschärft wurde und dein Onkel dabei ums Leben kam. Jedoch entdeckte die Polizei in der Höhle eine unterirdische Stadt mit antiken Schätzen. "
						+ "Zudem fand sie heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. "
						+ "Diese News gingen durch die Medien, allerdings wurde der Held, nämlich dein Onkel, mit keinem Wort erwähnt...",
				"Erzähler");
		messageList.add(message3);
		ending4_o2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// o3
		answer1 = new Answer("Ich kann nichts finden…", ending3_p1);
		answersForCurrentNode.add(answer1);
		answer2 = new Answer("PAT", ending5_p2);
		answersForCurrentNode.add(answer2);
		answer3 = new Answer("HZK", ending5_p3);
		answersForCurrentNode.add(answer3);
		answer4 = new Answer("LNU", ending6_p4);
		answersForCurrentNode.add(answer4);
		message1 = new NodeMessage(Messagetype.Text, "1738", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", 10, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Jawoll, es hat geklappt! Ich lebe! Weiter geht’s!", 10, "Onkel");
		messageList.add(message3);
		message4 = new NodeMessage(Messagetype.Text,
				"Da ist ein Tor! Ganz schön groß… und vor allem verschlossen. Ich glaube, man muss hier ne Art Buchstabencode eingeben…",
				"Onkel");
		messageList.add(message4);
		message5 = new NodeMessage(Messagetype.Text,
				"Ah, hier an der Wand scheint ne Art geheime Botschaft zu sein… Vielleicht muss man es ja übersetzen? Findest du eventuell etwas bei GOOGLE?",
				"Onkel");
		messageList.add(message5);
		NodeMessage message6 = new NodeMessage(Messagetype.Image, "../ressources/raetsel.jpg", 5, "Onkel");
		messageList.add(message6);
		NodeMessage message7 = new NodeMessage(Messagetype.Text, "Sieht mir ganz nach Hieroglyphen aus...", "Onkel");
		messageList.add(message7);
		o3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending4_o4
		message1 = new NodeMessage(Messagetype.Text, "1836", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass die Falle falsch entschärft wurde und dein Onkel dabei ums Leben kam. Jedoch entdeckte die Polizei in der Höhle eine unterirdische Stadt mit antiken Schätzen. "
						+ "Zudem fand sie heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. "
						+ "Diese News gingen durch die Medien, allerdings wurde der Held, nämlich dein Onkel, mit keinem Wort erwähnt...",
				"Erzähler");
		messageList.add(message3);
		ending4_o4 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending3_p1
		message1 = new NodeMessage(Messagetype.Text, "Ich kann nichts finden!", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text,
				"Hm… Ich möchte auch nichts Falsches eingeben… Dann sollte ich jetzt lieber die Polizei rufen…“",
				"Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler");
		messageList.add(message3);
		ending3_p1 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending5_p2
		message1 = new NodeMessage(Messagetype.Text, "PAT", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass der Code wohl falsch eingegeben wurde, die Höhle daraufhin einstürzte und dein Onkel dabei verschüttet wurde. Es dauerte 2 Jahre, bis das Chaos beseitigt werden konnte. "
						+ "Es wurde in der Höhle eine unterirdische Stadt mit antiken Schätzen gefunden. Zudem fand man heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist.",
				"Erzähler");
		messageList.add(message3);
		ending5_p2 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending5_p3
		message1 = new NodeMessage(Messagetype.Text, "HZK", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass der Code wohl falsch eingegeben wurde, die Höhle daraufhin einstürzte und dein Onkel dabei verschüttet wurde. Es dauerte 2 Jahre, bis das Chaos beseitigt werden konnte. "
						+ "Es wurde in der Höhle eine unterirdische Stadt mit antiken Schätzen gefunden. Zudem fand man heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist.",
				"Erzähler");
		messageList.add(message3);
		ending5_p3 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		// ending6_p4
		message1 = new NodeMessage(Messagetype.Text, "LNU", "Ich");
		messageList.add(message1);
		message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", 10, "Onkel");
		messageList.add(message2);
		message3 = new NodeMessage(Messagetype.Text, "Es funktioniert! Das Tor öffnet sich!", 10, "Onkel");
		messageList.add(message3);
		message4 = new NodeMessage(Messagetype.Text,
				"Wow!! Hier ist eine KOMPLETTE Stadt im Berg!! Danach haben meine Kollegen wohl gesucht… Schade, dass sie es nicht mit eigenen Augen sehen konnten… Das ist einfach unglaublich!!",
				"Onkel");
		messageList.add(message4);
		message5 = new NodeMessage(Messagetype.Image, "../ressources/verborgeneStadt.jpg", 5, "Onkel");
		messageList.add(message5);
		message6 = new NodeMessage(Messagetype.Text,
				"Ich denke, das ist der Höhepunkt meiner Karriere, wahrscheinlich sogar meines gesamten Lebens! Was hier wohl alles verborgen sein mag… Danke für deine Hilfe! Ohne dich hätte ich die Stadt bestimmt nicht gefunden, geschweige denn überlebt!",
				"Onkel");
		messageList.add(message6);
		message7 = new NodeMessage(Messagetype.Text,
				"Was geschah: Diese News gingen durch die Medien! Dein Onkel wurde berühmt und ausgezeichnet. Im Nachhinein konnte auch die Absturzursache festgestellt werden:"
						+ "ein magnetisches Feld hatte die Systeme lahmgelegt. ",
				"Erzähler");
		messageList.add(message7);
		ending6_p4 = new Node(messageList, answersForCurrentNode);
		answersForCurrentNode.clear();
		messageList.clear();

		nodeList.add(ausgangssituation);
		nodeList.add(ending1);
		nodeList.add(b2);
		nodeList.add(b3);
		nodeList.add(c1);
		nodeList.add(c2);
		nodeList.add(d1);
		nodeList.add(d2);
		nodeList.add(d3);
		nodeList.add(e1);
		nodeList.add(e2);
		nodeList.add(f1);
		nodeList.add(f2);
		nodeList.add(f3);
		nodeList.add(g1);
		nodeList.add(ending1_g2);
		nodeList.add(ending1_h1);
		nodeList.add(h2);
		nodeList.add(ending1_h3);
		nodeList.add(j1);
		nodeList.add(j2);
		nodeList.add(k1);
		nodeList.add(k2);
		nodeList.add(k3);
		nodeList.add(ending2_k4);
		nodeList.add(l1);
		nodeList.add(ending2_l2);
		nodeList.add(m1);
		nodeList.add(ending2_m2);
		nodeList.add(ending3_n1);
		nodeList.add(n2);
		nodeList.add(ending3_o1);
		nodeList.add(ending4_o2);
		nodeList.add(o3);
		nodeList.add(ending4_o4);
		nodeList.add(ending3_p1);
		nodeList.add(ending5_p2);
		nodeList.add(ending5_p3);
		nodeList.add(ending6_p4);		
		return nodeList;
	}

	public Node getFirstNode(long scenarioID) throws NodeNotFoundException {
		if (scenarioID == 0) {
			if(scenarioOne.size()>0) {
				return scenarioOne.get(0);
			}
			else {
				throw new NodeNotFoundException("Erstes Node ist in ScenarioCreator fÃ¼r Scenario 0 nicht verfÃ¼gbar.");
			}
		} else if (scenarioID == 1) {
			if(scenarioOne.size()>0) {
				return scenarioOne.get(1);
			}
			else {
				throw new NodeNotFoundException("Erstes Node ist in ScenarioCreator fÃ¼r Scenario 1 nicht verfÃ¼gbar.");
			}
		}
		throw new NodeNotFoundException("Scenario "+scenarioID+" ist nicht verfÃ¼gbar");
	}

}
