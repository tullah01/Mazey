# Mazey

## Personnel
Tamzid Ullah && Tiarun Liu

# Statement of Problem
Returns the Boolean value of the statement “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”

Navigate a maze form start to finish

legal means
  don’t cross the walls
  right-angle turns only 
  a path cannot go through the same point twice

# Recursive Abstraction

The recursive abstraction can go to the next intersection poin tin the maze
  If there is no legal next point,
  go back and try next available patch from that intersection
