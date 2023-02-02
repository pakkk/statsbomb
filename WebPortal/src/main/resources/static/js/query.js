import {URL_MATCH, URL_WEB_PORTAL, URL_COMPETITION} from './utils/constants.js'

const getAllCompetitions = async () => {
    const respone = await fetch(`${URL_COMPETITION}web`)
    return respone.json()
}

const getAllMatchesOfCompetition = async (competitionId, seasonId) => {
    const respone = await fetch(`${URL_MATCH}list_matches/?competitionId=${competitionId}&seasonId=${seasonId}`)
    return respone.json()
}

const getAllEndPoint = async () => {
    const respone = await fetch(`${URL_WEB_PORTAL}lista_endpoint`)
    return respone.json()
}

export { getAllEndPoint, getAllCompetitions, getAllMatchesOfCompetition }