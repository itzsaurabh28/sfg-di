/**
 * 
 */
package kumar.saurabh.pets;

/**
 * @author kumar
 * 
 *         Trying to implement factory pattern under spring context
 *
 */

public class PetServiceFactory {

	public PetService getPetService(String petType) {

		switch (petType) {
		case "dog":
			return new DogPetService();
		case "cat":
			return new CatPetService();
		default:
			return new DogPetService();
		}

	}

}
