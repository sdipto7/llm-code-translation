
from datetime import datetime

def main():
    s = input().split()
    t1 = s[0].split(":")
    t2 = s[1].split(":")
    x = datetime.strptime(s[0], "%H:%M")
    y = datetime.strptime(s[1], "%H:%M")
    diff = x - y
    hours, remainder = divmod(diff.seconds, 3600)
    minutes, _ = divmod(remainder, 60)
    print(f"{hours:02d}:{minutes:02d}")

if __name__ == "__main__":
    main()

