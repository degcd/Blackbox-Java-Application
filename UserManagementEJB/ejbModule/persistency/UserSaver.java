package persistency;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entities.User;

public class UserSaver {

	public static void saveUser(entities.User user, String filepath) {
		File f = new File(filepath);
		UserWrapper wrap = null;
		if (f.exists()) {

			JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(UserWrapper.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

				UserWrapper uw = (UserWrapper) jaxbUnmarshaller.unmarshal(f);
				wrap = uw;
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
		if (wrap == null) {
			wrap = new UserWrapper();
		}
		List<User> ul = wrap.getUser();
		ul.add(user);
		wrap.setUser(ul);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(UserWrapper.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			jaxbMarshaller.marshal(wrap, f);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static List<User> loadUser(String filepath) {
		List<User> ul = new ArrayList<>();
		File f = new File(filepath);
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(UserWrapper.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			UserWrapper uw = (UserWrapper) jaxbUnmarshaller.unmarshal(f);
			ul = uw.getUser();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return ul;
	}
}
