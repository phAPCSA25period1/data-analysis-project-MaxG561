[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22615726)
# AP CSA Mini‑Project: Data Analysis with Arrays & File Input
### Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality

---

## 📌 Project Overview
In this mini‑project, you will choose a dataset (CSV file), design a **custom class** to represent each row, read the dataset using the **Scanner** class, store all data as **objects** in an ArrayList or array, and answer a **guiding question** by analyzing the data.

This project reinforces:

- Arrays & ArrayLists  
- File input with `Scanner`  
- Class design (attributes, constructors, methods)  
- Algorithms (min, max, average, filtering)  
- Data quality & ethics  
- Documentation using **Javadoc**  
- Creating a **UML class diagram**  

By the end, you will produce insights and answer your original question using your program.

---

## 🎯 Your Task
You will:

1. **Choose a dataset** (teacher provided or public).  
2. **Write a guiding question** for your dataset.  
3. **Design a Java class** with ≥ 3 attributes.  
4. **Use `Scanner` to read a CSV file**, parse rows, and construct objects.  
5. **Store all objects** in an array or ArrayList.  
6. **Analyze the dataset** using algorithms you create.  
7. **Print insights** and answer your guiding question.  
8. **Document your code** with Javadoc.  
9. **Create a UML class diagram** representing your custom class.  

Optional stretch challenges are included at the bottom!

---

## 🧪 Example Questions You Might Ask
Your dataset might allow you to answer things like:

- *"Which Pokémon type has the highest average Attack?"*  
- *"Which U.S. state had the lowest obesity rate in 2020?"*  
- *"What country had the highest CO₂ emissions in 2000?"*  
- *"What is the average HP for Fire-type Pokémon?"*  

Think simple, clear, and answerable.

---

## 📁 Project Structure
Your repository should follow this structure:
```
/src
    Main.java
    YourClass.java
/data
    your_dataset.csv
README.md   ← this file
UML_Diagram.png (or UML_Diagram.pdf)
```

---

## 🧩 Step 1 — Choose Your Dataset

**Dataset Name:**  
**Source / Link:**  

**What this dataset contains (2–3 sentences):**  

our data set  contains the data of state census which includes death rates from different sources, population, and more.

---

## ❓ Step 2 — Write Your Guiding Question

Your guiding question should be something you can answer using your dataset.

**My guiding question:**  
our guiding question  is if over dose death rates are related to gun violence death rates(drug addiction related to gun violence)  

Examples:

- "Which Pokémon has the highest HP?"  
- "What is the average life expectancy in this dataset?"  
- "Which state had the highest vaccination rate?"  

---

## 🧱 Step 3 — Design Your Class

You must create a class that represents **one row** of your dataset.

### ✔ Your class must include:

- **At least 3 private attributes**  
- **A constructor** that takes all attributes as parameters  
- **Getter methods** for attributes you plan to analyze  
- **`toString()`** for easy printing  
- Any additional analysis/helper methods as needed  



In `Main.java`, you must:

- Create a `File` object  
- Use `Scanner` to read the file  
- Skip the header row (if needed)  
- Read each line  
- Split by commas using `.split(",")`  
- Trim whitespace  
- Parse numbers using `Integer.parseInt()` or `Double.parseDouble()`  
- Construct objects  
- Add them to an ArrayList or array  


| Column Index | Attribute             | Description                        |
|--------------|--------------------|------------------------------------|
| 0            | stateName          | State/territory name               |
| 1            | population         | State population                   |
| 3            | firearmDeathsPer100k | Firearm deaths per 100k population |
| 5            | drugOverdoseDeathsPer100k | Drug overdose deaths per 100k population |

---

## 📊 Step 5 — Analyze Your Data

You must write **at least two algorithms** to analyze your dataset.

### Required: Choose 2 or more algorithms
- [ ] Minimum value of attribute  
- [ ] Maximum value of attribute  
- [ ] Average of attribute  
- [ ] Filter by category  
- [ ] Count items matching a condition  

