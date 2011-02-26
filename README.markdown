# CSCI 4448 : Assignment #4 #

## Ben Limmer & Zachary Clark ##

#### State of the system: ####

We added 3 (sort of) movement behaviors:

1. SpiralMove (not used), which basically follows the same motion as the RedSprite.

2. RandMove, which moves the sprite very quickly in a random direction for a random distance, which it keeps changing.

3. KenMove, which is a slower variant of RandMove.

We also added a new sprite: KenSprite, which, instead of pointing in the direction of motion, continually spins in circles while moving.

#### Functionality Provided ####

We created a MoveBehavior abstract class with an assortment of moves as subclasses that could be hot-swapped on sprites to change their movement. We recreated north-south and east-west, as well as the behavior used by highlighted sprites: ControllableMove.

We also changed the way highlighting a sprite was done, so that a sprite knows when it is highlighted. When a user presses tab, the selected sprite is told that it is now highlighted, all other sprites are told they are not highlighted, and the selected sprite's movement will be changed to a ControllableMove.

When keys are pressed, the commands are sent to the currently highlighted sprite.

When a sprite is not longer highlighted, its original movement behavior is restored, including the direction it was traveling when the user gained control.