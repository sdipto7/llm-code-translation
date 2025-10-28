The provided Python code is a direct translation of the original Java code. Here's a breakdown of the key aspects:

1. **Input Handling**: The code reads input using `sys.stdin` to read the number of maps, the dimensions of each map, the map data, and the actions for each map.

2. **Map Parsing**: For each map, the code reads the grid and identifies the initial position of the tank based on the characters `^`, `v`, `<`, `>`.

3. **Action Processing**: For each action (U, D, L, R, S), the code updates the tank's position and orientation. The tank moves if the next cell is a `.`, and for the 'S' action, it fires a shot in the direction the tank is facing, destroying `*` (bricks) but not `#` (steel).

4. **Output**: After processing all actions for a map, the updated map is printed. A blank line is printed between maps except after the last one.

The code maintains the logic of the original Java code, ensuring that the tank's movement, direction, and shooting behavior are accurately translated.
