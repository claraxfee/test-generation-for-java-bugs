# test-generation-for-java-bugs
<a href="https://www.overleaf.com/2191371249vgcfbvwmsjjm#43a6b4">overleaf link</a>

<a href="https://docs.google.com/document/d/1uU3Bp8pwQZExNjGHyE2-xOD5MTNClOOtMoObcaRfoT4/edit?usp=sharing">google doc for report writing</a>

IMPORTANT - To clone the repo with evosuite inluded run "git clone --recurse-submodules <repo-url>"

Useful Elements of Evosuite:
/evosuite/client/src/main/java/org/evosuite/seeding/ConstantPool.java 

/evosuite/client/src/main/java/org/evosuite/seeding/StaticConstantPool.java

/evosuite-copy/client/src/main/java/org/evosuite/testcase/TestFactory.java

Trace of primative creation: TestFactory.java -> satisfyParameters() -> createVariable() -> attemptGeneration() -> createPrimative() -> primativeStatment.getRandomStatement();

LLM Generation Stage:
Our goal: Given a prompt and certain sections of buggy code, the LLM generates a pool of primatives which are more likely to trigger the given bug. 
Example: Give LLM class constructors, buggy method, class variables. Vary the language of the prompt. Decide which inputs are the most effective. 
