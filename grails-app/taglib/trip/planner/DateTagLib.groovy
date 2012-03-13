package trip.planner

class DateTagLib {
	def thisyear = { 
		out << Calendar.getInstance().get(Calendar.YEAR)
		}

	def copyright = { attrs, body ->
		out << "<div id='copyright'>"
		out << "&copy; ${attrs['startYear']} - ${thisyear()}, ${body()}"
		out << "All Rights Reserved."
		out << "</div>"
	}	
}
