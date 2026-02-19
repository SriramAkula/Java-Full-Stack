package com.java.m1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;


public class TuneTrack {
	public static void main(String[] args) {
		
	}
}

class Track{
	
	private String trackId;
	private String artist;
	private String title;
	private String genre;
	private double earnings;
	private int releaseYear;
	private double rating;
	private List<String> tags;
	
	Track(){
		
	}
	
	Track(String trackId,String artist, String title,String genre, double earnings,int releaseYear,double rating){
		this.trackId=trackId;
		this.artist=artist;
		this.title=title;
		this.genre=genre;
		this.earnings=earnings;
		this.releaseYear=releaseYear;
		this.rating=rating;
	}
	
	public String getGenre() {
	    return genre;
	}

	public void setGenre(String genre) {
	    this.genre = genre;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getEarnings() {
		return earnings;
	}
	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public List getTags() {
		return tags;
	}
	public void setTags(List tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Track [trackId=" + trackId + ", artist=" + artist + ", title=" + title + ", earnings=" + earnings
				+ ", releaseYear=" + releaseYear + ", rating=" + rating + ", tags=" + tags + "]";
	}
	
	
}



class TrackUtil{
	
	public static Track parseTrack(String input) throws InvalidTrackException{
		String[] arr=input.split(":");
		
		if(arr.length<7) {
			throw new InvalidTrackException("Input '"+input+"' is not in the required format.");
		}
		
		Track track = new Track(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4]),Integer.parseInt(arr[5]),Double.parseDouble(arr[6]));
		
		if(arr.length==7) {
			return track;
		}
		
		String[] tags = arr[7].split(",");
		
		List<String> tagsList=new ArrayList<>(Arrays.asList(tags));
		track.setTags(tagsList);
		return track;
	}
	
	@SuppressWarnings("rawtypes")
	public static Predicate isReleasedBefore(int year) {
		return a -> (int)a > year;
	}
	
//	public static Function genereAdjustment() {
//		
//	}
	
}


class InvalidTrackException extends Exception{
	InvalidTrackException(String msg){
		super(msg);
	}
}


class TrackManager{
	private List<Track> trackList;
	
	public void addTrack(Track track) {
		trackList.add(track);
	}
	
	public void addAllFromStrings(List<String> lines) {
		for(String line:lines) {
			try {
				trackList.add(TrackUtil.parseTrack(line));
			}catch(InvalidTrackException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void resolveDuplicatesById() {
		
	}
}
























