
# Music App Simulator (Java OOP)
A Java based console music application that demonstrates advanced object oriented programming concepts using interfaces, default methods, and multiple inheritance.

## Overview
This project simulates a basic music app with features like:
- Play and pause songs
- Download songs
- Add songs to playlists
- Track download status

It is built using Java interfaces to model real-world app behavior in a simplified way.

## OOP Concepts Used

### Interfaces
Two interfaces are used:
```java
PlayPause
Download
```

These define the core behavior of the music app.

### Multiple Inheritance (via Interfaces)
The `Features` class implements both interfaces:

```java
class Features implements PlayPause, Download
```

This allows it to inherit behavior from multiple sources.

### Default Methods in Interface
The `Download` interface contains a default method:

```java
default void downloadStatus()
```

This provides a built-in implementation that can be used or overridden.

### Method Overriding
The `Features` class overrides:
- `play()`
- `pause()`
- `download()`
- `downloadStatus()`

Example:
```java
public void downloadStatus(){
    Download.super.downloadStatus();
    System.out.println("Download complete :D");
}
```

### Polymorphism
Interface reference is used:

```java
PlayPause p = new Features("Farda","jhoom");
```

This demonstrates runtime polymorphism.

## Features of the App

- ▶️ Play a song
- ⏸️ Pause a song
- ⬇️ Download a song
- 📂 Add song to playlist
- 📊 Show download status

## How to Run
1. Compile the program
2. Run the program

## Author
Maham Zehra