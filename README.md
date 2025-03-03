## About
An Exercise Repository that Manages and keeps track on all of my coding exercises.
Facilitates organization and supports fixed workflow when active learning working on coding exercises.

## Repository Structure
- Topic → Subtopic → Exercise
- index.md - Tracks Exercises in the repository
- Exercise Folder Contains:
    - code folder
    - resources folder
    - exercise.md
    - tracking.md
- _tools - contains templates shortening workflow
- _optional_future_exercises - exercises that hasn't indexed and are a maybe for the future

## Workflow
- Choosing an Exercise:
    - Open index.md to see the list of exercises.
    - Continue working on exercises under **In Progress** or Pick a new exercise under **New**
    - If no exercise exists under these sections either pick one from the **optional future exercises** folder, or pick past logged exercise from index and do it again.
- Adding a New Exercise:
    - Create an exercise folder in the appropriate place (See hierarchy above)
    *Under _tools there is a template folder that can be used.
    - Update Exercise `exercise.md` file
    - Update Repository's `index.md` file (under **New** or **In Progress**)
    - Work on the exercise. make sure it is saved to the **code** folder.
- Finishing an Exercise:
    - Update Relevant `tracking.md` & `exercise.md` files
    - Update `index.md` file - transfer the file to it's relevant section and update new tracking information.
    - Commit changes to git repository

- Other things:
    - Saving optional new exercises in **_optional_future_exercises**
        - Should be done in a separate commit not tied to individual exercise updates

- Rules:
    - Naming Convention for Topis & Subtopics: Title Case with underlines
    - Naming Convention for exercise folders: small letter separated by hyphens
    - Exercises should adhere to repository's structure described above
    - New Exercises needs to be described inside exercise.md, but if it's a jb exercise in hebrew - can be saved as docx document