package beans;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import entities.Answer;
import entities.Messagetype;
import entities.Node;
import entities.NodeMessage;

public class ScenarioCreator {

    private static List<Node> scenarioOne = null;
    private static List<Node> scenarioTwo = null;

    public ScenarioCreator()
    {
        scenarioOne = createScenarioOne();
        scenarioTwo = createScenarioTwo();
    }

    public List<Node> createScenarioOne()
    {
        List<Node> nodeList = new ArrayList<Node>();

        //Declaring all Nodes
        Node ausgangssituation = null;
        nodeList.add(ausgangssituation);
        Node a2 = null;
        nodeList.add(a2);
        Node kd42 = null;
        nodeList.add(kd42);
        Node sd87 = null;
        nodeList.add(sd87);
        Node skd56 = null;
        nodeList.add(skd56);
        Node ending1 = null;
        nodeList.add(ending1);
        Node c1 = null;
        nodeList.add(c1);
        Node c2 = null;
        nodeList.add(c2);
        Node c3 = null;
        nodeList.add(c3);
        Node c3Alternativ = null;
        nodeList.add(c3Alternativ);
        Node f1 = null;
        nodeList.add(f1);
        Node f2 = null;
        nodeList.add(f2);
        Node f3 = null;
        nodeList.add(f3);
        Node ending2 = null;
        nodeList.add(ending2);
        Node d = null;
        nodeList.add(d);
        Node d1 = null;
        nodeList.add(d1);
        Node d2 = null;
        nodeList.add(d2);
        Node d3 = null;
        nodeList.add(d3);
        Node g1 = null;
        nodeList.add(g1);
        Node ending4 = null;
        nodeList.add(ending4);
        Node e1 = null;
        nodeList.add(e1);
        Node e2 = null;
        nodeList.add(e2);
        Node e3 = null;
        nodeList.add(e3);
        Node e4 = null;
        nodeList.add(e4);
        Node ending5 = null;
        nodeList.add(ending5);
        Node ending6 = null;
        nodeList.add(ending6);
        Node ending7 = null;
        nodeList.add(ending7);

        //Filling Nodes with values
        //Ausgangssituation
        LinkedList<Answer> answersForCurrentNode = new LinkedList<Answer>();
        Answer answer1 = new Answer("Kann das nicht jemand anderes �bernehmen? Ich stecke immer noch in den Ermittlungen bez�glich der Wasserleiche vom Fr�hlinger See fest.", ending1);
        answersForCurrentNode.add(answer1);
        Answer answer2 = new Answer("Supi, worum geht's?", a2);
        answersForCurrentNode.add(answer2);
        LinkedList<NodeMessage> messageList = new LinkedList<NodeMessage>();
        NodeMessage message1 = new NodeMessage(Messagetype.Text, "Hey Joe, ich hab da einen neuen Fall f�r dich.", "Kommissar Thomas");
        messageList.add(message1);
        ausgangssituation = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //a2
        answer1 = new Answer("H�rt sich spannend an. Leider hab ich gerade keinen Droiden frei, der diese Aufgaben �bernehmen kann.", ending1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Okay ich schicke schonmal einen Kontaktdroiden los. Leitest du mir die Akte weiter?", kd42);
        answersForCurrentNode.add(answer2);
        Answer answer3 = new Answer("Okay ich schicke schonmal einen Spurendroiden los. Leitest du mir die Akte weiter?", sd87);
        answersForCurrentNode.add(answer3);
        Answer answer4 = new Answer("Okay ich schicke schonmal einen Spuren- und Kontaktdroiden los. Leitest du mir die Akte weiter?", skd56);
        answersForCurrentNode.add(answer4);
        message1 = new NodeMessage(Messagetype.Text, "Eine junge Frau hat soeben einen toten Mann in ihrer Wohnung gefunden. Sie steht jetzt unter Schock. Jemand muss zu ihr, sie befragen und die Spuren m�ssen dort gesichert werden.", "Kommissar Thomas");
        messageList.add(message1);
        a2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //Ending1
        message1 = new NodeMessage(Messagetype.Text, "Es wurde zu sp�t gehandelt: Circa 30 Minuten nach dem ANruf bei der Polizei hat sich Frau M�ller erinnert, was passiert ist. Sie geriet in Panik und setzte die Wohnung in Flammen. So konnte der Mord und das Motiv nicht aufgekl�rt werden.", "Erz�hler" );
        messageList.add(message1);
        ending1 = new Node(messageList, answersForCurrentNode);
        messageList.clear();

        //KD42
        answer1 = new Answer("Droide beruhige die Frau", c1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Klar. Danke, dass du das �bernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas");
        messageList.add(message1);
        NodeMessage message2 = new NodeMessage(Messagetype.Image, "", 30, "Kommissar Thomas");
        messageList.add(message2);
        NodeMessage message3 = new NodeMessage(Messagetype.Text, "Ich bin bei Frau M�ller angekommen.","Droide");
        messageList.add(message3);
        NodeMessage messgae4 = new NodeMessage(Messagetype.Image, "", "Droide");
        messageList.add(messgae4);
        kd42 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //SD87
        answer1 = new Answer("Schaue dir den Tartort genauer an und entnehme Proben f�r das Labor", c3);
        answersForCurrentNode.add(answer1);
        message1 = new NodeMessage(Messagetype.Text, "Klar. Danke, dass du das �bernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Image, "", 30, "Kommissar Thomas");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Ich bin bei Frau M�ller angekommen.", "Droide");
        messageList.add(message3);
        messgae4 = new NodeMessage(Messagetype.Image, "", "Droide");
        messageList.add(messgae4);
        sd87 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //SKD56
        answer1 = new Answer("Droide beruhige die Frau", c1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("Schaue dir den Tartort genauer an und entnehme Proben f�r das Labor", c3);
        answersForCurrentNode.add(answer3);
        message1 = new NodeMessage(Messagetype.Text, "Klar. Danke, dass du das �bernimmst! Halte mich auf dem Laufenden.", "Kommissar Thomas");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Image, "", 30, "Kommissar Thomas");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Ich bin bei Frau M�ller angekommen.", "Droide");
        messageList.add(message3);
        messgae4 = new NodeMessage(Messagetype.Image, "", "Droide");
        messageList.add(messgae4);
        skd56 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //Ending2
        message1 = new NodeMessage(Messagetype.Text, "Beim Versuch die Frau zu beruhigen wurde Frau M�ller hysterisch und schlug den Druiden gegen die Wand, sodass er besch�digt wurde und die Verbindung abbrach. W�hrend ein Neustart versucht wurde, hat die Frau alle Beweise beseitigt und einen Brand gelegt. So konnte der Mord und das Motiv nicht aufgekl�rt werden.", "Erz�hler");
        messageList.add(message1);
        ending2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //C2
        answer1 = new Answer("Wei� sie, warum ihr Vater un der Wohnung ist?", f1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Hatte jemand einen Grund ihn umzubringen?", f2);
        answersForCurrentNode.add(answer2);
        answer3= new Answer("Hatte Frau M�ller irgendwelche Feinde oder m�glicherweise berufsbedingt Neider?", f3);
        answersForCurrentNode.add(answer3);
        message1 = new NodeMessage(Messagetype.Text, "Beim Opfer handelt es sich um den Vater der Frau. Wir befinden uns in der Wohnung der Frau. Sie hat ihren Vater erstochen aufgefunden als sie vom Einkaufen zur�ckkam.", "Droide");
        messageList.add(message1);
        c2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //C3
        answer1 = new Answer("Schaue dich weiter um und halte Ausschau nach der Mordwaffe", d);
        answersForCurrentNode.add(answer1);
        message1 = new NodeMessage(Messagetype.Text, "Ich habe Blutproben und Fingerabdr�cke sichergestellt. Eine Drohne ist jetzt auf dem Weg ins Labor. Es sieht nach einer t�dlichen Stichverletzung aus. Es befindet sich keine Mordwaffe am  unmittelbaren Tatort", "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Okay, ich schicke dir den Spu-Si-Trupp zur Unterst�tzung.", "Droide");
        messageList.add(message2);
        c3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //C3Alternativ
        answer1 = new Answer("Schaue dich weiter um und halte Ausschau nach der Mordwaffe", d);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Droide beruhige die Frau", c1);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("Befrage sie und finde heraus, an was sie sich erinnert.", c2);
        answersForCurrentNode.add(answer3);
        message1 = new NodeMessage(Messagetype.Text, "Ich habe Blutproben und Fingerabdr�cke sichergestellt. Eine Drohne ist jetzt auf dem Weg ins Labor. Es sieht nach einer t�dlichen Stichverletzung aus. Es befindet sich keine Mordwaffe am  unmittelbaren Tatort", "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Okay, ich schicke dir den Spu-Si-Trupp zur Unterst�tzung.", "Droide");
        messageList.add(message2);
        c3Alternativ = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //f1
        answer1 = new Answer("Hatte jemand einen Grund ihn umzubringen?", f2);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Hat Frau M�ller irgendwelche Feinde oder m�glicherweise berufsbedingt Neider?", f3);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Sie sagt, sie ist als Bloggerin viel unterwegs, deshalb hat er einen Schl�ssel, um ihre Katze zu versorgen", "Droide");
        messageList.add(message1);
        f1= new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //f2
        answer1 = new Answer("Hat Frau M�ller irgendwelche Feinde oder m�glicherweise berufsbedingt Neider?", f3);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Wei� sie, warum ihr Vater un der Wohnung ist?", f1);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Sie wei� nichts von m�glichen Feinden", "Droide");
        messageList.add(message1);
        f2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //f3
        answer1 = new Answer("Sehr gut, lass dir die Email zeigen und leite sie an mich weite.", ending4);
        answersForCurrentNode.add(answer1);
        message1 = new NodeMessage(Messagetype.Text, "�Guter Ansatzpunkt. Vielleicht hatte es der M�rder eigentlich auf sie abgesehen und ihr Vater war zur falschen Zeit am falschen Ort�",30, "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ja, sie hat letztens eine Droh-Email erhalten", "Droide");
        c3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending4
        message1 = new NodeMessage(Messagetype.Text,"Als die Frau den Laptop entsperrte, um dem Droiden die omin�se Droh-Email zu zeigen, war direkt ein Video zu sehen. Die Webkam hatte den Mord aufgezeichnet�!! Frau M�ller hat ihren Vater mit einem K�chenmesser erstochen. Als sie dies auf dem Bildschirm sah, wurde sie hysterisch und schlug den Droiden gegen die Wand, sodass er besch�digt wurde und die Verbindung abbrach. W�hrend ein Neustart versucht wurde, hat die Frau die restlichen Beweise beseitigt und einen Brand gelegt. So konnte ihr Motiv nicht aufgkl�rt werden","Erz�hler");
        messageList.add(message1);
        ending4 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //d
        answer1 = new Answer("Geh ins Badezimmer.", d1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Starte in der K�che.", d2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("Fang im Wohnzimmer an",d3);
        answersForCurrentNode.add(answer3);
        message1 = new NodeMessage(Messagetype.Text, "Wo soll ich anfangen?", "Droide");
        messageList.add(message1);
        d = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //d1
        answer1 = new Answer(" Epilepsie-Tabletten ", ending5);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Schlaftabletten", ending5);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer(" Schizophrenie-Tabletten", ending6);
        answersForCurrentNode.add(answer3);
        answer4 = new Answer("Magersucht-Tableetten", ending5);
        message1 = new NodeMessage(Messagetype.Image, "", "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Das ist das einzige Auff�llige, das ich gefunden habe. Kannst du herausfinden, was das f�r Tabletten sind", "Droide");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Kannst du mir noch eine Nahaufnahme schicken?", "Ich");
        messageList.add(message3);
        messgae4 = new NodeMessage(Messagetype.Image, "","Droide");
        messageList.add(messgae4);
        NodeMessage message5 = new NodeMessage(Messagetype.Text, "Ok ich google jetzt", "Ich");
        d1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //d2
        answer1 = new Answer("Schicke eine Drohne mit der m�glichen Mordwaffe los und schau dich weiter um", g1);
        answersForCurrentNode.add(answer1);
        message1 = new NodeMessage(Messagetype.Image, "", "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Hier wurde gekocht, die Dunstabzugshaube l�uft noch.",10, "Droide");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "In der Sp�le liegt ein K�chenmesser- m�glicherweise die Mordwaffe.","Droide");
        messageList.add(message3);
        messgae4 = new NodeMessage(Messagetype.Image, "", "Droide");
        messageList.add(messgae4);
        message5 = new NodeMessage(Messagetype.Text, "Sehr gut!", "Ich");
        d2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //d3
        answer1 = new Answer("Das ist ja interessant.", ending7);
        answersForCurrentNode.add(answer1);
        messgae4 = new NodeMessage(Messagetype.Text, "Ich habe Frau M�ller ins Bad geschickt, um sich ein wenig frisch zu machen.", "Droide");
        messageList.add(messgae4);
        message1 = new NodeMessage(Messagetype.Image, "", 10, "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich habe einen Laptop sichergestellt. Es befindet sich darauf ein Video. Anscheinend hat die Webcam den Mord aufgezeichnet.", "Droide");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Video, "", 10, "Droide");
        d3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //g1
        answer1 = new Answer("Geh ins Bad", d1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Geh ins Wohnzimmer", d3);
        answersForCurrentNode.add(answer2);
        g1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending5
        message1 = new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text,"Frau M�ller ist zwar in der Zwischenzeit verschwunden, jedoch konnten die Mordwaffe, ein K�chenmesser, und ein Beweisvideo, das per Webcam eines Laptops im Wohnzimmer mitgeschnitten wurde, sichergestellt werden. Der Mord konnte somit aufgekl�rt werden. Jedoch wurden die Tabletten falsch identifiziert, sodass das Motiv der Frau unklar bleibt","Erz�hler");
        messageList.add(message2);
        ending5 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending6
        message1 = new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text,"Frau M�ller ist zwar in der Zwischenzeit verschwunden, jedoch konnten die Mordwaffe, ein K�chenmesser, und ein Beweisvideo, das per Webcam eines Laptops im Wohnzimmer mitgeschnitten wurde, sichergestellt werden. Die Tabletten haben die Schizophrenie der Frau aufgedeckt. So konnte sowohl der Mord, als auch das Motiv der Frau aufgekl�rt werden.","Erz�hler");
        messageList.add(message2);
        ending6 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending7
        message1 = new NodeMessage(Messagetype.Text, "Die Frau ist verschwunden", "Droide");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text,"Als Frau M�ller ins Bad ging, konnte sie sich wieder erinnern, was passiert ist. Sie wurde hysterisch und schlug den Droiden gegen die Wand, sodass er besch�digt wurde und die Verbindung abbrach. W�hrend ein Neustart versucht wurde, hat die Frau die restlichen Beweise beseitigt und einen Brand gelegt. Gl�cklicherweise hatte der Droide schon kurz vorher das Video weitergeleitet, sodass der Mord aufgekl�rt werden konnte. Das Motiv bleibt jedoch unklar aufgrund mangelnder Beweise","Erz�hler");
        messageList.add(message2);
        ending7 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        return nodeList;
    }

    public List<Node> createScenarioTwo()
    {
        List<Node> nodeList = new ArrayList<Node>();

        //Declaring all Nodes
        Node ausgangssituation = null;
        nodeList.add(ausgangssituation);
        Node ending1 = null;
        nodeList.add(ending1);
        Node b2 = null;
        nodeList.add(b2);
        Node b3 = null;
        nodeList.add(b3);
        Node c1 = null;
        nodeList.add(c1);
        Node c2 = null;
        nodeList.add(c2);
        Node d1 = null;
        nodeList.add(d1);
        Node d2 = null;
        nodeList.add(d2);
        Node d3 = null;
        nodeList.add(d3);
        Node e1 = null;
        nodeList.add(e1);
        Node e2 = null;
        nodeList.add(e2);
        Node f1 = null;
        nodeList.add(f1);
        Node f2 = null;
        nodeList.add(f2);
        Node f3 = null;
        nodeList.add(f3);
        Node g1 = null;
        nodeList.add(g1);
        Node ending1_g2 = null;
        nodeList.add(ending1_g2);
        Node ending1_h1 = null;
        nodeList.add(ending1_h1);
        Node h2 = null;
        nodeList.add(h2);
        Node ending1_h3 = null;
        nodeList.add(ending1_h3);
        Node j1 = null;
        nodeList.add(j1);
        Node j2 = null;
        nodeList.add(j2);
        Node k1 = null;
        nodeList.add(k1);
        Node k2 = null;
        nodeList.add(k2);
        Node k3 = null;
        nodeList.add(k3);
        Node ending2_k4 = null;
        nodeList.add(ending2_k4);
        Node l1 = null;
        nodeList.add(l1);
        Node ending2_l2 = null;
        nodeList.add(ending2_l2);
        Node m1 = null;
        nodeList.add(m1);
        Node ending2_m2 = null;
        nodeList.add(ending2_m2);
        Node ending3_n1 = null;
        nodeList.add(ending3_n1);
        Node n2 = null;
        nodeList.add(n2);
        Node ending3_o1 = null;
        nodeList.add(ending3_o1);
        Node ending4_o2 = null;
        nodeList.add(ending4_o2);
        Node o3 = null;
        nodeList.add(o3);
        Node ending4_o4 = null;
        nodeList.add(ending4_o4);
        Node ending3_p1 = null;
        nodeList.add(ending3_p1);
        Node ending5_p2 = null;
        nodeList.add(ending5_p2);
        Node ending5_p3 = null;
        nodeList.add(ending5_p3);
        Node ending6_p4 = null;
        nodeList.add(ending6_p4);

        //Filling Nodes with values
        //Ausgangssituation
        LinkedList<Answer> answersForCurrentNode = new LinkedList<Answer>();
        Answer answer1 = new Answer("Okay, dann �berlasse ich es ab jetzt dir� falls du einen Schatz findest, sag mal Bescheid.", ending1);
        answersForCurrentNode.add(answer1);
        Answer answer2 = new Answer("Was?? Das kann doch kein Zufall sein!", b2);
        answersForCurrentNode.add(answer2);
        Answer answer3 = new Answer("Wie meinst du das? Woher kennst du die Personen auf dem Band?", b3);
        answersForCurrentNode.add(answer3);
        LinkedList<NodeMessage> messageList = new LinkedList<NodeMessage>();
        NodeMessage message1 = new NodeMessage(Messagetype.Text, "Onkel Peter! Du kannst dir nicht vorstellen, was ich gerade gefunden habe! Vielleicht ist es auch nur Fake, aber hier: h�re selbst!", "Ich");
        messageList.add(message1);
        NodeMessage message2 = new NodeMessage(Messagetype.Voice, "", "Ich");
        messageList.add(message2);
        NodeMessage message3 = new NodeMessage(Messagetype.Text, "Kein Fake, ich kenne sie!", "Onkel");
        messageList.add(message3);
        ausgangssituation = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending1
        message1 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. " +
                "Du, sein Neffe, h�rst in den Nachrichten: Es wurde ein abgst�rztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.", "Erz�hler" );
        messageList.add(message1);
        ending1 = new Node(messageList, answersForCurrentNode);
        messageList.clear();

        //b2
        answer1 = new Answer("�hm� Ein Freund hat mich darauf aufmerksam gemacht.", c1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Um ehrlich zu sein� Im Darknet� Ich hab nach dem neusten Shit an Drogen gesucht�", c2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Was?? Das kann doch kein Zufall sein!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich kann es auch noch nicht fassen. Ich hoffe es geht ihnen gut� Aber sag mal, wo hast du die Aufnahme �berhaupt gefunden?", "Onkel");
        messageList.add(message2);
        b2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //b3
        answer1 = new Answer("�hm� Ein Freund hat mich darauf aufmerksam gemacht.", c1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Um ehrlich zu sein� Im Darknet� Ich hab nach dem neusten Shit an Drogen gesucht�", c2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Wie meinst du das? Woher kennst du die Personen auf dem Band?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Dazu kommen wir gleich. Sag mir erstmal, wo du die Aufnahme gefunden hast?!", "Onkel");
        messageList.add(message2);
        b3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //c1
        answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Was genau waren das f�r Treffen?", e2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "�hm� Ein Freund hat mich darauf aufmerksam gemacht.", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Hm okay, sehr interessant.?", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??", "Ich");
        messageList.add(message3);
        c1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //c2
        answer1 = new Answer("War ja mal wieder klar, so kennt man dich� Ich kann mal schauen, was sich da so machen l�sst.", d1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Ne sorry, ich besorge mir, wenn nur Stoff f�r mich alleine. Ich bin ja kein Dealer oder so�", d2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("H�ttest du mal fr�her was gesagt, ich habe gerade schon bestellt!", d3);
        answersForCurrentNode.add(answer3);
        message1 = new NodeMessage(Messagetype.Text, "Um ehrlich zu sein� Im Darknet� Ich hab nach dem neusten Shit an Drogen gesucht�", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Was? Das kann doch nicht dein Ernst sein!! Ich glaube das einfach nicht� F�r mich bist du immer noch der zehnj�hrige kleine Junge, der sich ein Loch in den Bauch lacht, weil ich mich auf ein Furzkissen gesetzt habe...das du mir nat�rlich vorher untergeschoben hast! " +
                "Naja� Wenn du schon mal dabei bist� kannst du mir ja evtl demn�chst mal ein bisschen was mitbestellen?", "Onkel");
        messageList.add(message2);
        c2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //d1
        answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Was genau waren das f�r Treffen?", e2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "War ja mal wieder klar, so kennt man dich� Ich kann mal schauen, was sich da so machen l�sst. Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als w�ren sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Ger�cht rum, sie w�rden irgendetwas Bestimmtes suchen.", "Onkel");
        messageList.add(message2);
        d1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //d2
        answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Was genau waren das f�r Treffen?", e2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Ne sorry, ich besorge mir, wenn nur Stoff f�r mich alleine. Ich bin ja kein Dealer oder so� Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als w�ren sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Ger�cht rum, sie w�rden irgendetwas Bestimmtes suchen.", "Onkel");
        messageList.add(message2);
        d2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //d3
        answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Was genau waren das f�r Treffen?", e2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "H�ttest du mal fr�her was gesagt, ich habe gerade schon bestellt! Aber woher kennst du die Leute auf der Aufnahme denn jetzt eigentlich??", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich habe sie ein paar Mal auf unseren Kollegentreffen gesehen. Es schien so, als w�ren sie ganz nett, allerdings haben sie fast immer nur aufeinander gehockt und getuschelt. Es ging das Ger�cht rum, sie w�rden irgendetwas Bestimmtes suchen.", "Onkel");
        messageList.add(message2);
        d3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //e1
        answer1 = new Answer("Warte auf mich, ich m�chte auch mitkommen!", f1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Das ist doch viel zu gef�hrlich alleine!", f2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("Sei vorsichtig!", f3);
        answersForCurrentNode.add(answer3);
        message1 = new NodeMessage(Messagetype.Text, "Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Nein, leider nicht, aber ihre Spur schien immer hei�er zu werden� Sie wurden mit jedem Mal unruhiger. Ich vermute, es muss ziemlich bedeutungsvoll gewesen sein.", 10, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Wei�t du was? Desto mehr ich dar�ber nachdenke, desto nerv�ser werde ich! Laut den Koordinaten aus der Tonaufnahme, befinde ich mich ganz in der N�he! Ich werde ganz einfach meine Taschen packen und schauen, was mit meinen Kameraden passiert ist und ob es ihnen gut geht!", "Onkel");
        messageList.add(message3);
        e1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //e2
        answer1 = new Answer("Hast du eine Vermutung, wonach deine Kollegen gesucht haben?", e1);
        answersForCurrentNode.add(answer1);
        message1 = new NodeMessage(Messagetype.Text, "Was genau waren das f�r Treffen?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Diese Treffen finden alle paar Monate statt. Dort tragen alle aus unserem Gebiet, d.h. jegliche Forscher, ihre Erkenntnisse usw. der letzten Monate vor, z.B. was sie ausgegraben haben.", "Onkel");
        messageList.add(message2);
        e2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //f1
        answer1 = new Answer("Klar helfe ich dir!", g1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Hm, ich wei� nicht. Ich muss gleich los, ich habe daf�r eigentlich keine Zeit.", ending1_g2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Warte auf mich, ich m�chte auch mitkommen!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Nein, das ist zu gef�hrlich� Au�erdem dauert es viel zu lange, bis du hier bist. Aber du k�nntest mir bestimmt trotzdem irgendwie von zu Hause aus helfen, was h�ltst du davon?", "Onkel");
        messageList.add(message2);
        f1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //f2
        answer1 = new Answer("Klar helfe ich dir!", g1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Hm, ich wei� nicht. Ich muss gleich los, ich habe daf�r eigentlich keine Zeit.", ending1_g2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Das ist doch viel zu gef�hrlich alleine!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ach Quatsch, ich bin das gewohnt� Au�erdem habe ich ja dich! K�nnte sein, dass ich w�hrend meines Ausflugs deine Unterst�tzung brauche. Hast du Lust, mir zu helfen?", "Onkel");
        messageList.add(message2);
        f2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //f3
        answer1 = new Answer("Klar helfe ich dir!", g1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Hm, ich wei� nicht. Ich muss gleich los, ich habe daf�r eigentlich keine Zeit.", ending1_g2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Sei vorsichtig!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Das bin ich doch immer, sonst w�re ich schon l�ngst tot. M�glicherweise k�nnte es sein, dass ich w�hrend meines Ausfluges deine Unterst�tzung brauche. Hast du Lust, mir zu helfen?", "Onkel");
        messageList.add(message2);
        f3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //g1
        answer1 = new Answer("Mit dem Auto.", ending1_h1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Mit einem Boot.", h2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("Mit einem Flugzeug.", ending1_h3);
        answersForCurrentNode.add(answer3);
        message1 = new NodeMessage(Messagetype.Text, "Klar helfe ich dir!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Perfekt! Du kannst mich auch schon direkt beraten� Wie komme ich am besten zu den Koordinaten?", "Onkel");
        messageList.add(message2);
        g1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending1_g2
        message1 = new NodeMessage(Messagetype.Text, "Hm, ich wei� nicht. Ich muss gleich los, ich habe daf�r eigentlich keine Zeit.", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Na gut, ich schaffe das auch alleine. Ich fliege jetzt mal zu den Koordinaten, ich habe mir ein Segelflugzeug gemietet. Ich halte dich auf dem Laufenden.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. " +
                "Du, sein Neffe, h�rst in den Nachrichten: Es wurde ein abgst�rztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.", "Erz�hler" );
        messageList.add(message3);
        ending1_g2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending1_h1
        message1 = new NodeMessage(Messagetype.Text, "Mit dem Auto.", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "�hm, ich denke nicht, dass du eine so gute Hilfe bist. Ich nehme lieber das Flugzeug.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. " +
                "Du, sein Neffe, h�rst in den Nachrichten: Es wurde ein abgst�rztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.", "Erz�hler" );
        messageList.add(message3);
        ending1_h1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //h2
        answer1 = new Answer("Siehst du das Flugzeug?", j1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Was siehst du?", j2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Mit einem Boot.", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Gut, ich mache mich auf den Weg. Ich melde mich, wenn ich auf der Insel angekommen bin.", 50, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Ich bin jetzt auf der Insel angekommen!", "Onkel");
        messageList.add(message3);
        h2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending1_h3
        message1 = new NodeMessage(Messagetype.Text, "Mit einem Flugzeug.", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Gut, ich mache mich auf den Weg. Ich melde mich, wenn ich auf der Insel angekommen bin.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat dir nicht mehr geantwortet. Es stellte sich heraus, dass er bei einem Flugzeugabsturz verstorben ist. " +
                "Du, sein Neffe, h�rst in den Nachrichten: Es wurde ein abgst�rztes Flugzeug auf einer Insel gefunden, die Ursache ist unklar. Alle Insassen sind tot.", "Erz�hler" );
        messageList.add(message3);
        ending1_h3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //j1
        answer1 = new Answer("Siehst du etwas, was deine Kollegen gesucht haben k�nnten, eine Art Schatz?", k1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Kannst du erkennen, ob einer deiner Kollegen �berlebt hat?", k2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("Erkennst du, was die Ursache f�r den Absturz war?", k3);
        answersForCurrentNode.add(answer3);
        Answer answer4 = new Answer("Dann ruf lieber die Polizei!", ending2_k4);
        answersForCurrentNode.add(answer4);
        message1 = new NodeMessage(Messagetype.Text, "Siehst du das Flugzeug?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich sehe nichts au�er Sandstrand und einen Wald aus Palmen. Ich denke, Ich gehe mal tiefer in den Palmenwald, ich melde mich gleich wieder.", 20, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Ich habe das Flugzeug gefunden! Das sieht gar nicht gut aus� Das Flugzeug ist in den Fu� eines Berges geflogen und hat ein richtiges Loch reingeschlagen!", "Onkel");
        messageList.add(message3);
        j1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //j2
        answer1 = new Answer("Siehst du etwas, was deine Kollegen gesucht haben k�nnten, eine Art Schatz?", k1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Kannst du erkennen, ob einer deiner Kollegen �berlebt hat?", k2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("Erkennst du, was die Ursache f�r den Absturz war?", k3);
        answersForCurrentNode.add(answer3);
        answer4 = new Answer("Dann ruf lieber die Polizei!", ending2_k4);
        answersForCurrentNode.add(answer4);
        message1 = new NodeMessage(Messagetype.Text, "Was siehst du?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich sehe nichts au�er Sandstrand und einen Wald aus Palmen. Ich denke, Ich gehe mal tiefer in den Palmenwald, ich melde mich gleich wieder.", 20, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Ich habe das Flugzeug gefunden! Das sieht gar nicht gut aus� Das Flugzeug ist in den Fu� eines Berges geflogen und hat ein richtiges Loch reingeschlagen!", "Onkel");
        messageList.add(message3);
        j2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //k1
        answer1 = new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Dann ruf lieber die Polizei!", ending2_l2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Siehst du etwas, was deine Kollegen gesucht haben k�nnten, eine Art Schatz?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Nein. Ich sehe nur ganz viele einzelne Flugzeugteile�", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen �berlebt hat?", "Ich");
        messageList.add(message3);
        NodeMessage message4 = new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal n�her ran, warte kurz.", 10, "Onkel");
        messageList.add(message4);
        NodeMessage message5 = new NodeMessage(Messagetype.Text, "Oh Gott, das sieht �bel aus. Keiner bewegt sich. Ich denke, keiner hat �berlebt, aber ich traue mich nicht ins Flugzeug�", "Onkel");
        messageList.add(message5);
        k1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //k2
        answer1 = new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Dann ruf lieber die Polizei!", ending2_l2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen �berlebt hat?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal n�her ran, warte kurz.", 10, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Oh Gott, das sieht �bel aus. Keiner bewegt sich. Ich denke, keiner hat �berlebt, aber ich traue mich nicht ins Flugzeug�", "Onkel");
        messageList.add(message3);
        k2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //k3
        answer1 = new Answer("Trau dich! Vielleicht lebt ja noch einer!", l1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Dann ruf lieber die Polizei!", ending2_l2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Erkennst du, was die Ursache f�r den Absturz war?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Nein, keine Chance. Ich denke, das kann nur ein Profi.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Kannst du erkennen, ob einer deiner Kollegen �berlebt hat?", "Ich");
        messageList.add(message3);
        message4 = new NodeMessage(Messagetype.Text, "Nicht wirklich. Ich gehe mal n�her ran, warte kurz.", 10, "Onkel");
        messageList.add(message4);
        message5 = new NodeMessage(Messagetype.Text, "Oh Gott, das sieht �bel aus. Keiner bewegt sich. Ich denke, keiner hat �berlebt, aber ich traue mich nicht ins Flugzeug�", "Onkel");
        messageList.add(message5);
        k3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending2_k4
        message1 = new NodeMessage(Messagetype.Text, "Dann ruf lieber die Polizei!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Du hast Recht, bis gleich!", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...", "Erz�hler" );
        messageList.add(message3);
        ending2_k4 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //l1
        answer1 = new Answer("Das ist aber komisch, dass es zieht� Normalerweise sollte im Berg doch kein Platz f�r Luft sein oder?", m1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Also an deiner Stelle w�rde ich jetzt, so schnell es geht, aus dem Flugzeug verschwinden und die Polizei anrufen, bevor alles zusammenbricht.", ending2_m2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Trau dich! Vielleicht lebt ja noch einer!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Okay, ich gehe rein�", 5, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Hier ist alles voller Blut, sowas habe ich noch nie gesehen! Niemand atmet mehr� Wahrscheinlich sind sie direkt kurz nach dem Absturz gestorben� Was f�r eine Schande�", 5, "Onkel");
        messageList.add(message3);
        message4 = new NodeMessage(Messagetype.Text, "Ich habe irgendwie das Gef�hl, dass es hier zieht� Ich glaube das kommt vorne vom Cockpit. Sieht ziemlich einsturzgef�hrdet aus. Es steckt halb im Berg.", "Onkel");
        messageList.add(message4);
        l1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending2_l2
        message1 = new NodeMessage(Messagetype.Text, "Dann ruf lieber die Polizei!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Du hast Recht, bis gleich!", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...", "Erz�hler" );
        messageList.add(message3);
        ending2_l2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //m1
        answer1 = new Answer("Dann lass das mal lieber.", ending3_n1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("Dann schau einfach, wie weit du kommst!", n2);
        answersForCurrentNode.add(answer2);
        message1 = new NodeMessage(Messagetype.Text, "Das ist aber komisch, dass es zieht� Normalerweise sollte im Berg doch kein Platz f�r Luft sein oder?", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Normalerweise nicht� Jetzt hat mich mein Forscherherz gepackt! Ich schaue mal vorsichtig nach, ob ich die Ursache sehen kann.", 10, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Tats�chlich! Hier ist eine Art unterirdische H�hle! Irgendwie wirkt es wie eine Art gewollter Eingang zu etwas� Eigentlich w�rde ich gerne nachschauen, wohin der Gang f�hrt, aber ich habe keine Ausr�stung dabei.", "Onkel");
        messageList.add(message3);
        m1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending2_m2
        message1 = new NodeMessage(Messagetype.Text, "Also an deiner Stelle w�rde ich jetzt, so schnell es geht, aus dem Flugzeug verschwinden und die Polizei anrufen, bevor alles zusammenbricht.", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Du hast Recht, ich verschwinde hier.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...", "Erz�hler" );
        messageList.add(message3);
        ending2_m2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending3_n1
        message1 = new NodeMessage(Messagetype.Text, "Dann lass das mal lieber.", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Okay, dann werde ich jetzt die Polizei rufen.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Nachdem dein Onkel die Polizei gerufen hat, entdeckte diese in der H�hle eine unterirdische Stadt mit antiken Sch�tzen. " +
                "Zudem fand die Polizei heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. " +
                "Diese News gingen durch die Medien, allerdings wurde der Held, n�mlich dein Onkel, mit keinem Wort erw�hnt...", "Erz�hler" );
        messageList.add(message3);
        ending3_n1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        // TODO: 30.01.2020  Falle!!!
        //n2
        answer1 = new Answer("", ending3_o1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("", ending4_o2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("", o3);
        answersForCurrentNode.add(answer3);
        answer4 = new Answer("", ending4_o4);
        answersForCurrentNode.add(answer4);
        message1 = new NodeMessage(Messagetype.Text, "Dann schau einfach, wie weit du kommst!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Na gut, ich kann ja dann immer noch umdrehen�", 10, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Oh nein! Ich glaube, ich habe gerade eine Falle ausgel�st bzw. noch nicht ganz� Ich stecke mittendrin! Hier ist ein Bild! Kannst du mal GOOGLEN, wie man sie entsch�rfen kann? Du k�nntest nach XYZ suchen.", "Onkel");
        messageList.add(message3);
        message4 = new NodeMessage(Messagetype.Image, "", "Onkel");
        messageList.add(message4);
        n2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending3_o1
        message1 = new NodeMessage(Messagetype.Text, "Ich kann nichts finden!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Okay, dann werde ich jetzt die Polizei rufen. Ich hoffe, sie k�nnen mir helfen.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...", "Erz�hler" );
        messageList.add(message3);
        ending3_o1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        // TODO: 30.01.2020
        //ending4_o2
        message1 = new NodeMessage(Messagetype.Text, "", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel geh�rt hast." +
                "Es stellte sich heraus, dass die Falle falsch entsch�rft wurde und dein Onkel dabei ums Leben kam. Jedoch entdeckte die Polizei in der H�hle eine unterirdische Stadt mit antiken Sch�tzen. " +
                "Zudem fand sie heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. " +
                "Diese News gingen durch die Medien, allerdings wurde der Held, n�mlich dein Onkel, mit keinem Wort erw�hnt...", "Erz�hler" );
        messageList.add(message3);
        ending4_o2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        // TODO: 30.01.2020
        //o3
        answer1 = new Answer("Ich kann nichts finden�", ending3_p1);
        answersForCurrentNode.add(answer1);
        answer2 = new Answer("PAT", ending5_p2);
        answersForCurrentNode.add(answer2);
        answer3 = new Answer("HZK", ending5_p3);
        answersForCurrentNode.add(answer3);
        answer4 = new Answer("LNU", ending6_p4);
        answersForCurrentNode.add(answer4);
        message1 = new NodeMessage(Messagetype.Text, "", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", 10, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Jawoll, es hat geklappt! Ich lebe! Weiter geht�s!", 10, "Onkel");
        messageList.add(message3);
        message4 = new NodeMessage(Messagetype.Text, "Da ist ein Tor! Ganz sch�n gro߅ und vor allem verschlossen. Ich glaube, man muss hier ne Art Buchstabencode eingeben�", "Onkel");
        messageList.add(message4);
        message5 = new NodeMessage(Messagetype.Text, "Ah, hier an der Wand scheint ne Art geheime Botschaft zu sein� Vielleicht muss man es ja �bersetzen? Findest du eventuell etwas bei GOOGLE?", "Onkel");
        messageList.add(message5);
        NodeMessage message6 = new NodeMessage(Messagetype.Image, "", 5, "Onkel");
        messageList.add(message6);
        NodeMessage message7 = new NodeMessage(Messagetype.Text, "Sieht mir ganz nach Hieroglyphen aus...", "Onkel");
        messageList.add(message7);
        o3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();
        
        // TODO: 30.01.2020
        //ending4_o4
        message1 = new NodeMessage(Messagetype.Text, "", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel geh�rt hast." +
                "Es stellte sich heraus, dass die Falle falsch entsch�rft wurde und dein Onkel dabei ums Leben kam. Jedoch entdeckte die Polizei in der H�hle eine unterirdische Stadt mit antiken Sch�tzen. " +
                "Zudem fand sie heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist. " +
                "Diese News gingen durch die Medien, allerdings wurde der Held, n�mlich dein Onkel, mit keinem Wort erw�hnt...", "Erz�hler" );
        messageList.add(message3);
        ending4_o4 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending3_p1
        message1 = new NodeMessage(Messagetype.Text, "Ich kann nichts finden!", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Hm� Ich m�chte auch nichts Falsches eingeben� Dann sollte ich jetzt lieber die Polizei rufen��", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Der Onkel hat das Cockpit des Flugzeugs durchsucht, dort aber nichts gefunden. Die Absturzursache bleibt unklar...", "Erz�hler" );
        messageList.add(message3);
        ending3_p1 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending5_p2
        message1 = new NodeMessage(Messagetype.Text, "PAT", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel geh�rt hast." +
                "Es stellte sich heraus, dass der Code wohl falsch eingegeben wurde, die H�hle daraufhin einst�rzte und dein Onkel dabei versch�ttet wurde. Es dauerte 2 Jahre, bis das Chaos beseitigt werden konnte. " +
                "Es wurde in der H�hle eine unterirdische Stadt mit antiken Sch�tzen gefunden. Zudem fand man heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist.", "Erz�hler" );
        messageList.add(message3);
        ending5_p2 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending5_p3
        message1 = new NodeMessage(Messagetype.Text, "HZK", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Was geschah: Nach einiger Zeit hast du die Polizei informiert, da du nichts mehr von deinem Onkel geh�rt hast." +
                "Es stellte sich heraus, dass der Code wohl falsch eingegeben wurde, die H�hle daraufhin einst�rzte und dein Onkel dabei versch�ttet wurde. Es dauerte 2 Jahre, bis das Chaos beseitigt werden konnte. " +
                "Es wurde in der H�hle eine unterirdische Stadt mit antiken Sch�tzen gefunden. Zudem fand man heraus, dass ein magnetisches Feld die Systeme des Flugzeuges lahmgelegt hat und es deshalb zum Absturz gekommen ist.", "Erz�hler" );
        messageList.add(message3);
        ending5_p3 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        //ending6_p4
        message1 = new NodeMessage(Messagetype.Text, "LNU", "Ich");
        messageList.add(message1);
        message2 = new NodeMessage(Messagetype.Text, "Ich probiere es mal aus.", 10, "Onkel");
        messageList.add(message2);
        message3 = new NodeMessage(Messagetype.Text, "Es funktioniert! Das Tor �ffnet sich!", 10, "Onkel");
        messageList.add(message3);
        message4 = new NodeMessage(Messagetype.Text, "Wow!! Hier ist eine KOMPLETTE Stadt im Berg!! Danach haben meine Kollegen wohl gesucht� Schade, dass sie es nicht mit eigenen Augen sehen konnten� Das ist einfach unglaublich!!", "Onkel");
        messageList.add(message4);
        message5 = new NodeMessage(Messagetype.Image, "", 5, "Onkel");
        messageList.add(message5);
        message6 = new NodeMessage(Messagetype.Text, "Ich denke, das ist der H�hepunkt meiner Karriere, wahrscheinlich sogar meines gesamten Lebens! Was hier wohl alles verborgen sein mag� Danke f�r deine Hilfe! Ohne dich h�tte ich die Stadt bestimmt nicht gefunden, geschweige denn �berlebt!", "Onkel");
        messageList.add(message6);
        message7 = new NodeMessage(Messagetype.Text, "Was geschah: Diese News gingen durch die Medien! Dein Onkel wurde ber�hmt und ausgezeichnet. Im Nachhinein konnte auch die Absturzursache festgestellt werden:" +
                "ein magnetisches Feld hatte die Systeme lahmgelegt. ", "Erz�hler");
        ending6_p4 = new Node(messageList, answersForCurrentNode);
        answersForCurrentNode.clear();
        messageList.clear();

        
        return nodeList;
    }

    public Node getFirstNode(long scenarioID) {
        if(scenarioID==0){
            return scenarioOne.get(0);
        }
        else if(scenarioID==1){
            return scenarioTwo.get(0);
        }
        //TODO exceptions
        return null;
    }
}

