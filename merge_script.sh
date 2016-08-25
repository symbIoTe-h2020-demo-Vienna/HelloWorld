if [ "$TRAVIS_BRANCH" != "staging" ]; then 
    exit 0;
fi

echo $TRAVIS_BRANCH
echo $TRAVIS_REPO_SLUG
git fetch https://travis-symbiote:Travis1@github.com/symbiote-h2020/HelloWorld.git develop
git branch
git checkout develop 
git merge "$TRAVIS_BRANCH" 
git push --repo https://travis-symbiote:Travis1@github.com/symbiote-h2020/HelloWorld.git
