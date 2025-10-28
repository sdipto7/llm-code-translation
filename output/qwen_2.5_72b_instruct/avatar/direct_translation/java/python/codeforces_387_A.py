import sys
from datetime import datetime, timedelta

sc = sys.stdin.read().split()
s = sc[0].split(':')
t = sc[1].split(':')
x = datetime.strptime(s[0] + ':' + s[1], '%H:%M').time()
y = datetime.strptime(t[0] + ':' + t[1], '%H:%M').time()
result = datetime.combine(datetime.min, x) - timedelta(hours=y.hour, minutes=y.minute)
print(result.strftime('%H:%M'))
