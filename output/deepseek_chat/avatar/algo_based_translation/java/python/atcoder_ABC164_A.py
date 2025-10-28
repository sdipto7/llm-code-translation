import sys

class atcoder_ABC164_A:
    @staticmethod
    def main(args):
        try:
            scList = []
            while True:
                try:
                    line = input()
                    scList.append(line)
                except EOFError:
                    break
            
            numlist = scList[0].split()
            Sheep = int(numlist[0])
            Wolve = int(numlist[1])
            
            if Wolve >= Sheep:
                print("unsafe")
            else:
                print("safe")
                
        except Exception as e:
            pass

if __name__ == "__main__":
    atcoder_ABC164_A.main(sys.argv)
