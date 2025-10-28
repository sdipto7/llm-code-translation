
from datetime import datetime, timedelta

s = input().split(":")
t = input().split(":")
x = datetime.strptime(f"{s[0]}:{s[1]}", "%H:%M")
y = datetime.strptime(f"{t[0]}:{t[1]}", "%H:%M")
result = x - timedelta(hours=y.hour, minutes=y.minute)
print(result.strftime("%H:%M"))

