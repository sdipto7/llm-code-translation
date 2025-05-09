WORKDIR=`pwd`
export PYTHONPATH=$WORKDIR;
export PYTHONIOENCODING=utf-8;

function prompt() {
    echo;
    echo "Syntax: bash scripts/test.sh DATASET SRC_LANG TRG_LANG OUTPUT_DIR ATTEMPT";
    echo "DATASET: name of the dataset to use";
    echo "SRC_LANG: source language";
    echo "TRG_LANG: target language";
    echo "OUTPUT_DIR: path to the output directory";
    echo "ATTEMPT: attempt number";
    exit;
}

while getopts ":h" option; do
    case $option in
        h) # display help
          prompt;
    esac
done

if [[ $# < 4 ]]; then
  prompt;
fi

DATASET=$1;
SRC_LANG=$2;
TRG_LANG=$3;
OUTPUT_DIR=$4;
ATTEMPT=$5;

if [[ $DATASET == "avatar" ]]; then
    python3 src/test/test_avatar.py --source_lang $SRC_LANG --target_lang $TRG_LANG --report_dir $OUTPUT_DIR;
elif [[ $DATASET == "codenet" ]]; then
    python3 src/test/test_codenet.py --source_lang $SRC_LANG --target_lang $TRG_LANG --report_dir $OUTPUT_DIR;
elif [[ $DATASET == "evalplus" ]]; then
    python3 src/test/test_evalplus.py --source_lang $SRC_LANG --target_lang $TRG_LANG --report_dir $OUTPUT_DIR --attempt $ATTEMPT;
else
    echo "Dataset not supported";
fi