**Algorithms I will implement:**

1. average of attrivute  
2. counting items mathcing a condition  

Optional extras:  
- Sorting  
- Top/bottom N items  
- Grouping by category  
- Comparison between groups  

---

## 🧠 Step 6 — Insights & Answer to Your Question

After analyzing your objects, print:

- ✔ How many rows were loaded  
- ✔ Your algorithm results  
- ✔ A clear answer to your guiding question  

**My findings:**  
  52 rows were printed, the highest ratio of gun deaths to OD was 1.64 in Mississippi the lowest was 0.1 in Massachusetts and the average was around 0.75.

**My answer to the guiding question:**  
15 of the states were 0.25 within having a 1 to 1 ratio of gun to OD death rates meaning about 25% of states it might have relation in but the overarching and more obvious and clear answer is no  

---

## 📝 Step 7 — Documentation Requirements

### ✔ Javadoc Comments
You MUST use Javadoc for:

- Every **class**  
- Every **method**  
- Every **parameter**  
- Every **return value**  

Example:
```java
/**
 * Returns the highest HP among all Pokémon.
 * @param list the ArrayList of Pokémon objects
 * @return highest HP value in the dataset
 */
public static int findMaxHP(ArrayList<Pokemon> list) {
    // implementation
}
```

### ✔ UML Class Diagram
**State Class UML Diagram (text-based):**

```
+-----------------------+
|         State         |
+-----------------------+
| - stateName: String   |
| - population: int     |
| - firearmDeathsPer100k: double |
| - drugOverdoseDeathsPer100k: double |
| - ratio: double       |
| - message: String     |
+-----------------------+
| + State(String, String, String, String, double, String)
| + getStateName(): String
| + getPopulation(): int
| + getFirearmDeathsPer100k(): double
| + getDrugOverdoseDeathsPer100k(): double
| + getRatio(): double
| + getMessage(): String
| + findRatioFirearmToDrugDeaths(): double
| + findHighestRatio(State[]): State
| + findLowestRatio(State[]): State
| + findAverageRatio(State[]): double
| + findCloseToOneCount(State[]): int
| + toString(): String
+-----------------------+
```

Save as `UML_Diagram.png` or `.pdf` in the repo ( i did not make a graphical one so no image)

---

## 🛡 Step 8 — Data Ethics & Quality Reflection
Write a short reflection (3–5 sentences):

- What data-quality issues did you find?
- Could your dataset be biased?
- How might incomplete or inaccurate data affect results?
- How trustworthy are your insights?

**My reflection:**  
my insights can be biased due to the fact that i decided how close to being 1 to 1 it is and that 25% is not enough to say its related, the data problems i have is the data is old so the data might be inaccurate or incomplete, also there is one territory that is not assesed, meaning average might be off. my insights are trustworthy to a degree but up to interpration

---

## ⭐ Optional Challenges (Not Required but Fun!)

### 🔹 User Input
Allow the user to choose:

- Which attribute to analyze
- Which category to filter
- What statistics they want to calculate

### 🔹 Additional Algorithms

- Sorting objects
- Multiple comparisons
- Generating summaries
- Exporting results to a file

### 🔹 Data Cleaning

- Skip rows with missing values
- Detect invalid entries
- Normalize units

---

## ✅ Submission Checklist

- [ ] Dataset selected
- [ ] Guiding question written
- [ ] Class created with ≥3 attributes
- [ ] File reading implemented
- [ ] ArrayList/array of objects created
- [ ] At least 2 analysis algorithms implemented
- [ ] Findings printed
- [ ] Javadoc comments added
- [ ] UML diagram included
- [ ] Reflection completed
- [ ] Code compiles & runs

---

Good luck, and have fun exploring your dataset! 🚀  
You're now doing real data analysis — just like professional software engineers.
