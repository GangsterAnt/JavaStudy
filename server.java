package ClientServer;
import genDevs.modeling.*;
import GenCol.*;
import simView.*;

public class server extends ViewableAtomic
{
  
	protected Job job;

	public server()
	{
		this("server");
	}

	public server(String name)
	{
		super(name);
    
		addInport("in");
		addOutport("out");
	}
  
	public void initialize()
	{
		job = new Job("");
		
		holdIn("passive", INFINITY);
	}

	public void deltext(double e, message x)
	{
		Continue(e);
		if (phaseIs("passive"))
		{
			for (int i = 0; i < x.getLength(); i++)
			{
				if (messageOnPort(x, "in", i))
				{
					//casting
					job = (Job)x.getValOnPort("in", i);
					
					job.a = job.a + job.b;
					
					holdIn("busy", 0);
				}
			}
		}
	}
  
	public void deltint()
	{
		if (phaseIs("busy"))
		{
			job = new Job("");
			
			holdIn("passive", INFINITY);
		}
	}

	public message out()
	{
		message m = new message();
		if (phaseIs("busy"))
		{
			m.add(makeContent("out", job));
		}
		return m;
	}

	public String getTooltipText()
	{
		return
		super.getTooltipText()
		+ "\n" + "job: " + job.getName();
	}

}

