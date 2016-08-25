if [ "$TRAVIS_BRANCH" != "staging" ]; then 
    exit 0;
fi


git checkout develop 
git merge "$TRAVIS_COMMIT" 
git push --repo https://travis-symbiote:Travis1@github.com/symbiote-h2020/HelloWorld.git
