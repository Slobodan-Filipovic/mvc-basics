package repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import models.Veterinar;
import repos.interfaces.IVeterinarRepository;

@Repository
public class VeterinarRepositoryImpl implements IVeterinarRepository {

	private List<Veterinar> vetList;

	public VeterinarRepositoryImpl() {
		vetList = new ArrayList<Veterinar>();
		vetList.add(new Veterinar(1, "mika", "antic", "123"));
		vetList.add(new Veterinar(2, "pera", "peric", "456"));
		vetList.add(new Veterinar(3, "zika", "zikic", "789"));
		vetList.add(new Veterinar(4, "joca", "jocic", "321"));
	}

	public List<Veterinar> getAll() {
		return vetList;
		/*
		 * List<Veterinar> returnValue = new ArrayList<Veterinar>(); returnValue.add(new
		 * Veterinar(1, "mika" , "antic", "123")); returnValue.add(new Veterinar(2,
		 * "pera" , "peric", "456")); returnValue.add(new Veterinar(3, "zika" , "zikic",
		 * "789")); returnValue.add(new Veterinar(4, "joca" , "jocic", "321"));
		 * 
		 * 
		 * return returnValue;
		 */
	}

	public void addVeterinar(Veterinar v) {
		vetList.add(v);

	}

	public void deleteVeterinar(int id) {
		vetList.remove(id);
	}

}
