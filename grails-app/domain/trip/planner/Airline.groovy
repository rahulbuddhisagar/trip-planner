package trip.planner

class Airline {
	String name
	String url
	String frequentFlyer
	String notes
	
	static hasMany = [trip:Trip]
	
	String toString(){
		return name	
	}
	
    static constraints = {
		name(blank:false,maxSize:100)
		url(url:true)
		frequentFlyer(blank:true)
		notes(maxSize:2000)
    }
}
