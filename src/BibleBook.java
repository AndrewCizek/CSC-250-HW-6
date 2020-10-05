public class BibleBook
{
	private String bName;
	private int chapters;
	private String summary;
	
	public BibleBook(String commaDelimited)
	{
		String[] parts = commaDelimited.split(",");
		this.bName = parts[0];
		this.chapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
	}
		public void display()
	{
		System.out.printf("Name: %s \nChapters: %d \nSummary: %s \n", this.bName, this.chapters, this.summary);
	}
		
	public String getbName()
	{
		return this.bName;
	}
}
	
	/*public void original()
	{
		System.out.println("Book: " + this.bName + "\nChapter count: " + this.chapters + "\nSummary: " + this.summary);
	}
}*/