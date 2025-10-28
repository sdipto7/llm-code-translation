import math

A, B, H, M = map(int, input().split())
angle_min = M * 6.0
angle_hour = H * 30 + M * 0.5
angle_diff = abs(angle_min - angle_hour)
angle_rad = math.radians(angle_diff)
distance = math.sqrt(A**2 + B**2 - 2*A*B*math.cos(angle_rad))
print(distance)
