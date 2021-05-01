usage()
{
    echo "使用方法："
    echo "commit.sh"
    echo " or"
    echo "commit.sh 提交注释"
    exit 2
}

if [ $# -eq 1 ]; then
    comment=$1
else
    comment=`date +'%Y%m%d-%H%M%S'`
fi

git add .
git commit -m "$comment"
git push github
git push gitee
