
import sys
from datetime import datetime, timedelta

def main():
    data = sys.stdin.read().split()
    s_parts = data[0].split(':')
    t_parts = data[1].split(':')
    
    x_hours = int(s_parts[0])
    x_minutes = int(s_parts[1])
    
    y_hours = int(t_parts[0])
    y_minutes = int(t_parts[1])
    
    x_time = datetime(2000, 1, 1, x_hours, x_minutes)
    result_time = x_time - timedelta(hours=y_hours, minutes=y_minutes)
    
    print(result_time.strftime('%H:%M'))

if __name__ == "__main__":
    main()

