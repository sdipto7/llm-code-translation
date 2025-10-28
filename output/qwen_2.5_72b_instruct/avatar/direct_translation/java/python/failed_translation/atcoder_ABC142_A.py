import sys

try:
    input = float(sys.stdin.readline().strip())
    count_odd = round(input / 2)
    result = count_odd / input
    print(f"{result:.10f}")
except (IOError, ValueError) as e:
    print(e)
    sys.exit(0)
except Exception as e:
    print(e)
    sys.exit(0)
