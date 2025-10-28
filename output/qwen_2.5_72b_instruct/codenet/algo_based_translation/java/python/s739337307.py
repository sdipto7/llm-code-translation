
import sys

def main():
    import sys
    import re

    input_data = sys.stdin.read().strip()
    lines = input_data.split('\n')
    
    n, m = map(int, lines[0].split())
    
    map_data = {}
    countAc = 0
    countWaAll = 0
    
    for i in range(m):
        question, waOrAc = lines[i + 1].split()
        question = int(question)
        
        if question not in map_data:
            if waOrAc == "WA":
                map_data[question] = 1
            else:
                map_data[question] = -1
                countAc += 1
        else:
            countWa = map_data[question]
            if countWa < 0:
                pass
            else:
                if waOrAc == "WA":
                    map_data[question] = countWa + 1
                else:
                    map_data[question] = -countWa
                    countAc += 1
                    countWaAll += countWa
    
    print(countAc, countWaAll)

if __name__ == "__main__":
    main()

