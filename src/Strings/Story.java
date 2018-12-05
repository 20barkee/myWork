package Strings;

public class Story {
private String story;

public Story(String xStory) {
	story="Hello World";
	story=xStory;
}
public String getStory() {
	return story;
}
public int wordCount() {
	int numWords=1;
	for(int i=0; i<story.length(); i++)
	{
	if(story.charAt(i)==' ')	{
	numWords++;	
	}
	}
	return numWords;
}
public String firstWord() {
	return story.substring(0, story.indexOf(" "));
}
	
}
