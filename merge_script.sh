if [ "$TRAVIS_BRANCH" != "staging" ]; then 
    exit 0;
fi

export GIT_COMMITTER_EMAIL=...
export GIT_COMMITTER_NAME=...

git checkout master 
git merge "$TRAVIS_COMMIT" 
git push 
