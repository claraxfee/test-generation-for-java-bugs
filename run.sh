class=BankAccount
project_cp=.
D4J_SEED=42
budget=600
DIR_OUTPUT=out/

java -cp evosuite-383.jar shaded.org.evosuite.EvoSuite  \
    -class $class \
    -projectCP $project_cp \
    -seed $D4J_SEED \
    -Dsearch_budget=$budget \
    -Dtest_dir=$DIR_OUTPUT \
    -criterion branch \
    -Dshow_progress=false \
    -Djunit_check=false \
    -Dfilter_assertions=false \
    -Dtest_comments=false \
    -mem 1500
