WORKDIR=`pwd`
export PYTHONPATH=$WORKDIR;
export PYTHONIOENCODING=utf-8;

function prompt() {
    echo;
    echo "Syntax: bash scripts/translate.sh DATASET SRC_LANG TRG_LANG";
    echo "DATASET: name of the dataset to use";
    echo "SRC_LANG: source language";
    echo "TRG_LANG: target language";
    exit;
}

while getopts ":h" option; do
    case $option in
        h) # display help
          prompt;
    esac
done

if [[ $# < 3 ]]; then
  prompt;
fi

DATASET=$1;
SRC_LANG=$2;
TRG_LANG=$3;

python3 src/translation/openai_translation.py --dataset $DATASET --source_lang $SRC_LANG --target_lang $TRG_LANG;