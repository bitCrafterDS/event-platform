# Learning Log

## Oct 2026: Java basics aur Git

### Constructor
- Constructor ka naam class ke naam jaisa hi hota hai (spelling aur capital letters dono), aur uske aage koi return type nahi likhte.
- Naam match nahi karta toh Java use method maan leta hai: `invalid method declaration; return type required`.
- Galti kahan hui: constructor class ke `{ }` ke bahar chala gaya tha.

### Braces aur indentation
- Fields, constructor aur getters teeno ek hi class ke `{ }` ke andar aate hain, aur class ka `}` sabse aakhir mein.
- Indentation se dikhta hai ki kaun kiske andar hai, aur galti jaldi pakad mein aati hai. Mac pe `Shift + Option + F` se file format hoti hai.

### String
- Double quotes ke andar likha text. `int` number hai jisse math hota hai, `String` text hai.
- Phone number `String` rakha kyunki uspe jod-ghata nahi hota aur wo `0` se shuru ho sakta hai.

### private aur encapsulation
- `private` field ko class ke bahar se seedha chhune se rokta hai. Bahar wale getter se hi maang sakte hain (`s1.getName()`).
- Experiment mein dikha: `private` hataya toh bhi program chala, kyunki `Main` getters use kar raha tha. `private` ka kaam program chalana nahi, galat data se bachana hai.
- Iska fayda: baad mein setter mein check laga sakte hain (jaise seat limit negative na ho).

### Error padhna
- Error message ka format: kaunsi file, kaunsi line, `required` (kya chahiye) aur `found` (kya diya).
- Java ginti aur type check karta hai, matlab nahi. Do `String` aage-peeche ho jayein toh bhi program chalega.
- Hamesha pehla error fix karo. Baaki aksar usi ke asar hote hain (jaise `Could not find or load main class`).

### Code Runner ka temp file
- Editor mein kuch select hai toh Code Runner `tempCodeRunnerFile.java` banata hai.
- `public class Main` ki file ka naam `Main.java` hi hona chahiye, isliye error aaya.

### javac vs java
- javac: java ka compiler
- java: language ko compile krne ka zariya
- Code badalne ke baad kya karna padta hai aur kyun: save wrna purana wala chalega.

### Git: add vs commit
- stages changes by moving files from the working directory 
- creates a permanent snapshot of the staging area

### Aaj ki sabse badi galti aur seekh
- ...