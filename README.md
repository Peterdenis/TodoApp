# Pre-work - *Android Todo App*

**TodoApp** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Saincurin Peterson Denis**

Time spent: **36** hours spent in total

## User Stories

The following **required** functionality is completed:

* [v] User can **successfully add and remove items** from the todo list
* [v] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [v] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/efo4C0P.gif' />


## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** [So far the platform seems to me well adapted and sufficiently rewarding.We find almost everything that could be useful for programming.In the old version of android layout and were much more abstract, now with the constraintLayout positions views are a real pleasure
.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** [First of all, the Adaptors, which are the objects that manage the data, but not their display or behavior when interacting with the user. An adapter can be thought of as an intermediary between the data and the view that represents that data. In this context we give the adapter a list of elements to treat and the way they should be. 

The adapter is important because instead of managing thousands of information for example one by one it gives the ability to group them together. The adapter uses convertView to recycle old View objects that are no longer used. In this way, ListView can send to the adapter old 'recycled' view objects that are no longer displayed instead of instantiating an entirely new object each time the adapter wants to display a new list item. This is the purpose of the convertView parameter].

## Notes

Describe any challenges encountered while building the app.
The problem I had in programming this app is. when I wanted to modify the data to display it in the listview. The problem is that I could not have the value of the selected item by thinking about it, I ended up getting there

## License

    Copyright [2018] [Peterson Denis Saincurin]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
