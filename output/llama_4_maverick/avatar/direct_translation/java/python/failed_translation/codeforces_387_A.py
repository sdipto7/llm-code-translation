
from datetime import datetime

def main():
    s = input().split(":")
    t = input().split(":")
    x = datetime.strptime(":".join(s), "%H:%M")
    y = datetime.strptime(":".join(t), "%H:%M")
    diff = x - y
    hours, remainder = divmod(diff.seconds, 3600)
    minutes, _ = divmod(remainder, 60)
    result = (datetime.min + diff).strftime("%H:%M")
    print(result)

if __name__ == "__main__":
    main()

