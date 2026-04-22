
# Medieval_War

After watching *Game of Thrones*, I got really interested in Medieval War. I had to study OOP in Java and why not creating a system which the goal is to handle a medieval army?

But first, let's get into medieval war so you can understand how the system works.

## Medieval War: how it actually happened (generally speaking)

Medieval war used to be structured in different layers, and each one had many distinct functions.

- Infantry was THE THING in medieval war. Soldiers standing up with weak weapons were used to hold position and absorb the initial impact.

- Knights were the ELITE of the war. They were trained since childhood, with expensive gear such as plate armor and war horses. Horses were very dangerous (the weight explains it all), but they were very expensive and vulnerable to difficult terrain and pikemen (soldiers armed with a long spear, aka pike). 

- Archers were usually located at the rearguard or in elevated positions. English longbowmen, for example, were very agile — they could fire up to 12 arrows per minute with a range of 300 meters — and they really killed it (no pun intended) in the famous Battle of Agincourt in 1415. Although the English army had fewer men (around 8000 against 12000 French soldiers, mostly knights), they destroyed the French forces.

- Siege artillery (catapults, trebuchets, ballistas) was not used in open battles, but to break things like walls, because sieges were a big part of warfare back then.

## But wait, how did a battle actually happen? So, picture this:

- Round 1: Archers and crossbows tried to disorganize the enemy formation before contact.
- Round 2: After the “shock” happened, we are watching infantry meet infantry. Poor soldiers... we are talking about total CHAOS. The horses also clash. Loud noises, chaos everywhere, most of it was decided in minutes. They attacked in lines and once it was over... well... it was over.

Thinking about running away because you are definitely dying? Well, that’s not happening, pal. A knight will definitely come after you.

- Round 3: Oh, let’s talk about big stuff doing big damage. An onager (torsion catapult) is cool. Its reload time is historically estimated, taking from 30 to 60 seconds (against the 2–5 minutes of the trebuchet) to be reloaded. Goodbye castle, goodbye formations and structures.

Having this in mind will help us understand what we need to do.

## And finally...the system.

### Goal
Imagine a king has hired you as their commander. Your job is to create an efficient army with different types of units, simulate possible battles against enemies generated randomly, and report the result.

---

## Classes:

**Unit** – abstract class. Attributes: name (String), health (int), attackPower (int). Abstract method: `battleCry()`, where each type will scream something different when entering the combat field.

**Knight, Archer, Catapult** – subclasses of Unit, each with their own extra attribute:

* Knight → armorRating (int) — reduces received damage
* Archer → range (String: "short" / "long") — defines if it can attack before contact
* Catapult → reloadTime (int) — attacks every N turns

**Army** – handles an ArrayList<Unit>. Represents your army and your enemy.

**BattleSimulator** – class that executes the battle between two armies. Contains the method:
`simulate(Army attacker, Army defender)`

---

## Menu

This is the menu, and you will be able to:

* Recruit unit (Knight, Archer or Catapult)
* View current army (list all units with stats and battleCry())
* Simulate battle — generates a random enemy army and resolves turn by turn
* View battle history (wins / losses)
* Exit

---

## Rules

* Each turn, a random attacking unit attacks a random defending unit
* Damage = attackPower of attacker minus armorRating of defender (if Knight); minimum 1
* Units with health <= 0 are removed from the ArrayList
* Battle ends when one side has no units left
* Catapult only attacks when `turn % reloadTime == 0`
* Archer with range = "long" attacks first on turn 1 (before contact)

---

## Technical requirements (OOP review)

* **Encapsulation**: attributes private, getters required
* **Inheritance**: Knight, Archer, Catapult extend Unit and call `super()` in constructor
* **Polymorphism**: iterate over ArrayList<Unit> and call `battleCry()` without checking type
* **Overloading**: method `recruit` in Army with two signatures — one receives a Unit, another receives List<Unit>
* **@Override**: battleCry() implemented in each subclass

---

## Enemy army

The generation of the enemy army is still in development hehe. I am thinking whether the BattleSimulator will be a separate class or a method inside the Army class.

---
