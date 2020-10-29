
public class Resume {

	public static void main(String[] args) {
		Info a= new Info();
		cgpa c = new cgpa();
		examResult e = new examResult();
		language l = new language();
		workExperiences w = new workExperiences();
		skills s = new skills();
		talent t = new talent();
		System.out.println("\tRESUME");
        System.out.println("Name: " + a.name);
        System.out.println("Gender: "+ a.gender);
        System.out.println("Birthday: "+ a.birthday);
        System.out.println("Age:" +a.age);
        System.out.println("Marital Status:" + a.status);
        System.out.println("Citizenship:"+ a.citizenship);
        System.out.println("Home Address:"+ a.address);
        System.out.println("HP: " + a.phonenumber);
        System.out.println("Exam Result(STIA113):" + e.result );
        System.out.println("CGPA: " + c.cgpa);
        System.out.println("Work Experiences: " + w.experiences);
        System.out.println("Language: " + l.speak);
        System.out.println("Skills: " + s.whatIcando );
        System.out.println("Awards % Certificate:" + t.idono );
        
    }




}