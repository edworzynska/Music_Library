# Music Library Project

## Description:
This is one of my first projects in Java, aimed at helping me understand and apply the concept of objects and classes. The project is a simple music library system where you can add, remove, and play random songs from a collection.

## Features:
+ Add Songs: 
You can add new songs with a title and artist to the library.
+ Remove Songs: 
You can remove songs from the library.
+ Play Random Song: 
The system can play a randomly selected song from the library.
+ Display Songs: 
You can display all the songs currently available in the library.

## Concepts Used:
+ Object-Oriented Programming (OOP): The project uses Java classes to represent Song and MusicLibrary.
+ ArrayList: Songs are stored in an ArrayList, which allows dynamic addition and removal of songs.
+ Random: The program uses the Random class to select a song at random for playback.
+ Encapsulation: Each Song object has private fields with public getter and setter methods.

## How It Works:
1. A MusicLibrary object is created, which contains an ArrayList of Song objects.
2. You can add songs to the library using the addSong() method, providing the song name and artist.
3. You can remove songs with removeSong().
4. The program can display all the songs in the library with a simple loop.
5. You can play a random song from the library using the playRandomSong() method, which prints the song title and artist.
