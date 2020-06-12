package Controler;


public class Person {

	
	private int id;
	private String name;
	private String vorname;
	private String strasse;
	private int strnummer;
	private int plz;
	private String ort;
	private String land;
	private String infiziert;
	private String pw;
	private String username;
	
	
	
	public Person(){}

	public Person(Person person){
		this.id=person.id;
    	this.name=person.name;
    	this.vorname=person.vorname;
    	this.strasse=person.strasse;
    	this.strnummer=person.strnummer;
    	this.plz=person.plz;
    	this.ort=person.ort;
    	this.land=person.land;
    	this.infiziert=person.infiziert;
    	this.pw=person.pw;
    	this.username=person.username;	
	}
	
    public Person(int id, String name, String vorname,String strasse,int strnummer,int plz,String ort,String land,String infiziert,String pw,String username){	
    	this.id=id;
    	this.name=name;
    	this.vorname=vorname;
    	this.strasse=strasse;
    	this.strnummer=strnummer;
    	this.plz=plz;
    	this.ort=ort;
    	this.land=land;
    	this.infiziert=infiziert;
    	this.pw=pw;
    	this.username=username;	 	
    }
    
    public void talk(){
    	System.out.println(this.name);
    }
    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getStrasse() {
		return strasse;
	}


	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}


	public int getStrnummer() {
		return strnummer;
	}


	public void setStrnummer(int strnummer) {
		this.strnummer = strnummer;
	}


	public int getPlz() {
		return plz;
	}


	public void setPlz(int plz) {
		this.plz = plz;
	}


	public String getOrt() {
		return ort;
	}


	public void setOrt(String ort) {
		this.ort = ort;
	}


	public String getLand() {
		return land;
	}


	public void setLand(String land) {
		this.land = land;
	}


	public String getInfiziert() {
		return infiziert;
	}


	public void setInfiziert(String infizert) {
		this.infiziert = infizert;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
}
