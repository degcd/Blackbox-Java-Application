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

	private static Node scenarioOne;
	private static Node scenarioTwo;
	private static List<Node> nodeList;
	private static List<Answer> answerList;

	public ScenarioCreator() {
		nodeList = new LinkedList();
		answerList = new LinkedList();
		scenarioOne = createScenarioOne();
		scenarioTwo = createScenarioTwo();

	}

	public Node createScenarioOne() {
		// ending7
		Node ending7 = new Node();
		ending7.addMessage(new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide"));
		ending7.addMessage(new NodeMessage(Messagetype.Text,
				"Als Frau Müller ins Bad ging, konnte sie sich wieder erinnern, was passiert ist. Sie wurde hysterisch und schlug den Droiden gegen die Wand, sodass er beschädigt wurde und die Verbindung abbrach. Während ein Neustart versucht wurde, hat die Frau die restlichen Beweise beseitigt und einen Brand gelegt. Glücklicherweise hatte der Droide schon kurz vorher das Video weitergeleitet, sodass der Mord aufgeklürt werden konnte. Das Motiv bleibt jedoch unklar aufgrund mangelnder Beweise",
				"Erzähler"));

		// ending6
		Node ending6 = new Node();
		ending6.addMessage(new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide"));
		ending6.addMessage(new NodeMessage(Messagetype.Text,
				"Frau Müller ist zwar in der Zwischenzeit verschwunden, jedoch konnten die Mordwaffe, ein Küchenmesser, und ein Beweisvideo, das per Webcam eines Laptops im Wohnzimmer mitgeschnitten wurde, sichergestellt werden. Die Tabletten haben die Schizophrenie der Frau aufgedeckt. So konnte sowohl der Mord, als auch das Motiv der Frau aufgeklärt werden.",
				"Erzähler"));

		// ending5
		Node ending5 = new Node();
		ending5.addMessage(new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide"));
		ending5.addMessage(new NodeMessage(Messagetype.Text,
				"Frau Müller ist zwar in der Zwischenzeit verschwunden, jedoch konnten die Mordwaffe, ein Küchenmesser, und ein Beweisvideo, das per Webcam eines Laptops im Wohnzimmer mitgeschnitten wurde, sichergestellt werden. Der Mord konnte somit aufgeklärt werden. Jedoch wurden die Tabletten falsch identifiziert, sodass das Motiv der Frau unklar bleibt",
				"Erzähler"));

		// ending4
		Node ending4 = new Node();
		ending4.addMessage(new NodeMessage(Messagetype.Text,
				"Als die Frau den Laptop entsperrte, um dem Droiden die ominöse Droh-Email zu zeigen, war direkt ein Video zu sehen. Die Webcam hatte den Mord aufgezeichnet!! Frau Müller hat ihren Vater mit einem Küchenmesser erstochen. Als sie dies auf dem Bildschirm sah, wurde sie hysterisch und schlug den Droiden gegen die Wand, sodass er beschädigt wurde und die Verbindung abbrach. Während ein Neustart versucht wurde, hat die Frau die restlichen Beweise beseitigt und einen Brand gelegt. So konnte ihr Motiv nicht aufgklärt werden",
				"Erzähler"));

		// Ending2
		Node ending2 = new Node();
		ending2.addMessage(new NodeMessage(Messagetype.Text,
				"Beim Versuch die Frau zu beruhigen wurde Frau Müller hysterisch und schlug den Druiden gegen die Wand, sodass er beschädigt wurde und die Verbindung abbrach. Während ein Neustart versucht wurde, hat die Frau alle Beweise beseitigt und einen Brand gelegt. So konnte der Mord und das Motiv nicht aufgeklärt werden.",
				"Erzähler"));
		// Ending1
		Node ending1 = new Node();
		ending1.addMessage(new NodeMessage(Messagetype.Text,
				"Es wurde zu spät gehandelt: Circa 30 Minuten nach dem ANruf bei der Polizei hat sich Frau Müller erinnert, was passiert ist. Sie geriet in Panik und setzte die Wohnung in Flammen. So konnte der Mord und das Motiv nicht aufgeklärt werden.",
				"Erzähler"));
		// d1
		Node d1 = new Node();
		d1.addAnswer(new Answer(" Epilepsie-Tabletten ", ending5));
		d1.addAnswer(new Answer("Schlaftabletten", ending5));
		d1.addAnswer(new Answer(" Schizophrenie-Tabletten", ending6));
		d1.addAnswer(new Answer("Magersucht-Tableetten", ending5));
		d1.addMessage(new NodeMessage(Messagetype.Image, "../ressources/pillenschrank.jpg", "Droide"));
		d1.addMessage(new NodeMessage(Messagetype.Text,
				"Das ist das einzige Auffällige, das ich gefunden habe. Kannst du herausfinden, was das für Tabletten sind",
				"Droide"));
		d1.addMessage(new NodeMessage(Messagetype.Text, "Kannst du mir noch eine Nahaufnahme schicken?", "Ich"));
		d1.addMessage(new NodeMessage(Messagetype.Image, "../ressources/medikament.jpg", "Droide"));
		d1.addMessage(new NodeMessage(Messagetype.Text, "Ok ich google jetzt", "Ich"));
		// d3
		Node d3 = new Node();
		d3.addAnswer(new Answer("Das ist ja interessant.", ending7));
		d3.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe Frau Müller ins Bad geschickt, um sich ein wenig frisch zu machen.", 10, "Droide"));
		d3.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe einen Laptop sichergestellt. Es befindet sich darauf ein Video. Anscheinend hat die Webcam den Mord aufgezeichnet.",
				"Droide"));
		d3.addMessage(new NodeMessage(Messagetype.Video, "../ressources/mordvideo.mp4", 10, "Droide"));

		// g1
		Node g1 = new Node();
		g1.addAnswer(new Answer("Geh ins Bad", d1));
		g1.addAnswer(new Answer("Geh ins Wohnzimmer", d3));

		// d2
		Node d2 = new Node();
		d2.addAnswer(new Answer("Schicke eine Drohne mit der möglichen Mordwaffe los und schau dich weiter um", g1));
		d2.addMessage(new NodeMessage(Messagetype.Image, "../ressources/kueche.jpg", "Droide"));
		d2.addMessage(new NodeMessage(Messagetype.Text, "Hier wurde gekocht, die Dunstabzugshaube läuft noch.", 10,
				"Droide"));
		d2.addMessage(new NodeMessage(Messagetype.Text,
				"In der Spüle liegt ein Küchenmesser- möglicherweise die Mordwaffe.", "Droide"));
		d2.addMessage(new NodeMessage(Messagetype.Image, "../ressources/messer.jpg", "Droide"));
		d2.addMessage(new NodeMessage(Messagetype.Text, "Sehr gut!", "Ich"));

		// d
		Node d = new Node();
		d.addAnswer(new Answer("Geh ins Badezimmer.", d1));
		d.addAnswer(new Answer("Starte in der Küche.", d2));
		d.addAnswer(new Answer("Fang im Wohnzimmer an", d3));
		d.addMessage(new NodeMessage(Messagetype.Text, "Wo soll ich anfangen?", "Droide"));

		// f3
		Node f3 = new Node();
		f3.addAnswer(new Answer("Sehr gut, lass dir die Email zeigen und leite sie an mich weiter.", ending4));
		f3.addMessage(new NodeMessage(Messagetype.Text,
				"Guter Ansatzpunkt. Vielleicht hatte es der Mörder eigentlich auf sie abgesehen und ihr Vater war zur falschen Zeit am falschen Ort",
				30, "Droide"));
		f3.addMessage(new NodeMessage(Messagetype.Text, "Ja, sie hat letztens eine Droh-Email erhalten", "Droide"));

		// f2
		Node f2 = new Node();
		f2.addAnswer(new Answer("Weiß sie, warum ihr Vater in der Wohnung ist?", new Node()));
		f2.addAnswer(new Answer("Hat Frau Müller irgendwelche Feinde oder möglicherweise berufsbedingt Neider?", f3));
		f2.addMessage((new NodeMessage(Messagetype.Text, "Sie weiß nichts von möglichen Feinden", "Droide")));


		// f1
		Node f1 = f2.getAnswerList().get(0).getAnswerNode();
		f1.addAnswer(new Answer("Hatte jemand einen Grund ihn umzubringen?", f2));
		f1.addAnswer(new Answer("Hat Frau Müller irgendwelche Feinde oder möglicherweise berufsbedingt Neider?", f3));
		f1.addMessage(new NodeMessage(Messagetype.Text,
				"Sie sagt, sie ist als Bloggerin viel unterwegs, deshalb hat er einen Schlüssel, um ihre Katze zu versorgen",
				"Droide"));
		// C3
		Node c3 = new Node();
		c3.addAnswer(new Answer("Schaue dich weiter um und halte Ausschau nach der Mordwaffe", d));
		c3.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe Blutproben und Fingerabdrücke sichergestellt. Eine Drohne ist jetzt auf dem Weg ins Labor. Es sieht nach einer tödlichen Stichverletzung aus. Es befindet sich keine Mordwaffe am  unmittelbaren Tatort",
				"Droide"));
		c3.addMessage(new NodeMessage(Messagetype.Text, "Okay, ich schicke dir den Spu-Si-Trupp zur Unterstützung.",
				"Droide"));

		// C2
		Node c2 = new Node();
		c2.addAnswer(new Answer("Weiß sie, warum ihr Vater un der Wohnung ist?", f1));
		c2.addAnswer(new Answer("Hatte jemand einen Grund ihn umzubringen?", f2));
		c2.addAnswer(new Answer("Hatte Frau Müller irgendwelche Feinde oder möglicherweise berufsbedingt Neider?", f3));
		c2.addMessage(new NodeMessage(Messagetype.Text,
				"Beim Opfer handelt es sich um den Vater der Frau. Wir befinden uns in der Wohnung der Frau. Sie hat ihren Vater erstochen aufgefunden als sie vom Einkaufen zurückkam.",
				"Droide"));

		// C3Alternativ
		Node c3A = new Node();
		c3A.addAnswer(new Answer("Schaue dich weiter um und halte Ausschau nach der Mordwaffe", d));
		c3A.addAnswer(new Answer("Droide beruhige die Frau", ending2));
		c3A.addAnswer(new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2));
		c3A.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe Blutproben und Fingerabdrücke sichergestellt. Eine Drohne ist jetzt auf dem Weg ins Labor. Es sieht nach einer tödlichen Stichverletzung aus. Es befindet sich keine Mordwaffe am  unmittelbaren Tatort",
				"Droide"));
		c3A.addMessage(new NodeMessage(Messagetype.Text, "Okay, ich schicke dir den Spu-Si-Trupp zur Unterstützung.",
				"Droide"));

		// SKD56
		Node skd = new Node();
		skd.addAnswer(new Answer("Droide beruhige die Frau", ending2));
		skd.addAnswer(new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2));
		skd.addAnswer(new Answer("Schaue dir den Tartort genauer an und entnehme Proben für das Labor", c3));
		skd.addMessage(new NodeMessage(Messagetype.Text,
				"Klar. Danke, dass du das übernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas"));
		skd.addMessage(new NodeMessage(Messagetype.Image, "../ressources/kontaktdaten.jpg", 30, "Kommissar Thomas"));
		skd.addMessage(new NodeMessage(Messagetype.Text, "Ich bin bei Frau Müller angekommen.", "Droide"));
		skd.addMessage(new NodeMessage(Messagetype.Image, "../ressources/tatort.jpg", "Droide"));

		// SD87
		Node sd = new Node();
		sd.addAnswer(new Answer("Schaue dir den Tartort genauer an und entnehme Proben für das Labor", c3));
		sd.addMessage(new NodeMessage(Messagetype.Text,
				"Klar. Danke, dass du das übernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas"));
		sd.addMessage(new NodeMessage(Messagetype.Image, "../ressources/kontaktdaten.jpg", 30, "Kommissar Thomas"));
		sd.addMessage(new NodeMessage(Messagetype.Text, "Ich bin bei Frau Müller angekommen.", "Droide"));
		sd.addMessage(new NodeMessage(Messagetype.Image, "../ressources/tatort.jpg", "Droide"));

		// KD42
		Node kd = new Node();
		kd.addAnswer(new Answer("Droide beruhige die Frau", ending2));
		kd.addAnswer(new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2));
		kd.addMessage(new NodeMessage(Messagetype.Text,
				"Klar. Danke, dass du das übernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas"));
		kd.addMessage(new NodeMessage(Messagetype.Image, "../ressources/kontaktdaten.jpg", 30, "Kommissar Thomas"));
		kd.addMessage(new NodeMessage(Messagetype.Text, "Ich bin bei Frau Müller angekommen.", "Droide"));
		kd.addMessage(new NodeMessage(Messagetype.Image, "../ressources/tatort.jpg", "Droide"));

		// a2
		Node a2 = new Node();
		a2.addAnswer(new Answer(
				"Hört sich spannend an. Leider hab ich gerade keinen Droiden frei, der diese Aufgaben übernehmen kann.",
				ending1));
		a2.addAnswer(
				new Answer("Okay ich schicke schonmal einen Kontaktdroiden los. Leitest du mir die Akte weiter?", kd));
		a2.addAnswer(
				new Answer("Okay ich schicke schonmal einen Spurendroiden los. Leitest du mir die Akte weiter?", sd));
		a2.addAnswer(new Answer(
				"Okay ich schicke schonmal einen Spuren- und Kontaktdroiden los. Leitest du mir die Akte weiter?",
				skd));
		a2.addMessage(new NodeMessage(Messagetype.Text,
				"Eine junge Frau hat soeben einen toten Mann in ihrer Wohnung gefunden. Sie steht jetzt unter Schock. Jemand muss zu ihr, sie befragen und die Spuren müssen dort gesichert werden.",
				"Kommissar Thomas"));

		// Ausgangssituation
		Node ausgangssituation = new Node();
		ausgangssituation.addAnswer(new Answer(
				"Kann das nicht jemand anderes übernehmen? Ich stecke immer noch in den Ermittlungen bezüglich der Wasserleiche vom Frühlinger See fest.",
				ending1));
		ausgangssituation.addAnswer(new Answer("Super, worum geht's?", a2));
		ausgangssituation.addMessage(new NodeMessage(Messagetype.Text, "Hey Joe, ich hab da einen neuen Fall für dich.",
				"Kommissar Thomas"));

		nodeList.add(ausgangssituation);
		nodeList.add(a2);
		nodeList.add(kd);
		nodeList.add(sd);
		nodeList.add(skd);
		nodeList.add(ending1);
		nodeList.add(c2);
		nodeList.add(c3);
		nodeList.add(c3A);
		nodeList.add(f1);
		nodeList.add(f2);
		nodeList.add(f3);
		nodeList.add(ending2);
		nodeList.add(d);
		nodeList.add(d1);
		nodeList.add(d2);
		nodeList.add(d3);
		nodeList.add(g1);
		nodeList.add(ending1);
		nodeList.add(ending2);
		nodeList.add(ending4);
		nodeList.add(ending5);
		nodeList.add(ending6);
		nodeList.add(ending7);
		answerList.addAll(ausgangssituation.getAnswerList());
		answerList.addAll(a2.getAnswerList());
		answerList.addAll(kd.getAnswerList());
		answerList.addAll(sd.getAnswerList());
		answerList.addAll(skd.getAnswerList());
		answerList.addAll(c2.getAnswerList());
		answerList.addAll(c3.getAnswerList());
		answerList.addAll(c3A.getAnswerList());
		answerList.addAll(f1.getAnswerList());
		answerList.addAll(f2.getAnswerList());
		answerList.addAll(f3.getAnswerList());
		answerList.addAll(d.getAnswerList());
		answerList.addAll(d1.getAnswerList());
		answerList.addAll(d2.getAnswerList());
		answerList.addAll(d3.getAnswerList());
		answerList.addAll(g1.getAnswerList());

		return ausgangssituation;
	}

	public Node createScenarioTwo() {
		// ending6_p4
		Node ending6_p4 = new Node();
		ending6_p4.addMessage(new NodeMessage(Messagetype.Text, "LNU", "Ich"));
		ending6_p4.addMessage(new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", 10, "Onkel"));
		ending6_p4.addMessage(new NodeMessage(Messagetype.Text, "Es funktioniert! Das Tor öffnet sich!", 10, "Onkel"));
		ending6_p4.addMessage(new NodeMessage(Messagetype.Text,
				"Wow!! Hier ist eine KOMPLETTE Stadt im Berg!! Danach haben meine Kollegen wohl gesucht… Schade, dass sie es nicht mit eigenen Augen sehen konnten… Das ist einfach unglaublich!!",
				"Onkel"));
		ending6_p4.addMessage(new NodeMessage(Messagetype.Image, "../ressources/verborgeneStadt.jpg", 5, "Onkel"));
		ending6_p4.addMessage(new NodeMessage(Messagetype.Text,
				"Ich denke, das ist der Höhepunkt meiner Karriere, wahrscheinlich sogar meines gesamten Lebens! Was hier wohl alles verborgen sein mag… Danke für deine Hilfe! Ohne dich hätte ich die Stadt bestimmt nicht gefunden, geschweige denn überlebt!",
				"Onkel"));
		ending6_p4.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Diese News gingen durch die Medien! Dein Onkel wurde berühmt und ausgezeichnet. Im Nachhinein konnte auch die Absturzursache festgestellt werden:"
						+ "ein magnetisches Feld hatte die Systeme lahmgelegt. ",
				"Erzähler"));

		// ending5_p3
		Node ending5_p3 = new Node();
		ending5_p3.addMessage(new NodeMessage(Messagetype.Text, "HZK", "Ich"));
		ending5_p3.addMessage(new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel"));
		ending5_p3.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass der Code wohl falsch eingegeben wurde, die Höhle daraufhin einstürzte und dein Onkel dabei verschüttet wurde. Es dauerte 2 Jahre, bis das Chaos beseitigt werden konnte. "
						+ "Es wurde in der Höhle eine unterirdische Stadt mit antiken Schätzen gefunden. Zudem fand man heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist.",
				"Erzähler"));

		// ending5_p2
		Node ending5_p2 = new Node();
		ending5_p2.addMessage(new NodeMessage(Messagetype.Text, "PAT", "Ich"));
		ending5_p2.addMessage(new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel"));
		ending5_p2.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass der Code wohl falsch eingegeben wurde, die Höhle daraufhin einstürzte und dein Onkel dabei verschüttet wurde. Es dauerte 2 Jahre, bis das Chaos beseitigt werden konnte. "
						+ "Es wurde in der Höhle eine unterirdische Stadt mit antiken Schätzen gefunden. Zudem fand man heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist.",
				"Erzähler"));
		// ending3_p1
		Node ending3_p1 = new Node();
		ending3_p1.addMessage(new NodeMessage(Messagetype.Text, "Ich kann nichts finden!", "Ich"));
		ending3_p1.addMessage(new NodeMessage(Messagetype.Text,
				"Hm… Ich möchte auch nichts Falsches eingeben… Dann sollte ich jetzt lieber die Polizei rufen…“",
				"Onkel"));
		ending3_p1.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler"));
		// ending4_o4
		Node ending4_o4 = new Node();
		ending4_o4.addMessage(new NodeMessage(Messagetype.Text, "1836", "Ich"));
		ending4_o4.addMessage(new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel"));
		ending4_o4.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass die Falle falsch entschärft wurde und dein Onkel dabei ums Leben kam. Jedoch entdeckte die Polizei in der Höhle eine unterirdische Stadt mit antiken Schätzen. "
						+ "Zudem fand sie heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. "
						+ "Diese News gingen durch die Medien, allerdings wurde der Held, nämlich dein Onkel, mit keinem Wort erwähnt...",
				"Erzähler"));

		// ending4_o2
		Node ending4_o2 = new Node();
		ending4_o2.addMessage(new NodeMessage(Messagetype.Text, "1638", "Ich"));
		ending4_o2.addMessage(new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel"));
		ending4_o2.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel gehört hast."
						+ "Es stellte sich heraus, dass die Falle falsch entschärft wurde und dein Onkel dabei ums Leben kam. Jedoch entdeckte die Polizei in der Höhle eine unterirdische Stadt mit antiken Schätzen. "
						+ "Zudem fand sie heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. "
						+ "Diese News gingen durch die Medien, allerdings wurde der Held, nämlich dein Onkel, mit keinem Wort erwähnt...",
				"Erzähler"));

		// ending3_o1
		Node ending3_o1 = new Node();
		ending3_o1.addMessage(new NodeMessage(Messagetype.Text, "Ich kann nichts finden!", "Ich"));
		ending3_o1.addMessage(new NodeMessage(Messagetype.Text,
				"Okay, dann werde ich jetzt die Polizei rufen. Ich hoffe, sie können mir helfen.", "Onkel"));
		ending3_o1.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler"));

		// o3
		Node o3 = new Node();
		o3.addAnswer(new Answer("Ich kann nichts finden…", ending3_p1));
		o3.addAnswer(new Answer("PAT", ending5_p2));
		o3.addAnswer(new Answer("HZK", ending5_p3));
		o3.addAnswer(new Answer("LNU", ending6_p4));
		o3.addMessage(new NodeMessage(Messagetype.Text, "1738", "Ich"));
		o3.addMessage(new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", 10, "Onkel"));
		o3.addMessage(
				new NodeMessage(Messagetype.Text, "Jawoll, es hat geklappt! Ich lebe! Weiter geht’s!", 10, "Onkel"));
		o3.addMessage(new NodeMessage(Messagetype.Text,
				"Da ist ein Tor! Ganz schön groß… und vor allem verschlossen. Ich glaube, man muss hier ne Art Buchstabencode eingeben…",
				"Onkel"));
		o3.addMessage(new NodeMessage(Messagetype.Text,
				"Ah, hier an der Wand scheint ne Art geheime Botschaft zu sein… Vielleicht muss man es ja übersetzen? Findest du eventuell etwas bei GOOGLE?",
				"Onkel"));
		o3.addMessage(new NodeMessage(Messagetype.Image, "../ressources/raetsel.jpg", 5, "Onkel"));
		o3.addMessage(new NodeMessage(Messagetype.Text, "Sieht mir ganz nach Hieroglyphen aus...", "Onkel"));

		// n2
		Node n2 = new Node();
		n2.addAnswer(new Answer("Ich kann nichts finden!", ending3_o1));
		n2.addAnswer(new Answer("1638", ending4_o2));
		n2.addAnswer(new Answer("1738", o3));
		n2.addAnswer(new Answer("1836", ending4_o4));
		n2.addMessage(new NodeMessage(Messagetype.Text, "Dann schau einfach, wie weit du kommst!", "Ich"));
		n2.addMessage(new NodeMessage(Messagetype.Text, "Na gut, ich kann ja dann immer noch umdrehen…", 10, "Onkel"));
		n2.addMessage(new NodeMessage(Messagetype.Text,
				"Oh nein! Ich glaube, ich habe gerade eine Falle ausgelöst bzw. noch nicht ganz… Ich stecke mittendrin! Hier ist ein Bild! Kannst du mal GOOGLEN, wie man sie entschärfen kann? Sieht nach römischen Zahlen aus...",
				"Onkel"));
		n2.addMessage(new NodeMessage(Messagetype.Image, "../ressources/falle.jpg", "Onkel"));

		// ending3_n1
		Node ending3_n1 = new Node();
		ending3_n1.addMessage(new NodeMessage(Messagetype.Text, "Dann lass das mal lieber.", "Ich"));
		ending3_n1.addMessage(
				new NodeMessage(Messagetype.Text, "Okay, dann werde ich jetzt die Polizei rufen.", "Onkel"));
		ending3_n1.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Nachdem dein Onkel die Polizei gerufen hat, entdeckte diese in der Höhle eine unterirdische Stadt mit antiken Schätzen. "
						+ "Zudem fand die Polizei heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. "
						+ "Diese News gingen durch die Medien, allerdings wurde der Held, nämlich dein Onkel, mit keinem Wort erwähnt...",
				"Erzähler"));

		// ending2_m2
		Node ending2_m2 = new Node();
		ending2_m2.addMessage(new NodeMessage(Messagetype.Text,
				"Also an deiner Stelle würde ich jetzt, so schnell es geht, aus dem Flugzeug verschwinden und die Polizei anrufen, bevor alles zusammenbricht.",
				"Ich"));
		ending2_m2.addMessage(new NodeMessage(Messagetype.Text, "Du hast Recht, ich verschwinde hier.", "Onkel"));
		ending2_m2.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler"));
		// m1
		Node m1 = new Node();
		m1.addAnswer(new Answer("Dann lass das mal lieber.", ending3_n1));
		m1.addAnswer(new Answer("Dann schau einfach, wie weit du kommst!", n2));
		m1.addMessage(new NodeMessage(Messagetype.Text,
				"Das ist aber komisch, dass es zieht… Normalerweise sollte im Berg doch kein Platz für Luft sein oder?",
				"Ich"));
		m1.addMessage(new NodeMessage(Messagetype.Text,
				"Normalerweise nicht… Jetzt hat mich mein Forscherherz gepackt! Ich schaue mal vorsichtig nach, ob ich die Ursache sehen kann.",
				10, "Onkel"));
		m1.addMessage(new NodeMessage(Messagetype.Text,
				"Tatsächlich! Hier ist eine Art unterirdische Höhle! Irgendwie wirkt es wie eine Art gewollter Eingang zu etwas… Eigentlich würde ich gerne nachschauen, wohin der Gang führt, aber ich habe keine Ausrüstung dabei.",
				"Onkel"));

		// ending2_l2
		Node ending2_l2 = new Node();
		ending2_l2.addMessage(new NodeMessage(Messagetype.Text, "Dann ruf lieber die Polizei!", "Ich"));
		ending2_l2.addMessage(new NodeMessage(Messagetype.Text, "Du hast Recht, bis gleich!", "Onkel"));
		ending2_l2.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler"));
		// l1
		Node l1 = new Node();
		l1.addAnswer(new Answer(
				"Das ist aber komisch, dass es zieht… Normalerweise sollte im Berg doch kein Platz für Luft sein oder?",
				m1));
		l1.addAnswer(new Answer(
				"Also an deiner Stelle würde ich jetzt, so schnell es geht, aus dem Flugzeug verschwinden und die Polizei anrufen, bevor alles zusammenbricht.",
				ending2_m2));
		l1.addMessage(new NodeMessage(Messagetype.Text, "Trau dich! Vielleicht lebt ja noch einer!", "Ich"));
		l1.addMessage(new NodeMessage(Messagetype.Text, "Okay, ich gehe rein…", 5, "Onkel"));
		l1.addMessage(new NodeMessage(Messagetype.Text,
				"Hier ist alles voller Blut, sowas habe ich noch nie gesehen! Niemand atmet mehr… Wahrscheinlich sind sie direkt kurz nach dem Absturz gestorben… Was für eine Schande…",
				5, "Onkel"));
		l1.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe irgendwie das Gefühl, dass es hier zieht… Ich glaube das kommt vorne vom Cockpit. Sieht ziemlich einsturzgefährdet aus. Es steckt halb im Berg.",
				"Onkel"));
		// ending2_k4
		Node ending2_k4 = new Node();
		ending2_k4.addMessage(new NodeMessage(Messagetype.Text, "Dann ruf lieber die Polizei!", "Ich"));
		ending2_k4.addMessage(new NodeMessage(Messagetype.Text, "Du hast Recht, bis gleich!", "Onkel"));
		ending2_k4.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...",
				"Erzähler"));
		// k3
		Node k3 = new Node();
		k3.addAnswer(new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1));
		k3.addAnswer(new Answer("Dann ruf lieber die Polizei!", ending2_l2));
		k3.addMessage(new NodeMessage(Messagetype.Text, "Erkennst du, was die Ursache für den Absturz war?", "Ich"));
		k3.addMessage(
				new NodeMessage(Messagetype.Text, "Nein, keine Chance. Ich denke, das kann nur ein Profi.", "Onkel"));
		k3.addMessage(
				new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen überlebt hat?", "Ich"));
		k3.addMessage(
				new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal näher ran, warte kurz.", 10, "Onkel"));
		k3.addMessage(new NodeMessage(Messagetype.Text,
				"Oh Gott, das sieht übel aus. Keiner bewegt sich. Ich denke, keiner hat überlebt, aber ich traue mich nicht ins Flugzeug…",
				"Onkel"));

		// k2
		Node k2 = new Node();
		k2.addAnswer(new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1));
		k2.addAnswer(new Answer("Dann ruf lieber die Polizei!", ending2_l2));
		k2.addMessage(
				new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen überlebt hat?", "Ich"));
		k2.addMessage(
				new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal näher ran, warte kurz.", 10, "Onkel"));
		k2.addMessage(new NodeMessage(Messagetype.Text,
				"Oh Gott, das sieht übel aus. Keiner bewegt sich. Ich denke, keiner hat überlebt, aber ich traue mich nicht ins Flugzeug…",
				"Onkel"));

		Node k1 = new Node();
		k1.addAnswer(new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1));
		k1.addAnswer(new Answer("Dann ruf lieber die Polizei!", ending2_l2));
		k1.addMessage(new NodeMessage(Messagetype.Text,
				"Siehst du etwas, was deine Kollegen gesucht haben könnten, eine Art Schatz?", "Ich"));
		k1.addMessage(
				new NodeMessage(Messagetype.Text, "Nein. Ich sehe nur ganz viele einzelne Flugzeugteile…", "Onkel"));
		k1.addMessage(
				new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen überlebt hat?", "Ich"));
		k1.addMessage(
				new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal näher ran, warte kurz.", 10, "Onkel"));
		k1.addMessage(new NodeMessage(Messagetype.Text,
				"Oh Gott, das sieht übel aus. Keiner bewegt sich. Ich denke, keiner hat überlebt, aber ich traue mich nicht ins Flugzeug…",
				"Onkel"));

		// j2
		Node j2 = new Node();
		j2.addAnswer(new Answer("Siehst du etwas, was deine Kollegen gesucht haben könnten, eine Art Schatz?", k1));
		j2.addAnswer(new Answer("Kannst du erkennen, ob einer deiner Kollegen überlebt hat?", k2));
		j2.addAnswer(new Answer("Erkennst du, was die Ursache für den Absturz war?", k3));
		j2.addAnswer(new Answer("Dann ruf lieber die Polizei!", ending2_k4));
		j2.addMessage(new NodeMessage(Messagetype.Text, "Was siehst du?", "Ich"));
		j2.addMessage(new NodeMessage(Messagetype.Text,
				"Ich sehe nichts außer Sandstrand und einen Wald aus Palmen. Ich denke, Ich gehe mal tiefer in den Palmenwald, ich melde mich gleich wieder.",
				20, "Onkel"));
		j2.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe das Flugzeug gefunden! Das sieht gar nicht gut aus… Das Flugzeug ist in den Fuß eines Berges geflogen und hat ein richtiges Loch reingeschlagen!",
				"Onkel"));

		// j1
		Node j1 = new Node();
		j1.addAnswer(new Answer("Siehst du etwas, was deine Kollegen gesucht haben könnten, eine Art Schatz?", k1));
		j1.addAnswer(new Answer("Kannst du erkennen, ob einer deiner Kollegen überlebt hat?", k2));
		j1.addAnswer(new Answer("Erkennst du, was die Ursache für den Absturz war?", k3));
		j1.addAnswer(new Answer("Dann ruf lieber die Polizei!", ending2_k4));
		j1.addMessage(new NodeMessage(Messagetype.Text, "Siehst du das Flugzeug?", "Ich"));
		j1.addMessage(new NodeMessage(Messagetype.Text,
				"Ich sehe nichts außer Sandstrand und einen Wald aus Palmen. Ich denke, Ich gehe mal tiefer in den Palmenwald, ich melde mich gleich wieder.",
				20, "Onkel"));
		j1.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe das Flugzeug gefunden! Das sieht gar nicht gut aus… Das Flugzeug ist in den Fuß eines Berges geflogen und hat ein richtiges Loch reingeschlagen!",
				"Onkel"));

		// ending1_h3
		Node ending1_h3 = new Node();
		ending1_h3.addMessage(new NodeMessage(Messagetype.Text, "Mit einem Flugzeug.", "Ich"));
		ending1_h3.addMessage(new NodeMessage(Messagetype.Text,
				"Gut, ich mache mich auf den Weg. Ich melde mich, wenn ich auf der Insel angekommen bin.", "Onkel"));
		ending1_h3.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler"));

		// h2
		Node h2 = new Node();
		h2.addAnswer(new Answer("Siehst du das Flugzeug?", j1));
		h2.addAnswer(new Answer("Was siehst du?", j2));
		h2.addMessage(new NodeMessage(Messagetype.Text, "Mit einem Boot.", "Ich"));
		h2.addMessage(new NodeMessage(Messagetype.Text,
				"Gut, ich mache mich auf den Weg. Ich melde mich, wenn ich auf der Insel angekommen bin.", 50,
				"Onkel"));
		h2.addMessage(new NodeMessage(Messagetype.Text, "Ich bin jetzt auf der Insel angekommen!", "Onkel"));

		// ending1_h1
		Node ending1_h1 = new Node();
		ending1_h1.addMessage(new NodeMessage(Messagetype.Text, "Mit dem Auto.", "Ich"));
		ending1_h1.addMessage(new NodeMessage(Messagetype.Text,
				"Ähm, ich denke nicht, dass du eine so gute Hilfe bist. Ich nehme lieber das Flugzeug.", "Onkel"));
		ending1_h1.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler"));

		// ending1_g2
		Node ending1_g2 = new Node();
		ending1_g2.addMessage(new NodeMessage(Messagetype.Text,
				"Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.", "Ich"));
		ending1_g2.addMessage(new NodeMessage(Messagetype.Text,
				"Na gut, ich schaffe das auch alleine. Ich fliege jetzt mal zu den Koordinaten, ich habe mir ein Segelflugzeug gemietet. Ich halte dich auf dem Laufenden.",
				"Onkel"));
		ending1_g2.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler"));

		// g1
		Node g1 = new Node();
		g1.addAnswer(new Answer("Mit dem Auto.", ending1_h1));
		g1.addAnswer(new Answer("Mit einem Boot.", h2));
		g1.addAnswer(new Answer("Mit einem Flugzeug.", ending1_h3));
		g1.addMessage(new NodeMessage(Messagetype.Text, "Klar helfe ich dir!", "Ich"));
		g1.addMessage(new NodeMessage(Messagetype.Text,
				"Perfekt! Du kannst mich auch schon direkt beraten… Wie komme ich am besten zu den Koordinaten?",
				"Onkel"));

		// f3
		Node f3 = new Node();
		f3.addAnswer(new Answer("Klar helfe ich dir!", g1));
		f3.addAnswer(new Answer("Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.",
				ending1_g2));
		f3.addMessage(new NodeMessage(Messagetype.Text, "Sei vorsichtig!", "Ich"));
		f3.addMessage(new NodeMessage(Messagetype.Text,
				"Das bin ich doch immer, sonst wäre ich schon längst tot. Möglicherweise könnte es sein, dass ich während meines Ausfluges deine Unterstützung brauche. Hast du Lust, mir zu helfen?",
				"Onkel"));

		// f2
		Node f2 = new Node();
		f2.addAnswer(new Answer("Klar helfe ich dir!", g1));
		f2.addAnswer(new Answer("Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.",
				ending1_g2));
		f2.addMessage(new NodeMessage(Messagetype.Text, "Das ist doch viel zu gefährlich alleine!", "Ich"));
		f2.addMessage(new NodeMessage(Messagetype.Text,
				"Ach Quatsch, ich bin das gewohnt… Außerdem habe ich ja dich! Könnte sein, dass ich während meines Ausflugs deine Unterstützung brauche. Hast du Lust, mir zu helfen?",
				"Onkel"));

		// f1
		Node f1 = new Node();
		f1.addAnswer(new Answer("Klar helfe ich dir!", g1));
		f1.addAnswer(new Answer("Hm, ich weiß nicht. Ich muss gleich los, ich habe dafür eigentlich keine Zeit.",
				ending1_g2));
		f1.addMessage(new NodeMessage(Messagetype.Text, "Warte auf mich, ich möchte auch mitkommen!", "Ich"));
		f1.addMessage(new NodeMessage(Messagetype.Text,
				"Nein, das ist zu gefährlich… Außerdem dauert es viel zu lange, bis du hier bist. Aber du könntest mir bestimmt trotzdem irgendwie von zu Hause aus helfen, was hältst du davon?",
				"Onkel"));

		// e1
		Node e1 = new Node();
		e1.addAnswer(new Answer("Warte auf mich, ich möchte auch mitkommen!", f1));
		e1.addAnswer(new Answer("Das ist doch viel zu gefährlich alleine!", f2));
		e1.addAnswer(new Answer("Sei vorsichtig!", f3));
		e1.addMessage(new NodeMessage(Messagetype.Text, "Hast du eine Vermutung, wonach deine Kollegen gesucht haben?",
				"Ich"));
		e1.addMessage(new NodeMessage(Messagetype.Text,
				"Nein, leider nicht, aber ihre Spur schien immer heißer zu werden… Sie wurden mit jedem Mal unruhiger. Ich vermute, es muss ziemlich bedeutungsvoll gewesen sein.",
				10, "Onkel"));
		e1.addMessage(new NodeMessage(Messagetype.Text,
				"Weißt du was? Desto mehr ich darüber nachdenke, desto nervöser werde ich! Laut den Koordinaten aus der Tonaufnahme, befinde ich mich ganz in der Nähe! Ich werde ganz einfach meine Taschen packen und schauen, was mit meinen Kameraden passiert ist und ob es ihnen gut geht!",
				"Onkel"));

		// e2
		Node e2 = new Node();
		e2.addAnswer(new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1));
		e2.addMessage(new NodeMessage(Messagetype.Text, "Was genau waren das für Treffen?", "Ich"));
		e2.addMessage(new NodeMessage(Messagetype.Text,
				"Diese Treffen finden alle paar Monate statt. Dort tragen alle aus unserem Gebiet, d.h. jegliche Forscher, ihre Erkenntnisse usw. der letzten Monate vor, z.B. was sie ausgegraben haben.",
				"Onkel"));

		// d1
		Node d1 = new Node();
		d1.addAnswer(new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1));
		d1.addAnswer(new Answer("Was genau waren das für Treffen?", e2));
		d1.addMessage(new NodeMessage(Messagetype.Text,
				"War ja mal wieder klar, so kennt man dich… Ich kann mal schauen, was sich da so machen lässt. Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??",
				"Ich"));
		d1.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als wären sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Gerücht rum, sie würden irgendetwas Bestimmtes suchen.",
				"Onkel"));

		// d2
		Node d2 = new Node();
		d2.addAnswer(new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1));
		d2.addAnswer(new Answer("Was genau waren das für Treffen?", e2));
		d2.addMessage(new NodeMessage(Messagetype.Text,
				"Ne sorry, ich besorge mir, wenn nur Stoff für mich alleine. Ich bin ja kein Dealer oder so… Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??",
				"Ich"));
		d2.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als wären sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Gerücht rum, sie würden irgendetwas Bestimmtes suchen.",
				"Onkel"));

		// d3
		Node d3 = new Node();
		d3.addAnswer(new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1));
		d3.addAnswer(new Answer("Was genau waren das für Treffen?", e2));
		d3.addMessage(new NodeMessage(Messagetype.Text,
				"Hättest du mal früher was gesagt, ich habe gerade schon bestellt! Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??",
				"Ich"));
		d3.addMessage(new NodeMessage(Messagetype.Text,
				"Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als wären sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Gerücht rum, sie würden irgendetwas Bestimmtes suchen.",
				"Onkel"));

		// c1
		Node c1 = new Node();
		c1.addAnswer(new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1));
		c1.addAnswer(new Answer("Was genau waren das für Treffen?", e2));
		c1.addMessage(new NodeMessage(Messagetype.Text, "Ähm… Ein Freund hat mich darauf aufmerksam gemacht.", "Ich"));
		c1.addMessage(new NodeMessage(Messagetype.Text, "Hm okay, sehr interessant.?", "Onkel"));
		c1.addMessage(new NodeMessage(Messagetype.Text,
				"Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??", "Ich"));

		// c2
		Node c2 = new Node();
		c2.addAnswer(new Answer(
				"War ja mal wieder klar, so kennt man dich… Ich kann mal schauen, was sich da so machen lässt.", d1));
		c2.addAnswer(new Answer(
				"Ne sorry, ich besorge mir, wenn nur Stoff für mich alleine. Ich bin ja kein Dealer oder so…", d2));
		c2.addAnswer(new Answer("Hättest du mal früher was gesagt, ich habe gerade schon bestellt!", d3));
		c2.addMessage(new NodeMessage(Messagetype.Text,
				"Um ehrlich zu sein… Im Darknet… Ich hab nach dem neusten Shit an Drogen gesucht…", "Ich"));
		c2.addMessage(new NodeMessage(Messagetype.Text,
				"Was? Das kann doch nicht dein Ernst sein!! Ich glaube das einfach nicht… Für mich bist du immer noch der zehnjährige kleine Junge, der sich ein Loch in den Bauch lacht, weil ich mich auf ein Furzkissen gesetzt habe...das du mir natürlich vorher untergeschoben hast! "
						+ "Naja… Wenn du schon mal dabei bist… kannst du mir ja evtl demnächst mal ein bisschen was mitbestellen?",
				"Onkel"));

		// b2
		Node b2 = new Node();
		b2.addAnswer(new Answer("Ähm… Ein Freund hat mich darauf aufmerksam gemacht.", c1));
		b2.addAnswer(
				new Answer("Um ehrlich zu sein… Im Darknet… Ich hab nach dem neusten Shit an Drogen gesucht…", c2));
		b2.addMessage(new NodeMessage(Messagetype.Text, "Was?? Das kann doch kein Zufall sein!", "Ich"));
		b2.addMessage(new NodeMessage(Messagetype.Text,
				"Ich kann es auch noch nicht fassen. Ich hoffe es geht ihnen gut… Aber sag mal, wo hast du die Aufnahme überhaupt gefunden?",
				"Onkel"));

		// b3
		Node b3 = new Node();
		b3.addAnswer(new Answer("Ähm… Ein Freund hat mich darauf aufmerksam gemacht.", c1));
		b3.addAnswer(
				new Answer("Um ehrlich zu sein… Im Darknet… Ich hab nach dem neusten Shit an Drogen gesucht…", c2));
		b3.addMessage(new NodeMessage(Messagetype.Text, "Wie meinst du das? Woher kennst du die Personen auf dem Band?",
				"Ich"));
		b3.addMessage(new NodeMessage(Messagetype.Text,
				"Dazu kommen wir gleich. Sag mir erstmal, wo du die Aufnahme gefunden hast?!", "Onkel"));

		// ending1
		Node ending1 = new Node();
		ending1.addMessage(new NodeMessage(Messagetype.Text,
				"Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. "
						+ "Du, sein Neffe, hörst in den Nachrichten: Es wurde ein abgstürztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.",
				"Erzähler"));

		// Ausgangssituation
		Node ausgangssituation = new Node();
		ausgangssituation.addAnswer(new Answer(
				"Okay, dann überlasse ich es ab jetzt dir… falls du einen Schatz findest, sag mal Bescheid.", ending1));
		ausgangssituation.addAnswer(new Answer("Was?? Das kann doch kein Zufall sein!", b2));
		ausgangssituation.addAnswer(new Answer("Wie meinst du das? Woher kennst du die Personen auf dem Band?", b3));
		ausgangssituation.addMessage(new NodeMessage(Messagetype.Text,
				"Onkel Peter! Du kannst dir nicht vorstellen, was ich gerade gefunden habe! Vielleicht ist es auch nur Fake, aber hier: höre selbst!",
				"Ich"));
		ausgangssituation.addMessage(new NodeMessage(Messagetype.Voice, "../ressources/aufnahmeBlackbox.mp3", "Ich"));
		ausgangssituation.addMessage(new NodeMessage(Messagetype.Text, "Kein Fake, ich kenne sie!", "Onkel"));

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

		answerList.addAll(ausgangssituation.getAnswerList());
		answerList.addAll(b2.getAnswerList());
		answerList.addAll(b3.getAnswerList());
		answerList.addAll(c1.getAnswerList());
		answerList.addAll(c2.getAnswerList());
		answerList.addAll(d1.getAnswerList());
		answerList.addAll(d2.getAnswerList());
		answerList.addAll(d3.getAnswerList());
		answerList.addAll(e1.getAnswerList());
		answerList.addAll(e2.getAnswerList());
		answerList.addAll(f1.getAnswerList());
		answerList.addAll(f2.getAnswerList());
		answerList.addAll(f3.getAnswerList());
		answerList.addAll(g1.getAnswerList());
		answerList.addAll(h2.getAnswerList());
		answerList.addAll(j1.getAnswerList());
		answerList.addAll(j2.getAnswerList());
		answerList.addAll(k1.getAnswerList());
		answerList.addAll(k2.getAnswerList());
		answerList.addAll(k3.getAnswerList());
		answerList.addAll(l1.getAnswerList());
		answerList.addAll(m1.getAnswerList());
		answerList.addAll(n2.getAnswerList());
		answerList.addAll(o3.getAnswerList());
		return ausgangssituation;
	}

	public Node getFirstNode(long scenarioID) throws NodeNotFoundException {
		if (scenarioID == 0) {
			return scenarioOne;
		}
		if (scenarioID == 1) {

			return scenarioTwo;

		}
		throw new NodeNotFoundException("Scenario " + scenarioID + " ist nicht verfÃ¼gbar");
	}

	public List<Node> getNodeList() {
		return nodeList;
	}

	public static List<Answer> getAnswerList() {
		return answerList;
	}

}
