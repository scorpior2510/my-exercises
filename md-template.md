## What Are .md files?
simple Text files written in a simple mark down (md = mark down) language used to style text
this format is convenient to work with in github and to look at as html files in the web browser
these files are commonly used as readme files to explain and shortly document coding projects

## Syntax Elements:

# Main Heading
## Subheading
### Sub-subheading

## Ordinary Writing:
ordinary writing...

## Unordered List:
List:
- (item 1) Last Completed (with date as date): _2025-02-28_
- (item 1) Last Completed (with date as simple text): 2025-02-28
- (item 2) Difficulty: Beginner
- (item 3) Status: Needs Review

## Ordered List:
List:
1. First
2. Second
3. Third

## Multiple level list:
List:
- (item 1) item1
  - inside1
    - inside inside
  - inside2
- (item 2) item2

## Links:
Links:
[Link Text - ordinary](https://www.google.com)
[Link Text - Relative to something in the repository](Java/Streams/Filter_Map/tracking.md)

## Emphasizing Text:
**bold text**
*italic text*
ordinary text
Marking special: `@Configuration`

## Line Break:
---

## Useful Sequence:
## Second Level
- **Last Completed:** [YYYY-MM-DD or "Not Yet"]
- **Status:** [Not Started | In Progress | Needs Review | Completed]

## Table Format:
Table:
| Topic | Subtopic | Exercise | Last Completed | Status |
|--------|-----------|------------|----------------|--------|
| Java | Streams | Filter and map operations | Not Yet | Needs Review |
| Spring Boot | Config | Custom Bean with `@Configuration` | Not Yet | Not Started |
| Networking | TCP | Explain 3-way handshake | 2025-02-10 | Completed |
| Concurrency | Design Patterns | Thread-safe Singleton | 2025-02-12 | Completed |
---