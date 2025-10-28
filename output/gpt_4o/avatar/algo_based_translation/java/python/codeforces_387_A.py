
from datetime import datetime, timedelta

def main():
    # Reading the input times
    s = input().strip().split(":")
    t = input().strip().split(":")
    
    # Creating time objects
    x = datetime.strptime(f"{s[0]}:{s[1]}", "%H:%M")
    y = datetime.strptime(f"{t[0]}:{t[1]}", "%H:%M")
    
    # Subtracting the time
    delta = timedelta(hours=y.hour, minutes=y.minute)
    result_time = x - delta
    
    # Formatting and printing the result
    print(result_time.strftime("%H:%M"))

if __name__ == "__main__":
    main()

