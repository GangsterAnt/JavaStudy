package example;

public class MyDate {

	private int year = 0;
	private int month = 0;
	private int day = 0;
	
	boolean valid_year = true;
	boolean valid_month = true;
	boolean valid_day = false;
	
	public MyDate(int year, int month, int day)
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public boolean isValid()
	{
		return ( valid_year && valid_month && valid_day );
	}
	
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if( year > 0 )
			this.year = year;
		else
			valid_year = false;
	}

	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if( 0< month && month < 13)
			this.month = month;
		else
			valid_month = false;
	}
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		boolean yune_year = false;
		
		if( this.year % 100 != 0 && this.year % 4 == 0)	//윤년
			yune_year = true;
		
		if( month == 2)
		{
			if( yune_year)
			{
				//29 일까지만 true
				if(  0 <day && day < 30)
					valid_day = true;
			}
			else
			{
				//28일까지만.
				if(  0 <day && day < 29)
					valid_day = true;
			}
		}
		else if( month <=7 )
		{
			if( month %2 == 1)
			{
				//31
				if(  0 <day && day < 32)
					valid_day = true;
			}
			else
			{
				//30
				if(  0 <day && day < 31)
					valid_day = true;
			}
		}
		else
		{
			if(month %2 == 1)
			{
				//30
				if(  0 <day && day < 31)
					valid_day = true;
			}
			else
			{
				//31
				if(  0 <day && day < 32)
					valid_day = true;
			}
		}
		
	}
	
	
}
